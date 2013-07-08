package me.xiangchen.app.duetapp.map;

import android.content.Context;
import me.xiangchen.app.duetapp.App;
import me.xiangchen.ui.xacInteractiveCanvas;

public class Map extends App {

	public Map(Context context) {
		super(context);
		color = xacInteractiveCanvas.fgColorYellow;
		appView = new xacInteractiveCanvas(context);
		appView.setBackgroundColor(color);
	}

}
