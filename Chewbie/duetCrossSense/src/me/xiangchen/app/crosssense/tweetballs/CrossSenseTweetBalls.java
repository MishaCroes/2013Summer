package me.xiangchen.app.crosssense.tweetballs;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import me.xiangchen.ui.xacInteractiveCanvas;
import me.xiangchen.ui.xacShape;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.MotionEvent.PointerCoords;
import android.view.View;
import android.view.ViewGroup;

@SuppressLint({ "ValidFragment", "NewApi" })
public class CrossSenseTweetBalls extends Fragment implements
		SensorEventListener {

	public final static int TAPTHRSDIST = 50;
	public final static String LOGTAG = "CrossSense";
	public final static int TIMERFPS = 30;
	public final static int TWEETFREQUENCHY = 2; // avg. one tweet every 3 sec
	int width;
	int height;

	xacInteractiveCanvas canvas;
	ArrayList<xacShape> shapes = null;
	PointerCoords prevCoord;

	Timer timer;
	FragmentActivity activity;

	Random random;

	float xTouchDown;
	float yTouchDown;

//	ArrayList<xacShape> selectedTweets;

	int crossState = CrossGestureManager.REGULAR;
	int prevState = crossState;

	public CrossSenseTweetBalls(FragmentActivity a, int w, int h) {
		activity = a;
		width = w;
		height = h;
		random = new Random();

		CrossGestureManager.setPhone(this);
		CrossGestureManager.initGestureManager();

//		selectedTweets = new ArrayList<xacShape>();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		canvas = new xacInteractiveCanvas(container.getContext());

		initTimer();

		canvas.setOnTouchListener(new View.OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch(crossState) {
				case CrossGestureManager.DIM:
					break;
				case CrossGestureManager.REGULAR:
					if(handleObjects(event)) {
						prevState = crossState;
						crossState = CrossGestureManager.ANCHOR;
					}
					break;
				case CrossGestureManager.ANCHOR:
					if(handleObjects(event)) {
						crossState = prevState;
						prevState = CrossGestureManager.ANCHOR;
					}
					break;
				}
				
				handleGestures(event);
				
//				printCrossState();
				return true;
			}
		});

		return canvas;
	}

	private void initTimer() {
		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				activity.runOnUiThread(new Runnable() {

					@Override
					public void run() {
						if ((random.nextInt() + 97)
								% (TIMERFPS * TWEETFREQUENCHY) == 0) {
							CrossGestureManager.syncWatch(tweetBalls());
						}
						canvas.fade(0.999f);
						canvas.invalidate();
					}
				});
			}
		}, new Date(), 1000 / TIMERFPS);
	}

	private xacShape tweetBalls() {
		// Log.d(LOGTAG, "Ball!");
		int dimPhone = 192;
		int bigNum = 1000;
		int cx = (int) (dimPhone + random.nextInt(bigNum)
				* (width * 0.9f - dimPhone) / bigNum);
		int cy = (int) (dimPhone + random.nextInt(bigNum)
				* (height * 0.8f - dimPhone) / bigNum);
		int color = Color.argb(255, random.nextInt(255), random.nextInt(255),
				random.nextInt(255));
		xacShape tweet = canvas.addShape(xacShape.OVAL, dimPhone, dimPhone, cx,
				cy, color);
		canvas.highLight();
		return tweet;
	}

	private void handleGestures(MotionEvent event) {
		int action = event.getAction();
		PointerCoords coords = new PointerCoords();
		event.getPointerCoords(0, coords);

		Calendar calendar = Calendar.getInstance();
		long curTime = calendar.getTimeInMillis();

		switch (action) {
		case MotionEvent.ACTION_DOWN:
			xTouchDown = coords.x;
			yTouchDown = coords.y;
			break;
		// case MotionEvent.ACTION_MOVE:
		// break;
		case MotionEvent.ACTION_UP:
			if (coords.x < xTouchDown && coords.y > yTouchDown) {
				// Log.d(LOGTAG, "swipe close");
				CrossGestureManager.updatePhoneGesture(
						CrossGestureManager.SWIPECLOSE, curTime);
			} else if (coords.x > xTouchDown && coords.y < yTouchDown) {
				// Log.d(LOGTAG, "swipe open");
				CrossGestureManager.updatePhoneGesture(
						CrossGestureManager.SWIPEOPEN, curTime);
			}
			break;
		}
	}

	private boolean handleObjects(MotionEvent event) {
		int action = event.getAction();
		PointerCoords coords = new PointerCoords();
		event.getPointerCoords(0, coords);

		switch (action) {
		 case MotionEvent.ACTION_DOWN:
		 xTouchDown = coords.x;
		 yTouchDown = coords.y;
		 break;
		 case MotionEvent.ACTION_MOVE:
		 break;
		case MotionEvent.ACTION_UP:
			
			if(Math.abs(coords.x - xTouchDown) > TAPTHRSDIST ||
					Math.abs(coords.y - yTouchDown) > TAPTHRSDIST) {
				return false;
			}
			
			if (canvas.getVeilOn()) {
				canvas.takeOffVeil();
				CrossGestureManager.tweetContent = CrossGestureManager.NONE;
				CrossGestureManager.selectedTweets.clear();
				return true;
			} else {
				CrossGestureManager.selectedTweets = canvas.getTouchedShapes(coords.x, coords.y);
				if (CrossGestureManager.selectedTweets.size() > 0) {
					xacShape selectedTweet = CrossGestureManager.selectedTweets.get(0);
//					CrossGestureManager.setSelectedTweet(selectedTweet);
					CrossGestureManager.tweetContent = selectedTweet.getPaint().getColor();
					canvas.putOnVeil(CrossGestureManager.tweetContent);

					return true;
				}
			}
			break;
		}

		return false;
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
		case CrossGestureManager.PHONETOWATCH:
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
		default:
			break;
		}
		
		printCrossState();
	}

	public void toggleDim() {
		if (canvas.getVeilOn()) {
			canvas.takeOffVeil();
		} else {
			canvas.putOnVeil(Color.BLACK);
		}
	}
	
	private void printCrossState() {
		switch(crossState) {
		case CrossGestureManager.DIM:
			Log.d(LOGTAG, "phone dim");
			break;
		case CrossGestureManager.REGULAR:
			Log.d(LOGTAG, "phone regular");
			break;
		case CrossGestureManager.ANCHOR:
			Log.d(LOGTAG, "phone anchor");
			break;	
		}
	}

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		// TODO Auto-generated method stub

	}
}
