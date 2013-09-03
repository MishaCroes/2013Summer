package me.xiangchen.app.duetstudy;

import java.util.Calendar;

import me.xiangchen.app.duettech.R;
import me.xiangchen.lib.xacPhoneGesture;
import me.xiangchen.technique.bumpsense.xacBumpSenseFeatureMaker;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;

public class Bump extends TechniqueShell {

	public static final int BUMPTIMEOUT = 1500;
	xacPhoneGesture pressAndHold;
	long timeFromHold;
	public Bump(Context context) {
		super(context);
		technique = BUMP;
		
		numClasses = 2;
		classLabels = new int[] {xacBumpSenseFeatureMaker.BUMP, xacBumpSenseFeatureMaker.NOBUMP};
//		int numDataPointsPerClass = 50; 
//		numBlocks = 5;
		numTrialsPerBlock = numClasses * numDataPointsPerClass / numBlocks;
		
		labelCounter = new int[numClasses];
		radii = new float[numClasses];
		for (int i = 0; i < numClasses; i++) {
			labelCounter[i] = 0;
			radii[i] = 1;
		}

		pressAndHold = new xacPhoneGesture(xacPhoneGesture.PRESSANDHOLD);
		
		tvStatus.setText("Bump");
	}

	@Override
	public boolean doTouch(MotionEvent event) {

		// boolean retValue = false;
		isTouching = true;
		int action = event.getAction();

		if (!isBreak) {
//			if (isReadyForNextTrial) {

				if (isStarted) {
					long curTime = Calendar.getInstance().getTimeInMillis();

					switch (action) {
					case MotionEvent.ACTION_DOWN:
						pressAndHold.update(event);
						timeFromHold = -1;
						ivCue.setImageResource(R.drawable.hold_no_bump);
						break;
					case MotionEvent.ACTION_MOVE:
						if (pressAndHold.getResult() != pressAndHold.YES) {
							pressAndHold.update(event);
							xacBumpSenseFeatureMaker.clearData();
							isReadyForNextTrial = false;
						} else {
							if (timeFromHold < 0) {
								if(block == 0) {
									label = nextClassLabel(true);
								} else {
									label = nextClassLabel(false);
								}
								setCues();
								timeFromHold = curTime;
							} else { 
								if (curTime - timeFromHold > BUMPTIMEOUT) {
									if (xacBumpSenseFeatureMaker.isDataReady()) {
										int bumpResult = xacBumpSenseFeatureMaker.calculateBumping();
										xacBumpSenseFeatureMaker.setLabels(label, bumpResult);
										xacBumpSenseFeatureMaker.sendOffData();
										xacBumpSenseFeatureMaker.clearData();
										isReadyForNextTrial = false;
										Log.d(LOGTAG, label + " : " + bumpResult);
										tvCue.setText("Release");
										timeFromHold = curTime;
										trial++;
									}
								}
							}
						}
						break;
					case MotionEvent.ACTION_UP:
						break;
					}
				}

			if (action == MotionEvent.ACTION_UP) {
				if (isStarted) {
					if (trial == numTrialsPerBlock) {
						block++;
						isBreak = true;
						if (block == numBlocks) {
							tvCue.setTextColor(0xFFFFFFFF);
							tvCue.setText("End of technique");
						} else {
							tvCue.setTextColor(0xFFFFFFFF);
							tvCue.setText("End of block");
						}
					} else {
						tvCue.setTextColor(0xFFFFFFFF);
						tvCue.setText("Please wait ...");
					}					
				} else {
					isStarted = true;
					block = 0;
					trial = 0;
				}
				
				xacBumpSenseFeatureMaker.clearData();
				isReadyForNextTrial = false;
				isTouching = false;
				ivCue.setImageResource(R.drawable.nothing);
			}
		}

		return true;
	}
	
	@Override
	public void runOnTimer() {
		if (!isBreak && !isTouching) {
			if (!xacBumpSenseFeatureMaker.isDataReady()) {
				tvCue.setTextColor(0xFFFFFFFF);
				tvCue.setText("Please wait ...");
				isReadyForNextTrial = false;
				// Log.d(LOGTAG, "wait...");
			} else {
				if (!isReadyForNextTrial) {
					if (isStarted) {
//						label = nextClassLabel(false);
						tvCue.setTextColor(0xFFFFFFFF);
						tvCue.setText("Press and hold");
						setStatus();
					} else {
						tvCue.setTextColor(0xFFFFFFFF);
						tvCue.setText("Tap to start...");
					}

					isReadyForNextTrial = true;
					// Log.d(LOGTAG, "ready");
				}
			}
		}
	}
	
	@Override
	protected void setCues() {
		super.setCues();
		switch (label) {
		case xacBumpSenseFeatureMaker.BUMP:
			tvCue.setText("Bump");
			ivCue.setImageResource(R.drawable.bump);
			break;
		case xacBumpSenseFeatureMaker.NOBUMP:
			tvCue.setText("Press and hold");
			
			break;
		}
	}
}
