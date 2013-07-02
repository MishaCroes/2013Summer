package me.xiangchen.app.crosssense;

import me.xiangchen.app.crosssense.oneball.CrossSenseOneBall;
import me.xiangchen.app.crosssense.tweetballs.CrossSenseTweetBalls;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

@SuppressLint("NewApi")
public class CrossSense extends FragmentActivity implements
		ActionBar.TabListener {

	public final static String LOGTAG = "ShiftSense";
	public final static int APPWIDTH = 1080;
	public final static int APPHEIGHT = 1920;
	AppSectionsPagerAdapter mAppSectionsPagerAdapter;

	ViewPager mViewPager;

	// static Fragment shiftFragment;
	static Fragment activeFragment = null;
	static CrossSenseOneBall oneBall = null;
	static CrossSenseTweetBalls tweetBalls = null;
	
	int selectedIndex = 0;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		CrossAppManager.setPhone(this);
		setContentView(R.layout.activity_main);

		oneBall = new CrossSenseOneBall();
		tweetBalls = new CrossSenseTweetBalls(this, APPWIDTH, APPHEIGHT);
		
		mAppSectionsPagerAdapter = new AppSectionsPagerAdapter(
				getSupportFragmentManager());

		final ActionBar actionBar = getActionBar();

		actionBar.setHomeButtonEnabled(false);

		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		mViewPager = (ViewPager) findViewById(R.id.pager);
		mViewPager.setAdapter(mAppSectionsPagerAdapter);
		mViewPager
				.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
					@Override
					public void onPageSelected(int position) {
						selectedIndex = position;
						actionBar.setSelectedNavigationItem(position);
						CrossAppManager.updateExtension();
					}
				});

		// For each of the sections in the app, add a tab to the action bar.
		for (int i = 0; i < mAppSectionsPagerAdapter.getCount(); i++) {
			actionBar.addTab(actionBar.newTab()
					.setText(mAppSectionsPagerAdapter.getPageTitle(i))
					.setTabListener(this));
		}

	}

	@Override
	public void onTabUnselected(ActionBar.Tab tab,
			FragmentTransaction fragmentTransaction) {
	}

	@Override
	public void onTabSelected(ActionBar.Tab tab,
			FragmentTransaction fragmentTransaction) {
		// When the given tab is selected, switch to the corresponding page in
		// the ViewPager.
		mViewPager.setCurrentItem(tab.getPosition());
	}

	@Override
	public void onTabReselected(ActionBar.Tab tab,
			FragmentTransaction fragmentTransaction) {
	}

	/**
	 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
	 * one of the primary sections of the app.
	 */
	public static class AppSectionsPagerAdapter extends FragmentPagerAdapter {

		public AppSectionsPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int i) {
			switch (i) {
			case 0:
				activeFragment = oneBall;
				break;
//				return oneBall;
			case 1:
				activeFragment = tweetBalls;
				break;
//				return tweetBalls;
			default:
				activeFragment = new DummySectionFragment();
				Bundle args = new Bundle();
				args.putInt(DummySectionFragment.ARG_SECTION_NUMBER, i + 1);
				activeFragment.setArguments(args);
//				return fragment;
			}
//			CrossAppManager.updateExtension();
			return activeFragment;
		}

		@Override
		public int getCount() {
			return 3;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			switch (position) {
			case 0:
				return "OneBall";
			case 1:
				return "TweetBall";
			default:
				return "Demo" + (position + 1);
			}

		}
	}

	/**
	 * A dummy fragment representing a section of the app, but that simply
	 * displays dummy text.
	 */
	public static class DummySectionFragment extends Fragment {

		public static final String ARG_SECTION_NUMBER = "section_number";

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_section_dummy,
					container, false);
			Bundle args = getArguments();
			((TextView) rootView.findViewById(android.R.id.text1))
					.setText(getString(R.string.dummy_section_text,
							args.getInt(ARG_SECTION_NUMBER)));
			return rootView;
		}
	}

//	public void syncTouch(float xRatio, float yRatio) {
//		if (targetSelection == null)
//			return;
//		targetSelection.doSelection(xRatio, yRatio);
//	}

}
