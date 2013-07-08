package me.xiangchen.app.duetapp.email;

import me.xiangchen.app.duetapp.App;
import me.xiangchen.ui.xacInteractiveCanvas;
import me.xiangchen.ui.xacShape;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.MotionEvent.PointerCoords;
import android.view.View;
import android.widget.RelativeLayout;

public class Email extends App {

	public final static String LOGTAG = "DuetOS";
	public final static int WIDTHAPP = 1080;
	public final static int WIDTHEMAIL = 1024;
	public final static int DIMMARGIN = (WIDTHAPP - WIDTHEMAIL) / 2;
	public final static int HEIGHTEMAIL = 320;
	public final static int NUMSTARTINGEMAILS = 12;
	
	int cntEmail = 0;
	
	xacInteractiveCanvas canvas;
	
	float xPrev;
	float yPrev;
	
	public Email(Context context) {
		super(context);
		color = xacInteractiveCanvas.fgColorRed;
		appLayout = new RelativeLayout(context);
//		appView = new xacInteractiveCanvas(context);
//		appView.setBackgroundColor(color);
//		appLayout.addView(appView);
		
		canvas = new xacInteractiveCanvas(context);
		canvas.setBackgroundColor(xacInteractiveCanvas.bgColorLight);
		canvas.setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				doTouch(event);
				return true;
			}
		});
		
		appLayout.addView(canvas);
		
		for(int i=0; i<NUMSTARTINGEMAILS; i++) {
			addEmail();
		}
	}
	
	public void addEmail() {
		float cx = WIDTHAPP / 2;
		float cy = DIMMARGIN * (1 + cntEmail) + HEIGHTEMAIL * (cntEmail + 0.5f);
		xacShape emailEntry = canvas.addShape(xacShape.TEXTBOX, WIDTHEMAIL, HEIGHTEMAIL, cx, cy, xacInteractiveCanvas.fgColorCream);
		emailEntry.setText("Email No." + (cntEmail + 1));
		emailEntry.setTextColor(Color.BLACK);
		
		cntEmail++;
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
			
			break;
		case MotionEvent.ACTION_MOVE:
			break;
		case MotionEvent.ACTION_UP:
			break;
		}
		
		xPrev = xCur;
		yPrev = yCur;
	}
	
}
