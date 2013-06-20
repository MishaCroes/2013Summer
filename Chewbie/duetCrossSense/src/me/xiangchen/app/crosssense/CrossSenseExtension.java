package me.xiangchen.app.crosssense;

import java.util.ArrayList;

import me.xiangchen.ui.xacInteractiveCanvas;
import me.xiangchen.ui.xacShape;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.RectF;
import android.widget.LinearLayout;

import com.sonyericsson.extras.liveware.aef.control.Control;
import com.sonyericsson.extras.liveware.extension.util.R;
import com.sonyericsson.extras.liveware.extension.util.control.ControlExtension;
import com.sonyericsson.extras.liveware.extension.util.control.ControlTouchEvent;

public class CrossSenseExtension extends ControlExtension {

	int width;
	int height;
	
	LinearLayout layout;	
	xacInteractiveCanvas canvas;
	
	private ArrayList<xacShape> shapes = null;
	Point prevCoord;
	
	public CrossSenseExtension(Context context, String hostAppPackageName) {
		super(context, hostAppPackageName);
		
		width = getSupportedControlWidth(context);
		height = getSupportedControlHeight(context);
		
		layout = new LinearLayout(context);
		canvas = new xacInteractiveCanvas(context);
		canvas.layout(0, 0, width, height);
		CrossManager.setWatch(this);
		CrossManager.setCanvasWatch(canvas);
		
		layout.addView(canvas);
	}
	
	@Override
    public void onResume() {
		CrossManager.syncTheWatch();
		setScreenState(Control.Intents.SCREEN_STATE_ON);
		
//		updateVisuals();
	}
	
	@Override
    public void onTouch(final ControlTouchEvent event) {
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
					CrossManager.syncToPhone();
				}
			}
			break;
		}
		
		updateVisuals();
		
		prevCoord = curCoord;
		
	}
	
	
	public void updateVisuals() {
		Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
		Canvas renderCanvas = new Canvas(bitmap);
		renderCanvas.drawColor(xacInteractiveCanvas.bgColorLight);
		
		layout.draw(renderCanvas);

		showBitmap(bitmap);
	}
	
	public static int getSupportedControlWidth(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.smart_watch_control_width);
    }


    public static int getSupportedControlHeight(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.smart_watch_control_height);
    }

}
 