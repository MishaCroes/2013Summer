package me.xiangchen.app.crosssense;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class CrossSenseExtensionReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, final Intent intent) {
		intent.setClass(context, CrossSenseExtensionService.class);
		context.startService(intent);
	}

}
