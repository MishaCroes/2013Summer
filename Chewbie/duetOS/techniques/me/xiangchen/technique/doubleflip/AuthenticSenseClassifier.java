package me.xiangchen.technique.doubleflip;

public class AuthenticSenseClassifier {

	  public static double classify(Object[] i) throws Exception {
	    double [] sums = new double [5];
	    sums[(int) AuthenticSenseClassifier_0.classify(i)] += 3.468336684499784;
	    sums[(int) AuthenticSenseClassifier_1.classify(i)] += 3.4366717698558236;
	    sums[(int) AuthenticSenseClassifier_2.classify(i)] += 3.3826592606632597;
	    sums[(int) AuthenticSenseClassifier_3.classify(i)] += 3.265951281446802;
	    sums[(int) AuthenticSenseClassifier_4.classify(i)] += 3.5147104512190066;
	    sums[(int) AuthenticSenseClassifier_5.classify(i)] += 3.308392777254387;
	    sums[(int) AuthenticSenseClassifier_6.classify(i)] += 3.459646910279713;
	    sums[(int) AuthenticSenseClassifier_7.classify(i)] += 3.504082446893405;
	    sums[(int) AuthenticSenseClassifier_8.classify(i)] += 3.3654646474273586;
	    sums[(int) AuthenticSenseClassifier_9.classify(i)] += 3.2061326527411227;
	    double maxV = sums[0];
	    int maxI = 0;
	    for (int j = 1; j < 5; j++) {
	      if (sums[j] > maxV) { maxV = sums[j]; maxI = j; }
	    }
	    return (double) maxI;
	  }
	}
	class AuthenticSenseClassifier_0 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = AuthenticSenseClassifier_0.N7ad9df71373(i);
	    return p;
	  }
	  static double N7ad9df71373(Object []i) {
	    double p = Double.NaN;
	    if (i[158] == null) {
	      p = 3;
	    } else if (((Double) i[158]).doubleValue() <= -5.06) {
	    p = AuthenticSenseClassifier_0.N75dcb2b9374(i);
	    } else if (((Double) i[158]).doubleValue() > -5.06) {
	    p = AuthenticSenseClassifier_0.N7b6903c0376(i);
	    } 
	    return p;
	  }
	  static double N75dcb2b9374(Object []i) {
	    double p = Double.NaN;
	    if (i[177] == null) {
	      p = 3;
	    } else if (((Double) i[177]).doubleValue() <= 0.46) {
	    p = AuthenticSenseClassifier_0.N6c59cc22375(i);
	    } else if (((Double) i[177]).doubleValue() > 0.46) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6c59cc22375(Object []i) {
	    double p = Double.NaN;
	    if (i[179] == null) {
	      p = 4;
	    } else if (((Double) i[179]).doubleValue() <= -2.3) {
	      p = 4;
	    } else if (((Double) i[179]).doubleValue() > -2.3) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N7b6903c0376(Object []i) {
	    double p = Double.NaN;
	    if (i[179] == null) {
	      p = 2;
	    } else if (((Double) i[179]).doubleValue() <= -3.52) {
	    p = AuthenticSenseClassifier_0.N2b75718c377(i);
	    } else if (((Double) i[179]).doubleValue() > -3.52) {
	    p = AuthenticSenseClassifier_0.N2b71b49e378(i);
	    } 
	    return p;
	  }
	  static double N2b75718c377(Object []i) {
	    double p = Double.NaN;
	    if (i[177] == null) {
	      p = 2;
	    } else if (((Double) i[177]).doubleValue() <= 0.92) {
	      p = 2;
	    } else if (((Double) i[177]).doubleValue() > 0.92) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N2b71b49e378(Object []i) {
	    double p = Double.NaN;
	    if (i[173] == null) {
	      p = 0;
	    } else if (((Double) i[173]).doubleValue() <= -3.22) {
	      p = 0;
	    } else if (((Double) i[173]).doubleValue() > -3.22) {
	    p = AuthenticSenseClassifier_0.N3609075a379(i);
	    } 
	    return p;
	  }
	  static double N3609075a379(Object []i) {
	    double p = Double.NaN;
	    if (i[152] == null) {
	      p = 0;
	    } else if (((Double) i[152]).doubleValue() <= -3.22) {
	      p = 0;
	    } else if (((Double) i[152]).doubleValue() > -3.22) {
	      p = 4;
	    } 
	    return p;
	  }
	}
	class AuthenticSenseClassifier_1 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = AuthenticSenseClassifier_1.Nac1c16d380(i);
	    return p;
	  }
	  static double Nac1c16d380(Object []i) {
	    double p = Double.NaN;
	    if (i[161] == null) {
	      p = 4;
	    } else if (((Double) i[161]).doubleValue() <= 7.35) {
	    p = AuthenticSenseClassifier_1.N3681e09f381(i);
	    } else if (((Double) i[161]).doubleValue() > 7.35) {
	    p = AuthenticSenseClassifier_1.N793df1ff383(i);
	    } 
	    return p;
	  }
	  static double N3681e09f381(Object []i) {
	    double p = Double.NaN;
	    if (i[161] == null) {
	      p = 3;
	    } else if (((Double) i[161]).doubleValue() <= -4.14) {
	    p = AuthenticSenseClassifier_1.N8c202ae382(i);
	    } else if (((Double) i[161]).doubleValue() > -4.14) {
	      p = 4;
	    } 
	    return p;
	  }
	  static double N8c202ae382(Object []i) {
	    double p = Double.NaN;
	    if (i[177] == null) {
	      p = 3;
	    } else if (((Double) i[177]).doubleValue() <= 0.61) {
	      p = 3;
	    } else if (((Double) i[177]).doubleValue() > 0.61) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N793df1ff383(Object []i) {
	    double p = Double.NaN;
	    if (i[179] == null) {
	      p = 2;
	    } else if (((Double) i[179]).doubleValue() <= 3.52) {
	    p = AuthenticSenseClassifier_1.N51dada88384(i);
	    } else if (((Double) i[179]).doubleValue() > 3.52) {
	      p = 4;
	    } 
	    return p;
	  }
	  static double N51dada88384(Object []i) {
	    double p = Double.NaN;
	    if (i[177] == null) {
	      p = 2;
	    } else if (((Double) i[177]).doubleValue() <= 0.92) {
	      p = 2;
	    } else if (((Double) i[177]).doubleValue() > 0.92) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class AuthenticSenseClassifier_2 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = AuthenticSenseClassifier_2.N774140b3385(i);
	    return p;
	  }
	  static double N774140b3385(Object []i) {
	    double p = Double.NaN;
	    if (i[178] == null) {
	      p = 2;
	    } else if (((Double) i[178]).doubleValue() <= 0.0) {
	    p = AuthenticSenseClassifier_2.N5cfee4ef386(i);
	    } else if (((Double) i[178]).doubleValue() > 0.0) {
	    p = AuthenticSenseClassifier_2.N27d92c96388(i);
	    } 
	    return p;
	  }
	  static double N5cfee4ef386(Object []i) {
	    double p = Double.NaN;
	    if (i[177] == null) {
	      p = 2;
	    } else if (((Double) i[177]).doubleValue() <= 0.15) {
	      p = 2;
	    } else if (((Double) i[177]).doubleValue() > 0.15) {
	    p = AuthenticSenseClassifier_2.N6268369b387(i);
	    } 
	    return p;
	  }
	  static double N6268369b387(Object []i) {
	    double p = Double.NaN;
	    if (i[163] == null) {
	      p = 4;
	    } else if (((Double) i[163]).doubleValue() <= -4.29) {
	      p = 4;
	    } else if (((Double) i[163]).doubleValue() > -4.29) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N27d92c96388(Object []i) {
	    double p = Double.NaN;
	    if (i[177] == null) {
	      p = 4;
	    } else if (((Double) i[177]).doubleValue() <= 0.92) {
	    p = AuthenticSenseClassifier_2.N22fe404a389(i);
	    } else if (((Double) i[177]).doubleValue() > 0.92) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N22fe404a389(Object []i) {
	    double p = Double.NaN;
	    if (i[179] == null) {
	      p = 4;
	    } else if (((Double) i[179]).doubleValue() <= -5.06) {
	      p = 4;
	    } else if (((Double) i[179]).doubleValue() > -5.06) {
	    p = AuthenticSenseClassifier_2.N622ecc38390(i);
	    } 
	    return p;
	  }
	  static double N622ecc38390(Object []i) {
	    double p = Double.NaN;
	    if (i[158] == null) {
	      p = 3;
	    } else if (((Double) i[158]).doubleValue() <= -3.22) {
	      p = 3;
	    } else if (((Double) i[158]).doubleValue() > -3.22) {
	    p = AuthenticSenseClassifier_2.N6e61a2e3391(i);
	    } 
	    return p;
	  }
	  static double N6e61a2e3391(Object []i) {
	    double p = Double.NaN;
	    if (i[111] == null) {
	      p = 4;
	    } else if (((Double) i[111]).doubleValue() <= 7.9) {
	      p = 4;
	    } else if (((Double) i[111]).doubleValue() > 7.9) {
	      p = 3;
	    } 
	    return p;
	  }
	}
	class AuthenticSenseClassifier_3 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = AuthenticSenseClassifier_3.N4c0d1db2392(i);
	    return p;
	  }
	  static double N4c0d1db2392(Object []i) {
	    double p = Double.NaN;
	    if (i[152] == null) {
	      p = 3;
	    } else if (((Double) i[152]).doubleValue() <= -9.35) {
	      p = 3;
	    } else if (((Double) i[152]).doubleValue() > -9.35) {
	    p = AuthenticSenseClassifier_3.N7118b81f393(i);
	    } 
	    return p;
	  }
	  static double N7118b81f393(Object []i) {
	    double p = Double.NaN;
	    if (i[167] == null) {
	      p = 1;
	    } else if (((Double) i[167]).doubleValue() <= -9.35) {
	    p = AuthenticSenseClassifier_3.Nde0353b394(i);
	    } else if (((Double) i[167]).doubleValue() > -9.35) {
	    p = AuthenticSenseClassifier_3.N7ac6bb9a395(i);
	    } 
	    return p;
	  }
	  static double Nde0353b394(Object []i) {
	    double p = Double.NaN;
	    if (i[57] == null) {
	      p = 1;
	    } else if (((Double) i[57]).doubleValue() <= -1.2) {
	      p = 1;
	    } else if (((Double) i[57]).doubleValue() > -1.2) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N7ac6bb9a395(Object []i) {
	    double p = Double.NaN;
	    if (i[178] == null) {
	      p = 2;
	    } else if (((Double) i[178]).doubleValue() <= -4.29) {
	    p = AuthenticSenseClassifier_3.Nd46ba6f396(i);
	    } else if (((Double) i[178]).doubleValue() > -4.29) {
	      p = 4;
	    } 
	    return p;
	  }
	  static double Nd46ba6f396(Object []i) {
	    double p = Double.NaN;
	    if (i[160] == null) {
	      p = 4;
	    } else if (((Double) i[160]).doubleValue() <= -6.44) {
	      p = 4;
	    } else if (((Double) i[160]).doubleValue() > -6.44) {
	    p = AuthenticSenseClassifier_3.N1e79d438397(i);
	    } 
	    return p;
	  }
	  static double N1e79d438397(Object []i) {
	    double p = Double.NaN;
	    if (i[177] == null) {
	      p = 2;
	    } else if (((Double) i[177]).doubleValue() <= 0.77) {
	      p = 2;
	    } else if (((Double) i[177]).doubleValue() > 0.77) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class AuthenticSenseClassifier_4 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = AuthenticSenseClassifier_4.N505bb829398(i);
	    return p;
	  }
	  static double N505bb829398(Object []i) {
	    double p = Double.NaN;
	    if (i[170] == null) {
	      p = 4;
	    } else if (((Double) i[170]).doubleValue() <= 10.42) {
	    p = AuthenticSenseClassifier_4.N3597b4f6399(i);
	    } else if (((Double) i[170]).doubleValue() > 10.42) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3597b4f6399(Object []i) {
	    double p = Double.NaN;
	    if (i[161] == null) {
	      p = 1;
	    } else if (((Double) i[161]).doubleValue() <= -8.27) {
	    p = AuthenticSenseClassifier_4.N7ae99df6400(i);
	    } else if (((Double) i[161]).doubleValue() > -8.27) {
	    p = AuthenticSenseClassifier_4.N1f865b82402(i);
	    } 
	    return p;
	  }
	  static double N7ae99df6400(Object []i) {
	    double p = Double.NaN;
	    if (i[177] == null) {
	      p = 3;
	    } else if (((Double) i[177]).doubleValue() <= 0.46) {
	    p = AuthenticSenseClassifier_4.N7f81c084401(i);
	    } else if (((Double) i[177]).doubleValue() > 0.46) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N7f81c084401(Object []i) {
	    double p = Double.NaN;
	    if (i[179] == null) {
	      p = 4;
	    } else if (((Double) i[179]).doubleValue() <= -3.06) {
	      p = 4;
	    } else if (((Double) i[179]).doubleValue() > -3.06) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N1f865b82402(Object []i) {
	    double p = Double.NaN;
	    if (i[178] == null) {
	      p = 2;
	    } else if (((Double) i[178]).doubleValue() <= -6.74) {
	    p = AuthenticSenseClassifier_4.N2de1c3f9403(i);
	    } else if (((Double) i[178]).doubleValue() > -6.74) {
	    p = AuthenticSenseClassifier_4.N401eea7c405(i);
	    } 
	    return p;
	  }
	  static double N2de1c3f9403(Object []i) {
	    double p = Double.NaN;
	    if (i[160] == null) {
	      p = 4;
	    } else if (((Double) i[160]).doubleValue() <= -6.44) {
	      p = 4;
	    } else if (((Double) i[160]).doubleValue() > -6.44) {
	    p = AuthenticSenseClassifier_4.N410927f7404(i);
	    } 
	    return p;
	  }
	  static double N410927f7404(Object []i) {
	    double p = Double.NaN;
	    if (i[177] == null) {
	      p = 2;
	    } else if (((Double) i[177]).doubleValue() <= 1.07) {
	      p = 2;
	    } else if (((Double) i[177]).doubleValue() > 1.07) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N401eea7c405(Object []i) {
	    double p = Double.NaN;
	    if (i[152] == null) {
	      p = 3;
	    } else if (((Double) i[152]).doubleValue() <= -7.97) {
	      p = 3;
	    } else if (((Double) i[152]).doubleValue() > -7.97) {
	      p = 4;
	    } 
	    return p;
	  }
	}
	class AuthenticSenseClassifier_5 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = AuthenticSenseClassifier_5.N2db493c7406(i);
	    return p;
	  }
	  static double N2db493c7406(Object []i) {
	    double p = Double.NaN;
	    if (i[164] == null) {
	      p = 3;
	    } else if (((Double) i[164]).doubleValue() <= -7.81) {
	    p = AuthenticSenseClassifier_5.N2a520542407(i);
	    } else if (((Double) i[164]).doubleValue() > -7.81) {
	    p = AuthenticSenseClassifier_5.N7724fc67409(i);
	    } 
	    return p;
	  }
	  static double N2a520542407(Object []i) {
	    double p = Double.NaN;
	    if (i[177] == null) {
	      p = 3;
	    } else if (((Double) i[177]).doubleValue() <= 0.61) {
	    p = AuthenticSenseClassifier_5.N6ed745c2408(i);
	    } else if (((Double) i[177]).doubleValue() > 0.61) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6ed745c2408(Object []i) {
	    double p = Double.NaN;
	    if (i[162] == null) {
	      p = 4;
	    } else if (((Double) i[162]).doubleValue() <= -0.31) {
	      p = 4;
	    } else if (((Double) i[162]).doubleValue() > -0.31) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N7724fc67409(Object []i) {
	    double p = Double.NaN;
	    if (i[173] == null) {
	      p = 4;
	    } else if (((Double) i[173]).doubleValue() <= 10.57) {
	    p = AuthenticSenseClassifier_5.N1d370b4d410(i);
	    } else if (((Double) i[173]).doubleValue() > 10.57) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N1d370b4d410(Object []i) {
	    double p = Double.NaN;
	    if (i[155] == null) {
	      p = 3;
	    } else if (((Double) i[155]).doubleValue() <= -8.43) {
	      p = 3;
	    } else if (((Double) i[155]).doubleValue() > -8.43) {
	    p = AuthenticSenseClassifier_5.N8c6fb37411(i);
	    } 
	    return p;
	  }
	  static double N8c6fb37411(Object []i) {
	    double p = Double.NaN;
	    if (i[145] == null) {
	      p = 2;
	    } else if (((Double) i[145]).doubleValue() <= 1.2) {
	    p = AuthenticSenseClassifier_5.N3f96dc61412(i);
	    } else if (((Double) i[145]).doubleValue() > 1.2) {
	      p = 4;
	    } 
	    return p;
	  }
	  static double N3f96dc61412(Object []i) {
	    double p = Double.NaN;
	    if (i[174] == null) {
	      p = 2;
	    } else if (((Double) i[174]).doubleValue() <= 0.61) {
	      p = 2;
	    } else if (((Double) i[174]).doubleValue() > 0.61) {
	      p = 4;
	    } 
	    return p;
	  }
	}
	class AuthenticSenseClassifier_6 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = AuthenticSenseClassifier_6.N495e84e4413(i);
	    return p;
	  }
	  static double N495e84e4413(Object []i) {
	    double p = Double.NaN;
	    if (i[158] == null) {
	      p = 1;
	    } else if (((Double) i[158]).doubleValue() <= -7.51) {
	    p = AuthenticSenseClassifier_6.N5c66ba5d414(i);
	    } else if (((Double) i[158]).doubleValue() > -7.51) {
	    p = AuthenticSenseClassifier_6.N68d40124416(i);
	    } 
	    return p;
	  }
	  static double N5c66ba5d414(Object []i) {
	    double p = Double.NaN;
	    if (i[177] == null) {
	      p = 3;
	    } else if (((Double) i[177]).doubleValue() <= 0.46) {
	    p = AuthenticSenseClassifier_6.N5c555f0f415(i);
	    } else if (((Double) i[177]).doubleValue() > 0.46) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5c555f0f415(Object []i) {
	    double p = Double.NaN;
	    if (i[50] == null) {
	      p = 4;
	    } else if (((Double) i[50]).doubleValue() <= 6.9) {
	      p = 4;
	    } else if (((Double) i[50]).doubleValue() > 6.9) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N68d40124416(Object []i) {
	    double p = Double.NaN;
	    if (i[170] == null) {
	      p = 3;
	    } else if (((Double) i[170]).doubleValue() <= -9.35) {
	      p = 3;
	    } else if (((Double) i[170]).doubleValue() > -9.35) {
	    p = AuthenticSenseClassifier_6.N36971840417(i);
	    } 
	    return p;
	  }
	  static double N36971840417(Object []i) {
	    double p = Double.NaN;
	    if (i[177] == null) {
	      p = 2;
	    } else if (((Double) i[177]).doubleValue() <= 0.77) {
	    p = AuthenticSenseClassifier_6.N79b92dbf418(i);
	    } else if (((Double) i[177]).doubleValue() > 0.77) {
	    p = AuthenticSenseClassifier_6.N495e362c420(i);
	    } 
	    return p;
	  }
	  static double N79b92dbf418(Object []i) {
	    double p = Double.NaN;
	    if (i[162] == null) {
	      p = 4;
	    } else if (((Double) i[162]).doubleValue() <= 1.69) {
	    p = AuthenticSenseClassifier_6.N6c6a9507419(i);
	    } else if (((Double) i[162]).doubleValue() > 1.69) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N6c6a9507419(Object []i) {
	    double p = Double.NaN;
	    if (i[156] == null) {
	      p = 4;
	    } else if (((Double) i[156]).doubleValue() <= 1.23) {
	      p = 4;
	    } else if (((Double) i[156]).doubleValue() > 1.23) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N495e362c420(Object []i) {
	    double p = Double.NaN;
	    if (i[142] == null) {
	      p = 0;
	    } else if (((Double) i[142]).doubleValue() <= 3.2) {
	    p = AuthenticSenseClassifier_6.N4836a855421(i);
	    } else if (((Double) i[142]).doubleValue() > 3.2) {
	      p = 4;
	    } 
	    return p;
	  }
	  static double N4836a855421(Object []i) {
	    double p = Double.NaN;
	    if (i[168] == null) {
	      p = 0;
	    } else if (((Double) i[168]).doubleValue() <= 3.37) {
	      p = 0;
	    } else if (((Double) i[168]).doubleValue() > 3.37) {
	      p = 4;
	    } 
	    return p;
	  }
	}
	class AuthenticSenseClassifier_7 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = AuthenticSenseClassifier_7.N7c65897c422(i);
	    return p;
	  }
	  static double N7c65897c422(Object []i) {
	    double p = Double.NaN;
	    if (i[178] == null) {
	      p = 4;
	    } else if (((Double) i[178]).doubleValue() <= 0.31) {
	    p = AuthenticSenseClassifier_7.N6e256bb1423(i);
	    } else if (((Double) i[178]).doubleValue() > 0.31) {
	    p = AuthenticSenseClassifier_7.Na8be055428(i);
	    } 
	    return p;
	  }
	  static double N6e256bb1423(Object []i) {
	    double p = Double.NaN;
	    if (i[90] == null) {
	      p = 4;
	    } else if (((Double) i[90]).doubleValue() <= 5.4) {
	    p = AuthenticSenseClassifier_7.N5ac169f5424(i);
	    } else if (((Double) i[90]).doubleValue() > 5.4) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N5ac169f5424(Object []i) {
	    double p = Double.NaN;
	    if (i[179] == null) {
	      p = 0;
	    } else if (((Double) i[179]).doubleValue() <= -3.52) {
	    p = AuthenticSenseClassifier_7.N5013825f425(i);
	    } else if (((Double) i[179]).doubleValue() > -3.52) {
	    p = AuthenticSenseClassifier_7.N30d4540b426(i);
	    } 
	    return p;
	  }
	  static double N5013825f425(Object []i) {
	    double p = Double.NaN;
	    if (i[156] == null) {
	      p = 0;
	    } else if (((Double) i[156]).doubleValue() <= 0.61) {
	      p = 0;
	    } else if (((Double) i[156]).doubleValue() > 0.61) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N30d4540b426(Object []i) {
	    double p = Double.NaN;
	    if (i[163] == null) {
	      p = 4;
	    } else if (((Double) i[163]).doubleValue() <= 0.46) {
	    p = AuthenticSenseClassifier_7.N43d9b738427(i);
	    } else if (((Double) i[163]).doubleValue() > 0.46) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N43d9b738427(Object []i) {
	    double p = Double.NaN;
	    if (i[175] == null) {
	      p = 4;
	    } else if (((Double) i[175]).doubleValue() <= 0.92) {
	      p = 4;
	    } else if (((Double) i[175]).doubleValue() > 0.92) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double Na8be055428(Object []i) {
	    double p = Double.NaN;
	    if (i[177] == null) {
	      p = 3;
	    } else if (((Double) i[177]).doubleValue() <= 0.61) {
	    p = AuthenticSenseClassifier_7.N6534f1db429(i);
	    } else if (((Double) i[177]).doubleValue() > 0.61) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6534f1db429(Object []i) {
	    double p = Double.NaN;
	    if (i[179] == null) {
	      p = 4;
	    } else if (((Double) i[179]).doubleValue() <= -5.06) {
	      p = 4;
	    } else if (((Double) i[179]).doubleValue() > -5.06) {
	      p = 3;
	    } 
	    return p;
	  }
	}
	class AuthenticSenseClassifier_8 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = AuthenticSenseClassifier_8.N76f294c5430(i);
	    return p;
	  }
	  static double N76f294c5430(Object []i) {
	    double p = Double.NaN;
	    if (i[155] == null) {
	      p = 3;
	    } else if (((Double) i[155]).doubleValue() <= -7.66) {
	    p = AuthenticSenseClassifier_8.N30054e85431(i);
	    } else if (((Double) i[155]).doubleValue() > -7.66) {
	    p = AuthenticSenseClassifier_8.N2c661664432(i);
	    } 
	    return p;
	  }
	  static double N30054e85431(Object []i) {
	    double p = Double.NaN;
	    if (i[174] == null) {
	      p = 3;
	    } else if (((Double) i[174]).doubleValue() <= 0.61) {
	      p = 3;
	    } else if (((Double) i[174]).doubleValue() > 0.61) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2c661664432(Object []i) {
	    double p = Double.NaN;
	    if (i[167] == null) {
	      p = 1;
	    } else if (((Double) i[167]).doubleValue() <= -7.66) {
	    p = AuthenticSenseClassifier_8.N62481601433(i);
	    } else if (((Double) i[167]).doubleValue() > -7.66) {
	    p = AuthenticSenseClassifier_8.N6a9cce0f434(i);
	    } 
	    return p;
	  }
	  static double N62481601433(Object []i) {
	    double p = Double.NaN;
	    if (i[157] == null) {
	      p = 3;
	    } else if (((Double) i[157]).doubleValue() <= 6.9) {
	      p = 3;
	    } else if (((Double) i[157]).doubleValue() > 6.9) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6a9cce0f434(Object []i) {
	    double p = Double.NaN;
	    if (i[77] == null) {
	      p = 4;
	    } else if (((Double) i[77]).doubleValue() <= 10.5) {
	    p = AuthenticSenseClassifier_8.N5c9c7177435(i);
	    } else if (((Double) i[77]).doubleValue() > 10.5) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5c9c7177435(Object []i) {
	    double p = Double.NaN;
	    if (i[151] == null) {
	      p = 0;
	    } else if (((Double) i[151]).doubleValue() <= -8.43) {
	    p = AuthenticSenseClassifier_8.N22dd6b21436(i);
	    } else if (((Double) i[151]).doubleValue() > -8.43) {
	    p = AuthenticSenseClassifier_8.N76a45568437(i);
	    } 
	    return p;
	  }
	  static double N22dd6b21436(Object []i) {
	    double p = Double.NaN;
	    if (i[165] == null) {
	      p = 0;
	    } else if (((Double) i[165]).doubleValue() <= 2.3) {
	      p = 0;
	    } else if (((Double) i[165]).doubleValue() > 2.3) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N76a45568437(Object []i) {
	    double p = Double.NaN;
	    if (i[178] == null) {
	      p = 2;
	    } else if (((Double) i[178]).doubleValue() <= -9.35) {
	      p = 2;
	    } else if (((Double) i[178]).doubleValue() > -9.35) {
	    p = AuthenticSenseClassifier_8.N1ee35bb2438(i);
	    } 
	    return p;
	  }
	  static double N1ee35bb2438(Object []i) {
	    double p = Double.NaN;
	    if (i[172] == null) {
	      p = 0;
	    } else if (((Double) i[172]).doubleValue() <= -8.43) {
	      p = 0;
	    } else if (((Double) i[172]).doubleValue() > -8.43) {
	      p = 4;
	    } 
	    return p;
	  }
	}
	class AuthenticSenseClassifier_9 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = AuthenticSenseClassifier_9.N609912f5439(i);
	    return p;
	  }
	  static double N609912f5439(Object []i) {
	    double p = Double.NaN;
	    if (i[167] == null) {
	      p = 1;
	    } else if (((Double) i[167]).doubleValue() <= -9.35) {
	      p = 1;
	    } else if (((Double) i[167]).doubleValue() > -9.35) {
	    p = AuthenticSenseClassifier_9.N61abc45e440(i);
	    } 
	    return p;
	  }
	  static double N61abc45e440(Object []i) {
	    double p = Double.NaN;
	    if (i[158] == null) {
	      p = 4;
	    } else if (((Double) i[158]).doubleValue() <= 7.66) {
	    p = AuthenticSenseClassifier_9.N53e9296a441(i);
	    } else if (((Double) i[158]).doubleValue() > 7.66) {
	    p = AuthenticSenseClassifier_9.N24a019d6445(i);
	    } 
	    return p;
	  }
	  static double N53e9296a441(Object []i) {
	    double p = Double.NaN;
	    if (i[158] == null) {
	      p = 3;
	    } else if (((Double) i[158]).doubleValue() <= -9.5) {
	    p = AuthenticSenseClassifier_9.N709e192f442(i);
	    } else if (((Double) i[158]).doubleValue() > -9.5) {
	    p = AuthenticSenseClassifier_9.N1b87966c443(i);
	    } 
	    return p;
	  }
	  static double N709e192f442(Object []i) {
	    double p = Double.NaN;
	    if (i[168] == null) {
	      p = 3;
	    } else if (((Double) i[168]).doubleValue() <= 0.92) {
	      p = 3;
	    } else if (((Double) i[168]).doubleValue() > 0.92) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N1b87966c443(Object []i) {
	    double p = Double.NaN;
	    if (i[167] == null) {
	      p = 4;
	    } else if (((Double) i[167]).doubleValue() <= 7.35) {
	      p = 4;
	    } else if (((Double) i[167]).doubleValue() > 7.35) {
	    p = AuthenticSenseClassifier_9.N62a49a92444(i);
	    } 
	    return p;
	  }
	  static double N62a49a92444(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 0.5) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 0.5) {
	      p = 3;
	    } 
	    return p;
	  }
	  static double N24a019d6445(Object []i) {
	    double p = Double.NaN;
	    if (i[179] == null) {
	      p = 2;
	    } else if (((Double) i[179]).doubleValue() <= 4.14) {
	    p = AuthenticSenseClassifier_9.Nb004363446(i);
	    } else if (((Double) i[179]).doubleValue() > 4.14) {
	      p = 4;
	    } 
	    return p;
	  }
	  static double Nb004363446(Object []i) {
	    double p = Double.NaN;
	    if (i[177] == null) {
	      p = 2;
	    } else if (((Double) i[177]).doubleValue() <= 0.92) {
	      p = 2;
	    } else if (((Double) i[177]).doubleValue() > 0.92) {
	      p = 0;
	    } 
	    return p;
	  }
	}