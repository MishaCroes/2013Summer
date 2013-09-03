package me.xiangchen.technique.flipsense;

public class FlipSenseClassifier {

	  public static double classify(Object[] i) throws Exception {
	    double [] sums = new double [2];
	    sums[(int) FlipSenseClassifier_0.classify(i)] += 3.7005754938771274;
	    sums[(int) FlipSenseClassifier_1.classify(i)] += 4.733270188615418;
	    sums[(int) FlipSenseClassifier_2.classify(i)] += 2.575586762982181;
	    sums[(int) FlipSenseClassifier_3.classify(i)] += 2.9759451444066105;
	    sums[(int) FlipSenseClassifier_4.classify(i)] += 3.2934271561686734;
	    sums[(int) FlipSenseClassifier_5.classify(i)] += 2.7863716066994706;
	    sums[(int) FlipSenseClassifier_6.classify(i)] += 2.820035311617424;
	    sums[(int) FlipSenseClassifier_7.classify(i)] += 3.2717621449516456;
	    sums[(int) FlipSenseClassifier_8.classify(i)] += 3.251152759917393;
	    sums[(int) FlipSenseClassifier_9.classify(i)] += 3.189999682364796;
	    double maxV = sums[0];
	    int maxI = 0;
	    for (int j = 1; j < 2; j++) {
	      if (sums[j] > maxV) { maxV = sums[j]; maxI = j; }
	    }
	    return (double) maxI;
	  }
	}
	class FlipSenseClassifier_0 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_0.N4541139c240(i);
	    return p;
	  }
	  static double N4541139c240(Object []i) {
	    double p = Double.NaN;
	    if (i[122] == null) {
	      p = 0;
	    } else if (((Double) i[122]).doubleValue() <= 1.38) {
	      p = 0;
	    } else if (((Double) i[122]).doubleValue() > 1.38) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_1 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_1.N336e8a49241(i);
	    return p;
	  }
	  static double N336e8a49241(Object []i) {
	    double p = Double.NaN;
	    if (i[125] == null) {
	      p = 0;
	    } else if (((Double) i[125]).doubleValue() <= -5.36) {
	      p = 0;
	    } else if (((Double) i[125]).doubleValue() > -5.36) {
	    p = FlipSenseClassifier_1.N1e38d900242(i);
	    } 
	    return p;
	  }
	  static double N1e38d900242(Object []i) {
	    double p = Double.NaN;
	    if (i[113] == null) {
	      p = 0;
	    } else if (((Double) i[113]).doubleValue() <= -9.04) {
	      p = 0;
	    } else if (((Double) i[113]).doubleValue() > -9.04) {
	    p = FlipSenseClassifier_1.N262e9e80243(i);
	    } 
	    return p;
	  }
	  static double N262e9e80243(Object []i) {
	    double p = Double.NaN;
	    if (i[119] == null) {
	      p = 0;
	    } else if (((Double) i[119]).doubleValue() <= -4.9) {
	      p = 0;
	    } else if (((Double) i[119]).doubleValue() > -4.9) {
	    p = FlipSenseClassifier_1.N3ea7f915244(i);
	    } 
	    return p;
	  }
	  static double N3ea7f915244(Object []i) {
	    double p = Double.NaN;
	    if (i[111] == null) {
	      p = 0;
	    } else if (((Double) i[111]).doubleValue() <= 0.0) {
	      p = 0;
	    } else if (((Double) i[111]).doubleValue() > 0.0) {
	    p = FlipSenseClassifier_1.N5d1f1d6245(i);
	    } 
	    return p;
	  }
	  static double N5d1f1d6245(Object []i) {
	    double p = Double.NaN;
	    if (i[80] == null) {
	      p = 1;
	    } else if (((Double) i[80]).doubleValue() <= 9.81) {
	      p = 1;
	    } else if (((Double) i[80]).doubleValue() > 9.81) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_2 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_2.N1a5c1b96246(i);
	    return p;
	  }
	  static double N1a5c1b96246(Object []i) {
	    double p = Double.NaN;
	    if (i[125] == null) {
	      p = 0;
	    } else if (((Double) i[125]).doubleValue() <= 1.07) {
	    p = FlipSenseClassifier_2.N1517225f247(i);
	    } else if (((Double) i[125]).doubleValue() > 1.07) {
	    p = FlipSenseClassifier_2.N46c1121e249(i);
	    } 
	    return p;
	  }
	  static double N1517225f247(Object []i) {
	    double p = Double.NaN;
	    if (i[113] == null) {
	      p = 1;
	    } else if (((Double) i[113]).doubleValue() <= -1.84) {
	      p = 1;
	    } else if (((Double) i[113]).doubleValue() > -1.84) {
	    p = FlipSenseClassifier_2.N21d195ca248(i);
	    } 
	    return p;
	  }
	  static double N21d195ca248(Object []i) {
	    double p = Double.NaN;
	    if (i[77] == null) {
	      p = 0;
	    } else if (((Double) i[77]).doubleValue() <= 9.49) {
	      p = 0;
	    } else if (((Double) i[77]).doubleValue() > 9.49) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N46c1121e249(Object []i) {
	    double p = Double.NaN;
	    if (i[113] == null) {
	      p = 0;
	    } else if (((Double) i[113]).doubleValue() <= -9.5) {
	      p = 0;
	    } else if (((Double) i[113]).doubleValue() > -9.5) {
	    p = FlipSenseClassifier_2.N2d8c93dc250(i);
	    } 
	    return p;
	  }
	  static double N2d8c93dc250(Object []i) {
	    double p = Double.NaN;
	    if (i[77] == null) {
	      p = 1;
	    } else if (((Double) i[77]).doubleValue() <= 9.64) {
	      p = 1;
	    } else if (((Double) i[77]).doubleValue() > 9.64) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_3 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_3.N683f67e0251(i);
	    return p;
	  }
	  static double N683f67e0251(Object []i) {
	    double p = Double.NaN;
	    if (i[121] == null) {
	      p = 1;
	    } else if (((Double) i[121]).doubleValue() <= -13.02) {
	      p = 1;
	    } else if (((Double) i[121]).doubleValue() > -13.02) {
	    p = FlipSenseClassifier_3.N1abcd898252(i);
	    } 
	    return p;
	  }
	  static double N1abcd898252(Object []i) {
	    double p = Double.NaN;
	    if (i[122] == null) {
	      p = 0;
	    } else if (((Double) i[122]).doubleValue() <= -2.6) {
	      p = 0;
	    } else if (((Double) i[122]).doubleValue() > -2.6) {
	    p = FlipSenseClassifier_3.N642ff0de253(i);
	    } 
	    return p;
	  }
	  static double N642ff0de253(Object []i) {
	    double p = Double.NaN;
	    if (i[125] == null) {
	      p = 0;
	    } else if (((Double) i[125]).doubleValue() <= -4.6) {
	      p = 0;
	    } else if (((Double) i[125]).doubleValue() > -4.6) {
	    p = FlipSenseClassifier_3.N76eb235254(i);
	    } 
	    return p;
	  }
	  static double N76eb235254(Object []i) {
	    double p = Double.NaN;
	    if (i[24] == null) {
	      p = 0;
	    } else if (((Double) i[24]).doubleValue() <= 0.25) {
	    p = FlipSenseClassifier_3.N7475b962255(i);
	    } else if (((Double) i[24]).doubleValue() > 0.25) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N7475b962255(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() <= 9.29) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() > 9.29) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_4 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_4.N5cde0ca9256(i);
	    return p;
	  }
	  static double N5cde0ca9256(Object []i) {
	    double p = Double.NaN;
	    if (i[130] == null) {
	      p = 0;
	    } else if (((Double) i[130]).doubleValue() <= 0.15) {
	    p = FlipSenseClassifier_4.N76115ae0257(i);
	    } else if (((Double) i[130]).doubleValue() > 0.15) {
	    p = FlipSenseClassifier_4.N1bb5139e259(i);
	    } 
	    return p;
	  }
	  static double N76115ae0257(Object []i) {
	    double p = Double.NaN;
	    if (i[119] == null) {
	      p = 0;
	    } else if (((Double) i[119]).doubleValue() <= 5.21) {
	      p = 0;
	    } else if (((Double) i[119]).doubleValue() > 5.21) {
	    p = FlipSenseClassifier_4.N6d6564ae258(i);
	    } 
	    return p;
	  }
	  static double N6d6564ae258(Object []i) {
	    double p = Double.NaN;
	    if (i[125] == null) {
	      p = 0;
	    } else if (((Double) i[125]).doubleValue() <= 0.15) {
	      p = 0;
	    } else if (((Double) i[125]).doubleValue() > 0.15) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N1bb5139e259(Object []i) {
	    double p = Double.NaN;
	    if (i[93] == null) {
	      p = 0;
	    } else if (((Double) i[93]).doubleValue() <= 0.05) {
	      p = 0;
	    } else if (((Double) i[93]).doubleValue() > 0.05) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_5 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_5.Nd1af848260(i);
	    return p;
	  }
	  static double Nd1af848260(Object []i) {
	    double p = Double.NaN;
	    if (i[105] == null) {
	      p = 0;
	    } else if (((Double) i[105]).doubleValue() <= 1.02) {
	    p = FlipSenseClassifier_5.N65a245b0261(i);
	    } else if (((Double) i[105]).doubleValue() > 1.02) {
	    p = FlipSenseClassifier_5.N4afaddb2264(i);
	    } 
	    return p;
	  }
	  static double N65a245b0261(Object []i) {
	    double p = Double.NaN;
	    if (i[112] == null) {
	      p = 1;
	    } else if (((Double) i[112]).doubleValue() <= -7.35) {
	    p = FlipSenseClassifier_5.N8d59f1262(i);
	    } else if (((Double) i[112]).doubleValue() > -7.35) {
	    p = FlipSenseClassifier_5.N400bdd7f263(i);
	    } 
	    return p;
	  }
	  static double N8d59f1262(Object []i) {
	    double p = Double.NaN;
	    if (i[91] == null) {
	      p = 0;
	    } else if (((Double) i[91]).doubleValue() <= 3.09) {
	      p = 0;
	    } else if (((Double) i[91]).doubleValue() > 3.09) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N400bdd7f263(Object []i) {
	    double p = Double.NaN;
	    if (i[101] == null) {
	      p = 0;
	    } else if (((Double) i[101]).doubleValue() <= 9.64) {
	      p = 0;
	    } else if (((Double) i[101]).doubleValue() > 9.64) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N4afaddb2264(Object []i) {
	    double p = Double.NaN;
	    if (i[122] == null) {
	      p = 0;
	    } else if (((Double) i[122]).doubleValue() <= -2.76) {
	      p = 0;
	    } else if (((Double) i[122]).doubleValue() > -2.76) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_6 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_6.N1bf0f793265(i);
	    return p;
	  }
	  static double N1bf0f793265(Object []i) {
	    double p = Double.NaN;
	    if (i[122] == null) {
	      p = 0;
	    } else if (((Double) i[122]).doubleValue() <= -5.36) {
	    p = FlipSenseClassifier_6.N690de239266(i);
	    } else if (((Double) i[122]).doubleValue() > -5.36) {
	    p = FlipSenseClassifier_6.Ne7f4211267(i);
	    } 
	    return p;
	  }
	  static double N690de239266(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 0;
	    } else if (((Double) i[89]).doubleValue() <= 9.38) {
	      p = 0;
	    } else if (((Double) i[89]).doubleValue() > 9.38) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Ne7f4211267(Object []i) {
	    double p = Double.NaN;
	    if (i[111] == null) {
	      p = 0;
	    } else if (((Double) i[111]).doubleValue() <= 0.31) {
	      p = 0;
	    } else if (((Double) i[111]).doubleValue() > 0.31) {
	    p = FlipSenseClassifier_6.N44ca7186268(i);
	    } 
	    return p;
	  }
	  static double N44ca7186268(Object []i) {
	    double p = Double.NaN;
	    if (i[86] == null) {
	      p = 1;
	    } else if (((Double) i[86]).doubleValue() <= 9.41) {
	      p = 1;
	    } else if (((Double) i[86]).doubleValue() > 9.41) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_7 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_7.N46e337b2269(i);
	    return p;
	  }
	  static double N46e337b2269(Object []i) {
	    double p = Double.NaN;
	    if (i[119] == null) {
	      p = 0;
	    } else if (((Double) i[119]).doubleValue() <= -0.31) {
	      p = 0;
	    } else if (((Double) i[119]).doubleValue() > -0.31) {
	    p = FlipSenseClassifier_7.N6f5dab79270(i);
	    } 
	    return p;
	  }
	  static double N6f5dab79270(Object []i) {
	    double p = Double.NaN;
	    if (i[125] == null) {
	      p = 0;
	    } else if (((Double) i[125]).doubleValue() <= 1.07) {
	    p = FlipSenseClassifier_7.N6ea4ce0d271(i);
	    } else if (((Double) i[125]).doubleValue() > 1.07) {
	    p = FlipSenseClassifier_7.N5d3f03b272(i);
	    } 
	    return p;
	  }
	  static double N6ea4ce0d271(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= 0.6) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() > 0.6) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5d3f03b272(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() <= 9.63) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() > 9.63) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_8 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_8.N1d40b47a273(i);
	    return p;
	  }
	  static double N1d40b47a273(Object []i) {
	    double p = Double.NaN;
	    if (i[105] == null) {
	      p = 1;
	    } else if (((Double) i[105]).doubleValue() <= -0.37) {
	      p = 1;
	    } else if (((Double) i[105]).doubleValue() > -0.37) {
	    p = FlipSenseClassifier_8.N308c497274(i);
	    } 
	    return p;
	  }
	  static double N308c497274(Object []i) {
	    double p = Double.NaN;
	    if (i[111] == null) {
	      p = 0;
	    } else if (((Double) i[111]).doubleValue() <= 4.6) {
	    p = FlipSenseClassifier_8.N34a2970f275(i);
	    } else if (((Double) i[111]).doubleValue() > 4.6) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N34a2970f275(Object []i) {
	    double p = Double.NaN;
	    if (i[119] == null) {
	      p = 0;
	    } else if (((Double) i[119]).doubleValue() <= 5.21) {
	    p = FlipSenseClassifier_8.N1e6b74c8276(i);
	    } else if (((Double) i[119]).doubleValue() > 5.21) {
	    p = FlipSenseClassifier_8.N1ece988a278(i);
	    } 
	    return p;
	  }
	  static double N1e6b74c8276(Object []i) {
	    double p = Double.NaN;
	    if (i[126] == null) {
	      p = 0;
	    } else if (((Double) i[126]).doubleValue() <= 4.14) {
	      p = 0;
	    } else if (((Double) i[126]).doubleValue() > 4.14) {
	    p = FlipSenseClassifier_8.N20c00612277(i);
	    } 
	    return p;
	  }
	  static double N20c00612277(Object []i) {
	    double p = Double.NaN;
	    if (i[126] == null) {
	      p = 1;
	    } else if (((Double) i[126]).doubleValue() <= 4.6) {
	      p = 1;
	    } else if (((Double) i[126]).doubleValue() > 4.6) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N1ece988a278(Object []i) {
	    double p = Double.NaN;
	    if (i[127] == null) {
	      p = 0;
	    } else if (((Double) i[127]).doubleValue() <= -6.59) {
	      p = 0;
	    } else if (((Double) i[127]).doubleValue() > -6.59) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_9 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_9.Nd809bd3279(i);
	    return p;
	  }
	  static double Nd809bd3279(Object []i) {
	    double p = Double.NaN;
	    if (i[44] == null) {
	      p = 0;
	    } else if (((Double) i[44]).doubleValue() <= 9.65) {
	    p = FlipSenseClassifier_9.N76764091280(i);
	    } else if (((Double) i[44]).doubleValue() > 9.65) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N76764091280(Object []i) {
	    double p = Double.NaN;
	    if (i[44] == null) {
	      p = 1;
	    } else if (((Double) i[44]).doubleValue() <= 9.05) {
	    p = FlipSenseClassifier_9.N4d892c59281(i);
	    } else if (((Double) i[44]).doubleValue() > 9.05) {
	    p = FlipSenseClassifier_9.N3ec7d45e283(i);
	    } 
	    return p;
	  }
	  static double N4d892c59281(Object []i) {
	    double p = Double.NaN;
	    if (i[119] == null) {
	      p = 0;
	    } else if (((Double) i[119]).doubleValue() <= -4.9) {
	      p = 0;
	    } else if (((Double) i[119]).doubleValue() > -4.9) {
	    p = FlipSenseClassifier_9.N68beaed3282(i);
	    } 
	    return p;
	  }
	  static double N68beaed3282(Object []i) {
	    double p = Double.NaN;
	    if (i[128] == null) {
	      p = 0;
	    } else if (((Double) i[128]).doubleValue() <= 2.45) {
	      p = 0;
	    } else if (((Double) i[128]).doubleValue() > 2.45) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3ec7d45e283(Object []i) {
	    double p = Double.NaN;
	    if (i[130] == null) {
	      p = 0;
	    } else if (((Double) i[130]).doubleValue() <= -4.75) {
	    p = FlipSenseClassifier_9.N31478785284(i);
	    } else if (((Double) i[130]).doubleValue() > -4.75) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N31478785284(Object []i) {
	    double p = Double.NaN;
	    if (i[125] == null) {
	      p = 0;
	    } else if (((Double) i[125]).doubleValue() <= 4.29) {
	      p = 0;
	    } else if (((Double) i[125]).doubleValue() > 4.29) {
	      p = 1;
	    } 
	    return p;
	  }
	}


//public class FlipSenseClassifier {
//
//	  public static double classify(Object[] i) throws Exception {
//	    double [] sums = new double [2];
//	    sums[(int) FlipSenseClassifier_0.classify(i)] += 3.0155349008501706;
//	    sums[(int) FlipSenseClassifier_1.classify(i)] += 2.3978952727983645;
//	    sums[(int) FlipSenseClassifier_2.classify(i)] += 2.719131705406914;
//	    sums[(int) FlipSenseClassifier_3.classify(i)] += 3.4495955426905356;
//	    sums[(int) FlipSenseClassifier_4.classify(i)] += 2.7206458748092968;
//	    sums[(int) FlipSenseClassifier_5.classify(i)] += 2.854326095425519;
//	    sums[(int) FlipSenseClassifier_6.classify(i)] += 2.7331741621063097;
//	    sums[(int) FlipSenseClassifier_7.classify(i)] += 2.98190956296014;
//	    sums[(int) FlipSenseClassifier_8.classify(i)] += 2.297358926901247;
//	    sums[(int) FlipSenseClassifier_9.classify(i)] += 2.05222665220725;
//	    double maxV = sums[0];
//	    int maxI = 0;
//	    for (int j = 1; j < 2; j++) {
//	      if (sums[j] > maxV) { maxV = sums[j]; maxI = j; }
//	    }
//	    return (double) maxI;
//	  }
//	}
//	class FlipSenseClassifier_0 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = FlipSenseClassifier_0.N24360ac1353(i);
//	    return p;
//	  }
//	  static double N24360ac1353(Object []i) {
//	    double p = Double.NaN;
//	    if (i[131] == null) {
//	      p = 1;
//	    } else if (((Double) i[131]).doubleValue() <= 4.9) {
//	      p = 1;
//	    } else if (((Double) i[131]).doubleValue() > 4.9) {
//	    p = FlipSenseClassifier_0.N57fc1779354(i);
//	    } 
//	    return p;
//	  }
//	  static double N57fc1779354(Object []i) {
//	    double p = Double.NaN;
//	    if (i[116] == null) {
//	      p = 0;
//	    } else if (((Double) i[116]).doubleValue() <= -0.46) {
//	      p = 0;
//	    } else if (((Double) i[116]).doubleValue() > -0.46) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	}
//	class FlipSenseClassifier_1 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = FlipSenseClassifier_1.N6769360f355(i);
//	    return p;
//	  }
//	  static double N6769360f355(Object []i) {
//	    double p = Double.NaN;
//	    if (i[121] == null) {
//	      p = 1;
//	    } else if (((Double) i[121]).doubleValue() <= -5.82) {
//	    p = FlipSenseClassifier_1.N2c5c47d3356(i);
//	    } else if (((Double) i[121]).doubleValue() > -5.82) {
//	    p = FlipSenseClassifier_1.N5e6f8465357(i);
//	    } 
//	    return p;
//	  }
//	  static double N2c5c47d3356(Object []i) {
//	    double p = Double.NaN;
//	    if (i[116] == null) {
//	      p = 0;
//	    } else if (((Double) i[116]).doubleValue() <= -5.06) {
//	      p = 0;
//	    } else if (((Double) i[116]).doubleValue() > -5.06) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N5e6f8465357(Object []i) {
//	    double p = Double.NaN;
//	    if (i[48] == null) {
//	      p = 0;
//	    } else if (((Double) i[48]).doubleValue() <= 0.61) {
//	      p = 0;
//	    } else if (((Double) i[48]).doubleValue() > 0.61) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	}
//	class FlipSenseClassifier_2 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = FlipSenseClassifier_2.N6b5d3352358(i);
//	    return p;
//	  }
//	  static double N6b5d3352358(Object []i) {
//	    double p = Double.NaN;
//	    if (i[5] == null) {
//	      p = 1;
//	    } else if (((Double) i[5]).doubleValue() <= 9.7) {
//	    p = FlipSenseClassifier_2.N33d4838f359(i);
//	    } else if (((Double) i[5]).doubleValue() > 9.7) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	  static double N33d4838f359(Object []i) {
//	    double p = Double.NaN;
//	    if (i[121] == null) {
//	      p = 1;
//	    } else if (((Double) i[121]).doubleValue() <= -3.06) {
//	    p = FlipSenseClassifier_2.N45093bde360(i);
//	    } else if (((Double) i[121]).doubleValue() > -3.06) {
//	    p = FlipSenseClassifier_2.N9ea5ab4362(i);
//	    } 
//	    return p;
//	  }
//	  static double N45093bde360(Object []i) {
//	    double p = Double.NaN;
//	    if (i[118] == null) {
//	      p = 1;
//	    } else if (((Double) i[118]).doubleValue() <= -3.37) {
//	    p = FlipSenseClassifier_2.N61398f3a361(i);
//	    } else if (((Double) i[118]).doubleValue() > -3.37) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	  static double N61398f3a361(Object []i) {
//	    double p = Double.NaN;
//	    if (i[116] == null) {
//	      p = 0;
//	    } else if (((Double) i[116]).doubleValue() <= -7.81) {
//	      p = 0;
//	    } else if (((Double) i[116]).doubleValue() > -7.81) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N9ea5ab4362(Object []i) {
//	    double p = Double.NaN;
//	    if (i[33] == null) {
//	      p = 1;
//	    } else if (((Double) i[33]).doubleValue() <= -0.34) {
//	      p = 1;
//	    } else if (((Double) i[33]).doubleValue() > -0.34) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	}
//	class FlipSenseClassifier_3 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = FlipSenseClassifier_3.N78e8e481363(i);
//	    return p;
//	  }
//	  static double N78e8e481363(Object []i) {
//	    double p = Double.NaN;
//	    if (i[128] == null) {
//	      p = 1;
//	    } else if (((Double) i[128]).doubleValue() <= 6.28) {
//	      p = 1;
//	    } else if (((Double) i[128]).doubleValue() > 6.28) {
//	    p = FlipSenseClassifier_3.N1f20f2b364(i);
//	    } 
//	    return p;
//	  }
//	  static double N1f20f2b364(Object []i) {
//	    double p = Double.NaN;
//	    if (i[113] == null) {
//	      p = 0;
//	    } else if (((Double) i[113]).doubleValue() <= -2.3) {
//	      p = 0;
//	    } else if (((Double) i[113]).doubleValue() > -2.3) {
//	    p = FlipSenseClassifier_3.N3ac1d10c365(i);
//	    } 
//	    return p;
//	  }
//	  static double N3ac1d10c365(Object []i) {
//	    double p = Double.NaN;
//	    if (i[75] == null) {
//	      p = 0;
//	    } else if (((Double) i[75]).doubleValue() <= 0.13) {
//	    p = FlipSenseClassifier_3.Na8388f7366(i);
//	    } else if (((Double) i[75]).doubleValue() > 0.13) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double Na8388f7366(Object []i) {
//	    double p = Double.NaN;
//	    if (i[34] == null) {
//	      p = 0;
//	    } else if (((Double) i[34]).doubleValue() <= 2.18) {
//	      p = 0;
//	    } else if (((Double) i[34]).doubleValue() > 2.18) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	}
//	class FlipSenseClassifier_4 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = FlipSenseClassifier_4.N41951585367(i);
//	    return p;
//	  }
//	  static double N41951585367(Object []i) {
//	    double p = Double.NaN;
//	    if (i[125] == null) {
//	      p = 1;
//	    } else if (((Double) i[125]).doubleValue() <= 7.51) {
//	      p = 1;
//	    } else if (((Double) i[125]).doubleValue() > 7.51) {
//	    p = FlipSenseClassifier_4.N22b7f066368(i);
//	    } 
//	    return p;
//	  }
//	  static double N22b7f066368(Object []i) {
//	    double p = Double.NaN;
//	    if (i[110] == null) {
//	      p = 0;
//	    } else if (((Double) i[110]).doubleValue() <= 8.66) {
//	      p = 0;
//	    } else if (((Double) i[110]).doubleValue() > 8.66) {
//	    p = FlipSenseClassifier_4.N5a07ca58369(i);
//	    } 
//	    return p;
//	  }
//	  static double N5a07ca58369(Object []i) {
//	    double p = Double.NaN;
//	    if (i[116] == null) {
//	      p = 0;
//	    } else if (((Double) i[116]).doubleValue() <= -2.15) {
//	      p = 0;
//	    } else if (((Double) i[116]).doubleValue() > -2.15) {
//	    p = FlipSenseClassifier_4.N35758595370(i);
//	    } 
//	    return p;
//	  }
//	  static double N35758595370(Object []i) {
//	    double p = Double.NaN;
//	    if (i[118] == null) {
//	      p = 1;
//	    } else if (((Double) i[118]).doubleValue() <= -4.29) {
//	      p = 1;
//	    } else if (((Double) i[118]).doubleValue() > -4.29) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	}
//	class FlipSenseClassifier_5 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = FlipSenseClassifier_5.N3695149e371(i);
//	    return p;
//	  }
//	  static double N3695149e371(Object []i) {
//	    double p = Double.NaN;
//	    if (i[119] == null) {
//	      p = 0;
//	    } else if (((Double) i[119]).doubleValue() <= 8.27) {
//	    p = FlipSenseClassifier_5.N757cad10372(i);
//	    } else if (((Double) i[119]).doubleValue() > 8.27) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N757cad10372(Object []i) {
//	    double p = Double.NaN;
//	    if (i[131] == null) {
//	      p = 1;
//	    } else if (((Double) i[131]).doubleValue() <= 6.9) {
//	      p = 1;
//	    } else if (((Double) i[131]).doubleValue() > 6.9) {
//	    p = FlipSenseClassifier_5.N4c4631b2373(i);
//	    } 
//	    return p;
//	  }
//	  static double N4c4631b2373(Object []i) {
//	    double p = Double.NaN;
//	    if (i[21] == null) {
//	      p = 0;
//	    } else if (((Double) i[21]).doubleValue() <= 0.65) {
//	    p = FlipSenseClassifier_5.N1468c43d374(i);
//	    } else if (((Double) i[21]).doubleValue() > 0.65) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N1468c43d374(Object []i) {
//	    double p = Double.NaN;
//	    if (i[84] == null) {
//	      p = 1;
//	    } else if (((Double) i[84]).doubleValue() <= -1.01) {
//	      p = 1;
//	    } else if (((Double) i[84]).doubleValue() > -1.01) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	}
//	class FlipSenseClassifier_6 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = FlipSenseClassifier_6.N6a2b8b42375(i);
//	    return p;
//	  }
//	  static double N6a2b8b42375(Object []i) {
//	    double p = Double.NaN;
//	    if (i[129] == null) {
//	      p = 1;
//	    } else if (((Double) i[129]).doubleValue() <= -0.77) {
//	      p = 1;
//	    } else if (((Double) i[129]).doubleValue() > -0.77) {
//	    p = FlipSenseClassifier_6.N50c3d082376(i);
//	    } 
//	    return p;
//	  }
//	  static double N50c3d082376(Object []i) {
//	    double p = Double.NaN;
//	    if (i[72] == null) {
//	      p = 0;
//	    } else if (((Double) i[72]).doubleValue() <= 0.45) {
//	    p = FlipSenseClassifier_6.N67ae303a377(i);
//	    } else if (((Double) i[72]).doubleValue() > 0.45) {
//	    p = FlipSenseClassifier_6.N19663589381(i);
//	    } 
//	    return p;
//	  }
//	  static double N67ae303a377(Object []i) {
//	    double p = Double.NaN;
//	    if (i[83] == null) {
//	      p = 0;
//	    } else if (((Double) i[83]).doubleValue() <= 9.54) {
//	    p = FlipSenseClassifier_6.N5ce06503378(i);
//	    } else if (((Double) i[83]).doubleValue() > 9.54) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N5ce06503378(Object []i) {
//	    double p = Double.NaN;
//	    if (i[66] == null) {
//	      p = 0;
//	    } else if (((Double) i[66]).doubleValue() <= 0.59) {
//	    p = FlipSenseClassifier_6.N1007d798379(i);
//	    } else if (((Double) i[66]).doubleValue() > 0.59) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N1007d798379(Object []i) {
//	    double p = Double.NaN;
//	    if (i[112] == null) {
//	      p = 0;
//	    } else if (((Double) i[112]).doubleValue() <= -4.14) {
//	      p = 0;
//	    } else if (((Double) i[112]).doubleValue() > -4.14) {
//	    p = FlipSenseClassifier_6.N72db4460380(i);
//	    } 
//	    return p;
//	  }
//	  static double N72db4460380(Object []i) {
//	    double p = Double.NaN;
//	    if (i[1] == null) {
//	      p = 0;
//	    } else if (((Double) i[1]).doubleValue() <= 1.07) {
//	      p = 0;
//	    } else if (((Double) i[1]).doubleValue() > 1.07) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N19663589381(Object []i) {
//	    double p = Double.NaN;
//	    if (i[101] == null) {
//	      p = 1;
//	    } else if (((Double) i[101]).doubleValue() <= 9.21) {
//	      p = 1;
//	    } else if (((Double) i[101]).doubleValue() > 9.21) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	}
//	class FlipSenseClassifier_7 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = FlipSenseClassifier_7.N544c266382(i);
//	    return p;
//	  }
//	  static double N544c266382(Object []i) {
//	    double p = Double.NaN;
//	    if (i[116] == null) {
//	      p = 0;
//	    } else if (((Double) i[116]).doubleValue() <= -7.66) {
//	      p = 0;
//	    } else if (((Double) i[116]).doubleValue() > -7.66) {
//	    p = FlipSenseClassifier_7.N6536b93d383(i);
//	    } 
//	    return p;
//	  }
//	  static double N6536b93d383(Object []i) {
//	    double p = Double.NaN;
//	    if (i[117] == null) {
//	      p = 1;
//	    } else if (((Double) i[117]).doubleValue() <= 3.37) {
//	    p = FlipSenseClassifier_7.N6bbb87b4384(i);
//	    } else if (((Double) i[117]).doubleValue() > 3.37) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	  static double N6bbb87b4384(Object []i) {
//	    double p = Double.NaN;
//	    if (i[5] == null) {
//	      p = 1;
//	    } else if (((Double) i[5]).doubleValue() <= 9.66) {
//	    p = FlipSenseClassifier_7.N64ca71ad385(i);
//	    } else if (((Double) i[5]).doubleValue() > 9.66) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	  static double N64ca71ad385(Object []i) {
//	    double p = Double.NaN;
//	    if (i[118] == null) {
//	      p = 1;
//	    } else if (((Double) i[118]).doubleValue() <= -3.37) {
//	    p = FlipSenseClassifier_7.N26ed488d386(i);
//	    } else if (((Double) i[118]).doubleValue() > -3.37) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	  static double N26ed488d386(Object []i) {
//	    double p = Double.NaN;
//	    if (i[113] == null) {
//	      p = 1;
//	    } else if (((Double) i[113]).doubleValue() <= -5.21) {
//	    p = FlipSenseClassifier_7.N243634f2387(i);
//	    } else if (((Double) i[113]).doubleValue() > -5.21) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N243634f2387(Object []i) {
//	    double p = Double.NaN;
//	    if (i[19] == null) {
//	      p = 0;
//	    } else if (((Double) i[19]).doubleValue() <= 2.54) {
//	      p = 0;
//	    } else if (((Double) i[19]).doubleValue() > 2.54) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	}
//	class FlipSenseClassifier_8 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = FlipSenseClassifier_8.N62ce0e70388(i);
//	    return p;
//	  }
//	  static double N62ce0e70388(Object []i) {
//	    double p = Double.NaN;
//	    if (i[116] == null) {
//	      p = 0;
//	    } else if (((Double) i[116]).doubleValue() <= -9.35) {
//	      p = 0;
//	    } else if (((Double) i[116]).doubleValue() > -9.35) {
//	    p = FlipSenseClassifier_8.N46160dbd389(i);
//	    } 
//	    return p;
//	  }
//	  static double N46160dbd389(Object []i) {
//	    double p = Double.NaN;
//	    if (i[114] == null) {
//	      p = 1;
//	    } else if (((Double) i[114]).doubleValue() <= 2.91) {
//	    p = FlipSenseClassifier_8.N51e0173d390(i);
//	    } else if (((Double) i[114]).doubleValue() > 2.91) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	  static double N51e0173d390(Object []i) {
//	    double p = Double.NaN;
//	    if (i[8] == null) {
//	      p = 1;
//	    } else if (((Double) i[8]).doubleValue() <= 9.33) {
//	    p = FlipSenseClassifier_8.N4f15cfc9391(i);
//	    } else if (((Double) i[8]).doubleValue() > 9.33) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	  static double N4f15cfc9391(Object []i) {
//	    double p = Double.NaN;
//	    if (i[131] == null) {
//	      p = 1;
//	    } else if (((Double) i[131]).doubleValue() <= 7.51) {
//	      p = 1;
//	    } else if (((Double) i[131]).doubleValue() > 7.51) {
//	    p = FlipSenseClassifier_8.N20fcbdaf392(i);
//	    } 
//	    return p;
//	  }
//	  static double N20fcbdaf392(Object []i) {
//	    double p = Double.NaN;
//	    if (i[113] == null) {
//	      p = 0;
//	    } else if (((Double) i[113]).doubleValue() <= -1.69) {
//	      p = 0;
//	    } else if (((Double) i[113]).doubleValue() > -1.69) {
//	    p = FlipSenseClassifier_8.N31093d14393(i);
//	    } 
//	    return p;
//	  }
//	  static double N31093d14393(Object []i) {
//	    double p = Double.NaN;
//	    if (i[44] == null) {
//	      p = 0;
//	    } else if (((Double) i[44]).doubleValue() <= 8.85) {
//	      p = 0;
//	    } else if (((Double) i[44]).doubleValue() > 8.85) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	}
//	class FlipSenseClassifier_9 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = FlipSenseClassifier_9.N55890532394(i);
//	    return p;
//	  }
//	  static double N55890532394(Object []i) {
//	    double p = Double.NaN;
//	    if (i[121] == null) {
//	      p = 1;
//	    } else if (((Double) i[121]).doubleValue() <= -2.91) {
//	    p = FlipSenseClassifier_9.N16b4417d395(i);
//	    } else if (((Double) i[121]).doubleValue() > -2.91) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	  static double N16b4417d395(Object []i) {
//	    double p = Double.NaN;
//	    if (i[124] == null) {
//	      p = 1;
//	    } else if (((Double) i[124]).doubleValue() <= -2.3) {
//	    p = FlipSenseClassifier_9.N14378130396(i);
//	    } else if (((Double) i[124]).doubleValue() > -2.3) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	  static double N14378130396(Object []i) {
//	    double p = Double.NaN;
//	    if (i[116] == null) {
//	      p = 0;
//	    } else if (((Double) i[116]).doubleValue() <= -7.81) {
//	      p = 0;
//	    } else if (((Double) i[116]).doubleValue() > -7.81) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	}