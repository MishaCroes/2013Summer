package me.xiangchen.ml;

public class ShareSenseClassifier {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = ShareSenseClassifier.N2635ee496(i);
	    return p;
	  }
	  static double N2635ee496(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 1.07) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > 1.07) {
	    p = ShareSenseClassifier.N1eaf0e387(i);
	    } 
	    return p;
	  }
	  static double N1eaf0e387(Object []i) {
	    double p = Double.NaN;
	    if (i[21] == null) {
	      p = 1;
	    } else if (((Double) i[21]).doubleValue() <= 1.23) {
	      p = 1;
	    } else if (((Double) i[21]).doubleValue() > 1.23) {
	      p = 0;
	    } 
	    return p;
	  }
	}