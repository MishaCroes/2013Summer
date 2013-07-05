package me.xiangchen.app.crosssense.oneball;

import java.util.ArrayList;

import me.xiangchen.app.crosssense.CrossSenseExtension;
import me.xiangchen.ui.xacInteractiveCanvas;
import me.xiangchen.ui.xacShape;

public class CrossOneBallManager {

	final static float PHONETOWATCHSIZERATIO = 4;

	private static CrossSenseExtension watch = null;

	private static xacInteractiveCanvas canvasPhone = null;
	private static xacInteractiveCanvas canvasWatch = null;

	public static void setCanvasPhone(xacInteractiveCanvas canvas) {
		canvasPhone = canvas;
	}

	public static void setWatch(CrossSenseExtension w) {
		watch = w;
	}

	public static void setCanvasWatch(xacInteractiveCanvas canvas) {
		canvasWatch = canvas;
	}

	public static void coordinateCross() {
		ArrayList<xacShape> shapesPhone = canvasPhone.getShapes();
		ArrayList<xacShape> shapesWatch = canvasPhone.getShapes();

		int numShapesPhone = shapesPhone.size();
		int numShapesWatch = shapesWatch.size();

		if (numShapesPhone != numShapesWatch) {
			return;
		}

	}

	public static void syncTheWatch() {

		if (canvasPhone == null || canvasWatch == null)
			return;

		ArrayList<xacShape> shapesPhone = canvasPhone.getShapes();
		ArrayList<xacShape> shapesWatch = canvasWatch.getShapes();

		int numShapesPhone = shapesPhone.size();
		int numShapesWatch = shapesWatch.size();

		if (numShapesPhone != numShapesWatch) {
			if (numShapesWatch == 0) {
				for (xacShape shapePhone : shapesPhone) {
					canvasWatch.addShape(shapePhone.getType(),
							shapePhone.getW() / PHONETOWATCHSIZERATIO,
							shapePhone.getH() / PHONETOWATCHSIZERATIO);
				}
			}
		}

		for (int i = 0; i < numShapesPhone; i++) {
			xacShape shapePhone = shapesPhone.get(i);
			xacShape shapeWatch = shapesWatch.get(i);

			float xWatch = shapePhone.getX() / PHONETOWATCHSIZERATIO
					+ canvasWatch.getWidth();
			float yWatch = shapePhone.getY()
					/ PHONETOWATCHSIZERATIO
					- (canvasPhone.getHeight() * 0.9f / PHONETOWATCHSIZERATIO - canvasWatch
							.getHeight() / 2);
			shapeWatch.setPosition(xWatch, yWatch);
		}

		if (watch != null) {
			watch.updateVisuals();
		}
	}

	public static void syncToPhone() {
		ArrayList<xacShape> shapesPhone = canvasPhone.getShapes();
		ArrayList<xacShape> shapesWatch = canvasWatch.getShapes();

		int numShapesPhone = shapesPhone.size();
		int numShapesWatch = shapesWatch.size();
		
		if (numShapesPhone != numShapesWatch) {
			return;
		}

		for (int i = 0; i < numShapesWatch; i++) {
			xacShape shapePhone = shapesPhone.get(i);
			xacShape shapeWatch = shapesWatch.get(i);

			float xPhone = (shapeWatch.getX() - canvasWatch.getWidth())
					* PHONETOWATCHSIZERATIO;
			float yPhone = (shapeWatch.getY() + (canvasPhone.getHeight() * 0.9f
					/ PHONETOWATCHSIZERATIO - canvasWatch.getHeight() / 2)
					* PHONETOWATCHSIZERATIO);
			shapePhone.setPosition(xPhone, yPhone);
		}

		canvasPhone.invalidate();
	}
}
