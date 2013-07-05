package me.xiangchen.app.backsense;

import me.xiangchen.ml.BackSenseClassifier;
import me.xiangchen.ml.xacFeatureMaker;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.sonyericsson.extras.liveware.aef.control.Control;
import com.sonyericsson.extras.liveware.extension.util.R;
import com.sonyericsson.extras.liveware.extension.util.control.ControlExtension;
import com.sonyericsson.extras.liveware.extension.util.control.ControlTouchEvent;
import com.sonyericsson.extras.liveware.extension.util.sensor.AccessorySensor;
import com.sonyericsson.extras.liveware.extension.util.sensor.AccessorySensorEventListener;

public class BackSenseExtension extends ControlExtension {

	public final static int WATCHACCELFPS = 10;
	public final static String LOGTAG = "BackSense";
	
	public final static int NONE = -1;
	
	public final static int LEFT = 0;
	public final static int DOWN = 1;
	public final static int RIGHT = 2;
	public final static int UP = 3;
	public final static int NUMDIRECTIONS = 4;
	public final static String[] classLabels = {"Left", "Down", "Right", "Up"};
	
	public final static int ZOOMIN = 0;
	public final static int ZOOMOUT = -1;
	
	int label = -1;
	
	int width;
	int height;

	AccessorySensor sensor = null;
	AccessorySensorEventListener listener;

	RelativeLayout layout;
	Canvas canvas;
	Bitmap bitmap;
	TextView textView;

	boolean isInTouch = false;
	int xTouch;
	int yTouch;

	public BackSenseExtension(Context context, String hostAppPackageName) {
		super(context, hostAppPackageName);

		BackManager.setWatch(this);
		
		width = getSupportedControlWidth(context);
		height = getSupportedControlHeight(context);

		layout = new RelativeLayout(context);
		textView = new TextView(context);
		textView.setText("Back\nSense");
		textView.setTextSize(10);
		textView.setTextColor(Color.WHITE);
		textView.layout(0, 0, width, height);
		layout.addView(textView);
	}

	@Override
	public void onResume() {

		setScreenState(Control.Intents.SCREEN_STATE_ON);

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
		int action = event.getAction();

		switch (action) {
		case Control.Intents.TOUCH_ACTION_PRESS:
			xTouch = event.getX();
			yTouch = event.getY();
//			isInTouch = true;
			xacFeatureMaker.updateWatchTouch(xTouch, yTouch);
			if(BackManager.isRecognition()) {
				int dir = doClassification();
				BackManager.pan(dir);
			} else {
				if(xacFeatureMaker.sendOffData(classLabels)) {
//					xacFeatureMaker.clearData();
				}
			}
			break;
		case Control.Intents.TOUCH_ACTION_RELEASE:
			BackManager.pan(NONE);
			isInTouch = false;
			break;
		}
	}
	
	@Override
	public void onSwipe(int direction) {
		switch (direction) {
		case Control.Intents.SWIPE_DIRECTION_UP:
			BackManager.zoom(ZOOMIN);
			Log.d(LOGTAG, "swipe up");
			break;
		case Control.Intents.SWIPE_DIRECTION_DOWN:
			Log.d(LOGTAG, "swipe down");
			BackManager.zoom(ZOOMOUT);
			break;
		case Control.Intents.SWIPE_DIRECTION_LEFT:
			BackManager.zoom(ZOOMIN);
			Log.d(LOGTAG, "swipe left");
			break;
		case Control.Intents.SWIPE_DIRECTION_RIGHT:
			BackManager.zoom(ZOOMOUT);
			Log.d(LOGTAG, "swipe right");
			break;
		}

	}

	public void toggleLabel() {
		label = (label + 1) % NUMDIRECTIONS;
		xacFeatureMaker.setLabel(label);
	}
	
	public static int getSupportedControlWidth(Context context) {
		return context.getResources().getDimensionPixelSize(
				R.dimen.smart_watch_control_width);
	}

	public static int getSupportedControlHeight(Context context) {
		return context.getResources().getDimensionPixelSize(
				R.dimen.smart_watch_control_height);
	}
	
	private int doClassification() {
		int idxClass = -1;
		Object[] features = new Object[] {xTouch * 1.0, yTouch * 1.0};
		if (features != null) {
			try {
				idxClass = (int) BackSenseClassifier.classify(features);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Log.d(LOGTAG, idxClass+"")
;		return idxClass;
	}
}
