package me.xiangchen.ml;

import me.xiangchen.lib.xacAccelerometer;
import me.xiangchen.network.xacUDPTask;

public class xacFeatureMaker {
	
	static final int MAXNUMROW = 1024;
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

		featureTableWatch[pntrEntryWatch][idxFeat++] = accelWatch.getX();
		featureTableWatch[pntrEntryWatch][idxFeat++] = accelWatch.getY();
		featureTableWatch[pntrEntryWatch][idxFeat++] = accelWatch.getZ();

		pntrEntryWatch++;
	}
	
	public static void setLabel(int lb) {
		label = lb;
	}
	
	public static void updateWatchAccel(float[] values) {
		if(accelWatch == null) return;
		accelWatch.update(values[0], values[1], values[2]);
	}
	
	public static void updatePhoneAccel(float[] values) {
		if(accelPhone == null) return;
		accelPhone.update(values[0], values[1], values[2]);
	}
	
	public static boolean sendOffData(int numToSend, String[] classLabels) {
		int lockedPntrEntryWatch = pntrEntryWatch;		
		int numToSendWatch = numToSend;
		if(label < 0 /*|| numToSendPhone > lockedPntrEntryPhone*/ || numToSendWatch > lockedPntrEntryWatch) 
			return false;
		
		String strFeatureRow = "";
		
		// 2. the watch's
		for(int i=lockedPntrEntryWatch-numToSendWatch; i<lockedPntrEntryWatch; i++) {
			for(int j=0; j<numFeatures; j++) {
				strFeatureRow += String.format("%.2f", featureTableWatch[i][j]) + ",";
			}
		}
		
		strFeatureRow += classLabels[label] + '\0';
		
		new xacUDPTask().execute(strFeatureRow);
		return true;
	}
	
	public static Object[] getFlattenedData(int numToSend) {
		int lockedPntrEntryWatch = pntrEntryWatch;
		int numToSendWatch = numToSend;
		
		if(/*numToSendPhone > lockedPntrEntryPhone || */numToSendWatch > lockedPntrEntryWatch) 
			return null;
		
		Object[] flattened = new Object[numToSendWatch * numFeatures];
		int idxFeature = 0;
		
		// 2. the watch's
		for(int i=lockedPntrEntryWatch-numToSendWatch; i<lockedPntrEntryWatch; i++) {
			for(int j=0; j<numFeatures; j++) {
				flattened[idxFeature++] = featureTableWatch[i][j];
			}
		}
		
		return flattened;
	}
	
	public static void clearData() {
		featureTablePhone = new double[MAXNUMROW][numFeatures + 1];
		featureTableWatch = new double[MAXNUMROW][numFeatures + 1];
		pntrEntryPhone = 0;
		pntrEntryWatch = 0;
	}

}
