package me.xiangchen.app.crosssense;

import java.util.ArrayList;

import me.xiangchen.app.crosssense.oneball.CrossSenseOneBallExt;
import me.xiangchen.app.crosssense.tweetballs.CrossSenseTweetBallsExt;
import me.xiangchen.ui.xacInteractiveCanvas;
import me.xiangchen.ui.xacShape;
import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;

import com.sonyericsson.extras.liveware.aef.control.Control;
import com.sonyericsson.extras.liveware.extension.util.R;
import com.sonyericsson.extras.liveware.extension.util.control.ControlExtension;
import com.sonyericsson.extras.liveware.extension.util.control.ControlTouchEvent;

public class CrossSenseExtension extends ControlExtension {

	public final static int ONEBALL = 0;
	public final static int TWEETBALLS = 1;
	int crossExt = ONEBALL;
	
	int width;
	int height;
	
	LinearLayout layout;	
	xacInteractiveCanvas canvas;
	
	ArrayList<xacShape> shapes = null;
	Point prevCoord;
	
	CrossSenseOneBallExt oneBallExt = null;
	CrossSenseTweetBallsExt tweetBallExt = null;
	
	public CrossSenseExtension(Context context, String hostAppPackageName) {
		super(context, hostAppPackageName);
		CrossAppManager.setWatch(this);
		
		width = getSupportedControlWidth(context);
		height = getSupportedControlHeight(context);
		
		oneBallExt = new CrossSenseOneBallExt(this, context, width, height);
		tweetBallExt = new CrossSenseTweetBallsExt(this, context, width, height);
	}
	
	@Override
    public void onResume() {
		setScreenState(Control.Intents.SCREEN_STATE_ON);
		CrossAppManager.updateExtension();
		
		switch(crossExt) {
		case ONEBALL:
			oneBallExt.doResume();
			break;
		case TWEETBALLS:
			tweetBallExt.doResume();
			break;
		}
		
	}
	
	@Override
    public void onTouch(final ControlTouchEvent event) {
		switch(crossExt) {
		case ONEBALL:
			oneBallExt.doTouch(event);
			break;
		case TWEETBALLS:
			tweetBallExt.doTouch(event);
			break;
		}
		
		updateVisuals();
	}
	
	@Override
	public void onSwipe(int direction) {
		switch(crossExt) {
		case ONEBALL:
			
			break;
		case TWEETBALLS:
			tweetBallExt.doSwipe(direction);
			break;
		}
	}
	
	public void updateVisuals() {
		switch(crossExt) {
		case ONEBALL:
			showBitmap(oneBallExt.getUpdatedBitmap());
			break;
		case TWEETBALLS:
			showBitmap(tweetBallExt.getUpdatedBitmap());
			break;
		}
		
	}
	
	public static int getSupportedControlWidth(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.smart_watch_control_width);
    }


    public static int getSupportedControlHeight(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.smart_watch_control_height);
    }

}
 