package me.xiangchen.app.crosssense;

public class CrossAppManager {

	static CrossSense phone = null;
	static CrossSenseExtension watch = null;

	public static void setPhone(CrossSense p) {
		phone = p;
	}

	public static void setWatch(CrossSenseExtension w) {
		watch = w;
	}

	public static void updateExtension() {
		if (watch != null) {
			switch (phone.selectedIndex) {
			case 0:
				watch.crossExt = watch.ONEBALL;
				break;
			case 1:
				watch.crossExt = watch.TWEETBALLS;
				break;
			default:
				break;
			}
			watch.updateVisuals();
		}
		// if (watch != null) {
		// if (phone.activeFragment == phone.oneBall) {
		// watch.crossExt = watch.ONEBALL;
		// } else if (phone.activeFragment == phone.tweetBalls) {
		// watch.crossExt = watch.TWEETBALLS;
		// }
		// watch.updateVisuals();
		// }

	}
	
	public static void updateWatchVisual() {
		if(watch != null) {
			watch.updateVisuals();
		}
	}
}
