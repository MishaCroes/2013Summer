package me.xiangchen.technique.updownsense;

public class UpDownSenseClassifier {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = UpDownSenseClassifier.N136bf0aa2(i);
	    return p;
	  }
	  static double N136bf0aa2(Object []i) {
	    double p = Double.NaN;
	    if (i[29] == null) {
	      p = 0;
	    } else if (((Double) i[29]).doubleValue() <= 0.61) {
	      p = 0;
	    } else if (((Double) i[29]).doubleValue() > 0.61) {
	      p = 1;
	    } 
	    return p;
	  }
	}