package me.xiangchen.app.duetapp.map;

import me.xiangchen.app.duetapp.AppExtension;

import com.sonyericsson.extras.liveware.aef.control.Control;
import com.sonyericsson.extras.liveware.extension.util.control.ControlTouchEvent;

public class MapExtension extends AppExtension {

	public final static int WATCHACCELFPS = 10;
	public final static String LOGTAG = "ShiftSense";

	public MapExtension() {
		MapManager.setWatch(this);
	}
	
	@Override
	public void doResume() {
		showText("Map");
		mute();
	}

	@Override
	public void doTouch(ControlTouchEvent event) {
		int action = event.getAction();
		int width = getWidth();
		int height = getHeight();
		
		switch (action) {
		case Control.Intents.TOUCH_ACTION_PRESS:

			break;
		case Control.Intents.TOUCH_ACTION_RELEASE:
			float xRatio = (event.getX() - width / 2) * 1.0f / width;
			float yRatio = (event.getY() - height / 2) * 1.0f / height;
			MapManager.doSelection(xRatio, yRatio);
			break;
		}
	}
	
	@Override
	public void doSwipe(int direction) {
		float xStep = getWidth() / 10;
		float yStep = getHeight() / 10;
		switch(direction) {
		case Control.Intents.SWIPE_DIRECTION_LEFT:
			MapManager.doTranslation(-xStep, 0);
			break;
		case Control.Intents.SWIPE_DIRECTION_UP:
			MapManager.doTranslation(0, -yStep);
			break;
		case Control.Intents.SWIPE_DIRECTION_RIGHT:
			MapManager.doTranslation(xStep, 0);
			break;
		case Control.Intents.SWIPE_DIRECTION_DOWN:
			MapManager.doTranslation(0, yStep);
			break;
		}
	}
}
