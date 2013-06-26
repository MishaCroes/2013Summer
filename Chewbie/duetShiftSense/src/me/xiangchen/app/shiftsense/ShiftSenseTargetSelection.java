package me.xiangchen.app.shiftsense;

import java.util.ArrayList;
import java.util.Random;

import me.xiangchen.ui.xacInteractiveCanvas;
import me.xiangchen.ui.xacShape;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.MotionEvent.PointerCoords;
import android.view.View;
import android.view.ViewGroup;

public class ShiftSenseTargetSelection extends Fragment {

	final public static int WIDTH = 1080;
	final public static int HEIGHT = 1920;
	final public static float DIMTARGET = 50;
	final public static int NUMTARGETS = 150;
	final public static int SELECTRATIO = 3;
	
	static Random random = new Random();
	xacInteractiveCanvas canvas;
	
	int shiftWidth = 128;
	int shiftHeight = 128;
	
	float xTouch;
	float yTouch;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		canvas = new xacInteractiveCanvas(container.getContext());
		for (int i = 0; i < NUMTARGETS; i++) {
			float cx = random.nextInt(WIDTH);
			float cy = random.nextInt(HEIGHT);
			int color = random.nextInt() % SELECTRATIO == 0 ? xacInteractiveCanvas.fgColorGreen
					: xacInteractiveCanvas.fgColorRed;
			canvas.addShape(xacShape.OVAL, DIMTARGET, DIMTARGET, cx, cy, color);
		}
		
		canvas.setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				int numTouches = event.getPointerCount();
				PointerCoords tchPnt = new PointerCoords();
				event.getPointerCoords(0, tchPnt);
				float x = tchPnt.x;
				float y = tchPnt.y;

				if (numTouches == 1) {
					ShiftManager.shift(canvas, x, y, shiftWidth, shiftHeight);
				}
				
				xTouch = x;
				yTouch = y;
				
				return true;
			}
		});
		
		return canvas;

	}
	
	public void doSelection(float xRatio, float yRatio) {
		float dx = shiftWidth * xRatio;
		float dy = shiftHeight * yRatio;
		ArrayList<xacShape> shapes = canvas.getTouchedShapes(xTouch + dx, yTouch + dy);
		for(xacShape shape : shapes) {
			shape.toggleStroke();
		}
		canvas.invalidate();
		ShiftManager.shift(canvas, xTouch, yTouch, shiftWidth, shiftHeight);
	}
}
