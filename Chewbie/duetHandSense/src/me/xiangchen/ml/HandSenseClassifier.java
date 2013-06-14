package me.xiangchen.ml;

public class HandSenseClassifier {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier.Nedfd5b810(i);
	    return p;
	  }
	  static double Nedfd5b810(Object []i) {
	    double p = Double.NaN;
	    if (i[27] == null) {
	      p = 1;
	    } else if (((Double) i[27]).doubleValue() <= -0.022146367) {
	    p = HandSenseClassifier.N9482aa911(i);
	    } else if (((Double) i[27]).doubleValue() > -0.022146367) {
	    p = HandSenseClassifier.N5119015b13(i);
	    } 
	    return p;
	  }
	  static double N9482aa911(Object []i) {
	    double p = Double.NaN;
	    if (i[25] == null) {
	      p = 1;
	    } else if (((Double) i[25]).doubleValue() <= -1.532289147) {
	      p = 1;
	    } else if (((Double) i[25]).doubleValue() > -1.532289147) {
	    p = HandSenseClassifier.N60e8c20112(i);
	    } 
	    return p;
	  }
	  static double N60e8c20112(Object []i) {
	    double p = Double.NaN;
	    if (i[27] == null) {
	      p = 1;
	    } else if (((Double) i[27]).doubleValue() <= -1.131858826) {
	      p = 1;
	    } else if (((Double) i[27]).doubleValue() > -1.131858826) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5119015b13(Object []i) {
	    double p = Double.NaN;
	    if (i[12] == null) {
	      p = 0;
	    } else if (((Double) i[12]).doubleValue() <= 1.838746905) {
	    p = HandSenseClassifier.N40a826f514(i);
	    } else if (((Double) i[12]).doubleValue() > 1.838746905) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N40a826f514(Object []i) {
	    double p = Double.NaN;
	    if (i[25] == null) {
	      p = 1;
	    } else if (((Double) i[25]).doubleValue() <= -1.685518026) {
	      p = 1;
	    } else if (((Double) i[25]).doubleValue() > -1.685518026) {
	      p = 0;
	    } 
	    return p;
	  }
	}