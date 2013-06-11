package me.xiangchen.app.duettouchsense;

import me.xiangchen.lib.xacAccelerometer;
import me.xiangchen.ml.xacFeatureMaker;
import android.content.Context;
import android.util.Log;

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
	
	int width;
	int height;
	
	AccessorySensor sensor = null;
	AccessorySensorEventListener listener;
	
	xacAccelerometer accel;
	
	public TouchSenseExtension(Context context, String hostAppPackageName) {
		super(context, hostAppPackageName);
		width = getSupportedControlWidth(context);
		height = getSupportedControlHeight(context);
		
		accel = new xacAccelerometer();
		
		AccessorySensorManager manager = new AccessorySensorManager(context, hostAppPackageName);
        sensor = manager.getSensor(Sensor.SENSOR_TYPE_ACCELEROMETER);
        
        xacFeatureMaker.createFeatureTable(3);
        
		listener = new AccessorySensorEventListener() {

	        public void onSensorEvent(AccessorySensorEvent sensorEvent) {
	        	float[] values = sensorEvent.getSensorValues();
	        	accel.update(values[0], values[1], values[2]);
	        	xacFeatureMaker.addFeatureEntry(values, 0);
//	            streamSensorData(values);
//	            updateFPS();
//	            updateDisplay(values);
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
