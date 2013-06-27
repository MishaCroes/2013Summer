package me.xiangchen.ml;

public class PhoneAuthenticClassifier {

	  public static double classify(Object[] i) throws Exception {
	    double [] sums = new double [2];
	    sums[(int) PhoneAuthenticClassifier_0.classify(i)] += 3.3518515075590005;
	    sums[(int) PhoneAuthenticClassifier_1.classify(i)] += 3.733693469903723;
	    sums[(int) PhoneAuthenticClassifier_2.classify(i)] += 3.350935546881265;
	    sums[(int) PhoneAuthenticClassifier_3.classify(i)] += 3.188394254273679;
	    sums[(int) PhoneAuthenticClassifier_4.classify(i)] += 3.9691291736060363;
	    sums[(int) PhoneAuthenticClassifier_5.classify(i)] += 3.465923441434037;
	    sums[(int) PhoneAuthenticClassifier_6.classify(i)] += 3.7587491801534147;
	    sums[(int) PhoneAuthenticClassifier_7.classify(i)] += 3.6329730768508095;
	    sums[(int) PhoneAuthenticClassifier_8.classify(i)] += 2.9410261505236868;
	    sums[(int) PhoneAuthenticClassifier_9.classify(i)] += 4.263016233520904;
	    double maxV = sums[0];
	    int maxI = 0;
	    for (int j = 1; j < 2; j++) {
	      if (sums[j] > maxV) { maxV = sums[j]; maxI = j; }
	    }
	    return (double) maxI;
	  }
	}
	class PhoneAuthenticClassifier_0 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = PhoneAuthenticClassifier_0.N17d40c4e15(i);
	    return p;
	  }
	  static double N17d40c4e15(Object []i) {
	    double p = Double.NaN;
	    if (i[26] == null) {
	      p = 0;
	    } else if (((Double) i[26]).doubleValue() <= 6.48) {
	    p = PhoneAuthenticClassifier_0.N6273e11a16(i);
	    } else if (((Double) i[26]).doubleValue() > 6.48) {
	    p = PhoneAuthenticClassifier_0.N25bfa47517(i);
	    } 
	    return p;
	  }
	  static double N6273e11a16(Object []i) {
	    double p = Double.NaN;
	    if (i[79] == null) {
	      p = 1;
	    } else if (((Double) i[79]).doubleValue() <= -1.23) {
	      p = 1;
	    } else if (((Double) i[79]).doubleValue() > -1.23) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N25bfa47517(Object []i) {
	    double p = Double.NaN;
	    if (i[76] == null) {
	      p = 1;
	    } else if (((Double) i[76]).doubleValue() <= 2.6) {
	      p = 1;
	    } else if (((Double) i[76]).doubleValue() > 2.6) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class PhoneAuthenticClassifier_1 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = PhoneAuthenticClassifier_1.N48c610af18(i);
	    return p;
	  }
	  static double N48c610af18(Object []i) {
	    double p = Double.NaN;
	    if (i[46] == null) {
	      p = 1;
	    } else if (((Double) i[46]).doubleValue() <= 8.61) {
	    p = PhoneAuthenticClassifier_1.N4371767c19(i);
	    } else if (((Double) i[46]).doubleValue() > 8.61) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4371767c19(Object []i) {
	    double p = Double.NaN;
	    if (i[79] == null) {
	      p = 1;
	    } else if (((Double) i[79]).doubleValue() <= 1.38) {
	    p = PhoneAuthenticClassifier_1.N4e19e97b20(i);
	    } else if (((Double) i[79]).doubleValue() > 1.38) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4e19e97b20(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= 0.13) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() > 0.13) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class PhoneAuthenticClassifier_2 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = PhoneAuthenticClassifier_2.N72fb24c21(i);
	    return p;
	  }
	  static double N72fb24c21(Object []i) {
	    double p = Double.NaN;
	    if (i[49] == null) {
	      p = 1;
	    } else if (((Double) i[49]).doubleValue() <= 8.68) {
	    p = PhoneAuthenticClassifier_2.N4c629f4322(i);
	    } else if (((Double) i[49]).doubleValue() > 8.68) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4c629f4322(Object []i) {
	    double p = Double.NaN;
	    if (i[79] == null) {
	      p = 1;
	    } else if (((Double) i[79]).doubleValue() <= 2.3) {
	      p = 1;
	    } else if (((Double) i[79]).doubleValue() > 2.3) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class PhoneAuthenticClassifier_3 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = PhoneAuthenticClassifier_3.N5ec60ee223(i);
	    return p;
	  }
	  static double N5ec60ee223(Object []i) {
	    double p = Double.NaN;
	    if (i[73] == null) {
	      p = 1;
	    } else if (((Double) i[73]).doubleValue() <= -11.48) {
	      p = 1;
	    } else if (((Double) i[73]).doubleValue() > -11.48) {
	    p = PhoneAuthenticClassifier_3.N1cfb480a24(i);
	    } 
	    return p;
	  }
	  static double N1cfb480a24(Object []i) {
	    double p = Double.NaN;
	    if (i[16] == null) {
	      p = 1;
	    } else if (((Double) i[16]).doubleValue() <= -10.78) {
	      p = 1;
	    } else if (((Double) i[16]).doubleValue() > -10.78) {
	    p = PhoneAuthenticClassifier_3.N3536976325(i);
	    } 
	    return p;
	  }
	  static double N3536976325(Object []i) {
	    double p = Double.NaN;
	    if (i[41] == null) {
	      p = 0;
	    } else if (((Double) i[41]).doubleValue() <= 6.5) {
	      p = 0;
	    } else if (((Double) i[41]).doubleValue() > 6.5) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class PhoneAuthenticClassifier_4 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = PhoneAuthenticClassifier_4.N130cffe026(i);
	    return p;
	  }
	  static double N130cffe026(Object []i) {
	    double p = Double.NaN;
	    if (i[79] == null) {
	      p = 1;
	    } else if (((Double) i[79]).doubleValue() <= -0.77) {
	    p = PhoneAuthenticClassifier_4.N3a72d4e527(i);
	    } else if (((Double) i[79]).doubleValue() > -0.77) {
	    p = PhoneAuthenticClassifier_4.N48f7245d28(i);
	    } 
	    return p;
	  }
	  static double N3a72d4e527(Object []i) {
	    double p = Double.NaN;
	    if (i[64] == null) {
	      p = 1;
	    } else if (((Double) i[64]).doubleValue() <= 9.27) {
	      p = 1;
	    } else if (((Double) i[64]).doubleValue() > 9.27) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N48f7245d28(Object []i) {
	    double p = Double.NaN;
	    if (i[77] == null) {
	      p = 0;
	    } else if (((Double) i[77]).doubleValue() <= 11.03) {
	      p = 0;
	    } else if (((Double) i[77]).doubleValue() > 11.03) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class PhoneAuthenticClassifier_5 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = PhoneAuthenticClassifier_5.N59747b1729(i);
	    return p;
	  }
	  static double N59747b1729(Object []i) {
	    double p = Double.NaN;
	    if (i[79] == null) {
	      p = 1;
	    } else if (((Double) i[79]).doubleValue() <= 1.38) {
	    p = PhoneAuthenticClassifier_5.N6e3d50e230(i);
	    } else if (((Double) i[79]).doubleValue() > 1.38) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6e3d50e230(Object []i) {
	    double p = Double.NaN;
	    if (i[38] == null) {
	      p = 0;
	    } else if (((Double) i[38]).doubleValue() <= -0.64) {
	    p = PhoneAuthenticClassifier_5.N7b895df831(i);
	    } else if (((Double) i[38]).doubleValue() > -0.64) {
	    p = PhoneAuthenticClassifier_5.N7778842432(i);
	    } 
	    return p;
	  }
	  static double N7b895df831(Object []i) {
	    double p = Double.NaN;
	    if (i[58] == null) {
	      p = 0;
	    } else if (((Double) i[58]).doubleValue() <= -8.92) {
	      p = 0;
	    } else if (((Double) i[58]).doubleValue() > -8.92) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N7778842432(Object []i) {
	    double p = Double.NaN;
	    if (i[75] == null) {
	      p = 1;
	    } else if (((Double) i[75]).doubleValue() <= 0.15) {
	      p = 1;
	    } else if (((Double) i[75]).doubleValue() > 0.15) {
	    p = PhoneAuthenticClassifier_5.N92b94c333(i);
	    } 
	    return p;
	  }
	  static double N92b94c333(Object []i) {
	    double p = Double.NaN;
	    if (i[38] == null) {
	      p = 0;
	    } else if (((Double) i[38]).doubleValue() <= 2.35) {
	      p = 0;
	    } else if (((Double) i[38]).doubleValue() > 2.35) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class PhoneAuthenticClassifier_6 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = PhoneAuthenticClassifier_6.Nc3392e934(i);
	    return p;
	  }
	  static double Nc3392e934(Object []i) {
	    double p = Double.NaN;
	    if (i[38] == null) {
	      p = 0;
	    } else if (((Double) i[38]).doubleValue() <= -0.53) {
	      p = 0;
	    } else if (((Double) i[38]).doubleValue() > -0.53) {
	    p = PhoneAuthenticClassifier_6.Ndf2054135(i);
	    } 
	    return p;
	  }
	  static double Ndf2054135(Object []i) {
	    double p = Double.NaN;
	    if (i[76] == null) {
	      p = 1;
	    } else if (((Double) i[76]).doubleValue() <= 2.76) {
	      p = 1;
	    } else if (((Double) i[76]).doubleValue() > 2.76) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class PhoneAuthenticClassifier_7 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = PhoneAuthenticClassifier_7.Nc36f58e36(i);
	    return p;
	  }
	  static double Nc36f58e36(Object []i) {
	    double p = Double.NaN;
	    if (i[79] == null) {
	      p = 1;
	    } else if (((Double) i[79]).doubleValue() <= -2.3) {
	      p = 1;
	    } else if (((Double) i[79]).doubleValue() > -2.3) {
	    p = PhoneAuthenticClassifier_7.N6c3343e537(i);
	    } 
	    return p;
	  }
	  static double N6c3343e537(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= 2.91) {
	    p = PhoneAuthenticClassifier_7.N19aea6e238(i);
	    } else if (((Double) i[6]).doubleValue() > 2.91) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N19aea6e238(Object []i) {
	    double p = Double.NaN;
	    if (i[56] == null) {
	      p = 0;
	    } else if (((Double) i[56]).doubleValue() <= 6.36) {
	      p = 0;
	    } else if (((Double) i[56]).doubleValue() > 6.36) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class PhoneAuthenticClassifier_8 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = PhoneAuthenticClassifier_8.N194e4c9a39(i);
	    return p;
	  }
	  static double N194e4c9a39(Object []i) {
	    double p = Double.NaN;
	    if (i[79] == null) {
	      p = 1;
	    } else if (((Double) i[79]).doubleValue() <= -2.3) {
	      p = 1;
	    } else if (((Double) i[79]).doubleValue() > -2.3) {
	    p = PhoneAuthenticClassifier_8.N63871f7040(i);
	    } 
	    return p;
	  }
	  static double N63871f7040(Object []i) {
	    double p = Double.NaN;
	    if (i[73] == null) {
	      p = 1;
	    } else if (((Double) i[73]).doubleValue() <= -11.48) {
	      p = 1;
	    } else if (((Double) i[73]).doubleValue() > -11.48) {
	    p = PhoneAuthenticClassifier_8.N3c21251c41(i);
	    } 
	    return p;
	  }
	  static double N3c21251c41(Object []i) {
	    double p = Double.NaN;
	    if (i[80] == null) {
	      p = 1;
	    } else if (((Double) i[80]).doubleValue() <= 7.35) {
	      p = 1;
	    } else if (((Double) i[80]).doubleValue() > 7.35) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class PhoneAuthenticClassifier_9 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = PhoneAuthenticClassifier_9.N240b701b42(i);
	    return p;
	  }
	  static double N240b701b42(Object []i) {
	    double p = Double.NaN;
	    if (i[76] == null) {
	      p = 1;
	    } else if (((Double) i[76]).doubleValue() <= 2.76) {
	    p = PhoneAuthenticClassifier_9.N6aed0f1943(i);
	    } else if (((Double) i[76]).doubleValue() > 2.76) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6aed0f1943(Object []i) {
	    double p = Double.NaN;
	    if (i[37] == null) {
	      p = 1;
	    } else if (((Double) i[37]).doubleValue() <= 9.22) {
	    p = PhoneAuthenticClassifier_9.N717a692644(i);
	    } else if (((Double) i[37]).doubleValue() > 9.22) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N717a692644(Object []i) {
	    double p = Double.NaN;
	    if (i[59] == null) {
	      p = 0;
	    } else if (((Double) i[59]).doubleValue() <= -0.19) {
	    p = PhoneAuthenticClassifier_9.N1b8d77fe45(i);
	    } else if (((Double) i[59]).doubleValue() > -0.19) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N1b8d77fe45(Object []i) {
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