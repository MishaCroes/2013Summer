package me.xiangchen.app.tiltsense;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class TiltSenseExtensionReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, final Intent intent) {
		intent.setClass(context, TiltSenseExtensionService.class);
		context.startService(intent);
	}

}