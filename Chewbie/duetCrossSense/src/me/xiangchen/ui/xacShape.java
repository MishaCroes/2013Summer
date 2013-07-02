package me.xiangchen.ui;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

public class xacShape {

	final public static int OVAL = 0;
	final static int DEFAULTALPHA = 192;
	
	private float xCenter;
	private float yCenter;
	private float width;
	private float height;
	private Paint fillPaint;
	private Paint strokePaint;
	private int type;
	private int alpha = DEFAULTALPHA;
	
	public xacShape(int type) {
		fillPaint = new Paint();
		fillPaint.setAlpha(alpha);
		fillPaint.setDither(true);
		fillPaint.setAntiAlias(true);
		fillPaint.setStyle(Paint.Style.FILL);
		
		strokePaint = new Paint();
		strokePaint.setColor(Color.TRANSPARENT);
		strokePaint.setStyle(Paint.Style.STROKE);
		strokePaint.setStrokeJoin(Paint.Join.ROUND);
		strokePaint.setStrokeCap(Paint.Cap.ROUND);
		strokePaint.setStrokeWidth(5);
		
		this.type = type;
	}
	
	public void setPosition(float x, float y) {
		xCenter = x;
		yCenter = y;
	}
	
	public void offset(float dx, float dy) {
		xCenter += dx;
		yCenter += dy;
	}

	public float getX() {
		return xCenter;
	}

	public float getY() {
		return yCenter;
	}

	public void setSize(float w, float h) {
		width = w;
		height = h;
	}
	
	public float getW() {
		return width;
	}

	public float getH() {
		return height;
	}

	public void setColor(int color) {
		fillPaint.setColor(color);
	}
	
	public void toggleAlpha() {
		alpha = 255 - alpha;
		fillPaint.setAlpha((int) alpha);
	}
	
	public void fadeAlpha(float rate) {
		alpha *= rate;
		fillPaint.setAlpha((int) alpha);
	}
	
	public float getAlpha() {
		return alpha;
	}
	
	public Paint getPaint() {
		return fillPaint;
	}
	
	public int getType() {
		return type;
	}
	
	public void draw(Canvas canvas) {
		RectF rectF = new RectF();
		rectF.set(xCenter-width/2, yCenter-height/2, xCenter+width/2, yCenter+height/2);
		switch(type) {
		case OVAL:
			canvas.drawOval(rectF, fillPaint);
			canvas.drawOval(rectF, strokePaint);
			break;
		}
	}
	
	public boolean hitTest(float x, float y) {
		return (Math.abs(x - xCenter) < width/2 && Math.abs(y - yCenter) < height/2);
	}
	
	public boolean isIn(RectF rectF) {
		return !(xCenter-width < rectF.left || xCenter+width > rectF.right ||
				yCenter-height < rectF.top || yCenter+height > rectF.bottom);
	}
	
	public boolean isOut(RectF rectF) {
		return (xCenter+width < rectF.left || xCenter-width > rectF.right ||
				yCenter+height < rectF.top || yCenter-height > rectF.bottom);
	}
	
	public void setStrokeWidth(int w) {
		strokePaint.setStrokeWidth(w);
	}
	
	public void toggleStroke() {
		strokePaint.setColor(strokePaint.getColor() == Color.WHITE ? Color.TRANSPARENT : Color.WHITE);
	}
}
