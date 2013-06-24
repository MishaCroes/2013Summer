package me.xiangchen.app.sharesense;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ShareSenseExtensionReceiver extends BroadcastReceiver{
	@Override
	public void onReceive(Context context, final Intent intent) {
		intent.setClass(context, ShareSenseExtensionService.class);
		context.startService(intent);
	}
}
