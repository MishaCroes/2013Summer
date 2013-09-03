package me.xiangchen.technique.bumpsense;

public class BumpSenseClassifier {

	  public static double classify(Object[] i) throws Exception {
	    double [] sums = new double [2];
	    sums[(int) BumpSenseClassifier_0.classify(i)] += 2.7019711550258276;
	    sums[(int) BumpSenseClassifier_1.classify(i)] += 2.424184422413296;
	    sums[(int) BumpSenseClassifier_2.classify(i)] += 2.518741806589564;
	    sums[(int) BumpSenseClassifier_3.classify(i)] += 2.104457816028113;
	    sums[(int) BumpSenseClassifier_4.classify(i)] += 2.860746415451576;
	    sums[(int) BumpSenseClassifier_5.classify(i)] += 2.134786527158679;
	    sums[(int) BumpSenseClassifier_6.classify(i)] += 2.3116679032709526;
	    sums[(int) BumpSenseClassifier_7.classify(i)] += 2.6815359796614313;
	    sums[(int) BumpSenseClassifier_8.classify(i)] += 2.340228772274998;
	    sums[(int) BumpSenseClassifier_9.classify(i)] += 2.69334415880487;
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
	    p = BumpSenseClassifier_0.N3474c1f0(i);
	    return p;
	  }
	  static double N3474c1f0(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= 9.4) {
	    p = BumpSenseClassifier_0.N3dd688e71(i);
	    } else if (((Double) i[8]).doubleValue() > 9.4) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3dd688e71(Object []i) {
	    double p = Double.NaN;
	    if (i[20] == null) {
	      p = 1;
	    } else if (((Double) i[20]).doubleValue() <= 9.6) {
	    p = BumpSenseClassifier_0.N4fb615682(i);
	    } else if (((Double) i[20]).doubleValue() > 9.6) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4fb615682(Object []i) {
	    double p = Double.NaN;
	    if (i[50] == null) {
	      p = 1;
	    } else if (((Double) i[50]).doubleValue() <= 9.5) {
	    p = BumpSenseClassifier_0.N3b3787ba3(i);
	    } else if (((Double) i[50]).doubleValue() > 9.5) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3b3787ba3(Object []i) {
	    double p = Double.NaN;
	    if (i[29] == null) {
	      p = 1;
	    } else if (((Double) i[29]).doubleValue() <= 9.5) {
	    p = BumpSenseClassifier_0.N3aafe2b54(i);
	    } else if (((Double) i[29]).doubleValue() > 9.5) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3aafe2b54(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 1;
	    } else if (((Double) i[10]).doubleValue() <= 4.8) {
	    p = BumpSenseClassifier_0.N714cf72c5(i);
	    } else if (((Double) i[10]).doubleValue() > 4.8) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N714cf72c5(Object []i) {
	    double p = Double.NaN;
	    if (i[29] == null) {
	      p = 0;
	    } else if (((Double) i[29]).doubleValue() <= 7.7) {
	      p = 0;
	    } else if (((Double) i[29]).doubleValue() > 7.7) {
	    p = BumpSenseClassifier_0.N73f7a3d06(i);
	    } 
	    return p;
	  }
	  static double N73f7a3d06(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= 7.8) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() > 7.8) {
	    p = BumpSenseClassifier_0.N723e82b7(i);
	    } 
	    return p;
	  }
	  static double N723e82b7(Object []i) {
	    double p = Double.NaN;
	    if (i[36] == null) {
	      p = 1;
	    } else if (((Double) i[36]).doubleValue() <= -0.4) {
	    p = BumpSenseClassifier_0.N465f62b68(i);
	    } else if (((Double) i[36]).doubleValue() > -0.4) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N465f62b68(Object []i) {
	    double p = Double.NaN;
	    if (i[40] == null) {
	      p = 0;
	    } else if (((Double) i[40]).doubleValue() <= 2.5) {
	      p = 0;
	    } else if (((Double) i[40]).doubleValue() > 2.5) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class BumpSenseClassifier_1 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseClassifier_1.N2049bed29(i);
	    return p;
	  }
	  static double N2049bed29(Object []i) {
	    double p = Double.NaN;
	    if (i[87] == null) {
	      p = 1;
	    } else if (((Double) i[87]).doubleValue() <= -5.21) {
	      p = 1;
	    } else if (((Double) i[87]).doubleValue() > -5.21) {
	    p = BumpSenseClassifier_1.N498edd8d10(i);
	    } 
	    return p;
	  }
	  static double N498edd8d10(Object []i) {
	    double p = Double.NaN;
	    if (i[55] == null) {
	      p = 0;
	    } else if (((Double) i[55]).doubleValue() <= 5.3) {
	    p = BumpSenseClassifier_1.N427379b511(i);
	    } else if (((Double) i[55]).doubleValue() > 5.3) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N427379b511(Object []i) {
	    double p = Double.NaN;
	    if (i[59] == null) {
	      p = 0;
	    } else if (((Double) i[59]).doubleValue() <= 9.5) {
	    p = BumpSenseClassifier_1.N2b3b7c2812(i);
	    } else if (((Double) i[59]).doubleValue() > 9.5) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N2b3b7c2812(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= 7.3) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() > 7.3) {
	    p = BumpSenseClassifier_1.N4e543c4413(i);
	    } 
	    return p;
	  }
	  static double N4e543c4413(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 4.6) {
	    p = BumpSenseClassifier_1.N7c40bc8814(i);
	    } else if (((Double) i[4]).doubleValue() > 4.6) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N7c40bc8814(Object []i) {
	    double p = Double.NaN;
	    if (i[62] == null) {
	      p = 0;
	    } else if (((Double) i[62]).doubleValue() <= 8.7) {
	    p = BumpSenseClassifier_1.N7e19c47215(i);
	    } else if (((Double) i[62]).doubleValue() > 8.7) {
	    p = BumpSenseClassifier_1.N1983eae720(i);
	    } 
	    return p;
	  }
	  static double N7e19c47215(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 8.7) {
	    p = BumpSenseClassifier_1.N4db0590b16(i);
	    } else if (((Double) i[5]).doubleValue() > 8.7) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4db0590b16(Object []i) {
	    double p = Double.NaN;
	    if (i[68] == null) {
	      p = 0;
	    } else if (((Double) i[68]).doubleValue() <= 7.8) {
	      p = 0;
	    } else if (((Double) i[68]).doubleValue() > 7.8) {
	    p = BumpSenseClassifier_1.N74a6090517(i);
	    } 
	    return p;
	  }
	  static double N74a6090517(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 8.5) {
	    p = BumpSenseClassifier_1.N409a631718(i);
	    } else if (((Double) i[5]).doubleValue() > 8.5) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N409a631718(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 3.7) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > 3.7) {
	    p = BumpSenseClassifier_1.N57df9c2319(i);
	    } 
	    return p;
	  }
	  static double N57df9c2319(Object []i) {
	    double p = Double.NaN;
	    if (i[32] == null) {
	      p = 0;
	    } else if (((Double) i[32]).doubleValue() <= 8.1) {
	      p = 0;
	    } else if (((Double) i[32]).doubleValue() > 8.1) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N1983eae720(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() <= 9.4) {
	    p = BumpSenseClassifier_1.N23b2f0c721(i);
	    } else if (((Double) i[5]).doubleValue() > 9.4) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N23b2f0c721(Object []i) {
	    double p = Double.NaN;
	    if (i[35] == null) {
	      p = 0;
	    } else if (((Double) i[35]).doubleValue() <= 8.7) {
	      p = 0;
	    } else if (((Double) i[35]).doubleValue() > 8.7) {
	    p = BumpSenseClassifier_1.N38ddab2022(i);
	    } 
	    return p;
	  }
	  static double N38ddab2022(Object []i) {
	    double p = Double.NaN;
	    if (i[85] == null) {
	      p = 1;
	    } else if (((Double) i[85]).doubleValue() <= -2.6) {
	      p = 1;
	    } else if (((Double) i[85]).doubleValue() > -2.6) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class BumpSenseClassifier_2 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseClassifier_2.N610ddf0a23(i);
	    return p;
	  }
	  static double N610ddf0a23(Object []i) {
	    double p = Double.NaN;
	    if (i[81] == null) {
	      p = 0;
	    } else if (((Double) i[81]).doubleValue() <= 2.15) {
	    p = BumpSenseClassifier_2.N55ae3b4d24(i);
	    } else if (((Double) i[81]).doubleValue() > 2.15) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N55ae3b4d24(Object []i) {
	    double p = Double.NaN;
	    if (i[14] == null) {
	      p = 0;
	    } else if (((Double) i[14]).doubleValue() <= 9.5) {
	    p = BumpSenseClassifier_2.N21b7682d25(i);
	    } else if (((Double) i[14]).doubleValue() > 9.5) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N21b7682d25(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= 9.4) {
	    p = BumpSenseClassifier_2.N101873a626(i);
	    } else if (((Double) i[8]).doubleValue() > 9.4) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N101873a626(Object []i) {
	    double p = Double.NaN;
	    if (i[84] == null) {
	      p = 1;
	    } else if (((Double) i[84]).doubleValue() <= -0.61) {
	      p = 1;
	    } else if (((Double) i[84]).doubleValue() > -0.61) {
	    p = BumpSenseClassifier_2.N35509f8b27(i);
	    } 
	    return p;
	  }
	  static double N35509f8b27(Object []i) {
	    double p = Double.NaN;
	    if (i[84] == null) {
	      p = 0;
	    } else if (((Double) i[84]).doubleValue() <= -0.15) {
	      p = 0;
	    } else if (((Double) i[84]).doubleValue() > -0.15) {
	    p = BumpSenseClassifier_2.N401a7a0528(i);
	    } 
	    return p;
	  }
	  static double N401a7a0528(Object []i) {
	    double p = Double.NaN;
	    if (i[65] == null) {
	      p = 1;
	    } else if (((Double) i[65]).doubleValue() <= 9.5) {
	    p = BumpSenseClassifier_2.Na40ff2429(i);
	    } else if (((Double) i[65]).doubleValue() > 9.5) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double Na40ff2429(Object []i) {
	    double p = Double.NaN;
	    if (i[75] == null) {
	      p = 0;
	    } else if (((Double) i[75]).doubleValue() <= -0.15) {
	      p = 0;
	    } else if (((Double) i[75]).doubleValue() > -0.15) {
	    p = BumpSenseClassifier_2.N312e99be30(i);
	    } 
	    return p;
	  }
	  static double N312e99be30(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() <= 9.0) {
	    p = BumpSenseClassifier_2.N6a6fa22b31(i);
	    } else if (((Double) i[11]).doubleValue() > 9.0) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6a6fa22b31(Object []i) {
	    double p = Double.NaN;
	    if (i[35] == null) {
	      p = 1;
	    } else if (((Double) i[35]).doubleValue() <= 9.0) {
	    p = BumpSenseClassifier_2.N46ffeba432(i);
	    } else if (((Double) i[35]).doubleValue() > 9.0) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N46ffeba432(Object []i) {
	    double p = Double.NaN;
	    if (i[63] == null) {
	      p = 1;
	    } else if (((Double) i[63]).doubleValue() <= -1.2) {
	      p = 1;
	    } else if (((Double) i[63]).doubleValue() > -1.2) {
	    p = BumpSenseClassifier_2.N4bc7806633(i);
	    } 
	    return p;
	  }
	  static double N4bc7806633(Object []i) {
	    double p = Double.NaN;
	    if (i[13] == null) {
	      p = 1;
	    } else if (((Double) i[13]).doubleValue() <= 5.3) {
	    p = BumpSenseClassifier_2.N16becf6834(i);
	    } else if (((Double) i[13]).doubleValue() > 5.3) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N16becf6834(Object []i) {
	    double p = Double.NaN;
	    if (i[71] == null) {
	      p = 0;
	    } else if (((Double) i[71]).doubleValue() <= 7.6) {
	      p = 0;
	    } else if (((Double) i[71]).doubleValue() > 7.6) {
	    p = BumpSenseClassifier_2.N4922c08235(i);
	    } 
	    return p;
	  }
	  static double N4922c08235(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 4.7) {
	    p = BumpSenseClassifier_2.N88cbc5136(i);
	    } else if (((Double) i[1]).doubleValue() > 4.7) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N88cbc5136(Object []i) {
	    double p = Double.NaN;
	    if (i[88] == null) {
	      p = 1;
	    } else if (((Double) i[88]).doubleValue() <= -2.76) {
	      p = 1;
	    } else if (((Double) i[88]).doubleValue() > -2.76) {
	    p = BumpSenseClassifier_2.N4f9f6e3937(i);
	    } 
	    return p;
	  }
	  static double N4f9f6e3937(Object []i) {
	    double p = Double.NaN;
	    if (i[79] == null) {
	      p = 0;
	    } else if (((Double) i[79]).doubleValue() <= -2.15) {
	      p = 0;
	    } else if (((Double) i[79]).doubleValue() > -2.15) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class BumpSenseClassifier_3 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseClassifier_3.N6bfd890538(i);
	    return p;
	  }
	  static double N6bfd890538(Object []i) {
	    double p = Double.NaN;
	    if (i[62] == null) {
	      p = 0;
	    } else if (((Double) i[62]).doubleValue() <= 8.7) {
	    p = BumpSenseClassifier_3.N522edea639(i);
	    } else if (((Double) i[62]).doubleValue() > 8.7) {
	    p = BumpSenseClassifier_3.N5b2fca3543(i);
	    } 
	    return p;
	  }
	  static double N522edea639(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= 4.6) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() > 4.6) {
	    p = BumpSenseClassifier_3.N31b8e7140(i);
	    } 
	    return p;
	  }
	  static double N31b8e7140(Object []i) {
	    double p = Double.NaN;
	    if (i[68] == null) {
	      p = 1;
	    } else if (((Double) i[68]).doubleValue() <= 8.2) {
	    p = BumpSenseClassifier_3.N6249e4f41(i);
	    } else if (((Double) i[68]).doubleValue() > 8.2) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6249e4f41(Object []i) {
	    double p = Double.NaN;
	    if (i[86] == null) {
	      p = 1;
	    } else if (((Double) i[86]).doubleValue() <= 9.04) {
	      p = 1;
	    } else if (((Double) i[86]).doubleValue() > 9.04) {
	    p = BumpSenseClassifier_3.N4e1557af42(i);
	    } 
	    return p;
	  }
	  static double N4e1557af42(Object []i) {
	    double p = Double.NaN;
	    if (i[18] == null) {
	      p = 1;
	    } else if (((Double) i[18]).doubleValue() <= 0.4) {
	      p = 1;
	    } else if (((Double) i[18]).doubleValue() > 0.4) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5b2fca3543(Object []i) {
	    double p = Double.NaN;
	    if (i[38] == null) {
	      p = 0;
	    } else if (((Double) i[38]).doubleValue() <= 8.4) {
	      p = 0;
	    } else if (((Double) i[38]).doubleValue() > 8.4) {
	    p = BumpSenseClassifier_3.N1e848c5844(i);
	    } 
	    return p;
	  }
	  static double N1e848c5844(Object []i) {
	    double p = Double.NaN;
	    if (i[23] == null) {
	      p = 0;
	    } else if (((Double) i[23]).doubleValue() <= 8.6) {
	      p = 0;
	    } else if (((Double) i[23]).doubleValue() > 8.6) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class BumpSenseClassifier_4 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseClassifier_4.N1019f50f45(i);
	    return p;
	  }
	  static double N1019f50f45(Object []i) {
	    double p = Double.NaN;
	    if (i[20] == null) {
	      p = 1;
	    } else if (((Double) i[20]).doubleValue() <= 9.5) {
	    p = BumpSenseClassifier_4.N1827b40b46(i);
	    } else if (((Double) i[20]).doubleValue() > 9.5) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N1827b40b46(Object []i) {
	    double p = Double.NaN;
	    if (i[77] == null) {
	      p = 1;
	    } else if (((Double) i[77]).doubleValue() <= 6.74) {
	      p = 1;
	    } else if (((Double) i[77]).doubleValue() > 6.74) {
	    p = BumpSenseClassifier_4.N569d4a9047(i);
	    } 
	    return p;
	  }
	  static double N569d4a9047(Object []i) {
	    double p = Double.NaN;
	    if (i[55] == null) {
	      p = 0;
	    } else if (((Double) i[55]).doubleValue() <= 5.3) {
	    p = BumpSenseClassifier_4.N708a605c48(i);
	    } else if (((Double) i[55]).doubleValue() > 5.3) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N708a605c48(Object []i) {
	    double p = Double.NaN;
	    if (i[74] == null) {
	      p = 0;
	    } else if (((Double) i[74]).doubleValue() <= 7.6) {
	      p = 0;
	    } else if (((Double) i[74]).doubleValue() > 7.6) {
	    p = BumpSenseClassifier_4.Ncbc71bd49(i);
	    } 
	    return p;
	  }
	  static double Ncbc71bd49(Object []i) {
	    double p = Double.NaN;
	    if (i[19] == null) {
	      p = 0;
	    } else if (((Double) i[19]).doubleValue() <= 4.5) {
	    p = BumpSenseClassifier_4.N27cf35d350(i);
	    } else if (((Double) i[19]).doubleValue() > 4.5) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N27cf35d350(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= 8.0) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() > 8.0) {
	    p = BumpSenseClassifier_4.N14d6c41051(i);
	    } 
	    return p;
	  }
	  static double N14d6c41051(Object []i) {
	    double p = Double.NaN;
	    if (i[60] == null) {
	      p = 0;
	    } else if (((Double) i[60]).doubleValue() <= -1.5) {
	      p = 0;
	    } else if (((Double) i[60]).doubleValue() > -1.5) {
	    p = BumpSenseClassifier_4.N1fe2012052(i);
	    } 
	    return p;
	  }
	  static double N1fe2012052(Object []i) {
	    double p = Double.NaN;
	    if (i[76] == null) {
	      p = 0;
	    } else if (((Double) i[76]).doubleValue() <= -4.9) {
	      p = 0;
	    } else if (((Double) i[76]).doubleValue() > -4.9) {
	    p = BumpSenseClassifier_4.N2eb7ec3a53(i);
	    } 
	    return p;
	  }
	  static double N2eb7ec3a53(Object []i) {
	    double p = Double.NaN;
	    if (i[80] == null) {
	      p = 1;
	    } else if (((Double) i[80]).doubleValue() <= 8.73) {
	      p = 1;
	    } else if (((Double) i[80]).doubleValue() > 8.73) {
	    p = BumpSenseClassifier_4.N2cf5ebcc54(i);
	    } 
	    return p;
	  }
	  static double N2cf5ebcc54(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() <= 9.4) {
	    p = BumpSenseClassifier_4.N454bb52355(i);
	    } else if (((Double) i[5]).doubleValue() > 9.4) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N454bb52355(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 0;
	    } else if (((Double) i[89]).doubleValue() <= 9.81) {
	    p = BumpSenseClassifier_4.N6d61305f56(i);
	    } else if (((Double) i[89]).doubleValue() > 9.81) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6d61305f56(Object []i) {
	    double p = Double.NaN;
	    if (i[44] == null) {
	      p = 1;
	    } else if (((Double) i[44]).doubleValue() <= 8.1) {
	      p = 1;
	    } else if (((Double) i[44]).doubleValue() > 8.1) {
	    p = BumpSenseClassifier_4.N7aee51357(i);
	    } 
	    return p;
	  }
	  static double N7aee51357(Object []i) {
	    double p = Double.NaN;
	    if (i[26] == null) {
	      p = 0;
	    } else if (((Double) i[26]).doubleValue() <= 9.0) {
	    p = BumpSenseClassifier_4.N6b41465558(i);
	    } else if (((Double) i[26]).doubleValue() > 9.0) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6b41465558(Object []i) {
	    double p = Double.NaN;
	    if (i[65] == null) {
	      p = 0;
	    } else if (((Double) i[65]).doubleValue() <= 8.1) {
	      p = 0;
	    } else if (((Double) i[65]).doubleValue() > 8.1) {
	    p = BumpSenseClassifier_4.Na70ad7659(i);
	    } 
	    return p;
	  }
	  static double Na70ad7659(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() <= 8.7) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() > 8.7) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class BumpSenseClassifier_5 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseClassifier_5.N6b8c235460(i);
	    return p;
	  }
	  static double N6b8c235460(Object []i) {
	    double p = Double.NaN;
	    if (i[56] == null) {
	      p = 1;
	    } else if (((Double) i[56]).doubleValue() <= 9.5) {
	    p = BumpSenseClassifier_5.N3d6396f561(i);
	    } else if (((Double) i[56]).doubleValue() > 9.5) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3d6396f561(Object []i) {
	    double p = Double.NaN;
	    if (i[65] == null) {
	      p = 1;
	    } else if (((Double) i[65]).doubleValue() <= 9.5) {
	    p = BumpSenseClassifier_5.N554bce4f62(i);
	    } else if (((Double) i[65]).doubleValue() > 9.5) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N554bce4f62(Object []i) {
	    double p = Double.NaN;
	    if (i[23] == null) {
	      p = 0;
	    } else if (((Double) i[23]).doubleValue() <= 6.3) {
	      p = 0;
	    } else if (((Double) i[23]).doubleValue() > 6.3) {
	    p = BumpSenseClassifier_5.N63d5d04863(i);
	    } 
	    return p;
	  }
	  static double N63d5d04863(Object []i) {
	    double p = Double.NaN;
	    if (i[15] == null) {
	      p = 1;
	    } else if (((Double) i[15]).doubleValue() <= 1.8) {
	    p = BumpSenseClassifier_5.N6a5d5a2c64(i);
	    } else if (((Double) i[15]).doubleValue() > 1.8) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6a5d5a2c64(Object []i) {
	    double p = Double.NaN;
	    if (i[60] == null) {
	      p = 1;
	    } else if (((Double) i[60]).doubleValue() <= 1.4) {
	    p = BumpSenseClassifier_5.N16cb354265(i);
	    } else if (((Double) i[60]).doubleValue() > 1.4) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N16cb354265(Object []i) {
	    double p = Double.NaN;
	    if (i[24] == null) {
	      p = 1;
	    } else if (((Double) i[24]).doubleValue() <= 1.4) {
	    p = BumpSenseClassifier_5.N77158bbe66(i);
	    } else if (((Double) i[24]).doubleValue() > 1.4) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N77158bbe66(Object []i) {
	    double p = Double.NaN;
	    if (i[27] == null) {
	      p = 1;
	    } else if (((Double) i[27]).doubleValue() <= 0.8) {
	    p = BumpSenseClassifier_5.N2789a40667(i);
	    } else if (((Double) i[27]).doubleValue() > 0.8) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2789a40667(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 8.5) {
	    p = BumpSenseClassifier_5.N3d6f9a3168(i);
	    } else if (((Double) i[2]).doubleValue() > 8.5) {
	    p = BumpSenseClassifier_5.Na5c0f8f72(i);
	    } 
	    return p;
	  }
	  static double N3d6f9a3168(Object []i) {
	    double p = Double.NaN;
	    if (i[76] == null) {
	      p = 0;
	    } else if (((Double) i[76]).doubleValue() <= -0.61) {
	    p = BumpSenseClassifier_5.N69f4267969(i);
	    } else if (((Double) i[76]).doubleValue() > -0.61) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N69f4267969(Object []i) {
	    double p = Double.NaN;
	    if (i[74] == null) {
	      p = 0;
	    } else if (((Double) i[74]).doubleValue() <= 8.5) {
	    p = BumpSenseClassifier_5.N1c0a084770(i);
	    } else if (((Double) i[74]).doubleValue() > 8.5) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N1c0a084770(Object []i) {
	    double p = Double.NaN;
	    if (i[56] == null) {
	      p = 1;
	    } else if (((Double) i[56]).doubleValue() <= 8.1) {
	      p = 1;
	    } else if (((Double) i[56]).doubleValue() > 8.1) {
	    p = BumpSenseClassifier_5.N56a57bb271(i);
	    } 
	    return p;
	  }
	  static double N56a57bb271(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 8.0) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > 8.0) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Na5c0f8f72(Object []i) {
	    double p = Double.NaN;
	    if (i[81] == null) {
	      p = 0;
	    } else if (((Double) i[81]).doubleValue() <= -0.15) {
	      p = 0;
	    } else if (((Double) i[81]).doubleValue() > -0.15) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class BumpSenseClassifier_6 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseClassifier_6.N22017a9973(i);
	    return p;
	  }
	  static double N22017a9973(Object []i) {
	    double p = Double.NaN;
	    if (i[86] == null) {
	      p = 1;
	    } else if (((Double) i[86]).doubleValue() <= 7.81) {
	      p = 1;
	    } else if (((Double) i[86]).doubleValue() > 7.81) {
	    p = BumpSenseClassifier_6.Nf17e44074(i);
	    } 
	    return p;
	  }
	  static double Nf17e44074(Object []i) {
	    double p = Double.NaN;
	    if (i[72] == null) {
	      p = 0;
	    } else if (((Double) i[72]).doubleValue() <= -2.0) {
	      p = 0;
	    } else if (((Double) i[72]).doubleValue() > -2.0) {
	    p = BumpSenseClassifier_6.N698a2d7d75(i);
	    } 
	    return p;
	  }
	  static double N698a2d7d75(Object []i) {
	    double p = Double.NaN;
	    if (i[76] == null) {
	      p = 0;
	    } else if (((Double) i[76]).doubleValue() <= -5.82) {
	      p = 0;
	    } else if (((Double) i[76]).doubleValue() > -5.82) {
	    p = BumpSenseClassifier_6.N6eb09fac76(i);
	    } 
	    return p;
	  }
	  static double N6eb09fac76(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= 9.4) {
	    p = BumpSenseClassifier_6.Ndc30dfa77(i);
	    } else if (((Double) i[8]).doubleValue() > 9.4) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double Ndc30dfa77(Object []i) {
	    double p = Double.NaN;
	    if (i[36] == null) {
	      p = 0;
	    } else if (((Double) i[36]).doubleValue() <= -1.9) {
	      p = 0;
	    } else if (((Double) i[36]).doubleValue() > -1.9) {
	    p = BumpSenseClassifier_6.Nca9f2578(i);
	    } 
	    return p;
	  }
	  static double Nca9f2578(Object []i) {
	    double p = Double.NaN;
	    if (i[79] == null) {
	      p = 1;
	    } else if (((Double) i[79]).doubleValue() <= -3.52) {
	    p = BumpSenseClassifier_6.N7696368a79(i);
	    } else if (((Double) i[79]).doubleValue() > -3.52) {
	    p = BumpSenseClassifier_6.N839c6c782(i);
	    } 
	    return p;
	  }
	  static double N7696368a79(Object []i) {
	    double p = Double.NaN;
	    if (i[75] == null) {
	      p = 1;
	    } else if (((Double) i[75]).doubleValue() <= 2.15) {
	    p = BumpSenseClassifier_6.N7fd6dad880(i);
	    } else if (((Double) i[75]).doubleValue() > 2.15) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7fd6dad880(Object []i) {
	    double p = Double.NaN;
	    if (i[83] == null) {
	      p = 1;
	    } else if (((Double) i[83]).doubleValue() <= 8.89) {
	    p = BumpSenseClassifier_6.N72b9dc7981(i);
	    } else if (((Double) i[83]).doubleValue() > 8.89) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N72b9dc7981(Object []i) {
	    double p = Double.NaN;
	    if (i[80] == null) {
	      p = 1;
	    } else if (((Double) i[80]).doubleValue() <= 8.73) {
	      p = 1;
	    } else if (((Double) i[80]).doubleValue() > 8.73) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N839c6c782(Object []i) {
	    double p = Double.NaN;
	    if (i[84] == null) {
	      p = 0;
	    } else if (((Double) i[84]).doubleValue() <= 1.23) {
	    p = BumpSenseClassifier_6.N929370983(i);
	    } else if (((Double) i[84]).doubleValue() > 1.23) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N929370983(Object []i) {
	    double p = Double.NaN;
	    if (i[81] == null) {
	      p = 0;
	    } else if (((Double) i[81]).doubleValue() <= 0.61) {
	    p = BumpSenseClassifier_6.N70dc349184(i);
	    } else if (((Double) i[81]).doubleValue() > 0.61) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N70dc349184(Object []i) {
	    double p = Double.NaN;
	    if (i[68] == null) {
	      p = 0;
	    } else if (((Double) i[68]).doubleValue() <= 9.2) {
	    p = BumpSenseClassifier_6.N8ff557a85(i);
	    } else if (((Double) i[68]).doubleValue() > 9.2) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N8ff557a85(Object []i) {
	    double p = Double.NaN;
	    if (i[38] == null) {
	      p = 0;
	    } else if (((Double) i[38]).doubleValue() <= 8.9) {
	    p = BumpSenseClassifier_6.N3344c13386(i);
	    } else if (((Double) i[38]).doubleValue() > 8.9) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3344c13386(Object []i) {
	    double p = Double.NaN;
	    if (i[16] == null) {
	      p = 1;
	    } else if (((Double) i[16]).doubleValue() <= 2.8) {
	      p = 1;
	    } else if (((Double) i[16]).doubleValue() > 2.8) {
	    p = BumpSenseClassifier_6.N66e8159087(i);
	    } 
	    return p;
	  }
	  static double N66e8159087(Object []i) {
	    double p = Double.NaN;
	    if (i[74] == null) {
	      p = 1;
	    } else if (((Double) i[74]).doubleValue() <= 8.2) {
	    p = BumpSenseClassifier_6.Nedfd5b888(i);
	    } else if (((Double) i[74]).doubleValue() > 8.2) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double Nedfd5b888(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 7.8) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > 7.8) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class BumpSenseClassifier_7 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseClassifier_7.N9482aa989(i);
	    return p;
	  }
	  static double N9482aa989(Object []i) {
	    double p = Double.NaN;
	    if (i[41] == null) {
	      p = 1;
	    } else if (((Double) i[41]).doubleValue() <= 9.7) {
	    p = BumpSenseClassifier_7.N60e8c20190(i);
	    } else if (((Double) i[41]).doubleValue() > 9.7) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N60e8c20190(Object []i) {
	    double p = Double.NaN;
	    if (i[65] == null) {
	      p = 1;
	    } else if (((Double) i[65]).doubleValue() <= 9.7) {
	    p = BumpSenseClassifier_7.N5119015b91(i);
	    } else if (((Double) i[65]).doubleValue() > 9.7) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5119015b91(Object []i) {
	    double p = Double.NaN;
	    if (i[63] == null) {
	      p = 0;
	    } else if (((Double) i[63]).doubleValue() <= 0.4) {
	    p = BumpSenseClassifier_7.N40a826f592(i);
	    } else if (((Double) i[63]).doubleValue() > 0.4) {
	    p = BumpSenseClassifier_7.N5750754499(i);
	    } 
	    return p;
	  }
	  static double N40a826f592(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= 9.0) {
	    p = BumpSenseClassifier_7.N5f95bffc93(i);
	    } else if (((Double) i[11]).doubleValue() > 9.0) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5f95bffc93(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 0.3) {
	    p = BumpSenseClassifier_7.N606f6a6a94(i);
	    } else if (((Double) i[0]).doubleValue() > 0.3) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N606f6a6a94(Object []i) {
	    double p = Double.NaN;
	    if (i[62] == null) {
	      p = 1;
	    } else if (((Double) i[62]).doubleValue() <= 9.1) {
	    p = BumpSenseClassifier_7.N32b3869c95(i);
	    } else if (((Double) i[62]).doubleValue() > 9.1) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N32b3869c95(Object []i) {
	    double p = Double.NaN;
	    if (i[76] == null) {
	      p = 0;
	    } else if (((Double) i[76]).doubleValue() <= -5.52) {
	      p = 0;
	    } else if (((Double) i[76]).doubleValue() > -5.52) {
	    p = BumpSenseClassifier_7.N284a85c596(i);
	    } 
	    return p;
	  }
	  static double N284a85c596(Object []i) {
	    double p = Double.NaN;
	    if (i[47] == null) {
	      p = 1;
	    } else if (((Double) i[47]).doubleValue() <= 8.6) {
	    p = BumpSenseClassifier_7.N34945d2d97(i);
	    } else if (((Double) i[47]).doubleValue() > 8.6) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N34945d2d97(Object []i) {
	    double p = Double.NaN;
	    if (i[28] == null) {
	      p = 0;
	    } else if (((Double) i[28]).doubleValue() <= 3.0) {
	      p = 0;
	    } else if (((Double) i[28]).doubleValue() > 3.0) {
	    p = BumpSenseClassifier_7.N7871505298(i);
	    } 
	    return p;
	  }
	  static double N7871505298(Object []i) {
	    double p = Double.NaN;
	    if (i[39] == null) {
	      p = 1;
	    } else if (((Double) i[39]).doubleValue() <= -0.1) {
	      p = 1;
	    } else if (((Double) i[39]).doubleValue() > -0.1) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5750754499(Object []i) {
	    double p = Double.NaN;
	    if (i[79] == null) {
	      p = 1;
	    } else if (((Double) i[79]).doubleValue() <= -2.76) {
	    p = BumpSenseClassifier_7.N6342f024100(i);
	    } else if (((Double) i[79]).doubleValue() > -2.76) {
	    p = BumpSenseClassifier_7.N2792b987102(i);
	    } 
	    return p;
	  }
	  static double N6342f024100(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= 8.4) {
	    p = BumpSenseClassifier_7.N3fa3fe65101(i);
	    } else if (((Double) i[8]).doubleValue() > 8.4) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3fa3fe65101(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= 4.5) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() > 4.5) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2792b987102(Object []i) {
	    double p = Double.NaN;
	    if (i[19] == null) {
	      p = 0;
	    } else if (((Double) i[19]).doubleValue() <= 5.0) {
	      p = 0;
	    } else if (((Double) i[19]).doubleValue() > 5.0) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class BumpSenseClassifier_8 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseClassifier_8.N11d2625d103(i);
	    return p;
	  }
	  static double N11d2625d103(Object []i) {
	    double p = Double.NaN;
	    if (i[36] == null) {
	      p = 0;
	    } else if (((Double) i[36]).doubleValue() <= -0.2) {
	    p = BumpSenseClassifier_8.Nb37d0cf104(i);
	    } else if (((Double) i[36]).doubleValue() > -0.2) {
	    p = BumpSenseClassifier_8.N1235047f109(i);
	    } 
	    return p;
	  }
	  static double Nb37d0cf104(Object []i) {
	    double p = Double.NaN;
	    if (i[32] == null) {
	      p = 0;
	    } else if (((Double) i[32]).doubleValue() <= 9.1) {
	    p = BumpSenseClassifier_8.N7d6dcbc9105(i);
	    } else if (((Double) i[32]).doubleValue() > 9.1) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7d6dcbc9105(Object []i) {
	    double p = Double.NaN;
	    if (i[62] == null) {
	      p = 0;
	    } else if (((Double) i[62]).doubleValue() <= 9.1) {
	    p = BumpSenseClassifier_8.N335e3974106(i);
	    } else if (((Double) i[62]).doubleValue() > 9.1) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N335e3974106(Object []i) {
	    double p = Double.NaN;
	    if (i[87] == null) {
	      p = 0;
	    } else if (((Double) i[87]).doubleValue() <= 0.31) {
	    p = BumpSenseClassifier_8.N6f0e0904107(i);
	    } else if (((Double) i[87]).doubleValue() > 0.31) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6f0e0904107(Object []i) {
	    double p = Double.NaN;
	    if (i[87] == null) {
	      p = 0;
	    } else if (((Double) i[87]).doubleValue() <= 0.15) {
	    p = BumpSenseClassifier_8.N2721e92108(i);
	    } else if (((Double) i[87]).doubleValue() > 0.15) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N2721e92108(Object []i) {
	    double p = Double.NaN;
	    if (i[80] == null) {
	      p = 1;
	    } else if (((Double) i[80]).doubleValue() <= 9.19) {
	      p = 1;
	    } else if (((Double) i[80]).doubleValue() > 9.19) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N1235047f109(Object []i) {
	    double p = Double.NaN;
	    if (i[13] == null) {
	      p = 1;
	    } else if (((Double) i[13]).doubleValue() <= 5.0) {
	    p = BumpSenseClassifier_8.N56ba372f110(i);
	    } else if (((Double) i[13]).doubleValue() > 5.0) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N56ba372f110(Object []i) {
	    double p = Double.NaN;
	    if (i[50] == null) {
	      p = 0;
	    } else if (((Double) i[50]).doubleValue() <= 7.7) {
	      p = 0;
	    } else if (((Double) i[50]).doubleValue() > 7.7) {
	    p = BumpSenseClassifier_8.N5b7d1b24111(i);
	    } 
	    return p;
	  }
	  static double N5b7d1b24111(Object []i) {
	    double p = Double.NaN;
	    if (i[35] == null) {
	      p = 0;
	    } else if (((Double) i[35]).doubleValue() <= 7.6) {
	      p = 0;
	    } else if (((Double) i[35]).doubleValue() > 7.6) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class BumpSenseClassifier_9 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseClassifier_9.N72810768112(i);
	    return p;
	  }
	  static double N72810768112(Object []i) {
	    double p = Double.NaN;
	    if (i[55] == null) {
	      p = 0;
	    } else if (((Double) i[55]).doubleValue() <= 5.3) {
	    p = BumpSenseClassifier_9.N750d7792113(i);
	    } else if (((Double) i[55]).doubleValue() > 5.3) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N750d7792113(Object []i) {
	    double p = Double.NaN;
	    if (i[71] == null) {
	      p = 0;
	    } else if (((Double) i[71]).doubleValue() <= 7.7) {
	      p = 0;
	    } else if (((Double) i[71]).doubleValue() > 7.7) {
	    p = BumpSenseClassifier_9.N47254e47114(i);
	    } 
	    return p;
	  }
	  static double N47254e47114(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 7.6) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > 7.6) {
	    p = BumpSenseClassifier_9.N62363bce115(i);
	    } 
	    return p;
	  }
	  static double N62363bce115(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 9.5) {
	    p = BumpSenseClassifier_9.N569083c1116(i);
	    } else if (((Double) i[2]).doubleValue() > 9.5) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N569083c1116(Object []i) {
	    double p = Double.NaN;
	    if (i[59] == null) {
	      p = 0;
	    } else if (((Double) i[59]).doubleValue() <= 7.6) {
	      p = 0;
	    } else if (((Double) i[59]).doubleValue() > 7.6) {
	    p = BumpSenseClassifier_9.N29ba204d117(i);
	    } 
	    return p;
	  }
	  static double N29ba204d117(Object []i) {
	    double p = Double.NaN;
	    if (i[16] == null) {
	      p = 0;
	    } else if (((Double) i[16]).doubleValue() <= 4.5) {
	    p = BumpSenseClassifier_9.N7a9eb4a1118(i);
	    } else if (((Double) i[16]).doubleValue() > 4.5) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N7a9eb4a1118(Object []i) {
	    double p = Double.NaN;
	    if (i[87] == null) {
	      p = 1;
	    } else if (((Double) i[87]).doubleValue() <= -1.38) {
	      p = 1;
	    } else if (((Double) i[87]).doubleValue() > -1.38) {
	    p = BumpSenseClassifier_9.N4964f4eb119(i);
	    } 
	    return p;
	  }
	  static double N4964f4eb119(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 0;
	    } else if (((Double) i[89]).doubleValue() <= 9.81) {
	    p = BumpSenseClassifier_9.N30b95f2120(i);
	    } else if (((Double) i[89]).doubleValue() > 9.81) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N30b95f2120(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= 8.0) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() > 8.0) {
	    p = BumpSenseClassifier_9.N6da1446d121(i);
	    } 
	    return p;
	  }
	  static double N6da1446d121(Object []i) {
	    double p = Double.NaN;
	    if (i[62] == null) {
	      p = 1;
	    } else if (((Double) i[62]).doubleValue() <= 8.3) {
	      p = 1;
	    } else if (((Double) i[62]).doubleValue() > 8.3) {
	    p = BumpSenseClassifier_9.N76938855122(i);
	    } 
	    return p;
	  }
	  static double N76938855122(Object []i) {
	    double p = Double.NaN;
	    if (i[35] == null) {
	      p = 0;
	    } else if (((Double) i[35]).doubleValue() <= 8.3) {
	      p = 0;
	    } else if (((Double) i[35]).doubleValue() > 8.3) {
	    p = BumpSenseClassifier_9.N4fdbc144123(i);
	    } 
	    return p;
	  }
	  static double N4fdbc144123(Object []i) {
	    double p = Double.NaN;
	    if (i[59] == null) {
	      p = 1;
	    } else if (((Double) i[59]).doubleValue() <= 8.4) {
	      p = 1;
	    } else if (((Double) i[59]).doubleValue() > 8.4) {
	    p = BumpSenseClassifier_9.N646d8051124(i);
	    } 
	    return p;
	  }
	  static double N646d8051124(Object []i) {
	    double p = Double.NaN;
	    if (i[26] == null) {
	      p = 0;
	    } else if (((Double) i[26]).doubleValue() <= 8.4) {
	      p = 0;
	    } else if (((Double) i[26]).doubleValue() > 8.4) {
	    p = BumpSenseClassifier_9.N51037959125(i);
	    } 
	    return p;
	  }
	  static double N51037959125(Object []i) {
	    double p = Double.NaN;
	    if (i[85] == null) {
	      p = 0;
	    } else if (((Double) i[85]).doubleValue() <= -2.6) {
	    p = BumpSenseClassifier_9.N3b13eb9c126(i);
	    } else if (((Double) i[85]).doubleValue() > -2.6) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3b13eb9c126(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 0;
	    } else if (((Double) i[89]).doubleValue() <= 9.04) {
	    p = BumpSenseClassifier_9.N18d16d11127(i);
	    } else if (((Double) i[89]).doubleValue() > 9.04) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N18d16d11127(Object []i) {
	    double p = Double.NaN;
	    if (i[82] == null) {
	      p = 1;
	    } else if (((Double) i[82]).doubleValue() <= -3.52) {
	      p = 1;
	    } else if (((Double) i[82]).doubleValue() > -3.52) {
	      p = 0;
	    } 
	    return p;
	  }
	}

//public class BumpSenseClassifier {
//
//	  public static double classify(Object[] i) throws Exception {
//	    double [] sums = new double [2];
//	    sums[(int) BumpSenseClassifier_0.classify(i)] += 2.935107651737554;
//	    sums[(int) BumpSenseClassifier_1.classify(i)] += 2.849880396541429;
//	    sums[(int) BumpSenseClassifier_2.classify(i)] += 2.8554630532947667;
//	    sums[(int) BumpSenseClassifier_3.classify(i)] += 2.394118737859639;
//	    sums[(int) BumpSenseClassifier_4.classify(i)] += 2.604032568773023;
//	    sums[(int) BumpSenseClassifier_5.classify(i)] += 2.7311040625937495;
//	    sums[(int) BumpSenseClassifier_6.classify(i)] += 3.7111350184107987;
//	    sums[(int) BumpSenseClassifier_7.classify(i)] += 2.830403762933461;
//	    sums[(int) BumpSenseClassifier_8.classify(i)] += 2.0668968226841486;
//	    sums[(int) BumpSenseClassifier_9.classify(i)] += 2.9452956528403464;
//	    double maxV = sums[0];
//	    int maxI = 0;
//	    for (int j = 1; j < 2; j++) {
//	      if (sums[j] > maxV) { maxV = sums[j]; maxI = j; }
//	    }
//	    return (double) maxI;
//	  }
//	}
//	class BumpSenseClassifier_0 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = BumpSenseClassifier_0.N5deda8b3812(i);
//	    return p;
//	  }
//	  static double N5deda8b3812(Object []i) {
//	    double p = Double.NaN;
//	    if (i[74] == null) {
//	      p = 1;
//	    } else if (((Double) i[74]).doubleValue() <= 6.44) {
//	      p = 1;
//	    } else if (((Double) i[74]).doubleValue() > 6.44) {
//	    p = BumpSenseClassifier_0.N1ddeaff2813(i);
//	    } 
//	    return p;
//	  }
//	  static double N1ddeaff2813(Object []i) {
//	    double p = Double.NaN;
//	    if (i[31] == null) {
//	      p = 0;
//	    } else if (((Double) i[31]).doubleValue() <= 3.7) {
//	      p = 0;
//	    } else if (((Double) i[31]).doubleValue() > 3.7) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	}
//	class BumpSenseClassifier_1 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = BumpSenseClassifier_1.N6f14830814(i);
//	    return p;
//	  }
//	  static double N6f14830814(Object []i) {
//	    double p = Double.NaN;
//	    if (i[64] == null) {
//	      p = 1;
//	    } else if (((Double) i[64]).doubleValue() <= -3.83) {
//	    p = BumpSenseClassifier_1.N4aba4adf815(i);
//	    } else if (((Double) i[64]).doubleValue() > -3.83) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	  static double N4aba4adf815(Object []i) {
//	    double p = Double.NaN;
//	    if (i[5] == null) {
//	      p = 1;
//	    } else if (((Double) i[5]).doubleValue() <= 11.1) {
//	    p = BumpSenseClassifier_1.Nc899ccd816(i);
//	    } else if (((Double) i[5]).doubleValue() > 11.1) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	  static double Nc899ccd816(Object []i) {
//	    double p = Double.NaN;
//	    if (i[64] == null) {
//	      p = 1;
//	    } else if (((Double) i[64]).doubleValue() <= -7.51) {
//	      p = 1;
//	    } else if (((Double) i[64]).doubleValue() > -7.51) {
//	    p = BumpSenseClassifier_1.N1e955d29817(i);
//	    } 
//	    return p;
//	  }
//	  static double N1e955d29817(Object []i) {
//	    double p = Double.NaN;
//	    if (i[61] == null) {
//	      p = 0;
//	    } else if (((Double) i[61]).doubleValue() <= -4.44) {
//	      p = 0;
//	    } else if (((Double) i[61]).doubleValue() > -4.44) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	}
//	class BumpSenseClassifier_2 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = BumpSenseClassifier_2.N60173e6e818(i);
//	    return p;
//	  }
//	  static double N60173e6e818(Object []i) {
//	    double p = Double.NaN;
//	    if (i[68] == null) {
//	      p = 1;
//	    } else if (((Double) i[68]).doubleValue() <= 7.97) {
//	      p = 1;
//	    } else if (((Double) i[68]).doubleValue() > 7.97) {
//	    p = BumpSenseClassifier_2.N1603d90b819(i);
//	    } 
//	    return p;
//	  }
//	  static double N1603d90b819(Object []i) {
//	    double p = Double.NaN;
//	    if (i[89] == null) {
//	      p = 1;
//	    } else if (((Double) i[89]).doubleValue() <= 7.66) {
//	      p = 1;
//	    } else if (((Double) i[89]).doubleValue() > 7.66) {
//	    p = BumpSenseClassifier_2.N569e6c77820(i);
//	    } 
//	    return p;
//	  }
//	  static double N569e6c77820(Object []i) {
//	    double p = Double.NaN;
//	    if (i[59] == null) {
//	      p = 0;
//	    } else if (((Double) i[59]).doubleValue() <= 10.2) {
//	    p = BumpSenseClassifier_2.N3ae3250e821(i);
//	    } else if (((Double) i[59]).doubleValue() > 10.2) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N3ae3250e821(Object []i) {
//	    double p = Double.NaN;
//	    if (i[9] == null) {
//	      p = 1;
//	    } else if (((Double) i[9]).doubleValue() <= -1.6) {
//	      p = 1;
//	    } else if (((Double) i[9]).doubleValue() > -1.6) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	}
//	class BumpSenseClassifier_3 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = BumpSenseClassifier_3.N1695d856822(i);
//	    return p;
//	  }
//	  static double N1695d856822(Object []i) {
//	    double p = Double.NaN;
//	    if (i[86] == null) {
//	      p = 1;
//	    } else if (((Double) i[86]).doubleValue() <= 5.52) {
//	      p = 1;
//	    } else if (((Double) i[86]).doubleValue() > 5.52) {
//	    p = BumpSenseClassifier_3.N47ae01af823(i);
//	    } 
//	    return p;
//	  }
//	  static double N47ae01af823(Object []i) {
//	    double p = Double.NaN;
//	    if (i[40] == null) {
//	      p = 0;
//	    } else if (((Double) i[40]).doubleValue() <= 4.1) {
//	    p = BumpSenseClassifier_3.N70f0acec824(i);
//	    } else if (((Double) i[40]).doubleValue() > 4.1) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N70f0acec824(Object []i) {
//	    double p = Double.NaN;
//	    if (i[50] == null) {
//	      p = 0;
//	    } else if (((Double) i[50]).doubleValue() <= 10.0) {
//	    p = BumpSenseClassifier_3.N48e8f3e1825(i);
//	    } else if (((Double) i[50]).doubleValue() > 10.0) {
//	    p = BumpSenseClassifier_3.N623bb657827(i);
//	    } 
//	    return p;
//	  }
//	  static double N48e8f3e1825(Object []i) {
//	    double p = Double.NaN;
//	    if (i[59] == null) {
//	      p = 0;
//	    } else if (((Double) i[59]).doubleValue() <= 8.9) {
//	      p = 0;
//	    } else if (((Double) i[59]).doubleValue() > 8.9) {
//	    p = BumpSenseClassifier_3.N35e35e2c826(i);
//	    } 
//	    return p;
//	  }
//	  static double N35e35e2c826(Object []i) {
//	    double p = Double.NaN;
//	    if (i[1] == null) {
//	      p = 0;
//	    } else if (((Double) i[1]).doubleValue() <= 1.7) {
//	      p = 0;
//	    } else if (((Double) i[1]).doubleValue() > 1.7) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N623bb657827(Object []i) {
//	    double p = Double.NaN;
//	    if (i[11] == null) {
//	      p = 0;
//	    } else if (((Double) i[11]).doubleValue() <= 6.9) {
//	      p = 0;
//	    } else if (((Double) i[11]).doubleValue() > 6.9) {
//	    p = BumpSenseClassifier_3.N3e403c23828(i);
//	    } 
//	    return p;
//	  }
//	  static double N3e403c23828(Object []i) {
//	    double p = Double.NaN;
//	    if (i[21] == null) {
//	      p = 0;
//	    } else if (((Double) i[21]).doubleValue() <= 0.4) {
//	      p = 0;
//	    } else if (((Double) i[21]).doubleValue() > 0.4) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	}
//	class BumpSenseClassifier_4 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = BumpSenseClassifier_4.N6b2c3dc2829(i);
//	    return p;
//	  }
//	  static double N6b2c3dc2829(Object []i) {
//	    double p = Double.NaN;
//	    if (i[77] == null) {
//	      p = 1;
//	    } else if (((Double) i[77]).doubleValue() <= 7.97) {
//	    p = BumpSenseClassifier_4.N258ac286830(i);
//	    } else if (((Double) i[77]).doubleValue() > 7.97) {
//	    p = BumpSenseClassifier_4.N38e8feab831(i);
//	    } 
//	    return p;
//	  }
//	  static double N258ac286830(Object []i) {
//	    double p = Double.NaN;
//	    if (i[2] == null) {
//	      p = 1;
//	    } else if (((Double) i[2]).doubleValue() <= 10.2) {
//	      p = 1;
//	    } else if (((Double) i[2]).doubleValue() > 10.2) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	  static double N38e8feab831(Object []i) {
//	    double p = Double.NaN;
//	    if (i[56] == null) {
//	      p = 0;
//	    } else if (((Double) i[56]).doubleValue() <= 9.9) {
//	      p = 0;
//	    } else if (((Double) i[56]).doubleValue() > 9.9) {
//	    p = BumpSenseClassifier_4.N48a7a9bd832(i);
//	    } 
//	    return p;
//	  }
//	  static double N48a7a9bd832(Object []i) {
//	    double p = Double.NaN;
//	    if (i[58] == null) {
//	      p = 0;
//	    } else if (((Double) i[58]).doubleValue() <= 1.9) {
//	      p = 0;
//	    } else if (((Double) i[58]).doubleValue() > 1.9) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	}
//	class BumpSenseClassifier_5 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = BumpSenseClassifier_5.N7778dc8e833(i);
//	    return p;
//	  }
//	  static double N7778dc8e833(Object []i) {
//	    double p = Double.NaN;
//	    if (i[89] == null) {
//	      p = 1;
//	    } else if (((Double) i[89]).doubleValue() <= 6.13) {
//	      p = 1;
//	    } else if (((Double) i[89]).doubleValue() > 6.13) {
//	    p = BumpSenseClassifier_5.N1fd82be9834(i);
//	    } 
//	    return p;
//	  }
//	  static double N1fd82be9834(Object []i) {
//	    double p = Double.NaN;
//	    if (i[77] == null) {
//	      p = 1;
//	    } else if (((Double) i[77]).doubleValue() <= 6.74) {
//	      p = 1;
//	    } else if (((Double) i[77]).doubleValue() > 6.74) {
//	    p = BumpSenseClassifier_5.N292ade54835(i);
//	    } 
//	    return p;
//	  }
//	  static double N292ade54835(Object []i) {
//	    double p = Double.NaN;
//	    if (i[60] == null) {
//	      p = 1;
//	    } else if (((Double) i[60]).doubleValue() <= -2.76) {
//	      p = 1;
//	    } else if (((Double) i[60]).doubleValue() > -2.76) {
//	    p = BumpSenseClassifier_5.N3d6a71e9836(i);
//	    } 
//	    return p;
//	  }
//	  static double N3d6a71e9836(Object []i) {
//	    double p = Double.NaN;
//	    if (i[87] == null) {
//	      p = 0;
//	    } else if (((Double) i[87]).doubleValue() <= 3.37) {
//	    p = BumpSenseClassifier_5.N175c977f837(i);
//	    } else if (((Double) i[87]).doubleValue() > 3.37) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N175c977f837(Object []i) {
//	    double p = Double.NaN;
//	    if (i[53] == null) {
//	      p = 0;
//	    } else if (((Double) i[53]).doubleValue() <= 11.1) {
//	    p = BumpSenseClassifier_5.N3fde1ed4838(i);
//	    } else if (((Double) i[53]).doubleValue() > 11.1) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N3fde1ed4838(Object []i) {
//	    double p = Double.NaN;
//	    if (i[23] == null) {
//	      p = 0;
//	    } else if (((Double) i[23]).doubleValue() <= 8.6) {
//	    p = BumpSenseClassifier_5.Nfba110e839(i);
//	    } else if (((Double) i[23]).doubleValue() > 8.6) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	  static double Nfba110e839(Object []i) {
//	    double p = Double.NaN;
//	    if (i[60] == null) {
//	      p = 0;
//	    } else if (((Double) i[60]).doubleValue() <= 1.38) {
//	      p = 0;
//	    } else if (((Double) i[60]).doubleValue() > 1.38) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	}
//	class BumpSenseClassifier_6 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = BumpSenseClassifier_6.Nb5b633840(i);
//	    return p;
//	  }
//	  static double Nb5b633840(Object []i) {
//	    double p = Double.NaN;
//	    if (i[89] == null) {
//	      p = 1;
//	    } else if (((Double) i[89]).doubleValue() <= 6.28) {
//	      p = 1;
//	    } else if (((Double) i[89]).doubleValue() > 6.28) {
//	    p = BumpSenseClassifier_6.N19cccea2841(i);
//	    } 
//	    return p;
//	  }
//	  static double N19cccea2841(Object []i) {
//	    double p = Double.NaN;
//	    if (i[18] == null) {
//	      p = 1;
//	    } else if (((Double) i[18]).doubleValue() <= -2.0) {
//	      p = 1;
//	    } else if (((Double) i[18]).doubleValue() > -2.0) {
//	    p = BumpSenseClassifier_6.N5511fae9842(i);
//	    } 
//	    return p;
//	  }
//	  static double N5511fae9842(Object []i) {
//	    double p = Double.NaN;
//	    if (i[43] == null) {
//	      p = 0;
//	    } else if (((Double) i[43]).doubleValue() <= 2.5) {
//	    p = BumpSenseClassifier_6.Nf7002a1843(i);
//	    } else if (((Double) i[43]).doubleValue() > 2.5) {
//	    p = BumpSenseClassifier_6.N2da8ca45845(i);
//	    } 
//	    return p;
//	  }
//	  static double Nf7002a1843(Object []i) {
//	    double p = Double.NaN;
//	    if (i[69] == null) {
//	      p = 0;
//	    } else if (((Double) i[69]).doubleValue() <= -0.15) {
//	    p = BumpSenseClassifier_6.N2bc9ff2844(i);
//	    } else if (((Double) i[69]).doubleValue() > -0.15) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	  static double N2bc9ff2844(Object []i) {
//	    double p = Double.NaN;
//	    if (i[2] == null) {
//	      p = 0;
//	    } else if (((Double) i[2]).doubleValue() <= 9.5) {
//	      p = 0;
//	    } else if (((Double) i[2]).doubleValue() > 9.5) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N2da8ca45845(Object []i) {
//	    double p = Double.NaN;
//	    if (i[64] == null) {
//	      p = 1;
//	    } else if (((Double) i[64]).doubleValue() <= -3.83) {
//	      p = 1;
//	    } else if (((Double) i[64]).doubleValue() > -3.83) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	}
//	class BumpSenseClassifier_7 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = BumpSenseClassifier_7.N24778f6e846(i);
//	    return p;
//	  }
//	  static double N24778f6e846(Object []i) {
//	    double p = Double.NaN;
//	    if (i[68] == null) {
//	      p = 1;
//	    } else if (((Double) i[68]).doubleValue() <= 5.36) {
//	      p = 1;
//	    } else if (((Double) i[68]).doubleValue() > 5.36) {
//	    p = BumpSenseClassifier_7.N25699176847(i);
//	    } 
//	    return p;
//	  }
//	  static double N25699176847(Object []i) {
//	    double p = Double.NaN;
//	    if (i[89] == null) {
//	      p = 1;
//	    } else if (((Double) i[89]).doubleValue() <= 6.13) {
//	      p = 1;
//	    } else if (((Double) i[89]).doubleValue() > 6.13) {
//	    p = BumpSenseClassifier_7.N35cced2a848(i);
//	    } 
//	    return p;
//	  }
//	  static double N35cced2a848(Object []i) {
//	    double p = Double.NaN;
//	    if (i[5] == null) {
//	      p = 1;
//	    } else if (((Double) i[5]).doubleValue() <= 3.8) {
//	      p = 1;
//	    } else if (((Double) i[5]).doubleValue() > 3.8) {
//	    p = BumpSenseClassifier_7.N20e67bfe849(i);
//	    } 
//	    return p;
//	  }
//	  static double N20e67bfe849(Object []i) {
//	    double p = Double.NaN;
//	    if (i[59] == null) {
//	      p = 0;
//	    } else if (((Double) i[59]).doubleValue() <= 10.2) {
//	      p = 0;
//	    } else if (((Double) i[59]).doubleValue() > 10.2) {
//	    p = BumpSenseClassifier_7.N7bd67191850(i);
//	    } 
//	    return p;
//	  }
//	  static double N7bd67191850(Object []i) {
//	    double p = Double.NaN;
//	    if (i[2] == null) {
//	      p = 0;
//	    } else if (((Double) i[2]).doubleValue() <= 8.9) {
//	      p = 0;
//	    } else if (((Double) i[2]).doubleValue() > 8.9) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	}
//	class BumpSenseClassifier_8 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = BumpSenseClassifier_8.N3bba261b851(i);
//	    return p;
//	  }
//	  static double N3bba261b851(Object []i) {
//	    double p = Double.NaN;
//	    if (i[49] == null) {
//	      p = 0;
//	    } else if (((Double) i[49]).doubleValue() <= 3.2) {
//	    p = BumpSenseClassifier_8.N3a1bd53f852(i);
//	    } else if (((Double) i[49]).doubleValue() > 3.2) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N3a1bd53f852(Object []i) {
//	    double p = Double.NaN;
//	    if (i[75] == null) {
//	      p = 0;
//	    } else if (((Double) i[75]).doubleValue() <= 3.06) {
//	    p = BumpSenseClassifier_8.N794d38e6853(i);
//	    } else if (((Double) i[75]).doubleValue() > 3.06) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N794d38e6853(Object []i) {
//	    double p = Double.NaN;
//	    if (i[60] == null) {
//	      p = 1;
//	    } else if (((Double) i[60]).doubleValue() <= -2.76) {
//	      p = 1;
//	    } else if (((Double) i[60]).doubleValue() > -2.76) {
//	    p = BumpSenseClassifier_8.N3cd2c241854(i);
//	    } 
//	    return p;
//	  }
//	  static double N3cd2c241854(Object []i) {
//	    double p = Double.NaN;
//	    if (i[71] == null) {
//	      p = 1;
//	    } else if (((Double) i[71]).doubleValue() <= 4.9) {
//	      p = 1;
//	    } else if (((Double) i[71]).doubleValue() > 4.9) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	}
//	class BumpSenseClassifier_9 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = BumpSenseClassifier_9.N30cf5899855(i);
//	    return p;
//	  }
//	  static double N30cf5899855(Object []i) {
//	    double p = Double.NaN;
//	    if (i[77] == null) {
//	      p = 1;
//	    } else if (((Double) i[77]).doubleValue() <= 6.74) {
//	      p = 1;
//	    } else if (((Double) i[77]).doubleValue() > 6.74) {
//	    p = BumpSenseClassifier_9.N7cc1bdd7856(i);
//	    } 
//	    return p;
//	  }
//	  static double N7cc1bdd7856(Object []i) {
//	    double p = Double.NaN;
//	    if (i[29] == null) {
//	      p = 1;
//	    } else if (((Double) i[29]).doubleValue() <= 9.5) {
//	    p = BumpSenseClassifier_9.N1396ae3e857(i);
//	    } else if (((Double) i[29]).doubleValue() > 9.5) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	  static double N1396ae3e857(Object []i) {
//	    double p = Double.NaN;
//	    if (i[70] == null) {
//	      p = 1;
//	    } else if (((Double) i[70]).doubleValue() <= -3.52) {
//	    p = BumpSenseClassifier_9.N989727e858(i);
//	    } else if (((Double) i[70]).doubleValue() > -3.52) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	  static double N989727e858(Object []i) {
//	    double p = Double.NaN;
//	    if (i[88] == null) {
//	      p = 0;
//	    } else if (((Double) i[88]).doubleValue() <= -4.6) {
//	    p = BumpSenseClassifier_9.N1ebbb316859(i);
//	    } else if (((Double) i[88]).doubleValue() > -4.6) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N1ebbb316859(Object []i) {
//	    double p = Double.NaN;
//	    if (i[29] == null) {
//	      p = 1;
//	    } else if (((Double) i[29]).doubleValue() <= 8.1) {
//	      p = 1;
//	    } else if (((Double) i[29]).doubleValue() > 8.1) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	}