package me.xiangchen.technique.handsense;

public class HandSenseClassifier {

	  public static double classify(Object[] i) throws Exception {
	    double [] sums = new double [2];
	    sums[(int) HandSenseClassifier_0.classify(i)] += 2.834682852035576;
	    sums[(int) HandSenseClassifier_1.classify(i)] += 2.6246922149544325;
	    sums[(int) HandSenseClassifier_2.classify(i)] += 2.557686960284126;
	    sums[(int) HandSenseClassifier_3.classify(i)] += 3.241549253883647;
	    sums[(int) HandSenseClassifier_4.classify(i)] += 2.638157691796589;
	    sums[(int) HandSenseClassifier_5.classify(i)] += 3.1306206338170517;
	    sums[(int) HandSenseClassifier_6.classify(i)] += 2.7783054156061806;
	    sums[(int) HandSenseClassifier_7.classify(i)] += 2.425264768142218;
	    sums[(int) HandSenseClassifier_8.classify(i)] += 2.804807128860358;
	    sums[(int) HandSenseClassifier_9.classify(i)] += 2.379572115253225;
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
	    p = HandSenseClassifier_0.N12b4bc93703(i);
	    return p;
	  }
	  static double N12b4bc93703(Object []i) {
	    double p = Double.NaN;
	    if (i[87] == null) {
	      p = 0;
	    } else if (((Double) i[87]).doubleValue() <= 0.58) {
	    p = HandSenseClassifier_0.N17c8607d704(i);
	    } else if (((Double) i[87]).doubleValue() > 0.58) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N17c8607d704(Object []i) {
	    double p = Double.NaN;
	    if (i[107] == null) {
	      p = 1;
	    } else if (((Double) i[107]).doubleValue() <= -8.12) {
	      p = 1;
	    } else if (((Double) i[107]).doubleValue() > -8.12) {
	    p = HandSenseClassifier_0.N6436babd705(i);
	    } 
	    return p;
	  }
	  static double N6436babd705(Object []i) {
	    double p = Double.NaN;
	    if (i[96] == null) {
	      p = 0;
	    } else if (((Double) i[96]).doubleValue() <= 2.15) {
	      p = 0;
	    } else if (((Double) i[96]).doubleValue() > 2.15) {
	    p = HandSenseClassifier_0.N451e01b1706(i);
	    } 
	    return p;
	  }
	  static double N451e01b1706(Object []i) {
	    double p = Double.NaN;
	    if (i[107] == null) {
	      p = 1;
	    } else if (((Double) i[107]).doubleValue() <= -3.37) {
	      p = 1;
	    } else if (((Double) i[107]).doubleValue() > -3.37) {
	    p = HandSenseClassifier_0.N35012eea707(i);
	    } 
	    return p;
	  }
	  static double N35012eea707(Object []i) {
	    double p = Double.NaN;
	    if (i[87] == null) {
	      p = 0;
	    } else if (((Double) i[87]).doubleValue() <= 0.13) {
	      p = 0;
	    } else if (((Double) i[87]).doubleValue() > 0.13) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_1 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_1.N60af1fd5708(i);
	    return p;
	  }
	  static double N60af1fd5708(Object []i) {
	    double p = Double.NaN;
	    if (i[103] == null) {
	      p = 0;
	    } else if (((Double) i[103]).doubleValue() <= -7.97) {
	      p = 0;
	    } else if (((Double) i[103]).doubleValue() > -7.97) {
	    p = HandSenseClassifier_1.N9530a8a709(i);
	    } 
	    return p;
	  }
	  static double N9530a8a709(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= 4.08) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() > 4.08) {
	    p = HandSenseClassifier_1.N2ad8eece710(i);
	    } 
	    return p;
	  }
	  static double N2ad8eece710(Object []i) {
	    double p = Double.NaN;
	    if (i[96] == null) {
	      p = 1;
	    } else if (((Double) i[96]).doubleValue() <= 5.82) {
	    p = HandSenseClassifier_1.N8262c5c711(i);
	    } else if (((Double) i[96]).doubleValue() > 5.82) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N8262c5c711(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= -1.06) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > -1.06) {
	    p = HandSenseClassifier_1.N22a5032712(i);
	    } 
	    return p;
	  }
	  static double N22a5032712(Object []i) {
	    double p = Double.NaN;
	    if (i[79] == null) {
	      p = 0;
	    } else if (((Double) i[79]).doubleValue() <= 0.79) {
	      p = 0;
	    } else if (((Double) i[79]).doubleValue() > 0.79) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_2 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_2.N27f703ba713(i);
	    return p;
	  }
	  static double N27f703ba713(Object []i) {
	    double p = Double.NaN;
	    if (i[42] == null) {
	      p = 0;
	    } else if (((Double) i[42]).doubleValue() <= 0.7) {
	    p = HandSenseClassifier_2.N4a15bcd5714(i);
	    } else if (((Double) i[42]).doubleValue() > 0.7) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N4a15bcd5714(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() <= 2.6) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() > 2.6) {
	    p = HandSenseClassifier_2.N592069f2715(i);
	    } 
	    return p;
	  }
	  static double N592069f2715(Object []i) {
	    double p = Double.NaN;
	    if (i[107] == null) {
	      p = 0;
	    } else if (((Double) i[107]).doubleValue() <= 7.81) {
	    p = HandSenseClassifier_2.N5f0bbc94716(i);
	    } else if (((Double) i[107]).doubleValue() > 7.81) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5f0bbc94716(Object []i) {
	    double p = Double.NaN;
	    if (i[95] == null) {
	      p = 0;
	    } else if (((Double) i[95]).doubleValue() <= -5.21) {
	    p = HandSenseClassifier_2.N7b89c94b717(i);
	    } else if (((Double) i[95]).doubleValue() > -5.21) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7b89c94b717(Object []i) {
	    double p = Double.NaN;
	    if (i[20] == null) {
	      p = 1;
	    } else if (((Double) i[20]).doubleValue() <= 9.1) {
	      p = 1;
	    } else if (((Double) i[20]).doubleValue() > 9.1) {
	    p = HandSenseClassifier_2.N12fe9a4a718(i);
	    } 
	    return p;
	  }
	  static double N12fe9a4a718(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() <= 8.89) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() > 8.89) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_3 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_3.N9437a04719(i);
	    return p;
	  }
	  static double N9437a04719(Object []i) {
	    double p = Double.NaN;
	    if (i[63] == null) {
	      p = 0;
	    } else if (((Double) i[63]).doubleValue() <= 0.7) {
	    p = HandSenseClassifier_3.N2cffa15c720(i);
	    } else if (((Double) i[63]).doubleValue() > 0.7) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2cffa15c720(Object []i) {
	    double p = Double.NaN;
	    if (i[44] == null) {
	      p = 0;
	    } else if (((Double) i[44]).doubleValue() <= 9.6) {
	    p = HandSenseClassifier_3.N42bab618721(i);
	    } else if (((Double) i[44]).doubleValue() > 9.6) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N42bab618721(Object []i) {
	    double p = Double.NaN;
	    if (i[103] == null) {
	      p = 0;
	    } else if (((Double) i[103]).doubleValue() <= -6.13) {
	    p = HandSenseClassifier_3.N700903e1722(i);
	    } else if (((Double) i[103]).doubleValue() > -6.13) {
	    p = HandSenseClassifier_3.N5fdde23d723(i);
	    } 
	    return p;
	  }
	  static double N700903e1722(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() <= 5.42) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() > 5.42) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5fdde23d723(Object []i) {
	    double p = Double.NaN;
	    if (i[91] == null) {
	      p = 1;
	    } else if (((Double) i[91]).doubleValue() <= -6.28) {
	      p = 1;
	    } else if (((Double) i[91]).doubleValue() > -6.28) {
	    p = HandSenseClassifier_3.N603043f6724(i);
	    } 
	    return p;
	  }
	  static double N603043f6724(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 8.11) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > 8.11) {
	    p = HandSenseClassifier_3.Nbdfcd0725(i);
	    } 
	    return p;
	  }
	  static double Nbdfcd0725(Object []i) {
	    double p = Double.NaN;
	    if (i[44] == null) {
	      p = 1;
	    } else if (((Double) i[44]).doubleValue() <= 9.12) {
	      p = 1;
	    } else if (((Double) i[44]).doubleValue() > 9.12) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_4 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_4.N3920bc11726(i);
	    return p;
	  }
	  static double N3920bc11726(Object []i) {
	    double p = Double.NaN;
	    if (i[87] == null) {
	      p = 0;
	    } else if (((Double) i[87]).doubleValue() <= -0.53) {
	      p = 0;
	    } else if (((Double) i[87]).doubleValue() > -0.53) {
	    p = HandSenseClassifier_4.N141b1d64727(i);
	    } 
	    return p;
	  }
	  static double N141b1d64727(Object []i) {
	    double p = Double.NaN;
	    if (i[102] == null) {
	      p = 0;
	    } else if (((Double) i[102]).doubleValue() <= -0.92) {
	      p = 0;
	    } else if (((Double) i[102]).doubleValue() > -0.92) {
	    p = HandSenseClassifier_4.N269a8c728(i);
	    } 
	    return p;
	  }
	  static double N269a8c728(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 7.86) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > 7.86) {
	    p = HandSenseClassifier_4.N666c5d67729(i);
	    } 
	    return p;
	  }
	  static double N666c5d67729(Object []i) {
	    double p = Double.NaN;
	    if (i[97] == null) {
	      p = 1;
	    } else if (((Double) i[97]).doubleValue() <= -6.28) {
	    p = HandSenseClassifier_4.N546849b9730(i);
	    } else if (((Double) i[97]).doubleValue() > -6.28) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N546849b9730(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 0.12) {
	    p = HandSenseClassifier_4.Nac03bfa731(i);
	    } else if (((Double) i[0]).doubleValue() > 0.12) {
	    p = HandSenseClassifier_4.N52a19f99732(i);
	    } 
	    return p;
	  }
	  static double Nac03bfa731(Object []i) {
	    double p = Double.NaN;
	    if (i[61] == null) {
	      p = 0;
	    } else if (((Double) i[61]).doubleValue() <= 2.32) {
	      p = 0;
	    } else if (((Double) i[61]).doubleValue() > 2.32) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N52a19f99732(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() <= 8.95) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() > 8.95) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_5 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_5.N70f52030733(i);
	    return p;
	  }
	  static double N70f52030733(Object []i) {
	    double p = Double.NaN;
	    if (i[107] == null) {
	      p = 1;
	    } else if (((Double) i[107]).doubleValue() <= -7.66) {
	      p = 1;
	    } else if (((Double) i[107]).doubleValue() > -7.66) {
	    p = HandSenseClassifier_5.N6d14693f734(i);
	    } 
	    return p;
	  }
	  static double N6d14693f734(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 1;
	    } else if (((Double) i[7]).doubleValue() <= 0.86) {
	      p = 1;
	    } else if (((Double) i[7]).doubleValue() > 0.86) {
	    p = HandSenseClassifier_5.N5709df0b735(i);
	    } 
	    return p;
	  }
	  static double N5709df0b735(Object []i) {
	    double p = Double.NaN;
	    if (i[87] == null) {
	      p = 0;
	    } else if (((Double) i[87]).doubleValue() <= 0.92) {
	    p = HandSenseClassifier_5.N491277d1736(i);
	    } else if (((Double) i[87]).doubleValue() > 0.92) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N491277d1736(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() <= 5.57) {
	    p = HandSenseClassifier_5.N5b785fd1737(i);
	    } else if (((Double) i[89]).doubleValue() > 5.57) {
	    p = HandSenseClassifier_5.N3bdac141738(i);
	    } 
	    return p;
	  }
	  static double N5b785fd1737(Object []i) {
	    double p = Double.NaN;
	    if (i[51] == null) {
	      p = 0;
	    } else if (((Double) i[51]).doubleValue() <= -0.13) {
	      p = 0;
	    } else if (((Double) i[51]).doubleValue() > -0.13) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3bdac141738(Object []i) {
	    double p = Double.NaN;
	    if (i[104] == null) {
	      p = 0;
	    } else if (((Double) i[104]).doubleValue() <= 7.81) {
	    p = HandSenseClassifier_5.N16c5b11a739(i);
	    } else if (((Double) i[104]).doubleValue() > 7.81) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N16c5b11a739(Object []i) {
	    double p = Double.NaN;
	    if (i[72] == null) {
	      p = 0;
	    } else if (((Double) i[72]).doubleValue() <= 0.41) {
	    p = HandSenseClassifier_5.Ncee2da4740(i);
	    } else if (((Double) i[72]).doubleValue() > 0.41) {
	    p = HandSenseClassifier_5.Nb5b8941742(i);
	    } 
	    return p;
	  }
	  static double Ncee2da4740(Object []i) {
	    double p = Double.NaN;
	    if (i[96] == null) {
	      p = 0;
	    } else if (((Double) i[96]).doubleValue() <= 1.38) {
	      p = 0;
	    } else if (((Double) i[96]).doubleValue() > 1.38) {
	    p = HandSenseClassifier_5.N68f6709d741(i);
	    } 
	    return p;
	  }
	  static double N68f6709d741(Object []i) {
	    double p = Double.NaN;
	    if (i[90] == null) {
	      p = 1;
	    } else if (((Double) i[90]).doubleValue() <= 3.52) {
	      p = 1;
	    } else if (((Double) i[90]).doubleValue() > 3.52) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double Nb5b8941742(Object []i) {
	    double p = Double.NaN;
	    if (i[14] == null) {
	      p = 1;
	    } else if (((Double) i[14]).doubleValue() <= 9.42) {
	      p = 1;
	    } else if (((Double) i[14]).doubleValue() > 9.42) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_6 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_6.N2690103a743(i);
	    return p;
	  }
	  static double N2690103a743(Object []i) {
	    double p = Double.NaN;
	    if (i[107] == null) {
	      p = 1;
	    } else if (((Double) i[107]).doubleValue() <= -8.27) {
	      p = 1;
	    } else if (((Double) i[107]).doubleValue() > -8.27) {
	    p = HandSenseClassifier_6.N3c19639d744(i);
	    } 
	    return p;
	  }
	  static double N3c19639d744(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() <= 1.43) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() > 1.43) {
	    p = HandSenseClassifier_6.N26daf73e745(i);
	    } 
	    return p;
	  }
	  static double N26daf73e745(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 0.98) {
	    p = HandSenseClassifier_6.N719e1b5f746(i);
	    } else if (((Double) i[3]).doubleValue() > 0.98) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N719e1b5f746(Object []i) {
	    double p = Double.NaN;
	    if (i[44] == null) {
	      p = 0;
	    } else if (((Double) i[44]).doubleValue() <= 9.52) {
	    p = HandSenseClassifier_6.N4317343f747(i);
	    } else if (((Double) i[44]).doubleValue() > 9.52) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N4317343f747(Object []i) {
	    double p = Double.NaN;
	    if (i[96] == null) {
	      p = 0;
	    } else if (((Double) i[96]).doubleValue() <= 2.76) {
	    p = HandSenseClassifier_6.N28673682748(i);
	    } else if (((Double) i[96]).doubleValue() > 2.76) {
	    p = HandSenseClassifier_6.N21804a5c750(i);
	    } 
	    return p;
	  }
	  static double N28673682748(Object []i) {
	    double p = Double.NaN;
	    if (i[47] == null) {
	      p = 0;
	    } else if (((Double) i[47]).doubleValue() <= 9.37) {
	      p = 0;
	    } else if (((Double) i[47]).doubleValue() > 9.37) {
	    p = HandSenseClassifier_6.N102ba587749(i);
	    } 
	    return p;
	  }
	  static double N102ba587749(Object []i) {
	    double p = Double.NaN;
	    if (i[13] == null) {
	      p = 0;
	    } else if (((Double) i[13]).doubleValue() <= 0.66) {
	      p = 0;
	    } else if (((Double) i[13]).doubleValue() > 0.66) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N21804a5c750(Object []i) {
	    double p = Double.NaN;
	    if (i[75] == null) {
	      p = 0;
	    } else if (((Double) i[75]).doubleValue() <= 0.18) {
	      p = 0;
	    } else if (((Double) i[75]).doubleValue() > 0.18) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_7 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_7.N6d91ef32751(i);
	    return p;
	  }
	  static double N6d91ef32751(Object []i) {
	    double p = Double.NaN;
	    if (i[87] == null) {
	      p = 0;
	    } else if (((Double) i[87]).doubleValue() <= 1.01) {
	    p = HandSenseClassifier_7.N7eef3d1752(i);
	    } else if (((Double) i[87]).doubleValue() > 1.01) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N7eef3d1752(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() <= 7.29) {
	    p = HandSenseClassifier_7.N58c92268753(i);
	    } else if (((Double) i[89]).doubleValue() > 7.29) {
	    p = HandSenseClassifier_7.N75c2b15c755(i);
	    } 
	    return p;
	  }
	  static double N58c92268753(Object []i) {
	    double p = Double.NaN;
	    if (i[103] == null) {
	      p = 0;
	    } else if (((Double) i[103]).doubleValue() <= -8.27) {
	      p = 0;
	    } else if (((Double) i[103]).doubleValue() > -8.27) {
	    p = HandSenseClassifier_7.N7cf20761754(i);
	    } 
	    return p;
	  }
	  static double N7cf20761754(Object []i) {
	    double p = Double.NaN;
	    if (i[94] == null) {
	      p = 1;
	    } else if (((Double) i[94]).doubleValue() <= -6.9) {
	      p = 1;
	    } else if (((Double) i[94]).doubleValue() > -6.9) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N75c2b15c755(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 10.64) {
	    p = HandSenseClassifier_7.N410a4b6a756(i);
	    } else if (((Double) i[5]).doubleValue() > 10.64) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N410a4b6a756(Object []i) {
	    double p = Double.NaN;
	    if (i[17] == null) {
	      p = 0;
	    } else if (((Double) i[17]).doubleValue() <= 8.66) {
	    p = HandSenseClassifier_7.Nadd3d82757(i);
	    } else if (((Double) i[17]).doubleValue() > 8.66) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double Nadd3d82757(Object []i) {
	    double p = Double.NaN;
	    if (i[90] == null) {
	      p = 1;
	    } else if (((Double) i[90]).doubleValue() <= -0.46) {
	      p = 1;
	    } else if (((Double) i[90]).doubleValue() > -0.46) {
	    p = HandSenseClassifier_7.N42f12760758(i);
	    } 
	    return p;
	  }
	  static double N42f12760758(Object []i) {
	    double p = Double.NaN;
	    if (i[96] == null) {
	      p = 0;
	    } else if (((Double) i[96]).doubleValue() <= 2.6) {
	      p = 0;
	    } else if (((Double) i[96]).doubleValue() > 2.6) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_8 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_8.N665031f5759(i);
	    return p;
	  }
	  static double N665031f5759(Object []i) {
	    double p = Double.NaN;
	    if (i[96] == null) {
	      p = 0;
	    } else if (((Double) i[96]).doubleValue() <= -0.92) {
	      p = 0;
	    } else if (((Double) i[96]).doubleValue() > -0.92) {
	    p = HandSenseClassifier_8.N1b00004d760(i);
	    } 
	    return p;
	  }
	  static double N1b00004d760(Object []i) {
	    double p = Double.NaN;
	    if (i[90] == null) {
	      p = 1;
	    } else if (((Double) i[90]).doubleValue() <= 5.21) {
	    p = HandSenseClassifier_8.N1d13cd14761(i);
	    } else if (((Double) i[90]).doubleValue() > 5.21) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N1d13cd14761(Object []i) {
	    double p = Double.NaN;
	    if (i[103] == null) {
	      p = 0;
	    } else if (((Double) i[103]).doubleValue() <= -6.74) {
	    p = HandSenseClassifier_8.N7efceaf5762(i);
	    } else if (((Double) i[103]).doubleValue() > -6.74) {
	    p = HandSenseClassifier_8.Nea5bbf5763(i);
	    } 
	    return p;
	  }
	  static double N7efceaf5762(Object []i) {
	    double p = Double.NaN;
	    if (i[105] == null) {
	      p = 0;
	    } else if (((Double) i[105]).doubleValue() <= 3.98) {
	      p = 0;
	    } else if (((Double) i[105]).doubleValue() > 3.98) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Nea5bbf5763(Object []i) {
	    double p = Double.NaN;
	    if (i[72] == null) {
	      p = 0;
	    } else if (((Double) i[72]).doubleValue() <= -0.41) {
	      p = 0;
	    } else if (((Double) i[72]).doubleValue() > -0.41) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_9 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_9.N22d6d956764(i);
	    return p;
	  }
	  static double N22d6d956764(Object []i) {
	    double p = Double.NaN;
	    if (i[92] == null) {
	      p = 1;
	    } else if (((Double) i[92]).doubleValue() <= -8.43) {
	      p = 1;
	    } else if (((Double) i[92]).doubleValue() > -8.43) {
	    p = HandSenseClassifier_9.N4756aef8765(i);
	    } 
	    return p;
	  }
	  static double N4756aef8765(Object []i) {
	    double p = Double.NaN;
	    if (i[87] == null) {
	      p = 0;
	    } else if (((Double) i[87]).doubleValue() <= 0.71) {
	    p = HandSenseClassifier_9.Nbf9405f766(i);
	    } else if (((Double) i[87]).doubleValue() > 0.71) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Nbf9405f766(Object []i) {
	    double p = Double.NaN;
	    if (i[36] == null) {
	      p = 1;
	    } else if (((Double) i[36]).doubleValue() <= -0.16) {
	    p = HandSenseClassifier_9.N18f1231d767(i);
	    } else if (((Double) i[36]).doubleValue() > -0.16) {
	    p = HandSenseClassifier_9.N4a7c8353769(i);
	    } 
	    return p;
	  }
	  static double N18f1231d767(Object []i) {
	    double p = Double.NaN;
	    if (i[85] == null) {
	      p = 0;
	    } else if (((Double) i[85]).doubleValue() <= 2.36) {
	      p = 0;
	    } else if (((Double) i[85]).doubleValue() > 2.36) {
	    p = HandSenseClassifier_9.N7f3851b5768(i);
	    } 
	    return p;
	  }
	  static double N7f3851b5768(Object []i) {
	    double p = Double.NaN;
	    if (i[47] == null) {
	      p = 0;
	    } else if (((Double) i[47]).doubleValue() <= 8.71) {
	      p = 0;
	    } else if (((Double) i[47]).doubleValue() > 8.71) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N4a7c8353769(Object []i) {
	    double p = Double.NaN;
	    if (i[29] == null) {
	      p = 0;
	    } else if (((Double) i[29]).doubleValue() <= 9.6) {
	    p = HandSenseClassifier_9.N3491e459770(i);
	    } else if (((Double) i[29]).doubleValue() > 9.6) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3491e459770(Object []i) {
	    double p = Double.NaN;
	    if (i[95] == null) {
	      p = 0;
	    } else if (((Double) i[95]).doubleValue() <= 8.12) {
	      p = 0;
	    } else if (((Double) i[95]).doubleValue() > 8.12) {
	      p = 1;
	    } 
	    return p;
	  }
	}