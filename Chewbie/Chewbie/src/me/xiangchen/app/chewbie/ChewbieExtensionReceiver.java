package me.xiangchen.app.chewbie;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ChewbieExtensionReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		intent.setClass(context, ChewbieExtensionService.class);
		context.startService(intent);
	}

}
