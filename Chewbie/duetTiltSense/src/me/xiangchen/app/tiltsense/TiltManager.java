package me.xiangchen.app.tiltsense;

import android.util.Log;
import android.widget.Toast;

public class TiltManager {
	final static String LOGTAG = "TiltSense";
	
	private static TiltSense phone;
	private static TiltSenseExtension watch;
	
	public static void setPhone(TiltSense p) {
		phone = p;
	}
	
	public static void setWatch(TiltSenseExtension w) {
		watch = w;
	}
	
	public static void startTiltInput() {
		if(watch != null) {
			watch.isTiltInputOn = true;
			watch.buzz();
		}
	}
	
	public static void stopTiltInput() {
		if(watch != null) {
			watch.isTiltInputOn = false;
		}
	}
	
	public static void toggleRecognition() {
		watch.isRecognition = !watch.isRecognition;
		if(watch.isRecognition) {
			Toast.makeText(phone, "Recognition mode", Toast.LENGTH_SHORT).show();
		} else {
			Toast.makeText(phone, "Training mode", Toast.LENGTH_SHORT).show();
		}
	}
	
	public static void toggleLabel() {
		watch.toggleLabel();
		Toast.makeText(phone, TiltSenseExtension.classLabels[watch.label], Toast.LENGTH_SHORT).show();
	}
	
	public static void updateWatchGesture(int label, float value) {
//		Toast.makeText(phone, watch.classLabels[watch.label], Toast.LENGTH_SHORT).show();
//		Log.d(LOGTAG, watch.classLabels[watch.label]);

//		float offset = 3.0f;
//		value += offset;
		
		if(value < 0) return;
		
		if(label == TiltSenseExtension.TILTIN) {
			phone.doWatchZoom(-1.5f / value);
//			Log.d(LOGTAG, -balanceFactor / value + " tilt in");
		} else if (label == TiltSenseExtension.TILTOUT) {
			
			float maxTiltOut = 1.0f;
			value = Math.min(maxTiltOut, value);
			
			phone.doWatchZoom(0.5f / (maxTiltOut - value));
//			Log.d(LOGTAG, value / balanceFactor + " - tilt out");
		}
	}
}
