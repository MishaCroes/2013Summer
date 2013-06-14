package me.xiangchen.ml;

public class BumpSenseClassifier {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseClassifier.N6596722d5(i);
	    return p;
	  }
	  static double N6596722d5(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= 9.653421402) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() > 9.653421402) {
	    p = BumpSenseClassifier.N78221c756(i);
	    } 
	    return p;
	  }
	  static double N78221c756(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() <= 3.078943491) {
	    p = BumpSenseClassifier.N77a82f17(i);
	    } else if (((Double) i[4]).doubleValue() > 3.078943491) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N77a82f17(Object []i) {
	    double p = Double.NaN;
	    if (i[29] == null) {
	      p = 1;
	    } else if (((Double) i[29]).doubleValue() <= 10.99716663) {
	      p = 1;
	    } else if (((Double) i[29]).doubleValue() > 10.99716663) {
	      p = 0;
	    } 
	    return p;
	  }
	}