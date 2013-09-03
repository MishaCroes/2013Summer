package me.xiangchen.app.authenticsense;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import me.xiangchen.ml.PhoneAuthenticClassifier;
import me.xiangchen.ml.xacFeatureMaker;
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

public class AuthenticSenseExtension extends ControlExtension {

	public final static int WATCHACCELFPS = 10;
	final public static String LOGTAG = "AuthenticSense";
	
	int width;
	int height;

	AccessorySensor sensor = null;
	AccessorySensorEventListener listener;

	RelativeLayout layout;
	Canvas canvas;
	Bitmap bitmap;
	TextView textView;

	long timeAuthen = 0;

	boolean isLocked = true;

	int red = 0;
	int green = 0;

	Timer timer;

	public AuthenticSenseExtension(Context context, String hostAppPackageName) {
		super(context, hostAppPackageName);

		width = getSupportedControlWidth(context);
		height = getSupportedControlHeight(context);

		layout = new RelativeLayout(context);
		textView = new TextView(context);
		textView.setText("Authentic\nSense");
		textView.setTextSize(9);
		textView.setTextColor(Color.WHITE);
		textView.layout(0, 0, width, height);
		layout.addView(textView);

		AccessorySensorManager manager = new AccessorySensorManager(context,
				hostAppPackageName);
		sensor = manager.getSensor(Sensor.SENSOR_TYPE_ACCELEROMETER);

		listener = new AccessorySensorEventListener() {

			public void onSensorEvent(AccessorySensorEvent sensorEvent) {
				float[] values = sensorEvent.getSensorValues();
				xacFeatureMaker.updateWatchAccel(values);
				xacFeatureMaker.addWatchFeatureEntry();

			}
		};

	}

	@Override
	public void onResume() {
		setScreenState(Control.Intents.SCREEN_STATE_ON);

		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				red *= 0.9;
				green *= 0.9;
				updateVisual();

			}
		}, new Date(), 50);

		// Start listening for sensor updates.
		if (sensor != null) {
			try {
				sensor.registerFixedRateListener(listener,
						Sensor.SensorRates.SENSOR_DELAY_FASTEST);
			} catch (AccessorySensorException e) {
				Log.d(LOGTAG, "Failed to register listener");
			}
		}

		// updateVisual();
	}

	private void updateVisual() {

		textView.setBackgroundColor(Color.argb(255, red, green, 0));
		if (AuthenticManager.getMode() == AuthenticManager.AuthenMode.USINGPHONE
				&& AuthenticManager.isRecognition()) {
			textView.setText(isLocked ? "Locked!"
					: "5 missed calls from Tiffany");
		} else {
			textView.setText("Authentic\nSense");
		}

		bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
		canvas = new Canvas(bitmap);
		layout.draw(canvas);

		showBitmap(bitmap);
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
		
		if(AuthenticManager.getMode() != AuthenticManager.AuthenMode.USINGPHONE) {
			return;
		}
		
		int action = event.getAction();
		switch (action) {
		case Control.Intents.TOUCH_ACTION_PRESS:

			if (AuthenticManager.getMode() == AuthenticManager.AuthenMode.USINGPHONE) {
				Calendar lCDateTime = Calendar.getInstance();
				long curTime = lCDateTime.getTimeInMillis();

				if (curTime - timeAuthen > AuthenticManager.AUTHENTICACTIONTIMEOUT) {

					timeAuthen = curTime;
					if (AuthenticManager.isRecognition()) {
						int label = doClassification(AuthenticManager.NUMROWPHONEAUTHEN);
						if (label != AuthenticManager.INTHEWILD) {
							isLocked = !isLocked;
						}
					} else {
						xacFeatureMaker.sendOffData(
								AuthenticManager.NUMROWPHONEAUTHEN,
								AuthenticManager.classLabels);
						xacFeatureMaker.clearData();
					}
				}
			}

			red = isLocked ? 255 : 0;
			green = 255 - red;
			break;
		}

		// updateVisual();
	}

	private int doClassification(int n) {
		int idxClass = -1;
		Object[] features = xacFeatureMaker.getFlattenedData(n);
		if (features != null) {
			try {
				idxClass = (int) PhoneAuthenticClassifier.classify(features);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

//		switch (idxClass) {
//		case 0:
//			return AuthenticManager.HANDAUTHENTICATED;
//		case 1:
//			return AuthenticManager.INTHEWILD;
//		case 2:
//			return AuthenticManager.WATCHAUTHENTICATED;
//		}

		return idxClass;
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
