package me.xiangchen.app.tiltsense;

import me.xiangchen.ml.TiltSenseClassifier;
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
import com.sonyericsson.extras.liveware.extension.util.sensor.AccessorySensor;
import com.sonyericsson.extras.liveware.extension.util.sensor.AccessorySensorEvent;
import com.sonyericsson.extras.liveware.extension.util.sensor.AccessorySensorEventListener;
import com.sonyericsson.extras.liveware.extension.util.sensor.AccessorySensorException;
import com.sonyericsson.extras.liveware.extension.util.sensor.AccessorySensorManager;


public class TiltSenseExtension extends ControlExtension {

	public final static int WATCHACCELFPS = 10;
	public final static String LOGTAG = "TiltSense";
	
	int width;
	int height;
	
	AccessorySensor sensor = null;
	AccessorySensorEventListener listener;
	
	Context context;
	
	RelativeLayout layout;
	Canvas canvas;
	Bitmap bitmap;
	TextView textView;
	
	boolean isTiltInputOn = false;
	
	boolean isRecognition = true;
	
	public final static int NONE = 0;
	public final static int TILTOUT = 1;
	public final static int TILTIN = 2;
	int label;
	public final static String[] classLabels = {"None", "TiltOut", "TiltIn"};
	
	public TiltSenseExtension(Context context, String hostAppPackageName) {
		super(context, hostAppPackageName);
		
		TiltManager.setWatch(this);
		xacFeatureMaker.createFeatureTable();
		label = NONE;
		xacFeatureMaker.setLabel(label);
		
		width = getSupportedControlWidth(context);
		height = getSupportedControlHeight(context);
		
		layout = new RelativeLayout(context);
		textView = new TextView(context);
		textView.setText("Tilt\nSense");
		textView.setTextSize(10);
		textView.setTextColor(Color.WHITE);
		textView.layout(0, 0, width, height);
		layout.addView(textView);
		
		AccessorySensorManager manager = new AccessorySensorManager(context, hostAppPackageName);
        sensor = manager.getSensor(Sensor.SENSOR_TYPE_ACCELEROMETER);
        
		listener = new AccessorySensorEventListener() {

	        public void onSensorEvent(AccessorySensorEvent sensorEvent) {
	        	float[] values = sensorEvent.getSensorValues();
//	        	Log.d(LOGTAG, values[0] + ", " + values[1] + ", " + values[2]);
	        	float ya = values[1];
	        	float za = values[2];
	        	float eps = 0.0001f;
	        	Log.d(LOGTAG, ""+(za+eps)/(ya+eps));
	        	
	        	int numRowsToSend = WATCHACCELFPS;
	        	
	        	if(isTiltInputOn) {
	        		
	        		xacFeatureMaker.updateWatchAccel(values);
		        	xacFeatureMaker.addWatchFeatureEntry();
	        		if(isRecognition) {
	        			label = doClassification(numRowsToSend);
	        			TiltManager.updateWatchGesture(label, (za+eps)/(ya+eps));
	        		} else {
			        	if(xacFeatureMaker.sendOffData(numRowsToSend, classLabels)) {
			        		Log.d(LOGTAG, "data sent");
			        		xacFeatureMaker.clearData();
			        	}
	        		}
	        	}
	        }
	    };
	}
	
	private int doClassification(int n) {
		int idxClass = 0;
		Object[] features = xacFeatureMaker.getFlattenedData(n);
		if (features != null) {
			try {
				idxClass = (int) TiltSenseClassifier.classify(features);		
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		switch(idxClass) {
		case 2:
			return NONE;
		case 0:
			return TILTOUT;
		case 1:
			return TILTIN;
		}
		
		return NONE;
	}

	@Override
    public void onResume() {
        
        setScreenState(Control.Intents.SCREEN_STATE_ON);

        // Start listening for sensor updates.
        if (sensor != null) {
            try {
            	sensor.registerFixedRateListener(listener, Sensor.SensorRates.SENSOR_DELAY_FASTEST);
            } catch (AccessorySensorException e) {
                Log.d(LOGTAG, "Failed to register listener");
            }
        }
        
        bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
		canvas = new Canvas(bitmap);
		layout.draw(canvas);
		
		showBitmap(bitmap);
    }
	
	public void buzz() {
		startVibrator(100, 0, 1);
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
    
    public void toggleLabel() {
    	switch(label) {
		case NONE:
			label = TILTOUT;
			break;
		case TILTOUT:
			label = TILTIN;
			break;
		case TILTIN:
			label = NONE;
			break;
		}
    	xacFeatureMaker.setLabel(label);
    }
    
	public static int getSupportedControlWidth(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.smart_watch_control_width);
    }


    public static int getSupportedControlHeight(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.smart_watch_control_height);
    }
}
