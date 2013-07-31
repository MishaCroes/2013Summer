package me.xiangchen.technique.flipsense;

public class FlipSenseClassifier {

	  public static double classify(Object[] i) throws Exception {
	    double [] sums = new double [2];
	    sums[(int) FlipSenseClassifier_0.classify(i)] += 3.7376696182833697;
	    sums[(int) FlipSenseClassifier_1.classify(i)] += 2.167810692129927;
	    sums[(int) FlipSenseClassifier_2.classify(i)] += 2.735842741920947;
	    sums[(int) FlipSenseClassifier_3.classify(i)] += 2.5939101930088477;
	    sums[(int) FlipSenseClassifier_4.classify(i)] += 1.8542845228875688;
	    sums[(int) FlipSenseClassifier_5.classify(i)] += 3.510279086401038;
	    sums[(int) FlipSenseClassifier_6.classify(i)] += 2.385240352449533;
	    sums[(int) FlipSenseClassifier_7.classify(i)] += 2.8749013201958005;
	    sums[(int) FlipSenseClassifier_8.classify(i)] += 2.5839435348866253;
	    sums[(int) FlipSenseClassifier_9.classify(i)] += 3.309849965586166;
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
	    p = FlipSenseClassifier_0.N52b84ffc860(i);
	    return p;
	  }
	  static double N52b84ffc860(Object []i) {
	    double p = Double.NaN;
	    if (i[128] == null) {
	      p = 1;
	    } else if (((Double) i[128]).doubleValue() <= 6.44) {
	      p = 1;
	    } else if (((Double) i[128]).doubleValue() > 6.44) {
	    p = FlipSenseClassifier_0.N428b53d1861(i);
	    } 
	    return p;
	  }
	  static double N428b53d1861(Object []i) {
	    double p = Double.NaN;
	    if (i[116] == null) {
	      p = 0;
	    } else if (((Double) i[116]).doubleValue() <= -0.92) {
	      p = 0;
	    } else if (((Double) i[116]).doubleValue() > -0.92) {
	    p = FlipSenseClassifier_0.N492be078862(i);
	    } 
	    return p;
	  }
	  static double N492be078862(Object []i) {
	    double p = Double.NaN;
	    if (i[113] == null) {
	      p = 0;
	    } else if (((Double) i[113]).doubleValue() <= -0.31) {
	      p = 0;
	    } else if (((Double) i[113]).doubleValue() > -0.31) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_1 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_1.N5f9e0bcf863(i);
	    return p;
	  }
	  static double N5f9e0bcf863(Object []i) {
	    double p = Double.NaN;
	    if (i[121] == null) {
	      p = 1;
	    } else if (((Double) i[121]).doubleValue() <= -5.82) {
	    p = FlipSenseClassifier_1.N1197414864(i);
	    } else if (((Double) i[121]).doubleValue() > -5.82) {
	    p = FlipSenseClassifier_1.N161fd466866(i);
	    } 
	    return p;
	  }
	  static double N1197414864(Object []i) {
	    double p = Double.NaN;
	    if (i[116] == null) {
	      p = 0;
	    } else if (((Double) i[116]).doubleValue() <= -5.52) {
	    p = FlipSenseClassifier_1.N2e13cd9c865(i);
	    } else if (((Double) i[116]).doubleValue() > -5.52) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2e13cd9c865(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= -0.09) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() > -0.09) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N161fd466866(Object []i) {
	    double p = Double.NaN;
	    if (i[48] == null) {
	      p = 0;
	    } else if (((Double) i[48]).doubleValue() <= 0.6) {
	    p = FlipSenseClassifier_1.N3b17fe3867(i);
	    } else if (((Double) i[48]).doubleValue() > 0.6) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3b17fe3867(Object []i) {
	    double p = Double.NaN;
	    if (i[104] == null) {
	      p = 1;
	    } else if (((Double) i[104]).doubleValue() <= 8.64) {
	      p = 1;
	    } else if (((Double) i[104]).doubleValue() > 8.64) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_2 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_2.N7a4311f9868(i);
	    return p;
	  }
	  static double N7a4311f9868(Object []i) {
	    double p = Double.NaN;
	    if (i[131] == null) {
	      p = 1;
	    } else if (((Double) i[131]).doubleValue() <= 7.05) {
	      p = 1;
	    } else if (((Double) i[131]).doubleValue() > 7.05) {
	    p = FlipSenseClassifier_2.N49513124869(i);
	    } 
	    return p;
	  }
	  static double N49513124869(Object []i) {
	    double p = Double.NaN;
	    if (i[116] == null) {
	      p = 0;
	    } else if (((Double) i[116]).doubleValue() <= -1.07) {
	      p = 0;
	    } else if (((Double) i[116]).doubleValue() > -1.07) {
	    p = FlipSenseClassifier_2.N71715816870(i);
	    } 
	    return p;
	  }
	  static double N71715816870(Object []i) {
	    double p = Double.NaN;
	    if (i[115] == null) {
	      p = 1;
	    } else if (((Double) i[115]).doubleValue() <= -4.9) {
	      p = 1;
	    } else if (((Double) i[115]).doubleValue() > -4.9) {
	    p = FlipSenseClassifier_2.N484e4689871(i);
	    } 
	    return p;
	  }
	  static double N484e4689871(Object []i) {
	    double p = Double.NaN;
	    if (i[42] == null) {
	      p = 0;
	    } else if (((Double) i[42]).doubleValue() <= 0.43) {
	    p = FlipSenseClassifier_2.Naf8f175872(i);
	    } else if (((Double) i[42]).doubleValue() > 0.43) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Naf8f175872(Object []i) {
	    double p = Double.NaN;
	    if (i[114] == null) {
	      p = 0;
	    } else if (((Double) i[114]).doubleValue() <= 3.98) {
	    p = FlipSenseClassifier_2.N5db43df3873(i);
	    } else if (((Double) i[114]).doubleValue() > 3.98) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5db43df3873(Object []i) {
	    double p = Double.NaN;
	    if (i[39] == null) {
	      p = 1;
	    } else if (((Double) i[39]).doubleValue() <= -0.25) {
	      p = 1;
	    } else if (((Double) i[39]).doubleValue() > -0.25) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_3 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_3.N644f4c94874(i);
	    return p;
	  }
	  static double N644f4c94874(Object []i) {
	    double p = Double.NaN;
	    if (i[82] == null) {
	      p = 1;
	    } else if (((Double) i[82]).doubleValue() <= 3.93) {
	    p = FlipSenseClassifier_3.N122cbbff875(i);
	    } else if (((Double) i[82]).doubleValue() > 3.93) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N122cbbff875(Object []i) {
	    double p = Double.NaN;
	    if (i[116] == null) {
	      p = 0;
	    } else if (((Double) i[116]).doubleValue() <= -6.74) {
	      p = 0;
	    } else if (((Double) i[116]).doubleValue() > -6.74) {
	    p = FlipSenseClassifier_3.N36ea6bab876(i);
	    } 
	    return p;
	  }
	  static double N36ea6bab876(Object []i) {
	    double p = Double.NaN;
	    if (i[118] == null) {
	      p = 1;
	    } else if (((Double) i[118]).doubleValue() <= -2.91) {
	    p = FlipSenseClassifier_3.N5842c3b7877(i);
	    } else if (((Double) i[118]).doubleValue() > -2.91) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5842c3b7877(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() <= 9.48) {
	    p = FlipSenseClassifier_3.N73f50a6878(i);
	    } else if (((Double) i[5]).doubleValue() > 9.48) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N73f50a6878(Object []i) {
	    double p = Double.NaN;
	    if (i[125] == null) {
	      p = 1;
	    } else if (((Double) i[125]).doubleValue() <= 9.04) {
	      p = 1;
	    } else if (((Double) i[125]).doubleValue() > 9.04) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_4 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_4.N4dc7c601879(i);
	    return p;
	  }
	  static double N4dc7c601879(Object []i) {
	    double p = Double.NaN;
	    if (i[121] == null) {
	      p = 1;
	    } else if (((Double) i[121]).doubleValue() <= -3.06) {
	    p = FlipSenseClassifier_4.N7698938b880(i);
	    } else if (((Double) i[121]).doubleValue() > -3.06) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7698938b880(Object []i) {
	    double p = Double.NaN;
	    if (i[115] == null) {
	      p = 1;
	    } else if (((Double) i[115]).doubleValue() <= -2.45) {
	    p = FlipSenseClassifier_4.N1afec781881(i);
	    } else if (((Double) i[115]).doubleValue() > -2.45) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N1afec781881(Object []i) {
	    double p = Double.NaN;
	    if (i[113] == null) {
	      p = 0;
	    } else if (((Double) i[113]).doubleValue() <= -9.04) {
	      p = 0;
	    } else if (((Double) i[113]).doubleValue() > -9.04) {
	    p = FlipSenseClassifier_4.N4cdbf3ff882(i);
	    } 
	    return p;
	  }
	  static double N4cdbf3ff882(Object []i) {
	    double p = Double.NaN;
	    if (i[26] == null) {
	      p = 1;
	    } else if (((Double) i[26]).doubleValue() <= 9.4) {
	      p = 1;
	    } else if (((Double) i[26]).doubleValue() > 9.4) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_5 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_5.N7c7011c4883(i);
	    return p;
	  }
	  static double N7c7011c4883(Object []i) {
	    double p = Double.NaN;
	    if (i[128] == null) {
	      p = 1;
	    } else if (((Double) i[128]).doubleValue() <= 6.44) {
	      p = 1;
	    } else if (((Double) i[128]).doubleValue() > 6.44) {
	    p = FlipSenseClassifier_5.N219e9aaf884(i);
	    } 
	    return p;
	  }
	  static double N219e9aaf884(Object []i) {
	    double p = Double.NaN;
	    if (i[113] == null) {
	      p = 0;
	    } else if (((Double) i[113]).doubleValue() <= 0.77) {
	    p = FlipSenseClassifier_5.N33bd6867885(i);
	    } else if (((Double) i[113]).doubleValue() > 0.77) {
	    p = FlipSenseClassifier_5.N58115cba886(i);
	    } 
	    return p;
	  }
	  static double N33bd6867885(Object []i) {
	    double p = Double.NaN;
	    if (i[69] == null) {
	      p = 0;
	    } else if (((Double) i[69]).doubleValue() <= 0.61) {
	      p = 0;
	    } else if (((Double) i[69]).doubleValue() > 0.61) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N58115cba886(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() <= 9.68) {
	    p = FlipSenseClassifier_5.N5bdee481887(i);
	    } else if (((Double) i[5]).doubleValue() > 9.68) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5bdee481887(Object []i) {
	    double p = Double.NaN;
	    if (i[119] == null) {
	      p = 0;
	    } else if (((Double) i[119]).doubleValue() <= 7.2) {
	      p = 0;
	    } else if (((Double) i[119]).doubleValue() > 7.2) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_6 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_6.N66c0046888(i);
	    return p;
	  }
	  static double N66c0046888(Object []i) {
	    double p = Double.NaN;
	    if (i[127] == null) {
	      p = 1;
	    } else if (((Double) i[127]).doubleValue() <= -5.36) {
	      p = 1;
	    } else if (((Double) i[127]).doubleValue() > -5.36) {
	    p = FlipSenseClassifier_6.N1c85f6f5889(i);
	    } 
	    return p;
	  }
	  static double N1c85f6f5889(Object []i) {
	    double p = Double.NaN;
	    if (i[27] == null) {
	      p = 1;
	    } else if (((Double) i[27]).doubleValue() <= -0.28) {
	      p = 1;
	    } else if (((Double) i[27]).doubleValue() > -0.28) {
	    p = FlipSenseClassifier_6.N1f185d74890(i);
	    } 
	    return p;
	  }
	  static double N1f185d74890(Object []i) {
	    double p = Double.NaN;
	    if (i[74] == null) {
	      p = 1;
	    } else if (((Double) i[74]).doubleValue() <= 8.85) {
	    p = FlipSenseClassifier_6.N789f7a9e891(i);
	    } else if (((Double) i[74]).doubleValue() > 8.85) {
	    p = FlipSenseClassifier_6.N2e2b58f0892(i);
	    } 
	    return p;
	  }
	  static double N789f7a9e891(Object []i) {
	    double p = Double.NaN;
	    if (i[95] == null) {
	      p = 0;
	    } else if (((Double) i[95]).doubleValue() <= 8.55) {
	      p = 0;
	    } else if (((Double) i[95]).doubleValue() > 8.55) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2e2b58f0892(Object []i) {
	    double p = Double.NaN;
	    if (i[29] == null) {
	      p = 0;
	    } else if (((Double) i[29]).doubleValue() <= 9.45) {
	      p = 0;
	    } else if (((Double) i[29]).doubleValue() > 9.45) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_7 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_7.N1fdc0c3e893(i);
	    return p;
	  }
	  static double N1fdc0c3e893(Object []i) {
	    double p = Double.NaN;
	    if (i[112] == null) {
	      p = 0;
	    } else if (((Double) i[112]).doubleValue() <= -1.38) {
	    p = FlipSenseClassifier_7.N27a7cac9894(i);
	    } else if (((Double) i[112]).doubleValue() > -1.38) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N27a7cac9894(Object []i) {
	    double p = Double.NaN;
	    if (i[125] == null) {
	      p = 1;
	    } else if (((Double) i[125]).doubleValue() <= 2.91) {
	      p = 1;
	    } else if (((Double) i[125]).doubleValue() > 2.91) {
	    p = FlipSenseClassifier_7.N78f26675895(i);
	    } 
	    return p;
	  }
	  static double N78f26675895(Object []i) {
	    double p = Double.NaN;
	    if (i[113] == null) {
	      p = 0;
	    } else if (((Double) i[113]).doubleValue() <= 0.77) {
	      p = 0;
	    } else if (((Double) i[113]).doubleValue() > 0.77) {
	    p = FlipSenseClassifier_7.N7224c95b896(i);
	    } 
	    return p;
	  }
	  static double N7224c95b896(Object []i) {
	    double p = Double.NaN;
	    if (i[62] == null) {
	      p = 1;
	    } else if (((Double) i[62]).doubleValue() <= 9.36) {
	    p = FlipSenseClassifier_7.N4d1fafe8897(i);
	    } else if (((Double) i[62]).doubleValue() > 9.36) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4d1fafe8897(Object []i) {
	    double p = Double.NaN;
	    if (i[96] == null) {
	      p = 0;
	    } else if (((Double) i[96]).doubleValue() <= -0.12) {
	      p = 0;
	    } else if (((Double) i[96]).doubleValue() > -0.12) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_8 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_8.N5b55cfe6898(i);
	    return p;
	  }
	  static double N5b55cfe6898(Object []i) {
	    double p = Double.NaN;
	    if (i[116] == null) {
	      p = 0;
	    } else if (((Double) i[116]).doubleValue() <= -3.68) {
	    p = FlipSenseClassifier_8.N5ec433e2899(i);
	    } else if (((Double) i[116]).doubleValue() > -3.68) {
	    p = FlipSenseClassifier_8.N232a6b09900(i);
	    } 
	    return p;
	  }
	  static double N5ec433e2899(Object []i) {
	    double p = Double.NaN;
	    if (i[128] == null) {
	      p = 1;
	    } else if (((Double) i[128]).doubleValue() <= 6.74) {
	      p = 1;
	    } else if (((Double) i[128]).doubleValue() > 6.74) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N232a6b09900(Object []i) {
	    double p = Double.NaN;
	    if (i[128] == null) {
	      p = 1;
	    } else if (((Double) i[128]).doubleValue() <= 9.5) {
	    p = FlipSenseClassifier_8.N35d92de8901(i);
	    } else if (((Double) i[128]).doubleValue() > 9.5) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N35d92de8901(Object []i) {
	    double p = Double.NaN;
	    if (i[62] == null) {
	      p = 1;
	    } else if (((Double) i[62]).doubleValue() <= 9.63) {
	    p = FlipSenseClassifier_8.N4554f5f6902(i);
	    } else if (((Double) i[62]).doubleValue() > 9.63) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4554f5f6902(Object []i) {
	    double p = Double.NaN;
	    if (i[114] == null) {
	      p = 1;
	    } else if (((Double) i[114]).doubleValue() <= 2.76) {
	      p = 1;
	    } else if (((Double) i[114]).doubleValue() > 2.76) {
	    p = FlipSenseClassifier_8.N4ce00d09903(i);
	    } 
	    return p;
	  }
	  static double N4ce00d09903(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() <= 3.88) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() > 3.88) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_9 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_9.N977f14d904(i);
	    return p;
	  }
	  static double N977f14d904(Object []i) {
	    double p = Double.NaN;
	    if (i[116] == null) {
	      p = 0;
	    } else if (((Double) i[116]).doubleValue() <= -0.92) {
	    p = FlipSenseClassifier_9.N2182fb16905(i);
	    } else if (((Double) i[116]).doubleValue() > -0.92) {
	    p = FlipSenseClassifier_9.N1e32728a906(i);
	    } 
	    return p;
	  }
	  static double N2182fb16905(Object []i) {
	    double p = Double.NaN;
	    if (i[128] == null) {
	      p = 1;
	    } else if (((Double) i[128]).doubleValue() <= 6.28) {
	      p = 1;
	    } else if (((Double) i[128]).doubleValue() > 6.28) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N1e32728a906(Object []i) {
	    double p = Double.NaN;
	    if (i[113] == null) {
	      p = 0;
	    } else if (((Double) i[113]).doubleValue() <= -2.15) {
	      p = 0;
	    } else if (((Double) i[113]).doubleValue() > -2.15) {
	    p = FlipSenseClassifier_9.N1fdd183907(i);
	    } 
	    return p;
	  }
	  static double N1fdd183907(Object []i) {
	    double p = Double.NaN;
	    if (i[35] == null) {
	      p = 0;
	    } else if (((Double) i[35]).doubleValue() <= 8.23) {
	      p = 0;
	    } else if (((Double) i[35]).doubleValue() > 8.23) {
	    p = FlipSenseClassifier_9.N3ec5f07a908(i);
	    } 
	    return p;
	  }
	  static double N3ec5f07a908(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() <= 9.41) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() > 9.41) {
	    p = FlipSenseClassifier_9.N352ef9c8909(i);
	    } 
	    return p;
	  }
	  static double N352ef9c8909(Object []i) {
	    double p = Double.NaN;
	    if (i[111] == null) {
	      p = 1;
	    } else if (((Double) i[111]).doubleValue() <= 1.23) {
	      p = 1;
	    } else if (((Double) i[111]).doubleValue() > 1.23) {
	      p = 0;
	    } 
	    return p;
	  }
	}