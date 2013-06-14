package me.xiangchen.app.bumpsense;

import me.xiangchen.ml.xacFeatureMaker;
import me.xiangchen.ui.xacShape;
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

public class BumpSenseExtension extends ControlExtension {

	final static String LOGTAG = "BumpSense";
	
	int width;
	int height;
	Context context;
	
	float[] triNorth;
	float[] triWest;
	float[] triSouth;
	float[] triEast;
	
	boolean[] isActives;
	
	AccessorySensor sensor = null;
	AccessorySensorEventListener listener;
	
	RelativeLayout layout;
	Canvas canvas;
	Bitmap bitmap;
	TextView textView;
	
	int red;
	
	public BumpSenseExtension(Context context, String hostAppPackageName) {
		super(context, hostAppPackageName);
		
		this.context = context;
		
		width = getSupportedControlWidth(context);
		height = getSupportedControlHeight(context);
		
		BumpManager.setBumpSenseExtension(this);
		
		triNorth = new float[]{0, 0, width, 0, width/2, height * 4/9};
		triWest = new float[]{0, 0, width * 4/9, height/2, 0, height};
		triSouth = new float[]{0, height, width/2, height * 5/9, width, height};
		triEast = new float[]{width, height, width * 5/9, height/2, width, 0};
		
		layout = new RelativeLayout(context);
		textView = new TextView(context);
		textView.setText("Bump\nSense");
		textView.setTextSize(10);
		textView.setTextColor(Color.WHITE);
		textView.layout(0, 0, width, height);
		layout.addView(textView);
		
		isActives = new boolean[] {false, false, false, false};
		
		AccessorySensorManager manager = new AccessorySensorManager(context, hostAppPackageName);
        sensor = manager.getSensor(Sensor.SENSOR_TYPE_ACCELEROMETER);
        
        listener = new AccessorySensorEventListener() {

	        public void onSensorEvent(AccessorySensorEvent sensorEvent) {
	        	float[] values = sensorEvent.getSensorValues();
//	        	xacFeatureMaker.accelWatch.update(values[0], values[1], values[2]);
	        	xacFeatureMaker.updateWatchAccel(values);
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
                Log.d(LOGTAG, "Failed to register listener");
            }
        }
        
		updateVisual();	
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
	
	public void updateVisual() {
		bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
		canvas = new Canvas(bitmap);
//		canvas
//		layout.draw(canvas);

		canvas.drawColor(Color.argb(255, red, 0, 0));
		
		xacShape.drawTriangle(canvas, triNorth, isActives[BumpManager.NORTH] ? Color.RED : Color.WHITE);
		xacShape.drawTriangle(canvas, triWest, isActives[BumpManager.WEST] ? Color.RED : Color.WHITE);
		xacShape.drawTriangle(canvas, triSouth, isActives[BumpManager.SOUTH] ? Color.RED : Color.WHITE);
		xacShape.drawTriangle(canvas, triEast, isActives[BumpManager.EAST] ? Color.RED : Color.WHITE);
		
		showBitmap(bitmap);
	}
	
	public void setActive(int idxActive) {
		for (int i = 0; i < isActives.length; i++) {
			isActives[i] = false;
		}
		
		if (0 <= idxActive && idxActive < isActives.length) {
			isActives[idxActive] = true;
		}
	}
	
	public static int getSupportedControlWidth(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.smart_watch_control_width);
    }


    public static int getSupportedControlHeight(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.smart_watch_control_height);
    }
}
