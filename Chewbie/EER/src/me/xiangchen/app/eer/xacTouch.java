package me.xiangchen.app.eer;

import android.annotation.SuppressLint;
import android.graphics.Point;

public class xacTouch {

	Point start;
	Point end;
	
	public void setStart(Point s) {
		start = s;
	}
	
	public Point getStart() {
		return start;
	}
	
	public void setEnd(Point e) {
		end = e;
	}
	
	public Point getEnd() {
		return end;
	}
	
	@SuppressLint("NewApi")
	public Point getOffset() {
		Point offset = new Point();
		offset.x = end.x - start.x;
		offset.y = end.y - start.y;
		return offset;
	}
}
