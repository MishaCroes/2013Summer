package me.xiangchen.app.duetapp.email;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.Random;

import me.xiangchen.app.duetapp.App;
import me.xiangchen.app.duetos.Launcher;
import me.xiangchen.app.duetos.LauncherManager;
import me.xiangchen.app.duetos.R;
import me.xiangchen.technique.flipsense.xacFlipSenseFeatureMaker;
import me.xiangchen.technique.handsense.xacHandSenseFeatureMaker;
import me.xiangchen.technique.touchsense.TouchSenseClassifier;
import me.xiangchen.technique.touchsense.xacTouchSenseFeatureMaker;
import me.xiangchen.ui.xacInteractiveCanvas;
import me.xiangchen.ui.xacShape;
import me.xiangchen.ui.xacToast;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.MotionEvent.PointerCoords;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Email extends App {

	public final static String LOGTAG = "DuetOS";
	public final static int WIDTHAPP = 1080;
	public final static int WIDTHEMAIL = 1024;
	public final static int DIMMARGIN = (WIDTHAPP - WIDTHEMAIL) / 2;
	public final static int HEIGHTEMAIL = 320;
	public final static int NUMSTARTINGEMAILS = 0;
	public final static int TAPOFFSETTHRES = 50;

	final static int NUMROWSHANDPARTS = LauncherManager.PHONEACCELFPSGAME
			* xacTouchSenseFeatureMaker.TOUCHTIMEOUT / 1000;
	private static final float APPWIDTH = 1080;
	
	public final static int EMAILFREQUENCY = 3;

	int cntEmail = 0;

	xacInteractiveCanvas canvas;
	LinearLayout openedEmail;
	LinearLayout.LayoutParams paramsOpened;
	TextView textViewEmail;

	Hashtable<xacShape, String> htEmails;

	float xPrev;
	float yPrev;

	float dScrollX = 0;
	float dScrollY = 0;

	float dTouchX;
	float dTouchY;

	float xTouchDown;
	float yTouchDown;

	ArrayList<xacShape> hitEmails;
	ArrayList<xacShape> allEmails;

	int handPart;
	
	int numTouch;
	
	Random random;
	
	xacToast toast;

	public Email(Context context) {
		super(context);
		color = xacInteractiveCanvas.fgColorRed;
		appLayout = new RelativeLayout(context);
		title = "Email";

		EmailManager.initGestureManager();
		EmailManager.setPhone(this);
		
		canvas = new xacInteractiveCanvas(context);
		canvas.setBackgroundColor(xacInteractiveCanvas.bgColorLight);

		openedEmail = new LinearLayout(context);
		openedEmail.setBackgroundColor(xacInteractiveCanvas.fgColorCream);
		textViewEmail = new TextView(context);
		textViewEmail.setTextSize(72);
		textViewEmail.setTextColor(xacInteractiveCanvas.bgColorDark);
		openedEmail.addView(textViewEmail);
		paramsOpened = new LinearLayout.LayoutParams(
				LinearLayout.LayoutParams.MATCH_PARENT,
				LinearLayout.LayoutParams.MATCH_PARENT);
		openedEmail.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				appLayout.removeView(openedEmail);
				return true;
			}
		});

		appLayout.addView(canvas);
		appLayout.setOnTouchListener(new View.OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				doTouch(event);
				return true;
			}
		});

		htEmails = new Hashtable<xacShape, String>();
		allEmails = new ArrayList<xacShape>();
		for (int i = 0; i < NUMSTARTINGEMAILS; i++) {
			addEmail();
			updateInboxVisual();
		}

		random = new Random();
		toast = new xacToast(context);
		toast.setImgSrc(R.drawable.email);
		
		xacTouchSenseFeatureMaker.setLabel(xacTouchSenseFeatureMaker.UNKNOWN);
		xacTouchSenseFeatureMaker.createFeatureTable();
	}
	
	@Override
	public void runOnUIThread() {
		if ((random.nextInt() + 97)
				% (Launcher.TIMERFPS * EMAILFREQUENCY) == 0) {
			addEmail();
			updateInboxVisual();
//			if(!toast.isDead()) {
//				toast.kill();
//			}
			LauncherManager.showNotification(toast);
			
			EmailExtension emailExt = EmailManager.getWatch(); 
			if(emailExt != null) {
				emailExt.showNotification(1);
			}
			
			canvas.invalidate();
		} else {
			toast.fadeOut();
			EmailManager.getWatch().showNotification(-1);
		}
		
	}

	public void addEmail() {
		
		xacShape emailEntry = canvas.addShape(xacShape.TEXTBOX, WIDTHEMAIL,
				HEIGHTEMAIL, 0, 0, xacInteractiveCanvas.fgColorCream);
		
		allEmails.add(emailEntry);
		String textEmail = "Email No." + allEmails.size();
		htEmails.put(emailEntry, textEmail);

		cntEmail++;
	}

	public void updateInboxVisual() {
		int numEmails = allEmails.size();
		for(int i=0; i<numEmails; i++) {
			float cx = WIDTHAPP / 2;
			float cy = DIMMARGIN * (1 + i) + HEIGHTEMAIL * (i + 0.5f);
			xacShape emailEntry = allEmails.get(numEmails - 1 - i);
			String textEmail = htEmails.get(emailEntry);
			int lenPreview = Math.min(textEmail.length(), 128);
			emailEntry.setText(textEmail.substring(0, lenPreview));
			emailEntry.setTextColor(xacInteractiveCanvas.bgColorDark);
			emailEntry.setPosition(cx, cy);
		}
	}
	
	@Override
	public void doAccelerometer(float values[]) {
		xacHandSenseFeatureMaker.updatePhoneAccel(values);
		xacHandSenseFeatureMaker.addPhoneFeatureEntry();

		xacTouchSenseFeatureMaker.updatePhoneAccel(values);
		xacTouchSenseFeatureMaker.addPhoneFeatureEntry();

		xacFlipSenseFeatureMaker.updatePhoneAccel(values);
		xacFlipSenseFeatureMaker.addPhoneFeatureEntry();
	}

	@SuppressLint("NewApi")
	@Override
	public void doTouch(MotionEvent event) {
		int action = event.getAction();
		PointerCoords coords = new PointerCoords();
		event.getPointerCoords(0, coords);
		float xCur = coords.x;
		float yCur = coords.y;

		Calendar calendar = Calendar.getInstance();
		long curTime = calendar.getTimeInMillis();
		
		switch (action) {
		case MotionEvent.ACTION_DOWN:
			appLayout.removeView(openedEmail);
			hitEmails = canvas.getTouchedShapes(xCur, yCur);
			dTouchX = 0;
			dTouchY = 0;

			handPart = calculateHandPart(new double[] { event.getSize(0) });
			
			xTouchDown = coords.x;
			yTouchDown = coords.y;

			break;
		case MotionEvent.ACTION_MOVE:
			switch (handPart) {
			case xacTouchSenseFeatureMaker.PAD:
				float speedRatio = 0.75f;
				float dy = (yCur - yPrev) * speedRatio;
				
				float dx = (xCur - xPrev) * 50;
				dy *= Math.max(0, 1 - Math.abs(dx) / APPWIDTH);

				if (dScrollY + (-dy) < 0) {
					dy *= 0.001f;
				}
				dScrollY += (-dy);
				// Log.d(LOGTAG, "scroll by " + dy);

				canvas.scrollContentsBy(0, dy);
				canvas.invalidate();
				dScrollY = Math.max(0, dScrollY);

				dTouchX += Math.abs(xCur - xPrev);
				dTouchY += Math.abs(yCur - yPrev);
				break;
			case xacTouchSenseFeatureMaker.SIDE:
				break;
			case xacTouchSenseFeatureMaker.KNUCKLE:

				break;
			}

			break;
		case MotionEvent.ACTION_UP:
			if (Math.abs(dTouchX) < TAPOFFSETTHRES
					&& Math.abs(dTouchY) < TAPOFFSETTHRES) {
				for (xacShape hitEmail : hitEmails) {
					// hitEmail.toggleStroke();
					switch (handPart) {
					case xacTouchSenseFeatureMaker.PAD:
						String textEmail = htEmails.get(hitEmail);
						textViewEmail.setText(textEmail);
						appLayout.addView(openedEmail, paramsOpened);
						break;
					case xacTouchSenseFeatureMaker.SIDE:
						break;
					case xacTouchSenseFeatureMaker.KNUCKLE:
						hitEmail.toggleStroke(20);
						canvas.invalidate();
						break;
					}
				}
			} else {
				if (coords.x < xTouchDown && coords.y > yTouchDown) {
					// Log.d(LOGTAG, "swipe close");
					EmailManager.updatePhoneGesture(
							EmailManager.SWIPECLOSE, curTime);
				} else if (coords.x > xTouchDown && coords.y < yTouchDown) {
					// Log.d(LOGTAG, "swipe open");
					EmailManager.updatePhoneGesture(
							EmailManager.SWIPEOPEN, curTime);
				}
			}
			break;
		}

		xPrev = xCur;
		yPrev = yCur;
	}

	@SuppressLint("NewApi")
	private void doDualTouch(MotionEvent event) {
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
		case MotionEvent.ACTION_MOVE:
			break;
		case MotionEvent.ACTION_UP:
			if (coords.x < xTouchDown && coords.y > yTouchDown) {
				// Log.d(LOGTAG, "swipe close");
				EmailManager.updatePhoneGesture(
						EmailManager.SWIPECLOSE, curTime);
			} else if (coords.x > xTouchDown && coords.y < yTouchDown) {
				// Log.d(LOGTAG, "swipe open");
				EmailManager.updatePhoneGesture(
						EmailManager.SWIPEOPEN, curTime);
			}
			numTouch = 1;
			break;
		}
	}

	private int calculateHandPart(double[] extras) {
		int label = xacTouchSenseFeatureMaker.UNKNOWN;

		Object[] features = xacTouchSenseFeatureMaker.getFlattenedData(
				NUMROWSHANDPARTS, extras);
		int idxClass = -1;
		try {
			idxClass = (int) TouchSenseClassifier.classify(features);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		switch (idxClass) {
		case 0:
			label = xacTouchSenseFeatureMaker.PAD;
			// Log.d(LOGTAG, "pad");
			break;
		case 1:
			label = xacTouchSenseFeatureMaker.SIDE;
			// Log.d(LOGTAG, "side");
			break;
		case 2:
			label = xacTouchSenseFeatureMaker.KNUCKLE;
			// Log.d(LOGTAG, "knuckle");
			break;
		}

		return label;
	}
	
	public void setMute() {
		
	}

}
