package me.xiangchen.app.rotatesense;

import java.util.Calendar;

import me.xiangchen.ml.RotateSenseRegularClassifier;
import me.xiangchen.ml.RotateSenseSmartClassifier;
import me.xiangchen.ml.xacFeatureMaker;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Matrix;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class RotateSense extends Activity implements SensorEventListener {
	public final static int PHONEACCELFPS = 17;
	public final static int APPHEIGHT = 1920;
	public final static int APPWIDTH = 1080;

	public final static int REGULARROTATE = 0;
	public final static int SMARTROTATE = 1;
	public final static int TRAINREGULAR = 2;
	public final static int TRAINSMART = 3;

	public final static int VERTICAL = 0;
	public final static int LEFTHORIZONTAL = 1;
	public final static int RIGHTHORIZONTAL = 2;
	public final static String[] classLabels = { "Vertical", "LeftHorizontal",
			"RightHorizontal" };

	public final static int ROTATETIME = 500; // ms
	public final static int ROTATESENSEFPS = 10;

	long lastSensingTime;

	SensorManager sensorManager;
	Sensor sensorAccel;

	int mode = REGULARROTATE;
	int orientation = VERTICAL;

	RelativeLayout layout;
	ImageView imageView;

	boolean isSensingOn = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		xacFeatureMaker.createFeatureTable();
		xacFeatureMaker.setLabel(orientation);

		layout = new RelativeLayout(this);
		layout.setBackgroundColor(Color.BLACK);
		imageView = new ImageView(this);
		imageView.setImageResource(R.drawable.doraemon);
		RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
				RelativeLayout.LayoutParams.WRAP_CONTENT,
				RelativeLayout.LayoutParams.WRAP_CONTENT);
		layout.addView(imageView, params);

		layout.setOnTouchListener(new View.OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				if (mode == TRAINSMART || mode == TRAINREGULAR) {
					// int numRowsToSend = ROTATETIME * PHONEACCELFPS / 1000;
					// boolean withWatch = (mode == TRAINSMART);
					// xacFeatureMaker.sendOffData(numRowsToSend, classLabels,
					// withWatch);
					isSensingOn = !isSensingOn;
					String toastText = "Sensing "
							+ (isSensingOn ? "on" : "off");
					Toast.makeText(v.getContext(), toastText,
							Toast.LENGTH_SHORT).show();
				}
				return false;
			}
		});

		// Remove title bar
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		// Remove notification bar
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
		sensorAccel = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
		sensorManager.registerListener(this, sensorAccel,
				SensorManager.SENSOR_DELAY_UI);

		setContentView(layout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.rotate_sense, menu);
		return true;
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		switch (keyCode) {
		case KeyEvent.KEYCODE_VOLUME_UP:
			toggleOrientation();
			break;
		case KeyEvent.KEYCODE_VOLUME_DOWN:
			toggleMode();
			break;
		}

		return true;
	}

	private void toggleOrientation() {
		switch (orientation) {
		case VERTICAL:
			orientation = LEFTHORIZONTAL;
			Toast.makeText(this, "Left horizontal", Toast.LENGTH_SHORT).show();
			break;
		case LEFTHORIZONTAL:
			orientation = RIGHTHORIZONTAL;
			Toast.makeText(this, "Right horizontal", Toast.LENGTH_SHORT).show();
			break;
		case RIGHTHORIZONTAL:
			orientation = VERTICAL;
			Toast.makeText(this, "Vertical horizontal", Toast.LENGTH_SHORT)
					.show();
			break;
		}
		xacFeatureMaker.setLabel(orientation);
	}

	private void toggleMode() {
		switch (mode) {
		case REGULARROTATE:
			mode = SMARTROTATE;
			Toast.makeText(this, "Smart rotate", Toast.LENGTH_SHORT).show();
			break;
		case SMARTROTATE:
			mode = TRAINREGULAR;
			Toast.makeText(this, "Train regular", Toast.LENGTH_SHORT).show();
			break;
		case TRAINREGULAR:
			mode = TRAINSMART;
			Toast.makeText(this, "Train smart", Toast.LENGTH_SHORT).show();
			break;
		case TRAINSMART:
			mode = REGULARROTATE;
			Toast.makeText(this, "Regular rotate", Toast.LENGTH_SHORT).show();
			break;
		}
	}

	@Override
	public void onAccuracyChanged(Sensor arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		xacFeatureMaker.updatePhoneAccel(event.values);
		xacFeatureMaker.addPhoneFeatureEntry();

		Calendar lCDateTime = Calendar.getInstance();
		long curTime = lCDateTime.getTimeInMillis();

		if (curTime - lastSensingTime >= 1000 / ROTATESENSEFPS) {
			lastSensingTime = curTime;
			int numRowsToSend = ROTATETIME * PHONEACCELFPS / 1000;
			switch (mode) {
			case REGULARROTATE:
//				int orientation = doClassification(numRowsToSend, false);
				rotate(imageView, doClassification(numRowsToSend, false));

				break;
			case SMARTROTATE:
//				int orientation = doClassification(numRowsToSend, false);
				rotate(imageView, doClassification(numRowsToSend, true));
				break;
			case TRAINREGULAR:
				if (isSensingOn)
					xacFeatureMaker.sendOffData(numRowsToSend, classLabels,
							false);
				break;
			case TRAINSMART:
				if (isSensingOn)
					xacFeatureMaker.sendOffData(numRowsToSend, classLabels,
							true);
				break;
			}
		}
	}

	private void rotate(ImageView iv, int orientation) {
		float angle = 0;
		float scaleX = 1.0f;
		float scaleY = 1.0f;
		Matrix matrix = new Matrix();
//		int width = iv.getWidth();
//		int height = iv.getHeight();
		int width = 0;
		int height = 0;
		
		switch (orientation) {
		case VERTICAL:
			angle = 0;
			scaleX = 1.0f;
			scaleY = 1.0f;
			
//			width = APPWIDTH;
//			height = APPHEIGHT;
//			iv.layout((APPWIDTH - width) / 2, (APPHEIGHT - height) / 2, width, height);
//			iv.setScaleType(ScaleType.FIT_XY);
//			matrix.postRotate(0, width / 2, height / 2);
//			iv.setRotation(0);
			break;
		case LEFTHORIZONTAL:
			angle = 90;
			scaleX = APPWIDTH * 1.0f / APPHEIGHT;
			scaleY = APPWIDTH * 1.0f / APPHEIGHT;
			
//			height = APPWIDTH;
//			width = height * APPWIDTH / APPHEIGHT;
			
//			iv.setScaleType(ScaleType.MATRIX);
//			iv.setRotation(270);
//			iv.setFitsSystemWindows(true);
//			matrix.postRotate(90, width / 2, height / 2);
//			float scale = 0.3f;
//			matrix.postScale(scale, scale);
			break;
		case RIGHTHORIZONTAL:
			angle = 270;
			scaleX = APPWIDTH * 1.0f / APPHEIGHT;
			scaleY = APPWIDTH * 1.0f / APPHEIGHT;
//			iv.setScaleType(ScaleType.MATRIX);
//			matrix.postRotate(90, width / 2, height / 2);
			break;
		}

//		iv.setImageMatrix(matrix);
		iv.setRotation(angle);
		iv.setScaleX(scaleX);
		iv.setScaleY(scaleY);
//		iv.setScaleType(ScaleType.FIT_CENTER);
//		iv.layout((APPWIDTH - height) / 2, (APPHEIGHT - width) / 2, height, width);
		iv.invalidate();
	}

	private int doClassification(int n, boolean withWatch) {
		int idxClass = 0;
		Object[] features = xacFeatureMaker.getFlattenedData(n, withWatch);
		if (features != null) {
			try {
				idxClass = withWatch ? (int)RotateSenseSmartClassifier.classify(features) 
						: (int) RotateSenseRegularClassifier
						.classify(features);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return idxClass;
	}

}
