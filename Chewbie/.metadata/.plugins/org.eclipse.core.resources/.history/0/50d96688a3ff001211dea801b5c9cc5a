package me.xiangchen.technique.updownsense;

public class UpDownSenseClassifier {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = UpDownSenseClassifier.N2dec3ffd81(i);
	    return p;
	  }
	  static double N2dec3ffd81(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 0.77) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > 0.77) {
	      p = 1;
	    } 
	    return p;
	  }
	}