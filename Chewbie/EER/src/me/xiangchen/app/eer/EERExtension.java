package me.xiangchen.app.eer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.Log;
import android.widget.RelativeLayout;

import com.sonyericsson.extras.liveware.aef.control.Control;
import com.sonyericsson.extras.liveware.extension.util.R;
import com.sonyericsson.extras.liveware.extension.util.control.ControlExtension;
import com.sonyericsson.extras.liveware.extension.util.control.ControlTouchEvent;

public class EERExtension extends ControlExtension {

	final String LOGTAG = "EER";
	final Bitmap.Config BITMAP_CONFIG = Bitmap.Config.ARGB_8888;
	final static int MAXTOUCHPOINTS = 2;
	
	Context context;
	
	int width;
	int height;
	
	RelativeLayout layout;
	
	Canvas canvas;
	Bitmap bitmap;
	
	xacSwipe swipe;
	xacTextEntry textEntry;
	
	public EERExtension(Context context, String hostAppPackageName) {
		super(context, hostAppPackageName);
		Log.d(LOGTAG, "debug started... ");
		
		this.context = context;
		
		width = getSupportedControlWidth(context);
		height = getSupportedControlHeight(context);
		
		bitmap = Bitmap.createBitmap(width, height, BITMAP_CONFIG);
		canvas = new Canvas(bitmap);
		
		layout = new RelativeLayout(context);
		
		swipe = new xacSwipe();
		
		textEntry = new xacTextEntry();
		textEntry.setDimension(width, height);
	}

	@Override
	public void onStart() {
		
	}
	
	@Override
    public void onResume() {
		textEntry.initVisualView(layout, context);
		textEntry.initTextView(layout, context);
		
		updateDisplay();
	}
	
	private void updateDisplay() {
		bitmap = Bitmap.createBitmap(width, height, BITMAP_CONFIG);
		canvas = new Canvas(bitmap);
    	layout.draw(canvas);
    	showBitmap(bitmap);
	}
	
	@Override
	public void onTouch(final ControlTouchEvent event) {
//		Log.d(LOGTAG, "touch");
		switch(event.getAction()) {
		case Control.Intents.TOUCH_ACTION_PRESS:
//			Log.d(LOGTAG, "touch down");
			doTouchDown(event);
			break;
		case Control.Intents.TOUCH_ACTION_RELEASE:
//			Log.d(LOGTAG, "touch up");
			try {
				doTouchUp(event);
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
	}
	
	@Override
	public void onSwipe(int direction) {
		String strDir = "";
		switch (direction) {
		case Control.Intents.SWIPE_DIRECTION_UP:
			strDir = "up";
			break;
		case Control.Intents.SWIPE_DIRECTION_LEFT:
			strDir = "left";
			break;
		case Control.Intents.SWIPE_DIRECTION_DOWN:
			strDir = "down";
			break;
		case Control.Intents.SWIPE_DIRECTION_RIGHT:
			strDir = "right";
			break;
		default:
			strDir = "unknown";
			break;
		}
		
		Log.d(LOGTAG, strDir);
	}
	
	public static int getSupportedControlWidth(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.smart_watch_control_width);
    }


    public static int getSupportedControlHeight(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.smart_watch_control_height);
    }
    
    @SuppressLint("UseValueOf")
	private void doTouchDown(ControlTouchEvent event) {
		int numTouches = 1;
		if(numTouches > MAXTOUCHPOINTS) {
			return;
		}
		for(int i=0; i<numTouches; i++) {
//			String key = new Integer(event.getPointerId(i)).toString();
			String key = new Integer(1027).toString();
			swipe.addTouchPoint(event.getX(), event.getY(), key);
		}
		
		Log.d(LOGTAG, String.format("%d,  %d", event.getX(), event.getY()));
	}
	
	private void doTouchMove(ControlTouchEvent event) {
		
	}
	
	private void doTouchUp(ControlTouchEvent event) throws CloneNotSupportedException {
		int numTouches = 1;
		for(int i=0; i<numTouches; i++) {
			String key = new Integer(1027).toString();
			swipe.endTouchPoint(event.getX(), event.getY(), key);
		}
		
		swipe.getGesture();
		textEntry.update(swipe);
		swipe.cleanTouchPoin();
		updateDisplay();
		
		Log.d(LOGTAG, String.format("%d,  %d", event.getX(), event.getY()));
	}
}
