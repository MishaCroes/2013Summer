package me.xiangchen.ml;

public class WatchAuthenticClassifier {

	  public static double classify(Object[] i) throws Exception {
	    double [] sums = new double [2];
	    sums[(int) WatchAuthenticClassifier_0.classify(i)] += 2.5487939172392515;
	    sums[(int) WatchAuthenticClassifier_1.classify(i)] += 2.495021542774034;
	    sums[(int) WatchAuthenticClassifier_2.classify(i)] += 2.861405301430853;
	    sums[(int) WatchAuthenticClassifier_3.classify(i)] += 3.237595198878018;
	    sums[(int) WatchAuthenticClassifier_4.classify(i)] += 2.923551350160751;
	    sums[(int) WatchAuthenticClassifier_5.classify(i)] += 3.406532307768495;
	    sums[(int) WatchAuthenticClassifier_6.classify(i)] += 3.8802082186159197;
	    sums[(int) WatchAuthenticClassifier_7.classify(i)] += 2.871491014016962;
	    sums[(int) WatchAuthenticClassifier_8.classify(i)] += 3.093455159278767;
	    sums[(int) WatchAuthenticClassifier_9.classify(i)] += 3.9498762296938055;
	    double maxV = sums[0];
	    int maxI = 0;
	    for (int j = 1; j < 2; j++) {
	      if (sums[j] > maxV) { maxV = sums[j]; maxI = j; }
	    }
	    return (double) maxI;
	  }
	}
	class WatchAuthenticClassifier_0 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = WatchAuthenticClassifier_0.N4790de90111(i);
	    return p;
	  }
	  static double N4790de90111(Object []i) {
	    double p = Double.NaN;
	    if (i[152] == null) {
	      p = 1;
	    } else if (((Double) i[152]).doubleValue() <= 9.96) {
	    p = WatchAuthenticClassifier_0.N7803e4a4112(i);
	    } else if (((Double) i[152]).doubleValue() > 9.96) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7803e4a4112(Object []i) {
	    double p = Double.NaN;
	    if (i[154] == null) {
	      p = 1;
	    } else if (((Double) i[154]).doubleValue() <= 0.61) {
	    p = WatchAuthenticClassifier_0.N4798088a113(i);
	    } else if (((Double) i[154]).doubleValue() > 0.61) {
	    p = WatchAuthenticClassifier_0.N665ab76b116(i);
	    } 
	    return p;
	  }
	  static double N4798088a113(Object []i) {
	    double p = Double.NaN;
	    if (i[164] == null) {
	      p = 0;
	    } else if (((Double) i[164]).doubleValue() <= -5.67) {
	    p = WatchAuthenticClassifier_0.N4e58c0be114(i);
	    } else if (((Double) i[164]).doubleValue() > -5.67) {
	    p = WatchAuthenticClassifier_0.N24d62221115(i);
	    } 
	    return p;
	  }
	  static double N4e58c0be114(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= -1.88) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > -1.88) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N24d62221115(Object []i) {
	    double p = Double.NaN;
	    if (i[155] == null) {
	      p = 1;
	    } else if (((Double) i[155]).doubleValue() <= 9.96) {
	      p = 1;
	    } else if (((Double) i[155]).doubleValue() > 9.96) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N665ab76b116(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= 1.53) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() > 1.53) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class WatchAuthenticClassifier_1 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = WatchAuthenticClassifier_1.N4dc0064c117(i);
	    return p;
	  }
	  static double N4dc0064c117(Object []i) {
	    double p = Double.NaN;
	    if (i[54] == null) {
	      p = 0;
	    } else if (((Double) i[54]).doubleValue() <= -2.35) {
	    p = WatchAuthenticClassifier_1.N79dd8f74118(i);
	    } else if (((Double) i[54]).doubleValue() > -2.35) {
	    p = WatchAuthenticClassifier_1.N2713fcac120(i);
	    } 
	    return p;
	  }
	  static double N79dd8f74118(Object []i) {
	    double p = Double.NaN;
	    if (i[56] == null) {
	      p = 0;
	    } else if (((Double) i[56]).doubleValue() <= -5.77) {
	    p = WatchAuthenticClassifier_1.N40f5472d119(i);
	    } else if (((Double) i[56]).doubleValue() > -5.77) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N40f5472d119(Object []i) {
	    double p = Double.NaN;
	    if (i[163] == null) {
	      p = 0;
	    } else if (((Double) i[163]).doubleValue() <= -1.23) {
	      p = 0;
	    } else if (((Double) i[163]).doubleValue() > -1.23) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2713fcac120(Object []i) {
	    double p = Double.NaN;
	    if (i[122] == null) {
	      p = 0;
	    } else if (((Double) i[122]).doubleValue() <= -7.06) {
	      p = 0;
	    } else if (((Double) i[122]).doubleValue() > -7.06) {
	    p = WatchAuthenticClassifier_1.N1131943f121(i);
	    } 
	    return p;
	  }
	  static double N1131943f121(Object []i) {
	    double p = Double.NaN;
	    if (i[164] == null) {
	      p = 0;
	    } else if (((Double) i[164]).doubleValue() <= -5.36) {
	      p = 0;
	    } else if (((Double) i[164]).doubleValue() > -5.36) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class WatchAuthenticClassifier_2 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = WatchAuthenticClassifier_2.N4dfbbcea122(i);
	    return p;
	  }
	  static double N4dfbbcea122(Object []i) {
	    double p = Double.NaN;
	    if (i[39] == null) {
	      p = 0;
	    } else if (((Double) i[39]).doubleValue() <= 0.22) {
	    p = WatchAuthenticClassifier_2.N4a2fcea5123(i);
	    } else if (((Double) i[39]).doubleValue() > 0.22) {
	    p = WatchAuthenticClassifier_2.N43830f40125(i);
	    } 
	    return p;
	  }
	  static double N4a2fcea5123(Object []i) {
	    double p = Double.NaN;
	    if (i[32] == null) {
	      p = 0;
	    } else if (((Double) i[32]).doubleValue() <= -0.02) {
	    p = WatchAuthenticClassifier_2.N8a7d8b0124(i);
	    } else if (((Double) i[32]).doubleValue() > -0.02) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N8a7d8b0124(Object []i) {
	    double p = Double.NaN;
	    if (i[15] == null) {
	      p = 0;
	    } else if (((Double) i[15]).doubleValue() <= 5.06) {
	      p = 0;
	    } else if (((Double) i[15]).doubleValue() > 5.06) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N43830f40125(Object []i) {
	    double p = Double.NaN;
	    if (i[151] == null) {
	      p = 0;
	    } else if (((Double) i[151]).doubleValue() <= -8.43) {
	      p = 0;
	    } else if (((Double) i[151]).doubleValue() > -8.43) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class WatchAuthenticClassifier_3 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = WatchAuthenticClassifier_3.N515e5560126(i);
	    return p;
	  }
	  static double N515e5560126(Object []i) {
	    double p = Double.NaN;
	    if (i[154] == null) {
	      p = 1;
	    } else if (((Double) i[154]).doubleValue() <= 0.61) {
	    p = WatchAuthenticClassifier_3.N8373b5c127(i);
	    } else if (((Double) i[154]).doubleValue() > 0.61) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N8373b5c127(Object []i) {
	    double p = Double.NaN;
	    if (i[151] == null) {
	      p = 1;
	    } else if (((Double) i[151]).doubleValue() <= 0.61) {
	    p = WatchAuthenticClassifier_3.N621a193a128(i);
	    } else if (((Double) i[151]).doubleValue() > 0.61) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N621a193a128(Object []i) {
	    double p = Double.NaN;
	    if (i[98] == null) {
	      p = 1;
	    } else if (((Double) i[98]).doubleValue() <= 10.26) {
	    p = WatchAuthenticClassifier_3.N1f6e6127129(i);
	    } else if (((Double) i[98]).doubleValue() > 10.26) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N1f6e6127129(Object []i) {
	    double p = Double.NaN;
	    if (i[158] == null) {
	      p = 1;
	    } else if (((Double) i[158]).doubleValue() <= 7.81) {
	      p = 1;
	    } else if (((Double) i[158]).doubleValue() > 7.81) {
	    p = WatchAuthenticClassifier_3.N7ac5790130(i);
	    } 
	    return p;
	  }
	  static double N7ac5790130(Object []i) {
	    double p = Double.NaN;
	    if (i[150] == null) {
	      p = 1;
	    } else if (((Double) i[150]).doubleValue() <= 3.37) {
	      p = 1;
	    } else if (((Double) i[150]).doubleValue() > 3.37) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class WatchAuthenticClassifier_4 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = WatchAuthenticClassifier_4.N43a8b2df131(i);
	    return p;
	  }
	  static double N43a8b2df131(Object []i) {
	    double p = Double.NaN;
	    if (i[155] == null) {
	      p = 1;
	    } else if (((Double) i[155]).doubleValue() <= 8.73) {
	    p = WatchAuthenticClassifier_4.N7877712c132(i);
	    } else if (((Double) i[155]).doubleValue() > 8.73) {
	    p = WatchAuthenticClassifier_4.N69a73d7d133(i);
	    } 
	    return p;
	  }
	  static double N7877712c132(Object []i) {
	    double p = Double.NaN;
	    if (i[164] == null) {
	      p = 0;
	    } else if (((Double) i[164]).doubleValue() <= -4.6) {
	      p = 0;
	    } else if (((Double) i[164]).doubleValue() > -4.6) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N69a73d7d133(Object []i) {
	    double p = Double.NaN;
	    if (i[164] == null) {
	      p = 0;
	    } else if (((Double) i[164]).doubleValue() <= 8.12) {
	      p = 0;
	    } else if (((Double) i[164]).doubleValue() > 8.12) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class WatchAuthenticClassifier_5 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = WatchAuthenticClassifier_5.N62b60fbb134(i);
	    return p;
	  }
	  static double N62b60fbb134(Object []i) {
	    double p = Double.NaN;
	    if (i[158] == null) {
	      p = 1;
	    } else if (((Double) i[158]).doubleValue() <= 7.81) {
	    p = WatchAuthenticClassifier_5.N1ec2f09e135(i);
	    } else if (((Double) i[158]).doubleValue() > 7.81) {
	    p = WatchAuthenticClassifier_5.N28282ae6137(i);
	    } 
	    return p;
	  }
	  static double N1ec2f09e135(Object []i) {
	    double p = Double.NaN;
	    if (i[152] == null) {
	      p = 1;
	    } else if (((Double) i[152]).doubleValue() <= 6.74) {
	      p = 1;
	    } else if (((Double) i[152]).doubleValue() > 6.74) {
	    p = WatchAuthenticClassifier_5.N104324d9136(i);
	    } 
	    return p;
	  }
	  static double N104324d9136(Object []i) {
	    double p = Double.NaN;
	    if (i[161] == null) {
	      p = 0;
	    } else if (((Double) i[161]).doubleValue() <= 1.84) {
	      p = 0;
	    } else if (((Double) i[161]).doubleValue() > 1.84) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N28282ae6137(Object []i) {
	    double p = Double.NaN;
	    if (i[53] == null) {
	      p = 0;
	    } else if (((Double) i[53]).doubleValue() <= -7.2) {
	      p = 0;
	    } else if (((Double) i[53]).doubleValue() > -7.2) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class WatchAuthenticClassifier_6 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = WatchAuthenticClassifier_6.N651876a2138(i);
	    return p;
	  }
	  static double N651876a2138(Object []i) {
	    double p = Double.NaN;
	    if (i[111] == null) {
	      p = 0;
	    } else if (((Double) i[111]).doubleValue() <= -4.62) {
	      p = 0;
	    } else if (((Double) i[111]).doubleValue() > -4.62) {
	    p = WatchAuthenticClassifier_6.N2914b988139(i);
	    } 
	    return p;
	  }
	  static double N2914b988139(Object []i) {
	    double p = Double.NaN;
	    if (i[113] == null) {
	      p = 0;
	    } else if (((Double) i[113]).doubleValue() <= -13.05) {
	      p = 0;
	    } else if (((Double) i[113]).doubleValue() > -13.05) {
	    p = WatchAuthenticClassifier_6.Nfa0a4ca140(i);
	    } 
	    return p;
	  }
	  static double Nfa0a4ca140(Object []i) {
	    double p = Double.NaN;
	    if (i[163] == null) {
	      p = 0;
	    } else if (((Double) i[163]).doubleValue() <= -5.67) {
	    p = WatchAuthenticClassifier_6.N7ba2d1c9141(i);
	    } else if (((Double) i[163]).doubleValue() > -5.67) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N7ba2d1c9141(Object []i) {
	    double p = Double.NaN;
	    if (i[151] == null) {
	      p = 1;
	    } else if (((Double) i[151]).doubleValue() <= -5.06) {
	      p = 1;
	    } else if (((Double) i[151]).doubleValue() > -5.06) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class WatchAuthenticClassifier_7 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = WatchAuthenticClassifier_7.N7e7b2288142(i);
	    return p;
	  }
	  static double N7e7b2288142(Object []i) {
	    double p = Double.NaN;
	    if (i[43] == null) {
	      p = 1;
	    } else if (((Double) i[43]).doubleValue() <= 2.63) {
	    p = WatchAuthenticClassifier_7.N46184f97143(i);
	    } else if (((Double) i[43]).doubleValue() > 2.63) {
	    p = WatchAuthenticClassifier_7.N3fa14be0147(i);
	    } 
	    return p;
	  }
	  static double N46184f97143(Object []i) {
	    double p = Double.NaN;
	    if (i[163] == null) {
	      p = 0;
	    } else if (((Double) i[163]).doubleValue() <= -5.06) {
	    p = WatchAuthenticClassifier_7.N66116674144(i);
	    } else if (((Double) i[163]).doubleValue() > -5.06) {
	    p = WatchAuthenticClassifier_7.N5d7e06145(i);
	    } 
	    return p;
	  }
	  static double N66116674144(Object []i) {
	    double p = Double.NaN;
	    if (i[158] == null) {
	      p = 1;
	    } else if (((Double) i[158]).doubleValue() <= 8.58) {
	      p = 1;
	    } else if (((Double) i[158]).doubleValue() > 8.58) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5d7e06145(Object []i) {
	    double p = Double.NaN;
	    if (i[161] == null) {
	      p = 1;
	    } else if (((Double) i[161]).doubleValue() <= 9.96) {
	    p = WatchAuthenticClassifier_7.N79fcbc19146(i);
	    } else if (((Double) i[161]).doubleValue() > 9.96) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N79fcbc19146(Object []i) {
	    double p = Double.NaN;
	    if (i[151] == null) {
	      p = 0;
	    } else if (((Double) i[151]).doubleValue() <= -4.9) {
	      p = 0;
	    } else if (((Double) i[151]).doubleValue() > -4.9) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3fa14be0147(Object []i) {
	    double p = Double.NaN;
	    if (i[36] == null) {
	      p = 0;
	    } else if (((Double) i[36]).doubleValue() <= -2.28) {
	      p = 0;
	    } else if (((Double) i[36]).doubleValue() > -2.28) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class WatchAuthenticClassifier_8 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = WatchAuthenticClassifier_8.N767c7fc2148(i);
	    return p;
	  }
	  static double N767c7fc2148(Object []i) {
	    double p = Double.NaN;
	    if (i[18] == null) {
	      p = 0;
	    } else if (((Double) i[18]).doubleValue() <= -0.5) {
	    p = WatchAuthenticClassifier_8.N67a7d653149(i);
	    } else if (((Double) i[18]).doubleValue() > -0.5) {
	    p = WatchAuthenticClassifier_8.N2940943151(i);
	    } 
	    return p;
	  }
	  static double N67a7d653149(Object []i) {
	    double p = Double.NaN;
	    if (i[35] == null) {
	      p = 0;
	    } else if (((Double) i[35]).doubleValue() <= 0.34) {
	    p = WatchAuthenticClassifier_8.N3be8184f150(i);
	    } else if (((Double) i[35]).doubleValue() > 0.34) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3be8184f150(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= -0.29) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() > -0.29) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2940943151(Object []i) {
	    double p = Double.NaN;
	    if (i[106] == null) {
	      p = 0;
	    } else if (((Double) i[106]).doubleValue() <= -0.57) {
	      p = 0;
	    } else if (((Double) i[106]).doubleValue() > -0.57) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class WatchAuthenticClassifier_9 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = WatchAuthenticClassifier_9.N44ec0f07152(i);
	    return p;
	  }
	  static double N44ec0f07152(Object []i) {
	    double p = Double.NaN;
	    if (i[120] == null) {
	      p = 0;
	    } else if (((Double) i[120]).doubleValue() <= 3.62) {
	    p = WatchAuthenticClassifier_9.N65ceb7ea153(i);
	    } else if (((Double) i[120]).doubleValue() > 3.62) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N65ceb7ea153(Object []i) {
	    double p = Double.NaN;
	    if (i[159] == null) {
	      p = 1;
	    } else if (((Double) i[159]).doubleValue() <= -1.38) {
	      p = 1;
	    } else if (((Double) i[159]).doubleValue() > -1.38) {
	    p = WatchAuthenticClassifier_9.N668c97dd154(i);
	    } 
	    return p;
	  }
	  static double N668c97dd154(Object []i) {
	    double p = Double.NaN;
	    if (i[164] == null) {
	      p = 0;
	    } else if (((Double) i[164]).doubleValue() <= 8.12) {
	    p = WatchAuthenticClassifier_9.N184662c4155(i);
	    } else if (((Double) i[164]).doubleValue() > 8.12) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N184662c4155(Object []i) {
	    double p = Double.NaN;
	    if (i[163] == null) {
	      p = 0;
	    } else if (((Double) i[163]).doubleValue() <= -0.61) {
	      p = 0;
	    } else if (((Double) i[163]).doubleValue() > -0.61) {
	      p = 1;
	    } 
	    return p;
	  }
	}