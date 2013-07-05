package me.xiangchen.app.backsense;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BackSenseExtensionReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, final Intent intent) {
		intent.setClass(context, BackSenseExtensionService.class);
		context.startService(intent);
	}

}
