package me.xiangchen.ml;

public class TouchSenseClassifier {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier.N5fbd8c6e4(i);
	    return p;
	  }
	  static double N5fbd8c6e4(Object []i) {
	    double p = Double.NaN;
	    if (i[29] == null) {
	      p = 2;
	    } else if (((Double) i[29]).doubleValue() <= -5.209783077) {
	      p = 2;
	    } else if (((Double) i[29]).doubleValue() > -5.209783077) {
	    p = TouchSenseClassifier.N154ebadd5(i);
	    } 
	    return p;
	  }
	  static double N154ebadd5(Object []i) {
	    double p = Double.NaN;
	    if (i[23] == null) {
	      p = 1;
	    } else if (((Double) i[23]).doubleValue() <= 5.209783077) {
	      p = 1;
	    } else if (((Double) i[23]).doubleValue() > 5.209783077) {
	      p = 0;
	    } 
	    return p;
	  }
	}