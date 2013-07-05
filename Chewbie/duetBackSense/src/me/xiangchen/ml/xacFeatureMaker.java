package me.xiangchen.ml;

import me.xiangchen.app.backsense.BackSense;
import me.xiangchen.app.backsense.BackSenseExtension;
import me.xiangchen.lib.xacAccelerometer;
import me.xiangchen.network.xacUDPTask;

public class xacFeatureMaker {
	
	static final int MAXNUMROW = 8096;
	static final int NUMSOURCES = 2;
	
	static String[] featureNames = null;
	static double[][] featureTablePhone = null;
	static double[][] featureTableWatch = null;
	static int pntrEntryPhone = 0;
	static int pntrEntryWatch = 0;
	static int numFeatures = 0;
	static String tag = "FeatureMaker";
	static int label = -1;
	
	static xacAccelerometer accelWatch;
	static xacAccelerometer accelPhone;
	static xacAccelerometer[] accels;
	
	static int xWatchTouch;
	static int yWatchTouch;
	
	/**
	 * create a table of features, including the first row (the names of the attributes)
	 */
	public static void createFeatureTable()
	{
		numFeatures = xacAccelerometer.NUMACCELAXES;
		featureTablePhone = new double[MAXNUMROW][numFeatures + 1];
		featureTableWatch = new double[MAXNUMROW][numFeatures + 1];
		pntrEntryPhone = 0;
		pntrEntryWatch = 0;
		
		accelWatch = new xacAccelerometer();
		accelPhone = new xacAccelerometer();
		accels = new xacAccelerometer[]{accelWatch, accelPhone};
	}
	
	/**
	 * add a row in the feature table
	 * @param features
	 * @param val
	 */
	public static void addPhoneFeatureEntry()
	{
		if(pntrEntryPhone >= MAXNUMROW) {
			pntrEntryPhone = 0;
		}
		
		int idxFeat = 0;
//		for (int i = 0; i < NUMSOURCES; i++) {
		featureTablePhone[pntrEntryPhone][idxFeat++] = accelPhone.getX();
		featureTablePhone[pntrEntryPhone][idxFeat++] = accelPhone.getY();
		featureTablePhone[pntrEntryPhone][idxFeat++] = accelPhone.getZ();
//		}

//		featureTable[pntrEntry][numFeatures] = label;
				
//		Log.d(tag, "The " + (pntrEntry+1) + "th entry added");
		pntrEntryPhone++;
	}
	
	public static void addWatchFeatureEntry()
	{
		if(pntrEntryWatch >= MAXNUMROW) {
			pntrEntryWatch = 0;
		}
		
		int idxFeat = 0;
//		for (int i = 0; i < NUMSOURCES; i++) {
		featureTableWatch[pntrEntryWatch][idxFeat++] = accelWatch.getX();
		featureTableWatch[pntrEntryWatch][idxFeat++] = accelWatch.getY();
		featureTableWatch[pntrEntryWatch][idxFeat++] = accelWatch.getZ();
//		}

//		featureTable[pntrEntry][numFeatures] = label;
				
//		Log.d(tag, "The " + (pntrEntry+1) + "th entry added");
		pntrEntryWatch++;
	}
	
	public static void setLabel(int lb) {
		label = lb;
	}
	
	public static void updateWatchTouch(int x, int y) {
		xWatchTouch = x;
		yWatchTouch = y;
	}
	
	public static void updateWatchAccel(float[] values) {
		if(accelWatch == null) return;
		accelWatch.update(values[0], values[1], values[2]);
	}
	
	public static void updatePhoneAccel(float[] values) {
		if(accelPhone == null) return;
		accelPhone.update(values[0], values[1], values[2]);
	}
	
	public static boolean sendOffData(String[] classLabels) {
//		int lockedPntrEntryPhone = pntrEntryPhone;
//		int lockedPntrEntryWatch = pntrEntryWatch;
//		int numToSendWatch = numToSend;
//		int numToSendPhone = numToSendWatch * BackSense.PHONEACCELFPS / BackSenseExtension.WATCHACCELFPS;
//		
//		if(label < 0 || numToSendPhone > lockedPntrEntryPhone || numToSendWatch > lockedPntrEntryWatch) 
//			return false;
//		
		String strFeatureRow = "";
//		
//		// 1. the phone's
//		for(int i=lockedPntrEntryPhone-numToSendPhone; i<lockedPntrEntryPhone; i++) {
//			for(int j=0; j<numFeatures; j++) {
//				strFeatureRow += String.format("%.2f", featureTablePhone[i][j]) + ",";
//			}
//		}
//		
//		// 2. the watch's
//		for(int i=lockedPntrEntryWatch-numToSendWatch; i<lockedPntrEntryWatch; i++) {
//			for(int j=0; j<numFeatures; j++) {
//				strFeatureRow += String.format("%.2f", featureTableWatch[i][j]) + ",";
//			}
//		}
		
		// 3. the watch's touch point
		strFeatureRow += String.format("%d,%d,", xWatchTouch, yWatchTouch); 
		
		strFeatureRow += classLabels[label] + '\0';
		
		new xacUDPTask().execute(strFeatureRow);
		
		return true;
	}
	
	public static Object[] getFlattenedData(int numToSend) {
		int lockedPntrEntryPhone = pntrEntryPhone;
		int lockedPntrEntryWatch = pntrEntryWatch;
		int numToSendWatch = numToSend;
		int numToSendPhone = numToSendWatch * BackSense.PHONEACCELFPS / BackSenseExtension.WATCHACCELFPS;
		
		if(numToSendPhone > lockedPntrEntryPhone || numToSendWatch > lockedPntrEntryWatch) 
			return null;
		
		Object[] flattened = new Object[(numToSendPhone + numToSendWatch) * numFeatures + 2];
		int idxFeature = 0;
		
		// 1. the phone's
		for(int i=lockedPntrEntryPhone-numToSendPhone; i<lockedPntrEntryPhone; i++) {
			for(int j=0; j<numFeatures; j++) {
				flattened[idxFeature++] = featureTablePhone[i][j];
			}
		}
		
		// 2. the watch's
		for(int i=lockedPntrEntryWatch-numToSendWatch; i<lockedPntrEntryWatch; i++) {
			for(int j=0; j<numFeatures; j++) {
				flattened[idxFeature++] = featureTableWatch[i][j];
			}
		}
		
		flattened[idxFeature++] = xWatchTouch * 1.0;
		flattened[idxFeature++] = yWatchTouch * 1.0;
		
		return flattened;
	}
	
	public static void clearData() {
		featureTablePhone = new double[MAXNUMROW][numFeatures + 1];
		featureTableWatch = new double[MAXNUMROW][numFeatures + 1];
		pntrEntryPhone = 0;
		pntrEntryWatch = 0;
	}

}
