package me.xiangchen.app.duetos;

import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.Timer;
import java.util.TimerTask;

import me.xiangchen.app.duetapp.App;
import me.xiangchen.app.duetapp.AppExtension;
import me.xiangchen.app.duetapp.call.Call;
import me.xiangchen.app.duetapp.email.Email;
import me.xiangchen.app.duetapp.map.Map;
import me.xiangchen.app.duetapp.reader.Reader;
import me.xiangchen.app.duetapp.reader.ReaderExtenstion;
import me.xiangchen.ui.xacInteractiveCanvas;
import me.xiangchen.ui.xacShape;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.MotionEvent.PointerCoords;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;

public class Launcher extends Activity implements SensorEventListener {

	RelativeLayout layout;
	xacInteractiveCanvas canvas;

	ArrayList<App> apps;
	Hashtable<xacShape, App> htApps;
	Hashtable<App, AppExtension> htAppExtensions;

	ArrayList<xacShape> hitIcons;
	App activeApp = null;
	
	SensorManager sensorManager;
	Sensor sensorAccel;

	Timer timer;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		LauncherManager.setPhone(this);
		
		// remove title bar
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		// remove notification bar
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		// launcher layout
		layout = new RelativeLayout(this);
		canvas = new xacInteractiveCanvas(this);
		canvas.setOnTouchListener(new View.OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				doTouch(event);
				return true;
			}
		});

		layout.addView(canvas);
		setContentView(layout);

		sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
		sensorAccel = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
		sensorManager.registerListener(this, sensorAccel,
				SensorManager.SENSOR_DELAY_GAME);
		
		initApps();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.launcher, menu);
		return true;
	}

	private void initApps() {
		apps = new ArrayList<App>();
		htApps = new Hashtable<xacShape, App>();
		htAppExtensions = new Hashtable<App, AppExtension>();

		Call call = new Call(this);
		addIcon(call);
		apps.add(call);

		Email email = new Email(this);
		addIcon(email);
		apps.add(email);
		
		Reader reader = new Reader(this);
		addIcon(reader);
		apps.add(reader);
		ReaderExtenstion readerExtension = new ReaderExtenstion();
		htAppExtensions.put(reader, readerExtension);

		Map map = new Map(this);
		addIcon(map);
		apps.add(map);
	}

	private void addIcon(App app) {
		// the visual
		int numRows = apps.size() / LauncherManager.NUMAPPSROW;
		float cy = LauncherManager.MARGINHEIGHT * (numRows + 1)
				+ LauncherManager.APPHEIGHT * (numRows + 0.5f);

		int numCols = apps.size() - LauncherManager.NUMAPPSROW * numRows;
		float cx = LauncherManager.MARGINWIDTH * (numCols + 1)
				+ LauncherManager.APPWIDTH * (numCols + 0.5f);

		xacShape icon = canvas.addShape(xacShape.ROUNDRECT,
				LauncherManager.APPWIDTH, LauncherManager.APPHEIGHT, cx, cy,
				app.getColor());

		htApps.put(icon, app);
	}

	@SuppressLint("NewApi")
	private void doTouch(MotionEvent event) {
		int action = event.getAction();
		PointerCoords curCoord = new PointerCoords();
		event.getPointerCoords(0, curCoord);

		switch (action) {
		case MotionEvent.ACTION_DOWN:
			hitIcons = canvas.getTouchedShapes(curCoord.x, curCoord.y);
			break;
		case MotionEvent.ACTION_MOVE:
			// for (xacShape shape : shapes) {
			// shape.offset(curCoord.x - prevCoord.x, curCoord.y
			// - prevCoord.y);
			// RectF rectF = new RectF();
			// rectF.set(canvas.getLeft(), canvas.getTop(),
			// canvas.getRight(), canvas.getBottom());
			// if (!shape.isIn(rectF) && !shape.isOut(rectF)) {
			// CrossOneBallManager.syncTheWatch();
			// }
			// }
			break;
		case MotionEvent.ACTION_UP:
			if (hitIcons.size() > 0) {
				xacShape hitIcon = hitIcons.get(0);
				activeApp = htApps.get(hitIcon);
				LauncherManager.setAppExtension(htAppExtensions.get(activeApp));
				if (activeApp != null) {
					View appView = activeApp.getViewGroup();
					if (appView != null) {
						layout.addView(appView);
					}
				}
			}
			break;
		}
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		switch (keyCode) {
		case KeyEvent.KEYCODE_VOLUME_UP:
			break;
		case KeyEvent.KEYCODE_VOLUME_DOWN:
			if (activeApp != null) {
				layout.removeView(activeApp.getViewGroup());
				activeApp = null;
			}
			break;
		}

		return true;
	}

	@Override
	public void onAccuracyChanged(Sensor arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		// handedness
		if(activeApp != null) {
		activeApp.doAccelerometer(event.values);
		}
	}

}
