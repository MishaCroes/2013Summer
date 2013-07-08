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

	final public static int bgColorLight = 0xFF4E4231;
	final public static int bgColorDark = 0xFF472A2B;
	final public static int fgColorBlue = 0xFFCDDCF7;
	final public static int fgColorGreen = 0xFF9FFE9F;
	final public static int fgColorYellow = 0xFFF4880C;
	final public static int fgColorCream = 0xFFE3CC86;
	final public static int fgColorRed = 0xFFE80C7A;

	private ArrayList<xacShape> shapes;

	public xacInteractiveCanvas(Context context) {
		super(context);
		shapes = new ArrayList<xacShape>();
		this.setBackgroundColor(bgColorLight);
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

	public ArrayList<xacShape> getShapes() {
		return shapes;
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
			shape.draw(canvas);
		}
	}
}
