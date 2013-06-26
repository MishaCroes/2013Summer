package me.xiangchen.ui;

import java.util.Calendar;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.MotionEvent;
import android.view.MotionEvent.PointerCoords;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;

public class xacMap {

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

	enum InteractionMode {
		NONE, TOUCHPAN, TOUCHZOOM
	};

	InteractionMode mode;

	GoogleMap map;

	double latCenter;
	double lngCenter;

	long timeTouchBegan;
	float xTouchPrev;
	float yTouchPrev;
	float maxScrollSpeed = 0;
	float flickThreshold = 300;

	float panRate = DEFAULTPANRATE;
	int maxTimesPanning = 25;
	int counterPanning = 0;

	int zoomLevel = DEFAULTZOOMLEVEL;
	float zoomRate = DEFAULTZOOMRATE;
	double pinchDistBegan;
	double zoomWearoutFactor = 0.50;
	int zoomLevelBegan = DEFAULTZOOMLEVEL;

	public xacMap(GoogleMap map) {
		
		if(map == null) return;
		
		this.map = map;
		map.setMyLocationEnabled(true);
		mode = InteractionMode.NONE;
		
		latCenter = LATADSK;
		lngCenter = LNGADSK;
		
		updateMap(this.map, latCenter, lngCenter, (int)zoomLevel);
	}

	@SuppressLint("NewApi")
	public void doTouchZoom(MotionEvent event) {
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
			}

			break;
		case MotionEvent.ACTION_UP:
			// pinchDistBegan = -1;
			break;
		}
	}

	@SuppressLint("NewApi")
	public void doTouchPan(MotionEvent event) {

		PointerCoords tchPnt1 = new PointerCoords();
		event.getPointerCoords(0, tchPnt1);
		float x = tchPnt1.x;
		float y = tchPnt1.y;

		Calendar lCDateTime = Calendar.getInstance();
		long curTime = lCDateTime.getTimeInMillis();

		int action = event.getAction();
		switch (action) {
		case MotionEvent.ACTION_DOWN:
			// TiltManager.stopTiltInput();
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
			// Log.d(LOGTAG, ""+maxScrollSpeed);

			float zoomFactor = (MAXZOOMLEVEL - zoomLevel + 1.0f)
					/ (MAXZOOMLEVEL - MINZOOMLEVEL);
			float flickFactor = 1.0f; // offset / flickThreshold;
			latCenter += flickFactor * panRate * zoomFactor * dy;
			lngCenter -= flickFactor * panRate * zoomFactor * dx;

			xTouchPrev = x;
			yTouchPrev = y;
			break;
		case MotionEvent.ACTION_UP:
			// Log.d(LOGTAG, maxScrollSpeed+"");
			// TiltManager.stopTiltInput();
			if (maxScrollSpeed > flickThreshold) {
				Log.d(LOGTAG, "flick!");

			}
			break;
		}
	}
	
	public void doPan(float dx, float dy) {
		latCenter += dy;
		lngCenter += dx;
		updateMap();
	}
	
	public void updateMap() {
		updateMap(this.map, latCenter, lngCenter, (int)zoomLevel);
	}
	
	private void updateMap(GoogleMap map, double lat, double lng, int zoomLevel) {
		CameraUpdate center = CameraUpdateFactory
				.newLatLng(new LatLng(lat, lng));
		CameraUpdate zoom = CameraUpdateFactory.zoomTo(zoomLevel);
		map.moveCamera(center);
		map.animateCamera(zoom);
	}
}
