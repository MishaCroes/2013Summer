package me.xiangchen.app.backsense;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import me.xiangchen.ml.xacFeatureMaker;
import me.xiangchen.ui.xacMap;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.gms.maps.SupportMapFragment;

public class BackSense extends FragmentActivity implements SensorEventListener {

	public final static int PHONEACCELFPS = 17;
	public final static float WATCHPANUNIT = 0.0001f;
	RelativeLayout layout;
	xacMap map;

	SensorManager sensorManager;
	Sensor sensorAccel;

	Timer timer;
	
	int panDir = -1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		BackManager.setPhone(this);

		// Remove title bar
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		// Remove notification bar
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.activity_back_sense);

		map = new xacMap(((SupportMapFragment) getSupportFragmentManager()
				.findFragmentById(R.id.map)).getMap());

		xacFeatureMaker.createFeatureTable();

		sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
		sensorAccel = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
		sensorManager.registerListener(this, sensorAccel,
				SensorManager.SENSOR_DELAY_UI);

		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				// Your database code here
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						float dx = 0;
						float dy = 0;
						
						switch(panDir) {
						case BackSenseExtension.LEFT:
							dx = -WATCHPANUNIT;
							break;
						case BackSenseExtension.RIGHT:
							dx = WATCHPANUNIT;
							break;
						case BackSenseExtension.UP:
							dy = WATCHPANUNIT;
							break;
						case BackSenseExtension.DOWN:
							dy = -WATCHPANUNIT;
							break;
						}
						
						if(dx + dy != 0) {
							map.doPan(dx, dy);
						}
					}
				});
			}
		}, new Date(), 10);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.back_sense, menu);
		return true;
	}

	@Override
	public void onAccuracyChanged(Sensor arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		xacFeatureMaker.updatePhoneAccel(event.values);
		xacFeatureMaker.addPhoneFeatureEntry();

	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		switch (keyCode) {
		case KeyEvent.KEYCODE_VOLUME_DOWN:
			toggleMode();
			break;
		case KeyEvent.KEYCODE_VOLUME_UP:
			BackManager.toggleLabel();
			break;
		}

		return true;
	}

	private void toggleMode() {
		BackManager.toggleTrainingRecognition();
		Toast.makeText(
				this,
				BackManager.isRecognition() ? "Recognition mode"
						: "Training mode", Toast.LENGTH_SHORT).show();

	}
	
	public void pan(int dir) {
//		float dx = 0;
//		float dy = 0;
//		
//		switch(dir) {
//		case BackSenseExtension.LEFT:
//			dx = -WATCHPANUNIT;
//			break;
//		case BackSenseExtension.RIGHT:
//			dx = WATCHPANUNIT;
//			break;
//		case BackSenseExtension.UP:
//			dy = WATCHPANUNIT;
//			break;
//		case BackSenseExtension.DOWN:
//			dy = -WATCHPANUNIT;
//			break;
//		}
//		
//		map.doPan(dx, dy);
		
		panDir = dir;
	}

}
