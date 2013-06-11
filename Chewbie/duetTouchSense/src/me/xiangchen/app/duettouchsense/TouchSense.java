package me.xiangchen.app.duettouchsense;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import me.xiangchen.app.duettouchsense.util.SystemUiHider;
import me.xiangchen.ml.TouchSenseClassifier;
import me.xiangchen.ml.xacFeatureMaker;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class TouchSense extends Activity {
	
	final static String[] touchLabels = {"Pad", "Phalanx", "Knuckle"};
	int idxHandParts = 0;
	
	boolean isRecognition = true;
	
	LinearLayout layout;
	Button btnHandParts;
	TextView txtHandParts;
	
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
						txtHandParts.setAlpha(1.0f);
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
		btnHandParts.setBackgroundColor(Color.WHITE);
		btnHandParts.setText(touchLabels[idxHandParts]);
		btnHandParts.setTextColor(Color.BLACK);
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
		txtHandParts.setBackgroundColor(Color.BLACK);
		txtHandParts.setTextColor(Color.WHITE);
		txtHandParts.setText("Unknow");
		txtHandParts.layout(widthButton, 0, widthTxtView, heightTxtView);
		txtHandParts.setGravity(Gravity.CENTER);
		
		
		LinearLayout.LayoutParams paramsButton = new LinearLayout.LayoutParams(
//				RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
				widthButton, 
				heightButton);
//		paramsButton.addRule(RelativeLayout.LEFT_OF, 1);
		layout.addView(btnHandParts, paramsButton);
		
		LinearLayout.LayoutParams paramsText = new LinearLayout.LayoutParams(
//				RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT, widthButton, 0);
				widthTxtView, 
				heightTxtView);
//		paramsText.addRule(RelativeLayout.RIGHT_OF, 0);
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
							txtHandParts.setAlpha(txtHandParts.getAlpha() - 0.01f);
						}
					  }
					});
			  }
			}, new Date(),20);
	}
}
