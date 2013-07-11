package me.xiangchen.app.duetapp.email;

import java.util.Calendar;

import me.xiangchen.app.duetapp.AppExtension;
import me.xiangchen.app.duetos.LauncherExtension;
import me.xiangchen.app.duetos.LauncherManager;
import me.xiangchen.app.duetos.R;
import me.xiangchen.technique.flipsense.xacFlipSenseFeatureMaker;
import me.xiangchen.technique.handsense.xacHandSenseFeatureMaker;
import me.xiangchen.technique.touchsense.xacTouchSenseFeatureMaker;
import me.xiangchen.ui.xacToast;
import android.content.Context;
import android.graphics.Bitmap;

import com.sonyericsson.extras.liveware.aef.control.Control;
import com.sonyericsson.extras.liveware.extension.util.control.ControlTouchEvent;

public class EmailExtension extends AppExtension {

	xacToast toast;
	
	public EmailExtension(Context context) {
		EmailManager.setWatch(this);
		
		toast = new xacToast(context);
		toast.setImage(R.drawable.email_small);
	}
	
	@Override
	public void doResume() {
		showText("Email");
	}
	
	@Override
	public void doAccelerometer(float[] values) {
		xacHandSenseFeatureMaker.updateWatchAccel(values);
		xacHandSenseFeatureMaker.addWatchFeatureEntry();
		
		xacTouchSenseFeatureMaker.updateWatchAccel(values);
		xacTouchSenseFeatureMaker.addWatchFeatureEntry();
		
		xacFlipSenseFeatureMaker.updateWatchAccel(values);
		xacFlipSenseFeatureMaker.addWatchFeatureEntry();
	}
	
	@Override
	public void doTouch(ControlTouchEvent event) {

		int action = event.getAction();

		switch (action) {
		case Control.Intents.TOUCH_ACTION_PRESS:

			break;
		case Control.Intents.TOUCH_ACTION_RELEASE:
			
			break;
		}
	}

	@Override
	public void doSwipe(int direction) {
		Calendar calendar = Calendar.getInstance();
		long curTime = calendar.getTimeInMillis();
		switch (direction) {
		case Control.Intents.SWIPE_DIRECTION_RIGHT:
			EmailManager.updateWatchGesture(
					EmailManager.SWIPECLOSE, curTime);
			break;
		case Control.Intents.SWIPE_DIRECTION_LEFT:
			EmailManager.updateWatchGesture(
					EmailManager.SWIPEOPEN, curTime);
			break;
		}
	}
	
	public void showNotification(int flag) {
		if(LauncherManager.getWatchMuteness() == true) {
			toast.setImage(R.drawable.mute_small);
		}
		else {
			toast.setImage(R.drawable.email_small);
		}
		
		if(flag > 0) {
			toast.fadeIn(null);
			Bitmap bitmap = toast.getBitmap();
			updateWatchVisual(bitmap, false);
			buzz(100);
			
		} else {
			toast.fadeOut();
			if(toast.getAlpha() <= xacToast.LOWALPHA * 2) {
				updateWatchVisual(null, false);
			}
		}
	}
}
