package me.xiangchen.ml;

public class BumpSenseDirectionClassifier {

	  public static double classify(Object[] i) throws Exception {
	    double [] sums = new double [4];
	    sums[(int) BumpSenseDirectionClassifier_0.classify(i)] += 4.0163830207523885;
	    sums[(int) BumpSenseDirectionClassifier_1.classify(i)] += 3.339695181904356;
	    sums[(int) BumpSenseDirectionClassifier_2.classify(i)] += 3.388739146740106;
	    sums[(int) BumpSenseDirectionClassifier_3.classify(i)] += 3.928880122494568;
	    sums[(int) BumpSenseDirectionClassifier_4.classify(i)] += 4.869269916367797;
	    sums[(int) BumpSenseDirectionClassifier_5.classify(i)] += 3.6515284302634514;
	    sums[(int) BumpSenseDirectionClassifier_6.classify(i)] += 3.6669367200511855;
	    sums[(int) BumpSenseDirectionClassifier_7.classify(i)] += 3.4535581205121413;
	    sums[(int) BumpSenseDirectionClassifier_8.classify(i)] += 3.7805057414699146;
	    sums[(int) BumpSenseDirectionClassifier_9.classify(i)] += 4.355012927605863;
	    double maxV = sums[0];
	    int maxI = 0;
	    for (int j = 1; j < 4; j++) {
	      if (sums[j] > maxV) { maxV = sums[j]; maxI = j; }
	    }
	    return (double) maxI;
	  }
	}
	class BumpSenseDirectionClassifier_0 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseDirectionClassifier_0.N3469a54c265(i);
	    return p;
	  }
	  static double N3469a54c265(Object []i) {
	    double p = Double.NaN;
	    if (i[94] == null) {
	      p = 3;
	    } else if (((Double) i[94]).doubleValue() <= 0.99) {
	    p = BumpSenseDirectionClassifier_0.N3e33b76266(i);
	    } else if (((Double) i[94]).doubleValue() > 0.99) {
	    p = BumpSenseDirectionClassifier_0.N53390ae283(i);
	    } 
	    return p;
	  }
	  static double N3e33b76266(Object []i) {
	    double p = Double.NaN;
	    if (i[48] == null) {
	      p = 3;
	    } else if (((Double) i[48]).doubleValue() <= 4.65) {
	    p = BumpSenseDirectionClassifier_0.N3b54c1f8267(i);
	    } else if (((Double) i[48]).doubleValue() > 4.65) {
	    p = BumpSenseDirectionClassifier_0.N67590474282(i);
	    } 
	    return p;
	  }
	  static double N3b54c1f8267(Object []i) {
	    double p = Double.NaN;
	    if (i[132] == null) {
	      p = 3;
	    } else if (((Double) i[132]).doubleValue() <= -0.47) {
	      p = 3;
	    } else if (((Double) i[132]).doubleValue() > -0.47) {
	    p = BumpSenseDirectionClassifier_0.N398a9f36268(i);
	    } 
	    return p;
	  }
	  static double N398a9f36268(Object []i) {
	    double p = Double.NaN;
	    if (i[148] == null) {
	      p = 3;
	    } else if (((Double) i[148]).doubleValue() <= 0.24) {
	    p = BumpSenseDirectionClassifier_0.N3bdaafbd269(i);
	    } else if (((Double) i[148]).doubleValue() > 0.24) {
	    p = BumpSenseDirectionClassifier_0.N1247bffe270(i);
	    } 
	    return p;
	  }
	  static double N3bdaafbd269(Object []i) {
	    double p = Double.NaN;
	    if (i[163] == null) {
	      p = 0;
	    } else if (((Double) i[163]).doubleValue() <= -0.92) {
	      p = 0;
	    } else if (((Double) i[163]).doubleValue() > -0.92) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N1247bffe270(Object []i) {
	    double p = Double.NaN;
	    if (i[87] == null) {
	      p = 3;
	    } else if (((Double) i[87]).doubleValue() <= -4.19) {
	      p = 3;
	    } else if (((Double) i[87]).doubleValue() > -4.19) {
	    p = BumpSenseDirectionClassifier_0.N248dc612271(i);
	    } 
	    return p;
	  }
	  static double N248dc612271(Object []i) {
	    double p = Double.NaN;
	    if (i[124] == null) {
	      p = 2;
	    } else if (((Double) i[124]).doubleValue() <= 2.42) {
	    p = BumpSenseDirectionClassifier_0.N57c6da7d272(i);
	    } else if (((Double) i[124]).doubleValue() > 2.42) {
	    p = BumpSenseDirectionClassifier_0.N196f806f281(i);
	    } 
	    return p;
	  }
	  static double N57c6da7d272(Object []i) {
	    double p = Double.NaN;
	    if (i[15] == null) {
	      p = 2;
	    } else if (((Double) i[15]).doubleValue() <= 1.64) {
	    p = BumpSenseDirectionClassifier_0.N40327190273(i);
	    } else if (((Double) i[15]).doubleValue() > 1.64) {
	    p = BumpSenseDirectionClassifier_0.N4062d86f280(i);
	    } 
	    return p;
	  }
	  static double N40327190273(Object []i) {
	    double p = Double.NaN;
	    if (i[66] == null) {
	      p = 2;
	    } else if (((Double) i[66]).doubleValue() <= 2.79) {
	    p = BumpSenseDirectionClassifier_0.N2fbdc5dd274(i);
	    } else if (((Double) i[66]).doubleValue() > 2.79) {
	    p = BumpSenseDirectionClassifier_0.N138bd16f279(i);
	    } 
	    return p;
	  }
	  static double N2fbdc5dd274(Object []i) {
	    double p = Double.NaN;
	    if (i[69] == null) {
	      p = 3;
	    } else if (((Double) i[69]).doubleValue() <= -3.82) {
	      p = 3;
	    } else if (((Double) i[69]).doubleValue() > -3.82) {
	    p = BumpSenseDirectionClassifier_0.N540948a7275(i);
	    } 
	    return p;
	  }
	  static double N540948a7275(Object []i) {
	    double p = Double.NaN;
	    if (i[33] == null) {
	      p = 2;
	    } else if (((Double) i[33]).doubleValue() <= 3.78) {
	    p = BumpSenseDirectionClassifier_0.N2d80f70b276(i);
	    } else if (((Double) i[33]).doubleValue() > 3.78) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N2d80f70b276(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 2;
	    } else if (((Double) i[0]).doubleValue() <= 1.21) {
	    p = BumpSenseDirectionClassifier_0.N6ddb0a83277(i);
	    } else if (((Double) i[0]).doubleValue() > 1.21) {
	    p = BumpSenseDirectionClassifier_0.N478f56cd278(i);
	    } 
	    return p;
	  }
	  static double N6ddb0a83277(Object []i) {
	    double p = Double.NaN;
	    if (i[131] == null) {
	      p = 2;
	    } else if (((Double) i[131]).doubleValue() <= 9.86) {
	      p = 2;
	    } else if (((Double) i[131]).doubleValue() > 9.86) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N478f56cd278(Object []i) {
	    double p = Double.NaN;
	    if (i[23] == null) {
	      p = 0;
	    } else if (((Double) i[23]).doubleValue() <= 9.61) {
	      p = 0;
	    } else if (((Double) i[23]).doubleValue() > 9.61) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N138bd16f279(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 3;
	    } else if (((Double) i[0]).doubleValue() <= 1.69) {
	      p = 3;
	    } else if (((Double) i[0]).doubleValue() > 1.69) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4062d86f280(Object []i) {
	    double p = Double.NaN;
	    if (i[157] == null) {
	      p = 3;
	    } else if (((Double) i[157]).doubleValue() <= 0.15) {
	      p = 3;
	    } else if (((Double) i[157]).doubleValue() > 0.15) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N196f806f281(Object []i) {
	    double p = Double.NaN;
	    if (i[156] == null) {
	      p = 1;
	    } else if (((Double) i[156]).doubleValue() <= 0.31) {
	      p = 1;
	    } else if (((Double) i[156]).doubleValue() > 0.31) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N67590474282(Object []i) {
	    double p = Double.NaN;
	    if (i[70] == null) {
	      p = 0;
	    } else if (((Double) i[70]).doubleValue() <= 2.13) {
	      p = 0;
	    } else if (((Double) i[70]).doubleValue() > 2.13) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N53390ae283(Object []i) {
	    double p = Double.NaN;
	    if (i[120] == null) {
	      p = 3;
	    } else if (((Double) i[120]).doubleValue() <= -1.5) {
	    p = BumpSenseDirectionClassifier_0.N7c5f922c284(i);
	    } else if (((Double) i[120]).doubleValue() > -1.5) {
	    p = BumpSenseDirectionClassifier_0.N3e3aaebf286(i);
	    } 
	    return p;
	  }
	  static double N7c5f922c284(Object []i) {
	    double p = Double.NaN;
	    if (i[45] == null) {
	      p = 0;
	    } else if (((Double) i[45]).doubleValue() <= -3.6) {
	      p = 0;
	    } else if (((Double) i[45]).doubleValue() > -3.6) {
	    p = BumpSenseDirectionClassifier_0.N6675c67e285(i);
	    } 
	    return p;
	  }
	  static double N6675c67e285(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 2;
	    } else if (((Double) i[0]).doubleValue() <= 1.07) {
	      p = 2;
	    } else if (((Double) i[0]).doubleValue() > 1.07) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N3e3aaebf286(Object []i) {
	    double p = Double.NaN;
	    if (i[148] == null) {
	      p = 0;
	    } else if (((Double) i[148]).doubleValue() <= 1.8) {
	    p = BumpSenseDirectionClassifier_0.N7ea69d83287(i);
	    } else if (((Double) i[148]).doubleValue() > 1.8) {
	    p = BumpSenseDirectionClassifier_0.N6d4771b3298(i);
	    } 
	    return p;
	  }
	  static double N7ea69d83287(Object []i) {
	    double p = Double.NaN;
	    if (i[118] == null) {
	      p = 0;
	    } else if (((Double) i[118]).doubleValue() <= 2.26) {
	    p = BumpSenseDirectionClassifier_0.N6caf446a288(i);
	    } else if (((Double) i[118]).doubleValue() > 2.26) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6caf446a288(Object []i) {
	    double p = Double.NaN;
	    if (i[76] == null) {
	      p = 0;
	    } else if (((Double) i[76]).doubleValue() <= 3.23) {
	    p = BumpSenseDirectionClassifier_0.N66b4c2e4289(i);
	    } else if (((Double) i[76]).doubleValue() > 3.23) {
	    p = BumpSenseDirectionClassifier_0.N17e7d730296(i);
	    } 
	    return p;
	  }
	  static double N66b4c2e4289(Object []i) {
	    double p = Double.NaN;
	    if (i[110] == null) {
	      p = 3;
	    } else if (((Double) i[110]).doubleValue() <= 7.28) {
	      p = 3;
	    } else if (((Double) i[110]).doubleValue() > 7.28) {
	    p = BumpSenseDirectionClassifier_0.N65673b69290(i);
	    } 
	    return p;
	  }
	  static double N65673b69290(Object []i) {
	    double p = Double.NaN;
	    if (i[163] == null) {
	      p = 2;
	    } else if (((Double) i[163]).doubleValue() <= -0.31) {
	    p = BumpSenseDirectionClassifier_0.N5c6d9e81291(i);
	    } else if (((Double) i[163]).doubleValue() > -0.31) {
	    p = BumpSenseDirectionClassifier_0.N20c1568f292(i);
	    } 
	    return p;
	  }
	  static double N5c6d9e81291(Object []i) {
	    double p = Double.NaN;
	    if (i[78] == null) {
	      p = 1;
	    } else if (((Double) i[78]).doubleValue() <= 0.55) {
	      p = 1;
	    } else if (((Double) i[78]).doubleValue() > 0.55) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N20c1568f292(Object []i) {
	    double p = Double.NaN;
	    if (i[101] == null) {
	      p = 2;
	    } else if (((Double) i[101]).doubleValue() <= 8.07) {
	      p = 2;
	    } else if (((Double) i[101]).doubleValue() > 8.07) {
	    p = BumpSenseDirectionClassifier_0.N7519d715293(i);
	    } 
	    return p;
	  }
	  static double N7519d715293(Object []i) {
	    double p = Double.NaN;
	    if (i[41] == null) {
	      p = 0;
	    } else if (((Double) i[41]).doubleValue() <= 9.97) {
	    p = BumpSenseDirectionClassifier_0.N7377dfc2294(i);
	    } else if (((Double) i[41]).doubleValue() > 9.97) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N7377dfc2294(Object []i) {
	    double p = Double.NaN;
	    if (i[90] == null) {
	      p = 0;
	    } else if (((Double) i[90]).doubleValue() <= 0.64) {
	    p = BumpSenseDirectionClassifier_0.N430374c7295(i);
	    } else if (((Double) i[90]).doubleValue() > 0.64) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N430374c7295(Object []i) {
	    double p = Double.NaN;
	    if (i[162] == null) {
	      p = 0;
	    } else if (((Double) i[162]).doubleValue() <= 0.46) {
	      p = 0;
	    } else if (((Double) i[162]).doubleValue() > 0.46) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N17e7d730296(Object []i) {
	    double p = Double.NaN;
	    if (i[163] == null) {
	      p = 1;
	    } else if (((Double) i[163]).doubleValue() <= 0.31) {
	      p = 1;
	    } else if (((Double) i[163]).doubleValue() > 0.31) {
	    p = BumpSenseDirectionClassifier_0.N75e09c92297(i);
	    } 
	    return p;
	  }
	  static double N75e09c92297(Object []i) {
	    double p = Double.NaN;
	    if (i[91] == null) {
	      p = 0;
	    } else if (((Double) i[91]).doubleValue() <= 2.39) {
	      p = 0;
	    } else if (((Double) i[91]).doubleValue() > 2.39) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6d4771b3298(Object []i) {
	    double p = Double.NaN;
	    if (i[128] == null) {
	      p = 1;
	    } else if (((Double) i[128]).doubleValue() <= 9.93) {
	      p = 1;
	    } else if (((Double) i[128]).doubleValue() > 9.93) {
	      p = 2;
	    } 
	    return p;
	  }
	}
	class BumpSenseDirectionClassifier_1 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseDirectionClassifier_1.N6d79d6d1299(i);
	    return p;
	  }
	  static double N6d79d6d1299(Object []i) {
	    double p = Double.NaN;
	    if (i[19] == null) {
	      p = 2;
	    } else if (((Double) i[19]).doubleValue() <= 1.62) {
	    p = BumpSenseDirectionClassifier_1.N5a066b7d300(i);
	    } else if (((Double) i[19]).doubleValue() > 1.62) {
	    p = BumpSenseDirectionClassifier_1.N3096c949322(i);
	    } 
	    return p;
	  }
	  static double N5a066b7d300(Object []i) {
	    double p = Double.NaN;
	    if (i[52] == null) {
	      p = 2;
	    } else if (((Double) i[52]).doubleValue() <= 3.98) {
	    p = BumpSenseDirectionClassifier_1.N5b7b09b7301(i);
	    } else if (((Double) i[52]).doubleValue() > 3.98) {
	    p = BumpSenseDirectionClassifier_1.N6c1c636d320(i);
	    } 
	    return p;
	  }
	  static double N5b7b09b7301(Object []i) {
	    double p = Double.NaN;
	    if (i[154] == null) {
	      p = 2;
	    } else if (((Double) i[154]).doubleValue() <= -1.23) {
	    p = BumpSenseDirectionClassifier_1.N6abafc4c302(i);
	    } else if (((Double) i[154]).doubleValue() > -1.23) {
	    p = BumpSenseDirectionClassifier_1.N44fc511a305(i);
	    } 
	    return p;
	  }
	  static double N6abafc4c302(Object []i) {
	    double p = Double.NaN;
	    if (i[22] == null) {
	      p = 2;
	    } else if (((Double) i[22]).doubleValue() <= 0.53) {
	    p = BumpSenseDirectionClassifier_1.N1a0a1852303(i);
	    } else if (((Double) i[22]).doubleValue() > 0.53) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N1a0a1852303(Object []i) {
	    double p = Double.NaN;
	    if (i[153] == null) {
	      p = 2;
	    } else if (((Double) i[153]).doubleValue() <= -0.31) {
	    p = BumpSenseDirectionClassifier_1.Ncc2bcd9304(i);
	    } else if (((Double) i[153]).doubleValue() > -0.31) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double Ncc2bcd9304(Object []i) {
	    double p = Double.NaN;
	    if (i[15] == null) {
	      p = 3;
	    } else if (((Double) i[15]).doubleValue() <= -1.97) {
	      p = 3;
	    } else if (((Double) i[15]).doubleValue() > -1.97) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N44fc511a305(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 3;
	    } else if (((Double) i[3]).doubleValue() <= 1.74) {
	    p = BumpSenseDirectionClassifier_1.N1130a558306(i);
	    } else if (((Double) i[3]).doubleValue() > 1.74) {
	    p = BumpSenseDirectionClassifier_1.N617b64e2319(i);
	    } 
	    return p;
	  }
	  static double N1130a558306(Object []i) {
	    double p = Double.NaN;
	    if (i[52] == null) {
	      p = 3;
	    } else if (((Double) i[52]).doubleValue() <= 3.0) {
	    p = BumpSenseDirectionClassifier_1.N10b73d39307(i);
	    } else if (((Double) i[52]).doubleValue() > 3.0) {
	    p = BumpSenseDirectionClassifier_1.N6b754ab3318(i);
	    } 
	    return p;
	  }
	  static double N10b73d39307(Object []i) {
	    double p = Double.NaN;
	    if (i[34] == null) {
	      p = 3;
	    } else if (((Double) i[34]).doubleValue() <= 3.14) {
	    p = BumpSenseDirectionClassifier_1.N6e1471c1308(i);
	    } else if (((Double) i[34]).doubleValue() > 3.14) {
	    p = BumpSenseDirectionClassifier_1.N2b361466317(i);
	    } 
	    return p;
	  }
	  static double N6e1471c1308(Object []i) {
	    double p = Double.NaN;
	    if (i[70] == null) {
	      p = 3;
	    } else if (((Double) i[70]).doubleValue() <= 2.8) {
	    p = BumpSenseDirectionClassifier_1.N386e5d309(i);
	    } else if (((Double) i[70]).doubleValue() > 2.8) {
	    p = BumpSenseDirectionClassifier_1.N52a85c17316(i);
	    } 
	    return p;
	  }
	  static double N386e5d309(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 3;
	    } else if (((Double) i[7]).doubleValue() <= 1.17) {
	    p = BumpSenseDirectionClassifier_1.N78d59bc7310(i);
	    } else if (((Double) i[7]).doubleValue() > 1.17) {
	    p = BumpSenseDirectionClassifier_1.N7c4bc5d1315(i);
	    } 
	    return p;
	  }
	  static double N78d59bc7310(Object []i) {
	    double p = Double.NaN;
	    if (i[163] == null) {
	      p = 3;
	    } else if (((Double) i[163]).doubleValue() <= 0.15) {
	    p = BumpSenseDirectionClassifier_1.Nfe663cb311(i);
	    } else if (((Double) i[163]).doubleValue() > 0.15) {
	    p = BumpSenseDirectionClassifier_1.N48495915313(i);
	    } 
	    return p;
	  }
	  static double Nfe663cb311(Object []i) {
	    double p = Double.NaN;
	    if (i[151] == null) {
	      p = 3;
	    } else if (((Double) i[151]).doubleValue() <= -1.23) {
	    p = BumpSenseDirectionClassifier_1.N5ea1ac94312(i);
	    } else if (((Double) i[151]).doubleValue() > -1.23) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N5ea1ac94312(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 3;
	    } else if (((Double) i[3]).doubleValue() <= -1.57) {
	      p = 3;
	    } else if (((Double) i[3]).doubleValue() > -1.57) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N48495915313(Object []i) {
	    double p = Double.NaN;
	    if (i[123] == null) {
	      p = 3;
	    } else if (((Double) i[123]).doubleValue() <= -0.04) {
	      p = 3;
	    } else if (((Double) i[123]).doubleValue() > -0.04) {
	    p = BumpSenseDirectionClassifier_1.N477796c6314(i);
	    } 
	    return p;
	  }
	  static double N477796c6314(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 2;
	    } else if (((Double) i[0]).doubleValue() <= -0.47) {
	      p = 2;
	    } else if (((Double) i[0]).doubleValue() > -0.47) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7c4bc5d1315(Object []i) {
	    double p = Double.NaN;
	    if (i[24] == null) {
	      p = 3;
	    } else if (((Double) i[24]).doubleValue() <= -0.9) {
	      p = 3;
	    } else if (((Double) i[24]).doubleValue() > -0.9) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N52a85c17316(Object []i) {
	    double p = Double.NaN;
	    if (i[63] == null) {
	      p = 2;
	    } else if (((Double) i[63]).doubleValue() <= 2.39) {
	      p = 2;
	    } else if (((Double) i[63]).doubleValue() > 2.39) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N2b361466317(Object []i) {
	    double p = Double.NaN;
	    if (i[160] == null) {
	      p = 2;
	    } else if (((Double) i[160]).doubleValue() <= 0.0) {
	      p = 2;
	    } else if (((Double) i[160]).doubleValue() > 0.0) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6b754ab3318(Object []i) {
	    double p = Double.NaN;
	    if (i[45] == null) {
	      p = 2;
	    } else if (((Double) i[45]).doubleValue() <= 2.01) {
	      p = 2;
	    } else if (((Double) i[45]).doubleValue() > 2.01) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N617b64e2319(Object []i) {
	    double p = Double.NaN;
	    if (i[143] == null) {
	      p = 3;
	    } else if (((Double) i[143]).doubleValue() <= 8.76) {
	      p = 3;
	    } else if (((Double) i[143]).doubleValue() > 8.76) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6c1c636d320(Object []i) {
	    double p = Double.NaN;
	    if (i[67] == null) {
	      p = 0;
	    } else if (((Double) i[67]).doubleValue() <= 2.44) {
	    p = BumpSenseDirectionClassifier_1.N3bc3c08e321(i);
	    } else if (((Double) i[67]).doubleValue() > 2.44) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3bc3c08e321(Object []i) {
	    double p = Double.NaN;
	    if (i[110] == null) {
	      p = 2;
	    } else if (((Double) i[110]).doubleValue() <= 9.06) {
	      p = 2;
	    } else if (((Double) i[110]).doubleValue() > 9.06) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3096c949322(Object []i) {
	    double p = Double.NaN;
	    if (i[150] == null) {
	      p = 1;
	    } else if (((Double) i[150]).doubleValue() <= 2.45) {
	    p = BumpSenseDirectionClassifier_1.N7b78f08a323(i);
	    } else if (((Double) i[150]).doubleValue() > 2.45) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7b78f08a323(Object []i) {
	    double p = Double.NaN;
	    if (i[153] == null) {
	      p = 1;
	    } else if (((Double) i[153]).doubleValue() <= 2.15) {
	    p = BumpSenseDirectionClassifier_1.N40f8335a324(i);
	    } else if (((Double) i[153]).doubleValue() > 2.15) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N40f8335a324(Object []i) {
	    double p = Double.NaN;
	    if (i[121] == null) {
	      p = 1;
	    } else if (((Double) i[121]).doubleValue() <= 1.21) {
	    p = BumpSenseDirectionClassifier_1.N66f37b08325(i);
	    } else if (((Double) i[121]).doubleValue() > 1.21) {
	    p = BumpSenseDirectionClassifier_1.N49968124329(i);
	    } 
	    return p;
	  }
	  static double N66f37b08325(Object []i) {
	    double p = Double.NaN;
	    if (i[76] == null) {
	      p = 0;
	    } else if (((Double) i[76]).doubleValue() <= 2.9) {
	    p = BumpSenseDirectionClassifier_1.N7b127f05326(i);
	    } else if (((Double) i[76]).doubleValue() > 2.9) {
	    p = BumpSenseDirectionClassifier_1.N1b8f012e328(i);
	    } 
	    return p;
	  }
	  static double N7b127f05326(Object []i) {
	    double p = Double.NaN;
	    if (i[163] == null) {
	      p = 3;
	    } else if (((Double) i[163]).doubleValue() <= 0.0) {
	    p = BumpSenseDirectionClassifier_1.N7b516062327(i);
	    } else if (((Double) i[163]).doubleValue() > 0.0) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7b516062327(Object []i) {
	    double p = Double.NaN;
	    if (i[15] == null) {
	      p = 2;
	    } else if (((Double) i[15]).doubleValue() <= 1.85) {
	      p = 2;
	    } else if (((Double) i[15]).doubleValue() > 1.85) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N1b8f012e328(Object []i) {
	    double p = Double.NaN;
	    if (i[14] == null) {
	      p = 1;
	    } else if (((Double) i[14]).doubleValue() <= 8.8) {
	      p = 1;
	    } else if (((Double) i[14]).doubleValue() > 8.8) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N49968124329(Object []i) {
	    double p = Double.NaN;
	    if (i[56] == null) {
	      p = 1;
	    } else if (((Double) i[56]).doubleValue() <= 10.35) {
	      p = 1;
	    } else if (((Double) i[56]).doubleValue() > 10.35) {
	    p = BumpSenseDirectionClassifier_1.N37f8883a330(i);
	    } 
	    return p;
	  }
	  static double N37f8883a330(Object []i) {
	    double p = Double.NaN;
	    if (i[13] == null) {
	      p = 2;
	    } else if (((Double) i[13]).doubleValue() <= 3.47) {
	      p = 2;
	    } else if (((Double) i[13]).doubleValue() > 3.47) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class BumpSenseDirectionClassifier_2 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseDirectionClassifier_2.N1db7b48b331(i);
	    return p;
	  }
	  static double N1db7b48b331(Object []i) {
	    double p = Double.NaN;
	    if (i[22] == null) {
	      p = 2;
	    } else if (((Double) i[22]).doubleValue() <= 3.06) {
	    p = BumpSenseDirectionClassifier_2.N7ae20eb332(i);
	    } else if (((Double) i[22]).doubleValue() > 3.06) {
	    p = BumpSenseDirectionClassifier_2.N21d964b7351(i);
	    } 
	    return p;
	  }
	  static double N7ae20eb332(Object []i) {
	    double p = Double.NaN;
	    if (i[40] == null) {
	      p = 2;
	    } else if (((Double) i[40]).doubleValue() <= 4.09) {
	    p = BumpSenseDirectionClassifier_2.N38f3283d333(i);
	    } else if (((Double) i[40]).doubleValue() > 4.09) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N38f3283d333(Object []i) {
	    double p = Double.NaN;
	    if (i[58] == null) {
	      p = 2;
	    } else if (((Double) i[58]).doubleValue() <= 4.52) {
	    p = BumpSenseDirectionClassifier_2.N63d6da00334(i);
	    } else if (((Double) i[58]).doubleValue() > 4.52) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N63d6da00334(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 2;
	    } else if (((Double) i[9]).doubleValue() <= 2.4) {
	    p = BumpSenseDirectionClassifier_2.N2e826935335(i);
	    } else if (((Double) i[9]).doubleValue() > 2.4) {
	    p = BumpSenseDirectionClassifier_2.N5718d901349(i);
	    } 
	    return p;
	  }
	  static double N2e826935335(Object []i) {
	    double p = Double.NaN;
	    if (i[85] == null) {
	      p = 3;
	    } else if (((Double) i[85]).doubleValue() <= 2.87) {
	    p = BumpSenseDirectionClassifier_2.N73c92e6d336(i);
	    } else if (((Double) i[85]).doubleValue() > 2.87) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N73c92e6d336(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 3;
	    } else if (((Double) i[4]).doubleValue() <= 1.55) {
	    p = BumpSenseDirectionClassifier_2.N1d07317e337(i);
	    } else if (((Double) i[4]).doubleValue() > 1.55) {
	    p = BumpSenseDirectionClassifier_2.N4d4a119a346(i);
	    } 
	    return p;
	  }
	  static double N1d07317e337(Object []i) {
	    double p = Double.NaN;
	    if (i[97] == null) {
	      p = 3;
	    } else if (((Double) i[97]).doubleValue() <= 2.89) {
	    p = BumpSenseDirectionClassifier_2.N43425615338(i);
	    } else if (((Double) i[97]).doubleValue() > 2.89) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N43425615338(Object []i) {
	    double p = Double.NaN;
	    if (i[37] == null) {
	      p = 3;
	    } else if (((Double) i[37]).doubleValue() <= 2.92) {
	    p = BumpSenseDirectionClassifier_2.N38219f32339(i);
	    } else if (((Double) i[37]).doubleValue() > 2.92) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N38219f32339(Object []i) {
	    double p = Double.NaN;
	    if (i[13] == null) {
	      p = 3;
	    } else if (((Double) i[13]).doubleValue() <= 1.78) {
	    p = BumpSenseDirectionClassifier_2.N275aa868340(i);
	    } else if (((Double) i[13]).doubleValue() > 1.78) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N275aa868340(Object []i) {
	    double p = Double.NaN;
	    if (i[160] == null) {
	      p = 2;
	    } else if (((Double) i[160]).doubleValue() <= -1.99) {
	      p = 2;
	    } else if (((Double) i[160]).doubleValue() > -1.99) {
	    p = BumpSenseDirectionClassifier_2.N30e65807341(i);
	    } 
	    return p;
	  }
	  static double N30e65807341(Object []i) {
	    double p = Double.NaN;
	    if (i[154] == null) {
	      p = 3;
	    } else if (((Double) i[154]).doubleValue() <= 0.31) {
	    p = BumpSenseDirectionClassifier_2.N629d4ca5342(i);
	    } else if (((Double) i[154]).doubleValue() > 0.31) {
	    p = BumpSenseDirectionClassifier_2.N68593f4e344(i);
	    } 
	    return p;
	  }
	  static double N629d4ca5342(Object []i) {
	    double p = Double.NaN;
	    if (i[61] == null) {
	      p = 3;
	    } else if (((Double) i[61]).doubleValue() <= 2.86) {
	      p = 3;
	    } else if (((Double) i[61]).doubleValue() > 2.86) {
	    p = BumpSenseDirectionClassifier_2.N45131737343(i);
	    } 
	    return p;
	  }
	  static double N45131737343(Object []i) {
	    double p = Double.NaN;
	    if (i[84] == null) {
	      p = 3;
	    } else if (((Double) i[84]).doubleValue() <= -3.66) {
	      p = 3;
	    } else if (((Double) i[84]).doubleValue() > -3.66) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N68593f4e344(Object []i) {
	    double p = Double.NaN;
	    if (i[123] == null) {
	      p = 3;
	    } else if (((Double) i[123]).doubleValue() <= -0.28) {
	      p = 3;
	    } else if (((Double) i[123]).doubleValue() > -0.28) {
	    p = BumpSenseDirectionClassifier_2.N3b4b4f67345(i);
	    } 
	    return p;
	  }
	  static double N3b4b4f67345(Object []i) {
	    double p = Double.NaN;
	    if (i[45] == null) {
	      p = 2;
	    } else if (((Double) i[45]).doubleValue() <= 2.71) {
	      p = 2;
	    } else if (((Double) i[45]).doubleValue() > 2.71) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4d4a119a346(Object []i) {
	    double p = Double.NaN;
	    if (i[114] == null) {
	      p = 3;
	    } else if (((Double) i[114]).doubleValue() <= -1.7) {
	      p = 3;
	    } else if (((Double) i[114]).doubleValue() > -1.7) {
	    p = BumpSenseDirectionClassifier_2.N39c9bd1a347(i);
	    } 
	    return p;
	  }
	  static double N39c9bd1a347(Object []i) {
	    double p = Double.NaN;
	    if (i[136] == null) {
	      p = 0;
	    } else if (((Double) i[136]).doubleValue() <= 1.85) {
	    p = BumpSenseDirectionClassifier_2.N6b9e1399348(i);
	    } else if (((Double) i[136]).doubleValue() > 1.85) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6b9e1399348(Object []i) {
	    double p = Double.NaN;
	    if (i[155] == null) {
	      p = 2;
	    } else if (((Double) i[155]).doubleValue() <= 9.96) {
	      p = 2;
	    } else if (((Double) i[155]).doubleValue() > 9.96) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5718d901349(Object []i) {
	    double p = Double.NaN;
	    if (i[76] == null) {
	      p = 0;
	    } else if (((Double) i[76]).doubleValue() <= 3.18) {
	      p = 0;
	    } else if (((Double) i[76]).doubleValue() > 3.18) {
	    p = BumpSenseDirectionClassifier_2.N204efd53350(i);
	    } 
	    return p;
	  }
	  static double N204efd53350(Object []i) {
	    double p = Double.NaN;
	    if (i[163] == null) {
	      p = 1;
	    } else if (((Double) i[163]).doubleValue() <= 0.31) {
	      p = 1;
	    } else if (((Double) i[163]).doubleValue() > 0.31) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N21d964b7351(Object []i) {
	    double p = Double.NaN;
	    if (i[18] == null) {
	      p = 1;
	    } else if (((Double) i[18]).doubleValue() <= 6.53) {
	      p = 1;
	    } else if (((Double) i[18]).doubleValue() > 6.53) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class BumpSenseDirectionClassifier_3 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseDirectionClassifier_3.N47633bbd352(i);
	    return p;
	  }
	  static double N47633bbd352(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 2;
	    } else if (((Double) i[10]).doubleValue() <= 4.4) {
	    p = BumpSenseDirectionClassifier_3.N43e719e8353(i);
	    } else if (((Double) i[10]).doubleValue() > 4.4) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N43e719e8353(Object []i) {
	    double p = Double.NaN;
	    if (i[148] == null) {
	      p = 2;
	    } else if (((Double) i[148]).doubleValue() <= 2.39) {
	    p = BumpSenseDirectionClassifier_3.N7955f12b354(i);
	    } else if (((Double) i[148]).doubleValue() > 2.39) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N7955f12b354(Object []i) {
	    double p = Double.NaN;
	    if (i[31] == null) {
	      p = 2;
	    } else if (((Double) i[31]).doubleValue() <= 4.64) {
	    p = BumpSenseDirectionClassifier_3.N794c7c48355(i);
	    } else if (((Double) i[31]).doubleValue() > 4.64) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N794c7c48355(Object []i) {
	    double p = Double.NaN;
	    if (i[111] == null) {
	      p = 3;
	    } else if (((Double) i[111]).doubleValue() <= -1.95) {
	      p = 3;
	    } else if (((Double) i[111]).doubleValue() > -1.95) {
	    p = BumpSenseDirectionClassifier_3.Nc73992f356(i);
	    } 
	    return p;
	  }
	  static double Nc73992f356(Object []i) {
	    double p = Double.NaN;
	    if (i[12] == null) {
	      p = 2;
	    } else if (((Double) i[12]).doubleValue() <= 1.51) {
	    p = BumpSenseDirectionClassifier_3.N794de30b357(i);
	    } else if (((Double) i[12]).doubleValue() > 1.51) {
	    p = BumpSenseDirectionClassifier_3.N48340dbb372(i);
	    } 
	    return p;
	  }
	  static double N794de30b357(Object []i) {
	    double p = Double.NaN;
	    if (i[33] == null) {
	      p = 2;
	    } else if (((Double) i[33]).doubleValue() <= 3.42) {
	    p = BumpSenseDirectionClassifier_3.N68752564358(i);
	    } else if (((Double) i[33]).doubleValue() > 3.42) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N68752564358(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 3;
	    } else if (((Double) i[3]).doubleValue() <= -2.93) {
	      p = 3;
	    } else if (((Double) i[3]).doubleValue() > -2.93) {
	    p = BumpSenseDirectionClassifier_3.N62e9fdcf359(i);
	    } 
	    return p;
	  }
	  static double N62e9fdcf359(Object []i) {
	    double p = Double.NaN;
	    if (i[60] == null) {
	      p = 2;
	    } else if (((Double) i[60]).doubleValue() <= 2.28) {
	    p = BumpSenseDirectionClassifier_3.N701653c4360(i);
	    } else if (((Double) i[60]).doubleValue() > 2.28) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N701653c4360(Object []i) {
	    double p = Double.NaN;
	    if (i[66] == null) {
	      p = 3;
	    } else if (((Double) i[66]).doubleValue() <= -2.49) {
	    p = BumpSenseDirectionClassifier_3.N49d5a259361(i);
	    } else if (((Double) i[66]).doubleValue() > -2.49) {
	    p = BumpSenseDirectionClassifier_3.N6895a6ed362(i);
	    } 
	    return p;
	  }
	  static double N49d5a259361(Object []i) {
	    double p = Double.NaN;
	    if (i[164] == null) {
	      p = 0;
	    } else if (((Double) i[164]).doubleValue() <= 9.81) {
	      p = 0;
	    } else if (((Double) i[164]).doubleValue() > 9.81) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N6895a6ed362(Object []i) {
	    double p = Double.NaN;
	    if (i[23] == null) {
	      p = 3;
	    } else if (((Double) i[23]).doubleValue() <= 7.76) {
	    p = BumpSenseDirectionClassifier_3.N3902473f363(i);
	    } else if (((Double) i[23]).doubleValue() > 7.76) {
	    p = BumpSenseDirectionClassifier_3.N44939656364(i);
	    } 
	    return p;
	  }
	  static double N3902473f363(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 2;
	    } else if (((Double) i[0]).doubleValue() <= 0.3) {
	      p = 2;
	    } else if (((Double) i[0]).doubleValue() > 0.3) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N44939656364(Object []i) {
	    double p = Double.NaN;
	    if (i[147] == null) {
	      p = 3;
	    } else if (((Double) i[147]).doubleValue() <= -0.83) {
	    p = BumpSenseDirectionClassifier_3.N35730b46365(i);
	    } else if (((Double) i[147]).doubleValue() > -0.83) {
	    p = BumpSenseDirectionClassifier_3.N13e93c14366(i);
	    } 
	    return p;
	  }
	  static double N35730b46365(Object []i) {
	    double p = Double.NaN;
	    if (i[160] == null) {
	      p = 3;
	    } else if (((Double) i[160]).doubleValue() <= 0.31) {
	      p = 3;
	    } else if (((Double) i[160]).doubleValue() > 0.31) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N13e93c14366(Object []i) {
	    double p = Double.NaN;
	    if (i[150] == null) {
	      p = 2;
	    } else if (((Double) i[150]).doubleValue() <= -0.61) {
	    p = BumpSenseDirectionClassifier_3.N35674f42367(i);
	    } else if (((Double) i[150]).doubleValue() > -0.61) {
	    p = BumpSenseDirectionClassifier_3.N11849172368(i);
	    } 
	    return p;
	  }
	  static double N35674f42367(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 2;
	    } else if (((Double) i[0]).doubleValue() <= 0.85) {
	      p = 2;
	    } else if (((Double) i[0]).doubleValue() > 0.85) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N11849172368(Object []i) {
	    double p = Double.NaN;
	    if (i[151] == null) {
	      p = 2;
	    } else if (((Double) i[151]).doubleValue() <= -2.6) {
	    p = BumpSenseDirectionClassifier_3.N1668dc5a369(i);
	    } else if (((Double) i[151]).doubleValue() > -2.6) {
	    p = BumpSenseDirectionClassifier_3.N3e5aa434370(i);
	    } 
	    return p;
	  }
	  static double N1668dc5a369(Object []i) {
	    double p = Double.NaN;
	    if (i[69] == null) {
	      p = 2;
	    } else if (((Double) i[69]).doubleValue() <= -0.03) {
	      p = 2;
	    } else if (((Double) i[69]).doubleValue() > -0.03) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3e5aa434370(Object []i) {
	    double p = Double.NaN;
	    if (i[39] == null) {
	      p = 2;
	    } else if (((Double) i[39]).doubleValue() <= -1.16) {
	    p = BumpSenseDirectionClassifier_3.N30d271e7371(i);
	    } else if (((Double) i[39]).doubleValue() > -1.16) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N30d271e7371(Object []i) {
	    double p = Double.NaN;
	    if (i[30] == null) {
	      p = 2;
	    } else if (((Double) i[30]).doubleValue() <= -0.46) {
	      p = 2;
	    } else if (((Double) i[30]).doubleValue() > -0.46) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N48340dbb372(Object []i) {
	    double p = Double.NaN;
	    if (i[148] == null) {
	      p = 3;
	    } else if (((Double) i[148]).doubleValue() <= -0.03) {
	    p = BumpSenseDirectionClassifier_3.N51719505373(i);
	    } else if (((Double) i[148]).doubleValue() > -0.03) {
	    p = BumpSenseDirectionClassifier_3.N77eea508374(i);
	    } 
	    return p;
	  }
	  static double N51719505373(Object []i) {
	    double p = Double.NaN;
	    if (i[161] == null) {
	      p = 3;
	    } else if (((Double) i[161]).doubleValue() <= 10.42) {
	      p = 3;
	    } else if (((Double) i[161]).doubleValue() > 10.42) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N77eea508374(Object []i) {
	    double p = Double.NaN;
	    if (i[20] == null) {
	      p = 3;
	    } else if (((Double) i[20]).doubleValue() <= 6.02) {
	      p = 3;
	    } else if (((Double) i[20]).doubleValue() > 6.02) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class BumpSenseDirectionClassifier_4 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseDirectionClassifier_4.N5494edbb375(i);
	    return p;
	  }
	  static double N5494edbb375(Object []i) {
	    double p = Double.NaN;
	    if (i[67] == null) {
	      p = 3;
	    } else if (((Double) i[67]).doubleValue() <= 4.56) {
	    p = BumpSenseDirectionClassifier_4.N7d83bb5e376(i);
	    } else if (((Double) i[67]).doubleValue() > 4.56) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N7d83bb5e376(Object []i) {
	    double p = Double.NaN;
	    if (i[145] == null) {
	      p = 3;
	    } else if (((Double) i[145]).doubleValue() <= 1.76) {
	    p = BumpSenseDirectionClassifier_4.N538258b2377(i);
	    } else if (((Double) i[145]).doubleValue() > 1.76) {
	    p = BumpSenseDirectionClassifier_4.N4d4d311404(i);
	    } 
	    return p;
	  }
	  static double N538258b2377(Object []i) {
	    double p = Double.NaN;
	    if (i[22] == null) {
	      p = 3;
	    } else if (((Double) i[22]).doubleValue() <= 2.38) {
	    p = BumpSenseDirectionClassifier_4.N128d38f3378(i);
	    } else if (((Double) i[22]).doubleValue() > 2.38) {
	    p = BumpSenseDirectionClassifier_4.N44179313401(i);
	    } 
	    return p;
	  }
	  static double N128d38f3378(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 3;
	    } else if (((Double) i[3]).doubleValue() <= 2.43) {
	    p = BumpSenseDirectionClassifier_4.N7595e308379(i);
	    } else if (((Double) i[3]).doubleValue() > 2.43) {
	    p = BumpSenseDirectionClassifier_4.N31e73c0d400(i);
	    } 
	    return p;
	  }
	  static double N7595e308379(Object []i) {
	    double p = Double.NaN;
	    if (i[151] == null) {
	      p = 2;
	    } else if (((Double) i[151]).doubleValue() <= -2.15) {
	    p = BumpSenseDirectionClassifier_4.N436c5e87380(i);
	    } else if (((Double) i[151]).doubleValue() > -2.15) {
	    p = BumpSenseDirectionClassifier_4.N7fb213a5381(i);
	    } 
	    return p;
	  }
	  static double N436c5e87380(Object []i) {
	    double p = Double.NaN;
	    if (i[161] == null) {
	      p = 1;
	    } else if (((Double) i[161]).doubleValue() <= 9.5) {
	      p = 1;
	    } else if (((Double) i[161]).doubleValue() > 9.5) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N7fb213a5381(Object []i) {
	    double p = Double.NaN;
	    if (i[163] == null) {
	      p = 3;
	    } else if (((Double) i[163]).doubleValue() <= 0.31) {
	    p = BumpSenseDirectionClassifier_4.N427f722382(i);
	    } else if (((Double) i[163]).doubleValue() > 0.31) {
	    p = BumpSenseDirectionClassifier_4.N7409a8e3395(i);
	    } 
	    return p;
	  }
	  static double N427f722382(Object []i) {
	    double p = Double.NaN;
	    if (i[108] == null) {
	      p = 3;
	    } else if (((Double) i[108]).doubleValue() <= 4.12) {
	    p = BumpSenseDirectionClassifier_4.N5bd1db4f383(i);
	    } else if (((Double) i[108]).doubleValue() > 4.12) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5bd1db4f383(Object []i) {
	    double p = Double.NaN;
	    if (i[28] == null) {
	      p = 2;
	    } else if (((Double) i[28]).doubleValue() <= -1.87) {
	      p = 2;
	    } else if (((Double) i[28]).doubleValue() > -1.87) {
	    p = BumpSenseDirectionClassifier_4.N2e954ea1384(i);
	    } 
	    return p;
	  }
	  static double N2e954ea1384(Object []i) {
	    double p = Double.NaN;
	    if (i[58] == null) {
	      p = 3;
	    } else if (((Double) i[58]).doubleValue() <= 3.27) {
	    p = BumpSenseDirectionClassifier_4.N4c5d43eb385(i);
	    } else if (((Double) i[58]).doubleValue() > 3.27) {
	    p = BumpSenseDirectionClassifier_4.N39d1aa64394(i);
	    } 
	    return p;
	  }
	  static double N4c5d43eb385(Object []i) {
	    double p = Double.NaN;
	    if (i[91] == null) {
	      p = 3;
	    } else if (((Double) i[91]).doubleValue() <= 1.34) {
	    p = BumpSenseDirectionClassifier_4.N7f162077386(i);
	    } else if (((Double) i[91]).doubleValue() > 1.34) {
	    p = BumpSenseDirectionClassifier_4.N72faf49d393(i);
	    } 
	    return p;
	  }
	  static double N7f162077386(Object []i) {
	    double p = Double.NaN;
	    if (i[160] == null) {
	      p = 3;
	    } else if (((Double) i[160]).doubleValue() <= 0.46) {
	    p = BumpSenseDirectionClassifier_4.N5ada5d0387(i);
	    } else if (((Double) i[160]).doubleValue() > 0.46) {
	    p = BumpSenseDirectionClassifier_4.N70edab58391(i);
	    } 
	    return p;
	  }
	  static double N5ada5d0387(Object []i) {
	    double p = Double.NaN;
	    if (i[119] == null) {
	      p = 2;
	    } else if (((Double) i[119]).doubleValue() <= 7.97) {
	    p = BumpSenseDirectionClassifier_4.N4b60fd99388(i);
	    } else if (((Double) i[119]).doubleValue() > 7.97) {
	    p = BumpSenseDirectionClassifier_4.N4ca96e78389(i);
	    } 
	    return p;
	  }
	  static double N4b60fd99388(Object []i) {
	    double p = Double.NaN;
	    if (i[15] == null) {
	      p = 2;
	    } else if (((Double) i[15]).doubleValue() <= -0.62) {
	      p = 2;
	    } else if (((Double) i[15]).doubleValue() > -0.62) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N4ca96e78389(Object []i) {
	    double p = Double.NaN;
	    if (i[49] == null) {
	      p = 3;
	    } else if (((Double) i[49]).doubleValue() <= 0.89) {
	      p = 3;
	    } else if (((Double) i[49]).doubleValue() > 0.89) {
	    p = BumpSenseDirectionClassifier_4.N793af9a390(i);
	    } 
	    return p;
	  }
	  static double N793af9a390(Object []i) {
	    double p = Double.NaN;
	    if (i[137] == null) {
	      p = 3;
	    } else if (((Double) i[137]).doubleValue() <= 9.42) {
	      p = 3;
	    } else if (((Double) i[137]).doubleValue() > 9.42) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N70edab58391(Object []i) {
	    double p = Double.NaN;
	    if (i[164] == null) {
	      p = 2;
	    } else if (((Double) i[164]).doubleValue() <= 9.65) {
	      p = 2;
	    } else if (((Double) i[164]).doubleValue() > 9.65) {
	    p = BumpSenseDirectionClassifier_4.N38c5854392(i);
	    } 
	    return p;
	  }
	  static double N38c5854392(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 3;
	    } else if (((Double) i[9]).doubleValue() <= 0.64) {
	      p = 3;
	    } else if (((Double) i[9]).doubleValue() > 0.64) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N72faf49d393(Object []i) {
	    double p = Double.NaN;
	    if (i[159] == null) {
	      p = 0;
	    } else if (((Double) i[159]).doubleValue() <= 0.31) {
	      p = 0;
	    } else if (((Double) i[159]).doubleValue() > 0.31) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N39d1aa64394(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 2;
	    } else if (((Double) i[6]).doubleValue() <= 0.1) {
	      p = 2;
	    } else if (((Double) i[6]).doubleValue() > 0.1) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7409a8e3395(Object []i) {
	    double p = Double.NaN;
	    if (i[135] == null) {
	      p = 2;
	    } else if (((Double) i[135]).doubleValue() <= 0.65) {
	    p = BumpSenseDirectionClassifier_4.N262f0a99396(i);
	    } else if (((Double) i[135]).doubleValue() > 0.65) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N262f0a99396(Object []i) {
	    double p = Double.NaN;
	    if (i[138] == null) {
	      p = 3;
	    } else if (((Double) i[138]).doubleValue() <= -0.95) {
	      p = 3;
	    } else if (((Double) i[138]).doubleValue() > -0.95) {
	    p = BumpSenseDirectionClassifier_4.N5a60d664397(i);
	    } 
	    return p;
	  }
	  static double N5a60d664397(Object []i) {
	    double p = Double.NaN;
	    if (i[57] == null) {
	      p = 2;
	    } else if (((Double) i[57]).doubleValue() <= 1.63) {
	    p = BumpSenseDirectionClassifier_4.Nb9b6d97398(i);
	    } else if (((Double) i[57]).doubleValue() > 1.63) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double Nb9b6d97398(Object []i) {
	    double p = Double.NaN;
	    if (i[153] == null) {
	      p = 2;
	    } else if (((Double) i[153]).doubleValue() <= 2.76) {
	    p = BumpSenseDirectionClassifier_4.N937da75399(i);
	    } else if (((Double) i[153]).doubleValue() > 2.76) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N937da75399(Object []i) {
	    double p = Double.NaN;
	    if (i[75] == null) {
	      p = 2;
	    } else if (((Double) i[75]).doubleValue() <= 2.05) {
	      p = 2;
	    } else if (((Double) i[75]).doubleValue() > 2.05) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N31e73c0d400(Object []i) {
	    double p = Double.NaN;
	    if (i[160] == null) {
	      p = 0;
	    } else if (((Double) i[160]).doubleValue() <= 3.06) {
	      p = 0;
	    } else if (((Double) i[160]).doubleValue() > 3.06) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N44179313401(Object []i) {
	    double p = Double.NaN;
	    if (i[53] == null) {
	      p = 0;
	    } else if (((Double) i[53]).doubleValue() <= 11.41) {
	    p = BumpSenseDirectionClassifier_4.N67b8e751402(i);
	    } else if (((Double) i[53]).doubleValue() > 11.41) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N67b8e751402(Object []i) {
	    double p = Double.NaN;
	    if (i[152] == null) {
	      p = 1;
	    } else if (((Double) i[152]).doubleValue() <= 9.81) {
	      p = 1;
	    } else if (((Double) i[152]).doubleValue() > 9.81) {
	    p = BumpSenseDirectionClassifier_4.N1c5aac0a403(i);
	    } 
	    return p;
	  }
	  static double N1c5aac0a403(Object []i) {
	    double p = Double.NaN;
	    if (i[124] == null) {
	      p = 0;
	    } else if (((Double) i[124]).doubleValue() <= 1.89) {
	      p = 0;
	    } else if (((Double) i[124]).doubleValue() > 1.89) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N4d4d311404(Object []i) {
	    double p = Double.NaN;
	    if (i[120] == null) {
	      p = 3;
	    } else if (((Double) i[120]).doubleValue() <= -0.59) {
	      p = 3;
	    } else if (((Double) i[120]).doubleValue() > -0.59) {
	    p = BumpSenseDirectionClassifier_4.N306d0391405(i);
	    } 
	    return p;
	  }
	  static double N306d0391405(Object []i) {
	    double p = Double.NaN;
	    if (i[92] == null) {
	      p = 1;
	    } else if (((Double) i[92]).doubleValue() <= 9.42) {
	      p = 1;
	    } else if (((Double) i[92]).doubleValue() > 9.42) {
	    p = BumpSenseDirectionClassifier_4.N45053d6d406(i);
	    } 
	    return p;
	  }
	  static double N45053d6d406(Object []i) {
	    double p = Double.NaN;
	    if (i[121] == null) {
	      p = 2;
	    } else if (((Double) i[121]).doubleValue() <= 2.6) {
	      p = 2;
	    } else if (((Double) i[121]).doubleValue() > 2.6) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class BumpSenseDirectionClassifier_5 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseDirectionClassifier_5.N5b03e281407(i);
	    return p;
	  }
	  static double N5b03e281407(Object []i) {
	    double p = Double.NaN;
	    if (i[13] == null) {
	      p = 3;
	    } else if (((Double) i[13]).doubleValue() <= 3.38) {
	    p = BumpSenseDirectionClassifier_5.N5c0bb1d5408(i);
	    } else if (((Double) i[13]).doubleValue() > 3.38) {
	    p = BumpSenseDirectionClassifier_5.N5895f780437(i);
	    } 
	    return p;
	  }
	  static double N5c0bb1d5408(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 3;
	    } else if (((Double) i[3]).doubleValue() <= 2.43) {
	    p = BumpSenseDirectionClassifier_5.N3c84629409(i);
	    } else if (((Double) i[3]).doubleValue() > 2.43) {
	    p = BumpSenseDirectionClassifier_5.N60667262434(i);
	    } 
	    return p;
	  }
	  static double N3c84629409(Object []i) {
	    double p = Double.NaN;
	    if (i[118] == null) {
	      p = 3;
	    } else if (((Double) i[118]).doubleValue() <= 1.96) {
	    p = BumpSenseDirectionClassifier_5.N51762faf410(i);
	    } else if (((Double) i[118]).doubleValue() > 1.96) {
	    p = BumpSenseDirectionClassifier_5.N6ad687ad431(i);
	    } 
	    return p;
	  }
	  static double N51762faf410(Object []i) {
	    double p = Double.NaN;
	    if (i[52] == null) {
	      p = 3;
	    } else if (((Double) i[52]).doubleValue() <= 4.49) {
	    p = BumpSenseDirectionClassifier_5.N2634b3f1411(i);
	    } else if (((Double) i[52]).doubleValue() > 4.49) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2634b3f1411(Object []i) {
	    double p = Double.NaN;
	    if (i[90] == null) {
	      p = 3;
	    } else if (((Double) i[90]).doubleValue() <= 4.17) {
	    p = BumpSenseDirectionClassifier_5.N4e11a6cf412(i);
	    } else if (((Double) i[90]).doubleValue() > 4.17) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4e11a6cf412(Object []i) {
	    double p = Double.NaN;
	    if (i[30] == null) {
	      p = 3;
	    } else if (((Double) i[30]).doubleValue() <= -1.54) {
	    p = BumpSenseDirectionClassifier_5.N68de8813413(i);
	    } else if (((Double) i[30]).doubleValue() > -1.54) {
	    p = BumpSenseDirectionClassifier_5.N21ffbd3b415(i);
	    } 
	    return p;
	  }
	  static double N68de8813413(Object []i) {
	    double p = Double.NaN;
	    if (i[154] == null) {
	      p = 2;
	    } else if (((Double) i[154]).doubleValue() <= -1.69) {
	      p = 2;
	    } else if (((Double) i[154]).doubleValue() > -1.69) {
	    p = BumpSenseDirectionClassifier_5.N69b7cd2e414(i);
	    } 
	    return p;
	  }
	  static double N69b7cd2e414(Object []i) {
	    double p = Double.NaN;
	    if (i[48] == null) {
	      p = 3;
	    } else if (((Double) i[48]).doubleValue() <= 3.37) {
	      p = 3;
	    } else if (((Double) i[48]).doubleValue() > 3.37) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N21ffbd3b415(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 3;
	    } else if (((Double) i[0]).doubleValue() <= -3.0) {
	    p = BumpSenseDirectionClassifier_5.N1ce07ded416(i);
	    } else if (((Double) i[0]).doubleValue() > -3.0) {
	    p = BumpSenseDirectionClassifier_5.N566b616a417(i);
	    } 
	    return p;
	  }
	  static double N1ce07ded416(Object []i) {
	    double p = Double.NaN;
	    if (i[59] == null) {
	      p = 3;
	    } else if (((Double) i[59]).doubleValue() <= 9.06) {
	      p = 3;
	    } else if (((Double) i[59]).doubleValue() > 9.06) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N566b616a417(Object []i) {
	    double p = Double.NaN;
	    if (i[54] == null) {
	      p = 3;
	    } else if (((Double) i[54]).doubleValue() <= -1.23) {
	    p = BumpSenseDirectionClassifier_5.N23c8a279418(i);
	    } else if (((Double) i[54]).doubleValue() > -1.23) {
	    p = BumpSenseDirectionClassifier_5.N4922c849419(i);
	    } 
	    return p;
	  }
	  static double N23c8a279418(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 3;
	    } else if (((Double) i[0]).doubleValue() <= 1.68) {
	      p = 3;
	    } else if (((Double) i[0]).doubleValue() > 1.68) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4922c849419(Object []i) {
	    double p = Double.NaN;
	    if (i[99] == null) {
	      p = 3;
	    } else if (((Double) i[99]).doubleValue() <= -3.5) {
	      p = 3;
	    } else if (((Double) i[99]).doubleValue() > -3.5) {
	    p = BumpSenseDirectionClassifier_5.Na8b5622420(i);
	    } 
	    return p;
	  }
	  static double Na8b5622420(Object []i) {
	    double p = Double.NaN;
	    if (i[57] == null) {
	      p = 2;
	    } else if (((Double) i[57]).doubleValue() <= 2.78) {
	    p = BumpSenseDirectionClassifier_5.N41c3d796421(i);
	    } else if (((Double) i[57]).doubleValue() > 2.78) {
	    p = BumpSenseDirectionClassifier_5.N5ee47d2e430(i);
	    } 
	    return p;
	  }
	  static double N41c3d796421(Object []i) {
	    double p = Double.NaN;
	    if (i[51] == null) {
	      p = 3;
	    } else if (((Double) i[51]).doubleValue() <= -1.5) {
	      p = 3;
	    } else if (((Double) i[51]).doubleValue() > -1.5) {
	    p = BumpSenseDirectionClassifier_5.N207eda95422(i);
	    } 
	    return p;
	  }
	  static double N207eda95422(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 2;
	    } else if (((Double) i[9]).doubleValue() <= 1.6) {
	    p = BumpSenseDirectionClassifier_5.N68407cdd423(i);
	    } else if (((Double) i[9]).doubleValue() > 1.6) {
	    p = BumpSenseDirectionClassifier_5.Ncb76f2f429(i);
	    } 
	    return p;
	  }
	  static double N68407cdd423(Object []i) {
	    double p = Double.NaN;
	    if (i[150] == null) {
	      p = 2;
	    } else if (((Double) i[150]).doubleValue() <= 1.84) {
	    p = BumpSenseDirectionClassifier_5.N61c5c6a3424(i);
	    } else if (((Double) i[150]).doubleValue() > 1.84) {
	    p = BumpSenseDirectionClassifier_5.N5bd923b5428(i);
	    } 
	    return p;
	  }
	  static double N61c5c6a3424(Object []i) {
	    double p = Double.NaN;
	    if (i[146] == null) {
	      p = 2;
	    } else if (((Double) i[146]).doubleValue() <= 9.47) {
	      p = 2;
	    } else if (((Double) i[146]).doubleValue() > 9.47) {
	    p = BumpSenseDirectionClassifier_5.N7f74297a425(i);
	    } 
	    return p;
	  }
	  static double N7f74297a425(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 2;
	    } else if (((Double) i[5]).doubleValue() <= 10.09) {
	    p = BumpSenseDirectionClassifier_5.N234f49f5426(i);
	    } else if (((Double) i[5]).doubleValue() > 10.09) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N234f49f5426(Object []i) {
	    double p = Double.NaN;
	    if (i[47] == null) {
	      p = 2;
	    } else if (((Double) i[47]).doubleValue() <= 9.22) {
	      p = 2;
	    } else if (((Double) i[47]).doubleValue() > 9.22) {
	    p = BumpSenseDirectionClassifier_5.N2a8085ef427(i);
	    } 
	    return p;
	  }
	  static double N2a8085ef427(Object []i) {
	    double p = Double.NaN;
	    if (i[160] == null) {
	      p = 2;
	    } else if (((Double) i[160]).doubleValue() <= 0.15) {
	      p = 2;
	    } else if (((Double) i[160]).doubleValue() > 0.15) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5bd923b5428(Object []i) {
	    double p = Double.NaN;
	    if (i[164] == null) {
	      p = 2;
	    } else if (((Double) i[164]).doubleValue() <= 9.96) {
	      p = 2;
	    } else if (((Double) i[164]).doubleValue() > 9.96) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double Ncb76f2f429(Object []i) {
	    double p = Double.NaN;
	    if (i[161] == null) {
	      p = 0;
	    } else if (((Double) i[161]).doubleValue() <= 10.11) {
	      p = 0;
	    } else if (((Double) i[161]).doubleValue() > 10.11) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N5ee47d2e430(Object []i) {
	    double p = Double.NaN;
	    if (i[158] == null) {
	      p = 3;
	    } else if (((Double) i[158]).doubleValue() <= 10.11) {
	      p = 3;
	    } else if (((Double) i[158]).doubleValue() > 10.11) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6ad687ad431(Object []i) {
	    double p = Double.NaN;
	    if (i[61] == null) {
	      p = 2;
	    } else if (((Double) i[61]).doubleValue() <= -0.63) {
	      p = 2;
	    } else if (((Double) i[61]).doubleValue() > -0.63) {
	    p = BumpSenseDirectionClassifier_5.N2a65a5a7432(i);
	    } 
	    return p;
	  }
	  static double N2a65a5a7432(Object []i) {
	    double p = Double.NaN;
	    if (i[150] == null) {
	      p = 0;
	    } else if (((Double) i[150]).doubleValue() <= -0.61) {
	      p = 0;
	    } else if (((Double) i[150]).doubleValue() > -0.61) {
	    p = BumpSenseDirectionClassifier_5.N775e8caf433(i);
	    } 
	    return p;
	  }
	  static double N775e8caf433(Object []i) {
	    double p = Double.NaN;
	    if (i[162] == null) {
	      p = 1;
	    } else if (((Double) i[162]).doubleValue() <= 1.23) {
	      p = 1;
	    } else if (((Double) i[162]).doubleValue() > 1.23) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N60667262434(Object []i) {
	    double p = Double.NaN;
	    if (i[119] == null) {
	      p = 0;
	    } else if (((Double) i[119]).doubleValue() <= 10.23) {
	    p = BumpSenseDirectionClassifier_5.N65dfb15f435(i);
	    } else if (((Double) i[119]).doubleValue() > 10.23) {
	    p = BumpSenseDirectionClassifier_5.N40f60839436(i);
	    } 
	    return p;
	  }
	  static double N65dfb15f435(Object []i) {
	    double p = Double.NaN;
	    if (i[148] == null) {
	      p = 0;
	    } else if (((Double) i[148]).doubleValue() <= 1.9) {
	      p = 0;
	    } else if (((Double) i[148]).doubleValue() > 1.9) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N40f60839436(Object []i) {
	    double p = Double.NaN;
	    if (i[14] == null) {
	      p = 1;
	    } else if (((Double) i[14]).doubleValue() <= 8.65) {
	      p = 1;
	    } else if (((Double) i[14]).doubleValue() > 8.65) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N5895f780437(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= 6.56) {
	    p = BumpSenseDirectionClassifier_5.N5dac21ef438(i);
	    } else if (((Double) i[9]).doubleValue() > 6.56) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5dac21ef438(Object []i) {
	    double p = Double.NaN;
	    if (i[156] == null) {
	      p = 0;
	    } else if (((Double) i[156]).doubleValue() <= -0.77) {
	      p = 0;
	    } else if (((Double) i[156]).doubleValue() > -0.77) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class BumpSenseDirectionClassifier_6 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseDirectionClassifier_6.N4fe801f4439(i);
	    return p;
	  }
	  static double N4fe801f4439(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 2;
	    } else if (((Double) i[10]).doubleValue() <= 3.51) {
	    p = BumpSenseDirectionClassifier_6.N8d86328440(i);
	    } else if (((Double) i[10]).doubleValue() > 3.51) {
	    p = BumpSenseDirectionClassifier_6.N4300d837467(i);
	    } 
	    return p;
	  }
	  static double N8d86328440(Object []i) {
	    double p = Double.NaN;
	    if (i[160] == null) {
	      p = 1;
	    } else if (((Double) i[160]).doubleValue() <= -2.45) {
	    p = BumpSenseDirectionClassifier_6.N3655dba1441(i);
	    } else if (((Double) i[160]).doubleValue() > -2.45) {
	    p = BumpSenseDirectionClassifier_6.N3ec642e5442(i);
	    } 
	    return p;
	  }
	  static double N3655dba1441(Object []i) {
	    double p = Double.NaN;
	    if (i[19] == null) {
	      p = 2;
	    } else if (((Double) i[19]).doubleValue() <= 0.12) {
	      p = 2;
	    } else if (((Double) i[19]).doubleValue() > 0.12) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3ec642e5442(Object []i) {
	    double p = Double.NaN;
	    if (i[69] == null) {
	      p = 2;
	    } else if (((Double) i[69]).doubleValue() <= 4.35) {
	    p = BumpSenseDirectionClassifier_6.N4a51e895443(i);
	    } else if (((Double) i[69]).doubleValue() > 4.35) {
	    p = BumpSenseDirectionClassifier_6.N53120104466(i);
	    } 
	    return p;
	  }
	  static double N4a51e895443(Object []i) {
	    double p = Double.NaN;
	    if (i[57] == null) {
	      p = 2;
	    } else if (((Double) i[57]).doubleValue() <= 4.65) {
	    p = BumpSenseDirectionClassifier_6.N477cb451444(i);
	    } else if (((Double) i[57]).doubleValue() > 4.65) {
	    p = BumpSenseDirectionClassifier_6.N4e93f271465(i);
	    } 
	    return p;
	  }
	  static double N477cb451444(Object []i) {
	    double p = Double.NaN;
	    if (i[27] == null) {
	      p = 2;
	    } else if (((Double) i[27]).doubleValue() <= 3.81) {
	    p = BumpSenseDirectionClassifier_6.N4c225681445(i);
	    } else if (((Double) i[27]).doubleValue() > 3.81) {
	    p = BumpSenseDirectionClassifier_6.N6dd089de463(i);
	    } 
	    return p;
	  }
	  static double N4c225681445(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 3;
	    } else if (((Double) i[0]).doubleValue() <= -2.58) {
	      p = 3;
	    } else if (((Double) i[0]).doubleValue() > -2.58) {
	    p = BumpSenseDirectionClassifier_6.N625d5633446(i);
	    } 
	    return p;
	  }
	  static double N625d5633446(Object []i) {
	    double p = Double.NaN;
	    if (i[24] == null) {
	      p = 3;
	    } else if (((Double) i[24]).doubleValue() <= -2.18) {
	    p = BumpSenseDirectionClassifier_6.N5dc660b8447(i);
	    } else if (((Double) i[24]).doubleValue() > -2.18) {
	    p = BumpSenseDirectionClassifier_6.Naf80021448(i);
	    } 
	    return p;
	  }
	  static double N5dc660b8447(Object []i) {
	    double p = Double.NaN;
	    if (i[154] == null) {
	      p = 3;
	    } else if (((Double) i[154]).doubleValue() <= 0.46) {
	      p = 3;
	    } else if (((Double) i[154]).doubleValue() > 0.46) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double Naf80021448(Object []i) {
	    double p = Double.NaN;
	    if (i[54] == null) {
	      p = 3;
	    } else if (((Double) i[54]).doubleValue() <= -2.14) {
	    p = BumpSenseDirectionClassifier_6.N1fd07c27449(i);
	    } else if (((Double) i[54]).doubleValue() > -2.14) {
	    p = BumpSenseDirectionClassifier_6.N3086f4c2450(i);
	    } 
	    return p;
	  }
	  static double N1fd07c27449(Object []i) {
	    double p = Double.NaN;
	    if (i[91] == null) {
	      p = 3;
	    } else if (((Double) i[91]).doubleValue() <= 0.96) {
	      p = 3;
	    } else if (((Double) i[91]).doubleValue() > 0.96) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3086f4c2450(Object []i) {
	    double p = Double.NaN;
	    if (i[69] == null) {
	      p = 3;
	    } else if (((Double) i[69]).doubleValue() <= -3.82) {
	      p = 3;
	    } else if (((Double) i[69]).doubleValue() > -3.82) {
	    p = BumpSenseDirectionClassifier_6.N6c2f0571451(i);
	    } 
	    return p;
	  }
	  static double N6c2f0571451(Object []i) {
	    double p = Double.NaN;
	    if (i[136] == null) {
	      p = 2;
	    } else if (((Double) i[136]).doubleValue() <= 2.34) {
	    p = BumpSenseDirectionClassifier_6.N30e7534452(i);
	    } else if (((Double) i[136]).doubleValue() > 2.34) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N30e7534452(Object []i) {
	    double p = Double.NaN;
	    if (i[99] == null) {
	      p = 2;
	    } else if (((Double) i[99]).doubleValue() <= 2.49) {
	    p = BumpSenseDirectionClassifier_6.N2a30aa7d453(i);
	    } else if (((Double) i[99]).doubleValue() > 2.49) {
	    p = BumpSenseDirectionClassifier_6.N69596c3a462(i);
	    } 
	    return p;
	  }
	  static double N2a30aa7d453(Object []i) {
	    double p = Double.NaN;
	    if (i[57] == null) {
	      p = 2;
	    } else if (((Double) i[57]).doubleValue() <= 2.53) {
	    p = BumpSenseDirectionClassifier_6.N61090a2e454(i);
	    } else if (((Double) i[57]).doubleValue() > 2.53) {
	    p = BumpSenseDirectionClassifier_6.N2ebcbdee461(i);
	    } 
	    return p;
	  }
	  static double N61090a2e454(Object []i) {
	    double p = Double.NaN;
	    if (i[163] == null) {
	      p = 2;
	    } else if (((Double) i[163]).doubleValue() <= 0.0) {
	    p = BumpSenseDirectionClassifier_6.N187b83c7455(i);
	    } else if (((Double) i[163]).doubleValue() > 0.0) {
	    p = BumpSenseDirectionClassifier_6.N22fd2c2a458(i);
	    } 
	    return p;
	  }
	  static double N187b83c7455(Object []i) {
	    double p = Double.NaN;
	    if (i[30] == null) {
	      p = 2;
	    } else if (((Double) i[30]).doubleValue() <= 1.84) {
	    p = BumpSenseDirectionClassifier_6.N55088a5f456(i);
	    } else if (((Double) i[30]).doubleValue() > 1.84) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N55088a5f456(Object []i) {
	    double p = Double.NaN;
	    if (i[120] == null) {
	      p = 3;
	    } else if (((Double) i[120]).doubleValue() <= -0.6) {
	    p = BumpSenseDirectionClassifier_6.N23b48e96457(i);
	    } else if (((Double) i[120]).doubleValue() > -0.6) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N23b48e96457(Object []i) {
	    double p = Double.NaN;
	    if (i[163] == null) {
	      p = 2;
	    } else if (((Double) i[163]).doubleValue() <= -0.92) {
	      p = 2;
	    } else if (((Double) i[163]).doubleValue() > -0.92) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N22fd2c2a458(Object []i) {
	    double p = Double.NaN;
	    if (i[144] == null) {
	      p = 2;
	    } else if (((Double) i[144]).doubleValue() <= 0.3) {
	      p = 2;
	    } else if (((Double) i[144]).doubleValue() > 0.3) {
	    p = BumpSenseDirectionClassifier_6.N1b5e8b58459(i);
	    } 
	    return p;
	  }
	  static double N1b5e8b58459(Object []i) {
	    double p = Double.NaN;
	    if (i[13] == null) {
	      p = 2;
	    } else if (((Double) i[13]).doubleValue() <= 0.45) {
	      p = 2;
	    } else if (((Double) i[13]).doubleValue() > 0.45) {
	    p = BumpSenseDirectionClassifier_6.N5c0e4c71460(i);
	    } 
	    return p;
	  }
	  static double N5c0e4c71460(Object []i) {
	    double p = Double.NaN;
	    if (i[154] == null) {
	      p = 0;
	    } else if (((Double) i[154]).doubleValue() <= 0.46) {
	      p = 0;
	    } else if (((Double) i[154]).doubleValue() > 0.46) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N2ebcbdee461(Object []i) {
	    double p = Double.NaN;
	    if (i[52] == null) {
	      p = 3;
	    } else if (((Double) i[52]).doubleValue() <= 1.82) {
	      p = 3;
	    } else if (((Double) i[52]).doubleValue() > 1.82) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N69596c3a462(Object []i) {
	    double p = Double.NaN;
	    if (i[96] == null) {
	      p = 3;
	    } else if (((Double) i[96]).doubleValue() <= 3.32) {
	      p = 3;
	    } else if (((Double) i[96]).doubleValue() > 3.32) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6dd089de463(Object []i) {
	    double p = Double.NaN;
	    if (i[130] == null) {
	      p = 0;
	    } else if (((Double) i[130]).doubleValue() <= 1.76) {
	    p = BumpSenseDirectionClassifier_6.N160b8625464(i);
	    } else if (((Double) i[130]).doubleValue() > 1.76) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N160b8625464(Object []i) {
	    double p = Double.NaN;
	    if (i[28] == null) {
	      p = 3;
	    } else if (((Double) i[28]).doubleValue() <= 2.78) {
	      p = 3;
	    } else if (((Double) i[28]).doubleValue() > 2.78) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4e93f271465(Object []i) {
	    double p = Double.NaN;
	    if (i[95] == null) {
	      p = 1;
	    } else if (((Double) i[95]).doubleValue() <= 8.27) {
	      p = 1;
	    } else if (((Double) i[95]).doubleValue() > 8.27) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N53120104466(Object []i) {
	    double p = Double.NaN;
	    if (i[152] == null) {
	      p = 0;
	    } else if (((Double) i[152]).doubleValue() <= 10.73) {
	      p = 0;
	    } else if (((Double) i[152]).doubleValue() > 10.73) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N4300d837467(Object []i) {
	    double p = Double.NaN;
	    if (i[159] == null) {
	      p = 1;
	    } else if (((Double) i[159]).doubleValue() <= 1.99) {
	    p = BumpSenseDirectionClassifier_6.N6c73253e468(i);
	    } else if (((Double) i[159]).doubleValue() > 1.99) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6c73253e468(Object []i) {
	    double p = Double.NaN;
	    if (i[156] == null) {
	      p = 1;
	    } else if (((Double) i[156]).doubleValue() <= 2.91) {
	      p = 1;
	    } else if (((Double) i[156]).doubleValue() > 2.91) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class BumpSenseDirectionClassifier_7 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseDirectionClassifier_7.N7b924111469(i);
	    return p;
	  }
	  static double N7b924111469(Object []i) {
	    double p = Double.NaN;
	    if (i[85] == null) {
	      p = 2;
	    } else if (((Double) i[85]).doubleValue() <= 4.62) {
	    p = BumpSenseDirectionClassifier_7.N3eee0278470(i);
	    } else if (((Double) i[85]).doubleValue() > 4.62) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3eee0278470(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 2;
	    } else if (((Double) i[9]).doubleValue() <= 2.36) {
	    p = BumpSenseDirectionClassifier_7.N7be4348e471(i);
	    } else if (((Double) i[9]).doubleValue() > 2.36) {
	    p = BumpSenseDirectionClassifier_7.N683bb3af489(i);
	    } 
	    return p;
	  }
	  static double N7be4348e471(Object []i) {
	    double p = Double.NaN;
	    if (i[30] == null) {
	      p = 2;
	    } else if (((Double) i[30]).doubleValue() <= 4.23) {
	    p = BumpSenseDirectionClassifier_7.N4336962d472(i);
	    } else if (((Double) i[30]).doubleValue() > 4.23) {
	    p = BumpSenseDirectionClassifier_7.Nb0aa68a488(i);
	    } 
	    return p;
	  }
	  static double N4336962d472(Object []i) {
	    double p = Double.NaN;
	    if (i[54] == null) {
	      p = 2;
	    } else if (((Double) i[54]).doubleValue() <= 4.43) {
	    p = BumpSenseDirectionClassifier_7.N34bd86d4473(i);
	    } else if (((Double) i[54]).doubleValue() > 4.43) {
	    p = BumpSenseDirectionClassifier_7.N64eb29e1487(i);
	    } 
	    return p;
	  }
	  static double N34bd86d4473(Object []i) {
	    double p = Double.NaN;
	    if (i[161] == null) {
	      p = 1;
	    } else if (((Double) i[161]).doubleValue() <= 9.5) {
	    p = BumpSenseDirectionClassifier_7.N6dee359474(i);
	    } else if (((Double) i[161]).doubleValue() > 9.5) {
	    p = BumpSenseDirectionClassifier_7.N14a38d02476(i);
	    } 
	    return p;
	  }
	  static double N6dee359474(Object []i) {
	    double p = Double.NaN;
	    if (i[18] == null) {
	      p = 2;
	    } else if (((Double) i[18]).doubleValue() <= 0.47) {
	    p = BumpSenseDirectionClassifier_7.N131feb95475(i);
	    } else if (((Double) i[18]).doubleValue() > 0.47) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N131feb95475(Object []i) {
	    double p = Double.NaN;
	    if (i[15] == null) {
	      p = 3;
	    } else if (((Double) i[15]).doubleValue() <= -1.57) {
	      p = 3;
	    } else if (((Double) i[15]).doubleValue() > -1.57) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N14a38d02476(Object []i) {
	    double p = Double.NaN;
	    if (i[60] == null) {
	      p = 2;
	    } else if (((Double) i[60]).doubleValue() <= 2.67) {
	    p = BumpSenseDirectionClassifier_7.N7d7e88e3477(i);
	    } else if (((Double) i[60]).doubleValue() > 2.67) {
	    p = BumpSenseDirectionClassifier_7.N9c5e60485(i);
	    } 
	    return p;
	  }
	  static double N7d7e88e3477(Object []i) {
	    double p = Double.NaN;
	    if (i[138] == null) {
	      p = 3;
	    } else if (((Double) i[138]).doubleValue() <= -0.91) {
	    p = BumpSenseDirectionClassifier_7.N7e4d2f72478(i);
	    } else if (((Double) i[138]).doubleValue() > -0.91) {
	    p = BumpSenseDirectionClassifier_7.N7d662625479(i);
	    } 
	    return p;
	  }
	  static double N7e4d2f72478(Object []i) {
	    double p = Double.NaN;
	    if (i[160] == null) {
	      p = 3;
	    } else if (((Double) i[160]).doubleValue() <= 0.15) {
	      p = 3;
	    } else if (((Double) i[160]).doubleValue() > 0.15) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7d662625479(Object []i) {
	    double p = Double.NaN;
	    if (i[99] == null) {
	      p = 3;
	    } else if (((Double) i[99]).doubleValue() <= -1.44) {
	    p = BumpSenseDirectionClassifier_7.N3d528774480(i);
	    } else if (((Double) i[99]).doubleValue() > -1.44) {
	    p = BumpSenseDirectionClassifier_7.N753af01f481(i);
	    } 
	    return p;
	  }
	  static double N3d528774480(Object []i) {
	    double p = Double.NaN;
	    if (i[163] == null) {
	      p = 3;
	    } else if (((Double) i[163]).doubleValue() <= 0.77) {
	      p = 3;
	    } else if (((Double) i[163]).doubleValue() > 0.77) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N753af01f481(Object []i) {
	    double p = Double.NaN;
	    if (i[148] == null) {
	      p = 3;
	    } else if (((Double) i[148]).doubleValue() <= 0.31) {
	    p = BumpSenseDirectionClassifier_7.N706abf59482(i);
	    } else if (((Double) i[148]).doubleValue() > 0.31) {
	    p = BumpSenseDirectionClassifier_7.N7038a5b7483(i);
	    } 
	    return p;
	  }
	  static double N706abf59482(Object []i) {
	    double p = Double.NaN;
	    if (i[162] == null) {
	      p = 2;
	    } else if (((Double) i[162]).doubleValue() <= -0.31) {
	      p = 2;
	    } else if (((Double) i[162]).doubleValue() > -0.31) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N7038a5b7483(Object []i) {
	    double p = Double.NaN;
	    if (i[100] == null) {
	      p = 2;
	    } else if (((Double) i[100]).doubleValue() <= 2.34) {
	      p = 2;
	    } else if (((Double) i[100]).doubleValue() > 2.34) {
	    p = BumpSenseDirectionClassifier_7.N1707caf0484(i);
	    } 
	    return p;
	  }
	  static double N1707caf0484(Object []i) {
	    double p = Double.NaN;
	    if (i[57] == null) {
	      p = 3;
	    } else if (((Double) i[57]).doubleValue() <= -0.8) {
	      p = 3;
	    } else if (((Double) i[57]).doubleValue() > -0.8) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N9c5e60485(Object []i) {
	    double p = Double.NaN;
	    if (i[85] == null) {
	      p = 3;
	    } else if (((Double) i[85]).doubleValue() <= 0.19) {
	      p = 3;
	    } else if (((Double) i[85]).doubleValue() > 0.19) {
	    p = BumpSenseDirectionClassifier_7.N19f7f0f0486(i);
	    } 
	    return p;
	  }
	  static double N19f7f0f0486(Object []i) {
	    double p = Double.NaN;
	    if (i[148] == null) {
	      p = 0;
	    } else if (((Double) i[148]).doubleValue() <= 1.67) {
	      p = 0;
	    } else if (((Double) i[148]).doubleValue() > 1.67) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N64eb29e1487(Object []i) {
	    double p = Double.NaN;
	    if (i[70] == null) {
	      p = 0;
	    } else if (((Double) i[70]).doubleValue() <= 3.29) {
	      p = 0;
	    } else if (((Double) i[70]).doubleValue() > 3.29) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Nb0aa68a488(Object []i) {
	    double p = Double.NaN;
	    if (i[46] == null) {
	      p = 0;
	    } else if (((Double) i[46]).doubleValue() <= 2.49) {
	      p = 0;
	    } else if (((Double) i[46]).doubleValue() > 2.49) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N683bb3af489(Object []i) {
	    double p = Double.NaN;
	    if (i[160] == null) {
	      p = 1;
	    } else if (((Double) i[160]).doubleValue() <= -0.61) {
	      p = 1;
	    } else if (((Double) i[160]).doubleValue() > -0.61) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class BumpSenseDirectionClassifier_8 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseDirectionClassifier_8.N2791db9f490(i);
	    return p;
	  }
	  static double N2791db9f490(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 2;
	    } else if (((Double) i[3]).doubleValue() <= 2.43) {
	    p = BumpSenseDirectionClassifier_8.N58e9b804491(i);
	    } else if (((Double) i[3]).doubleValue() > 2.43) {
	    p = BumpSenseDirectionClassifier_8.N4cd83383512(i);
	    } 
	    return p;
	  }
	  static double N58e9b804491(Object []i) {
	    double p = Double.NaN;
	    if (i[39] == null) {
	      p = 2;
	    } else if (((Double) i[39]).doubleValue() <= 3.39) {
	    p = BumpSenseDirectionClassifier_8.N58303c36492(i);
	    } else if (((Double) i[39]).doubleValue() > 3.39) {
	    p = BumpSenseDirectionClassifier_8.N60538160510(i);
	    } 
	    return p;
	  }
	  static double N58303c36492(Object []i) {
	    double p = Double.NaN;
	    if (i[102] == null) {
	      p = 2;
	    } else if (((Double) i[102]).doubleValue() <= 4.48) {
	    p = BumpSenseDirectionClassifier_8.N46c12a75493(i);
	    } else if (((Double) i[102]).doubleValue() > 4.48) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N46c12a75493(Object []i) {
	    double p = Double.NaN;
	    if (i[123] == null) {
	      p = 3;
	    } else if (((Double) i[123]).doubleValue() <= -0.4) {
	    p = BumpSenseDirectionClassifier_8.N33ca8b9d494(i);
	    } else if (((Double) i[123]).doubleValue() > -0.4) {
	    p = BumpSenseDirectionClassifier_8.N50db0e4e497(i);
	    } 
	    return p;
	  }
	  static double N33ca8b9d494(Object []i) {
	    double p = Double.NaN;
	    if (i[49] == null) {
	      p = 2;
	    } else if (((Double) i[49]).doubleValue() <= -3.05) {
	      p = 2;
	    } else if (((Double) i[49]).doubleValue() > -3.05) {
	    p = BumpSenseDirectionClassifier_8.N36940afb495(i);
	    } 
	    return p;
	  }
	  static double N36940afb495(Object []i) {
	    double p = Double.NaN;
	    if (i[67] == null) {
	      p = 3;
	    } else if (((Double) i[67]).doubleValue() <= 3.65) {
	    p = BumpSenseDirectionClassifier_8.N315d00bb496(i);
	    } else if (((Double) i[67]).doubleValue() > 3.65) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N315d00bb496(Object []i) {
	    double p = Double.NaN;
	    if (i[85] == null) {
	      p = 3;
	    } else if (((Double) i[85]).doubleValue() <= 2.87) {
	      p = 3;
	    } else if (((Double) i[85]).doubleValue() > 2.87) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N50db0e4e497(Object []i) {
	    double p = Double.NaN;
	    if (i[69] == null) {
	      p = 3;
	    } else if (((Double) i[69]).doubleValue() <= -1.53) {
	    p = BumpSenseDirectionClassifier_8.N5d884c5a498(i);
	    } else if (((Double) i[69]).doubleValue() > -1.53) {
	    p = BumpSenseDirectionClassifier_8.N1f4cd8af499(i);
	    } 
	    return p;
	  }
	  static double N5d884c5a498(Object []i) {
	    double p = Double.NaN;
	    if (i[103] == null) {
	      p = 3;
	    } else if (((Double) i[103]).doubleValue() <= 1.59) {
	      p = 3;
	    } else if (((Double) i[103]).doubleValue() > 1.59) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N1f4cd8af499(Object []i) {
	    double p = Double.NaN;
	    if (i[146] == null) {
	      p = 2;
	    } else if (((Double) i[146]).doubleValue() <= 10.05) {
	    p = BumpSenseDirectionClassifier_8.N6e25d936500(i);
	    } else if (((Double) i[146]).doubleValue() > 10.05) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N6e25d936500(Object []i) {
	    double p = Double.NaN;
	    if (i[160] == null) {
	      p = 1;
	    } else if (((Double) i[160]).doubleValue() <= -2.6) {
	    p = BumpSenseDirectionClassifier_8.N76d7a0b8501(i);
	    } else if (((Double) i[160]).doubleValue() > -2.6) {
	    p = BumpSenseDirectionClassifier_8.N4678ccfc502(i);
	    } 
	    return p;
	  }
	  static double N76d7a0b8501(Object []i) {
	    double p = Double.NaN;
	    if (i[97] == null) {
	      p = 2;
	    } else if (((Double) i[97]).doubleValue() <= 0.57) {
	      p = 2;
	    } else if (((Double) i[97]).doubleValue() > 0.57) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N4678ccfc502(Object []i) {
	    double p = Double.NaN;
	    if (i[63] == null) {
	      p = 2;
	    } else if (((Double) i[63]).doubleValue() <= 2.3) {
	    p = BumpSenseDirectionClassifier_8.N24d9d889503(i);
	    } else if (((Double) i[63]).doubleValue() > 2.3) {
	    p = BumpSenseDirectionClassifier_8.N5a44efd4508(i);
	    } 
	    return p;
	  }
	  static double N24d9d889503(Object []i) {
	    double p = Double.NaN;
	    if (i[15] == null) {
	      p = 2;
	    } else if (((Double) i[15]).doubleValue() <= 1.79) {
	    p = BumpSenseDirectionClassifier_8.N5a171d45504(i);
	    } else if (((Double) i[15]).doubleValue() > 1.79) {
	    p = BumpSenseDirectionClassifier_8.N75a7c824507(i);
	    } 
	    return p;
	  }
	  static double N5a171d45504(Object []i) {
	    double p = Double.NaN;
	    if (i[150] == null) {
	      p = 0;
	    } else if (((Double) i[150]).doubleValue() <= -2.91) {
	      p = 0;
	    } else if (((Double) i[150]).doubleValue() > -2.91) {
	    p = BumpSenseDirectionClassifier_8.N2382cb38505(i);
	    } 
	    return p;
	  }
	  static double N2382cb38505(Object []i) {
	    double p = Double.NaN;
	    if (i[147] == null) {
	      p = 2;
	    } else if (((Double) i[147]).doubleValue() <= 0.63) {
	      p = 2;
	    } else if (((Double) i[147]).doubleValue() > 0.63) {
	    p = BumpSenseDirectionClassifier_8.N5febdbbe506(i);
	    } 
	    return p;
	  }
	  static double N5febdbbe506(Object []i) {
	    double p = Double.NaN;
	    if (i[137] == null) {
	      p = 2;
	    } else if (((Double) i[137]).doubleValue() <= 9.35) {
	      p = 2;
	    } else if (((Double) i[137]).doubleValue() > 9.35) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N75a7c824507(Object []i) {
	    double p = Double.NaN;
	    if (i[95] == null) {
	      p = 1;
	    } else if (((Double) i[95]).doubleValue() <= 9.22) {
	      p = 1;
	    } else if (((Double) i[95]).doubleValue() > 9.22) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5a44efd4508(Object []i) {
	    double p = Double.NaN;
	    if (i[85] == null) {
	      p = 3;
	    } else if (((Double) i[85]).doubleValue() <= 0.18) {
	      p = 3;
	    } else if (((Double) i[85]).doubleValue() > 0.18) {
	    p = BumpSenseDirectionClassifier_8.N63dd7598509(i);
	    } 
	    return p;
	  }
	  static double N63dd7598509(Object []i) {
	    double p = Double.NaN;
	    if (i[122] == null) {
	      p = 0;
	    } else if (((Double) i[122]).doubleValue() <= 9.3) {
	      p = 0;
	    } else if (((Double) i[122]).doubleValue() > 9.3) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N60538160510(Object []i) {
	    double p = Double.NaN;
	    if (i[139] == null) {
	      p = 0;
	    } else if (((Double) i[139]).doubleValue() <= 1.88) {
	    p = BumpSenseDirectionClassifier_8.Na52f708511(i);
	    } else if (((Double) i[139]).doubleValue() > 1.88) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Na52f708511(Object []i) {
	    double p = Double.NaN;
	    if (i[23] == null) {
	      p = 3;
	    } else if (((Double) i[23]).doubleValue() <= 9.49) {
	      p = 3;
	    } else if (((Double) i[23]).doubleValue() > 9.49) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4cd83383512(Object []i) {
	    double p = Double.NaN;
	    if (i[151] == null) {
	      p = 0;
	    } else if (((Double) i[151]).doubleValue() <= 0.92) {
	    p = BumpSenseDirectionClassifier_8.N61e04df513(i);
	    } else if (((Double) i[151]).doubleValue() > 0.92) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N61e04df513(Object []i) {
	    double p = Double.NaN;
	    if (i[22] == null) {
	      p = 0;
	    } else if (((Double) i[22]).doubleValue() <= 2.84) {
	    p = BumpSenseDirectionClassifier_8.N1cd1cf9c514(i);
	    } else if (((Double) i[22]).doubleValue() > 2.84) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N1cd1cf9c514(Object []i) {
	    double p = Double.NaN;
	    if (i[31] == null) {
	      p = 1;
	    } else if (((Double) i[31]).doubleValue() <= -0.2) {
	      p = 1;
	    } else if (((Double) i[31]).doubleValue() > -0.2) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class BumpSenseDirectionClassifier_9 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseDirectionClassifier_9.N1295198c515(i);
	    return p;
	  }
	  static double N1295198c515(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 2;
	    } else if (((Double) i[0]).doubleValue() <= 2.25) {
	    p = BumpSenseDirectionClassifier_9.N7ac03fdb516(i);
	    } else if (((Double) i[0]).doubleValue() > 2.25) {
	    p = BumpSenseDirectionClassifier_9.N14a2b5f9542(i);
	    } 
	    return p;
	  }
	  static double N7ac03fdb516(Object []i) {
	    double p = Double.NaN;
	    if (i[118] == null) {
	      p = 2;
	    } else if (((Double) i[118]).doubleValue() <= 2.04) {
	    p = BumpSenseDirectionClassifier_9.N63a081d2517(i);
	    } else if (((Double) i[118]).doubleValue() > 2.04) {
	    p = BumpSenseDirectionClassifier_9.Ned44228537(i);
	    } 
	    return p;
	  }
	  static double N63a081d2517(Object []i) {
	    double p = Double.NaN;
	    if (i[58] == null) {
	      p = 2;
	    } else if (((Double) i[58]).doubleValue() <= 4.08) {
	    p = BumpSenseDirectionClassifier_9.N3eab3517518(i);
	    } else if (((Double) i[58]).doubleValue() > 4.08) {
	    p = BumpSenseDirectionClassifier_9.N64f8de72536(i);
	    } 
	    return p;
	  }
	  static double N3eab3517518(Object []i) {
	    double p = Double.NaN;
	    if (i[81] == null) {
	      p = 2;
	    } else if (((Double) i[81]).doubleValue() <= 4.25) {
	    p = BumpSenseDirectionClassifier_9.N5a2a9925519(i);
	    } else if (((Double) i[81]).doubleValue() > 4.25) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5a2a9925519(Object []i) {
	    double p = Double.NaN;
	    if (i[18] == null) {
	      p = 0;
	    } else if (((Double) i[18]).doubleValue() <= -2.09) {
	    p = BumpSenseDirectionClassifier_9.N22ac7a62520(i);
	    } else if (((Double) i[18]).doubleValue() > -2.09) {
	    p = BumpSenseDirectionClassifier_9.N6996c9b6521(i);
	    } 
	    return p;
	  }
	  static double N22ac7a62520(Object []i) {
	    double p = Double.NaN;
	    if (i[141] == null) {
	      p = 3;
	    } else if (((Double) i[141]).doubleValue() <= -0.07) {
	      p = 3;
	    } else if (((Double) i[141]).doubleValue() > -0.07) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6996c9b6521(Object []i) {
	    double p = Double.NaN;
	    if (i[21] == null) {
	      p = 2;
	    } else if (((Double) i[21]).doubleValue() <= 2.08) {
	    p = BumpSenseDirectionClassifier_9.N2a9501e2522(i);
	    } else if (((Double) i[21]).doubleValue() > 2.08) {
	    p = BumpSenseDirectionClassifier_9.N2a1b4796535(i);
	    } 
	    return p;
	  }
	  static double N2a9501e2522(Object []i) {
	    double p = Double.NaN;
	    if (i[138] == null) {
	      p = 3;
	    } else if (((Double) i[138]).doubleValue() <= -0.91) {
	      p = 3;
	    } else if (((Double) i[138]).doubleValue() > -0.91) {
	    p = BumpSenseDirectionClassifier_9.N1caeb245523(i);
	    } 
	    return p;
	  }
	  static double N1caeb245523(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 2;
	    } else if (((Double) i[8]).doubleValue() <= 10.83) {
	    p = BumpSenseDirectionClassifier_9.N1139deb9524(i);
	    } else if (((Double) i[8]).doubleValue() > 10.83) {
	    p = BumpSenseDirectionClassifier_9.N5380c16e534(i);
	    } 
	    return p;
	  }
	  static double N1139deb9524(Object []i) {
	    double p = Double.NaN;
	    if (i[160] == null) {
	      p = 1;
	    } else if (((Double) i[160]).doubleValue() <= -2.76) {
	    p = BumpSenseDirectionClassifier_9.N6e4d4c84525(i);
	    } else if (((Double) i[160]).doubleValue() > -2.76) {
	    p = BumpSenseDirectionClassifier_9.N14daa6af526(i);
	    } 
	    return p;
	  }
	  static double N6e4d4c84525(Object []i) {
	    double p = Double.NaN;
	    if (i[103] == null) {
	      p = 2;
	    } else if (((Double) i[103]).doubleValue() <= 0.71) {
	      p = 2;
	    } else if (((Double) i[103]).doubleValue() > 0.71) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N14daa6af526(Object []i) {
	    double p = Double.NaN;
	    if (i[120] == null) {
	      p = 3;
	    } else if (((Double) i[120]).doubleValue() <= -0.59) {
	    p = BumpSenseDirectionClassifier_9.N1ef535db527(i);
	    } else if (((Double) i[120]).doubleValue() > -0.59) {
	    p = BumpSenseDirectionClassifier_9.N6c2fc81d529(i);
	    } 
	    return p;
	  }
	  static double N1ef535db527(Object []i) {
	    double p = Double.NaN;
	    if (i[151] == null) {
	      p = 3;
	    } else if (((Double) i[151]).doubleValue() <= -0.31) {
	      p = 3;
	    } else if (((Double) i[151]).doubleValue() > -0.31) {
	    p = BumpSenseDirectionClassifier_9.N74a2ccbd528(i);
	    } 
	    return p;
	  }
	  static double N74a2ccbd528(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= 1.37) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() > 1.37) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N6c2fc81d529(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 2;
	    } else if (((Double) i[0]).doubleValue() <= 0.93) {
	    p = BumpSenseDirectionClassifier_9.N34fb1f68530(i);
	    } else if (((Double) i[0]).doubleValue() > 0.93) {
	    p = BumpSenseDirectionClassifier_9.Nd6e3113532(i);
	    } 
	    return p;
	  }
	  static double N34fb1f68530(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 2;
	    } else if (((Double) i[3]).doubleValue() <= -1.98) {
	    p = BumpSenseDirectionClassifier_9.N52cb0004531(i);
	    } else if (((Double) i[3]).doubleValue() > -1.98) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N52cb0004531(Object []i) {
	    double p = Double.NaN;
	    if (i[155] == null) {
	      p = 2;
	    } else if (((Double) i[155]).doubleValue() <= 9.96) {
	      p = 2;
	    } else if (((Double) i[155]).doubleValue() > 9.96) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double Nd6e3113532(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 2;
	    } else if (((Double) i[5]).doubleValue() <= 8.86) {
	      p = 2;
	    } else if (((Double) i[5]).doubleValue() > 8.86) {
	    p = BumpSenseDirectionClassifier_9.N3d57dd48533(i);
	    } 
	    return p;
	  }
	  static double N3d57dd48533(Object []i) {
	    double p = Double.NaN;
	    if (i[154] == null) {
	      p = 2;
	    } else if (((Double) i[154]).doubleValue() <= -0.77) {
	      p = 2;
	    } else if (((Double) i[154]).doubleValue() > -0.77) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5380c16e534(Object []i) {
	    double p = Double.NaN;
	    if (i[151] == null) {
	      p = 3;
	    } else if (((Double) i[151]).doubleValue() <= -0.46) {
	      p = 3;
	    } else if (((Double) i[151]).doubleValue() > -0.46) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N2a1b4796535(Object []i) {
	    double p = Double.NaN;
	    if (i[49] == null) {
	      p = 3;
	    } else if (((Double) i[49]).doubleValue() <= 0.08) {
	      p = 3;
	    } else if (((Double) i[49]).doubleValue() > 0.08) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N64f8de72536(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() <= 2.11) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() > 2.11) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double Ned44228537(Object []i) {
	    double p = Double.NaN;
	    if (i[86] == null) {
	      p = 1;
	    } else if (((Double) i[86]).doubleValue() <= 11.74) {
	    p = BumpSenseDirectionClassifier_9.N114357b3538(i);
	    } else if (((Double) i[86]).doubleValue() > 11.74) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N114357b3538(Object []i) {
	    double p = Double.NaN;
	    if (i[71] == null) {
	      p = 1;
	    } else if (((Double) i[71]).doubleValue() <= 11.02) {
	    p = BumpSenseDirectionClassifier_9.N5c32b19f539(i);
	    } else if (((Double) i[71]).doubleValue() > 11.02) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N5c32b19f539(Object []i) {
	    double p = Double.NaN;
	    if (i[56] == null) {
	      p = 1;
	    } else if (((Double) i[56]).doubleValue() <= 12.03) {
	    p = BumpSenseDirectionClassifier_9.N42b6d03540(i);
	    } else if (((Double) i[56]).doubleValue() > 12.03) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N42b6d03540(Object []i) {
	    double p = Double.NaN;
	    if (i[106] == null) {
	      p = 0;
	    } else if (((Double) i[106]).doubleValue() <= 2.04) {
	    p = BumpSenseDirectionClassifier_9.N3f01e218541(i);
	    } else if (((Double) i[106]).doubleValue() > 2.04) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3f01e218541(Object []i) {
	    double p = Double.NaN;
	    if (i[122] == null) {
	      p = 0;
	    } else if (((Double) i[122]).doubleValue() <= 8.85) {
	      p = 0;
	    } else if (((Double) i[122]).doubleValue() > 8.85) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N14a2b5f9542(Object []i) {
	    double p = Double.NaN;
	    if (i[104] == null) {
	      p = 1;
	    } else if (((Double) i[104]).doubleValue() <= 8.33) {
	      p = 1;
	    } else if (((Double) i[104]).doubleValue() > 8.33) {
	    p = BumpSenseDirectionClassifier_9.N4658f904543(i);
	    } 
	    return p;
	  }
	  static double N4658f904543(Object []i) {
	    double p = Double.NaN;
	    if (i[148] == null) {
	      p = 0;
	    } else if (((Double) i[148]).doubleValue() <= 1.8) {
	    p = BumpSenseDirectionClassifier_9.N7b4499b0544(i);
	    } else if (((Double) i[148]).doubleValue() > 1.8) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N7b4499b0544(Object []i) {
	    double p = Double.NaN;
	    if (i[151] == null) {
	      p = 0;
	    } else if (((Double) i[151]).doubleValue() <= 3.06) {
	      p = 0;
	    } else if (((Double) i[151]).doubleValue() > 3.06) {
	      p = 1;
	    } 
	    return p;
	  }
	}