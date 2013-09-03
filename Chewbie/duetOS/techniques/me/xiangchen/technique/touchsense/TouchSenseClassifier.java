package me.xiangchen.technique.touchsense;

public class TouchSenseClassifier {

	  public static double classify(Object[] i) throws Exception {
	    double [] sums = new double [3];
	    sums[(int) TouchSenseClassifier_0.classify(i)] += 3.5553480614894135;
	    sums[(int) TouchSenseClassifier_1.classify(i)] += 3.228826155721388;
	    sums[(int) TouchSenseClassifier_2.classify(i)] += 3.310568669550234;
	    sums[(int) TouchSenseClassifier_3.classify(i)] += 2.5297436498403885;
	    sums[(int) TouchSenseClassifier_4.classify(i)] += 3.256208634298653;
	    sums[(int) TouchSenseClassifier_5.classify(i)] += 3.005443540566712;
	    sums[(int) TouchSenseClassifier_6.classify(i)] += 2.250448237766749;
	    sums[(int) TouchSenseClassifier_7.classify(i)] += 3.1564559763493274;
	    sums[(int) TouchSenseClassifier_8.classify(i)] += 3.3731017317565333;
	    sums[(int) TouchSenseClassifier_9.classify(i)] += 3.1662241909191775;
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
	    p = TouchSenseClassifier_0.N55bce763380(i);
	    return p;
	  }
	  static double N55bce763380(Object []i) {
	    double p = Double.NaN;
	    if (i[86] == null) {
	      p = 2;
	    } else if (((Double) i[86]).doubleValue() <= 2.3) {
	    p = TouchSenseClassifier_0.N64fb408e381(i);
	    } else if (((Double) i[86]).doubleValue() > 2.3) {
	    p = TouchSenseClassifier_0.N61245c4f383(i);
	    } 
	    return p;
	  }
	  static double N64fb408e381(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 2;
	    } else if (((Double) i[89]).doubleValue() <= -3.68) {
	      p = 2;
	    } else if (((Double) i[89]).doubleValue() > -3.68) {
	    p = TouchSenseClassifier_0.N2b4b5e6d382(i);
	    } 
	    return p;
	  }
	  static double N2b4b5e6d382(Object []i) {
	    double p = Double.NaN;
	    if (i[69] == null) {
	      p = 1;
	    } else if (((Double) i[69]).doubleValue() <= 1.88) {
	      p = 1;
	    } else if (((Double) i[69]).doubleValue() > 1.88) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N61245c4f383(Object []i) {
	    double p = Double.NaN;
	    if (i[88] == null) {
	      p = 1;
	    } else if (((Double) i[88]).doubleValue() <= -7.81) {
	      p = 1;
	    } else if (((Double) i[88]).doubleValue() > -7.81) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_1 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_1.N1a28785c384(i);
	    return p;
	  }
	  static double N1a28785c384(Object []i) {
	    double p = Double.NaN;
	    if (i[83] == null) {
	      p = 2;
	    } else if (((Double) i[83]).doubleValue() <= -4.14) {
	      p = 2;
	    } else if (((Double) i[83]).doubleValue() > -4.14) {
	    p = TouchSenseClassifier_1.N56f5ed6e385(i);
	    } 
	    return p;
	  }
	  static double N56f5ed6e385(Object []i) {
	    double p = Double.NaN;
	    if (i[41] == null) {
	      p = 1;
	    } else if (((Double) i[41]).doubleValue() <= 10.2) {
	    p = TouchSenseClassifier_1.N2bb6fd5c386(i);
	    } else if (((Double) i[41]).doubleValue() > 10.2) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N2bb6fd5c386(Object []i) {
	    double p = Double.NaN;
	    if (i[88] == null) {
	      p = 1;
	    } else if (((Double) i[88]).doubleValue() <= -5.36) {
	    p = TouchSenseClassifier_1.N7ab3b96f387(i);
	    } else if (((Double) i[88]).doubleValue() > -5.36) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7ab3b96f387(Object []i) {
	    double p = Double.NaN;
	    if (i[87] == null) {
	      p = 1;
	    } else if (((Double) i[87]).doubleValue() <= 4.14) {
	    p = TouchSenseClassifier_1.N2d536558388(i);
	    } else if (((Double) i[87]).doubleValue() > 4.14) {
	    p = TouchSenseClassifier_1.N4dfea0cf390(i);
	    } 
	    return p;
	  }
	  static double N2d536558388(Object []i) {
	    double p = Double.NaN;
	    if (i[72] == null) {
	      p = 1;
	    } else if (((Double) i[72]).doubleValue() <= 2.56) {
	    p = TouchSenseClassifier_1.N3e228ba7389(i);
	    } else if (((Double) i[72]).doubleValue() > 2.56) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3e228ba7389(Object []i) {
	    double p = Double.NaN;
	    if (i[90] == null) {
	      p = 2;
	    } else if (((Double) i[90]).doubleValue() <= 0.0235) {
	      p = 2;
	    } else if (((Double) i[90]).doubleValue() > 0.0235) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N4dfea0cf390(Object []i) {
	    double p = Double.NaN;
	    if (i[83] == null) {
	      p = 1;
	    } else if (((Double) i[83]).doubleValue() <= 2.3) {
	      p = 1;
	    } else if (((Double) i[83]).doubleValue() > 2.3) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_2 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_2.N7ef9e0a391(i);
	    return p;
	  }
	  static double N7ef9e0a391(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() <= 2.45) {
	    p = TouchSenseClassifier_2.N470a698392(i);
	    } else if (((Double) i[89]).doubleValue() > 2.45) {
	    p = TouchSenseClassifier_2.N7770c84c394(i);
	    } 
	    return p;
	  }
	  static double N470a698392(Object []i) {
	    double p = Double.NaN;
	    if (i[69] == null) {
	      p = 1;
	    } else if (((Double) i[69]).doubleValue() <= 1.23) {
	    p = TouchSenseClassifier_2.N7fc9476e393(i);
	    } else if (((Double) i[69]).doubleValue() > 1.23) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N7fc9476e393(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 2;
	    } else if (((Double) i[89]).doubleValue() <= -3.98) {
	      p = 2;
	    } else if (((Double) i[89]).doubleValue() > -3.98) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N7770c84c394(Object []i) {
	    double p = Double.NaN;
	    if (i[78] == null) {
	      p = 1;
	    } else if (((Double) i[78]).doubleValue() <= 3.83) {
	    p = TouchSenseClassifier_2.Nd6e32d7395(i);
	    } else if (((Double) i[78]).doubleValue() > 3.83) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double Nd6e32d7395(Object []i) {
	    double p = Double.NaN;
	    if (i[88] == null) {
	      p = 1;
	    } else if (((Double) i[88]).doubleValue() <= -5.21) {
	    p = TouchSenseClassifier_2.N3dcbc824396(i);
	    } else if (((Double) i[88]).doubleValue() > -5.21) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3dcbc824396(Object []i) {
	    double p = Double.NaN;
	    if (i[34] == null) {
	      p = 0;
	    } else if (((Double) i[34]).doubleValue() <= -0.21) {
	      p = 0;
	    } else if (((Double) i[34]).doubleValue() > -0.21) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_3 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_3.Ndc0d32e397(i);
	    return p;
	  }
	  static double Ndc0d32e397(Object []i) {
	    double p = Double.NaN;
	    if (i[87] == null) {
	      p = 1;
	    } else if (((Double) i[87]).doubleValue() <= 5.36) {
	    p = TouchSenseClassifier_3.N6e68780f398(i);
	    } else if (((Double) i[87]).doubleValue() > 5.36) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6e68780f398(Object []i) {
	    double p = Double.NaN;
	    if (i[86] == null) {
	      p = 1;
	    } else if (((Double) i[86]).doubleValue() <= 4.29) {
	    p = TouchSenseClassifier_3.Nca2596a399(i);
	    } else if (((Double) i[86]).doubleValue() > 4.29) {
	    p = TouchSenseClassifier_3.N709112ad403(i);
	    } 
	    return p;
	  }
	  static double Nca2596a399(Object []i) {
	    double p = Double.NaN;
	    if (i[63] == null) {
	      p = 1;
	    } else if (((Double) i[63]).doubleValue() <= 1.98) {
	    p = TouchSenseClassifier_3.N769c44a0400(i);
	    } else if (((Double) i[63]).doubleValue() > 1.98) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N769c44a0400(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 2;
	    } else if (((Double) i[89]).doubleValue() <= -5.82) {
	      p = 2;
	    } else if (((Double) i[89]).doubleValue() > -5.82) {
	    p = TouchSenseClassifier_3.Nd5da136401(i);
	    } 
	    return p;
	  }
	  static double Nd5da136401(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 1;
	    } else if (((Double) i[10]).doubleValue() <= 5.73) {
	    p = TouchSenseClassifier_3.N7e02e714402(i);
	    } else if (((Double) i[10]).doubleValue() > 5.73) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N7e02e714402(Object []i) {
	    double p = Double.NaN;
	    if (i[90] == null) {
	      p = 2;
	    } else if (((Double) i[90]).doubleValue() <= 0.0216) {
	      p = 2;
	    } else if (((Double) i[90]).doubleValue() > 0.0216) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N709112ad403(Object []i) {
	    double p = Double.NaN;
	    if (i[88] == null) {
	      p = 1;
	    } else if (((Double) i[88]).doubleValue() <= -6.44) {
	      p = 1;
	    } else if (((Double) i[88]).doubleValue() > -6.44) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_4 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_4.N44615597404(i);
	    return p;
	  }
	  static double N44615597404(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() <= 2.45) {
	    p = TouchSenseClassifier_4.N523a4f93405(i);
	    } else if (((Double) i[89]).doubleValue() > 2.45) {
	    p = TouchSenseClassifier_4.N211af1b1408(i);
	    } 
	    return p;
	  }
	  static double N523a4f93405(Object []i) {
	    double p = Double.NaN;
	    if (i[51] == null) {
	      p = 1;
	    } else if (((Double) i[51]).doubleValue() <= 0.59) {
	    p = TouchSenseClassifier_4.N723e6611406(i);
	    } else if (((Double) i[51]).doubleValue() > 0.59) {
	    p = TouchSenseClassifier_4.N5e9f20af407(i);
	    } 
	    return p;
	  }
	  static double N723e6611406(Object []i) {
	    double p = Double.NaN;
	    if (i[88] == null) {
	      p = 1;
	    } else if (((Double) i[88]).doubleValue() <= -7.2) {
	      p = 1;
	    } else if (((Double) i[88]).doubleValue() > -7.2) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N5e9f20af407(Object []i) {
	    double p = Double.NaN;
	    if (i[90] == null) {
	      p = 2;
	    } else if (((Double) i[90]).doubleValue() <= 0.0255) {
	      p = 2;
	    } else if (((Double) i[90]).doubleValue() > 0.0255) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N211af1b1408(Object []i) {
	    double p = Double.NaN;
	    if (i[87] == null) {
	      p = 1;
	    } else if (((Double) i[87]).doubleValue() <= 3.37) {
	    p = TouchSenseClassifier_4.N6ff1ac71409(i);
	    } else if (((Double) i[87]).doubleValue() > 3.37) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6ff1ac71409(Object []i) {
	    double p = Double.NaN;
	    if (i[57] == null) {
	      p = 1;
	    } else if (((Double) i[57]).doubleValue() <= 1.14) {
	      p = 1;
	    } else if (((Double) i[57]).doubleValue() > 1.14) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_5 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_5.N63706821410(i);
	    return p;
	  }
	  static double N63706821410(Object []i) {
	    double p = Double.NaN;
	    if (i[86] == null) {
	      p = 1;
	    } else if (((Double) i[86]).doubleValue() <= 4.29) {
	    p = TouchSenseClassifier_5.N68c48187411(i);
	    } else if (((Double) i[86]).doubleValue() > 4.29) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N68c48187411(Object []i) {
	    double p = Double.NaN;
	    if (i[66] == null) {
	      p = 1;
	    } else if (((Double) i[66]).doubleValue() <= 2.25) {
	    p = TouchSenseClassifier_5.N3d13fbcd412(i);
	    } else if (((Double) i[66]).doubleValue() > 2.25) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3d13fbcd412(Object []i) {
	    double p = Double.NaN;
	    if (i[87] == null) {
	      p = 1;
	    } else if (((Double) i[87]).doubleValue() <= 4.75) {
	    p = TouchSenseClassifier_5.N6af86f0e413(i);
	    } else if (((Double) i[87]).doubleValue() > 4.75) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6af86f0e413(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 2;
	    } else if (((Double) i[89]).doubleValue() <= -5.82) {
	      p = 2;
	    } else if (((Double) i[89]).doubleValue() > -5.82) {
	    p = TouchSenseClassifier_5.N5c4336ff414(i);
	    } 
	    return p;
	  }
	  static double N5c4336ff414(Object []i) {
	    double p = Double.NaN;
	    if (i[47] == null) {
	      p = 1;
	    } else if (((Double) i[47]).doubleValue() <= 10.01) {
	    p = TouchSenseClassifier_5.N40cfceab415(i);
	    } else if (((Double) i[47]).doubleValue() > 10.01) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N40cfceab415(Object []i) {
	    double p = Double.NaN;
	    if (i[68] == null) {
	      p = 2;
	    } else if (((Double) i[68]).doubleValue() <= 7.45) {
	    p = TouchSenseClassifier_5.Nb095dcb416(i);
	    } else if (((Double) i[68]).doubleValue() > 7.45) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Nb095dcb416(Object []i) {
	    double p = Double.NaN;
	    if (i[88] == null) {
	      p = 1;
	    } else if (((Double) i[88]).doubleValue() <= -8.73) {
	      p = 1;
	    } else if (((Double) i[88]).doubleValue() > -8.73) {
	      p = 2;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_6 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_6.N13ecc016417(i);
	    return p;
	  }
	  static double N13ecc016417(Object []i) {
	    double p = Double.NaN;
	    if (i[77] == null) {
	      p = 1;
	    } else if (((Double) i[77]).doubleValue() <= 7.05) {
	    p = TouchSenseClassifier_6.N1c36ee92418(i);
	    } else if (((Double) i[77]).doubleValue() > 7.05) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N1c36ee92418(Object []i) {
	    double p = Double.NaN;
	    if (i[60] == null) {
	      p = 1;
	    } else if (((Double) i[60]).doubleValue() <= 1.55) {
	    p = TouchSenseClassifier_6.N5a68c1b6419(i);
	    } else if (((Double) i[60]).doubleValue() > 1.55) {
	    p = TouchSenseClassifier_6.N67ac3d0c424(i);
	    } 
	    return p;
	  }
	  static double N5a68c1b6419(Object []i) {
	    double p = Double.NaN;
	    if (i[37] == null) {
	      p = 1;
	    } else if (((Double) i[37]).doubleValue() <= 6.21) {
	    p = TouchSenseClassifier_6.N1385c219420(i);
	    } else if (((Double) i[37]).doubleValue() > 6.21) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N1385c219420(Object []i) {
	    double p = Double.NaN;
	    if (i[85] == null) {
	      p = 1;
	    } else if (((Double) i[85]).doubleValue() <= -6.44) {
	    p = TouchSenseClassifier_6.N328a0152421(i);
	    } else if (((Double) i[85]).doubleValue() > -6.44) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N328a0152421(Object []i) {
	    double p = Double.NaN;
	    if (i[45] == null) {
	      p = 1;
	    } else if (((Double) i[45]).doubleValue() <= 0.85) {
	    p = TouchSenseClassifier_6.N25cc86a422(i);
	    } else if (((Double) i[45]).doubleValue() > 0.85) {
	    p = TouchSenseClassifier_6.N1969a85c423(i);
	    } 
	    return p;
	  }
	  static double N25cc86a422(Object []i) {
	    double p = Double.NaN;
	    if (i[88] == null) {
	      p = 1;
	    } else if (((Double) i[88]).doubleValue() <= -6.44) {
	      p = 1;
	    } else if (((Double) i[88]).doubleValue() > -6.44) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N1969a85c423(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 2;
	    } else if (((Double) i[89]).doubleValue() <= -1.23) {
	      p = 2;
	    } else if (((Double) i[89]).doubleValue() > -1.23) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N67ac3d0c424(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 2;
	    } else if (((Double) i[89]).doubleValue() <= -1.53) {
	      p = 2;
	    } else if (((Double) i[89]).doubleValue() > -1.53) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_7 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_7.N5cdc1400425(i);
	    return p;
	  }
	  static double N5cdc1400425(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 2;
	    } else if (((Double) i[89]).doubleValue() <= 2.45) {
	    p = TouchSenseClassifier_7.N74a53ba0426(i);
	    } else if (((Double) i[89]).doubleValue() > 2.45) {
	    p = TouchSenseClassifier_7.N5ba25917429(i);
	    } 
	    return p;
	  }
	  static double N74a53ba0426(Object []i) {
	    double p = Double.NaN;
	    if (i[87] == null) {
	      p = 2;
	    } else if (((Double) i[87]).doubleValue() <= -0.46) {
	      p = 2;
	    } else if (((Double) i[87]).doubleValue() > -0.46) {
	    p = TouchSenseClassifier_7.Nbedc134427(i);
	    } 
	    return p;
	  }
	  static double Nbedc134427(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 2;
	    } else if (((Double) i[89]).doubleValue() <= -3.68) {
	    p = TouchSenseClassifier_7.N2627430a428(i);
	    } else if (((Double) i[89]).doubleValue() > -3.68) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2627430a428(Object []i) {
	    double p = Double.NaN;
	    if (i[90] == null) {
	      p = 2;
	    } else if (((Double) i[90]).doubleValue() <= 0.0235) {
	      p = 2;
	    } else if (((Double) i[90]).doubleValue() > 0.0235) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5ba25917429(Object []i) {
	    double p = Double.NaN;
	    if (i[78] == null) {
	      p = 1;
	    } else if (((Double) i[78]).doubleValue() <= 3.22) {
	    p = TouchSenseClassifier_7.N7f872400430(i);
	    } else if (((Double) i[78]).doubleValue() > 3.22) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7f872400430(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() <= 7.05) {
	    p = TouchSenseClassifier_7.N14cbd69431(i);
	    } else if (((Double) i[89]).doubleValue() > 7.05) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N14cbd69431(Object []i) {
	    double p = Double.NaN;
	    if (i[51] == null) {
	      p = 1;
	    } else if (((Double) i[51]).doubleValue() <= 0.88) {
	      p = 1;
	    } else if (((Double) i[51]).doubleValue() > 0.88) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_8 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_8.N55273929432(i);
	    return p;
	  }
	  static double N55273929432(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 2;
	    } else if (((Double) i[89]).doubleValue() <= -1.23) {
	    p = TouchSenseClassifier_8.N219de6c433(i);
	    } else if (((Double) i[89]).doubleValue() > -1.23) {
	    p = TouchSenseClassifier_8.N54d9bb1435(i);
	    } 
	    return p;
	  }
	  static double N219de6c433(Object []i) {
	    double p = Double.NaN;
	    if (i[75] == null) {
	      p = 2;
	    } else if (((Double) i[75]).doubleValue() <= 4.44) {
	      p = 2;
	    } else if (((Double) i[75]).doubleValue() > 4.44) {
	    p = TouchSenseClassifier_8.N70598587434(i);
	    } 
	    return p;
	  }
	  static double N70598587434(Object []i) {
	    double p = Double.NaN;
	    if (i[42] == null) {
	      p = 1;
	    } else if (((Double) i[42]).doubleValue() <= -0.35) {
	      p = 1;
	    } else if (((Double) i[42]).doubleValue() > -0.35) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N54d9bb1435(Object []i) {
	    double p = Double.NaN;
	    if (i[78] == null) {
	      p = 1;
	    } else if (((Double) i[78]).doubleValue() <= 3.83) {
	    p = TouchSenseClassifier_8.N2a28842f436(i);
	    } else if (((Double) i[78]).doubleValue() > 3.83) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N2a28842f436(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() <= 7.05) {
	    p = TouchSenseClassifier_8.N49fe3f48437(i);
	    } else if (((Double) i[89]).doubleValue() > 7.05) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N49fe3f48437(Object []i) {
	    double p = Double.NaN;
	    if (i[66] == null) {
	      p = 1;
	    } else if (((Double) i[66]).doubleValue() <= 1.76) {
	      p = 1;
	    } else if (((Double) i[66]).doubleValue() > 1.76) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_9 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_9.N52ecb5eb438(i);
	    return p;
	  }
	  static double N52ecb5eb438(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() <= 2.45) {
	    p = TouchSenseClassifier_9.N329b81d5439(i);
	    } else if (((Double) i[89]).doubleValue() > 2.45) {
	    p = TouchSenseClassifier_9.N368c6997442(i);
	    } 
	    return p;
	  }
	  static double N329b81d5439(Object []i) {
	    double p = Double.NaN;
	    if (i[84] == null) {
	      p = 2;
	    } else if (((Double) i[84]).doubleValue() <= 2.3) {
	    p = TouchSenseClassifier_9.N7f68e0e7440(i);
	    } else if (((Double) i[84]).doubleValue() > 2.3) {
	    p = TouchSenseClassifier_9.N3e859f0a441(i);
	    } 
	    return p;
	  }
	  static double N7f68e0e7440(Object []i) {
	    double p = Double.NaN;
	    if (i[86] == null) {
	      p = 2;
	    } else if (((Double) i[86]).doubleValue() <= 0.0) {
	      p = 2;
	    } else if (((Double) i[86]).doubleValue() > 0.0) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3e859f0a441(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 2;
	    } else if (((Double) i[89]).doubleValue() <= -4.9) {
	      p = 2;
	    } else if (((Double) i[89]).doubleValue() > -4.9) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N368c6997442(Object []i) {
	    double p = Double.NaN;
	    if (i[85] == null) {
	      p = 1;
	    } else if (((Double) i[85]).doubleValue() <= -8.43) {
	      p = 1;
	    } else if (((Double) i[85]).doubleValue() > -8.43) {
	    p = TouchSenseClassifier_9.N3c68547b443(i);
	    } 
	    return p;
	  }
	  static double N3c68547b443(Object []i) {
	    double p = Double.NaN;
	    if (i[84] == null) {
	      p = 1;
	    } else if (((Double) i[84]).doubleValue() <= 3.52) {
	      p = 1;
	    } else if (((Double) i[84]).doubleValue() > 3.52) {
	      p = 0;
	    } 
	    return p;
	  }
	}

//public class TouchSenseClassifier {
//
//	  public static double classify(Object[] i) throws Exception {
//	    double [] sums = new double [3];
//	    sums[(int) TouchSenseClassifier_0.classify(i)] += 3.2865344733420083;
//	    sums[(int) TouchSenseClassifier_1.classify(i)] += 3.0637822923180176;
//	    sums[(int) TouchSenseClassifier_2.classify(i)] += 2.6448356871929897;
//	    sums[(int) TouchSenseClassifier_3.classify(i)] += 2.6297703583995227;
//	    sums[(int) TouchSenseClassifier_4.classify(i)] += 3.269959312607079;
//	    sums[(int) TouchSenseClassifier_5.classify(i)] += 5.05837550308939;
//	    sums[(int) TouchSenseClassifier_6.classify(i)] += 3.1720608177180805;
//	    sums[(int) TouchSenseClassifier_7.classify(i)] += 2.9853670738226783;
//	    sums[(int) TouchSenseClassifier_8.classify(i)] += 3.3794770007691524;
//	    sums[(int) TouchSenseClassifier_9.classify(i)] += 3.6858221053409452;
//	    double maxV = sums[0];
//	    int maxI = 0;
//	    for (int j = 1; j < 3; j++) {
//	      if (sums[j] > maxV) { maxV = sums[j]; maxI = j; }
//	    }
//	    return (double) maxI;
//	  }
//	}
//	class TouchSenseClassifier_0 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = TouchSenseClassifier_0.N50e68513310(i);
//	    return p;
//	  }
//	  static double N50e68513310(Object []i) {
//	    double p = Double.NaN;
//	    if (i[83] == null) {
//	      p = 2;
//	    } else if (((Double) i[83]).doubleValue() <= 5.36) {
//	    p = TouchSenseClassifier_0.N4e2acbe3311(i);
//	    } else if (((Double) i[83]).doubleValue() > 5.36) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	  static double N4e2acbe3311(Object []i) {
//	    double p = Double.NaN;
//	    if (i[89] == null) {
//	      p = 2;
//	    } else if (((Double) i[89]).doubleValue() <= 0.61) {
//	    p = TouchSenseClassifier_0.N5bafcc2c312(i);
//	    } else if (((Double) i[89]).doubleValue() > 0.61) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N5bafcc2c312(Object []i) {
//	    double p = Double.NaN;
//	    if (i[82] == null) {
//	      p = 1;
//	    } else if (((Double) i[82]).doubleValue() <= -8.58) {
//	      p = 1;
//	    } else if (((Double) i[82]).doubleValue() > -8.58) {
//	      p = 2;
//	    } 
//	    return p;
//	  }
//	}
//	class TouchSenseClassifier_1 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = TouchSenseClassifier_1.N72858bba313(i);
//	    return p;
//	  }
//	  static double N72858bba313(Object []i) {
//	    double p = Double.NaN;
//	    if (i[89] == null) {
//	      p = 2;
//	    } else if (((Double) i[89]).doubleValue() <= 1.38) {
//	    p = TouchSenseClassifier_1.N1d989b13314(i);
//	    } else if (((Double) i[89]).doubleValue() > 1.38) {
//	    p = TouchSenseClassifier_1.Nded0b93315(i);
//	    } 
//	    return p;
//	  }
//	  static double N1d989b13314(Object []i) {
//	    double p = Double.NaN;
//	    if (i[90] == null) {
//	      p = 2;
//	    } else if (((Double) i[90]).doubleValue() <= 0.0235) {
//	      p = 2;
//	    } else if (((Double) i[90]).doubleValue() > 0.0235) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double Nded0b93315(Object []i) {
//	    double p = Double.NaN;
//	    if (i[86] == null) {
//	      p = 1;
//	    } else if (((Double) i[86]).doubleValue() <= 6.28) {
//	    p = TouchSenseClassifier_1.N4592e709316(i);
//	    } else if (((Double) i[86]).doubleValue() > 6.28) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	  static double N4592e709316(Object []i) {
//	    double p = Double.NaN;
//	    if (i[90] == null) {
//	      p = 1;
//	    } else if (((Double) i[90]).doubleValue() <= 0.0333) {
//	    p = TouchSenseClassifier_1.N2f7e238e317(i);
//	    } else if (((Double) i[90]).doubleValue() > 0.0333) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N2f7e238e317(Object []i) {
//	    double p = Double.NaN;
//	    if (i[86] == null) {
//	      p = 1;
//	    } else if (((Double) i[86]).doubleValue() <= 4.75) {
//	      p = 1;
//	    } else if (((Double) i[86]).doubleValue() > 4.75) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	}
//	class TouchSenseClassifier_2 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = TouchSenseClassifier_2.N25057fe318(i);
//	    return p;
//	  }
//	  static double N25057fe318(Object []i) {
//	    double p = Double.NaN;
//	    if (i[88] == null) {
//	      p = 1;
//	    } else if (((Double) i[88]).doubleValue() <= -3.83) {
//	    p = TouchSenseClassifier_2.N68c0e5e1319(i);
//	    } else if (((Double) i[88]).doubleValue() > -3.83) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	  static double N68c0e5e1319(Object []i) {
//	    double p = Double.NaN;
//	    if (i[86] == null) {
//	      p = 2;
//	    } else if (((Double) i[86]).doubleValue() <= 1.23) {
//	    p = TouchSenseClassifier_2.N50344c81320(i);
//	    } else if (((Double) i[86]).doubleValue() > 1.23) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N50344c81320(Object []i) {
//	    double p = Double.NaN;
//	    if (i[79] == null) {
//	      p = 1;
//	    } else if (((Double) i[79]).doubleValue() <= -9.04) {
//	      p = 1;
//	    } else if (((Double) i[79]).doubleValue() > -9.04) {
//	      p = 2;
//	    } 
//	    return p;
//	  }
//	}
//	class TouchSenseClassifier_3 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = TouchSenseClassifier_3.N198ad24a321(i);
//	    return p;
//	  }
//	  static double N198ad24a321(Object []i) {
//	    double p = Double.NaN;
//	    if (i[89] == null) {
//	      p = 1;
//	    } else if (((Double) i[89]).doubleValue() <= 5.67) {
//	    p = TouchSenseClassifier_3.N68f4055f322(i);
//	    } else if (((Double) i[89]).doubleValue() > 5.67) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	  static double N68f4055f322(Object []i) {
//	    double p = Double.NaN;
//	    if (i[11] == null) {
//	      p = 2;
//	    } else if (((Double) i[11]).doubleValue() <= 6.57) {
//	      p = 2;
//	    } else if (((Double) i[11]).doubleValue() > 6.57) {
//	    p = TouchSenseClassifier_3.N6c8cd5cd323(i);
//	    } 
//	    return p;
//	  }
//	  static double N6c8cd5cd323(Object []i) {
//	    double p = Double.NaN;
//	    if (i[89] == null) {
//	      p = 2;
//	    } else if (((Double) i[89]).doubleValue() <= -3.06) {
//	      p = 2;
//	    } else if (((Double) i[89]).doubleValue() > -3.06) {
//	    p = TouchSenseClassifier_3.N1228bd68324(i);
//	    } 
//	    return p;
//	  }
//	  static double N1228bd68324(Object []i) {
//	    double p = Double.NaN;
//	    if (i[77] == null) {
//	      p = 1;
//	    } else if (((Double) i[77]).doubleValue() <= 5.82) {
//	    p = TouchSenseClassifier_3.N30ab0028325(i);
//	    } else if (((Double) i[77]).doubleValue() > 5.82) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	  static double N30ab0028325(Object []i) {
//	    double p = Double.NaN;
//	    if (i[23] == null) {
//	      p = 2;
//	    } else if (((Double) i[23]).doubleValue() <= 7.24) {
//	      p = 2;
//	    } else if (((Double) i[23]).doubleValue() > 7.24) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	}
//	class TouchSenseClassifier_4 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = TouchSenseClassifier_4.N2a975b0e326(i);
//	    return p;
//	  }
//	  static double N2a975b0e326(Object []i) {
//	    double p = Double.NaN;
//	    if (i[86] == null) {
//	      p = 2;
//	    } else if (((Double) i[86]).doubleValue() <= 1.69) {
//	    p = TouchSenseClassifier_4.N36db09fa327(i);
//	    } else if (((Double) i[86]).doubleValue() > 1.69) {
//	    p = TouchSenseClassifier_4.N666c1838328(i);
//	    } 
//	    return p;
//	  }
//	  static double N36db09fa327(Object []i) {
//	    double p = Double.NaN;
//	    if (i[82] == null) {
//	      p = 1;
//	    } else if (((Double) i[82]).doubleValue() <= -9.04) {
//	      p = 1;
//	    } else if (((Double) i[82]).doubleValue() > -9.04) {
//	      p = 2;
//	    } 
//	    return p;
//	  }
//	  static double N666c1838328(Object []i) {
//	    double p = Double.NaN;
//	    if (i[64] == null) {
//	      p = 0;
//	    } else if (((Double) i[64]).doubleValue() <= 3.31) {
//	    p = TouchSenseClassifier_4.N42aa3910329(i);
//	    } else if (((Double) i[64]).doubleValue() > 3.31) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N42aa3910329(Object []i) {
//	    double p = Double.NaN;
//	    if (i[86] == null) {
//	      p = 1;
//	    } else if (((Double) i[86]).doubleValue() <= 5.06) {
//	      p = 1;
//	    } else if (((Double) i[86]).doubleValue() > 5.06) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	}
//	class TouchSenseClassifier_5 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = TouchSenseClassifier_5.N35886ba1330(i);
//	    return p;
//	  }
//	  static double N35886ba1330(Object []i) {
//	    double p = Double.NaN;
//	    if (i[86] == null) {
//	      p = 1;
//	    } else if (((Double) i[86]).doubleValue() <= 4.75) {
//	    p = TouchSenseClassifier_5.Nf52327c331(i);
//	    } else if (((Double) i[86]).doubleValue() > 4.75) {
//	    p = TouchSenseClassifier_5.N58cfbd2d334(i);
//	    } 
//	    return p;
//	  }
//	  static double Nf52327c331(Object []i) {
//	    double p = Double.NaN;
//	    if (i[90] == null) {
//	      p = 2;
//	    } else if (((Double) i[90]).doubleValue() <= 0.0196) {
//	      p = 2;
//	    } else if (((Double) i[90]).doubleValue() > 0.0196) {
//	    p = TouchSenseClassifier_5.N5d7072bf332(i);
//	    } 
//	    return p;
//	  }
//	  static double N5d7072bf332(Object []i) {
//	    double p = Double.NaN;
//	    if (i[85] == null) {
//	      p = 1;
//	    } else if (((Double) i[85]).doubleValue() <= -7.35) {
//	      p = 1;
//	    } else if (((Double) i[85]).doubleValue() > -7.35) {
//	    p = TouchSenseClassifier_5.N17d8986333(i);
//	    } 
//	    return p;
//	  }
//	  static double N17d8986333(Object []i) {
//	    double p = Double.NaN;
//	    if (i[83] == null) {
//	      p = 2;
//	    } else if (((Double) i[83]).doubleValue() <= 2.15) {
//	      p = 2;
//	    } else if (((Double) i[83]).doubleValue() > 2.15) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N58cfbd2d334(Object []i) {
//	    double p = Double.NaN;
//	    if (i[50] == null) {
//	      p = 1;
//	    } else if (((Double) i[50]).doubleValue() <= 8.33) {
//	    p = TouchSenseClassifier_5.N2e8d02e8335(i);
//	    } else if (((Double) i[50]).doubleValue() > 8.33) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	  static double N2e8d02e8335(Object []i) {
//	    double p = Double.NaN;
//	    if (i[80] == null) {
//	      p = 1;
//	    } else if (((Double) i[80]).doubleValue() <= 7.51) {
//	      p = 1;
//	    } else if (((Double) i[80]).doubleValue() > 7.51) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	}
//	class TouchSenseClassifier_6 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = TouchSenseClassifier_6.N2bb9e538336(i);
//	    return p;
//	  }
//	  static double N2bb9e538336(Object []i) {
//	    double p = Double.NaN;
//	    if (i[77] == null) {
//	      p = 2;
//	    } else if (((Double) i[77]).doubleValue() <= -3.68) {
//	      p = 2;
//	    } else if (((Double) i[77]).doubleValue() > -3.68) {
//	    p = TouchSenseClassifier_6.N3977d5f5337(i);
//	    } 
//	    return p;
//	  }
//	  static double N3977d5f5337(Object []i) {
//	    double p = Double.NaN;
//	    if (i[89] == null) {
//	      p = 1;
//	    } else if (((Double) i[89]).doubleValue() <= 5.21) {
//	    p = TouchSenseClassifier_6.N6a7fe54c338(i);
//	    } else if (((Double) i[89]).doubleValue() > 5.21) {
//	    p = TouchSenseClassifier_6.N72a71733339(i);
//	    } 
//	    return p;
//	  }
//	  static double N6a7fe54c338(Object []i) {
//	    double p = Double.NaN;
//	    if (i[78] == null) {
//	      p = 1;
//	    } else if (((Double) i[78]).doubleValue() <= 3.98) {
//	      p = 1;
//	    } else if (((Double) i[78]).doubleValue() > 3.98) {
//	      p = 2;
//	    } 
//	    return p;
//	  }
//	  static double N72a71733339(Object []i) {
//	    double p = Double.NaN;
//	    if (i[65] == null) {
//	      p = 1;
//	    } else if (((Double) i[65]).doubleValue() <= 6.56) {
//	      p = 1;
//	    } else if (((Double) i[65]).doubleValue() > 6.56) {
//	    p = TouchSenseClassifier_6.N37e45013340(i);
//	    } 
//	    return p;
//	  }
//	  static double N37e45013340(Object []i) {
//	    double p = Double.NaN;
//	    if (i[88] == null) {
//	      p = 1;
//	    } else if (((Double) i[88]).doubleValue() <= -7.2) {
//	      p = 1;
//	    } else if (((Double) i[88]).doubleValue() > -7.2) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	}
//	class TouchSenseClassifier_7 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = TouchSenseClassifier_7.N6e452c0f341(i);
//	    return p;
//	  }
//	  static double N6e452c0f341(Object []i) {
//	    double p = Double.NaN;
//	    if (i[83] == null) {
//	      p = 1;
//	    } else if (((Double) i[83]).doubleValue() <= 5.36) {
//	    p = TouchSenseClassifier_7.N7f4fc557342(i);
//	    } else if (((Double) i[83]).doubleValue() > 5.36) {
//	    p = TouchSenseClassifier_7.N4e25140d343(i);
//	    } 
//	    return p;
//	  }
//	  static double N7f4fc557342(Object []i) {
//	    double p = Double.NaN;
//	    if (i[90] == null) {
//	      p = 2;
//	    } else if (((Double) i[90]).doubleValue() <= 0.0216) {
//	      p = 2;
//	    } else if (((Double) i[90]).doubleValue() > 0.0216) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N4e25140d343(Object []i) {
//	    double p = Double.NaN;
//	    if (i[90] == null) {
//	      p = 0;
//	    } else if (((Double) i[90]).doubleValue() <= 0.0333) {
//	      p = 0;
//	    } else if (((Double) i[90]).doubleValue() > 0.0333) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	}
//	class TouchSenseClassifier_8 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = TouchSenseClassifier_8.N6447898f344(i);
//	    return p;
//	  }
//	  static double N6447898f344(Object []i) {
//	    double p = Double.NaN;
//	    if (i[86] == null) {
//	      p = 2;
//	    } else if (((Double) i[86]).doubleValue() <= 0.77) {
//	    p = TouchSenseClassifier_8.N14983eb8345(i);
//	    } else if (((Double) i[86]).doubleValue() > 0.77) {
//	    p = TouchSenseClassifier_8.N173dac98346(i);
//	    } 
//	    return p;
//	  }
//	  static double N14983eb8345(Object []i) {
//	    double p = Double.NaN;
//	    if (i[85] == null) {
//	      p = 1;
//	    } else if (((Double) i[85]).doubleValue() <= -8.43) {
//	      p = 1;
//	    } else if (((Double) i[85]).doubleValue() > -8.43) {
//	      p = 2;
//	    } 
//	    return p;
//	  }
//	  static double N173dac98346(Object []i) {
//	    double p = Double.NaN;
//	    if (i[81] == null) {
//	      p = 0;
//	    } else if (((Double) i[81]).doubleValue() <= 4.29) {
//	    p = TouchSenseClassifier_8.N520e3b13347(i);
//	    } else if (((Double) i[81]).doubleValue() > 4.29) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N520e3b13347(Object []i) {
//	    double p = Double.NaN;
//	    if (i[83] == null) {
//	      p = 1;
//	    } else if (((Double) i[83]).doubleValue() <= 4.44) {
//	      p = 1;
//	    } else if (((Double) i[83]).doubleValue() > 4.44) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	}
//	class TouchSenseClassifier_9 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = TouchSenseClassifier_9.N2448867b348(i);
//	    return p;
//	  }
//	  static double N2448867b348(Object []i) {
//	    double p = Double.NaN;
//	    if (i[83] == null) {
//	      p = 2;
//	    } else if (((Double) i[83]).doubleValue() <= 1.84) {
//	    p = TouchSenseClassifier_9.N157507d9349(i);
//	    } else if (((Double) i[83]).doubleValue() > 1.84) {
//	    p = TouchSenseClassifier_9.N36564290350(i);
//	    } 
//	    return p;
//	  }
//	  static double N157507d9349(Object []i) {
//	    double p = Double.NaN;
//	    if (i[29] == null) {
//	      p = 2;
//	    } else if (((Double) i[29]).doubleValue() <= 8.74) {
//	      p = 2;
//	    } else if (((Double) i[29]).doubleValue() > 8.74) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N36564290350(Object []i) {
//	    double p = Double.NaN;
//	    if (i[86] == null) {
//	      p = 1;
//	    } else if (((Double) i[86]).doubleValue() <= 6.28) {
//	    p = TouchSenseClassifier_9.N592c17ce351(i);
//	    } else if (((Double) i[86]).doubleValue() > 6.28) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	  static double N592c17ce351(Object []i) {
//	    double p = Double.NaN;
//	    if (i[64] == null) {
//	      p = 0;
//	    } else if (((Double) i[64]).doubleValue() <= 3.31) {
//	    p = TouchSenseClassifier_9.N5dcf031e352(i);
//	    } else if (((Double) i[64]).doubleValue() > 3.31) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N5dcf031e352(Object []i) {
//	    double p = Double.NaN;
//	    if (i[88] == null) {
//	      p = 1;
//	    } else if (((Double) i[88]).doubleValue() <= -7.81) {
//	      p = 1;
//	    } else if (((Double) i[88]).doubleValue() > -7.81) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	}