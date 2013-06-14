package me.xiangchen.app.bumpsense;

import me.xiangchen.app.bumpsense.BumpSense.AppMode;
import android.graphics.Color;
import android.util.Log;

public class BumpManager {

	final public static String LOGTAG = "BumpSense";
	
	final public static int INIT = -1;
	
	final public static int BUMP = 0;
	final public static int NOBUMP = 1;
	
	final public static int UNKNOWN = -1;
	final public static int NORTH = 0;
	final public static int WEST = 1;
	final public static int SOUTH = 2;
	final public static int EAST = 3;
	
	static BumpSense bumpSense;
	static BumpSenseExtension bumpSenseExtension;
	
	public static void setBumpSense(BumpSense bs) {
		bumpSense = bs;
	}
	
	public static void setBumpSenseExtension(BumpSenseExtension bse) {
		bumpSenseExtension = bse;
	}
	
	public static void syncDevices() {
		if(bumpSenseExtension == null) {
			return;
		}
		
		if (bumpSense.appMode == AppMode.TRAINBUMPDIRECTION) {
			int labelWatch = UNKNOWN;
			labelWatch = bumpSense.label == UNKNOWN ? UNKNOWN
					: bumpSense.label == NORTH ? SOUTH
							: bumpSense.label == SOUTH ? NORTH
									: bumpSense.label == EAST ? WEST : EAST;
			if (bumpSenseExtension != null) {
				bumpSenseExtension.setActive(labelWatch);
			}
		}
		else if(bumpSense.appMode == AppMode.TRAINBUMPTRIGGER) {
			
		}
		else {
			bumpSenseExtension.red = bumpSense.red;	
//			bumpSenseExtension.setActive(UNKNOWN);
		}
		
		bumpSenseExtension.updateVisual();
	}
	
	public static void updatePhoneAccel(float[] values) {
		
		
//		Log.d(LOGTAG, String.format("%.3f", sum));
	}
}
