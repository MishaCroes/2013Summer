package me.xiangchen.ui;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.Log;
import android.view.View;

public class xacBufferCanvas extends View {

	public static final String LOGTAG = "DuetOS";
	ArrayList<Path> paths;
	Paint paint;
	
	public xacBufferCanvas(Context context) {
		super(context);
		paths = new ArrayList<Path>();
	}
	
	public void setPaint(Paint p) {
		paint = p;
	}
	
	public void addPath(Path path) {
		paths.add(path);
	}
	
	@Override
	public void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		
		for (Path path : paths) {
			canvas.drawPath(path, paint);
		}

	}
	
	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
	    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width = MeasureSpec.getSize(widthMeasureSpec);
        int height = MeasureSpec.getSize(heightMeasureSpec);

        setMeasuredDimension(width, height);
	}
	
	@Override
	public void dispatchDraw (Canvas canvas) {
		super.dispatchDraw(canvas);
//		canvas.drawColor(Color.GREEN);
		Log.d(LOGTAG, "redrawing...");
		for (Path path : paths) {
			canvas.drawPath(path, paint);
		}
	}
}
