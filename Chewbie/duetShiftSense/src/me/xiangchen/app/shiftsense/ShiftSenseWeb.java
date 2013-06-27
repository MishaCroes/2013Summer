package me.xiangchen.app.shiftsense;

import me.xiangchen.ui.xacWebView;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ShiftSenseWeb extends Fragment {

	xacWebView webView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		webView = new xacWebView(container.getContext());
		webView.loadUrl("http://chi2014.acm.org/authors/papers-notes");
		webView.setInitialScale(150);
		return webView;

	}
}
