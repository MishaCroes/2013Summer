package me.xiangchen.app.duetapp;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public class App {
	protected View appView;
	protected ViewGroup appLayout;
	protected int color;
	
	public App(Context context) {
	}
	
	public int getColor() {
		return color;
	}
	
	public View getViewGroup() {
		return appLayout;
	}
	
	public void doTouch(MotionEvent event) {
		
	}
	
	public void doAccelerometer(float[] values) {
		
	}
}
