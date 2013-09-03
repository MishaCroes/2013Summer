package me.xiangchen.app.eer;

import java.util.Calendar;
import java.util.Hashtable;
import java.util.Timer;
import java.util.TimerTask;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;

@SuppressLint("NewApi")
public class xacTextEntry extends TimerTask{

	final int FPS = 10;
	final int BTWNTIMEOUT = 2000;
	enum EntryState {
	    NONE,
	    INPROGRESS,
	    DONE
	};

	int numTouch;
	xacSwipe firstSwipe;
	xacSwipe secondSwipe;
	EntryState state;
	Hashtable<String, String> keyMap;
	Hashtable<Integer, String> gestureMap;
	ImageView imgView;
	TextView textView;
	Timer timer;
	
	int widthWatch;
	int heightWatch;
	
	public xacTextEntry() {
		firstSwipe = null;
		secondSwipe = null;
		initGestureMap();
		initKeyMap();
		state = EntryState.NONE;
		timer = new Timer();
		timer.scheduleAtFixedRate(this, 0, 1000/FPS);
	}

	public void update(xacSwipe swipe) {
		switch (state) {
        case NONE:
            numTouch = swipe.touchPoints.size();
            try {
				firstSwipe = swipe.clone();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//            [self updateVisual:firstSwipe.gesture];
            state = EntryState.INPROGRESS;
            break;
        case INPROGRESS:
            try {
				secondSwipe = swipe.clone();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            doTextEntry();
            secondSwipe = firstSwipe = null;
            state = EntryState.DONE;
//            [self updateVisual:UNKNOWN];
            break;
        case DONE:
            state = EntryState.NONE;
            break;
        default:
            break;
		}
	}
	
	public void initVisualView(RelativeLayout layout, Context context) {
		imgView = new ImageView(context);
		imgView.setImageResource(R.drawable.keyboardapplealphabet);
		imgView.layout(0, 0, widthWatch, heightWatch);
		RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
				LayoutParams.MATCH_PARENT,
				LayoutParams.MATCH_PARENT);
		params.addRule(RelativeLayout.ABOVE, 0);
		layout.addView(imgView, params);
	}
	
	public void initTextView(RelativeLayout layout, Context context) {
		textView = new TextView(context);
		textView.setText("?");
		textView.setGravity(Gravity.CENTER);
		textView.setTextColor(Color.BLACK);
		textView.setTextSize(16);
		textView.layout(0, 0, widthWatch, (int)(heightWatch * 0.85));
		RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
				LayoutParams.MATCH_PARENT, 
				(int) (heightWatch * 0.85));
		params.addRule(RelativeLayout.ALIGN_TOP, 0);
		layout.addView(textView, params);
	}
	
	@SuppressLint("UseValueOf")
	private void doTextEntry() {
	    String strFirstSwipe = gestureMap.get(new Integer(firstSwipe.gesture));
	    String strSecondSwipe = (String)gestureMap.get(new Integer(secondSwipe.gesture));
	    String strID = numTouch + "," + strFirstSwipe + "," + strSecondSwipe;
	    
	    String keyEntry = (String) keyMap.get(strID);
	    keyEntry = keyEntry == null ? "NA" : keyEntry;
	    
	    System.out.println(strID + ": " + keyEntry);
	    
//	    [textView setText:key];
	    textView.setText(keyEntry);
	}
	
	public void setDimension(int w, int h) {
		widthWatch = w;
		heightWatch = h;
	}
	
	@SuppressLint("UseValueOf")
	private void initGestureMap() {
		gestureMap = new Hashtable<Integer, String>();
	    gestureMap.put(new Integer(xacSwipe.CENTER), new String("center"));
	    gestureMap.put(new Integer(xacSwipe.NORTH), new String("north"));
	    gestureMap.put(new Integer(xacSwipe.NORTHEAST), new String("northeast"));
	    gestureMap.put(new Integer(xacSwipe.EAST), new String("east"));
	    gestureMap.put(new Integer(xacSwipe.SOUTHEAST), new String("southeast"));
	    gestureMap.put(new Integer(xacSwipe.SOUTH), new String("south"));
	    gestureMap.put(new Integer(xacSwipe.SOUTHWEST), new String("southwest"));
	    gestureMap.put(new Integer(xacSwipe.WEST), new String("west"));
	    gestureMap.put(new Integer(xacSwipe.NORTHWEST), new String("northwest"));
	}
	
	private void initKeyMap() {
		keyMap = new Hashtable<String, String>();
		
		keyMap.put("1,northwest,west", "Q");
		keyMap.put("1,northwest,north", "W");
		keyMap.put("1,northwest,south", "E");
		keyMap.put("1,northwest,east", "R");
		keyMap.put("1,north,west", "T");
		keyMap.put("1,north,center", "Y");
		keyMap.put("1,north,east", "U");
		keyMap.put("1,northeast,west", "I");
		keyMap.put("1,northeast,center", "O");
		keyMap.put("1,northeast,east", "P");
		keyMap.put("1,west,west", "A");
		keyMap.put("1,west,center", "S");
		keyMap.put("1,west,east", "D");
		keyMap.put("1,center,west", "F");
		keyMap.put("1,center,center", "G");
		keyMap.put("1,center,east", "H");
		keyMap.put("1,east,west", "J");
		keyMap.put("1,east,center", "K");
		keyMap.put("1,east,east", "L");
		keyMap.put("1,southwest,west", "Z");
		keyMap.put("1,southwest,center", "X");
		keyMap.put("1,southwest,east", "C");
		keyMap.put("1,south,west", "V");
		keyMap.put("1,south,east", "B");
		keyMap.put("1,southeast,west", "N");
		keyMap.put("1,southeast,east", "M");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(firstSwipe == null) {
	        state = EntryState.NONE;
	    }
	    else {
	    	Calendar lCDateTime = Calendar.getInstance();
	        long currTime = lCDateTime.getTimeInMillis();
//	        System.out.println(currTime);
	        if(currTime - firstSwipe.timeStamp > BTWNTIMEOUT) {
	            
	            if(state ==EntryState.INPROGRESS) {
	                System.out.println("time out!");
	                if(imgView != null) {
//	                    [self updateVisual:EntryState.UNKNOWN];
	                }
	            }
	            
	            state = EntryState.NONE;
	            firstSwipe = null;
	        }
	    }
	}
	
}
