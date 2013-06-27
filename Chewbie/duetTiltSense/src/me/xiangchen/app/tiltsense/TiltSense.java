package me.xiangchen.app.tiltsense;

import java.util.Calendar;

import me.xiangchen.ml.xacFeatureMaker;
import me.xiangchen.ui.xacMapView;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.MotionEvent.PointerCoords;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

public class TiltSense extends FragmentActivity {

	enum InteractionMode {
		NONE, TOUCHPAN, TOUCHZOOM, WATCHZOOM
	};

	final static float DEFAULTPANRATE = 0.00004f;
	final static float DEFAULTZOOMRATE = 0.01f;
	final static int MINPANFOOTSTEP = 5;
	final static int MINZOOMFOOTSTEP = 384;
	final static int DEFAULTZOOMLEVEL = 15;
	final static int MINZOOMLEVEL = 0;
	final static int MAXZOOMLEVEL = 19;
	final static String LOGTAG = "TiltSense";
	final static double LATADSK = 43.651432;
	final static double LNGADSK = -79.369551;
	final static int PINCHSTARTTIME = 150; // ms
	final static int WATCHZOOMSTARTTIME = 500;
	final static int MAXWATCHZOOMFOOTSTEP = 32;
	final static float WATCHZOOMRATE = 0.1f;
	

	private GoogleMap map;
	RelativeLayout layout;
	SupportMapFragment fragment;

	xacMapView mapView;

	long timeTouchBegan;
	float xTouchPrev;
	float yTouchPrev;
	float maxScrollSpeed = 0;
	float flickThreshold = 300;

	double latCenter;
	double lngCenter;

	float panRate = DEFAULTPANRATE;
	int maxTimesPanning = 25;
	int counterPanning = 0;

	InteractionMode mode;
	int zoomLevel = DEFAULTZOOMLEVEL;
	float zoomRate = DEFAULTZOOMRATE;
	double pinchDistBegan = -1;
	double zoomWearoutFactor = 0.50;
	int zoomLevelBegan = DEFAULTZOOMLEVEL;
	
	float watchZoomLevel = DEFAULTZOOMLEVEL;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Remove title bar
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		// Remove notification bar
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.activity_tilt_sense);
		
		TiltManager.setPhone(this);

		latCenter = LATADSK;
		lngCenter = LNGADSK;
		map = ((SupportMapFragment) getSupportFragmentManager()
				.findFragmentById(R.id.map)).getMap();
		map.setMyLocationEnabled(true);
		panMap(map, latCenter, lngCenter, (int) zoomLevel);

		mode = InteractionMode.NONE;

		layout = (RelativeLayout) findViewById(R.id.layout);

		LinearLayout touchLayer = new LinearLayout(this);
		touchLayer.setBackgroundColor(Color.TRANSPARENT);
		LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
				LinearLayout.LayoutParams.MATCH_PARENT,
				LinearLayout.LayoutParams.MATCH_PARENT);

		touchLayer.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				int numTouches = event.getPointerCount();
				doTouchZoom(event);
				if (numTouches == 1) {
					doTouchPan(event);
				}
				panMap(map, latCenter, lngCenter, zoomLevel);
				return true;
			}
		});

		layout.addView(touchLayer, params);

	}

	@SuppressLint("NewApi")
	private void doTouchZoom(MotionEvent event) {
		int numTouches = event.getPointerCount();

		int action = event.getAction();
		switch (action) {
		case MotionEvent.ACTION_DOWN:
			pinchDistBegan = -1;
			break;
		case MotionEvent.ACTION_MOVE:
			if (numTouches == 2) {
				mode = InteractionMode.TOUCHZOOM;
				PointerCoords tchPnt1 = new PointerCoords();
				event.getPointerCoords(0, tchPnt1);
				PointerCoords tchPnt2 = new PointerCoords();
				event.getPointerCoords(1, tchPnt2);

				double pinchDist = Math.sqrt((tchPnt1.x - tchPnt2.x)
						* (tchPnt1.x - tchPnt2.x) + (tchPnt1.y - tchPnt2.y)
						* (tchPnt1.y - tchPnt2.y));
				if (pinchDistBegan >= 0) {
					int pinchOffset = (int) (pinchDist - pinchDistBegan);
					zoomLevel = zoomLevelBegan + pinchOffset / MINZOOMFOOTSTEP;
					// Log.d(LOGTAG, "zoom level: " + (int) zoomLevel);
				} else {
					pinchDistBegan = pinchDist;
					zoomLevelBegan = zoomLevel;
				}
				
				watchZoomLevel = zoomLevel;
			}

			break;
		case MotionEvent.ACTION_UP:
			// pinchDistBegan = -1;
			break;
		}
	}

	@SuppressLint("NewApi")
	private void doTouchPan(MotionEvent event) {

		PointerCoords tchPnt1 = new PointerCoords();
		event.getPointerCoords(0, tchPnt1);
		float x = tchPnt1.x;
		float y = tchPnt1.y;

	
		Calendar lCDateTime = Calendar.getInstance();
		long curTime = lCDateTime.getTimeInMillis();

		int action = event.getAction();
		switch (action) {
		case MotionEvent.ACTION_DOWN:
			TiltManager.stopTiltInput();
			xTouchPrev = x;
			yTouchPrev = y;
			timeTouchBegan = curTime;
			maxScrollSpeed = 0;
			panRate = DEFAULTPANRATE;

			mode = InteractionMode.TOUCHPAN;
			// counterPanning = 0;
			break;
		case MotionEvent.ACTION_MOVE:
			double dx = x - xTouchPrev;
			double dy = y - yTouchPrev;
			float offset = (float) Math.sqrt(dx * dx + dy * dy);
			maxScrollSpeed = Math.max(offset, maxScrollSpeed);
//			Log.d(LOGTAG, ""+maxScrollSpeed);
			if (mode != InteractionMode.WATCHZOOM && maxScrollSpeed < MAXWATCHZOOMFOOTSTEP
					&& curTime - timeTouchBegan > WATCHZOOMSTARTTIME) {
				mode = InteractionMode.WATCHZOOM;
				watchZoomLevel = zoomLevel;
				TiltManager.startTiltInput();
			} else if (mode == InteractionMode.TOUCHPAN
					&& offset > MINPANFOOTSTEP
					&& curTime - timeTouchBegan > PINCHSTARTTIME) {

				float zoomFactor = (MAXZOOMLEVEL - zoomLevel + 1.0f)
						/ (MAXZOOMLEVEL - MINZOOMLEVEL);
				float flickFactor = 1.0f; // offset / flickThreshold;
				latCenter += flickFactor * panRate * zoomFactor * dy;
				lngCenter -= flickFactor * panRate * zoomFactor * dx;
			}
			xTouchPrev = x;
			yTouchPrev = y;
			break;
		case MotionEvent.ACTION_UP:
			// Log.d(LOGTAG, maxScrollSpeed+"");
			TiltManager.stopTiltInput();
			if (maxScrollSpeed > flickThreshold) {
				Log.d(LOGTAG, "flick!");

			}
			break;
		}
	}

	public void doWatchZoom(int sign) {
		watchZoomLevel += sign * WATCHZOOMRATE;
		zoomLevel = (int)watchZoomLevel;
		panMap(map, latCenter, lngCenter, zoomLevel);
	}
	
	private void panMap(GoogleMap map, double lat, double lng, int zoomLevel) {
		CameraUpdate center = CameraUpdateFactory
				.newLatLng(new LatLng(lat, lng));
		CameraUpdate zoom = CameraUpdateFactory.zoomTo(zoomLevel);
		map.moveCamera(center);
		map.animateCamera(zoom);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tilt_sense, menu);
		return true;
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		switch (keyCode) {
		case KeyEvent.KEYCODE_VOLUME_UP:
			TiltManager.toggleRecognition();
			break;
		case KeyEvent.KEYCODE_VOLUME_DOWN:
			TiltManager.toggleLabel();
			break;
		}

		return true;
	}

}
