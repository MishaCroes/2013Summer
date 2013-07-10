package me.xiangchen.app.duetos;

import me.xiangchen.app.duetapp.AppExtension;
import me.xiangchen.technique.doubleflip.xacAuthenticSenseFeatureMaker;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.sonyericsson.extras.liveware.aef.control.Control;
import com.sonyericsson.extras.liveware.aef.sensor.Sensor;
import com.sonyericsson.extras.liveware.extension.util.R;
import com.sonyericsson.extras.liveware.extension.util.control.ControlExtension;
import com.sonyericsson.extras.liveware.extension.util.control.ControlTouchEvent;
import com.sonyericsson.extras.liveware.extension.util.sensor.AccessorySensor;
import com.sonyericsson.extras.liveware.extension.util.sensor.AccessorySensorEvent;
import com.sonyericsson.extras.liveware.extension.util.sensor.AccessorySensorEventListener;
import com.sonyericsson.extras.liveware.extension.util.sensor.AccessorySensorException;
import com.sonyericsson.extras.liveware.extension.util.sensor.AccessorySensorManager;

public class LauncherExtension extends ControlExtension {

	public final static int WATCHACCELFPS = 10;
	public final static String LOGTAG = "DuetOS";

	int width;
	int height;

	AccessorySensor sensor = null;
	AccessorySensorEventListener listener;

	Context context;

	RelativeLayout layout;
	Canvas canvas;
	Bitmap bitmap;
	TextView textView;

	AppExtension appExt;

	boolean isSensorWorking = false;

	public LauncherExtension(Context context, String hostAppPackageName) {
		super(context, hostAppPackageName);
		LauncherManager.setWatch(this);

		width = getSupportedControlWidth(context);
		height = getSupportedControlHeight(context);

		layout = new RelativeLayout(context);
		textView = new TextView(context);
		textView.setText("DuetOS");
		textView.setTextSize(10);
		textView.setTextColor(Color.WHITE);
		textView.layout(0, 0, width, height);
		layout.addView(textView);

		AccessorySensorManager manager = new AccessorySensorManager(context,
				hostAppPackageName);
		sensor = manager.getSensor(Sensor.SENSOR_TYPE_ACCELEROMETER);

		listener = new AccessorySensorEventListener() {

			public void onSensorEvent(AccessorySensorEvent sensorEvent) {
				float[] values = sensorEvent.getSensorValues();

				if (appExt == null) {
					appExt = LauncherManager.getAppExtension();
				}

				xacAuthenticSenseFeatureMaker.updateWatchAccel(values);
				xacAuthenticSenseFeatureMaker.addWatchFeatureEntry();
				if (appExt != null) {
					appExt.doAccelerometer(values);
				}
			}
		};
	}

	@Override
	public void onResume() {
		setScreenState(Control.Intents.SCREEN_STATE_ON);

		// Start listening for sensor updates.
		if (sensor != null) {
			try {
				sensor.registerFixedRateListener(listener,
						Sensor.SensorRates.SENSOR_DELAY_FASTEST);
			} catch (AccessorySensorException e) {
				Log.d(LOGTAG, "Failed to register listener");
			}
		}

		if (appExt == null) {
			appExt = LauncherManager.getAppExtension();
		}

		if (appExt != null) {
			appExt.doResume();
		} else {
			updateVisual();
		}
	}

	public void showText(String text) {
		textView.setText(text);
		updateVisual();
	}

	public void updateVisual() {
		bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
		canvas = new Canvas(bitmap);
		layout.draw(canvas);

		showBitmap(bitmap);
	}

	public void updateVisual(Bitmap bitmap) {
		if (bitmap != null) {
			showBitmap(bitmap);
		} else {
			updateVisual();
		}
	}

	@Override
	public void onPause() {
		// Stop sensor
		if (sensor != null) {
			sensor.unregisterListener();
		}
	}

	@Override
	public void onDestroy() {
		// Stop sensor
		if (sensor != null) {
			sensor.unregisterListener();
			sensor = null;
		}
	}

	@Override
	public void onTouch(final ControlTouchEvent event) {
		if (appExt == null) {
			appExt = LauncherManager.getAppExtension();
		}

		if (appExt != null) {
			appExt.doTouch(event);
		}
	}

	@Override
	public void onSwipe(int direction) {
		if (appExt == null) {
			appExt = LauncherManager.getAppExtension();
		}

		if (appExt != null) {
			appExt.doSwipe(direction);
		}
	}

	public void setAppExtension(AppExtension ae) {
		appExt = ae;
	}

	public static int getSupportedControlWidth(Context context) {
		return context.getResources().getDimensionPixelSize(
				R.dimen.smart_watch_control_width);
	}

	public static int getSupportedControlHeight(Context context) {
		return context.getResources().getDimensionPixelSize(
				R.dimen.smart_watch_control_height);
	}
	
	public void buzz(int duration) {
		startVibrator(duration, 0, 1);
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
}
