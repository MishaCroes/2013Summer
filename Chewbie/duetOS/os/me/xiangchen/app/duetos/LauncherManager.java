package me.xiangchen.app.duetos;

import me.xiangchen.app.duetapp.AppExtension;
import me.xiangchen.ui.xacToast;

public class LauncherManager {

	public final static float LAUNCHERWIDTH = 1080;
	public final static float LAUNCHERHEIGHT = 1920;

	public final static float MARGINRATIO = 0.05f;
	public final static int NUMAPPSROW = 4;

	public final static float MARGINWIDTH = LAUNCHERWIDTH * MARGINRATIO;
	public final static float MARGINHEIGHT = LAUNCHERHEIGHT * MARGINRATIO;

	public final static float APPWIDTH = (LAUNCHERWIDTH - MARGINWIDTH
			* (NUMAPPSROW + 1))
			/ NUMAPPSROW;
	public final static float APPHEIGHT = APPWIDTH;

	public final static int PHONEACCELFPSNORMAL = 10;
	public final static int PHONEACCELFPSUI = 17;
	public final static int PHONEACCELFPSGAME = 50;
	public final static int PHONEACCELFPSFASTEST = 100;

	static Launcher phone;
	static LauncherExtension watch;
	
	static int watchConfig;

	public static void setPhone(Launcher p) {
		phone = p;
	}

	public static void setWatch(LauncherExtension w) {
		watch = w;
	}
	
	public static LauncherExtension getWatch() {
		return watch;
	}

	public static void setAppExtension(AppExtension appExt) {
		if (watch != null) {
			watch.setAppExtension(appExt);
		}
	}

	public static AppExtension getAppExtension() {
		if (phone != null && phone.activeApp != null) {
			return phone.htAppExtensions.get(phone.activeApp);
		} else
			return null;
	}
	
	public static void setWatchConfig(int wc) {
		watchConfig = wc;
	}
	
	public static void showNotification(xacToast toast) {
		if(phone.isLocked) {
			toast.setImage();
			phone.doToast(toast);
		}
	}
}
