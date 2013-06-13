package me.xiangchen.app.duettouchsense;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import me.xiangchen.ml.TouchSenseClassifier;
import me.xiangchen.ml.xacFeatureMaker;
import android.app.Activity;
import android.content.ContentResolver;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class TouchSense extends Activity {
	
	final static String[] touchLabels = {"Pad", "Phalanx", "Knuckle"};
	int idxHandParts = 0;
	
	boolean isRecognition = true;
	
	LinearLayout layout;
	Button btnHandParts;
	TextView txtHandParts;
	int alphaText = 255;
	
	Timer timer;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		xacFeatureMaker.setLabel(idxHandParts);
		
		layout = new LinearLayout(this);
		layout.setBackgroundColor(Color.BLACK);
		layout.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View arg0, MotionEvent arg1) {
				// TODO Auto-generated method stub
				
				// training phase
				if (!isRecognition) {
					xacFeatureMaker.sendOffData(10, touchLabels);
					xacFeatureMaker.clearData();
				} else {

					// recognition phase
					Object[] features = xacFeatureMaker.getFlattenedData(10);
					if (features != null) {
						alphaText = 255;
						try {
							int idxClass = (int) TouchSenseClassifier
									.classify(features);
							if (idxClass >= 0) {
								txtHandParts.setText(touchLabels[idxClass]);
							} else {
								txtHandParts.setText("Unknown");
							}
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} else {
						txtHandParts.setText("Wait...");
					}
				}
				
				return false;
			}
		});
		
		int widthButton = 500;
		int heightButton = 360;
		btnHandParts = new Button(this);
		btnHandParts.setId(0);
		btnHandParts.layout(0, 0, widthButton, heightButton);
		
		btnHandParts.setBackgroundColor(Color.BLACK);
		btnHandParts.setTextColor(Color.GRAY);
		
		btnHandParts.setText(touchLabels[idxHandParts]);
		
		btnHandParts.setTextSize(36);
		btnHandParts.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				idxHandParts = (idxHandParts + 1) % touchLabels.length;
				xacFeatureMaker.setLabel(idxHandParts);
				btnHandParts.setText(touchLabels[idxHandParts]);
				
			}
		});
		
		int widthTxtView = 500;
		int heightTxtView = 360;
		txtHandParts = new TextView(this);
		txtHandParts.setId(1);
		txtHandParts.setTextSize(36);
		txtHandParts.setBackgroundColor(Color.WHITE);
		txtHandParts.setTextColor(Color.BLACK);
		txtHandParts.setText("Unknow");
		txtHandParts.layout(widthButton, 0, widthTxtView, heightTxtView);
		txtHandParts.setGravity(Gravity.CENTER);
		
		
		LinearLayout.LayoutParams paramsButton = new LinearLayout.LayoutParams(
				widthButton, 
				heightButton);
		layout.addView(btnHandParts, paramsButton);
		
		LinearLayout.LayoutParams paramsText = new LinearLayout.LayoutParams(
				widthTxtView, 
				heightTxtView);
		layout.addView(txtHandParts, paramsText);
		
		setContentView(layout);
		
		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			  @Override
			  public void run() {
			    // Your database code here
				  runOnUiThread( new Runnable()  {
					  @Override
					  public void run() {
					    // Your database code here
						if(isRecognition) {
							alphaText *= 0.95f;
							txtHandParts.setTextColor(Color.argb(alphaText, 0, 0, 0));
						}
					  }
					});
			  }
			}, new Date(),20);
		
		setAutoOrientationEnabled(getContentResolver(), false);
	}
	
	private void toggleMode() {
		isRecognition = !isRecognition;

		alphaText = 255;
		
		if(isRecognition) {
			Toast.makeText(this, "Recognition mode", Toast.LENGTH_SHORT).show();
			btnHandParts.setBackgroundColor(Color.BLACK);
			btnHandParts.setTextColor(Color.BLACK);
			txtHandParts.setText("Unknown");
			txtHandParts.setBackgroundColor(Color.WHITE);
			txtHandParts.setTextColor(Color.BLACK);
		}
		else {
			Toast.makeText(this, "Training mode", Toast.LENGTH_SHORT).show();
			txtHandParts.setBackgroundColor(Color.BLACK);
			txtHandParts.setTextColor(Color.BLACK);
			btnHandParts.setBackgroundColor(Color.WHITE);
			btnHandParts.setTextColor(Color.BLACK);
		}
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		switch (keyCode) {
		case KeyEvent.KEYCODE_VOLUME_DOWN:
			toggleMode();
			break;
		}
		
		return true;
	}
	
	public static void setAutoOrientationEnabled(ContentResolver resolver, boolean enabled)
	{
	  Settings.System.putInt(resolver, Settings.System.ACCELEROMETER_ROTATION, enabled ? 1 : 0);
	}
}
