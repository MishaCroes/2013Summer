package me.xiangchen.app.duetos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.Timer;
import java.util.TimerTask;

import me.xiangchen.app.duetapp.App;
import me.xiangchen.app.duetapp.AppExtension;
import me.xiangchen.app.duetapp.call.Call;
import me.xiangchen.app.duetapp.email.Email;
import me.xiangchen.app.duetapp.email.EmailExtension;
import me.xiangchen.app.duetapp.map.Map;
import me.xiangchen.app.duetapp.map.MapExtension;
import me.xiangchen.app.duetapp.reader.Reader;
import me.xiangchen.app.duetapp.reader.ReaderExtenstion;
import me.xiangchen.technique.doubleflip.xacAuthenticSenseFeatureMaker;
import me.xiangchen.ui.xacInteractiveCanvas;
import me.xiangchen.ui.xacShape;
import me.xiangchen.ui.xacToast;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
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

	public final static int AUTOLOCKTIMEOUT = 1800; // sec
	public final static int TIMERFPS = 30;
	RelativeLayout layout;
	xacInteractiveCanvas canvas;
	xacInteractiveCanvas curtain;
	xacToast toast;

	ArrayList<App> apps;
	Hashtable<xacShape, App> htApps;
	Hashtable<App, AppExtension> htAppExtensions;

	ArrayList<xacShape> hitIcons;
	App activeApp = null;

	SensorManager sensorManager;
	Sensor sensorAccel;

	Timer timer;
	boolean isLocked = false;
	boolean isBeingUsed = true;
	long lastUsageTime = 0;

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
				doCanvasTouch(event);
				return true;
			}
		});

		// curtain
		curtain = new xacInteractiveCanvas(this);
		curtain.setBackgroundColor(0xEE000000);
		curtain.setOnTouchListener(new View.OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				doCurtainTouch(event);
				return true;
			}
		});

		layout.addView(canvas);
		setContentView(layout);

		// toast
		toast = new xacToast(this);
//		toast.setImage(R.drawable.left_back_wrist);
//		layout.addView(toast);

		// sensors
		sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
		sensorAccel = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
		sensorManager.registerListener(this, sensorAccel,
				SensorManager.SENSOR_DELAY_GAME);

		initApps();

		Calendar calendar = Calendar.getInstance();
		lastUsageTime = calendar.getTimeInMillis();

		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {

				Calendar calendar = Calendar.getInstance();
				long curTime = calendar.getTimeInMillis();

				if (!isLocked
						&& (curTime - lastUsageTime) / 1000 > AUTOLOCKTIMEOUT) {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							lockScreen();
						}
					});
					isLocked = true;
				}
				
				updateToast();
				
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						if(activeApp != null) {
							activeApp.runOnUIThread();
						}
					}
				});

			}
		}, new Date(), 1000 / TIMERFPS);

		xacAuthenticSenseFeatureMaker.createFeatureTable();
		xacAuthenticSenseFeatureMaker
				.setLabel(xacAuthenticSenseFeatureMaker.INTHEWILD);

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
		EmailExtension emailExtension = new EmailExtension(this);
		htAppExtensions.put(email, emailExtension);

		Reader reader = new Reader(this);
		addIcon(reader);
		apps.add(reader);
		ReaderExtenstion readerExtension = new ReaderExtenstion();
		htAppExtensions.put(reader, readerExtension);

		Map map = new Map(this);
		addIcon(map);
		apps.add(map);
		MapExtension mapExtension = new MapExtension();
		htAppExtensions.put(map, mapExtension);
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

	private void updateToast() {
		// update toast on the phone
		if (!toast.isDead()) {
			runOnUiThread(new Runnable() {
				@Override
				public void run() {
					toast.fadeOut();
				}
			});
		}
		
		// update toast on the watch
	}
	
	private void lockScreen() {
		layout.addView(curtain);
	}
	
	private void unLockScreen() {
		layout.removeView(curtain);
		isLocked = false;
		Calendar calendar = Calendar.getInstance();
		lastUsageTime = calendar.getTimeInMillis();
	}
	
	public void doToast(xacToast t) {
		t.kill(layout);
		t.fadeIn(layout);
	}

	@SuppressLint("NewApi")
	private void doCanvasTouch(MotionEvent event) {
		Calendar calendar = Calendar.getInstance();
		lastUsageTime = calendar.getTimeInMillis();

		int action = event.getAction();
		PointerCoords curCoord = new PointerCoords();
		event.getPointerCoords(0, curCoord);

		switch (action) {
		case MotionEvent.ACTION_DOWN:
			hitIcons = canvas.getTouchedShapes(curCoord.x, curCoord.y);
			break;
		case MotionEvent.ACTION_MOVE:
			break;
		case MotionEvent.ACTION_UP:
			if (hitIcons.size() > 0) {
				xacShape hitIcon = hitIcons.get(0);
				activeApp = htApps.get(hitIcon);
				LauncherManager.setAppExtension(htAppExtensions.get(activeApp));
				LauncherExtension watch = LauncherManager.getWatch();
				if(watch != null) {
					watch.showText(activeApp.getTitle());
				}
				if (activeApp != null) {
					View appView = activeApp.getViewGroup();
					if (appView != null) {
						layout.addView(appView);
						LauncherManager.resumeWatch();
					}
				}
			} else {
				int watchConfig = xacAuthenticSenseFeatureMaker
						.calculateAuthentication();
				LauncherManager.setWatchConfig(watchConfig);
				if (watchConfig != xacAuthenticSenseFeatureMaker.INTHEWILD) {
					lockScreen();
					
					switch (watchConfig) {
					case xacAuthenticSenseFeatureMaker.LEFTBACKWRIST:
						toast.setImage(R.drawable.left_back_wrist);
						break;
					case xacAuthenticSenseFeatureMaker.LEFTINNERWRIST:
						toast.setImage(R.drawable.left_inner_wrist);
						break;
					case xacAuthenticSenseFeatureMaker.RIGHTBACKWRIST:
						toast.setImage(R.drawable.right_back_wrist);
						break;
					case xacAuthenticSenseFeatureMaker.RIGHTINNERWRIST:
						toast.setImage(R.drawable.right_inner_wrist);
						break;
					}
					doToast(toast);
				}
			}
			break;
		}
	}

	private void doCurtainTouch(MotionEvent event) {
		int action = event.getAction();
		switch (action) {
		case MotionEvent.ACTION_DOWN:
			break;
		case MotionEvent.ACTION_MOVE:
			break;
		case MotionEvent.ACTION_UP:
			int watchConfig = xacAuthenticSenseFeatureMaker
					.calculateAuthentication();
			LauncherManager.setWatchConfig(watchConfig);
			if (watchConfig != xacAuthenticSenseFeatureMaker.INTHEWILD) {
				layout.removeView(curtain);
				isLocked = false;
				Calendar calendar = Calendar.getInstance();
				lastUsageTime = calendar.getTimeInMillis();

				switch (watchConfig) {
				case xacAuthenticSenseFeatureMaker.LEFTBACKWRIST:
					toast.setImage(R.drawable.left_back_wrist);
					break;
				case xacAuthenticSenseFeatureMaker.LEFTINNERWRIST:
					toast.setImage(R.drawable.left_inner_wrist);
					break;
				case xacAuthenticSenseFeatureMaker.RIGHTBACKWRIST:
					toast.setImage(R.drawable.right_back_wrist);
					break;
				case xacAuthenticSenseFeatureMaker.RIGHTINNERWRIST:
					toast.setImage(R.drawable.right_inner_wrist);
					break;
				}
				doToast(toast);
			}
			break;
		}
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		switch (keyCode) {
		case KeyEvent.KEYCODE_VOLUME_UP:
			if (isLocked) {
				unLockScreen();
				isLocked = false;
			} else {
				lockScreen();
				isLocked = true;
			}
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

		xacAuthenticSenseFeatureMaker.updatePhoneAccel(event.values);
		xacAuthenticSenseFeatureMaker.addPhoneFeatureEntry();
		if (activeApp != null) {
			activeApp.doAccelerometer(event.values);
		}
	}

}
