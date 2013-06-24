package me.xiangchen.app.shiftsense;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.RelativeLayout;

public class ShiftManager {

	private final static float HORISHIFT = 0.50f;
	private final static float VERTSHIFT = 0.50f;
	private static ShiftSense phone = null;
	private static ShiftSenseExtension watch = null;

	public static void setPhone(ShiftSense p) {
		phone = p;
	}

	public static void setWatch(ShiftSenseExtension w) {
		watch = w;
	}

	public static void shift(View view, float x, float y) {
		if (watch != null) {
			Bitmap bitmap = getScreenShot(view);
			Bitmap croppedBitmap = Bitmap.createBitmap(bitmap,
					(int) (x - watch.width * HORISHIFT),
					(int) (y - watch.height * VERTSHIFT), watch.width,
					watch.height);

			watch.updateDisplay(croppedBitmap);
		}
	}

	private static Bitmap getScreenShot(View view) {
		view.setDrawingCacheEnabled(true);
		Bitmap bitmap = Bitmap.createBitmap(view.getDrawingCache());
		view.setDrawingCacheEnabled(false);

		return bitmap;
	}
}
