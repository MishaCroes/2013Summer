package me.xiangchen.app.backsense;

import android.widget.Toast;
import me.xiangchen.ml.xacFeatureMaker;

public class BackManager {
	static BackSense phone = null;
	static BackSenseExtension watch = null;

	static boolean isRecognition = true;

	public static void setPhone(BackSense p) {
		phone = p;
	}

	public static void setWatch(BackSenseExtension w) {
		watch = w;
	}

	public static void toggleTrainingRecognition() {
		isRecognition = !isRecognition;
	}

	public static boolean isRecognition() {
		return isRecognition;
	}

	public static void toggleLabel() {
		if (watch != null) {
			watch.toggleLabel();
			if (watch.label >= 0) {
				Toast.makeText(phone, watch.classLabels[watch.label],
						Toast.LENGTH_SHORT).show();
			}
		}
	}

	public static void pan(int dir) {
		phone.pan(dir);
	}
	
	public static void zoom(int dir) {
		phone.zoom(dir);
	}
}
