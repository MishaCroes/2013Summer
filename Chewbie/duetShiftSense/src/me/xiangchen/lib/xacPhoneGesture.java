package me.xiangchen.lib;

import java.util.Calendar;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.MotionEvent;
import android.view.MotionEvent.PointerCoords;

public class xacPhoneGesture {
	public final static String LOGTAG = "ShiftSense";
	public final static int LONGPRESS = 0;
	public final static int YES = 0;
	public final static int NO = -1;
	
	public final static int DURATIONLONGPRESS = 500; //ms
	public final static float OFFSETTHESHOLD = 50;
	float sumOffset;
	float xPrevTouch;
	float yPrevTouch;
	long timeTouchDown;
	
	float xTouch;
	float yTouch;
int type;
	
	long lastUpdateTime = 0;
	
	public xacPhoneGesture(int type) {
		this.type = type;
	}
	
	public float update(MotionEvent event) {
		float val = NO;
		switch(type) {
		case LONGPRESS:
			return updateLongPress(event);
		}
		return val;
	}
	
	@SuppressLint("NewApi")
	private float updateLongPress(MotionEvent event) {
		if(event.getPointerCount() > 1) {
			return NO;
		}
		
		float val = NO;
		
		int action = event.getAction();
		PointerCoords tchPnt = new PointerCoords();
		event.getPointerCoords(0, tchPnt);
		float x = tchPnt.x;
		float y = tchPnt.y;
		
		Calendar lCDateTime = Calendar.getInstance();
		long curTime = lCDateTime.getTimeInMillis();
		
		switch(action) {
		case MotionEvent.ACTION_DOWN:
			xPrevTouch = x;
			yPrevTouch = y;
			sumOffset = 0;
			timeTouchDown = curTime;
				break;
		case MotionEvent.ACTION_MOVE:
			float dx = x - xPrevTouch;
			float dy = y - yPrevTouch;
			sumOffset *= 0.95f;
			sumOffset += Math.sqrt(dx * dx + dy * dy);
			
			if(curTime - timeTouchDown > DURATIONLONGPRESS) {
				if(sumOffset < OFFSETTHESHOLD) {
					val = YES;
//					Log.d(LOGTAG, "long press");
				}
			}
			
			break;
		}
		
		xTouch = x;
		yTouch = y;
		return val;
	}
	
	public float getX() {
		return xTouch;
	}
	
	public float getY() {
		return yTouch;
	}
}
