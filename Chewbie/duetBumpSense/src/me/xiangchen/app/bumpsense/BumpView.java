package me.xiangchen.app.bumpsense;

import me.xiangchen.ui.xacShape;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.MotionEvent.PointerCoords;
import android.view.View;

@SuppressLint("NewApi")
public class BumpView extends View {

	final String LOGTAG = "BumpSense";
	
	float[] triNorth;
	float[] triWest;
	float[] triSouth;
	float[] triEast;
	
	boolean[] isActives;
	
	int alpha;
	
	public BumpView(Context context) {
		super(context);
		this.setBackgroundColor(Color.BLACK);
		alpha = 255;
	}

	public void initVisual() {
		
		float scale = 0.9f;
		int left = this.getLeft();
		int top = this.getTop();
		int right = this.getRight();
		int bottom = (int) (this.getBottom() * scale);
		
		triNorth = new float[]{left, top, right, top, right/2, bottom * 4/9};
		triWest = new float[]{left, top, right * 4/9, bottom/2, left, bottom};
		triSouth = new float[]{left, bottom, right/2, bottom * 5/9, right, bottom};
		triEast = new float[]{right, bottom, right * 5/9, bottom/2, right, top};
		
		isActives = new boolean[] {false, false, false, false};
	}
	
	@Override
	protected void onMeasure(int x, int y) {
		setMeasuredDimension(x, y);
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		
		setLayerType(View.LAYER_TYPE_SOFTWARE, null);
		int red = Color.RED;//.argb(alpha, 255, 0, 0);
		int white = Color.WHITE;//argb(255, 255, 255, 255);
//		xacShape.drawTriangle(canvas, triNorth, white);
//		xacShape.drawTriangle(canvas, triWest, white);
//		xacShape.drawTriangle(canvas, triSouth, white);
//		xacShape.drawTriangle(canvas, triEast, white);
		
		xacShape.drawTriangle(canvas, triNorth, isActives[BumpManager.NORTH] ? red : white);
		xacShape.drawTriangle(canvas, triWest, isActives[BumpManager.WEST] ? red : white);
		xacShape.drawTriangle(canvas, triSouth, isActives[BumpManager.SOUTH] ? red : white);
		xacShape.drawTriangle(canvas, triEast, isActives[BumpManager.EAST] ? red : white);
		
//		Log.d(LOGTAG, "drawing...");
	}
	
	public void updateVisual(int idxActive) {
		for (int i = 0; i < isActives.length; i++) {
			isActives[i] = false;
		}
		
		if (0 <= idxActive && idxActive < isActives.length) {
			isActives[idxActive] = true;
			
		}
		invalidate();
	}
	
	public int sgetAlpha(int a) {
		return alpha;
	}
	
	public void setAlpha(int a) {
		alpha = a;
	}
	
	public int getTouchedArea(PointerCoords coord) {
		int idxArea = BumpManager.UNKNOWN;
		
		float width = this.getWidth();
		float height = this.getHeight();
		
		float x = coord.x;
		float y = height - coord.y;
		
		if(height/2 < y && y < height && -(width/height) * y + width < x && x < width/height * y) {
			idxArea = BumpManager.NORTH;
		} else if(0 <= x && x <= width/2 && height/width * x < y && y < -height/width * x + height) {
			idxArea = BumpManager.WEST;
		} else if(0 < y && y < height/2 && width/height * y < x && x < -(width/height) * y + width) {
			idxArea = BumpManager.SOUTH;
		} else if(width/2 <= x && x <= width && -height/width * x + height < y && y < height/width * x) {
			idxArea = BumpManager.EAST;
		}
		
		return idxArea;
	}
}
