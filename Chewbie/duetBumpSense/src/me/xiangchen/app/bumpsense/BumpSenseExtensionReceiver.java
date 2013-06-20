package me.xiangchen.app.bumpsense;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BumpSenseExtensionReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(final Context context, final Intent intent) {
		intent.setClass(context, BumpSenseExtensionService.class);
		context.startService(intent);
	}

}
