package me.xiangchen.ml;

public class TiltSenseClassifier {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TiltSenseClassifier.N2a7883150(i);
	    return p;
	  }
	  static double N2a7883150(Object []i) {
	    double p = Double.NaN;
	    if (i[26] == null) {
	      p = 0;
	    } else if (((Double) i[26]).doubleValue() <= -7.81) {
	      p = 0;
	    } else if (((Double) i[26]).doubleValue() > -7.81) {
	    p = TiltSenseClassifier.N4de5ed7b1(i);
	    } 
	    return p;
	  }
	  static double N4de5ed7b1(Object []i) {
	    double p = Double.NaN;
	    if (i[25] == null) {
	      p = 2;
	    } else if (((Double) i[25]).doubleValue() <= 4.44) {
	      p = 2;
	    } else if (((Double) i[25]).doubleValue() > 4.44) {
	    p = TiltSenseClassifier.N324a4e312(i);
	    } 
	    return p;
	  }
	  static double N324a4e312(Object []i) {
	    double p = Double.NaN;
	    if (i[27] == null) {
	      p = 1;
	    } else if (((Double) i[27]).doubleValue() <= -0.46) {
	      p = 1;
	    } else if (((Double) i[27]).doubleValue() > -0.46) {
	      p = 2;
	    } 
	    return p;
	  }
	}