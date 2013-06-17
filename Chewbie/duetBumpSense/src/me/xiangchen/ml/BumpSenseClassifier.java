package me.xiangchen.ml;

public class BumpSenseClassifier {

	  public static double classify(Object[] i) throws Exception {
	    double [] sums = new double [2];
	    sums[(int) BumpSenseClassifier_0.classify(i)] += 5.516113311535651;
	    sums[(int) BumpSenseClassifier_1.classify(i)] += 3.644487498367074;
	    sums[(int) BumpSenseClassifier_2.classify(i)] += 4.407763997489866;
	    sums[(int) BumpSenseClassifier_3.classify(i)] += 4.676700715398962;
	    sums[(int) BumpSenseClassifier_4.classify(i)] += 5.365182189180817;
	    sums[(int) BumpSenseClassifier_5.classify(i)] += 5.24824329681934;
	    sums[(int) BumpSenseClassifier_6.classify(i)] += 4.172305977435451;
	    sums[(int) BumpSenseClassifier_7.classify(i)] += 4.476675955416379;
	    sums[(int) BumpSenseClassifier_8.classify(i)] += 3.757077328626441;
	    sums[(int) BumpSenseClassifier_9.classify(i)] += 5.079453444908318;
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
	    p = BumpSenseClassifier_0.N1b9be041545(i);
	    return p;
	  }
	  static double N1b9be041545(Object []i) {
	    double p = Double.NaN;
	    if (i[163] == null) {
	      p = 0;
	    } else if (((Double) i[163]).doubleValue() <= -3.52) {
	    p = BumpSenseClassifier_0.N169fd990546(i);
	    } else if (((Double) i[163]).doubleValue() > -3.52) {
	    p = BumpSenseClassifier_0.N6520496c548(i);
	    } 
	    return p;
	  }
	  static double N169fd990546(Object []i) {
	    double p = Double.NaN;
	    if (i[157] == null) {
	      p = 0;
	    } else if (((Double) i[157]).doubleValue() <= -1.99) {
	      p = 0;
	    } else if (((Double) i[157]).doubleValue() > -1.99) {
	    p = BumpSenseClassifier_0.N5884888a547(i);
	    } 
	    return p;
	  }
	  static double N5884888a547(Object []i) {
	    double p = Double.NaN;
	    if (i[92] == null) {
	      p = 0;
	    } else if (((Double) i[92]).doubleValue() <= 8.72) {
	      p = 0;
	    } else if (((Double) i[92]).doubleValue() > 8.72) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6520496c548(Object []i) {
	    double p = Double.NaN;
	    if (i[136] == null) {
	      p = 1;
	    } else if (((Double) i[136]).doubleValue() <= 3.67) {
	    p = BumpSenseClassifier_0.N2ab48552549(i);
	    } else if (((Double) i[136]).doubleValue() > 3.67) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N2ab48552549(Object []i) {
	    double p = Double.NaN;
	    if (i[155] == null) {
	      p = 0;
	    } else if (((Double) i[155]).doubleValue() <= 9.04) {
	    p = BumpSenseClassifier_0.N319ce065550(i);
	    } else if (((Double) i[155]).doubleValue() > 9.04) {
	    p = BumpSenseClassifier_0.N2a7ac641552(i);
	    } 
	    return p;
	  }
	  static double N319ce065550(Object []i) {
	    double p = Double.NaN;
	    if (i[151] == null) {
	      p = 0;
	    } else if (((Double) i[151]).doubleValue() <= -1.69) {
	      p = 0;
	    } else if (((Double) i[151]).doubleValue() > -1.69) {
	    p = BumpSenseClassifier_0.N32502055551(i);
	    } 
	    return p;
	  }
	  static double N32502055551(Object []i) {
	    double p = Double.NaN;
	    if (i[158] == null) {
	      p = 0;
	    } else if (((Double) i[158]).doubleValue() <= 9.19) {
	      p = 0;
	    } else if (((Double) i[158]).doubleValue() > 9.19) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2a7ac641552(Object []i) {
	    double p = Double.NaN;
	    if (i[137] == null) {
	      p = 1;
	    } else if (((Double) i[137]).doubleValue() <= 8.02) {
	    p = BumpSenseClassifier_0.N626deb30553(i);
	    } else if (((Double) i[137]).doubleValue() > 8.02) {
	    p = BumpSenseClassifier_0.N32e04a25556(i);
	    } 
	    return p;
	  }
	  static double N626deb30553(Object []i) {
	    double p = Double.NaN;
	    if (i[94] == null) {
	      p = 1;
	    } else if (((Double) i[94]).doubleValue() <= -0.44) {
	      p = 1;
	    } else if (((Double) i[94]).doubleValue() > -0.44) {
	    p = BumpSenseClassifier_0.N1e6bcecc554(i);
	    } 
	    return p;
	  }
	  static double N1e6bcecc554(Object []i) {
	    double p = Double.NaN;
	    if (i[160] == null) {
	      p = 0;
	    } else if (((Double) i[160]).doubleValue() <= 1.38) {
	    p = BumpSenseClassifier_0.N37d5c2ae555(i);
	    } else if (((Double) i[160]).doubleValue() > 1.38) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N37d5c2ae555(Object []i) {
	    double p = Double.NaN;
	    if (i[62] == null) {
	      p = 0;
	    } else if (((Double) i[62]).doubleValue() <= 10.19) {
	      p = 0;
	    } else if (((Double) i[62]).doubleValue() > 10.19) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N32e04a25556(Object []i) {
	    double p = Double.NaN;
	    if (i[114] == null) {
	      p = 1;
	    } else if (((Double) i[114]).doubleValue() <= 2.16) {
	    p = BumpSenseClassifier_0.N2323dd3b557(i);
	    } else if (((Double) i[114]).doubleValue() > 2.16) {
	    p = BumpSenseClassifier_0.N396e1f8569(i);
	    } 
	    return p;
	  }
	  static double N2323dd3b557(Object []i) {
	    double p = Double.NaN;
	    if (i[137] == null) {
	      p = 1;
	    } else if (((Double) i[137]).doubleValue() <= 10.29) {
	    p = BumpSenseClassifier_0.N7915e83558(i);
	    } else if (((Double) i[137]).doubleValue() > 10.29) {
	    p = BumpSenseClassifier_0.N43251c7568(i);
	    } 
	    return p;
	  }
	  static double N7915e83558(Object []i) {
	    double p = Double.NaN;
	    if (i[164] == null) {
	      p = 1;
	    } else if (((Double) i[164]).doubleValue() <= 9.81) {
	    p = BumpSenseClassifier_0.N58d3ee56559(i);
	    } else if (((Double) i[164]).doubleValue() > 9.81) {
	    p = BumpSenseClassifier_0.N297cce3b563(i);
	    } 
	    return p;
	  }
	  static double N58d3ee56559(Object []i) {
	    double p = Double.NaN;
	    if (i[26] == null) {
	      p = 1;
	    } else if (((Double) i[26]).doubleValue() <= 9.15) {
	      p = 1;
	    } else if (((Double) i[26]).doubleValue() > 9.15) {
	    p = BumpSenseClassifier_0.N41c47da9560(i);
	    } 
	    return p;
	  }
	  static double N41c47da9560(Object []i) {
	    double p = Double.NaN;
	    if (i[40] == null) {
	      p = 1;
	    } else if (((Double) i[40]).doubleValue() <= 3.11) {
	    p = BumpSenseClassifier_0.N4b1603fa561(i);
	    } else if (((Double) i[40]).doubleValue() > 3.11) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4b1603fa561(Object []i) {
	    double p = Double.NaN;
	    if (i[150] == null) {
	      p = 1;
	    } else if (((Double) i[150]).doubleValue() <= 0.46) {
	      p = 1;
	    } else if (((Double) i[150]).doubleValue() > 0.46) {
	    p = BumpSenseClassifier_0.N125f3899562(i);
	    } 
	    return p;
	  }
	  static double N125f3899562(Object []i) {
	    double p = Double.NaN;
	    if (i[143] == null) {
	      p = 1;
	    } else if (((Double) i[143]).doubleValue() <= 9.22) {
	      p = 1;
	    } else if (((Double) i[143]).doubleValue() > 9.22) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N297cce3b563(Object []i) {
	    double p = Double.NaN;
	    if (i[19] == null) {
	      p = 1;
	    } else if (((Double) i[19]).doubleValue() <= 0.58) {
	      p = 1;
	    } else if (((Double) i[19]).doubleValue() > 0.58) {
	    p = BumpSenseClassifier_0.N40c798c4564(i);
	    } 
	    return p;
	  }
	  static double N40c798c4564(Object []i) {
	    double p = Double.NaN;
	    if (i[12] == null) {
	      p = 0;
	    } else if (((Double) i[12]).doubleValue() <= -0.77) {
	    p = BumpSenseClassifier_0.N6ffe8d15565(i);
	    } else if (((Double) i[12]).doubleValue() > -0.77) {
	    p = BumpSenseClassifier_0.N30e09724566(i);
	    } 
	    return p;
	  }
	  static double N6ffe8d15565(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= -0.29) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() > -0.29) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N30e09724566(Object []i) {
	    double p = Double.NaN;
	    if (i[163] == null) {
	      p = 1;
	    } else if (((Double) i[163]).doubleValue() <= -0.61) {
	    p = BumpSenseClassifier_0.N68e2d58d567(i);
	    } else if (((Double) i[163]).doubleValue() > -0.61) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N68e2d58d567(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= 10.36) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() > 10.36) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N43251c7568(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() <= 9.52) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() > 9.52) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N396e1f8569(Object []i) {
	    double p = Double.NaN;
	    if (i[122] == null) {
	      p = 1;
	    } else if (((Double) i[122]).doubleValue() <= 8.94) {
	      p = 1;
	    } else if (((Double) i[122]).doubleValue() > 8.94) {
	    p = BumpSenseClassifier_0.N26cd629f570(i);
	    } 
	    return p;
	  }
	  static double N26cd629f570(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 3.81) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > 3.81) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class BumpSenseClassifier_1 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseClassifier_1.N7605c89f571(i);
	    return p;
	  }
	  static double N7605c89f571(Object []i) {
	    double p = Double.NaN;
	    if (i[162] == null) {
	      p = 1;
	    } else if (((Double) i[162]).doubleValue() <= 1.38) {
	    p = BumpSenseClassifier_1.N75b67b41572(i);
	    } else if (((Double) i[162]).doubleValue() > 1.38) {
	    p = BumpSenseClassifier_1.N52edb81a577(i);
	    } 
	    return p;
	  }
	  static double N75b67b41572(Object []i) {
	    double p = Double.NaN;
	    if (i[163] == null) {
	      p = 0;
	    } else if (((Double) i[163]).doubleValue() <= -0.61) {
	    p = BumpSenseClassifier_1.N1f5624c7573(i);
	    } else if (((Double) i[163]).doubleValue() > -0.61) {
	    p = BumpSenseClassifier_1.N36e6ec63575(i);
	    } 
	    return p;
	  }
	  static double N1f5624c7573(Object []i) {
	    double p = Double.NaN;
	    if (i[151] == null) {
	      p = 0;
	    } else if (((Double) i[151]).doubleValue() <= -3.37) {
	      p = 0;
	    } else if (((Double) i[151]).doubleValue() > -3.37) {
	    p = BumpSenseClassifier_1.N508894e3574(i);
	    } 
	    return p;
	  }
	  static double N508894e3574(Object []i) {
	    double p = Double.NaN;
	    if (i[143] == null) {
	      p = 0;
	    } else if (((Double) i[143]).doubleValue() <= 7.97) {
	      p = 0;
	    } else if (((Double) i[143]).doubleValue() > 7.97) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N36e6ec63575(Object []i) {
	    double p = Double.NaN;
	    if (i[109] == null) {
	      p = 1;
	    } else if (((Double) i[109]).doubleValue() <= 2.07) {
	      p = 1;
	    } else if (((Double) i[109]).doubleValue() > 2.07) {
	    p = BumpSenseClassifier_1.N72a973bd576(i);
	    } 
	    return p;
	  }
	  static double N72a973bd576(Object []i) {
	    double p = Double.NaN;
	    if (i[148] == null) {
	      p = 1;
	    } else if (((Double) i[148]).doubleValue() <= 3.91) {
	      p = 1;
	    } else if (((Double) i[148]).doubleValue() > 3.91) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N52edb81a577(Object []i) {
	    double p = Double.NaN;
	    if (i[157] == null) {
	      p = 0;
	    } else if (((Double) i[157]).doubleValue() <= -0.15) {
	      p = 0;
	    } else if (((Double) i[157]).doubleValue() > -0.15) {
	    p = BumpSenseClassifier_1.N74d1dd7e578(i);
	    } 
	    return p;
	  }
	  static double N74d1dd7e578(Object []i) {
	    double p = Double.NaN;
	    if (i[108] == null) {
	      p = 1;
	    } else if (((Double) i[108]).doubleValue() <= 0.67) {
	      p = 1;
	    } else if (((Double) i[108]).doubleValue() > 0.67) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class BumpSenseClassifier_2 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseClassifier_2.N7e24b71c579(i);
	    return p;
	  }
	  static double N7e24b71c579(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 2.15) {
	    p = BumpSenseClassifier_2.N1c71cff7580(i);
	    } else if (((Double) i[0]).doubleValue() > 2.15) {
	    p = BumpSenseClassifier_2.N4bbf48f0589(i);
	    } 
	    return p;
	  }
	  static double N1c71cff7580(Object []i) {
	    double p = Double.NaN;
	    if (i[67] == null) {
	      p = 1;
	    } else if (((Double) i[67]).doubleValue() <= 0.1) {
	    p = BumpSenseClassifier_2.N740c6fb7581(i);
	    } else if (((Double) i[67]).doubleValue() > 0.1) {
	    p = BumpSenseClassifier_2.N5c7a92e6582(i);
	    } 
	    return p;
	  }
	  static double N740c6fb7581(Object []i) {
	    double p = Double.NaN;
	    if (i[160] == null) {
	      p = 0;
	    } else if (((Double) i[160]).doubleValue() <= -1.53) {
	      p = 0;
	    } else if (((Double) i[160]).doubleValue() > -1.53) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5c7a92e6582(Object []i) {
	    double p = Double.NaN;
	    if (i[28] == null) {
	      p = 1;
	    } else if (((Double) i[28]).doubleValue() <= 0.49) {
	    p = BumpSenseClassifier_2.N73426978583(i);
	    } else if (((Double) i[28]).doubleValue() > 0.49) {
	    p = BumpSenseClassifier_2.Nd1a8066584(i);
	    } 
	    return p;
	  }
	  static double N73426978583(Object []i) {
	    double p = Double.NaN;
	    if (i[162] == null) {
	      p = 1;
	    } else if (((Double) i[162]).doubleValue() <= 1.53) {
	      p = 1;
	    } else if (((Double) i[162]).doubleValue() > 1.53) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double Nd1a8066584(Object []i) {
	    double p = Double.NaN;
	    if (i[154] == null) {
	      p = 0;
	    } else if (((Double) i[154]).doubleValue() <= -0.31) {
	      p = 0;
	    } else if (((Double) i[154]).doubleValue() > -0.31) {
	    p = BumpSenseClassifier_2.N46e3af42585(i);
	    } 
	    return p;
	  }
	  static double N46e3af42585(Object []i) {
	    double p = Double.NaN;
	    if (i[30] == null) {
	      p = 0;
	    } else if (((Double) i[30]).doubleValue() <= 2.15) {
	    p = BumpSenseClassifier_2.Ne073a6a586(i);
	    } else if (((Double) i[30]).doubleValue() > 2.15) {
	    p = BumpSenseClassifier_2.N4e7e63a2588(i);
	    } 
	    return p;
	  }
	  static double Ne073a6a586(Object []i) {
	    double p = Double.NaN;
	    if (i[18] == null) {
	      p = 0;
	    } else if (((Double) i[18]).doubleValue() <= -0.31) {
	      p = 0;
	    } else if (((Double) i[18]).doubleValue() > -0.31) {
	    p = BumpSenseClassifier_2.N7c8c0c57587(i);
	    } 
	    return p;
	  }
	  static double N7c8c0c57587(Object []i) {
	    double p = Double.NaN;
	    if (i[88] == null) {
	      p = 1;
	    } else if (((Double) i[88]).doubleValue() <= 1.82) {
	      p = 1;
	    } else if (((Double) i[88]).doubleValue() > 1.82) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4e7e63a2588(Object []i) {
	    double p = Double.NaN;
	    if (i[31] == null) {
	      p = 0;
	    } else if (((Double) i[31]).doubleValue() <= 2.37) {
	      p = 0;
	    } else if (((Double) i[31]).doubleValue() > 2.37) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N4bbf48f0589(Object []i) {
	    double p = Double.NaN;
	    if (i[149] == null) {
	      p = 0;
	    } else if (((Double) i[149]).doubleValue() <= 8.17) {
	      p = 0;
	    } else if (((Double) i[149]).doubleValue() > 8.17) {
	    p = BumpSenseClassifier_2.N7b4dab69590(i);
	    } 
	    return p;
	  }
	  static double N7b4dab69590(Object []i) {
	    double p = Double.NaN;
	    if (i[155] == null) {
	      p = 0;
	    } else if (((Double) i[155]).doubleValue() <= 8.89) {
	      p = 0;
	    } else if (((Double) i[155]).doubleValue() > 8.89) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class BumpSenseClassifier_3 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseClassifier_3.N2830b9bd591(i);
	    return p;
	  }
	  static double N2830b9bd591(Object []i) {
	    double p = Double.NaN;
	    if (i[163] == null) {
	      p = 0;
	    } else if (((Double) i[163]).doubleValue() <= -3.52) {
	      p = 0;
	    } else if (((Double) i[163]).doubleValue() > -3.52) {
	    p = BumpSenseClassifier_3.N16f23be8592(i);
	    } 
	    return p;
	  }
	  static double N16f23be8592(Object []i) {
	    double p = Double.NaN;
	    if (i[114] == null) {
	      p = 1;
	    } else if (((Double) i[114]).doubleValue() <= 2.16) {
	    p = BumpSenseClassifier_3.N793b081c593(i);
	    } else if (((Double) i[114]).doubleValue() > 2.16) {
	    p = BumpSenseClassifier_3.N7b085bce605(i);
	    } 
	    return p;
	  }
	  static double N793b081c593(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() <= 10.87) {
	    p = BumpSenseClassifier_3.N1291a472594(i);
	    } else if (((Double) i[11]).doubleValue() > 10.87) {
	    p = BumpSenseClassifier_3.Na2219ac603(i);
	    } 
	    return p;
	  }
	  static double N1291a472594(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 7.94) {
	    p = BumpSenseClassifier_3.N17c341e4595(i);
	    } else if (((Double) i[5]).doubleValue() > 7.94) {
	    p = BumpSenseClassifier_3.N141aebec596(i);
	    } 
	    return p;
	  }
	  static double N17c341e4595(Object []i) {
	    double p = Double.NaN;
	    if (i[152] == null) {
	      p = 0;
	    } else if (((Double) i[152]).doubleValue() <= 9.35) {
	      p = 0;
	    } else if (((Double) i[152]).doubleValue() > 9.35) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N141aebec596(Object []i) {
	    double p = Double.NaN;
	    if (i[132] == null) {
	      p = 0;
	    } else if (((Double) i[132]).doubleValue() <= -0.72) {
	    p = BumpSenseClassifier_3.N7376dd43597(i);
	    } else if (((Double) i[132]).doubleValue() > -0.72) {
	    p = BumpSenseClassifier_3.Nb894ee598(i);
	    } 
	    return p;
	  }
	  static double N7376dd43597(Object []i) {
	    double p = Double.NaN;
	    if (i[22] == null) {
	      p = 1;
	    } else if (((Double) i[22]).doubleValue() <= 1.27) {
	      p = 1;
	    } else if (((Double) i[22]).doubleValue() > 1.27) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double Nb894ee598(Object []i) {
	    double p = Double.NaN;
	    if (i[162] == null) {
	      p = 1;
	    } else if (((Double) i[162]).doubleValue() <= 0.92) {
	    p = BumpSenseClassifier_3.N563995a0599(i);
	    } else if (((Double) i[162]).doubleValue() > 0.92) {
	    p = BumpSenseClassifier_3.N57339e4e601(i);
	    } 
	    return p;
	  }
	  static double N563995a0599(Object []i) {
	    double p = Double.NaN;
	    if (i[151] == null) {
	      p = 1;
	    } else if (((Double) i[151]).doubleValue() <= 1.38) {
	      p = 1;
	    } else if (((Double) i[151]).doubleValue() > 1.38) {
	    p = BumpSenseClassifier_3.N5e8e6799600(i);
	    } 
	    return p;
	  }
	  static double N5e8e6799600(Object []i) {
	    double p = Double.NaN;
	    if (i[151] == null) {
	      p = 0;
	    } else if (((Double) i[151]).doubleValue() <= 1.53) {
	      p = 0;
	    } else if (((Double) i[151]).doubleValue() > 1.53) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N57339e4e601(Object []i) {
	    double p = Double.NaN;
	    if (i[125] == null) {
	      p = 1;
	    } else if (((Double) i[125]).doubleValue() <= 9.01) {
	      p = 1;
	    } else if (((Double) i[125]).doubleValue() > 9.01) {
	    p = BumpSenseClassifier_3.N7dde3f9b602(i);
	    } 
	    return p;
	  }
	  static double N7dde3f9b602(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= -0.13) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > -0.13) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Na2219ac603(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 1;
	    } else if (((Double) i[10]).doubleValue() <= -0.21) {
	    p = BumpSenseClassifier_3.N44c37066604(i);
	    } else if (((Double) i[10]).doubleValue() > -0.21) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N44c37066604(Object []i) {
	    double p = Double.NaN;
	    if (i[164] == null) {
	      p = 0;
	    } else if (((Double) i[164]).doubleValue() <= 9.5) {
	      p = 0;
	    } else if (((Double) i[164]).doubleValue() > 9.5) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N7b085bce605(Object []i) {
	    double p = Double.NaN;
	    if (i[78] == null) {
	      p = 0;
	    } else if (((Double) i[78]).doubleValue() <= 0.99) {
	    p = BumpSenseClassifier_3.N61c3707c606(i);
	    } else if (((Double) i[78]).doubleValue() > 0.99) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N61c3707c606(Object []i) {
	    double p = Double.NaN;
	    if (i[14] == null) {
	      p = 1;
	    } else if (((Double) i[14]).doubleValue() <= 10.17) {
	      p = 1;
	    } else if (((Double) i[14]).doubleValue() > 10.17) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class BumpSenseClassifier_4 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseClassifier_4.N660e0f08607(i);
	    return p;
	  }
	  static double N660e0f08607(Object []i) {
	    double p = Double.NaN;
	    if (i[151] == null) {
	      p = 0;
	    } else if (((Double) i[151]).doubleValue() <= -3.37) {
	      p = 0;
	    } else if (((Double) i[151]).doubleValue() > -3.37) {
	    p = BumpSenseClassifier_4.N24fd0a90608(i);
	    } 
	    return p;
	  }
	  static double N24fd0a90608(Object []i) {
	    double p = Double.NaN;
	    if (i[148] == null) {
	      p = 1;
	    } else if (((Double) i[148]).doubleValue() <= 3.9) {
	    p = BumpSenseClassifier_4.N60c086e8609(i);
	    } else if (((Double) i[148]).doubleValue() > 3.9) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N60c086e8609(Object []i) {
	    double p = Double.NaN;
	    if (i[137] == null) {
	      p = 0;
	    } else if (((Double) i[137]).doubleValue() <= 7.64) {
	    p = BumpSenseClassifier_4.N7fd91af7610(i);
	    } else if (((Double) i[137]).doubleValue() > 7.64) {
	    p = BumpSenseClassifier_4.N6798fb4611(i);
	    } 
	    return p;
	  }
	  static double N7fd91af7610(Object []i) {
	    double p = Double.NaN;
	    if (i[53] == null) {
	      p = 0;
	    } else if (((Double) i[53]).doubleValue() <= 9.25) {
	      p = 0;
	    } else if (((Double) i[53]).doubleValue() > 9.25) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6798fb4611(Object []i) {
	    double p = Double.NaN;
	    if (i[153] == null) {
	      p = 1;
	    } else if (((Double) i[153]).doubleValue() <= 1.23) {
	    p = BumpSenseClassifier_4.N16c975be612(i);
	    } else if (((Double) i[153]).doubleValue() > 1.23) {
	    p = BumpSenseClassifier_4.N1a2c58b5621(i);
	    } 
	    return p;
	  }
	  static double N16c975be612(Object []i) {
	    double p = Double.NaN;
	    if (i[29] == null) {
	      p = 1;
	    } else if (((Double) i[29]).doubleValue() <= 10.31) {
	    p = BumpSenseClassifier_4.N45118a2613(i);
	    } else if (((Double) i[29]).doubleValue() > 10.31) {
	    p = BumpSenseClassifier_4.N6774a1d3620(i);
	    } 
	    return p;
	  }
	  static double N45118a2613(Object []i) {
	    double p = Double.NaN;
	    if (i[18] == null) {
	      p = 1;
	    } else if (((Double) i[18]).doubleValue() <= 0.58) {
	    p = BumpSenseClassifier_4.N682835e4614(i);
	    } else if (((Double) i[18]).doubleValue() > 0.58) {
	    p = BumpSenseClassifier_4.N6b191295618(i);
	    } 
	    return p;
	  }
	  static double N682835e4614(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 1;
	    } else if (((Double) i[10]).doubleValue() <= 1.79) {
	    p = BumpSenseClassifier_4.N27ea4128615(i);
	    } else if (((Double) i[10]).doubleValue() > 1.79) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N27ea4128615(Object []i) {
	    double p = Double.NaN;
	    if (i[26] == null) {
	      p = 0;
	    } else if (((Double) i[26]).doubleValue() <= 7.75) {
	      p = 0;
	    } else if (((Double) i[26]).doubleValue() > 7.75) {
	    p = BumpSenseClassifier_4.N45bbd91616(i);
	    } 
	    return p;
	  }
	  static double N45bbd91616(Object []i) {
	    double p = Double.NaN;
	    if (i[51] == null) {
	      p = 1;
	    } else if (((Double) i[51]).doubleValue() <= -0.5) {
	    p = BumpSenseClassifier_4.N22fa7cd3617(i);
	    } else if (((Double) i[51]).doubleValue() > -0.5) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N22fa7cd3617(Object []i) {
	    double p = Double.NaN;
	    if (i[159] == null) {
	      p = 1;
	    } else if (((Double) i[159]).doubleValue() <= 0.46) {
	      p = 1;
	    } else if (((Double) i[159]).doubleValue() > 0.46) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6b191295618(Object []i) {
	    double p = Double.NaN;
	    if (i[51] == null) {
	      p = 1;
	    } else if (((Double) i[51]).doubleValue() <= 1.32) {
	      p = 1;
	    } else if (((Double) i[51]).doubleValue() > 1.32) {
	    p = BumpSenseClassifier_4.N3b132b21619(i);
	    } 
	    return p;
	  }
	  static double N3b132b21619(Object []i) {
	    double p = Double.NaN;
	    if (i[130] == null) {
	      p = 0;
	    } else if (((Double) i[130]).doubleValue() <= 1.87) {
	      p = 0;
	    } else if (((Double) i[130]).doubleValue() > 1.87) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6774a1d3620(Object []i) {
	    double p = Double.NaN;
	    if (i[28] == null) {
	      p = 1;
	    } else if (((Double) i[28]).doubleValue() <= 1.12) {
	      p = 1;
	    } else if (((Double) i[28]).doubleValue() > 1.12) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N1a2c58b5621(Object []i) {
	    double p = Double.NaN;
	    if (i[150] == null) {
	      p = 1;
	    } else if (((Double) i[150]).doubleValue() <= 1.38) {
	      p = 1;
	    } else if (((Double) i[150]).doubleValue() > 1.38) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class BumpSenseClassifier_5 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseClassifier_5.N5573e07f622(i);
	    return p;
	  }
	  static double N5573e07f622(Object []i) {
	    double p = Double.NaN;
	    if (i[68] == null) {
	      p = 0;
	    } else if (((Double) i[68]).doubleValue() <= 6.36) {
	      p = 0;
	    } else if (((Double) i[68]).doubleValue() > 6.36) {
	    p = BumpSenseClassifier_5.N2a97ddad623(i);
	    } 
	    return p;
	  }
	  static double N2a97ddad623(Object []i) {
	    double p = Double.NaN;
	    if (i[148] == null) {
	      p = 1;
	    } else if (((Double) i[148]).doubleValue() <= 3.88) {
	    p = BumpSenseClassifier_5.N585a9eb3624(i);
	    } else if (((Double) i[148]).doubleValue() > 3.88) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N585a9eb3624(Object []i) {
	    double p = Double.NaN;
	    if (i[162] == null) {
	      p = 1;
	    } else if (((Double) i[162]).doubleValue() <= 1.38) {
	    p = BumpSenseClassifier_5.N25692716625(i);
	    } else if (((Double) i[162]).doubleValue() > 1.38) {
	    p = BumpSenseClassifier_5.N3f29a9f5637(i);
	    } 
	    return p;
	  }
	  static double N25692716625(Object []i) {
	    double p = Double.NaN;
	    if (i[137] == null) {
	      p = 0;
	    } else if (((Double) i[137]).doubleValue() <= 7.88) {
	    p = BumpSenseClassifier_5.N1a85288a626(i);
	    } else if (((Double) i[137]).doubleValue() > 7.88) {
	    p = BumpSenseClassifier_5.N1c2889a0627(i);
	    } 
	    return p;
	  }
	  static double N1a85288a626(Object []i) {
	    double p = Double.NaN;
	    if (i[50] == null) {
	      p = 1;
	    } else if (((Double) i[50]).doubleValue() <= 7.59) {
	      p = 1;
	    } else if (((Double) i[50]).doubleValue() > 7.59) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N1c2889a0627(Object []i) {
	    double p = Double.NaN;
	    if (i[164] == null) {
	      p = 0;
	    } else if (((Double) i[164]).doubleValue() <= 9.5) {
	    p = BumpSenseClassifier_5.N296375d1628(i);
	    } else if (((Double) i[164]).doubleValue() > 9.5) {
	    p = BumpSenseClassifier_5.N40cc0191629(i);
	    } 
	    return p;
	  }
	  static double N296375d1628(Object []i) {
	    double p = Double.NaN;
	    if (i[152] == null) {
	      p = 0;
	    } else if (((Double) i[152]).doubleValue() <= 9.35) {
	      p = 0;
	    } else if (((Double) i[152]).doubleValue() > 9.35) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N40cc0191629(Object []i) {
	    double p = Double.NaN;
	    if (i[34] == null) {
	      p = 1;
	    } else if (((Double) i[34]).doubleValue() <= 0.98) {
	      p = 1;
	    } else if (((Double) i[34]).doubleValue() > 0.98) {
	    p = BumpSenseClassifier_5.N117af7d3630(i);
	    } 
	    return p;
	  }
	  static double N117af7d3630(Object []i) {
	    double p = Double.NaN;
	    if (i[33] == null) {
	      p = 0;
	    } else if (((Double) i[33]).doubleValue() <= -0.43) {
	    p = BumpSenseClassifier_5.N2024469c631(i);
	    } else if (((Double) i[33]).doubleValue() > -0.43) {
	    p = BumpSenseClassifier_5.N2d97bc40632(i);
	    } 
	    return p;
	  }
	  static double N2024469c631(Object []i) {
	    double p = Double.NaN;
	    if (i[150] == null) {
	      p = 1;
	    } else if (((Double) i[150]).doubleValue() <= 0.0) {
	      p = 1;
	    } else if (((Double) i[150]).doubleValue() > 0.0) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N2d97bc40632(Object []i) {
	    double p = Double.NaN;
	    if (i[67] == null) {
	      p = 1;
	    } else if (((Double) i[67]).doubleValue() <= 0.13) {
	      p = 1;
	    } else if (((Double) i[67]).doubleValue() > 0.13) {
	    p = BumpSenseClassifier_5.N44c82522633(i);
	    } 
	    return p;
	  }
	  static double N44c82522633(Object []i) {
	    double p = Double.NaN;
	    if (i[59] == null) {
	      p = 1;
	    } else if (((Double) i[59]).doubleValue() <= 9.94) {
	    p = BumpSenseClassifier_5.N2ffdfe75634(i);
	    } else if (((Double) i[59]).doubleValue() > 9.94) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N2ffdfe75634(Object []i) {
	    double p = Double.NaN;
	    if (i[140] == null) {
	      p = 1;
	    } else if (((Double) i[140]).doubleValue() <= 9.6) {
	    p = BumpSenseClassifier_5.N4c4ccbf0635(i);
	    } else if (((Double) i[140]).doubleValue() > 9.6) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4c4ccbf0635(Object []i) {
	    double p = Double.NaN;
	    if (i[69] == null) {
	      p = 1;
	    } else if (((Double) i[69]).doubleValue() <= -0.17) {
	    p = BumpSenseClassifier_5.N45e120b2636(i);
	    } else if (((Double) i[69]).doubleValue() > -0.17) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N45e120b2636(Object []i) {
	    double p = Double.NaN;
	    if (i[163] == null) {
	      p = 0;
	    } else if (((Double) i[163]).doubleValue() <= 0.15) {
	      p = 0;
	    } else if (((Double) i[163]).doubleValue() > 0.15) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3f29a9f5637(Object []i) {
	    double p = Double.NaN;
	    if (i[159] == null) {
	      p = 1;
	    } else if (((Double) i[159]).doubleValue() <= 1.07) {
	      p = 1;
	    } else if (((Double) i[159]).doubleValue() > 1.07) {
	    p = BumpSenseClassifier_5.N48553438638(i);
	    } 
	    return p;
	  }
	  static double N48553438638(Object []i) {
	    double p = Double.NaN;
	    if (i[86] == null) {
	      p = 1;
	    } else if (((Double) i[86]).doubleValue() <= 7.18) {
	      p = 1;
	    } else if (((Double) i[86]).doubleValue() > 7.18) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class BumpSenseClassifier_6 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseClassifier_6.N51d76da1639(i);
	    return p;
	  }
	  static double N51d76da1639(Object []i) {
	    double p = Double.NaN;
	    if (i[163] == null) {
	      p = 0;
	    } else if (((Double) i[163]).doubleValue() <= -0.61) {
	    p = BumpSenseClassifier_6.N165e8f01640(i);
	    } else if (((Double) i[163]).doubleValue() > -0.61) {
	    p = BumpSenseClassifier_6.N7a9274ba646(i);
	    } 
	    return p;
	  }
	  static double N165e8f01640(Object []i) {
	    double p = Double.NaN;
	    if (i[157] == null) {
	      p = 0;
	    } else if (((Double) i[157]).doubleValue() <= -0.31) {
	    p = BumpSenseClassifier_6.N19fe9620641(i);
	    } else if (((Double) i[157]).doubleValue() > -0.31) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N19fe9620641(Object []i) {
	    double p = Double.NaN;
	    if (i[162] == null) {
	      p = 1;
	    } else if (((Double) i[162]).doubleValue() <= 0.61) {
	    p = BumpSenseClassifier_6.N19321c35642(i);
	    } else if (((Double) i[162]).doubleValue() > 0.61) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N19321c35642(Object []i) {
	    double p = Double.NaN;
	    if (i[150] == null) {
	      p = 1;
	    } else if (((Double) i[150]).doubleValue() <= 0.61) {
	    p = BumpSenseClassifier_6.N28d9e87f643(i);
	    } else if (((Double) i[150]).doubleValue() > 0.61) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N28d9e87f643(Object []i) {
	    double p = Double.NaN;
	    if (i[136] == null) {
	      p = 1;
	    } else if (((Double) i[136]).doubleValue() <= 2.48) {
	    p = BumpSenseClassifier_6.N7a2efecc644(i);
	    } else if (((Double) i[136]).doubleValue() > 2.48) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7a2efecc644(Object []i) {
	    double p = Double.NaN;
	    if (i[29] == null) {
	      p = 1;
	    } else if (((Double) i[29]).doubleValue() <= 9.37) {
	      p = 1;
	    } else if (((Double) i[29]).doubleValue() > 9.37) {
	    p = BumpSenseClassifier_6.N235a41bf645(i);
	    } 
	    return p;
	  }
	  static double N235a41bf645(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 0.32) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() > 0.32) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7a9274ba646(Object []i) {
	    double p = Double.NaN;
	    if (i[162] == null) {
	      p = 1;
	    } else if (((Double) i[162]).doubleValue() <= 1.38) {
	    p = BumpSenseClassifier_6.N252d9e34647(i);
	    } else if (((Double) i[162]).doubleValue() > 1.38) {
	    p = BumpSenseClassifier_6.N29042f37652(i);
	    } 
	    return p;
	  }
	  static double N252d9e34647(Object []i) {
	    double p = Double.NaN;
	    if (i[32] == null) {
	      p = 0;
	    } else if (((Double) i[32]).doubleValue() <= 7.4) {
	    p = BumpSenseClassifier_6.N55ed7afd648(i);
	    } else if (((Double) i[32]).doubleValue() > 7.4) {
	    p = BumpSenseClassifier_6.N5a25a41d649(i);
	    } 
	    return p;
	  }
	  static double N55ed7afd648(Object []i) {
	    double p = Double.NaN;
	    if (i[71] == null) {
	      p = 0;
	    } else if (((Double) i[71]).doubleValue() <= 9.41) {
	      p = 0;
	    } else if (((Double) i[71]).doubleValue() > 9.41) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5a25a41d649(Object []i) {
	    double p = Double.NaN;
	    if (i[29] == null) {
	      p = 1;
	    } else if (((Double) i[29]).doubleValue() <= 10.3) {
	      p = 1;
	    } else if (((Double) i[29]).doubleValue() > 10.3) {
	    p = BumpSenseClassifier_6.N5d399a27650(i);
	    } 
	    return p;
	  }
	  static double N5d399a27650(Object []i) {
	    double p = Double.NaN;
	    if (i[148] == null) {
	      p = 1;
	    } else if (((Double) i[148]).doubleValue() <= 2.76) {
	    p = BumpSenseClassifier_6.N70b7a641651(i);
	    } else if (((Double) i[148]).doubleValue() > 2.76) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N70b7a641651(Object []i) {
	    double p = Double.NaN;
	    if (i[38] == null) {
	      p = 1;
	    } else if (((Double) i[38]).doubleValue() <= 9.53) {
	      p = 1;
	    } else if (((Double) i[38]).doubleValue() > 9.53) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N29042f37652(Object []i) {
	    double p = Double.NaN;
	    if (i[156] == null) {
	      p = 1;
	    } else if (((Double) i[156]).doubleValue() <= 1.38) {
	      p = 1;
	    } else if (((Double) i[156]).doubleValue() > 1.38) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class BumpSenseClassifier_7 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseClassifier_7.N51b7d8ea653(i);
	    return p;
	  }
	  static double N51b7d8ea653(Object []i) {
	    double p = Double.NaN;
	    if (i[100] == null) {
	      p = 1;
	    } else if (((Double) i[100]).doubleValue() <= -0.12) {
	    p = BumpSenseClassifier_7.N7d02148f654(i);
	    } else if (((Double) i[100]).doubleValue() > -0.12) {
	    p = BumpSenseClassifier_7.N1393f867655(i);
	    } 
	    return p;
	  }
	  static double N7d02148f654(Object []i) {
	    double p = Double.NaN;
	    if (i[157] == null) {
	      p = 0;
	    } else if (((Double) i[157]).doubleValue() <= -3.83) {
	      p = 0;
	    } else if (((Double) i[157]).doubleValue() > -3.83) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N1393f867655(Object []i) {
	    double p = Double.NaN;
	    if (i[67] == null) {
	      p = 1;
	    } else if (((Double) i[67]).doubleValue() <= -0.33) {
	    p = BumpSenseClassifier_7.N57993c3b656(i);
	    } else if (((Double) i[67]).doubleValue() > -0.33) {
	    p = BumpSenseClassifier_7.Nd41726b657(i);
	    } 
	    return p;
	  }
	  static double N57993c3b656(Object []i) {
	    double p = Double.NaN;
	    if (i[141] == null) {
	      p = 1;
	    } else if (((Double) i[141]).doubleValue() <= 0.6) {
	      p = 1;
	    } else if (((Double) i[141]).doubleValue() > 0.6) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double Nd41726b657(Object []i) {
	    double p = Double.NaN;
	    if (i[54] == null) {
	      p = 0;
	    } else if (((Double) i[54]).doubleValue() <= 2.78) {
	    p = BumpSenseClassifier_7.N43bed599658(i);
	    } else if (((Double) i[54]).doubleValue() > 2.78) {
	    p = BumpSenseClassifier_7.N1868eadb667(i);
	    } 
	    return p;
	  }
	  static double N43bed599658(Object []i) {
	    double p = Double.NaN;
	    if (i[87] == null) {
	      p = 0;
	    } else if (((Double) i[87]).doubleValue() <= 1.61) {
	    p = BumpSenseClassifier_7.N25b9528e659(i);
	    } else if (((Double) i[87]).doubleValue() > 1.61) {
	    p = BumpSenseClassifier_7.N48abfa29665(i);
	    } 
	    return p;
	  }
	  static double N25b9528e659(Object []i) {
	    double p = Double.NaN;
	    if (i[91] == null) {
	      p = 0;
	    } else if (((Double) i[91]).doubleValue() <= 0.66) {
	    p = BumpSenseClassifier_7.N29dafbfb660(i);
	    } else if (((Double) i[91]).doubleValue() > 0.66) {
	    p = BumpSenseClassifier_7.N67d53134661(i);
	    } 
	    return p;
	  }
	  static double N29dafbfb660(Object []i) {
	    double p = Double.NaN;
	    if (i[157] == null) {
	      p = 0;
	    } else if (((Double) i[157]).doubleValue() <= -0.77) {
	      p = 0;
	    } else if (((Double) i[157]).doubleValue() > -0.77) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N67d53134661(Object []i) {
	    double p = Double.NaN;
	    if (i[90] == null) {
	      p = 0;
	    } else if (((Double) i[90]).doubleValue() <= 0.45) {
	      p = 0;
	    } else if (((Double) i[90]).doubleValue() > 0.45) {
	    p = BumpSenseClassifier_7.N5d91822d662(i);
	    } 
	    return p;
	  }
	  static double N5d91822d662(Object []i) {
	    double p = Double.NaN;
	    if (i[84] == null) {
	      p = 1;
	    } else if (((Double) i[84]).doubleValue() <= 0.83) {
	      p = 1;
	    } else if (((Double) i[84]).doubleValue() > 0.83) {
	    p = BumpSenseClassifier_7.N7bf98858663(i);
	    } 
	    return p;
	  }
	  static double N7bf98858663(Object []i) {
	    double p = Double.NaN;
	    if (i[62] == null) {
	      p = 0;
	    } else if (((Double) i[62]).doubleValue() <= 9.45) {
	    p = BumpSenseClassifier_7.N3b6688fe664(i);
	    } else if (((Double) i[62]).doubleValue() > 9.45) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3b6688fe664(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() <= 9.28) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() > 9.28) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N48abfa29665(Object []i) {
	    double p = Double.NaN;
	    if (i[58] == null) {
	      p = 1;
	    } else if (((Double) i[58]).doubleValue() <= 2.12) {
	      p = 1;
	    } else if (((Double) i[58]).doubleValue() > 2.12) {
	    p = BumpSenseClassifier_7.N12b4bf05666(i);
	    } 
	    return p;
	  }
	  static double N12b4bf05666(Object []i) {
	    double p = Double.NaN;
	    if (i[159] == null) {
	      p = 1;
	    } else if (((Double) i[159]).doubleValue() <= 0.15) {
	      p = 1;
	    } else if (((Double) i[159]).doubleValue() > 0.15) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N1868eadb667(Object []i) {
	    double p = Double.NaN;
	    if (i[90] == null) {
	      p = 1;
	    } else if (((Double) i[90]).doubleValue() <= 2.25) {
	      p = 1;
	    } else if (((Double) i[90]).doubleValue() > 2.25) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class BumpSenseClassifier_8 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseClassifier_8.N1012dc62668(i);
	    return p;
	  }
	  static double N1012dc62668(Object []i) {
	    double p = Double.NaN;
	    if (i[156] == null) {
	      p = 1;
	    } else if (((Double) i[156]).doubleValue() <= -0.15) {
	      p = 1;
	    } else if (((Double) i[156]).doubleValue() > -0.15) {
	    p = BumpSenseClassifier_8.N4642ae2c669(i);
	    } 
	    return p;
	  }
	  static double N4642ae2c669(Object []i) {
	    double p = Double.NaN;
	    if (i[68] == null) {
	      p = 0;
	    } else if (((Double) i[68]).doubleValue() <= 10.57) {
	    p = BumpSenseClassifier_8.N43b8eebd670(i);
	    } else if (((Double) i[68]).doubleValue() > 10.57) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N43b8eebd670(Object []i) {
	    double p = Double.NaN;
	    if (i[100] == null) {
	      p = 1;
	    } else if (((Double) i[100]).doubleValue() <= -2.0) {
	      p = 1;
	    } else if (((Double) i[100]).doubleValue() > -2.0) {
	    p = BumpSenseClassifier_8.N2241dd07671(i);
	    } 
	    return p;
	  }
	  static double N2241dd07671(Object []i) {
	    double p = Double.NaN;
	    if (i[156] == null) {
	      p = 1;
	    } else if (((Double) i[156]).doubleValue() <= 0.15) {
	    p = BumpSenseClassifier_8.N12160823672(i);
	    } else if (((Double) i[156]).doubleValue() > 0.15) {
	    p = BumpSenseClassifier_8.N64703b1b673(i);
	    } 
	    return p;
	  }
	  static double N12160823672(Object []i) {
	    double p = Double.NaN;
	    if (i[155] == null) {
	      p = 1;
	    } else if (((Double) i[155]).doubleValue() <= 10.11) {
	      p = 1;
	    } else if (((Double) i[155]).doubleValue() > 10.11) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N64703b1b673(Object []i) {
	    double p = Double.NaN;
	    if (i[159] == null) {
	      p = 0;
	    } else if (((Double) i[159]).doubleValue() <= 0.31) {
	    p = BumpSenseClassifier_8.N4389d21674(i);
	    } else if (((Double) i[159]).doubleValue() > 0.31) {
	    p = BumpSenseClassifier_8.N20d3e3b1675(i);
	    } 
	    return p;
	  }
	  static double N4389d21674(Object []i) {
	    double p = Double.NaN;
	    if (i[129] == null) {
	      p = 1;
	    } else if (((Double) i[129]).doubleValue() <= 1.45) {
	      p = 1;
	    } else if (((Double) i[129]).doubleValue() > 1.45) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N20d3e3b1675(Object []i) {
	    double p = Double.NaN;
	    if (i[164] == null) {
	      p = 0;
	    } else if (((Double) i[164]).doubleValue() <= 9.96) {
	    p = BumpSenseClassifier_8.N37098a4d676(i);
	    } else if (((Double) i[164]).doubleValue() > 9.96) {
	    p = BumpSenseClassifier_8.N6cebf311678(i);
	    } 
	    return p;
	  }
	  static double N37098a4d676(Object []i) {
	    double p = Double.NaN;
	    if (i[155] == null) {
	      p = 0;
	    } else if (((Double) i[155]).doubleValue() <= 10.42) {
	      p = 0;
	    } else if (((Double) i[155]).doubleValue() > 10.42) {
	    p = BumpSenseClassifier_8.N5356e175677(i);
	    } 
	    return p;
	  }
	  static double N5356e175677(Object []i) {
	    double p = Double.NaN;
	    if (i[154] == null) {
	      p = 0;
	    } else if (((Double) i[154]).doubleValue() <= -0.46) {
	      p = 0;
	    } else if (((Double) i[154]).doubleValue() > -0.46) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6cebf311678(Object []i) {
	    double p = Double.NaN;
	    if (i[129] == null) {
	      p = 0;
	    } else if (((Double) i[129]).doubleValue() <= -0.41) {
	      p = 0;
	    } else if (((Double) i[129]).doubleValue() > -0.41) {
	    p = BumpSenseClassifier_8.N76a318f4679(i);
	    } 
	    return p;
	  }
	  static double N76a318f4679(Object []i) {
	    double p = Double.NaN;
	    if (i[158] == null) {
	      p = 0;
	    } else if (((Double) i[158]).doubleValue() <= 9.65) {
	      p = 0;
	    } else if (((Double) i[158]).doubleValue() > 9.65) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class BumpSenseClassifier_9 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = BumpSenseClassifier_9.N4dbb7805680(i);
	    return p;
	  }
	  static double N4dbb7805680(Object []i) {
	    double p = Double.NaN;
	    if (i[160] == null) {
	      p = 0;
	    } else if (((Double) i[160]).doubleValue() <= -3.37) {
	    p = BumpSenseClassifier_9.N4ec4b821681(i);
	    } else if (((Double) i[160]).doubleValue() > -3.37) {
	    p = BumpSenseClassifier_9.N3edb3d3e683(i);
	    } 
	    return p;
	  }
	  static double N4ec4b821681(Object []i) {
	    double p = Double.NaN;
	    if (i[164] == null) {
	      p = 0;
	    } else if (((Double) i[164]).doubleValue() <= 9.19) {
	      p = 0;
	    } else if (((Double) i[164]).doubleValue() > 9.19) {
	    p = BumpSenseClassifier_9.N5514a6ed682(i);
	    } 
	    return p;
	  }
	  static double N5514a6ed682(Object []i) {
	    double p = Double.NaN;
	    if (i[152] == null) {
	      p = 0;
	    } else if (((Double) i[152]).doubleValue() <= 9.35) {
	      p = 0;
	    } else if (((Double) i[152]).doubleValue() > 9.35) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3edb3d3e683(Object []i) {
	    double p = Double.NaN;
	    if (i[149] == null) {
	      p = 0;
	    } else if (((Double) i[149]).doubleValue() <= 7.27) {
	      p = 0;
	    } else if (((Double) i[149]).doubleValue() > 7.27) {
	    p = BumpSenseClassifier_9.N2b91d1af684(i);
	    } 
	    return p;
	  }
	  static double N2b91d1af684(Object []i) {
	    double p = Double.NaN;
	    if (i[62] == null) {
	      p = 0;
	    } else if (((Double) i[62]).doubleValue() <= 6.51) {
	      p = 0;
	    } else if (((Double) i[62]).doubleValue() > 6.51) {
	    p = BumpSenseClassifier_9.N725d4e81685(i);
	    } 
	    return p;
	  }
	  static double N725d4e81685(Object []i) {
	    double p = Double.NaN;
	    if (i[163] == null) {
	      p = 1;
	    } else if (((Double) i[163]).doubleValue() <= 1.38) {
	    p = BumpSenseClassifier_9.N4bcd31cf686(i);
	    } else if (((Double) i[163]).doubleValue() > 1.38) {
	    p = BumpSenseClassifier_9.N69f51d05696(i);
	    } 
	    return p;
	  }
	  static double N4bcd31cf686(Object []i) {
	    double p = Double.NaN;
	    if (i[104] == null) {
	      p = 0;
	    } else if (((Double) i[104]).doubleValue() <= 6.83) {
	      p = 0;
	    } else if (((Double) i[104]).doubleValue() > 6.83) {
	    p = BumpSenseClassifier_9.Nc8133ea687(i);
	    } 
	    return p;
	  }
	  static double Nc8133ea687(Object []i) {
	    double p = Double.NaN;
	    if (i[88] == null) {
	      p = 1;
	    } else if (((Double) i[88]).doubleValue() <= 0.65) {
	      p = 1;
	    } else if (((Double) i[88]).doubleValue() > 0.65) {
	    p = BumpSenseClassifier_9.N76774e0f688(i);
	    } 
	    return p;
	  }
	  static double N76774e0f688(Object []i) {
	    double p = Double.NaN;
	    if (i[84] == null) {
	      p = 0;
	    } else if (((Double) i[84]).doubleValue() <= -0.71) {
	      p = 0;
	    } else if (((Double) i[84]).doubleValue() > -0.71) {
	    p = BumpSenseClassifier_9.N12a5f78c689(i);
	    } 
	    return p;
	  }
	  static double N12a5f78c689(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= -2.27) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() > -2.27) {
	    p = BumpSenseClassifier_9.N4e1f11e4690(i);
	    } 
	    return p;
	  }
	  static double N4e1f11e4690(Object []i) {
	    double p = Double.NaN;
	    if (i[131] == null) {
	      p = 0;
	    } else if (((Double) i[131]).doubleValue() <= 7.63) {
	      p = 0;
	    } else if (((Double) i[131]).doubleValue() > 7.63) {
	    p = BumpSenseClassifier_9.N59cfb7cd691(i);
	    } 
	    return p;
	  }
	  static double N59cfb7cd691(Object []i) {
	    double p = Double.NaN;
	    if (i[152] == null) {
	      p = 0;
	    } else if (((Double) i[152]).doubleValue() <= 9.35) {
	    p = BumpSenseClassifier_9.N542c21cb692(i);
	    } else if (((Double) i[152]).doubleValue() > 9.35) {
	    p = BumpSenseClassifier_9.N1d5ec199693(i);
	    } 
	    return p;
	  }
	  static double N542c21cb692(Object []i) {
	    double p = Double.NaN;
	    if (i[14] == null) {
	      p = 1;
	    } else if (((Double) i[14]).doubleValue() <= 10.15) {
	      p = 1;
	    } else if (((Double) i[14]).doubleValue() > 10.15) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N1d5ec199693(Object []i) {
	    double p = Double.NaN;
	    if (i[94] == null) {
	      p = 1;
	    } else if (((Double) i[94]).doubleValue() <= 1.41) {
	    p = BumpSenseClassifier_9.N37f832df694(i);
	    } else if (((Double) i[94]).doubleValue() > 1.41) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N37f832df694(Object []i) {
	    double p = Double.NaN;
	    if (i[91] == null) {
	      p = 1;
	    } else if (((Double) i[91]).doubleValue() <= 1.13) {
	      p = 1;
	    } else if (((Double) i[91]).doubleValue() > 1.13) {
	    p = BumpSenseClassifier_9.N7d3eb2e695(i);
	    } 
	    return p;
	  }
	  static double N7d3eb2e695(Object []i) {
	    double p = Double.NaN;
	    if (i[164] == null) {
	      p = 0;
	    } else if (((Double) i[164]).doubleValue() <= 9.96) {
	      p = 0;
	    } else if (((Double) i[164]).doubleValue() > 9.96) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N69f51d05696(Object []i) {
	    double p = Double.NaN;
	    if (i[150] == null) {
	      p = 1;
	    } else if (((Double) i[150]).doubleValue() <= 1.07) {
	      p = 1;
	    } else if (((Double) i[150]).doubleValue() > 1.07) {
	      p = 0;
	    } 
	    return p;
	  }
	}