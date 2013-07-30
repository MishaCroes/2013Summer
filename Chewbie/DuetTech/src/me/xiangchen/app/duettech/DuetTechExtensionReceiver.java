package me.xiangchen.app.duettech;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class DuetTechExtensionReceiver extends BroadcastReceiver{
	@Override
	public void onReceive(Context context, final Intent intent) {
		intent.setClass(context, DuetTechExtensionService.class);
		context.startService(intent);
	}
}
