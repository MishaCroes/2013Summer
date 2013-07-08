package me.xiangchen.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

public class xacContextMenu extends View {

	public xacContextMenu(Context context) {
		super(context);
		
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

	}
}
