package me.xiangchen.technique.tiltsense;

public class TiltSenseClassifier {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TiltSenseClassifier.N6f526c5f244(i);
	    return p;
	  }
	  static double N6f526c5f244(Object []i) {
	    double p = Double.NaN;
	    if (i[26] == null) {
	      p = 0;
	    } else if (((Double) i[26]).doubleValue() <= -3.06) {
	      p = 0;
	    } else if (((Double) i[26]).doubleValue() > -3.06) {
	      p = 1;
	    } 
	    return p;
	  }
	}