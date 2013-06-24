package me.xiangchen.ui;

import me.xiangchen.app.shiftsense.ShiftManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.MotionEvent.PointerCoords;
import android.webkit.WebView;

public class xacWebView extends WebView {

	public xacWebView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	@SuppressLint("NewApi")
	@Override
	public boolean onTouchEvent (MotionEvent event) {
		super.onTouchEvent(event);
		
		int numTouches = event.getPointerCount();
		PointerCoords tchPnt = new PointerCoords();
		event.getPointerCoords(0, tchPnt);
		float x = tchPnt.x;
		float y = tchPnt.y;

		if (numTouches == 1) {
			ShiftManager.shift(this, x, y);
		}
		return true;
		
	}

}
