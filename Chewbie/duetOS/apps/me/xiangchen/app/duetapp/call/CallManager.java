package me.xiangchen.app.duetapp.call;

import me.xiangchen.app.duetapp.AppManager;

public class CallManager extends AppManager {
	static Call phone;
	static CallExtension watch;
	
	public static void setPhone(Call p) {
		phone = p;
	}
	
	public static void setWatch(CallExtension w) {
		watch = w;
	}
	
	public static void playLastVoiceMail() {
		if(phone != null) {
			phone.playLastVoiceMail();
		}
	}
	
	public static void playNextVoiceMail() {
		if(phone != null) {
			phone.playNextVoiceMail();
		}
	}
}
