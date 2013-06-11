package me.xiangchen.app.duettouchsense;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class TouchSenseExtensionReceiver extends BroadcastReceiver{

	 @Override
	    public void onReceive(final Context context, final Intent intent) {
	        intent.setClass(context, TouchSenseExtensionService.class);
	        context.startService(intent);
	    }
	
}
