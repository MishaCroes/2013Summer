package me.xiangchen.app.crosssense;

import java.util.ArrayList;

import me.xiangchen.ui.xacInteractiveCanvas;
import me.xiangchen.ui.xacShape;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.MotionEvent.PointerCoords;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

@SuppressLint("NewApi")
public class CrossSense extends Activity {

	LinearLayout layout;
	xacInteractiveCanvas canvas;
	
	private ArrayList<xacShape> shapes = null;
	
	PointerCoords prevCoord;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Point size = new Point();
		getWindowManager().getDefaultDisplay().getSize(size);
		//Remove title bar
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		//Remove notification bar
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		layout = new LinearLayout(this);
		canvas = new xacInteractiveCanvas(this);
		canvas.layout(0, 0, size.x, size.y);
		CrossManager.setCanvasPhone(canvas);
		float dimPhone = 256;
		canvas.addShape(xacShape.OVAL, dimPhone, dimPhone);
		
		canvas.setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				int action = event.getAction();
				PointerCoords curCoord = new PointerCoords();
				event.getPointerCoords(0, curCoord);
				switch(action) {
				case MotionEvent.ACTION_DOWN:
					shapes = canvas.getTouchedShapes(curCoord.x, curCoord.y);
					break;
				case MotionEvent.ACTION_MOVE:
					for(xacShape shape : shapes) {
						shape.offset(curCoord.x - prevCoord.x, curCoord.y - prevCoord.y);
						RectF rectF = new RectF();
						rectF.set(canvas.getLeft(), canvas.getTop(), canvas.getRight(), canvas.getBottom());
						if(!shape.isIn(rectF) && !shape.isOut(rectF)) {
							CrossManager.syncTheWatch();
						}
					}
					
					break;
				case MotionEvent.ACTION_UP:
					break;
				}
				
				canvas.invalidate();
				
				prevCoord = curCoord;
				
				return true;
			}
		});
		
		layout.addView(canvas);
		setContentView(layout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cross_sense, menu);
		return true;
	}

}
