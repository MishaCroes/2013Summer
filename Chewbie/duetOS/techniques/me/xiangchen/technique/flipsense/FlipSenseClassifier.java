package me.xiangchen.technique.flipsense;

public class FlipSenseClassifier {

	  public static double classify(Object[] i) throws Exception {
	    double [] sums = new double [2];
	    sums[(int) FlipSenseClassifier_0.classify(i)] += 3.871201010907892;
	    sums[(int) FlipSenseClassifier_1.classify(i)] += 3.378126260760847;
	    sums[(int) FlipSenseClassifier_2.classify(i)] += 3.239611723347378;
	    sums[(int) FlipSenseClassifier_3.classify(i)] += 3.665020568609627;
	    sums[(int) FlipSenseClassifier_4.classify(i)] += 3.2389133011435303;
	    sums[(int) FlipSenseClassifier_5.classify(i)] += 3.2038324000660463;
	    sums[(int) FlipSenseClassifier_6.classify(i)] += 3.3585267286718974;
	    sums[(int) FlipSenseClassifier_7.classify(i)] += 3.5124352295816945;
	    sums[(int) FlipSenseClassifier_8.classify(i)] += 2.710263350428373;
	    sums[(int) FlipSenseClassifier_9.classify(i)] += 3.927015553673726;
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
	    p = FlipSenseClassifier_0.N4c7814f109(i);
	    return p;
	  }
	  static double N4c7814f109(Object []i) {
	    double p = Double.NaN;
	    if (i[128] == null) {
	      p = 1;
	    } else if (((Double) i[128]).doubleValue() <= 7.51) {
	      p = 1;
	    } else if (((Double) i[128]).doubleValue() > 7.51) {
	    p = FlipSenseClassifier_0.N45fa6bfc110(i);
	    } 
	    return p;
	  }
	  static double N45fa6bfc110(Object []i) {
	    double p = Double.NaN;
	    if (i[116] == null) {
	      p = 0;
	    } else if (((Double) i[116]).doubleValue() <= -1.53) {
	      p = 0;
	    } else if (((Double) i[116]).doubleValue() > -1.53) {
	    p = FlipSenseClassifier_0.N3bc79148111(i);
	    } 
	    return p;
	  }
	  static double N3bc79148111(Object []i) {
	    double p = Double.NaN;
	    if (i[113] == null) {
	      p = 0;
	    } else if (((Double) i[113]).doubleValue() <= 1.07) {
	    p = FlipSenseClassifier_0.N2b132ca1112(i);
	    } else if (((Double) i[113]).doubleValue() > 1.07) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2b132ca1112(Object []i) {
	    double p = Double.NaN;
	    if (i[37] == null) {
	      p = 0;
	    } else if (((Double) i[37]).doubleValue() <= 2.64) {
	      p = 0;
	    } else if (((Double) i[37]).doubleValue() > 2.64) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_1 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_1.N77d7141e113(i);
	    return p;
	  }
	  static double N77d7141e113(Object []i) {
	    double p = Double.NaN;
	    if (i[125] == null) {
	      p = 1;
	    } else if (((Double) i[125]).doubleValue() <= 7.51) {
	    p = FlipSenseClassifier_1.N4969fb09114(i);
	    } else if (((Double) i[125]).doubleValue() > 7.51) {
	    p = FlipSenseClassifier_1.N4ce03186115(i);
	    } 
	    return p;
	  }
	  static double N4969fb09114(Object []i) {
	    double p = Double.NaN;
	    if (i[116] == null) {
	      p = 0;
	    } else if (((Double) i[116]).doubleValue() <= -7.66) {
	      p = 0;
	    } else if (((Double) i[116]).doubleValue() > -7.66) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N4ce03186115(Object []i) {
	    double p = Double.NaN;
	    if (i[77] == null) {
	      p = 0;
	    } else if (((Double) i[77]).doubleValue() <= 9.43) {
	    p = FlipSenseClassifier_1.N12d37bd8116(i);
	    } else if (((Double) i[77]).doubleValue() > 9.43) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N12d37bd8116(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 0.3) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 0.3) {
	    p = FlipSenseClassifier_1.N7a67ab8f117(i);
	    } 
	    return p;
	  }
	  static double N7a67ab8f117(Object []i) {
	    double p = Double.NaN;
	    if (i[113] == null) {
	      p = 0;
	    } else if (((Double) i[113]).doubleValue() <= 1.07) {
	      p = 0;
	    } else if (((Double) i[113]).doubleValue() > 1.07) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_2 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_2.N2c307811118(i);
	    return p;
	  }
	  static double N2c307811118(Object []i) {
	    double p = Double.NaN;
	    if (i[121] == null) {
	      p = 1;
	    } else if (((Double) i[121]).doubleValue() <= -3.06) {
	    p = FlipSenseClassifier_2.N221abac1119(i);
	    } else if (((Double) i[121]).doubleValue() > -3.06) {
	    p = FlipSenseClassifier_2.N57ddf5ee122(i);
	    } 
	    return p;
	  }
	  static double N221abac1119(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() <= 9.66) {
	    p = FlipSenseClassifier_2.N8dae665120(i);
	    } else if (((Double) i[5]).doubleValue() > 9.66) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N8dae665120(Object []i) {
	    double p = Double.NaN;
	    if (i[31] == null) {
	      p = 1;
	    } else if (((Double) i[31]).doubleValue() <= 2.25) {
	    p = FlipSenseClassifier_2.N5b4bf56d121(i);
	    } else if (((Double) i[31]).doubleValue() > 2.25) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5b4bf56d121(Object []i) {
	    double p = Double.NaN;
	    if (i[124] == null) {
	      p = 1;
	    } else if (((Double) i[124]).doubleValue() <= -5.06) {
	      p = 1;
	    } else if (((Double) i[124]).doubleValue() > -5.06) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N57ddf5ee122(Object []i) {
	    double p = Double.NaN;
	    if (i[124] == null) {
	      p = 0;
	    } else if (((Double) i[124]).doubleValue() <= 0.31) {
	      p = 0;
	    } else if (((Double) i[124]).doubleValue() > 0.31) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_3 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_3.N2d3d0953123(i);
	    return p;
	  }
	  static double N2d3d0953123(Object []i) {
	    double p = Double.NaN;
	    if (i[127] == null) {
	      p = 1;
	    } else if (((Double) i[127]).doubleValue() <= -5.36) {
	      p = 1;
	    } else if (((Double) i[127]).doubleValue() > -5.36) {
	    p = FlipSenseClassifier_3.N22f3f59124(i);
	    } 
	    return p;
	  }
	  static double N22f3f59124(Object []i) {
	    double p = Double.NaN;
	    if (i[116] == null) {
	      p = 0;
	    } else if (((Double) i[116]).doubleValue() <= 0.77) {
	    p = FlipSenseClassifier_3.N6be7ed2d125(i);
	    } else if (((Double) i[116]).doubleValue() > 0.77) {
	    p = FlipSenseClassifier_3.N42e21073127(i);
	    } 
	    return p;
	  }
	  static double N6be7ed2d125(Object []i) {
	    double p = Double.NaN;
	    if (i[122] == null) {
	      p = 0;
	    } else if (((Double) i[122]).doubleValue() <= -6.59) {
	    p = FlipSenseClassifier_3.N47845cb3126(i);
	    } else if (((Double) i[122]).doubleValue() > -6.59) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N47845cb3126(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 9.46) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() > 9.46) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N42e21073127(Object []i) {
	    double p = Double.NaN;
	    if (i[83] == null) {
	      p = 0;
	    } else if (((Double) i[83]).doubleValue() <= 8.84) {
	      p = 0;
	    } else if (((Double) i[83]).doubleValue() > 8.84) {
	    p = FlipSenseClassifier_3.N7a61053128(i);
	    } 
	    return p;
	  }
	  static double N7a61053128(Object []i) {
	    double p = Double.NaN;
	    if (i[125] == null) {
	      p = 1;
	    } else if (((Double) i[125]).doubleValue() <= 9.5) {
	      p = 1;
	    } else if (((Double) i[125]).doubleValue() > 9.5) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_4 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_4.N2779bd11129(i);
	    return p;
	  }
	  static double N2779bd11129(Object []i) {
	    double p = Double.NaN;
	    if (i[113] == null) {
	      p = 0;
	    } else if (((Double) i[113]).doubleValue() <= -0.61) {
	    p = FlipSenseClassifier_4.N296bbb56130(i);
	    } else if (((Double) i[113]).doubleValue() > -0.61) {
	    p = FlipSenseClassifier_4.N6633a290132(i);
	    } 
	    return p;
	  }
	  static double N296bbb56130(Object []i) {
	    double p = Double.NaN;
	    if (i[128] == null) {
	      p = 1;
	    } else if (((Double) i[128]).doubleValue() <= 7.35) {
	      p = 1;
	    } else if (((Double) i[128]).doubleValue() > 7.35) {
	    p = FlipSenseClassifier_4.N5fd82058131(i);
	    } 
	    return p;
	  }
	  static double N5fd82058131(Object []i) {
	    double p = Double.NaN;
	    if (i[69] == null) {
	      p = 0;
	    } else if (((Double) i[69]).doubleValue() <= 0.49) {
	      p = 0;
	    } else if (((Double) i[69]).doubleValue() > 0.49) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6633a290132(Object []i) {
	    double p = Double.NaN;
	    if (i[125] == null) {
	      p = 1;
	    } else if (((Double) i[125]).doubleValue() <= 9.19) {
	    p = FlipSenseClassifier_4.N47f5d05b133(i);
	    } else if (((Double) i[125]).doubleValue() > 9.19) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N47f5d05b133(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() <= 9.73) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() > 9.73) {
	    p = FlipSenseClassifier_4.N5b422b45134(i);
	    } 
	    return p;
	  }
	  static double N5b422b45134(Object []i) {
	    double p = Double.NaN;
	    if (i[121] == null) {
	      p = 1;
	    } else if (((Double) i[121]).doubleValue() <= -6.9) {
	      p = 1;
	    } else if (((Double) i[121]).doubleValue() > -6.9) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_5 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_5.N5526edd1135(i);
	    return p;
	  }
	  static double N5526edd1135(Object []i) {
	    double p = Double.NaN;
	    if (i[113] == null) {
	      p = 0;
	    } else if (((Double) i[113]).doubleValue() <= -1.99) {
	    p = FlipSenseClassifier_5.N6ec76003136(i);
	    } else if (((Double) i[113]).doubleValue() > -1.99) {
	    p = FlipSenseClassifier_5.N63709dc6137(i);
	    } 
	    return p;
	  }
	  static double N6ec76003136(Object []i) {
	    double p = Double.NaN;
	    if (i[128] == null) {
	      p = 1;
	    } else if (((Double) i[128]).doubleValue() <= 4.14) {
	      p = 1;
	    } else if (((Double) i[128]).doubleValue() > 4.14) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N63709dc6137(Object []i) {
	    double p = Double.NaN;
	    if (i[32] == null) {
	      p = 1;
	    } else if (((Double) i[32]).doubleValue() <= 9.37) {
	    p = FlipSenseClassifier_5.N7686652a138(i);
	    } else if (((Double) i[32]).doubleValue() > 9.37) {
	    p = FlipSenseClassifier_5.N4823ec74140(i);
	    } 
	    return p;
	  }
	  static double N7686652a138(Object []i) {
	    double p = Double.NaN;
	    if (i[54] == null) {
	      p = 1;
	    } else if (((Double) i[54]).doubleValue() <= -0.46) {
	    p = FlipSenseClassifier_5.N715be530139(i);
	    } else if (((Double) i[54]).doubleValue() > -0.46) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N715be530139(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() <= -1.17) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() > -1.17) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4823ec74140(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() <= 9.35) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() > 9.35) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_6 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_6.N2e78d8ac141(i);
	    return p;
	  }
	  static double N2e78d8ac141(Object []i) {
	    double p = Double.NaN;
	    if (i[116] == null) {
	      p = 0;
	    } else if (((Double) i[116]).doubleValue() <= -4.14) {
	    p = FlipSenseClassifier_6.N7fd91c09142(i);
	    } else if (((Double) i[116]).doubleValue() > -4.14) {
	    p = FlipSenseClassifier_6.N1c148bd4144(i);
	    } 
	    return p;
	  }
	  static double N7fd91c09142(Object []i) {
	    double p = Double.NaN;
	    if (i[131] == null) {
	      p = 1;
	    } else if (((Double) i[131]).doubleValue() <= 7.05) {
	    p = FlipSenseClassifier_6.N6bfd472143(i);
	    } else if (((Double) i[131]).doubleValue() > 7.05) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6bfd472143(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 0.78) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 0.78) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N1c148bd4144(Object []i) {
	    double p = Double.NaN;
	    if (i[127] == null) {
	      p = 1;
	    } else if (((Double) i[127]).doubleValue() <= -3.22) {
	      p = 1;
	    } else if (((Double) i[127]).doubleValue() > -3.22) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_7 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_7.N8e819b3145(i);
	    return p;
	  }
	  static double N8e819b3145(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= -0.55) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() > -0.55) {
	    p = FlipSenseClassifier_7.N3def3b56146(i);
	    } 
	    return p;
	  }
	  static double N3def3b56146(Object []i) {
	    double p = Double.NaN;
	    if (i[128] == null) {
	      p = 1;
	    } else if (((Double) i[128]).doubleValue() <= 7.51) {
	      p = 1;
	    } else if (((Double) i[128]).doubleValue() > 7.51) {
	    p = FlipSenseClassifier_7.N2520aade147(i);
	    } 
	    return p;
	  }
	  static double N2520aade147(Object []i) {
	    double p = Double.NaN;
	    if (i[74] == null) {
	      p = 0;
	    } else if (((Double) i[74]).doubleValue() <= 9.38) {
	    p = FlipSenseClassifier_7.N3b1e7dd148(i);
	    } else if (((Double) i[74]).doubleValue() > 9.38) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3b1e7dd148(Object []i) {
	    double p = Double.NaN;
	    if (i[112] == null) {
	      p = 0;
	    } else if (((Double) i[112]).doubleValue() <= -9.04) {
	    p = FlipSenseClassifier_7.N14ed6010149(i);
	    } else if (((Double) i[112]).doubleValue() > -9.04) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N14ed6010149(Object []i) {
	    double p = Double.NaN;
	    if (i[72] == null) {
	      p = 0;
	    } else if (((Double) i[72]).doubleValue() <= 0.46) {
	      p = 0;
	    } else if (((Double) i[72]).doubleValue() > 0.46) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_8 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_8.N6c3dc52b150(i);
	    return p;
	  }
	  static double N6c3dc52b150(Object []i) {
	    double p = Double.NaN;
	    if (i[116] == null) {
	      p = 0;
	    } else if (((Double) i[116]).doubleValue() <= 0.77) {
	    p = FlipSenseClassifier_8.N4b5bc191151(i);
	    } else if (((Double) i[116]).doubleValue() > 0.77) {
	    p = FlipSenseClassifier_8.N245babce153(i);
	    } 
	    return p;
	  }
	  static double N4b5bc191151(Object []i) {
	    double p = Double.NaN;
	    if (i[125] == null) {
	      p = 1;
	    } else if (((Double) i[125]).doubleValue() <= 2.91) {
	      p = 1;
	    } else if (((Double) i[125]).doubleValue() > 2.91) {
	    p = FlipSenseClassifier_8.N75013d3d152(i);
	    } 
	    return p;
	  }
	  static double N75013d3d152(Object []i) {
	    double p = Double.NaN;
	    if (i[45] == null) {
	      p = 1;
	    } else if (((Double) i[45]).doubleValue() <= -0.89) {
	      p = 1;
	    } else if (((Double) i[45]).doubleValue() > -0.89) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N245babce153(Object []i) {
	    double p = Double.NaN;
	    if (i[122] == null) {
	      p = 1;
	    } else if (((Double) i[122]).doubleValue() <= 8.89) {
	    p = FlipSenseClassifier_8.N7e6c7407154(i);
	    } else if (((Double) i[122]).doubleValue() > 8.89) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7e6c7407154(Object []i) {
	    double p = Double.NaN;
	    if (i[35] == null) {
	      p = 1;
	    } else if (((Double) i[35]).doubleValue() <= 9.37) {
	      p = 1;
	    } else if (((Double) i[35]).doubleValue() > 9.37) {
	    p = FlipSenseClassifier_8.N235b869155(i);
	    } 
	    return p;
	  }
	  static double N235b869155(Object []i) {
	    double p = Double.NaN;
	    if (i[26] == null) {
	      p = 0;
	    } else if (((Double) i[26]).doubleValue() <= 9.28) {
	      p = 0;
	    } else if (((Double) i[26]).doubleValue() > 9.28) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_9 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_9.N14ddf6a1156(i);
	    return p;
	  }
	  static double N14ddf6a1156(Object []i) {
	    double p = Double.NaN;
	    if (i[113] == null) {
	      p = 0;
	    } else if (((Double) i[113]).doubleValue() <= 0.77) {
	    p = FlipSenseClassifier_9.N786aceba157(i);
	    } else if (((Double) i[113]).doubleValue() > 0.77) {
	    p = FlipSenseClassifier_9.N47f35aaa161(i);
	    } 
	    return p;
	  }
	  static double N786aceba157(Object []i) {
	    double p = Double.NaN;
	    if (i[66] == null) {
	      p = 0;
	    } else if (((Double) i[66]).doubleValue() <= 0.56) {
	    p = FlipSenseClassifier_9.N2c2a5319158(i);
	    } else if (((Double) i[66]).doubleValue() > 0.56) {
	    p = FlipSenseClassifier_9.N37611a05160(i);
	    } 
	    return p;
	  }
	  static double N2c2a5319158(Object []i) {
	    double p = Double.NaN;
	    if (i[20] == null) {
	      p = 0;
	    } else if (((Double) i[20]).doubleValue() <= 9.47) {
	      p = 0;
	    } else if (((Double) i[20]).doubleValue() > 9.47) {
	    p = FlipSenseClassifier_9.Neb5a4f6159(i);
	    } 
	    return p;
	  }
	  static double Neb5a4f6159(Object []i) {
	    double p = Double.NaN;
	    if (i[115] == null) {
	      p = 0;
	    } else if (((Double) i[115]).doubleValue() <= -7.2) {
	      p = 0;
	    } else if (((Double) i[115]).doubleValue() > -7.2) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N37611a05160(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() <= 2.03) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() > 2.03) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N47f35aaa161(Object []i) {
	    double p = Double.NaN;
	    if (i[35] == null) {
	      p = 1;
	    } else if (((Double) i[35]).doubleValue() <= 9.37) {
	      p = 1;
	    } else if (((Double) i[35]).doubleValue() > 9.37) {
	    p = FlipSenseClassifier_9.N39c573cd162(i);
	    } 
	    return p;
	  }
	  static double N39c573cd162(Object []i) {
	    double p = Double.NaN;
	    if (i[39] == null) {
	      p = 0;
	    } else if (((Double) i[39]).doubleValue() <= 0.07) {
	      p = 0;
	    } else if (((Double) i[39]).doubleValue() > 0.07) {
	      p = 1;
	    } 
	    return p;
	  }
	}