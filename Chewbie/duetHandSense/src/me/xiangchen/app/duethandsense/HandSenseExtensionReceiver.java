package me.xiangchen.app.duethandsense;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class HandSenseExtensionReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(final Context context, final Intent intent) {
		intent.setClass(context, HandSenseExtensionService.class);
		context.startService(intent);
	}

}
