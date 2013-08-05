package me.xiangchen.app.duetstudy;

import java.util.Calendar;

import me.xiangchen.app.duettech.R;
import me.xiangchen.technique.doubleflip.xacAuthenticSenseFeatureMaker;
import android.content.Context;
import android.view.MotionEvent;

public class FlipToConfigure extends TechniqueShell {

	public final static int CONFIGURETIMEOUT = 1500; // ms
	long timeTouchDown;

	public FlipToConfigure(Context context) {
		super(context);
		technique = FLIPTOCONFIGURE;

		numClasses = 2;
		classLabels = new int[] { xacAuthenticSenseFeatureMaker.LEFTBACKWRIST,
				xacAuthenticSenseFeatureMaker.LEFTINNERWRIST };
		// numBlocks = numBlocks % 2 == 1 ? numBlocks + 1 : numBlocks;
		// numBlocks = numBlocks == 0 ? 2 : numBlocks;
		numTrialsPerBlock = numClasses * numDataPointsPerClass / numBlocks;

		labelCounter = new int[numClasses];
		radii = new float[numClasses];
		for (int i = 0; i < numClasses; i++) {
			labelCounter[i] = 0;
			radii[i] = 1;
		}

		tvStatus.setText("Flip to configure");
	}

	@Override
	public boolean doTouch(MotionEvent event) {
		isTouching = true;
		int action = event.getAction();
		if (!isBreak) {
			long curTime = Calendar.getInstance().getTimeInMillis();
			switch (action) {
			case MotionEvent.ACTION_DOWN:
				xacAuthenticSenseFeatureMaker.clearData();
				timeTouchDown = curTime;

				break;
			case MotionEvent.ACTION_MOVE:
				if (curTime - timeTouchDown > CONFIGURETIMEOUT) {
					tvCue.setText("Release");
				}
				break;
			case MotionEvent.ACTION_UP:
				if (isStarted) {
					if (xacAuthenticSenseFeatureMaker.isDataReady()) {
						int configResult = xacAuthenticSenseFeatureMaker
								.calculateAuthentication();
						xacAuthenticSenseFeatureMaker.setLabels(label,
								configResult);
						xacAuthenticSenseFeatureMaker.sendOffData();
						xacAuthenticSenseFeatureMaker.clearData();
						isReadyForNextTrial = false;

						trial++;
						setInitCues();
						if (trial == numTrialsPerBlock) {
							block++;
							isBreak = true;
							if (block == numBlocks) {
								tvCue.setTextColor(0xFFFFFFFF);
								tvCue.setText("End of technique");
							} else {
								tvCue.setTextColor(0xFFFFFFFF);
								tvCue.setText("End of block");
								isStarted = false;
							}
						} else {
							ivCue.setImageResource(R.drawable.nothing);
							tvCue.setTextColor(0xFFFFFFFF);
							tvCue.setText("Please wait ...");
						}
					}
				} else {
					isStarted = true;
				}

				isTouching = false;
				break;
			}
		}
		return true;
	}

	@Override
	public void runOnTimer() {
		if (!isBreak && !isTouching) {
			if (!xacAuthenticSenseFeatureMaker.isDataReady()) {
				tvCue.setTextColor(0xFFFFFFFF);
				tvCue.setText("Please wait ...");
				isReadyForNextTrial = false;
				// Log.d(LOGTAG, "wait...");
			} else {
				if (!isReadyForNextTrial) {
					if (block == 0) {
						label = super.nextClassLabel(true);
					} else {
						label = nextClassLabel(false);
					}
					if (isStarted) {
						setCues();
						setStatus();
					} else {
						setInitCues();
					}

					isReadyForNextTrial = true;
					// Log.d(LOGTAG, "ready");
				}
			}
		}
	}

	@Override
	protected void setCues() {
//		super.setCues();
		switch (label) {
		case xacAuthenticSenseFeatureMaker.INTHEWILD:
			tvCue.setText("Hold");
			ivCue.setImageResource(R.drawable.hold_no_flip);
			break;
		default:
			tvCue.setText("Hold and flip");
			ivCue.setImageResource(R.drawable.hold_and_flip);
			break;
		}
	}

	private void setInitCues() {
		tvCue.setTextColor(0xFFFFFFFF);
		switch (label) {
		case xacAuthenticSenseFeatureMaker.LEFTINNERWRIST:
			tvCue.setText("Wear the watch on the \ninner wrist");
			ivCue.setImageResource(R.drawable.watch_inner_wrist);
			break;
		default:
			tvCue.setText("Wear the watch on the \nouter wrist");
			ivCue.setImageResource(R.drawable.watch_outer_wrist);
			break;
		}
	}

	@Override
	protected int nextClassLabel(boolean toBeRandom) {
		int retLabel = classLabels[0];
		if (toBeRandom) {
			retLabel = classLabels[0];
		} else {
			if (trial < numTrialsPerBlock * 2 / 3) {
				retLabel = classLabels[block % 2];
			} else {
				retLabel = classLabels[0];
			}
		}

		return retLabel;
	}
}
