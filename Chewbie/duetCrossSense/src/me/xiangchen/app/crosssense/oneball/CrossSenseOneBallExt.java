package me.xiangchen.app.crosssense.oneball;

import java.util.ArrayList;

import me.xiangchen.app.crosssense.CrossSenseExtension;
import me.xiangchen.ui.xacInteractiveCanvas;
import me.xiangchen.ui.xacShape;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.RectF;
import android.widget.LinearLayout;

import com.sonyericsson.extras.liveware.aef.control.Control;
import com.sonyericsson.extras.liveware.extension.util.control.ControlTouchEvent;

public class CrossSenseOneBallExt {

	int width;
	int height;
	
	xacInteractiveCanvas canvas;
	ArrayList<xacShape> shapes = null;
	Point prevCoord;

	LinearLayout layout;
	
	public CrossSenseOneBallExt(CrossSenseExtension watch, Context context, int w, int h) {
		width = w;
		height = h;
		
		layout = new LinearLayout(context);
		canvas = new xacInteractiveCanvas(context);
		canvas.layout(0, 0, width, height);
		CrossOneBallManager.setWatch(watch);
		CrossOneBallManager.setCanvasWatch(canvas);
		
		layout.addView(canvas);
	}
	
	public void doResume() {
		CrossOneBallManager.syncTheWatch();
	}
	
	public void doTouch(ControlTouchEvent event) {
		int action = event.getAction();
		Point curCoord = new Point();
		curCoord.set(event.getX(), event.getY());
		
		switch(action) {
		case Control.Intents.TOUCH_ACTION_PRESS:
			shapes = canvas.getTouchedShapes(curCoord.x, curCoord.y);
			for(xacShape shape : shapes) {
				shape.toggleAlpha();
			}
			break;
		case Control.Intents.TOUCH_ACTION_RELEASE:
			for(xacShape shape : shapes) {
				shape.offset(curCoord.x - prevCoord.x, curCoord.y - prevCoord.y);
				shape.toggleAlpha();
				RectF rectF = new RectF();
				rectF.set(canvas.getLeft(), canvas.getTop(), canvas.getRight(), canvas.getBottom());
				if(!shape.isIn(rectF) && !shape.isOut(rectF)) {
					CrossOneBallManager.syncToPhone();
				}
			}
			break;
		}
		
		prevCoord = curCoord;
	}
	
	public Bitmap getUpdatedBitmap() {
		Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
		Canvas renderCanvas = new Canvas(bitmap);
		renderCanvas.drawColor(xacInteractiveCanvas.bgColorLight);
		
		layout.draw(renderCanvas);

		return bitmap;
	}
}
