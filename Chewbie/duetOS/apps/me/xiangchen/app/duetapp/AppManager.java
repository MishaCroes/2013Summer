package me.xiangchen.app.duetapp;

import me.xiangchen.app.duetos.LauncherExtension;
import me.xiangchen.app.duetos.LauncherManager;
import android.graphics.Bitmap;

public class AppManager {

	protected static void updateWatchVisual(Bitmap bitmap) {
		LauncherExtension watch = LauncherManager.getWatch();
		if(watch != null) {
			watch.updateVisual(bitmap);
		}
	}
}
