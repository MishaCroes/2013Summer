package me.xiangchen.app.duetos;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class LauncherExtensionReceiver extends BroadcastReceiver {
	@Override
	public void onReceive(Context context, final Intent intent) {
		intent.setClass(context, LauncherExtensionService.class);
		context.startService(intent);
	}
}
