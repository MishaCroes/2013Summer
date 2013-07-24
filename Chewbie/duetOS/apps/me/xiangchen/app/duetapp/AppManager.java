package me.xiangchen.app.duetapp;

import me.xiangchen.app.duetos.LauncherExtension;
import me.xiangchen.app.duetos.LauncherManager;
import android.graphics.Bitmap;

public class AppManager {

	protected static App phone;
	protected static AppExtension watch;
	
	public static void setPhone(App p) {
		phone = p;
	}
	
	public static void setWatch(AppExtension w) {
		watch = w;
	}
	
	protected static void updateWatchVisual(Bitmap bitmap, boolean toStick) {
		LauncherExtension watch = LauncherManager.getWatch();
		if(watch != null) {
			watch.updateVisual(bitmap, toStick);
		}
	}
}
