package me.xiangchen.app.eerv2;

import android.annotation.SuppressLint;
import android.view.MotionEvent.PointerCoords;

public class xacTouch {

	PointerCoords start;
	PointerCoords end;
	
	public void setStart(PointerCoords s) {
		start = s;
	}
	
	public PointerCoords getStart() {
		return start;
	}
	
	public void setEnd(PointerCoords e) {
		end = e;
	}
	
	public PointerCoords getEnd() {
		return end;
	}
	
	@SuppressLint("NewApi")
	public PointerCoords getOffset() {
		PointerCoords offset = new PointerCoords();
		offset.x = end.x - start.x;
		offset.y = end.y - start.y;
		return offset;
	}
}
