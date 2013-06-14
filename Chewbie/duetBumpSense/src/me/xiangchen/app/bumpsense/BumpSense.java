package me.xiangchen.app.bumpsense;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import me.xiangchen.ml.BumpSenseClassifier;
import me.xiangchen.ml.xacFeatureMaker;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.MotionEvent.PointerCoords;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

@SuppressLint("NewApi")
public class BumpSense extends Activity implements SensorEventListener {

	enum AppMode {
		TRAINBUMPTRIGGER,
		TRAINBUMPDIRECTION,
		RECOGNITION
	}
	final static String[] bumpTriggerlabels = { "Bump", "NoBump"};
	final static String[] bumpDirectionlabelDirections = { "North", "West", "South", "East"};
	final String LOGTAG = "BumpSense";
	final int MAXTOUCHPOINTS = 1;
	
	RelativeLayout layout;
	BumpView bumpView;

	int label = BumpManager.UNKNOWN;

	boolean isRecognition = true;

	SensorManager sensorManager;
	Sensor sensorAccel;
	double lastSum = 0;
	double sumAccel = 0;
	double counter = 0;

	AppMode appMode;
	
	Timer timer;
	int red = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		BumpManager.setBumpSense(this);
		xacFeatureMaker.createFeatureTable();

		appMode = AppMode.RECOGNITION;
		
		sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
		sensorAccel = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
		sensorManager.registerListener(this, sensorAccel,
				SensorManager.SENSOR_DELAY_FASTEST);
		
		Point size = new Point();
		getWindowManager().getDefaultDisplay().getSize(size);

		layout = new RelativeLayout(this);
		bumpView = new BumpView(this);
		bumpView.layout(0, 0, size.x, size.y);
		bumpView.initVisual();
		bumpView.setOnTouchListener(new View.OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {

				switch (appMode) {
				case TRAINBUMPTRIGGER:
//					red = 255;
//					BumpManager.syncDevices();
					label = label == BumpManager.BUMP ? BumpManager.NOBUMP : BumpManager.BUMP;
					red = label == BumpManager.BUMP ? 255 : 0;
					bumpView.setBackgroundColor(Color.argb(255, red, 0, 0));
					BumpManager.syncDevices();
					
					break;
				case TRAINBUMPDIRECTION:
					int numTouches = event.getPointerCount();
					if (numTouches > MAXTOUCHPOINTS) {
						return false;
					}
					PointerCoords outPointerCoords = new PointerCoords();
					event.getPointerCoords(0, outPointerCoords);
					label = bumpView.getTouchedArea(outPointerCoords);
					xacFeatureMaker.setLabel(label);
					bumpView.updateVisual(label);
					BumpManager.syncDevices();
					break;
				case RECOGNITION:
					label = BumpManager.NOBUMP;
					break;
				}
				
				
				return false;
			}
		});
		RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
				RelativeLayout.LayoutParams.MATCH_PARENT,
				RelativeLayout.LayoutParams.MATCH_PARENT);
		layout.addView(bumpView, params);

		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				// Your database code here
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						// Your database code here
						if (appMode == AppMode.RECOGNITION) {
							red *= 0.9f;
//							if(red <= 0) {
//								label = BumpManager.NOBUMP;
//							}
							bumpView.setBackgroundColor(Color.argb(255, red, 0,
									0));
							bumpView.invalidate();
							BumpManager.syncDevices();
						}
					}
				});
			}
		}, new Date(), 50);
		
		setAutoOrientationEnabled(getContentResolver(), false);
		setContentView(layout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bump_sense, menu);
		return true;
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

	private void toggleMode() {
		appMode = appMode == AppMode.RECOGNITION ? AppMode.TRAINBUMPTRIGGER :
				appMode == AppMode.TRAINBUMPTRIGGER ? AppMode.TRAINBUMPDIRECTION :
					AppMode.RECOGNITION;
		
		switch (appMode) {
		case TRAINBUMPTRIGGER:
			Toast.makeText(this, "Training trigger mode", Toast.LENGTH_SHORT).show();
			label = BumpManager.NOBUMP;
			xacFeatureMaker.clearData();
			xacFeatureMaker.setLabel(label);
			break;
		case TRAINBUMPDIRECTION:
			Toast.makeText(this, "Training direction mode", Toast.LENGTH_SHORT).show();
			label = BumpManager.UNKNOWN;
			xacFeatureMaker.clearData();
			xacFeatureMaker.setLabel(label);
			break;
		case RECOGNITION:
			Toast.makeText(this, "Recognition mode", Toast.LENGTH_SHORT).show();
			label = BumpManager.UNKNOWN;
			break;
		}	
		
		bumpView.setBackgroundColor(Color.BLACK);
		bumpView.updateVisual(BumpManager.INIT);
		BumpManager.syncDevices();
	}

	public static void setAutoOrientationEnabled(ContentResolver resolver,
			boolean enabled) {
		Settings.System.putInt(resolver,
				Settings.System.ACCELEROMETER_ROTATION, enabled ? 1 : 0);
	}

	@Override
	public void onAccuracyChanged(Sensor ssr, int val) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		// TODO Auto-generated method stub
		xacFeatureMaker.updatePhoneAccel(event.values);
		xacFeatureMaker.addFeatureEntry();
		
//		BumpManager.updatePhoneAccel(event.values);
		
		float x = event.values[0];
		float y = event.values[1];
		float z = event.values[2];
		
		double sum = Math.sqrt(x*x + y*y + z*z);
		
		
		
		if(counter > 0) {
			double runningAvrg = sumAccel / counter;
//			Log.d(LOGTAG, sum + " : " + runningAvrg);
			float thrsOnset = 0.20f;
			if((lastSum - runningAvrg) / runningAvrg > thrsOnset
					&& (sum - runningAvrg) / runningAvrg < thrsOnset) {
				
				switch (appMode) {
				case TRAINBUMPTRIGGER:
					xacFeatureMaker.setLabel(label);
					xacFeatureMaker.sendOffData(5, bumpTriggerlabels);
					break;
				case TRAINBUMPDIRECTION:
					
					break;
				case RECOGNITION:
					Object[] features = xacFeatureMaker.getFlattenedData(5);
					if (features != null) {
						try {
							int idxClass = (int) BumpSenseClassifier.classify(features);
							red = idxClass * 255;
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					break;
				}	
			}
		}
		
//		if(appMode == AppMode.RECOGNITION) {
//			red *= 0.9f;
//			bumpView.setBackgroundColor(Color.argb(255, red, 0,
//					0));
//			bumpView.invalidate();
//			BumpManager.syncDevices();
//		}
		
		sumAccel *= 0.999;
		counter *= 0.999;
		
		sumAccel += sum;
		counter++;
		
		lastSum = sum;
	}
}
