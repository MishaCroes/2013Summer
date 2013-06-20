package me.xiangchen.app.flipsense;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class FlipSenseExtensionReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(final Context context, final Intent intent) {
		intent.setClass(context, FlipSenseExtensionService.class);
		context.startService(intent);
	}

}