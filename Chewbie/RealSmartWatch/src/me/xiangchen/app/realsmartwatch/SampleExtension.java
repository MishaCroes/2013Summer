package me.xiangchen.app.realsmartwatch;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.sonyericsson.extras.liveware.extension.util.control.ControlExtension;

public class SampleExtension extends ControlExtension {

	static final Bitmap.Config BITMAP_CONFIG = Bitmap.Config.ARGB_8888;
	
	int width;
	int height;
	LinearLayout layout;
	TextView textView;
	ImageView imgView;
	Bitmap bmpDora;
	Bitmap returnedBitmap;
	Paint paint;
	Canvas canvas;
	
	public SampleExtension(Context context, String hostAppPackageName) {
		super(context, hostAppPackageName);
		
		width = getSupportedControlWidth(context);
		height = getSupportedControlHeight(context);
		
		paint = new Paint();
		paint.setColor(Color.WHITE);
		returnedBitmap = Bitmap.createBitmap(width, height, BITMAP_CONFIG);
		canvas = new Canvas(returnedBitmap);
		
		layout = new LinearLayout(context);
		
		imgView = new ImageView(context);
		bmpDora = BitmapFactory.decodeResource(context.getResources(),R.drawable.doraemon);
		imgView.setImageBitmap(bmpDora);
		imgView.layout(0, 0, width, height);
		RelativeLayout.LayoutParams paramsImage = new RelativeLayout.LayoutParams(
				LayoutParams.MATCH_PARENT,
				LayoutParams.MATCH_PARENT);
		paramsImage.addRule(RelativeLayout.ALIGN_TOP, 0);
		layout.addView(imgView, paramsImage);
		
		textView = new TextView(context);
		textView.setTextSize(7);
		textView.setBackgroundColor(Color.argb(128, 0, 0, 0));
		textView.setTextColor(Color.WHITE);
		textView.setText("Doraemon!");
		textView.layout(0, height*3/5, width, height*7/8);
		textView.setGravity(Gravity.CENTER);
		RelativeLayout.LayoutParams paramsText = new RelativeLayout.LayoutParams(
				LayoutParams.MATCH_PARENT, 
				LayoutParams.MATCH_PARENT);
		paramsText.addRule(RelativeLayout.ABOVE, 0);
		layout.addView(textView, paramsText);
	}
	
	@Override
	public void onStart() {
		
	}
	
	@Override
	public void onResume() {
		canvas.drawBitmap(returnedBitmap, 0, 0, paint);
		layout.draw(canvas);
		showBitmap(returnedBitmap);
	}
	
	@Override
    public void onStop() {
        
    }
	
	@Override
    public void onDestroy() {
	
	}
	
    public static int getSupportedControlWidth(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.smart_watch_control_width);
    }


    public static int getSupportedControlHeight(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.smart_watch_control_height);
    }

}
