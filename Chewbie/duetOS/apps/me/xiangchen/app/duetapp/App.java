package me.xiangchen.app.duetapp;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public class App {
	protected View appView;
	protected ViewGroup appLayout;
	protected int color;
	protected String title = "";
	protected String sup = "";
	
	public App(Context context) {
	}
	
	public int getColor() {
		return color;
	}
	
	public String getTitle() {
		return title;
	}
	
	public View getViewGroup() {
		return appLayout;
	}
	
	public void runOnUIThread() {
		
	}
	
	public void doTouch(MotionEvent event) {
		
	}
	
	public void doAccelerometer(float[] values) {
		
	}
	
	public String getSup() {
		return sup;
	}
}
