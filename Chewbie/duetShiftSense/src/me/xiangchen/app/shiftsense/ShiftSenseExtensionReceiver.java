package me.xiangchen.app.shiftsense;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ShiftSenseExtensionReceiver extends BroadcastReceiver{
	@Override
	public void onReceive(Context context, final Intent intent) {
		intent.setClass(context, ShiftSenseExtensionService.class);
		context.startService(intent);
	}
}
