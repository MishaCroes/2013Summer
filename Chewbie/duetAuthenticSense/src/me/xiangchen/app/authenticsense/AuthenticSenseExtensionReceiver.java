package me.xiangchen.app.authenticsense;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AuthenticSenseExtensionReceiver extends BroadcastReceiver{
	@Override
	public void onReceive(Context context, final Intent intent) {
		intent.setClass(context, AuthenticSenseExtensionService.class);
		context.startService(intent);
	}
}
