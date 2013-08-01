package me.xiangchen.technique.bumpsense;

public class BumpSenseClassifier {

	  public static double classify(Object[] i) throws Exception {
	    double [] sums = new double [2];
	    sums[(int) BumpSenseClassifier_0.classify(i)] += 3.1835940107235694;
	    sums[(int) BumpSenseClassifier_1.classify(i)] += 2.8658571921325757;
	    sums[(int) BumpSenseClassifier_2.classify(i)] += 3.8697118073564205;
	    sums[(int) BumpSenseClassifier_3.classify(i)] += 2.8192322480335354;
	    sums[(int) BumpSenseClassifier_4.classify(i)] += 2.7340993929623707;
	    sums[(int) BumpSenseClassifier_5.classify(i)] += 2.7352198361525035;
	    sums[(int) BumpSenseClassifier_6.classify(i)] += 2.9473838092021447;
	    sums[(int) BumpSenseClassifier_7.classify(i)] += 3.0412045766795104;
	    sums[(int) BumpSenseClassifier_8.classify(i)] += 2.99036439444918;
	    sums[(int) BumpSenseClassifier_9.classify(i)] += 2.5333510085900173;
	    double maxV = sums[0];
	    int maxI = 0;
	    for (int j = 1; j < 2; j++) {
	      if (sums[j] > maxV) { maxV = sums[j]; maxI = j; }
	    }
	    return (double) maxI;
	  }
	}
	class BumpSenseClassifier_0 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseClassifier_0.N778c632d1049(i);
	    return p;
	  }
	  static double N778c632d1049(Object []i) {
	    double p = Double.NaN;
	    if (i[74] == null) {
	      p = 1;
	    } else if (((Double) i[74]).doubleValue() <= 6.28) {
	      p = 1;
	    } else if (((Double) i[74]).doubleValue() > 6.28) {
	    p = BumpSenseClassifier_0.N21c35cac1050(i);
	    } 
	    return p;
	  }
	  static double N21c35cac1050(Object []i) {
	    double p = Double.NaN;
	    if (i[37] == null) {
	      p = 0;
	    } else if (((Double) i[37]).doubleValue() <= 2.7) {
	    p = BumpSenseClassifier_0.N20f931851051(i);
	    } else if (((Double) i[37]).doubleValue() > 2.7) {
	    p = BumpSenseClassifier_0.N3f7d8bac1054(i);
	    } 
	    return p;
	  }
	  static double N20f931851051(Object []i) {
	    double p = Double.NaN;
	    if (i[56] == null) {
	      p = 0;
	    } else if (((Double) i[56]).doubleValue() <= 9.5) {
	      p = 0;
	    } else if (((Double) i[56]).doubleValue() > 9.5) {
	    p = BumpSenseClassifier_0.N482223ac1052(i);
	    } 
	    return p;
	  }
	  static double N482223ac1052(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 8.6) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > 8.6) {
	    p = BumpSenseClassifier_0.N395416331053(i);
	    } 
	    return p;
	  }
	  static double N395416331053(Object []i) {
	    double p = Double.NaN;
	    if (i[76] == null) {
	      p = 0;
	    } else if (((Double) i[76]).doubleValue() <= -4.75) {
	      p = 0;
	    } else if (((Double) i[76]).doubleValue() > -4.75) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3f7d8bac1054(Object []i) {
	    double p = Double.NaN;
	    if (i[71] == null) {
	      p = 1;
	    } else if (((Double) i[71]).doubleValue() <= 9.04) {
	      p = 1;
	    } else if (((Double) i[71]).doubleValue() > 9.04) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class BumpSenseClassifier_1 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseClassifier_1.N4b5ce9c41055(i);
	    return p;
	  }
	  static double N4b5ce9c41055(Object []i) {
	    double p = Double.NaN;
	    if (i[83] == null) {
	      p = 1;
	    } else if (((Double) i[83]).doubleValue() <= 5.52) {
	      p = 1;
	    } else if (((Double) i[83]).doubleValue() > 5.52) {
	    p = BumpSenseClassifier_1.N40f769831056(i);
	    } 
	    return p;
	  }
	  static double N40f769831056(Object []i) {
	    double p = Double.NaN;
	    if (i[37] == null) {
	      p = 0;
	    } else if (((Double) i[37]).doubleValue() <= 2.8) {
	    p = BumpSenseClassifier_1.N333038c71057(i);
	    } else if (((Double) i[37]).doubleValue() > 2.8) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N333038c71057(Object []i) {
	    double p = Double.NaN;
	    if (i[60] == null) {
	      p = 1;
	    } else if (((Double) i[60]).doubleValue() <= -2.76) {
	      p = 1;
	    } else if (((Double) i[60]).doubleValue() > -2.76) {
	    p = BumpSenseClassifier_1.N22dfab121058(i);
	    } 
	    return p;
	  }
	  static double N22dfab121058(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 2.3) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 2.3) {
	    p = BumpSenseClassifier_1.Na583ca11059(i);
	    } 
	    return p;
	  }
	  static double Na583ca11059(Object []i) {
	    double p = Double.NaN;
	    if (i[74] == null) {
	      p = 1;
	    } else if (((Double) i[74]).doubleValue() <= 9.04) {
	    p = BumpSenseClassifier_1.N26f473551060(i);
	    } else if (((Double) i[74]).doubleValue() > 9.04) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N26f473551060(Object []i) {
	    double p = Double.NaN;
	    if (i[44] == null) {
	      p = 1;
	    } else if (((Double) i[44]).doubleValue() <= 8.9) {
	      p = 1;
	    } else if (((Double) i[44]).doubleValue() > 8.9) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class BumpSenseClassifier_2 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseClassifier_2.N7abfe56d1061(i);
	    return p;
	  }
	  static double N7abfe56d1061(Object []i) {
	    double p = Double.NaN;
	    if (i[65] == null) {
	      p = 1;
	    } else if (((Double) i[65]).doubleValue() <= 5.98) {
	      p = 1;
	    } else if (((Double) i[65]).doubleValue() > 5.98) {
	    p = BumpSenseClassifier_2.N4c6f96101062(i);
	    } 
	    return p;
	  }
	  static double N4c6f96101062(Object []i) {
	    double p = Double.NaN;
	    if (i[78] == null) {
	      p = 0;
	    } else if (((Double) i[78]).doubleValue() <= 3.22) {
	    p = BumpSenseClassifier_2.N31e51ba41063(i);
	    } else if (((Double) i[78]).doubleValue() > 3.22) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N31e51ba41063(Object []i) {
	    double p = Double.NaN;
	    if (i[64] == null) {
	      p = 0;
	    } else if (((Double) i[64]).doubleValue() <= -3.06) {
	    p = BumpSenseClassifier_2.N3879c5931064(i);
	    } else if (((Double) i[64]).doubleValue() > -3.06) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3879c5931064(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= 2.5) {
	    p = BumpSenseClassifier_2.N429a52dc1065(i);
	    } else if (((Double) i[7]).doubleValue() > 2.5) {
	    p = BumpSenseClassifier_2.N12135d341068(i);
	    } 
	    return p;
	  }
	  static double N429a52dc1065(Object []i) {
	    double p = Double.NaN;
	    if (i[60] == null) {
	      p = 1;
	    } else if (((Double) i[60]).doubleValue() <= -0.46) {
	      p = 1;
	    } else if (((Double) i[60]).doubleValue() > -0.46) {
	    p = BumpSenseClassifier_2.N21b60bad1066(i);
	    } 
	    return p;
	  }
	  static double N21b60bad1066(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= 2.2) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() > 2.2) {
	    p = BumpSenseClassifier_2.N36b89c251067(i);
	    } 
	    return p;
	  }
	  static double N36b89c251067(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 1;
	    } else if (((Double) i[10]).doubleValue() <= 2.3) {
	      p = 1;
	    } else if (((Double) i[10]).doubleValue() > 2.3) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N12135d341068(Object []i) {
	    double p = Double.NaN;
	    if (i[18] == null) {
	      p = 1;
	    } else if (((Double) i[18]).doubleValue() <= 0.6) {
	      p = 1;
	    } else if (((Double) i[18]).doubleValue() > 0.6) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class BumpSenseClassifier_3 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseClassifier_3.N354c0a311069(i);
	    return p;
	  }
	  static double N354c0a311069(Object []i) {
	    double p = Double.NaN;
	    if (i[77] == null) {
	      p = 1;
	    } else if (((Double) i[77]).doubleValue() <= 6.44) {
	      p = 1;
	    } else if (((Double) i[77]).doubleValue() > 6.44) {
	    p = BumpSenseClassifier_3.N1331324d1070(i);
	    } 
	    return p;
	  }
	  static double N1331324d1070(Object []i) {
	    double p = Double.NaN;
	    if (i[63] == null) {
	      p = 0;
	    } else if (((Double) i[63]).doubleValue() <= 3.06) {
	    p = BumpSenseClassifier_3.N2dd67131071(i);
	    } else if (((Double) i[63]).doubleValue() > 3.06) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2dd67131071(Object []i) {
	    double p = Double.NaN;
	    if (i[67] == null) {
	      p = 1;
	    } else if (((Double) i[67]).doubleValue() <= -5.06) {
	    p = BumpSenseClassifier_3.N159a11dd1072(i);
	    } else if (((Double) i[67]).doubleValue() > -5.06) {
	    p = BumpSenseClassifier_3.N360acf3f1073(i);
	    } 
	    return p;
	  }
	  static double N159a11dd1072(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 0.5) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 0.5) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N360acf3f1073(Object []i) {
	    double p = Double.NaN;
	    if (i[59] == null) {
	      p = 0;
	    } else if (((Double) i[59]).doubleValue() <= 10.2) {
	      p = 0;
	    } else if (((Double) i[59]).doubleValue() > 10.2) {
	    p = BumpSenseClassifier_3.N7fac4cd01074(i);
	    } 
	    return p;
	  }
	  static double N7fac4cd01074(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= 0.2) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() > 0.2) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class BumpSenseClassifier_4 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseClassifier_4.N8e72d2c1075(i);
	    return p;
	  }
	  static double N8e72d2c1075(Object []i) {
	    double p = Double.NaN;
	    if (i[17] == null) {
	      p = 1;
	    } else if (((Double) i[17]).doubleValue() <= 9.8) {
	    p = BumpSenseClassifier_4.N146a8451076(i);
	    } else if (((Double) i[17]).doubleValue() > 9.8) {
	    p = BumpSenseClassifier_4.N383cd16e1079(i);
	    } 
	    return p;
	  }
	  static double N146a8451076(Object []i) {
	    double p = Double.NaN;
	    if (i[74] == null) {
	      p = 1;
	    } else if (((Double) i[74]).doubleValue() <= 9.19) {
	    p = BumpSenseClassifier_4.N45d14aaa1077(i);
	    } else if (((Double) i[74]).doubleValue() > 9.19) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N45d14aaa1077(Object []i) {
	    double p = Double.NaN;
	    if (i[61] == null) {
	      p = 1;
	    } else if (((Double) i[61]).doubleValue() <= -3.98) {
	    p = BumpSenseClassifier_4.N2f7d02b51078(i);
	    } else if (((Double) i[61]).doubleValue() > -3.98) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2f7d02b51078(Object []i) {
	    double p = Double.NaN;
	    if (i[74] == null) {
	      p = 1;
	    } else if (((Double) i[74]).doubleValue() <= 7.97) {
	      p = 1;
	    } else if (((Double) i[74]).doubleValue() > 7.97) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N383cd16e1079(Object []i) {
	    double p = Double.NaN;
	    if (i[77] == null) {
	      p = 1;
	    } else if (((Double) i[77]).doubleValue() <= 6.44) {
	      p = 1;
	    } else if (((Double) i[77]).doubleValue() > 6.44) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class BumpSenseClassifier_5 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseClassifier_5.N20d9a99a1080(i);
	    return p;
	  }
	  static double N20d9a99a1080(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 10.9) {
	    p = BumpSenseClassifier_5.N320dce4f1081(i);
	    } else if (((Double) i[2]).doubleValue() > 10.9) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N320dce4f1081(Object []i) {
	    double p = Double.NaN;
	    if (i[84] == null) {
	      p = 0;
	    } else if (((Double) i[84]).doubleValue() <= 0.0) {
	      p = 0;
	    } else if (((Double) i[84]).doubleValue() > 0.0) {
	    p = BumpSenseClassifier_5.N2863be351082(i);
	    } 
	    return p;
	  }
	  static double N2863be351082(Object []i) {
	    double p = Double.NaN;
	    if (i[14] == null) {
	      p = 0;
	    } else if (((Double) i[14]).doubleValue() <= 5.9) {
	      p = 0;
	    } else if (((Double) i[14]).doubleValue() > 5.9) {
	    p = BumpSenseClassifier_5.N2c5c9e4a1083(i);
	    } 
	    return p;
	  }
	  static double N2c5c9e4a1083(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 1;
	    } else if (((Double) i[7]).doubleValue() <= 2.4) {
	    p = BumpSenseClassifier_5.N749c23061084(i);
	    } else if (((Double) i[7]).doubleValue() > 2.4) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N749c23061084(Object []i) {
	    double p = Double.NaN;
	    if (i[35] == null) {
	      p = 0;
	    } else if (((Double) i[35]).doubleValue() <= 9.1) {
	      p = 0;
	    } else if (((Double) i[35]).doubleValue() > 9.1) {
	    p = BumpSenseClassifier_5.N36bf9ab91085(i);
	    } 
	    return p;
	  }
	  static double N36bf9ab91085(Object []i) {
	    double p = Double.NaN;
	    if (i[69] == null) {
	      p = 1;
	    } else if (((Double) i[69]).doubleValue() <= 1.53) {
	      p = 1;
	    } else if (((Double) i[69]).doubleValue() > 1.53) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class BumpSenseClassifier_6 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseClassifier_6.N5d4703c31086(i);
	    return p;
	  }
	  static double N5d4703c31086(Object []i) {
	    double p = Double.NaN;
	    if (i[64] == null) {
	      p = 1;
	    } else if (((Double) i[64]).doubleValue() <= -7.97) {
	      p = 1;
	    } else if (((Double) i[64]).doubleValue() > -7.97) {
	    p = BumpSenseClassifier_6.N6148270c1087(i);
	    } 
	    return p;
	  }
	  static double N6148270c1087(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() <= 5.82) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() > 5.82) {
	    p = BumpSenseClassifier_6.N47fbb6b91088(i);
	    } 
	    return p;
	  }
	  static double N47fbb6b91088(Object []i) {
	    double p = Double.NaN;
	    if (i[77] == null) {
	      p = 0;
	    } else if (((Double) i[77]).doubleValue() <= 9.19) {
	    p = BumpSenseClassifier_6.N5e99509a1089(i);
	    } else if (((Double) i[77]).doubleValue() > 9.19) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5e99509a1089(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 0.6) {
	    p = BumpSenseClassifier_6.N237adefb1090(i);
	    } else if (((Double) i[3]).doubleValue() > 0.6) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N237adefb1090(Object []i) {
	    double p = Double.NaN;
	    if (i[66] == null) {
	      p = 0;
	    } else if (((Double) i[66]).doubleValue() <= -0.92) {
	      p = 0;
	    } else if (((Double) i[66]).doubleValue() > -0.92) {
	    p = BumpSenseClassifier_6.N57c542ef1091(i);
	    } 
	    return p;
	  }
	  static double N57c542ef1091(Object []i) {
	    double p = Double.NaN;
	    if (i[84] == null) {
	      p = 0;
	    } else if (((Double) i[84]).doubleValue() <= 0.0) {
	      p = 0;
	    } else if (((Double) i[84]).doubleValue() > 0.0) {
	    p = BumpSenseClassifier_6.N57ad85ed1092(i);
	    } 
	    return p;
	  }
	  static double N57ad85ed1092(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 8.7) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > 8.7) {
	    p = BumpSenseClassifier_6.N4133b7931093(i);
	    } 
	    return p;
	  }
	  static double N4133b7931093(Object []i) {
	    double p = Double.NaN;
	    if (i[44] == null) {
	      p = 0;
	    } else if (((Double) i[44]).doubleValue() <= 8.8) {
	      p = 0;
	    } else if (((Double) i[44]).doubleValue() > 8.8) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class BumpSenseClassifier_7 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseClassifier_7.N2a5935561094(i);
	    return p;
	  }
	  static double N2a5935561094(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= 2.7) {
	    p = BumpSenseClassifier_7.N46bcb6d21095(i);
	    } else if (((Double) i[7]).doubleValue() > 2.7) {
	    p = BumpSenseClassifier_7.N3e66af6b1100(i);
	    } 
	    return p;
	  }
	  static double N46bcb6d21095(Object []i) {
	    double p = Double.NaN;
	    if (i[64] == null) {
	      p = 1;
	    } else if (((Double) i[64]).doubleValue() <= -7.97) {
	      p = 1;
	    } else if (((Double) i[64]).doubleValue() > -7.97) {
	    p = BumpSenseClassifier_7.Nf86b9461096(i);
	    } 
	    return p;
	  }
	  static double Nf86b9461096(Object []i) {
	    double p = Double.NaN;
	    if (i[74] == null) {
	      p = 1;
	    } else if (((Double) i[74]).doubleValue() <= 6.13) {
	      p = 1;
	    } else if (((Double) i[74]).doubleValue() > 6.13) {
	    p = BumpSenseClassifier_7.N55edaaa01097(i);
	    } 
	    return p;
	  }
	  static double N55edaaa01097(Object []i) {
	    double p = Double.NaN;
	    if (i[69] == null) {
	      p = 1;
	    } else if (((Double) i[69]).doubleValue() <= -0.31) {
	      p = 1;
	    } else if (((Double) i[69]).doubleValue() > -0.31) {
	    p = BumpSenseClassifier_7.N665d1a721098(i);
	    } 
	    return p;
	  }
	  static double N665d1a721098(Object []i) {
	    double p = Double.NaN;
	    if (i[56] == null) {
	      p = 0;
	    } else if (((Double) i[56]).doubleValue() <= 10.4) {
	      p = 0;
	    } else if (((Double) i[56]).doubleValue() > 10.4) {
	    p = BumpSenseClassifier_7.N6a7366de1099(i);
	    } 
	    return p;
	  }
	  static double N6a7366de1099(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 8.9) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > 8.9) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3e66af6b1100(Object []i) {
	    double p = Double.NaN;
	    if (i[77] == null) {
	      p = 1;
	    } else if (((Double) i[77]).doubleValue() <= 9.19) {
	      p = 1;
	    } else if (((Double) i[77]).doubleValue() > 9.19) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class BumpSenseClassifier_8 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseClassifier_8.N4786b9ce1101(i);
	    return p;
	  }
	  static double N4786b9ce1101(Object []i) {
	    double p = Double.NaN;
	    if (i[17] == null) {
	      p = 1;
	    } else if (((Double) i[17]).doubleValue() <= 9.4) {
	    p = BumpSenseClassifier_8.N5e10a8111102(i);
	    } else if (((Double) i[17]).doubleValue() > 9.4) {
	    p = BumpSenseClassifier_8.Nd20759b1108(i);
	    } 
	    return p;
	  }
	  static double N5e10a8111102(Object []i) {
	    double p = Double.NaN;
	    if (i[74] == null) {
	      p = 1;
	    } else if (((Double) i[74]).doubleValue() <= 9.19) {
	    p = BumpSenseClassifier_8.N178a24561103(i);
	    } else if (((Double) i[74]).doubleValue() > 9.19) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N178a24561103(Object []i) {
	    double p = Double.NaN;
	    if (i[63] == null) {
	      p = 0;
	    } else if (((Double) i[63]).doubleValue() <= 0.15) {
	      p = 0;
	    } else if (((Double) i[63]).doubleValue() > 0.15) {
	    p = BumpSenseClassifier_8.N6e57962c1104(i);
	    } 
	    return p;
	  }
	  static double N6e57962c1104(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() <= 9.0) {
	    p = BumpSenseClassifier_8.N38445b4c1105(i);
	    } else if (((Double) i[5]).doubleValue() > 9.0) {
	    p = BumpSenseClassifier_8.Ndf7e2271107(i);
	    } 
	    return p;
	  }
	  static double N38445b4c1105(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() <= 9.19) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() > 9.19) {
	    p = BumpSenseClassifier_8.Nfc5f7701106(i);
	    } 
	    return p;
	  }
	  static double Nfc5f7701106(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 5.1) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() > 5.1) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double Ndf7e2271107(Object []i) {
	    double p = Double.NaN;
	    if (i[53] == null) {
	      p = 0;
	    } else if (((Double) i[53]).doubleValue() <= 9.3) {
	      p = 0;
	    } else if (((Double) i[53]).doubleValue() > 9.3) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Nd20759b1108(Object []i) {
	    double p = Double.NaN;
	    if (i[65] == null) {
	      p = 1;
	    } else if (((Double) i[65]).doubleValue() <= 6.44) {
	      p = 1;
	    } else if (((Double) i[65]).doubleValue() > 6.44) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class BumpSenseClassifier_9 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseClassifier_9.N4e0919d81109(i);
	    return p;
	  }
	  static double N4e0919d81109(Object []i) {
	    double p = Double.NaN;
	    if (i[20] == null) {
	      p = 1;
	    } else if (((Double) i[20]).doubleValue() <= 9.7) {
	    p = BumpSenseClassifier_9.N377fdbee1110(i);
	    } else if (((Double) i[20]).doubleValue() > 9.7) {
	    p = BumpSenseClassifier_9.N78e76ee61116(i);
	    } 
	    return p;
	  }
	  static double N377fdbee1110(Object []i) {
	    double p = Double.NaN;
	    if (i[29] == null) {
	      p = 1;
	    } else if (((Double) i[29]).doubleValue() <= 9.5) {
	    p = BumpSenseClassifier_9.N2b4002b91111(i);
	    } else if (((Double) i[29]).doubleValue() > 9.5) {
	    p = BumpSenseClassifier_9.N3444c361115(i);
	    } 
	    return p;
	  }
	  static double N2b4002b91111(Object []i) {
	    double p = Double.NaN;
	    if (i[21] == null) {
	      p = 1;
	    } else if (((Double) i[21]).doubleValue() <= -0.1) {
	    p = BumpSenseClassifier_9.N7772d5dd1112(i);
	    } else if (((Double) i[21]).doubleValue() > -0.1) {
	    p = BumpSenseClassifier_9.N1e03acc71114(i);
	    } 
	    return p;
	  }
	  static double N7772d5dd1112(Object []i) {
	    double p = Double.NaN;
	    if (i[79] == null) {
	      p = 1;
	    } else if (((Double) i[79]).doubleValue() <= -2.91) {
	      p = 1;
	    } else if (((Double) i[79]).doubleValue() > -2.91) {
	    p = BumpSenseClassifier_9.N1436dd6f1113(i);
	    } 
	    return p;
	  }
	  static double N1436dd6f1113(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= -2.3) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > -2.3) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N1e03acc71114(Object []i) {
	    double p = Double.NaN;
	    if (i[28] == null) {
	      p = 0;
	    } else if (((Double) i[28]).doubleValue() <= 2.5) {
	      p = 0;
	    } else if (((Double) i[28]).doubleValue() > 2.5) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3444c361115(Object []i) {
	    double p = Double.NaN;
	    if (i[74] == null) {
	      p = 1;
	    } else if (((Double) i[74]).doubleValue() <= 6.59) {
	      p = 1;
	    } else if (((Double) i[74]).doubleValue() > 6.59) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N78e76ee61116(Object []i) {
	    double p = Double.NaN;
	    if (i[53] == null) {
	      p = 0;
	    } else if (((Double) i[53]).doubleValue() <= 11.7) {
	      p = 0;
	    } else if (((Double) i[53]).doubleValue() > 11.7) {
	      p = 1;
	    } 
	    return p;
	  }
	}
