package me.xiangchen.app.shiftsense;

import java.util.Timer;

import me.xiangchen.lib.xacPhoneGesture;
import me.xiangchen.ui.xacWebView;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class ShiftSense extends Activity {

	final public static String LOGTAG = "ShiftSense";

	xacWebView webView;
	RelativeLayout layout;

	Timer timer;

	boolean isShiftOn = false;

	xacPhoneGesture longPress;
	
	Fragment mapFragment;
	
	ImageView imgView;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Remove title bar
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		// Remove notification bar
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		longPress = new xacPhoneGesture(xacPhoneGesture.LONGPRESS);
		
		webView = new xacWebView(this);
		webView.loadUrl("http://chi2014.acm.org/authors/papers-notes");
		webView.setInitialScale(150);
		
		layout = new RelativeLayout(this);
		RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
				RelativeLayout.LayoutParams.MATCH_PARENT,
				RelativeLayout.LayoutParams.MATCH_PARENT);
		layout.addView(webView, params);
		
		setContentView(layout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.shift_sense, menu);
		return true;
	}
}
