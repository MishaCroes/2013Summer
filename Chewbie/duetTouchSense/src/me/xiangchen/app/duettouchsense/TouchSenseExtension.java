package me.xiangchen.app.duettouchsense;

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
import com.sonyericsson.extras.liveware.extension.util.control.ControlExtension;
import com.sonyericsson.extras.liveware.extension.util.sensor.AccessorySensor;
import com.sonyericsson.extras.liveware.extension.util.sensor.AccessorySensorEvent;
import com.sonyericsson.extras.liveware.extension.util.sensor.AccessorySensorEventListener;
import com.sonyericsson.extras.liveware.extension.util.sensor.AccessorySensorException;
import com.sonyericsson.extras.liveware.extension.util.sensor.AccessorySensorManager;

public class TouchSenseExtension extends ControlExtension {

	final static String LOG_TAG = "TouchSense";
	final Bitmap.Config BITMAP_CONFIG = Bitmap.Config.ARGB_8888;
	final public static int WATCHACCELFPS = 10;
	
	int width;
	int height;
	
	AccessorySensor sensor = null;
	AccessorySensorEventListener listener;
	
//	xacAccelerometer accel;
	
	Context context;
	
	RelativeLayout layout;
	Canvas canvas;
	Bitmap bitmap;
	TextView textView;
	
	public TouchSenseExtension(Context context, String hostAppPackageName) {
		super(context, hostAppPackageName);
		
		this.context = context;
		
		width = getSupportedControlWidth(context);
		height = getSupportedControlHeight(context);
		
		layout = new RelativeLayout(context);
		textView = new TextView(context);
		textView.setText("Touch\nSense");
		textView.setTextSize(10);
		textView.setTextColor(Color.WHITE);
		textView.layout(0, 0, width, height);
		layout.addView(textView);
		
//		accel = new xacAccelerometer();
		
		AccessorySensorManager manager = new AccessorySensorManager(context, hostAppPackageName);
        sensor = manager.getSensor(Sensor.SENSOR_TYPE_ACCELEROMETER);
        
//        xacFeatureMaker.createFeatureTable(3);
        
		listener = new AccessorySensorEventListener() {

	        public void onSensorEvent(AccessorySensorEvent sensorEvent) {
	        	float[] values = sensorEvent.getSensorValues();
//	        	accel.update(values[0], values[1], values[2]);
	        	xacFeatureMaker.updateWatchAccel(values);
	        	xacFeatureMaker.addWatchFeatureEntry();
	        }
	    };
	}
	
	@Override
    public void onResume() {
        
        setScreenState(Control.Intents.SCREEN_STATE_ON);

        // Start listening for sensor updates.
        if (sensor != null) {
            try {
            	sensor.registerFixedRateListener(listener, Sensor.SensorRates.SENSOR_DELAY_FASTEST);
            } catch (AccessorySensorException e) {
                Log.d(LOG_TAG, "Failed to register listener");
            }
        }
        
        bitmap = Bitmap.createBitmap(width, height, BITMAP_CONFIG);
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
	
	public static int getSupportedControlWidth(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.smart_watch_control_width);
    }


    public static int getSupportedControlHeight(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.smart_watch_control_height);
    }

}
