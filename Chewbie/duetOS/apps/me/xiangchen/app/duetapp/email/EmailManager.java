package me.xiangchen.app.duetapp.email;

import java.util.ArrayList;

import me.xiangchen.app.duetapp.AppManager;
import me.xiangchen.ui.xacShape;
import android.util.Log;

public class EmailManager extends AppManager {

	public final static String LOGTAG = "DuetOS";

	public final static int NONE = -1;
	public final static int SWIPEOPEN = 0;
	public final static int SWIPECLOSE = 1;
	public final static int DELTATIME = 750; // ms
	
	public final static int PINCHOPEN = 0;
	public final static int PINCHCLOSE = 1;
	public final static int WATCHTOPHONE = 2;
	public final static int PHONETOWATCH = 3;
	
	public final static int REGULAR = 0;
	public final static int DIM = 1;
	public final static int ANCHOR = 2;
	
	static int watchMode = REGULAR;
	static int phoneMode = REGULAR;

	static Email phone;
	static EmailExtension watch;
	
	static int crossState = REGULAR;
	
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
	
//	public static ArrayList<xacShape> selectedTweets;

	public static void initGestureManager() {
		watchGesture = new SyncGesture();
		phoneGesture = new SyncGesture();
//		selectedTweets = new ArrayList<xacShape>();
	}
	
	public static void setWatch(EmailExtension w) {
		watch = w;
	}
	
	public static void setPhone(Email p) {
		phone = p;
	}
	
	public static EmailExtension getWatch() {
		return watch;
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
			Log.d(LOGTAG, ""+dtGesture);
			return;
		}

		if (watchGesture.gesture == SWIPEOPEN
				&& phoneGesture.gesture == SWIPEOPEN) {
			Log.d(LOGTAG, "swipe open");
			updateOnCrossGesture(PINCHOPEN);
		} else if (watchGesture.gesture == SWIPECLOSE &&
				phoneGesture.gesture == SWIPECLOSE) {
			Log.d(LOGTAG, "swipe close");
			updateOnCrossGesture(PINCHCLOSE);
		} else if (watchGesture.gesture == SWIPEOPEN &&
				phoneGesture.gesture == SWIPECLOSE) {
			Log.d(LOGTAG, "phone->watch");
			updateOnCrossGesture(PHONETOWATCH);
		} else if (watchGesture.gesture == SWIPECLOSE &&
				phoneGesture.gesture == SWIPEOPEN) {
			Log.d(LOGTAG, "watch->phone");
			updateOnCrossGesture(WATCHTOPHONE);
		}
		
		updateWatchVisual();
		
		phoneGesture.gesture = NONE;
		watchGesture.gesture = NONE;
	}
	
	private static void updateOnCrossGesture(int crossGesture) {
		switch (crossGesture) {
		case PINCHOPEN:
			switch(crossState) {
			case DIM:
				setDim(false);
				break;
			case REGULAR:
				setAnchor(true);
				break;
			case ANCHOR:
				break;	
			}
			break;
		case PINCHCLOSE:
			switch(crossState) {
			case DIM:
				break;
			case REGULAR:
				setDim(true);
				break;
			case ANCHOR:
				setAnchor(false);
				break;	
			}
			break;
		case WATCHTOPHONE:
			switch(crossState) {
			case DIM:
				setDim(false);
				if(tweetContent != NONE) {
					setAnchor(true);
				}
				break;
			case REGULAR:
				setAnchor(true);
				break;
			case ANCHOR:
				setAnchor(true);
				break;	
			}
			break;
		case PHONETOWATCH:
			switch(crossState) {
			case DIM:
				break;
			case REGULAR:
				setDim(true);
				break;
			case ANCHOR:
				setAnchor(false);
				break;	
			}
			break;
		default:
			break;
		}
		
//		printCrossState();
	}
	
	public static void setDim(boolean toDim) {
		
	}
	
	public static void setAnchor(boolean toAnchor) {
	
	}
	
	public static void syncWatch(xacShape tweet) {
		if(watch == null) 
			return;
		
		switch(watchMode) {
		case REGULAR:
//			watch.setShapeColor(tweet.getPaint().getColor());
			break;
		case DIM:
			break;
		case ANCHOR:
			break;
		}
		
		updateWatchVisual();
	}
	
	public static void syncWatch() {
		if(watch == null) 
			return;
//		watch.fadeCanvas();
		updateWatchVisual();
	}
	
	private static void printCrossState() {
		switch(crossState) {
		case DIM:
			Log.d(LOGTAG, "phone dim");
			break;
		case REGULAR:
			Log.d(LOGTAG, "phone regular");
			break;
		case ANCHOR:
			Log.d(LOGTAG, "phone anchor");
			break;	
		}
	}
	
	private static void updateWatchVisual() {
		
	}
}
