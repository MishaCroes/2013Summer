package me.xiangchen.tutorial.hellowatch;

import java.util.Calendar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.Log;
import android.view.Gravity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.sonyericsson.extras.liveware.aef.control.Control;
import com.sonyericsson.extras.liveware.aef.registration.Registration;
import com.sonyericsson.extras.liveware.aef.sensor.Sensor;
import com.sonyericsson.extras.liveware.extension.util.R;
import com.sonyericsson.extras.liveware.extension.util.control.ControlExtension;
import com.sonyericsson.extras.liveware.extension.util.control.ControlTouchEvent;
import com.sonyericsson.extras.liveware.extension.util.sensor.AccessorySensor;
import com.sonyericsson.extras.liveware.extension.util.sensor.AccessorySensorEvent;
import com.sonyericsson.extras.liveware.extension.util.sensor.AccessorySensorEventListener;
import com.sonyericsson.extras.liveware.extension.util.sensor.AccessorySensorException;
import com.sonyericsson.extras.liveware.extension.util.sensor.AccessorySensorManager;

public class HelloWatchExtension extends ControlExtension{
	
	public final String LOGTAG = "HelloWatch";

	int width;
	int height;
	
	RelativeLayout layout;
	Canvas canvas;
	Bitmap bitmap;
	TextView textView;
	
	AccessorySensor sensor = null;
	AccessorySensorEventListener listener;
	
	long tsLastSecond = 0;
	int fps = 0;
	
	public HelloWatchExtension(Context context, String hostAppPackageName) {
		super(context, hostAppPackageName);
		
		width = getSupportedControlWidth(context);
		height = getSupportedControlHeight(context);
		
		layout = new RelativeLayout(context);
		textView = new TextView(context);
		textView.setText("Hellooo watch!");
		textView.setTextSize(9);
		textView.setGravity(Gravity.CENTER);
		textView.setTextColor(Color.WHITE);
		textView.layout(0, 0, width, height);
		layout.addView(textView);
		layout.setBackgroundColor(0xFF000000);
		
		AccessorySensorManager manager = new AccessorySensorManager(context,
				hostAppPackageName);
		sensor = manager.getSensor(Registration.SensorTypeValue.ACCELEROMETER);

		listener = new AccessorySensorEventListener() {

			public void onSensorEvent(AccessorySensorEvent sensorEvent) {
				float[] values = sensorEvent.getSensorValues();

//				Log.d(LOGTAG, values[0], )
				
				long tsNow = Calendar.getInstance().getTimeInMillis();
				if(tsNow - tsLastSecond >= 1000) {
//					Log.d(LOGTAG, "FPS: " + fps);
					textView.setText("FPS: " + fps);
					updateVisual();
					fps = 0;
					tsLastSecond = tsNow;
				}
				
				if(tsLastSecond == 0) {
					tsLastSecond = tsNow;
				}
				
				fps++;
			}
		};
	}
	
	@Override
	public void onResume() {
		setScreenState(Control.Intents.SCREEN_STATE_ON);
		updateVisual();
		
		// Start listening for sensor updates.
		if (sensor != null) {
			try {
//				sensor.registerFixedRateListener(listener,
//						Sensor.SensorRates.SENSOR_DELAY_FASTEST);
				sensor.registerListener(listener,
                        Sensor.SensorRates.SENSOR_DELAY_FASTEST,
                        Sensor.SensorInterruptMode.SENSOR_INTERRUPT_ENABLED);
			} catch (AccessorySensorException e) {
					Log.d(LOGTAG, "Failed to register listener");
//						LauncherManager.doAndriodToast("Failed to register listener");
			}
		}
	}
	
	@Override
	public void onTouch(final ControlTouchEvent event) {
		Log.d(LOGTAG, event.getX() + ", " + event.getY());
	}
	
	@Override
	public void onSwipe(int direction) {
		Log.d(LOGTAG, direction + "");
	}
	
	private void updateVisual() {

		bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
		canvas = new Canvas(bitmap);
		layout.draw(canvas);

		showBitmap(bitmap);
	}

	public static int getSupportedControlWidth(Context context) {
		return context.getResources().getDimensionPixelSize(
				R.dimen.smart_watch_control_width);
	}

	public static int getSupportedControlHeight(Context context) {
		return context.getResources().getDimensionPixelSize(
				R.dimen.smart_watch_control_height);
	}
}
