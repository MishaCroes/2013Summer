package me.xiangchen.technique.handsense;

public class HandSenseClassifier {

	  public static double classify(Object[] i) throws Exception {
	    double [] sums = new double [2];
	    sums[(int) HandSenseClassifier_0.classify(i)] += 3.1998728777425853;
	    sums[(int) HandSenseClassifier_1.classify(i)] += 3.656208671824394;
	    sums[(int) HandSenseClassifier_2.classify(i)] += 3.0787815904480507;
	    sums[(int) HandSenseClassifier_3.classify(i)] += 3.0606155950439864;
	    sums[(int) HandSenseClassifier_4.classify(i)] += 3.684636301308435;
	    sums[(int) HandSenseClassifier_5.classify(i)] += 3.394480700240862;
	    sums[(int) HandSenseClassifier_6.classify(i)] += 3.077935445833219;
	    sums[(int) HandSenseClassifier_7.classify(i)] += 3.7456355725636743;
	    sums[(int) HandSenseClassifier_8.classify(i)] += 2.893166799434683;
	    sums[(int) HandSenseClassifier_9.classify(i)] += 3.7713706424550733;
	    double maxV = sums[0];
	    int maxI = 0;
	    for (int j = 1; j < 2; j++) {
	      if (sums[j] > maxV) { maxV = sums[j]; maxI = j; }
	    }
	    return (double) maxI;
	  }
	}
	class HandSenseClassifier_0 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_0.N2edf362d147(i);
	    return p;
	  }
	  static double N2edf362d147(Object []i) {
	    double p = Double.NaN;
	    if (i[108] == null) {
	      p = 1;
	    } else if (((Double) i[108]).doubleValue() <= -1.07) {
	    p = HandSenseClassifier_0.N405ddc65148(i);
	    } else if (((Double) i[108]).doubleValue() > -1.07) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N405ddc65148(Object []i) {
	    double p = Double.NaN;
	    if (i[122] == null) {
	      p = 0;
	    } else if (((Double) i[122]).doubleValue() <= 7.51) {
	      p = 0;
	    } else if (((Double) i[122]).doubleValue() > 7.51) {
	    p = HandSenseClassifier_0.N52308be6149(i);
	    } 
	    return p;
	  }
	  static double N52308be6149(Object []i) {
	    double p = Double.NaN;
	    if (i[62] == null) {
	      p = 1;
	    } else if (((Double) i[62]).doubleValue() <= 7.98) {
	    p = HandSenseClassifier_0.N7130d331150(i);
	    } else if (((Double) i[62]).doubleValue() > 7.98) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N7130d331150(Object []i) {
	    double p = Double.NaN;
	    if (i[108] == null) {
	      p = 1;
	    } else if (((Double) i[108]).doubleValue() <= -1.99) {
	      p = 1;
	    } else if (((Double) i[108]).doubleValue() > -1.99) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_1 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_1.N3c797005151(i);
	    return p;
	  }
	  static double N3c797005151(Object []i) {
	    double p = Double.NaN;
	    if (i[112] == null) {
	      p = 0;
	    } else if (((Double) i[112]).doubleValue() <= -4.75) {
	      p = 0;
	    } else if (((Double) i[112]).doubleValue() > -4.75) {
	    p = HandSenseClassifier_1.N48a97747152(i);
	    } 
	    return p;
	  }
	  static double N48a97747152(Object []i) {
	    double p = Double.NaN;
	    if (i[111] == null) {
	      p = 1;
	    } else if (((Double) i[111]).doubleValue() <= 0.31) {
	    p = HandSenseClassifier_1.N6dd5fb95153(i);
	    } else if (((Double) i[111]).doubleValue() > 0.31) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6dd5fb95153(Object []i) {
	    double p = Double.NaN;
	    if (i[63] == null) {
	      p = 0;
	    } else if (((Double) i[63]).doubleValue() <= -1.17) {
	      p = 0;
	    } else if (((Double) i[63]).doubleValue() > -1.17) {
	    p = HandSenseClassifier_1.N7b782b88154(i);
	    } 
	    return p;
	  }
	  static double N7b782b88154(Object []i) {
	    double p = Double.NaN;
	    if (i[65] == null) {
	      p = 1;
	    } else if (((Double) i[65]).doubleValue() <= 7.54) {
	    p = HandSenseClassifier_1.Ne722d0c155(i);
	    } else if (((Double) i[65]).doubleValue() > 7.54) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Ne722d0c155(Object []i) {
	    double p = Double.NaN;
	    if (i[109] == null) {
	      p = 0;
	    } else if (((Double) i[109]).doubleValue() <= -0.92) {
	      p = 0;
	    } else if (((Double) i[109]).doubleValue() > -0.92) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_2 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_2.N69eb763c156(i);
	    return p;
	  }
	  static double N69eb763c156(Object []i) {
	    double p = Double.NaN;
	    if (i[51] == null) {
	      p = 1;
	    } else if (((Double) i[51]).doubleValue() <= -0.71) {
	      p = 1;
	    } else if (((Double) i[51]).doubleValue() > -0.71) {
	    p = HandSenseClassifier_2.N619f9377157(i);
	    } 
	    return p;
	  }
	  static double N619f9377157(Object []i) {
	    double p = Double.NaN;
	    if (i[48] == null) {
	      p = 1;
	    } else if (((Double) i[48]).doubleValue() <= -0.99) {
	      p = 1;
	    } else if (((Double) i[48]).doubleValue() > -0.99) {
	    p = HandSenseClassifier_2.N338a9bb3158(i);
	    } 
	    return p;
	  }
	  static double N338a9bb3158(Object []i) {
	    double p = Double.NaN;
	    if (i[121] == null) {
	      p = 0;
	    } else if (((Double) i[121]).doubleValue() <= -1.23) {
	    p = HandSenseClassifier_2.N50f41f34159(i);
	    } else if (((Double) i[121]).doubleValue() > -1.23) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N50f41f34159(Object []i) {
	    double p = Double.NaN;
	    if (i[47] == null) {
	      p = 0;
	    } else if (((Double) i[47]).doubleValue() <= 9.41) {
	      p = 0;
	    } else if (((Double) i[47]).doubleValue() > 9.41) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_3 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_3.N4b2cb871160(i);
	    return p;
	  }
	  static double N4b2cb871160(Object []i) {
	    double p = Double.NaN;
	    if (i[112] == null) {
	      p = 0;
	    } else if (((Double) i[112]).doubleValue() <= -4.75) {
	      p = 0;
	    } else if (((Double) i[112]).doubleValue() > -4.75) {
	    p = HandSenseClassifier_3.N65012945161(i);
	    } 
	    return p;
	  }
	  static double N65012945161(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= -0.88) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() > -0.88) {
	    p = HandSenseClassifier_3.N2f3ca4d1162(i);
	    } 
	    return p;
	  }
	  static double N2f3ca4d1162(Object []i) {
	    double p = Double.NaN;
	    if (i[68] == null) {
	      p = 1;
	    } else if (((Double) i[68]).doubleValue() <= 8.0) {
	    p = HandSenseClassifier_3.N3668ad91163(i);
	    } else if (((Double) i[68]).doubleValue() > 8.0) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3668ad91163(Object []i) {
	    double p = Double.NaN;
	    if (i[111] == null) {
	      p = 1;
	    } else if (((Double) i[111]).doubleValue() <= -1.69) {
	      p = 1;
	    } else if (((Double) i[111]).doubleValue() > -1.69) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_4 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_4.N125b267f164(i);
	    return p;
	  }
	  static double N125b267f164(Object []i) {
	    double p = Double.NaN;
	    if (i[48] == null) {
	      p = 1;
	    } else if (((Double) i[48]).doubleValue() <= -0.99) {
	      p = 1;
	    } else if (((Double) i[48]).doubleValue() > -0.99) {
	    p = HandSenseClassifier_4.N1e3c6543165(i);
	    } 
	    return p;
	  }
	  static double N1e3c6543165(Object []i) {
	    double p = Double.NaN;
	    if (i[63] == null) {
	      p = 0;
	    } else if (((Double) i[63]).doubleValue() <= -0.93) {
	      p = 0;
	    } else if (((Double) i[63]).doubleValue() > -0.93) {
	    p = HandSenseClassifier_4.Nf1c2137166(i);
	    } 
	    return p;
	  }
	  static double Nf1c2137166(Object []i) {
	    double p = Double.NaN;
	    if (i[105] == null) {
	      p = 1;
	    } else if (((Double) i[105]).doubleValue() <= 0.31) {
	    p = HandSenseClassifier_4.N7fc8a9a0167(i);
	    } else if (((Double) i[105]).doubleValue() > 0.31) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7fc8a9a0167(Object []i) {
	    double p = Double.NaN;
	    if (i[112] == null) {
	      p = 0;
	    } else if (((Double) i[112]).doubleValue() <= -4.75) {
	      p = 0;
	    } else if (((Double) i[112]).doubleValue() > -4.75) {
	    p = HandSenseClassifier_4.N4ef888ea168(i);
	    } 
	    return p;
	  }
	  static double N4ef888ea168(Object []i) {
	    double p = Double.NaN;
	    if (i[71] == null) {
	      p = 0;
	    } else if (((Double) i[71]).doubleValue() <= 7.63) {
	    p = HandSenseClassifier_4.N1ee4e327169(i);
	    } else if (((Double) i[71]).doubleValue() > 7.63) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N1ee4e327169(Object []i) {
	    double p = Double.NaN;
	    if (i[51] == null) {
	      p = 1;
	    } else if (((Double) i[51]).doubleValue() <= 0.18) {
	      p = 1;
	    } else if (((Double) i[51]).doubleValue() > 0.18) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_5 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_5.N44fd2549170(i);
	    return p;
	  }
	  static double N44fd2549170(Object []i) {
	    double p = Double.NaN;
	    if (i[23] == null) {
	      p = 0;
	    } else if (((Double) i[23]).doubleValue() <= 7.57) {
	    p = HandSenseClassifier_5.N479aff01171(i);
	    } else if (((Double) i[23]).doubleValue() > 7.57) {
	    p = HandSenseClassifier_5.N10dbbf61172(i);
	    } 
	    return p;
	  }
	  static double N479aff01171(Object []i) {
	    double p = Double.NaN;
	    if (i[84] == null) {
	      p = 0;
	    } else if (((Double) i[84]).doubleValue() <= -0.13) {
	      p = 0;
	    } else if (((Double) i[84]).doubleValue() > -0.13) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N10dbbf61172(Object []i) {
	    double p = Double.NaN;
	    if (i[112] == null) {
	      p = 0;
	    } else if (((Double) i[112]).doubleValue() <= -4.75) {
	      p = 0;
	    } else if (((Double) i[112]).doubleValue() > -4.75) {
	    p = HandSenseClassifier_5.N4af181ec173(i);
	    } 
	    return p;
	  }
	  static double N4af181ec173(Object []i) {
	    double p = Double.NaN;
	    if (i[120] == null) {
	      p = 1;
	    } else if (((Double) i[120]).doubleValue() <= -0.31) {
	      p = 1;
	    } else if (((Double) i[120]).doubleValue() > -0.31) {
	    p = HandSenseClassifier_5.N3588d364174(i);
	    } 
	    return p;
	  }
	  static double N3588d364174(Object []i) {
	    double p = Double.NaN;
	    if (i[36] == null) {
	      p = 0;
	    } else if (((Double) i[36]).doubleValue() <= 0.33) {
	      p = 0;
	    } else if (((Double) i[36]).doubleValue() > 0.33) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_6 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_6.N29ee65b1175(i);
	    return p;
	  }
	  static double N29ee65b1175(Object []i) {
	    double p = Double.NaN;
	    if (i[39] == null) {
	      p = 1;
	    } else if (((Double) i[39]).doubleValue() <= -0.67) {
	      p = 1;
	    } else if (((Double) i[39]).doubleValue() > -0.67) {
	    p = HandSenseClassifier_6.N62565cf8176(i);
	    } 
	    return p;
	  }
	  static double N62565cf8176(Object []i) {
	    double p = Double.NaN;
	    if (i[51] == null) {
	      p = 1;
	    } else if (((Double) i[51]).doubleValue() <= -0.84) {
	      p = 1;
	    } else if (((Double) i[51]).doubleValue() > -0.84) {
	    p = HandSenseClassifier_6.N13f1d038177(i);
	    } 
	    return p;
	  }
	  static double N13f1d038177(Object []i) {
	    double p = Double.NaN;
	    if (i[119] == null) {
	      p = 0;
	    } else if (((Double) i[119]).doubleValue() <= 9.65) {
	    p = HandSenseClassifier_6.N689d16c2178(i);
	    } else if (((Double) i[119]).doubleValue() > 9.65) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N689d16c2178(Object []i) {
	    double p = Double.NaN;
	    if (i[23] == null) {
	      p = 0;
	    } else if (((Double) i[23]).doubleValue() <= 7.75) {
	      p = 0;
	    } else if (((Double) i[23]).doubleValue() > 7.75) {
	    p = HandSenseClassifier_6.N21415036179(i);
	    } 
	    return p;
	  }
	  static double N21415036179(Object []i) {
	    double p = Double.NaN;
	    if (i[64] == null) {
	      p = 0;
	    } else if (((Double) i[64]).doubleValue() <= 3.95) {
	      p = 0;
	    } else if (((Double) i[64]).doubleValue() > 3.95) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_7 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_7.N46f91a48180(i);
	    return p;
	  }
	  static double N46f91a48180(Object []i) {
	    double p = Double.NaN;
	    if (i[122] == null) {
	      p = 0;
	    } else if (((Double) i[122]).doubleValue() <= 6.74) {
	      p = 0;
	    } else if (((Double) i[122]).doubleValue() > 6.74) {
	    p = HandSenseClassifier_7.Nc2c915f181(i);
	    } 
	    return p;
	  }
	  static double Nc2c915f181(Object []i) {
	    double p = Double.NaN;
	    if (i[108] == null) {
	      p = 1;
	    } else if (((Double) i[108]).doubleValue() <= -1.99) {
	      p = 1;
	    } else if (((Double) i[108]).doubleValue() > -1.99) {
	    p = HandSenseClassifier_7.N41fbfa37182(i);
	    } 
	    return p;
	  }
	  static double N41fbfa37182(Object []i) {
	    double p = Double.NaN;
	    if (i[124] == null) {
	      p = 0;
	    } else if (((Double) i[124]).doubleValue() <= -1.53) {
	    p = HandSenseClassifier_7.N5e852b9183(i);
	    } else if (((Double) i[124]).doubleValue() > -1.53) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5e852b9183(Object []i) {
	    double p = Double.NaN;
	    if (i[58] == null) {
	      p = 1;
	    } else if (((Double) i[58]).doubleValue() <= 2.63) {
	      p = 1;
	    } else if (((Double) i[58]).doubleValue() > 2.63) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_8 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_8.N578ef2b6184(i);
	    return p;
	  }
	  static double N578ef2b6184(Object []i) {
	    double p = Double.NaN;
	    if (i[112] == null) {
	      p = 0;
	    } else if (((Double) i[112]).doubleValue() <= -4.75) {
	      p = 0;
	    } else if (((Double) i[112]).doubleValue() > -4.75) {
	    p = HandSenseClassifier_8.N69e0b7a2185(i);
	    } 
	    return p;
	  }
	  static double N69e0b7a2185(Object []i) {
	    double p = Double.NaN;
	    if (i[68] == null) {
	      p = 0;
	    } else if (((Double) i[68]).doubleValue() <= 8.11) {
	    p = HandSenseClassifier_8.N203822fc186(i);
	    } else if (((Double) i[68]).doubleValue() > 8.11) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N203822fc186(Object []i) {
	    double p = Double.NaN;
	    if (i[41] == null) {
	      p = 1;
	    } else if (((Double) i[41]).doubleValue() <= 6.36) {
	      p = 1;
	    } else if (((Double) i[41]).doubleValue() > 6.36) {
	    p = HandSenseClassifier_8.N4580deea187(i);
	    } 
	    return p;
	  }
	  static double N4580deea187(Object []i) {
	    double p = Double.NaN;
	    if (i[50] == null) {
	      p = 1;
	    } else if (((Double) i[50]).doubleValue() <= 6.09) {
	      p = 1;
	    } else if (((Double) i[50]).doubleValue() > 6.09) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_9 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_9.Nfaaf84c188(i);
	    return p;
	  }
	  static double Nfaaf84c188(Object []i) {
	    double p = Double.NaN;
	    if (i[45] == null) {
	      p = 1;
	    } else if (((Double) i[45]).doubleValue() <= -1.75) {
	      p = 1;
	    } else if (((Double) i[45]).doubleValue() > -1.75) {
	    p = HandSenseClassifier_9.N21934d9d189(i);
	    } 
	    return p;
	  }
	  static double N21934d9d189(Object []i) {
	    double p = Double.NaN;
	    if (i[45] == null) {
	      p = 0;
	    } else if (((Double) i[45]).doubleValue() <= 0.52) {
	    p = HandSenseClassifier_9.N4dcc8fa3190(i);
	    } else if (((Double) i[45]).doubleValue() > 0.52) {
	    p = HandSenseClassifier_9.N7a38f07b194(i);
	    } 
	    return p;
	  }
	  static double N4dcc8fa3190(Object []i) {
	    double p = Double.NaN;
	    if (i[51] == null) {
	      p = 1;
	    } else if (((Double) i[51]).doubleValue() <= -0.92) {
	      p = 1;
	    } else if (((Double) i[51]).doubleValue() > -0.92) {
	    p = HandSenseClassifier_9.N30ea3e3c191(i);
	    } 
	    return p;
	  }
	  static double N30ea3e3c191(Object []i) {
	    double p = Double.NaN;
	    if (i[48] == null) {
	      p = 1;
	    } else if (((Double) i[48]).doubleValue() <= -0.99) {
	      p = 1;
	    } else if (((Double) i[48]).doubleValue() > -0.99) {
	    p = HandSenseClassifier_9.N629bee3a192(i);
	    } 
	    return p;
	  }
	  static double N629bee3a192(Object []i) {
	    double p = Double.NaN;
	    if (i[65] == null) {
	      p = 0;
	    } else if (((Double) i[65]).doubleValue() <= 9.06) {
	      p = 0;
	    } else if (((Double) i[65]).doubleValue() > 9.06) {
	    p = HandSenseClassifier_9.N6b355469193(i);
	    } 
	    return p;
	  }
	  static double N6b355469193(Object []i) {
	    double p = Double.NaN;
	    if (i[118] == null) {
	      p = 0;
	    } else if (((Double) i[118]).doubleValue() <= -4.6) {
	      p = 0;
	    } else if (((Double) i[118]).doubleValue() > -4.6) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N7a38f07b194(Object []i) {
	    double p = Double.NaN;
	    if (i[54] == null) {
	      p = 1;
	    } else if (((Double) i[54]).doubleValue() <= 0.6) {
	      p = 1;
	    } else if (((Double) i[54]).doubleValue() > 0.6) {
	      p = 0;
	    } 
	    return p;
	  }
	}