package me.xiangchen.app.crosssense.tweetballs;

import java.util.ArrayList;
import java.util.Calendar;

import me.xiangchen.app.crosssense.CrossSenseExtension;
import me.xiangchen.ui.xacInteractiveCanvas;
import me.xiangchen.ui.xacShape;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.util.Log;
import android.widget.LinearLayout;

import com.sonyericsson.extras.liveware.aef.control.Control;
import com.sonyericsson.extras.liveware.extension.util.control.ControlTouchEvent;

public class CrossSenseTweetBallsExt {
	public final static String LOGTAG = "CrossSense";

	int width;
	int height;

	xacInteractiveCanvas canvas;
	ArrayList<xacShape> shapes = null;
	xacShape shape;
	Point prevCoord;

	LinearLayout layout;

	int crossState = CrossGestureManager.REGULAR;
	int prevState = crossState;

	public CrossSenseTweetBallsExt(CrossSenseExtension watch, Context context,
			int w, int h) {
		width = w;
		height = h;

		CrossGestureManager.setWatch(this);

		layout = new LinearLayout(context);
		canvas = new xacInteractiveCanvas(context);
		canvas.layout(0, 0, width, height);

		shape = canvas.addShape(xacShape.OVAL, width * 0.8f, height * 0.8f);
		shape.toggleStroke();
		shape.setStrokeWidth(3);
		layout.addView(canvas);
		
	}

	public void doResume() {
		// updateDisplay();
	}

	public void doTouch(ControlTouchEvent event) {

		int action = event.getAction();

		switch (action) {
		case Control.Intents.TOUCH_ACTION_PRESS:

			break;
		case Control.Intents.TOUCH_ACTION_RELEASE:
			if (canvas.getVeilOn()) {
				canvas.takeOffVeil();
				CrossGestureManager.tweetContent = CrossGestureManager.NONE;
				CrossGestureManager.selectedTweets.clear();
				
				crossState = prevState;
				prevState = CrossGestureManager.ANCHOR;
			} else {
				CrossGestureManager.selectedTweets = canvas.getTouchedShapes(event.getX(),
						event.getY());
				if (CrossGestureManager.selectedTweets.size() > 0) {
					xacShape selectedTweet = CrossGestureManager.selectedTweets.get(0);
//					CrossGestureManager.setSelectedTweet(selectedTweet);
					CrossGestureManager.tweetContent = selectedTweet.getPaint().getColor();
					canvas.putOnVeil(CrossGestureManager.tweetContent);
					
					prevState = crossState;
					crossState = CrossGestureManager.ANCHOR;
				}
			}
			break;
		}
	}

	public void doSwipe(int direction) {
		handleGestures(direction);
	}

	private void handleGestures(int direction) {
		Calendar calendar = Calendar.getInstance();
		long curTime = calendar.getTimeInMillis();
		switch (direction) {
		case Control.Intents.SWIPE_DIRECTION_RIGHT:
			CrossGestureManager.updateWatchGesture(
					CrossGestureManager.SWIPECLOSE, curTime);
			break;
		case Control.Intents.SWIPE_DIRECTION_LEFT:
			CrossGestureManager.updateWatchGesture(
					CrossGestureManager.SWIPEOPEN, curTime);
			break;
		}
	}

	public void setShapeColor(int color) {
		shape.setColor(color);
		// updateDisplay();
	}

	public void fadeCanvas() {
		canvas.fade(0.999f);
		// updateDisplay();
	}

	public void setDim(boolean toDim) {
//		switch (crossState) {
//		case CrossGestureManager.DIM:
			if (!toDim) {
				canvas.takeOffVeil();
				crossState = prevState;
				prevState = CrossGestureManager.DIM;
			} else {
//			break;
//		default:
//			if (toDim) {
				canvas.putOnVeil(Color.BLACK);
				prevState = crossState;
				crossState = CrossGestureManager.DIM;
//			}
//			break;
		}
	}
	
	public void setAnchor(boolean toAnchor) {
		if(toAnchor) {
			if (CrossGestureManager.selectedTweets.size() > 0) {
				if(crossState != CrossGestureManager.ANCHOR) {
					prevState = crossState;
					crossState = CrossGestureManager.ANCHOR;
				}
//				xacShape selectedTweet = CrossGestureManager.selectedTweets.get(0);
				canvas.putOnVeil(CrossGestureManager.tweetContent);
			}
		} else {
			crossState = prevState;
			prevState = CrossGestureManager.ANCHOR;
			
			canvas.takeOffVeil();
		}
	}

	public void updateOnCrossGesture(int crossGesture) {
		switch (crossGesture) {
		case CrossGestureManager.PINCHOPEN:
			switch(crossState) {
			case CrossGestureManager.DIM:
				setDim(false);
				break;
			case CrossGestureManager.REGULAR:
				setAnchor(true);
				break;
			case CrossGestureManager.ANCHOR:
				break;	
			}
			break;
		case CrossGestureManager.PINCHCLOSE:
			switch(crossState) {
			case CrossGestureManager.DIM:
				break;
			case CrossGestureManager.REGULAR:
				setDim(true);
				break;
			case CrossGestureManager.ANCHOR:
				setAnchor(false);
				break;	
			}
			break;
		case CrossGestureManager.WATCHTOPHONE:
			switch(crossState) {
			case CrossGestureManager.DIM:
				break;
			case CrossGestureManager.REGULAR:
				setDim(true);
				break;
			case CrossGestureManager.ANCHOR:
				setAnchor(false);
				break;	
			}
			break;
		case CrossGestureManager.PHONETOWATCH:
			switch(crossState) {
			case CrossGestureManager.DIM:
				setDim(false);
				if(CrossGestureManager.tweetContent != CrossGestureManager.NONE) {
					setAnchor(true);
				}
				break;
			case CrossGestureManager.REGULAR:
				setAnchor(true);
				break;
			case CrossGestureManager.ANCHOR:
				setAnchor(true);
				break;	
			}
			break;
		default:
			break;
		}
		
		printCrossState();
	}
	
	private void printCrossState() {
		switch(crossState) {
		case CrossGestureManager.DIM:
			Log.d(LOGTAG, "watch dim");
			break;
		case CrossGestureManager.REGULAR:
			Log.d(LOGTAG, "watch regular");
			break;
		case CrossGestureManager.ANCHOR:
			Log.d(LOGTAG, "watch anchor");
			break;	
		}
	}

	public void toggleDim() {
		if (canvas.getVeilOn()) {
			canvas.takeOffVeil();
		} else {
			canvas.putOnVeil(Color.BLACK);
		}
	}

	public Bitmap getUpdatedBitmap() {
		Bitmap bitmap = Bitmap.createBitmap(width, height,
				Bitmap.Config.ARGB_8888);
		Canvas renderCanvas = new Canvas(bitmap);
		renderCanvas.drawColor(xacInteractiveCanvas.bgColorLight);

		layout.draw(renderCanvas);

		return bitmap;
	}
}
