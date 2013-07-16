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
	
	public static void nextAppExtension() {
		if(watch != null) {
			watch.nextAppExtension();
		}
	}
	
	public static void lastAppExtension() {
		if(watch != null) {
			watch.lastAppExtension();
		}
	}
	
	public static void nextItem() {
		if(watch != null) {
			watch.nextItem();
		}
	}
	
	public static void lastItem() {
		if(watch != null) {
			watch.lastItem();
		}
	}
}
