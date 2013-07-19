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
			int cx = (int) (x - cropWidth * HORISHIFT);
			int cy = (int) (y - cropHeight * VERTSHIFT);
			cx = Math.max(cx, 0);
			cx = Math.min(cx, view.getWidth());
			cy = Math.max(cy, 0);
			cy = Math.min(cy, view.getHeight());

			try {
				Bitmap croppedBitmap = Bitmap.createBitmap(view.getDrawingCache(), cx, cy,
						cropWidth, cropHeight);

				updateWatchVisual(croppedBitmap, true);
			} catch (Exception e) {
				Log.d(LOGTAG, "bitmap exception!");
			}
			
			view.setDrawingCacheEnabled(false);
			view.destroyDrawingCache();
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

	public static void doSelection(float xRatio, float yRatio) {
		phone.doSelection(xRatio, yRatio);
	}
	
	public static void doTranslation(float dx, float dy) {
		phone.doTranslation(dx, dy);
	}
	
	public static void switchMapViews() {
		phone.swtichMapView();
	}
}
