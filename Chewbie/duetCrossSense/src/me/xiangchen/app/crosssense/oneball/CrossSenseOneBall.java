package me.xiangchen.app.crosssense.oneball;

import java.util.ArrayList;

import me.xiangchen.ui.xacInteractiveCanvas;
import me.xiangchen.ui.xacShape;
import android.annotation.SuppressLint;
import android.graphics.RectF;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.MotionEvent.PointerCoords;
import android.view.View;
import android.view.ViewGroup;

@SuppressLint("NewApi")
public class CrossSenseOneBall extends Fragment {

	xacInteractiveCanvas canvas;
	ArrayList<xacShape> shapes = null;
	PointerCoords prevCoord;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		canvas = new xacInteractiveCanvas(container.getContext());
		CrossOneBallManager.setCanvasPhone(canvas);
		float dimPhone = 256;
		canvas.addShape(xacShape.OVAL, dimPhone, dimPhone);
		canvas.setOnTouchListener(new View.OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				int action = event.getAction();
				PointerCoords curCoord = new PointerCoords();
				event.getPointerCoords(0, curCoord);
				switch (action) {
				case MotionEvent.ACTION_DOWN:
					shapes = canvas.getTouchedShapes(curCoord.x, curCoord.y);
					break;
				case MotionEvent.ACTION_MOVE:
					for (xacShape shape : shapes) {
						shape.offset(curCoord.x - prevCoord.x, curCoord.y
								- prevCoord.y);
						RectF rectF = new RectF();
						rectF.set(canvas.getLeft(), canvas.getTop(),
								canvas.getRight(), canvas.getBottom());
						if (!shape.isIn(rectF) && !shape.isOut(rectF)) {
							CrossOneBallManager.syncTheWatch();
						}
					}
					break;
				case MotionEvent.ACTION_UP:
					break;
				}

				canvas.invalidate();
				prevCoord = curCoord;

				return true;
			}
		});
		return canvas;
	}
}
