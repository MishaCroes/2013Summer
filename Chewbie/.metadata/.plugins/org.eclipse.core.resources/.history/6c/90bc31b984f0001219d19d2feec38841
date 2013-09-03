package me.xiangchen.app.duetapp;

import me.xiangchen.app.duetos.LauncherExtension;
import me.xiangchen.app.duetos.LauncherManager;
import android.graphics.Bitmap;

import com.sonyericsson.extras.liveware.extension.util.control.ControlTouchEvent;

public class AppExtension { 
	
	public void doResume() {
		
	}

	public void doAccelerometer(float[] values) {

	}

	public void doTouch(ControlTouchEvent event) {

	}

	public void doSwipe(int direction) {

	}

	protected void showText(String text) {
		LauncherExtension watch = LauncherManager.getWatch();
		if(watch != null) {
			watch.showText(text);
		}
	}
	
	protected int getWidth() {
		int width = 0;
		LauncherExtension watch = LauncherManager.getWatch();
		if(watch != null) {
			width = watch.getWidth();
		}
		return width;
	}
	
	protected int getHeight() {
		int height = 0;
		LauncherExtension watch = LauncherManager.getWatch();
		if(watch != null) {
			height = watch.getHeight();
		}
		return height;
	}
	
	protected void updateWatchVisual(Bitmap bitmap, boolean toStick) {
		LauncherExtension watch = LauncherManager.getWatch();
		if(watch != null) {
			watch.updateVisual(bitmap, toStick);
		}
	}
	
	protected void buzz(int duration) {
		LauncherExtension watch = LauncherManager.getWatch();
		if(watch != null) {
			watch.buzz(duration);
		}
	}
	
	protected void mute() {
		LauncherManager.muteWatch();
	}
}
