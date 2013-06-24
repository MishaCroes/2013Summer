package me.xiangchen.app.shiftsense;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.sonyericsson.extras.liveware.aef.control.Control;
import com.sonyericsson.extras.liveware.extension.util.R;
import com.sonyericsson.extras.liveware.extension.util.control.ControlExtension;

public class ShiftSenseExtension extends ControlExtension {
	
	public final static int WATCHACCELFPS = 10;
	public final static String LOGTAG = "ShiftSense";
	
	int width;
	int height;

	RelativeLayout layout;
	Canvas canvas;
	Bitmap bitmap;
	TextView textView;
	
	public ShiftSenseExtension(Context context, String hostAppPackageName) {
		super(context, hostAppPackageName);
		
		ShiftManager.setWatch(this);
		
		width = getSupportedControlWidth(context);
		height = getSupportedControlHeight(context);
		
		layout = new RelativeLayout(context);
		textView = new TextView(context);
		textView.setText("Shift\nSense");
		textView.setTextSize(10);
		textView.setTextColor(Color.WHITE);
		textView.layout(0, 0, width, height);
		layout.addView(textView);
		
	}
	
	public void setLayout(RelativeLayout layout) {
		this.layout = layout;
	}
	
	@Override
    public void onResume() {
		setScreenState(Control.Intents.SCREEN_STATE_ON);
		udpateDisplay();
	}
	
	public static int getSupportedControlWidth(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.smart_watch_control_width);
    }


    public static int getSupportedControlHeight(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.smart_watch_control_height);
    }
    
    public void udpateDisplay() {
    	bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
		canvas = new Canvas(bitmap);
		layout.draw(canvas);
		
		showBitmap(bitmap);
    }
    
    public void updateDisplay(Bitmap bitmap) {    	
		showBitmap(bitmap);
    }
}
