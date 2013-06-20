package me.xiangchen.ui;

import android.graphics.Canvas;
import android.graphics.Paint;

public class xacShape {

	public static void drawTriangle(Canvas canvas, float[] vertices, int fill) {
		int verticesColors[] = {
		    fill, fill, fill,
		    0xFF000000, 0xFF000000, 0xFF000000
		};
		
		Paint paint = new Paint();
		paint.setColor(fill);
	    paint.setAntiAlias(true);
	    
		canvas.drawVertices(Canvas.VertexMode.TRIANGLES, 
				vertices.length, 
				vertices, 
			    0, 
			    null,
			    0,
			    verticesColors,
			    0,
			    null, 
			    0,
			    0,
			    paint);
	}
}
