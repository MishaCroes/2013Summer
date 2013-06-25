package me.xiangchen.app.authenticsense;

import me.xiangchen.ml.xacFeatureMaker;

public class AuthenticManager {

	public final static int INTHEWILD = 0;
	public final static int AUTHENTICATED = 1;
	public final static String[] classLabels = {"InTheWild", "Authenticated"};

	public final static int PHONEAUTHENDURATION = 250; // ms
	public final static int NUMROWPHONEAUTHEN = AuthenticSense.PHONEACCELFPS
			* PHONEAUTHENDURATION / 1000;

	public final static int AUTHENTICACTIONTIMEOUT = 1000;
	
	static int label = INTHEWILD;

	public static enum AuthenMode {
		USINGWATCH, USINGPHONE
	};

	static AuthenMode mode = AuthenMode.USINGWATCH;

	static boolean isRecognition = true;

	public static void toggleAuthenticMode() {
		mode = mode == AuthenMode.USINGWATCH ? AuthenMode.USINGPHONE
				: AuthenMode.USINGWATCH;
	}

	public static AuthenMode getMode() {
		return mode;
	}

	public static void toggleLabel() {
		label = label == INTHEWILD ? AUTHENTICATED : INTHEWILD;
		xacFeatureMaker.setLabel(label);
	}

//	public static void setLabel(int lb) {
//		label = lb;
//		
//	}

	public static int getLabel() {
		return label;
	}

	public static void toggleTrainingRecognition() {
		isRecognition = !isRecognition;
	}

	public static boolean isRecognition() {
		return isRecognition;
	}
	
	public static void initFeatureMaker() {
		xacFeatureMaker.setLabel(label);
		xacFeatureMaker.createFeatureTable();
	}
}
