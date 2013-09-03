package me.xiangchen.app.duettech;

import me.xiangchen.app.duetstudy.MultiDeviceGesture;
import android.graphics.BitmapFactory;
import android.util.Log;

public class DuetTechManager {
	public final static String LOGTAG = "DuetTech";

	public final static int NONE = -1;
	public final static int SWIPEOPEN = 0;
	public final static int SWIPECLOSE = 1;
	public final static int TAP = 2;
	public final static int DELTATIME = 500; // ms
	public final static int ORDERTIME = DELTATIME / 2; 

	public final static int PINCHOPEN = 0;
	public final static int PINCHCLOSE = 1;
	public final static int WATCHTOPHONE = 2;
	public final static int PHONETOWATCH = 3;

	public final static int REGULAR = 0;
	public final static int DIM = 1;
	public final static int ANCHOR = 2;

	static int watchMode = REGULAR;
	static int phoneMode = REGULAR;

	static DuetTech phone;
	static DuetTechExtension watch;

	static int recognizedAs;
	
	static class SyncGesture {
		public SyncGesture() {
			gesture = NONE;
			timeStamp = 0;
		}

		public long timeStamp;
		public int gesture;
	}

	static SyncGesture watchGesture = null;
	static SyncGesture phoneGesture = null;

	public static void initGestureManager() {
		watchGesture = new SyncGesture();
		phoneGesture = new SyncGesture();
	}

	public static void setWatch(DuetTechExtension w) {
		watch = w;
	}

	public static void setPhone(DuetTech p) {
		phone = p;
	}

	public static void updateWatchGesture(int gesture, long timeStamp) {
		if (watchGesture != null) {
			watchGesture.gesture = gesture;
			watchGesture.timeStamp = timeStamp;
			update();
		}
	}

	public static void updatePhoneGesture(int gesture, long timeStamp) {
		if (phoneGesture != null) {
			phoneGesture.gesture = gesture;
			phoneGesture.timeStamp = timeStamp;
			update();

		}
	}

	public static void update() {
		if (watchGesture == null || phoneGesture == null) {
			return;
		}

		if (watchGesture.gesture == NONE || phoneGesture.gesture == NONE) {
			return;
		}

		int dtGesture = (int) (watchGesture.timeStamp
				- phoneGesture.timeStamp);
		if (Math.abs(dtGesture) > DELTATIME) {
			return;
		}

		if (watchGesture.gesture == SWIPEOPEN
				&& phoneGesture.gesture == SWIPEOPEN) {
			Log.d(LOGTAG, "swipe open");
			recognizedAs = MultiDeviceGesture.SWIPEOPEN;
		} else if (watchGesture.gesture == SWIPECLOSE
				&& phoneGesture.gesture == SWIPECLOSE) {
			Log.d(LOGTAG, "swipe close");
			recognizedAs = MultiDeviceGesture.SWIPECLOSE;
		} else if (watchGesture.gesture == SWIPEOPEN
				&& phoneGesture.gesture == SWIPECLOSE) {
			Log.d(LOGTAG, "phone->watch");
			recognizedAs = MultiDeviceGesture.PHONETOWATCH;
		} else if (watchGesture.gesture == SWIPECLOSE
				&& phoneGesture.gesture == SWIPEOPEN) {
			Log.d(LOGTAG, "watch->phone");
			recognizedAs = MultiDeviceGesture.WATCHTOPHONE;
		}

		if (watchGesture.gesture == TAP) {
//			int dt = (int) (watchGesture.timeStamp - phoneGesture.timeStamp);
			if (Math.abs(dtGesture) < ORDERTIME) {
				if (phoneGesture.gesture == SWIPEOPEN) {
					Log.d(LOGTAG, "by tap: swipe open");
					recognizedAs = MultiDeviceGesture.SWIPEOPEN;
				} else if (phoneGesture.gesture == SWIPECLOSE) {
					Log.d(LOGTAG, "by tap: swipe close");
					recognizedAs = MultiDeviceGesture.SWIPECLOSE;
				}
			} else if(dtGesture < -ORDERTIME) {
				Log.d(LOGTAG, "by tap: watch->phone");
				recognizedAs = MultiDeviceGesture.WATCHTOPHONE;
			} else if(dtGesture > ORDERTIME) {
				Log.d(LOGTAG, "by tap: phone->watch");
				recognizedAs = MultiDeviceGesture.PHONETOWATCH;
			}

		}

		phone.multiDeviceGesture.sendOffData(recognizedAs);
		phone.multiDeviceGesture.feedback(recognizedAs);
		phone.multiDeviceGesture.advance(recognizedAs);

		phoneGesture.gesture = NONE;
		watchGesture.gesture = NONE;
	}
	
	public static void setWatchImage(int resId) {
		if(watch != null) {
			watch.updateVisual(BitmapFactory.decodeResource(phone.getResources(), resId));
		}
	}
	
	public static void buzzWatch(int duration) {
		if(watch != null) {
			watch.buzz(duration);
		}
	}
	
	public static void restoreWatchVisual() {
		if(watch != null) {
			watch.updateVisual();
		}
	}
}
