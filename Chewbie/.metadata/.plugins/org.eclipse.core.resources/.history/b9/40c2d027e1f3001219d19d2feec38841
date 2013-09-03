package me.xiangchen.lib;

import java.util.Calendar;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.MotionEvent;
import android.view.MotionEvent.PointerCoords;

public class xacPhoneGesture {

	public final static String LOGTAG = "DuetOS";
	public final static int DOUBLETAP = 0;
	public final static int PRESSANDHOLD = 1;
	public final static int YES = 0;
	public final static int NO = -1;
	
	public final static int INTRVLDOUBLETAP = 500; //ms
	public final static int HOLDTIMEOUT = 500; //ms
	public final static int HOLDTOUCHSIZE = 200; // px
	
	int type;
	
	long lastUpdateTime = 0;

	float distX;
	float distY;
	
	float prevX;
	float prevY;
	
	long timeTouchDown;
	
	public xacPhoneGesture(int type) {
		this.type = type;
	}
	
	public int update(MotionEvent event) {
		int val = NO;
		switch(type) {
		case DOUBLETAP:
			return updateDoubleTap(event);
		case PRESSANDHOLD:
			return updatePressAndHold(event);
		}
		return val;
	}
	
	private int updateDoubleTap(MotionEvent event) {
		if(event.getAction() != MotionEvent.ACTION_UP)
			return NO;
		
		if(event.getPointerCount() > 1) {
			return NO;
		}
		
		int val = NO;
		
		Calendar lCDateTime = Calendar.getInstance();
		long curTime = lCDateTime.getTimeInMillis();
		
		Log.d(LOGTAG, curTime - lastUpdateTime + "");
		if(curTime - lastUpdateTime < INTRVLDOUBLETAP) {
			val = YES;
			lastUpdateTime = 0;
		} else {
			Log.d(LOGTAG, "interval: "+(curTime-lastUpdateTime));
		}
		
		lastUpdateTime = curTime;
		
		return val;
	}
	
	@SuppressLint("NewApi")
	private int updatePressAndHold(MotionEvent event) {
		int result = NO;
		int action = event.getAction();
		
		PointerCoords tchPnt1 = new PointerCoords();
		event.getPointerCoords(0, tchPnt1);
		float x = tchPnt1.x;
		float y = tchPnt1.y;
		
		Calendar calendar = Calendar.getInstance();
		long curTime = calendar.getTimeInMillis();
		
		switch(action) {
		case MotionEvent.ACTION_DOWN:
			distX = 0;
			distY = 0;
			prevX = x;
			prevY = y;
			timeTouchDown = curTime;
			break;
		case MotionEvent.ACTION_MOVE:
			
			distX += Math.abs(x - prevX);
			distY += Math.abs(y - prevY);
			
			prevX = x;
			prevY = y;
			
			if(curTime - timeTouchDown < HOLDTIMEOUT) {
				break;
			}
			
			if (Math.max(distX, distY) < HOLDTOUCHSIZE) {
				result = YES;
			} else {
				result = NO;
			}
			break;
		}
		
		return result;
	}
}
