package me.xiangchen.app.rotatesense;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class RotateSenseExtensionReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, final Intent intent) {
		intent.setClass(context, RotateSenseExtensionService.class);
		context.startService(intent);
	}

}
