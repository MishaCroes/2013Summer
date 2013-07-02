package me.xiangchen.ui;

import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

public class xacInteractiveCanvas extends View {

	final public static int bgColorLight = 0xFF4E4231;
	final public static int bgColorDark = 0xFF472A2B;
	final public static int fgColorBlue = 0xFFCDDCF7;
	final public static int fgColorGreen = 0xFF9FA79F;
	final public static int fgColorCream = 0xFFEDDD4;

	private ArrayList<xacShape> shapes;

	Context context;

	boolean veilOn = false;
	int colorVeil;

	public xacInteractiveCanvas(Context context) {
		super(context);
		shapes = new ArrayList<xacShape>();
		this.setBackgroundColor(bgColorLight);
		this.context = context;
	}

	public xacShape addShape(int type, float width, float height) {
		float xShape = getX() + getWidth() / 2;
		float yShape = getY() + getHeight() / 2;
		return addShape(type, width, height, xShape, yShape);
	}

	public xacShape addShape(int type, float w, float h, float cx, float cy) {
		return addShape(type, w, h, cx, cy, fgColorBlue);
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

		if (!veilOn) {
			for (xacShape shape : shapes) {
				shape.draw(canvas);
			}
		} else {
			canvas.drawColor(colorVeil);
		}
	}

	public void fade(float rate) {
		xacShape toRemove = null;
		for (xacShape shape : shapes) {
			shape.fadeAlpha(rate);
			if (toRemove == null && shape.getAlpha() < 32) {
				toRemove = shape;
			}
		}
		shapes.remove(toRemove);
	}

	public void highLight() {
		int size = shapes.size();
		if (size > 0) {
			xacShape newest = shapes.get(size - 1);
			newest.toggleStroke();
		}
		if (size > 1) {
			xacShape secondNewest = shapes.get(size - 2);
			secondNewest.toggleStroke();
		}
	}

	public void putOnVeil(int color) {
		colorVeil = color;
		veilOn = true;
//		this.invalidate();
	}

	public void putOnVeil() {
		veilOn = true;
	}
	
	public void takeOffVeil() {
		veilOn = false;
//		this.invalidate();
	}
	
	public boolean getVeilOn() {
		return veilOn;
	}
}
