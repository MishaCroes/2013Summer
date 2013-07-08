package me.xiangchen.app.duetapp.email;

import java.util.ArrayList;
import java.util.Hashtable;

import me.xiangchen.app.duetapp.App;
import me.xiangchen.app.duetos.LauncherManager;
import me.xiangchen.technique.flipsense.xacFlipSenseFeatureMaker;
import me.xiangchen.technique.handsense.xacHandSenseFeatureMaker;
import me.xiangchen.technique.touchsense.TouchSenseClassifier;
import me.xiangchen.technique.touchsense.xacTouchSenseFeatureMaker;
import me.xiangchen.ui.xacInteractiveCanvas;
import me.xiangchen.ui.xacShape;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
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
	public final static int NUMSTARTINGEMAILS = 12;
	public final static int TAPOFFSETTHRES = 50;

	final static int NUMROWSHANDPARTS = LauncherManager.PHONEACCELFPSGAME
			* xacTouchSenseFeatureMaker.TOUCHTIMEOUT / 1000;
	
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

	ArrayList<xacShape> hitEmails;
	
	int handPart;
	
	public Email(Context context) {
		super(context);
		color = xacInteractiveCanvas.fgColorRed;
		appLayout = new RelativeLayout(context);
		// appView = new xacInteractiveCanvas(context);
		// appView.setBackgroundColor(color);
		// appLayout.addView(appView);

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
//				if(appLayout.findViewById(openedEmail.getId()) == null) {
					doTouch(event);
//				}
				return true;
			}
		});
		
		htEmails = new Hashtable<xacShape, String>();
		for (int i = 0; i < NUMSTARTINGEMAILS; i++) {
			addEmail();
		}
		
		xacTouchSenseFeatureMaker.setLabel(xacTouchSenseFeatureMaker.UNKNOWN);
		xacTouchSenseFeatureMaker.createFeatureTable();
	}

	public void addEmail() {
		float cx = WIDTHAPP / 2;
		float cy = DIMMARGIN * (1 + cntEmail) + HEIGHTEMAIL * (cntEmail + 0.5f);
		xacShape emailEntry = canvas.addShape(xacShape.TEXTBOX, WIDTHEMAIL,
				HEIGHTEMAIL, cx, cy, xacInteractiveCanvas.fgColorCream);
		String textEmail = "Email No." + (cntEmail + 1);
		int lenPreview = Math.min(textEmail.length(), 128);
		emailEntry.setText(textEmail.substring(0, lenPreview));
		emailEntry.setTextColor(xacInteractiveCanvas.bgColorDark);

		htEmails.put(emailEntry, textEmail);
		
		cntEmail++;
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

		switch (action) {
		case MotionEvent.ACTION_DOWN:
			appLayout.removeView(openedEmail);
			hitEmails = canvas.getTouchedShapes(xCur, yCur);
			dTouchX = 0;
			dTouchY = 0;
			
			handPart = calculateHandPart(new double[] { event.getSize(0) });
			
			break;
		case MotionEvent.ACTION_MOVE:
			switch (handPart) {
			case xacTouchSenseFeatureMaker.PAD:
				float speedRatio = 0.75f;
				float dx = 0;
				float dy = (yCur - yPrev) * speedRatio;
				dScrollX += dx;

				if (dScrollY + (-dy) < 0) {
					dy *= 0.001f;
				}
				dScrollY += (-dy);
				// Log.d(LOGTAG, "scroll by " + dy);

				canvas.scrollContentsBy(dx, dy);
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
			if(Math.abs(dTouchX) < TAPOFFSETTHRES && Math.abs(dTouchY) < TAPOFFSETTHRES) {
				for(xacShape hitEmail : hitEmails) {
//					hitEmail.toggleStroke();
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
			}
			break;
		}

		xPrev = xCur;
		yPrev = yCur;
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

}
