package me.xiangchen.ui;

import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

public class xacInteractiveCanvas extends View {

	final public static int bgColorLight = 0xFFEADFD5;
	final public static int bgColorDark = 0xFF472A2B;
	final public static int fgColorGreen = 0xFF558c03;
	final public static int bgColorGreen = 0xAA2FFE2F;
	final public static int fgColorYellow = 0xFFF4880C;
	final public static int fgColorCream = 0xFFE3CC86;
	final public static int fgColorRed = 0xFFA40C20;
	final public static int bgColorRed = 0x88A40C20;
	final public static int fgColorWood = 0xFFD4A876;
	final public static int bgColorWood = 0xAAD4A876;
	final public static int fgColorBlack = 0xFF2D3E50;
	final public static int bgColorBlack = 0xFF2D3E50;
	final public static int fgColorBlue = 0xFF367FBF;
	final public static int bgColorBlue = 0xCC367FBF;

	private ArrayList<xacShape> shapes;
	private float xOffset;
	private float yOffset;
	private float scalePrev = 1;
	private float scaleCurr = 1;
	
//	public float idxInScreen0 = 0;
//	public float idxInScreen1 = 0;
	
	public void setOffsets (float dx, float dy) {
		xOffset = dx;
		yOffset = dy;
	}
	
	public void setScale (float s) {
		scalePrev = scaleCurr;
		scaleCurr = s;
	}
	
	public xacInteractiveCanvas(Context context) {
		super(context);
		shapes = new ArrayList<xacShape>();
		this.setBackgroundColor(bgColorLight);
	}

	public void addShape(xacShape shape) {
		shapes.add(shape);
	}
	
	public void addShape(int type, float width, float height) {
		float xShape = getX() + getWidth() / 2;
		float yShape = getY() + getHeight() / 2;
		addShape(type, width, height, xShape, yShape);
	}

	public void addShape(int type, float w, float h, float cx, float cy) {
		addShape(type, w, h, cx, cy, fgColorBlue);
	}

	public xacShape addShape(int type, float w, float h, float cx, float cy,
			int color) {
		xacShape shape = new xacShape(type);
		shape.setColor(color);
		shape.setPosition(cx, cy);
		shape.setSize(w, h);
		shapes.add(shape);
		return shape;
	}

	public ArrayList<xacShape> getTouchedShapes(float x, float y) {
		ArrayList<xacShape> tShapes = new ArrayList<xacShape>();

		for (xacShape shape : shapes) {
			if (shape.hitTest(x, y)) {
				tShapes.add(shape);
			}
		}

		return tShapes;
	}
	
	public ArrayList<xacShape> getTouchedShapesByRect(float x, float y, float rw) {
		ArrayList<xacShape> tShapes = new ArrayList<xacShape>();

		for (xacShape shape : shapes) {
			if (shape.hitTest(x, y, rw)) {
				tShapes.add(shape);
			}
		}

		return tShapes;
	}

	public ArrayList<xacShape> getShapes() {
		return shapes;
	}
	
	public void remove(xacShape shape) {
		shapes.remove(shape);
	}

	public void scrollContentsBy(float dx, float dy) {
		for(xacShape shape : shapes) {
			shape.offset(dx, dy);
		}
	}
	
	@SuppressWarnings("deprecation")
	@Override
	// decides the size of this view
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

		Display display = ((WindowManager) this.getContext().getSystemService(
				Context.WINDOW_SERVICE)).getDefaultDisplay();
		// the view occupies the entire screen. however, this is not the only
		// option
		setMeasuredDimension(display.getWidth(), display.getHeight());
	}

	@SuppressLint("DrawAllocation")
	@Override
	protected void onDraw(Canvas canvas) {

		for (xacShape shape : shapes) {
			shape.offset(xOffset, yOffset);
			if(shape.getY() + shape.getH() > 0 && shape.getY() < this.getMeasuredHeight()) {
				shape.draw(canvas);
			}
		}
	}
}
