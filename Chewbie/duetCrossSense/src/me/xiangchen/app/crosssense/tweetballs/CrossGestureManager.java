package me.xiangchen.app.crosssense.tweetballs;

import java.util.ArrayList;

import me.xiangchen.app.crosssense.CrossAppManager;
import me.xiangchen.ui.xacShape;
import android.util.Log;

public class CrossGestureManager {
	public final static String LOGTAG = "CrossSense";

	public final static int NONE = -1;
	public final static int SWIPEOPEN = 0;
	public final static int SWIPECLOSE = 1;
	public final static int DELTATIME = 500; // ms
	
	public final static int PINCHOPEN = 0;
	public final static int PINCHCLOSE = 1;
	public final static int WATCHTOPHONE = 2;
	public final static int PHONETOWATCH = 3;
	
	public final static int REGULAR = 0;
	public final static int DIM = 1;
	public final static int ANCHOR = 2;
	
	static int watchMode = REGULAR;
	static int phoneMode = REGULAR;

	static CrossSenseTweetBalls phone;
	static CrossSenseTweetBallsExt watch;
	
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
	
	
	public static int tweetContent; 
	
	public static ArrayList<xacShape> selectedTweets;

	public static void initGestureManager() {
		watchGesture = new SyncGesture();
		phoneGesture = new SyncGesture();
		selectedTweets = new ArrayList<xacShape>();
	}
	
	public static void setWatch(CrossSenseTweetBallsExt w) {
		watch = w;
	}
	
	public static void setPhone(CrossSenseTweetBalls p) {
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
		
		if(watchGesture.gesture == NONE || phoneGesture.gesture == NONE) {
			return;
		}

		int dtGesture = (int) Math.abs(watchGesture.timeStamp - phoneGesture.timeStamp);
		if (dtGesture > DELTATIME) {
//			Log.d(LOGTAG, ""+dtGesture);
			return;
		}

		if (watchGesture.gesture == SWIPEOPEN
				&& phoneGesture.gesture == SWIPEOPEN) {
			Log.d(LOGTAG, "swipe open");
//			phone.setDim(false);
//			watch.setDim(false);
			phone.updateOnCrossGesture(PINCHOPEN);
			watch.updateOnCrossGesture(PINCHOPEN);
		} else if (watchGesture.gesture == SWIPECLOSE &&
				phoneGesture.gesture == SWIPECLOSE) {
//			phone.setDim(true);
//			watch.setDim(true);
			Log.d(LOGTAG, "swipe close");
			phone.updateOnCrossGesture(PINCHCLOSE);
			watch.updateOnCrossGesture(PINCHCLOSE);
		} else if (watchGesture.gesture == SWIPEOPEN &&
				phoneGesture.gesture == SWIPECLOSE) {
			Log.d(LOGTAG, "phone->watch");
//			phone.setDim(true);
//			watch.setDim(false);
			phone.updateOnCrossGesture(PHONETOWATCH);
			watch.updateOnCrossGesture(PHONETOWATCH);
		} else if (watchGesture.gesture == SWIPECLOSE &&
				phoneGesture.gesture == SWIPEOPEN) {
			Log.d(LOGTAG, "watch->phone");
//			phone.setDim(false);
//			watch.setDim(true);
			phone.updateOnCrossGesture(WATCHTOPHONE);
			watch.updateOnCrossGesture(WATCHTOPHONE);
		}
		
		CrossAppManager.updateWatchVisual();
		
		phoneGesture.gesture = NONE;
		watchGesture.gesture = NONE;
	}
	
	public static void syncWatch(xacShape tweet) {
		if(watch == null) 
			return;
		
		switch(watchMode) {
		case REGULAR:
			watch.setShapeColor(tweet.getPaint().getColor());
			break;
		case DIM:
			break;
		case ANCHOR:
			break;
		}
		
		CrossAppManager.updateWatchVisual();
	}
	
	public static void syncWatch() {
		if(watch == null) 
			return;
		watch.fadeCanvas();
		CrossAppManager.updateWatchVisual();
	}
	
}
