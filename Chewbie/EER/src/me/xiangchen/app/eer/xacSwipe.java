package me.xiangchen.app.eer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import android.annotation.SuppressLint;
import android.graphics.Point;
import android.util.Log;

@SuppressLint("NewApi")
public class xacSwipe implements Cloneable{

	/*
	 * some constants
	 */
	final float EPS       =0.0001f;
	final float THETA     =0.78539816339f;	// pi/4
	final int TAPWIDTH    =1;

	final int UNKNOWN     =-1;
	
	final String LOGTAG = "EER";

	final static int NORTH       =0;
	final static int NORTHEAST   =1;
	final static int EAST        =2;
	final static int SOUTHEAST   =3;
	final static int SOUTH       =4;
	final static int SOUTHWEST   =5;
	final static int WEST        =6;
	final static int NORTHWEST   =7;
	final static int CENTER      =8;
	
	Hashtable<String, xacTouch> touchPoints;
	long timeStamp;
	int gesture;
	
	public xacSwipe() {
		touchPoints = new Hashtable<String, xacTouch>();
	}
	
	public void addTouchPoint(int x, int y, String key) {
		xacTouch touch = new xacTouch();
		Point point = new Point();
		point.set(x, y);
		touch.setStart(point);
		touchPoints.put(key, touch);
	}
	
	public void endTouchPoint(int x, int y, String key) {
		xacTouch touch = touchPoints.get(key);
		Point point = new Point();
		point.set(x, y);
		touch.setEnd(point);
	}
	
	@SuppressWarnings("rawtypes")
	@SuppressLint("UseValueOf")
	public int getGesture() {
		gesture = UNKNOWN;
//		Hashtable<String, Integer> strokes = new Hashtable<String, Integer>();
		ArrayList<Integer> strokes = new ArrayList<Integer>();
		
		Iterator<Entry<String, xacTouch>>  it;
		Map.Entry entry;

		it = touchPoints.entrySet().iterator();
		while(it.hasNext()) {
			entry = it.next();
			xacTouch touch = (xacTouch) entry.getValue();
			Point offset = touch.getOffset();
			//System.out.println(strKey + ": " + tchPnt.x + ", " + tchPnt.y);
			
			int stroke = UNKNOWN;
			float x = offset.x;
			float y = -offset.y;
			
			if(Math.max(Math.abs(x), Math.abs(y)) < TAPWIDTH) {
	            stroke = CENTER;
	        }
	        else if(y / Math.tan(THETA * 5 / 2) < x && x < y / Math.tan(THETA * 3 / 2)) {
	            stroke = NORTH;
	        }
	        else if(y < Math.tan(THETA * 3 / 2) * x && y > Math.tan(THETA * 1 / 2) * x) {
	            stroke = NORTHEAST;
	        }
	        else if(y < Math.tan(THETA * 1 / 2) * x && y > Math.tan(-THETA * 1 / 2) * x) {
	            stroke = EAST;
	        }
	        else if(y < Math.tan(THETA * -1 / 2) * x && y > Math.tan(THETA * -3 / 2) * x) {
	            stroke = SOUTHEAST;
	        }
	        else if(y / Math.tan(THETA * -5 / 2) < x && x < y / Math.tan(THETA * -3 / 2)) {
	            stroke = SOUTH;
	        }
	        else if(y < Math.tan(THETA * -7 / 2) * x && y > Math.tan(THETA * -5 / 2) * x) {
	            stroke = SOUTHWEST;
	        }
	        else if(y < Math.tan(THETA * -9 / 2) * x && y > Math.tan(THETA * -7 / 2) * x) {
	            stroke = WEST;
	        }
	        else if(y < Math.tan(THETA * -11 / 2) * x && y > Math.tan(THETA * -9 / 2) * x) {
	            stroke = NORTHWEST;
	        }
			
//			strokes.put(strKey, new Integer(stroke));
			strokes.add(new Integer(stroke));
		}
		
		if(touchPoints.size() == 1) {
			gesture = strokes.get(0);
		}
		
		Calendar lCDateTime = Calendar.getInstance();
		timeStamp = lCDateTime.getTimeInMillis();
		
		printStroke(gesture);
		return gesture;
	}
	
	private void printStroke(int stroke) {
	    String strStroke = "unknown";
	    switch (stroke) {
	        case CENTER:
	            strStroke = "center";
	            break;
	        case NORTH:
	            strStroke = "north";
	            break;
	        case NORTHEAST:
	            strStroke = "northeast";
	            break;
	        case EAST:
	            strStroke = "east";
	            break;
	        case SOUTHEAST:
	            strStroke = "southeast";
	            break;
	        case SOUTH:
	            strStroke = "south";
	            break;
	        case SOUTHWEST:
	            strStroke = "southwest";
	            break;
	        case WEST:
	            strStroke = "west";
	            break;
	        case NORTHWEST:
	            strStroke = "northwest";
	            break;
	        default:
	            break;
	    }
	    
	   Log.d(LOGTAG, strStroke);
	}
	
	public void cleanTouchPoin() {
		touchPoints.clear();
	}
	
	protected xacSwipe clone() throws CloneNotSupportedException {
        return (xacSwipe) super.clone();
    }
}
