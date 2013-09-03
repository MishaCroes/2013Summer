package me.xiangchen.app.duetapp.map;

import me.xiangchen.app.duetapp.AppManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.Log;
import android.view.View;

public class MapManager extends AppManager {

	public final static String LOGTAG = "DuetOS";
	private final static float HORISHIFT = 0.50f;
	private final static float VERTSHIFT = 0.50f;
	private static Map phone = null;
	private static MapExtension watch = null;
	private static boolean isShifting = false;

	public static void setPhone(Map p) {
		phone = p;
	}

	public static void setWatch(MapExtension w) {
		watch = w;
	}
	

	public static void shift(View view, float x, float y, int cropWidth,
			int cropHeight) {
		if (watch != null) {
			view.setDrawingCacheEnabled(true);
			int left = (int) (x - cropWidth * HORISHIFT);
			int top = (int) (y - cropHeight * VERTSHIFT);
			left = Math.max(left, 0);
			left = Math.min(left, view.getWidth());
			top = Math.max(top, 0);
			top = Math.min(top, view.getHeight());

			try {
				Bitmap croppedBitmap = Bitmap.createBitmap(view.getDrawingCache(), left, top,
						cropWidth, cropHeight);

				updateWatchVisual(croppedBitmap, false);
				croppedBitmap.recycle();
			} catch (Exception e) {
				Log.d(LOGTAG, "bitmap exception!");
			}
			
			view.setDrawingCacheEnabled(false);
			view.destroyDrawingCache();
			
			phone.setShiftFrame(left, top, cropWidth, cropHeight);
		}
	}
	
	public static void unshift() {
		if (watch != null) {
			updateWatchVisual(null, false);
		}
	}

//	private static Bitmap getScreenShot(View view) {
//		
//		view.setDrawingCacheEnabled(true);
//		Bitmap bitmap = Bitmap.createBitmap(view.getDrawingCache());
//		view.setDrawingCacheEnabled(false);
//		view.destroyDrawingCache();
//
//		return bitmap;
//	}
//	
//	public static Bitmap loadBitmapFromView(View v) {
//		int w = v.getWidth();
//		int h = v.getHeight();
//		if(w < 0 || h < 0) 
//			return null;
//	     Bitmap b = Bitmap.createBitmap( w, h, Bitmap.Config.ARGB_8888);                
//	     Canvas c = new Canvas(b);
//	     v.layout(0, 0, v.getLayoutParams().width, v.getLayoutParams().height);
//	     v.draw(c);
//	     return b;
//	}
	
	public static void setShiftStatus(boolean status) {
		isShifting = status;
	}
	
	public static boolean getShiftStatus() {
//		return isShifting;
		if(phone != null) {
			return phone.isShifted;
		}
		return false;
	}

	public static void doSelection(float xRatio, float yRatio) {
		phone.doSelection(xRatio, yRatio);
	}
	
	public static void doTranslation(float dx, float dy) {
		phone.doTranslation(dx, dy);
	}
	
	public static void switchMapViews() {
		phone.swtichMapView();
	}
	
	public static void offsetShiftFrame(float dx, float dy) {
		phone.offsetShiftFrame(dx, dy);
	}
}
