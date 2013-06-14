package me.xiangchen.ml;

import me.xiangchen.lib.xacAccelerometer;
import me.xiangchen.network.xacUDPTask;
import android.util.Log;

public class xacFeatureMaker {
	
	static final int MAXNUMROW = 8096;
	static final int NUMSOURCES = 2;
	
	static String[] featureNames = null;
	static double[][] featureTable = null;//new int[MAXNUMROW][(int) (AccelVis.NUMDATAPOINTS * AccelVis.FEATURERATIO) + 1];
	static int pntrEntry = 0;
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
		numFeatures = NUMSOURCES * xacAccelerometer.NUMACCELAXES;
		featureTable = new double[MAXNUMROW][numFeatures + 1];
		pntrEntry = 0;
		
		accelWatch = new xacAccelerometer();
		accelPhone = new xacAccelerometer();
		accels = new xacAccelerometer[]{accelWatch, accelPhone};
	}
	
	/**
	 * add a row in the feature table
	 * @param features
	 * @param val
	 */
	public static void addFeatureEntry()
	{
		if(pntrEntry >= MAXNUMROW) {
			pntrEntry = 0;
		}
		
		int idxFeat = 0;
		for (int i = 0; i < NUMSOURCES; i++) {
			featureTable[pntrEntry][idxFeat++] = accels[i].getX();
			featureTable[pntrEntry][idxFeat++] = accels[i].getY();
			featureTable[pntrEntry][idxFeat++] = accels[i].getZ();
		}

//		featureTable[pntrEntry][numFeatures] = label;
				
		Log.d(tag, "The " + (pntrEntry+1) + "th entry added");
		pntrEntry++;
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
	
	public static void sendOffData(int numToSend, String[] classLabels) {
		int lockedPntrEntry = pntrEntry;
		if(numToSend > lockedPntrEntry) 
			return;
		
		String strFeatureRow = "";
		for(int i=lockedPntrEntry-numToSend; i<lockedPntrEntry; i++) {
			for(int j=0; j<numFeatures; j++) {
				strFeatureRow += featureTable[i][j] + ",";
			}
		}
		strFeatureRow += classLabels[label] + '\0';
		new xacUDPTask().execute(strFeatureRow);
	}
	
	public static Object[] getFlattenedData(int numToSend) {
		int lockedPntrEntry = pntrEntry;
		if(numToSend > lockedPntrEntry) 
			return null;
		
		Object[] flattened = new Object[numToSend * numFeatures];
		int idxFeature = 0;
		
		for(int i=lockedPntrEntry-numToSend; i<lockedPntrEntry; i++) {
			for(int j=0; j<numFeatures; j++) {
				flattened[idxFeature++] = featureTable[i][j];
			}
		}
		
		return flattened;
	}
	
	public static void clearData() {
		featureTable = new double[MAXNUMROW][numFeatures + 1];
		pntrEntry = 0;
	}
	
	/**
	 * delete the last added feature row
	 */
	public static void deleteLastEntry() {
		if(pntrEntry <= 0)
			return;
		pntrEntry--;
		Log.d(tag, "The " + (pntrEntry+1) + "th entry deleted");
	}
	
//	/**
//	 * save the feature table as a .csv file
//	 */
//	public static void generateFeatureCSV(String[] classLabels) {
//		Calendar cal = Calendar.getInstance();
//		String fileName = "duetToucSense" + cal.getTime().toString() + ".csv";
//		try {
//			FileWriter fstream = new FileWriter(fileName);
//			BufferedWriter out = new BufferedWriter(fstream);
//			  
//			// write the first row
//			for(int i = 0; i < numFeatures; i++) {
//				out.write(featureNames[i] + ",");
//			}
//			out.write(featureNames[numFeatures] + "\n");
//			
//			for(int j = 0; j < pntrEntry; j++) {
//				for(int i = 0; i < numFeatures; i++) {
//					out.write(featureTable[j][i] + ",");
//				}
//				out.write(classLabels[(int) featureTable[j][numFeatures]] + "\n");
//			}
//			
//		  //Close the output stream
//		  out.close();
//		  System.out.println(fileName + " created.");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//	}

}
