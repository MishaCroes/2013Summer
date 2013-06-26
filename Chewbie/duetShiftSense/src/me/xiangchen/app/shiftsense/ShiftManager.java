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

	public static void shift(View view, float x, float y, int cropWidth,
			int cropHeight) {
		if (watch != null) {
			Bitmap bitmap = getScreenShot(view);
			int cx = (int) (x - cropWidth * HORISHIFT);
			int cy = (int) (y - cropHeight * VERTSHIFT);
			cx = Math.max(cx, 0);
			cx = Math.min(cx, bitmap.getWidth());
			cy = Math.max(cy, 0);
			cy = Math.min(cy, bitmap.getHeight());
			Bitmap croppedBitmap = Bitmap.createBitmap(bitmap, cx, cy,
					cropWidth, cropHeight);

			watch.updateDisplay(croppedBitmap);
		}
	}

	private static Bitmap getScreenShot(View view) {
		view.setDrawingCacheEnabled(true);
		Bitmap bitmap = Bitmap.createBitmap(view.getDrawingCache());
		view.setDrawingCacheEnabled(false);

		return bitmap;
	}

	public static void syncTouch(float xRatio, float yRatio) {
		phone.syncTouch(xRatio, yRatio);
	}
}
