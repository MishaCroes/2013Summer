package me.xiangchen.lib;

import java.util.Calendar;

import android.util.Log;

import com.sonyericsson.extras.liveware.aef.control.Control;
import com.sonyericsson.extras.liveware.extension.util.control.ControlTouchEvent;

public class xacWatchGesture {

	public final static String LOGTAG = "ShareSense";
	public final static int DOUBLETAP = 0;
	public final static int YES = 0;
	public final static int NO = -1;
	
	public final static int INTRVLDOUBLETAP = 375; //ms
	
	int type;
	
	long lastUpdateTime = 0;

	
	public xacWatchGesture(int type) {
		this.type = type;
	}
	
	public float update(ControlTouchEvent event) {
		float val = NO;
		switch(type) {
		case DOUBLETAP:
			return updateDoubleTap(event);
		}
		return val;
	}
	
	private float updateDoubleTap(ControlTouchEvent event) {
		if(event.getAction() != Control.Intents.TOUCH_ACTION_RELEASE)
			return NO;
		
		float val = NO;
		
		Calendar lCDateTime = Calendar.getInstance();
		long curTime = lCDateTime.getTimeInMillis();
		
		Log.d(LOGTAG, curTime - lastUpdateTime + "");
		if(curTime - lastUpdateTime < INTRVLDOUBLETAP) {
			val = YES;
		}
		
		lastUpdateTime = curTime;
		
		return val;
	}
}
