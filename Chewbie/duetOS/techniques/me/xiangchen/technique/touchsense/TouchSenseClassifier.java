package me.xiangchen.technique.touchsense;

public class TouchSenseClassifier {

	  public static double classify(Object[] i) throws Exception {
	    double [] sums = new double [3];
	    sums[(int) TouchSenseClassifier_0.classify(i)] += 3.6992422411494887;
	    sums[(int) TouchSenseClassifier_1.classify(i)] += 3.5532294166291263;
	    sums[(int) TouchSenseClassifier_2.classify(i)] += 4.091652770556393;
	    sums[(int) TouchSenseClassifier_3.classify(i)] += 3.426695585745227;
	    sums[(int) TouchSenseClassifier_4.classify(i)] += 3.5354172257061953;
	    sums[(int) TouchSenseClassifier_5.classify(i)] += 4.389834121856267;
	    sums[(int) TouchSenseClassifier_6.classify(i)] += 4.036062817112102;
	    sums[(int) TouchSenseClassifier_7.classify(i)] += 3.6389187834282155;
	    sums[(int) TouchSenseClassifier_8.classify(i)] += 3.3140475843894523;
	    sums[(int) TouchSenseClassifier_9.classify(i)] += 4.466315642387451;
	    double maxV = sums[0];
	    int maxI = 0;
	    for (int j = 1; j < 3; j++) {
	      if (sums[j] > maxV) { maxV = sums[j]; maxI = j; }
	    }
	    return (double) maxI;
	  }
	}
	class TouchSenseClassifier_0 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_0.N7935c7b00(i);
	    return p;
	  }
	  static double N7935c7b00(Object []i) {
	    double p = Double.NaN;
	    if (i[80] == null) {
	      p = 2;
	    } else if (((Double) i[80]).doubleValue() <= 7.05) {
	    p = TouchSenseClassifier_0.N39c931fb1(i);
	    } else if (((Double) i[80]).doubleValue() > 7.05) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N39c931fb1(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 2;
	    } else if (((Double) i[89]).doubleValue() <= 0.61) {
	    p = TouchSenseClassifier_0.N47f073602(i);
	    } else if (((Double) i[89]).doubleValue() > 0.61) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N47f073602(Object []i) {
	    double p = Double.NaN;
	    if (i[88] == null) {
	      p = 1;
	    } else if (((Double) i[88]).doubleValue() <= -8.27) {
	      p = 1;
	    } else if (((Double) i[88]).doubleValue() > -8.27) {
	      p = 2;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_1 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_1.N7b26c8853(i);
	    return p;
	  }
	  static double N7b26c8853(Object []i) {
	    double p = Double.NaN;
	    if (i[86] == null) {
	      p = 2;
	    } else if (((Double) i[86]).doubleValue() <= 1.38) {
	      p = 2;
	    } else if (((Double) i[86]).doubleValue() > 1.38) {
	    p = TouchSenseClassifier_1.N2f36d2ed4(i);
	    } 
	    return p;
	  }
	  static double N2f36d2ed4(Object []i) {
	    double p = Double.NaN;
	    if (i[86] == null) {
	      p = 1;
	    } else if (((Double) i[86]).doubleValue() <= 6.28) {
	      p = 1;
	    } else if (((Double) i[86]).doubleValue() > 6.28) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_2 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_2.N3851ddd25(i);
	    return p;
	  }
	  static double N3851ddd25(Object []i) {
	    double p = Double.NaN;
	    if (i[86] == null) {
	      p = 1;
	    } else if (((Double) i[86]).doubleValue() <= 5.52) {
	    p = TouchSenseClassifier_2.N6ba22e16(i);
	    } else if (((Double) i[86]).doubleValue() > 5.52) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6ba22e16(Object []i) {
	    double p = Double.NaN;
	    if (i[90] == null) {
	      p = 2;
	    } else if (((Double) i[90]).doubleValue() <= 0.0235) {
	    p = TouchSenseClassifier_2.N2647e53a7(i);
	    } else if (((Double) i[90]).doubleValue() > 0.0235) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2647e53a7(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 2;
	    } else if (((Double) i[89]).doubleValue() <= 1.38) {
	    p = TouchSenseClassifier_2.N3a1a56788(i);
	    } else if (((Double) i[89]).doubleValue() > 1.38) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3a1a56788(Object []i) {
	    double p = Double.NaN;
	    if (i[38] == null) {
	      p = 2;
	    } else if (((Double) i[38]).doubleValue() <= 9.41) {
	      p = 2;
	    } else if (((Double) i[38]).doubleValue() > 9.41) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_3 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_3.N1722fe159(i);
	    return p;
	  }
	  static double N1722fe159(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 2;
	    } else if (((Double) i[89]).doubleValue() <= 1.07) {
	    p = TouchSenseClassifier_3.N7a57209010(i);
	    } else if (((Double) i[89]).doubleValue() > 1.07) {
	    p = TouchSenseClassifier_3.N6e1b0caf11(i);
	    } 
	    return p;
	  }
	  static double N7a57209010(Object []i) {
	    double p = Double.NaN;
	    if (i[85] == null) {
	      p = 1;
	    } else if (((Double) i[85]).doubleValue() <= -8.58) {
	      p = 1;
	    } else if (((Double) i[85]).doubleValue() > -8.58) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N6e1b0caf11(Object []i) {
	    double p = Double.NaN;
	    if (i[86] == null) {
	      p = 1;
	    } else if (((Double) i[86]).doubleValue() <= 6.28) {
	      p = 1;
	    } else if (((Double) i[86]).doubleValue() > 6.28) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_4 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_4.N31ddeda212(i);
	    return p;
	  }
	  static double N31ddeda212(Object []i) {
	    double p = Double.NaN;
	    if (i[83] == null) {
	      p = 2;
	    } else if (((Double) i[83]).doubleValue() <= 1.84) {
	    p = TouchSenseClassifier_4.N611c404113(i);
	    } else if (((Double) i[83]).doubleValue() > 1.84) {
	    p = TouchSenseClassifier_4.N5be9d3614(i);
	    } 
	    return p;
	  }
	  static double N611c404113(Object []i) {
	    double p = Double.NaN;
	    if (i[76] == null) {
	      p = 1;
	    } else if (((Double) i[76]).doubleValue() <= -8.89) {
	      p = 1;
	    } else if (((Double) i[76]).doubleValue() > -8.89) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N5be9d3614(Object []i) {
	    double p = Double.NaN;
	    if (i[83] == null) {
	      p = 1;
	    } else if (((Double) i[83]).doubleValue() <= 7.2) {
	      p = 1;
	    } else if (((Double) i[83]).doubleValue() > 7.2) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_5 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_5.N2543472c15(i);
	    return p;
	  }
	  static double N2543472c15(Object []i) {
	    double p = Double.NaN;
	    if (i[83] == null) {
	      p = 2;
	    } else if (((Double) i[83]).doubleValue() <= 1.99) {
	    p = TouchSenseClassifier_5.N63f5acd016(i);
	    } else if (((Double) i[83]).doubleValue() > 1.99) {
	    p = TouchSenseClassifier_5.N4674d22e18(i);
	    } 
	    return p;
	  }
	  static double N63f5acd016(Object []i) {
	    double p = Double.NaN;
	    if (i[26] == null) {
	      p = 2;
	    } else if (((Double) i[26]).doubleValue() <= 8.68) {
	      p = 2;
	    } else if (((Double) i[26]).doubleValue() > 8.68) {
	    p = TouchSenseClassifier_5.N1624bef517(i);
	    } 
	    return p;
	  }
	  static double N1624bef517(Object []i) {
	    double p = Double.NaN;
	    if (i[82] == null) {
	      p = 1;
	    } else if (((Double) i[82]).doubleValue() <= -7.66) {
	      p = 1;
	    } else if (((Double) i[82]).doubleValue() > -7.66) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N4674d22e18(Object []i) {
	    double p = Double.NaN;
	    if (i[83] == null) {
	      p = 1;
	    } else if (((Double) i[83]).doubleValue() <= 6.28) {
	      p = 1;
	    } else if (((Double) i[83]).doubleValue() > 6.28) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_6 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_6.N1f92ee2519(i);
	    return p;
	  }
	  static double N1f92ee2519(Object []i) {
	    double p = Double.NaN;
	    if (i[83] == null) {
	      p = 2;
	    } else if (((Double) i[83]).doubleValue() <= 1.23) {
	    p = TouchSenseClassifier_6.N6750cf5420(i);
	    } else if (((Double) i[83]).doubleValue() > 1.23) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6750cf5420(Object []i) {
	    double p = Double.NaN;
	    if (i[82] == null) {
	      p = 1;
	    } else if (((Double) i[82]).doubleValue() <= -9.04) {
	      p = 1;
	    } else if (((Double) i[82]).doubleValue() > -9.04) {
	      p = 2;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_7 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_7.N6a5bc8c921(i);
	    return p;
	  }
	  static double N6a5bc8c921(Object []i) {
	    double p = Double.NaN;
	    if (i[86] == null) {
	      p = 2;
	    } else if (((Double) i[86]).doubleValue() <= 5.98) {
	    p = TouchSenseClassifier_7.N2fdb3aac22(i);
	    } else if (((Double) i[86]).doubleValue() > 5.98) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N2fdb3aac22(Object []i) {
	    double p = Double.NaN;
	    if (i[85] == null) {
	      p = 1;
	    } else if (((Double) i[85]).doubleValue() <= -7.66) {
	      p = 1;
	    } else if (((Double) i[85]).doubleValue() > -7.66) {
	    p = TouchSenseClassifier_7.N61e90abf23(i);
	    } 
	    return p;
	  }
	  static double N61e90abf23(Object []i) {
	    double p = Double.NaN;
	    if (i[80] == null) {
	      p = 2;
	    } else if (((Double) i[80]).doubleValue() <= 1.69) {
	      p = 2;
	    } else if (((Double) i[80]).doubleValue() > 1.69) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_8 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_8.Nac0b3d124(i);
	    return p;
	  }
	  static double Nac0b3d124(Object []i) {
	    double p = Double.NaN;
	    if (i[88] == null) {
	      p = 2;
	    } else if (((Double) i[88]).doubleValue() <= -5.52) {
	    p = TouchSenseClassifier_8.N715d63da25(i);
	    } else if (((Double) i[88]).doubleValue() > -5.52) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N715d63da25(Object []i) {
	    double p = Double.NaN;
	    if (i[87] == null) {
	      p = 1;
	    } else if (((Double) i[87]).doubleValue() <= 3.52) {
	      p = 1;
	    } else if (((Double) i[87]).doubleValue() > 3.52) {
	      p = 2;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_9 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_9.N2a46b75b26(i);
	    return p;
	  }
	  static double N2a46b75b26(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 2;
	    } else if (((Double) i[89]).doubleValue() <= 1.38) {
	    p = TouchSenseClassifier_9.N8afcd0c27(i);
	    } else if (((Double) i[89]).doubleValue() > 1.38) {
	    p = TouchSenseClassifier_9.N2b2143d829(i);
	    } 
	    return p;
	  }
	  static double N8afcd0c27(Object []i) {
	    double p = Double.NaN;
	    if (i[79] == null) {
	      p = 2;
	    } else if (((Double) i[79]).doubleValue() <= -8.73) {
	    p = TouchSenseClassifier_9.N4dbed34828(i);
	    } else if (((Double) i[79]).doubleValue() > -8.73) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N4dbed34828(Object []i) {
	    double p = Double.NaN;
	    if (i[82] == null) {
	      p = 1;
	    } else if (((Double) i[82]).doubleValue() <= -8.43) {
	      p = 1;
	    } else if (((Double) i[82]).doubleValue() > -8.43) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N2b2143d829(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() <= 5.82) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() > 5.82) {
	      p = 0;
	    } 
	    return p;
	  }
	}