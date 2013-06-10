package me.xiangchen.app.accelonwatch;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.sonyericsson.extras.liveware.extension.util.Dbg;

public class SampleExtensionReceiver extends BroadcastReceiver {

	public SampleExtensionReceiver() {
        Dbg.setLogTag(SampleExtensionService.LOG_TAG);
    }
	
    @Override
    public void onReceive(final Context context, final Intent intent) {
        Log.d(SampleExtensionService.LOG_TAG, "onReceive: " + intent.getAction());
        intent.setClass(context, SampleExtensionService.class);
        context.startService(intent);
    }
}
