package me.xiangchen.technique.doubleflip;

public class AuthenticSenseClassifier {

	  public static double classify(Object[] i) throws Exception {
	    double [] sums = new double [3];
	    sums[(int) AuthenticSenseClassifier_0.classify(i)] += 2.788353630977719;
	    sums[(int) AuthenticSenseClassifier_1.classify(i)] += 2.2119607920112947;
	    sums[(int) AuthenticSenseClassifier_2.classify(i)] += 2.616585049910424;
	    sums[(int) AuthenticSenseClassifier_3.classify(i)] += 2.1849577529972692;
	    sums[(int) AuthenticSenseClassifier_4.classify(i)] += 2.3569728751928958;
	    sums[(int) AuthenticSenseClassifier_5.classify(i)] += 2.1795530842415984;
	    sums[(int) AuthenticSenseClassifier_6.classify(i)] += 2.1955809948279157;
	    sums[(int) AuthenticSenseClassifier_7.classify(i)] += 2.1327888236537733;
	    sums[(int) AuthenticSenseClassifier_8.classify(i)] += 1.9937083633275905;
	    sums[(int) AuthenticSenseClassifier_9.classify(i)] += 1.9443913462082778;
	    double maxV = sums[0];
	    int maxI = 0;
	    for (int j = 1; j < 3; j++) {
	      if (sums[j] > maxV) { maxV = sums[j]; maxI = j; }
	    }
	    return (double) maxI;
	  }
	}
	class AuthenticSenseClassifier_0 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = AuthenticSenseClassifier_0.N77ea04d4533(i);
	    return p;
	  }
	  static double N77ea04d4533(Object []i) {
	    double p = Double.NaN;
	    if (i[169] == null) {
	      p = 1;
	    } else if (((Double) i[169]).doubleValue() <= 1.38) {
	    p = AuthenticSenseClassifier_0.N24e337cd534(i);
	    } else if (((Double) i[169]).doubleValue() > 1.38) {
	    p = AuthenticSenseClassifier_0.N2ac0e5b9538(i);
	    } 
	    return p;
	  }
	  static double N24e337cd534(Object []i) {
	    double p = Double.NaN;
	    if (i[179] == null) {
	      p = 1;
	    } else if (((Double) i[179]).doubleValue() <= 3.98) {
	    p = AuthenticSenseClassifier_0.N416486a6535(i);
	    } else if (((Double) i[179]).doubleValue() > 3.98) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N416486a6535(Object []i) {
	    double p = Double.NaN;
	    if (i[140] == null) {
	      p = 2;
	    } else if (((Double) i[140]).doubleValue() <= 7.6) {
	      p = 2;
	    } else if (((Double) i[140]).doubleValue() > 7.6) {
	    p = AuthenticSenseClassifier_0.N2ec41dd4536(i);
	    } 
	    return p;
	  }
	  static double N2ec41dd4536(Object []i) {
	    double p = Double.NaN;
	    if (i[145] == null) {
	      p = 1;
	    } else if (((Double) i[145]).doubleValue() <= 2.8) {
	      p = 1;
	    } else if (((Double) i[145]).doubleValue() > 2.8) {
	    p = AuthenticSenseClassifier_0.N4d826148537(i);
	    } 
	    return p;
	  }
	  static double N4d826148537(Object []i) {
	    double p = Double.NaN;
	    if (i[133] == null) {
	      p = 2;
	    } else if (((Double) i[133]).doubleValue() <= 4.3) {
	      p = 2;
	    } else if (((Double) i[133]).doubleValue() > 4.3) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2ac0e5b9538(Object []i) {
	    double p = Double.NaN;
	    if (i[179] == null) {
	      p = 2;
	    } else if (((Double) i[179]).doubleValue() <= 1.07) {
	      p = 2;
	    } else if (((Double) i[179]).doubleValue() > 1.07) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class AuthenticSenseClassifier_1 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = AuthenticSenseClassifier_1.N5e29ea9c539(i);
	    return p;
	  }
	  static double N5e29ea9c539(Object []i) {
	    double p = Double.NaN;
	    if (i[179] == null) {
	      p = 1;
	    } else if (((Double) i[179]).doubleValue() <= 4.44) {
	    p = AuthenticSenseClassifier_1.N11e9d810540(i);
	    } else if (((Double) i[179]).doubleValue() > 4.44) {
	    p = AuthenticSenseClassifier_1.N31161acd548(i);
	    } 
	    return p;
	  }
	  static double N11e9d810540(Object []i) {
	    double p = Double.NaN;
	    if (i[165] == null) {
	      p = 1;
	    } else if (((Double) i[165]).doubleValue() <= 4.75) {
	    p = AuthenticSenseClassifier_1.Nf680ba0541(i);
	    } else if (((Double) i[165]).doubleValue() > 4.75) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double Nf680ba0541(Object []i) {
	    double p = Double.NaN;
	    if (i[166] == null) {
	      p = 1;
	    } else if (((Double) i[166]).doubleValue() <= 9.19) {
	    p = AuthenticSenseClassifier_1.N77d33d46542(i);
	    } else if (((Double) i[166]).doubleValue() > 9.19) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N77d33d46542(Object []i) {
	    double p = Double.NaN;
	    if (i[48] == null) {
	      p = 1;
	    } else if (((Double) i[48]).doubleValue() <= 2.9) {
	    p = AuthenticSenseClassifier_1.N4d5bfc1f543(i);
	    } else if (((Double) i[48]).doubleValue() > 2.9) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N4d5bfc1f543(Object []i) {
	    double p = Double.NaN;
	    if (i[177] == null) {
	      p = 1;
	    } else if (((Double) i[177]).doubleValue() <= -0.46) {
	      p = 1;
	    } else if (((Double) i[177]).doubleValue() > -0.46) {
	    p = AuthenticSenseClassifier_1.N52057ee6544(i);
	    } 
	    return p;
	  }
	  static double N52057ee6544(Object []i) {
	    double p = Double.NaN;
	    if (i[13] == null) {
	      p = 1;
	    } else if (((Double) i[13]).doubleValue() <= 2.9) {
	    p = AuthenticSenseClassifier_1.N66ce581b545(i);
	    } else if (((Double) i[13]).doubleValue() > 2.9) {
	    p = AuthenticSenseClassifier_1.N6c4eeac0547(i);
	    } 
	    return p;
	  }
	  static double N66ce581b545(Object []i) {
	    double p = Double.NaN;
	    if (i[175] == null) {
	      p = 1;
	    } else if (((Double) i[175]).doubleValue() <= 2.6) {
	      p = 1;
	    } else if (((Double) i[175]).doubleValue() > 2.6) {
	    p = AuthenticSenseClassifier_1.N74fa8957546(i);
	    } 
	    return p;
	  }
	  static double N74fa8957546(Object []i) {
	    double p = Double.NaN;
	    if (i[120] == null) {
	      p = 1;
	    } else if (((Double) i[120]).doubleValue() <= 0.5) {
	      p = 1;
	    } else if (((Double) i[120]).doubleValue() > 0.5) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6c4eeac0547(Object []i) {
	    double p = Double.NaN;
	    if (i[174] == null) {
	      p = 2;
	    } else if (((Double) i[174]).doubleValue() <= 2.91) {
	      p = 2;
	    } else if (((Double) i[174]).doubleValue() > 2.91) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N31161acd548(Object []i) {
	    double p = Double.NaN;
	    if (i[119] == null) {
	      p = 2;
	    } else if (((Double) i[119]).doubleValue() <= 5.8) {
	      p = 2;
	    } else if (((Double) i[119]).doubleValue() > 5.8) {
	    p = AuthenticSenseClassifier_1.N2239a1e8549(i);
	    } 
	    return p;
	  }
	  static double N2239a1e8549(Object []i) {
	    double p = Double.NaN;
	    if (i[166] == null) {
	      p = 2;
	    } else if (((Double) i[166]).doubleValue() <= 1.84) {
	      p = 2;
	    } else if (((Double) i[166]).doubleValue() > 1.84) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class AuthenticSenseClassifier_2 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = AuthenticSenseClassifier_2.N75b497e5550(i);
	    return p;
	  }
	  static double N75b497e5550(Object []i) {
	    double p = Double.NaN;
	    if (i[162] == null) {
	      p = 1;
	    } else if (((Double) i[162]).doubleValue() <= 4.29) {
	    p = AuthenticSenseClassifier_2.N236077c2551(i);
	    } else if (((Double) i[162]).doubleValue() > 4.29) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N236077c2551(Object []i) {
	    double p = Double.NaN;
	    if (i[178] == null) {
	      p = 1;
	    } else if (((Double) i[178]).doubleValue() <= 0.31) {
	    p = AuthenticSenseClassifier_2.N125673b3552(i);
	    } else if (((Double) i[178]).doubleValue() > 0.31) {
	    p = AuthenticSenseClassifier_2.N3d47dde555(i);
	    } 
	    return p;
	  }
	  static double N125673b3552(Object []i) {
	    double p = Double.NaN;
	    if (i[174] == null) {
	      p = 2;
	    } else if (((Double) i[174]).doubleValue() <= -3.68) {
	      p = 2;
	    } else if (((Double) i[174]).doubleValue() > -3.68) {
	    p = AuthenticSenseClassifier_2.N69c5f62c553(i);
	    } 
	    return p;
	  }
	  static double N69c5f62c553(Object []i) {
	    double p = Double.NaN;
	    if (i[64] == null) {
	      p = 1;
	    } else if (((Double) i[64]).doubleValue() <= 1.9) {
	      p = 1;
	    } else if (((Double) i[64]).doubleValue() > 1.9) {
	    p = AuthenticSenseClassifier_2.N43a4f8f4554(i);
	    } 
	    return p;
	  }
	  static double N43a4f8f4554(Object []i) {
	    double p = Double.NaN;
	    if (i[173] == null) {
	      p = 1;
	    } else if (((Double) i[173]).doubleValue() <= -2.3) {
	      p = 1;
	    } else if (((Double) i[173]).doubleValue() > -2.3) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N3d47dde555(Object []i) {
	    double p = Double.NaN;
	    if (i[128] == null) {
	      p = 2;
	    } else if (((Double) i[128]).doubleValue() <= 6.9) {
	      p = 2;
	    } else if (((Double) i[128]).doubleValue() > 6.9) {
	    p = AuthenticSenseClassifier_2.N73937bc8556(i);
	    } 
	    return p;
	  }
	  static double N73937bc8556(Object []i) {
	    double p = Double.NaN;
	    if (i[162] == null) {
	      p = 0;
	    } else if (((Double) i[162]).doubleValue() <= 1.07) {
	    p = AuthenticSenseClassifier_2.N57a3c2bf557(i);
	    } else if (((Double) i[162]).doubleValue() > 1.07) {
	    p = AuthenticSenseClassifier_2.N4046b68c558(i);
	    } 
	    return p;
	  }
	  static double N57a3c2bf557(Object []i) {
	    double p = Double.NaN;
	    if (i[173] == null) {
	      p = 2;
	    } else if (((Double) i[173]).doubleValue() <= 2.15) {
	      p = 2;
	    } else if (((Double) i[173]).doubleValue() > 2.15) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4046b68c558(Object []i) {
	    double p = Double.NaN;
	    if (i[147] == null) {
	      p = 1;
	    } else if (((Double) i[147]).doubleValue() <= 1.2) {
	    p = AuthenticSenseClassifier_2.N627ac24b559(i);
	    } else if (((Double) i[147]).doubleValue() > 1.2) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N627ac24b559(Object []i) {
	    double p = Double.NaN;
	    if (i[171] == null) {
	      p = 1;
	    } else if (((Double) i[171]).doubleValue() <= 1.99) {
	      p = 1;
	    } else if (((Double) i[171]).doubleValue() > 1.99) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class AuthenticSenseClassifier_3 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = AuthenticSenseClassifier_3.N6969fc6f560(i);
	    return p;
	  }
	  static double N6969fc6f560(Object []i) {
	    double p = Double.NaN;
	    if (i[169] == null) {
	      p = 1;
	    } else if (((Double) i[169]).doubleValue() <= 3.22) {
	    p = AuthenticSenseClassifier_3.N2d3c117a561(i);
	    } else if (((Double) i[169]).doubleValue() > 3.22) {
	    p = AuthenticSenseClassifier_3.N50adc92c565(i);
	    } 
	    return p;
	  }
	  static double N2d3c117a561(Object []i) {
	    double p = Double.NaN;
	    if (i[163] == null) {
	      p = 2;
	    } else if (((Double) i[163]).doubleValue() <= -10.11) {
	      p = 2;
	    } else if (((Double) i[163]).doubleValue() > -10.11) {
	    p = AuthenticSenseClassifier_3.N429f77c9562(i);
	    } 
	    return p;
	  }
	  static double N429f77c9562(Object []i) {
	    double p = Double.NaN;
	    if (i[100] == null) {
	      p = 1;
	    } else if (((Double) i[100]).doubleValue() <= 2.9) {
	    p = AuthenticSenseClassifier_3.N73714f4a563(i);
	    } else if (((Double) i[100]).doubleValue() > 2.9) {
	    p = AuthenticSenseClassifier_3.N140cbe7c564(i);
	    } 
	    return p;
	  }
	  static double N73714f4a563(Object []i) {
	    double p = Double.NaN;
	    if (i[151] == null) {
	      p = 1;
	    } else if (((Double) i[151]).doubleValue() <= -5.36) {
	      p = 1;
	    } else if (((Double) i[151]).doubleValue() > -5.36) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N140cbe7c564(Object []i) {
	    double p = Double.NaN;
	    if (i[150] == null) {
	      p = 2;
	    } else if (((Double) i[150]).doubleValue() <= 2.76) {
	      p = 2;
	    } else if (((Double) i[150]).doubleValue() > 2.76) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N50adc92c565(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 15.3) {
	    p = AuthenticSenseClassifier_3.N41729115566(i);
	    } else if (((Double) i[2]).doubleValue() > 15.3) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N41729115566(Object []i) {
	    double p = Double.NaN;
	    if (i[23] == null) {
	      p = 0;
	    } else if (((Double) i[23]).doubleValue() <= 14.6) {
	    p = AuthenticSenseClassifier_3.N48931b44567(i);
	    } else if (((Double) i[23]).doubleValue() > 14.6) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N48931b44567(Object []i) {
	    double p = Double.NaN;
	    if (i[119] == null) {
	      p = 2;
	    } else if (((Double) i[119]).doubleValue() <= 7.6) {
	      p = 2;
	    } else if (((Double) i[119]).doubleValue() > 7.6) {
	    p = AuthenticSenseClassifier_3.N31e33295568(i);
	    } 
	    return p;
	  }
	  static double N31e33295568(Object []i) {
	    double p = Double.NaN;
	    if (i[151] == null) {
	      p = 0;
	    } else if (((Double) i[151]).doubleValue() <= 8.58) {
	      p = 0;
	    } else if (((Double) i[151]).doubleValue() > 8.58) {
	    p = AuthenticSenseClassifier_3.N3b0dedc9569(i);
	    } 
	    return p;
	  }
	  static double N3b0dedc9569(Object []i) {
	    double p = Double.NaN;
	    if (i[44] == null) {
	      p = 0;
	    } else if (((Double) i[44]).doubleValue() <= 9.3) {
	      p = 0;
	    } else if (((Double) i[44]).doubleValue() > 9.3) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class AuthenticSenseClassifier_4 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = AuthenticSenseClassifier_4.Nf764569570(i);
	    return p;
	  }
	  static double Nf764569570(Object []i) {
	    double p = Double.NaN;
	    if (i[169] == null) {
	      p = 1;
	    } else if (((Double) i[169]).doubleValue() <= 0.15) {
	    p = AuthenticSenseClassifier_4.N1dc6f86d571(i);
	    } else if (((Double) i[169]).doubleValue() > 0.15) {
	    p = AuthenticSenseClassifier_4.N1ba14608573(i);
	    } 
	    return p;
	  }
	  static double N1dc6f86d571(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 4.9) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() > 4.9) {
	    p = AuthenticSenseClassifier_4.N71dfcb60572(i);
	    } 
	    return p;
	  }
	  static double N71dfcb60572(Object []i) {
	    double p = Double.NaN;
	    if (i[146] == null) {
	      p = 2;
	    } else if (((Double) i[146]).doubleValue() <= 9.4) {
	      p = 2;
	    } else if (((Double) i[146]).doubleValue() > 9.4) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N1ba14608573(Object []i) {
	    double p = Double.NaN;
	    if (i[169] == null) {
	      p = 0;
	    } else if (((Double) i[169]).doubleValue() <= 9.5) {
	    p = AuthenticSenseClassifier_4.N78fcc563574(i);
	    } else if (((Double) i[169]).doubleValue() > 9.5) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N78fcc563574(Object []i) {
	    double p = Double.NaN;
	    if (i[151] == null) {
	      p = 1;
	    } else if (((Double) i[151]).doubleValue() <= -7.66) {
	      p = 1;
	    } else if (((Double) i[151]).doubleValue() > -7.66) {
	    p = AuthenticSenseClassifier_4.N1b0324a3575(i);
	    } 
	    return p;
	  }
	  static double N1b0324a3575(Object []i) {
	    double p = Double.NaN;
	    if (i[74] == null) {
	      p = 0;
	    } else if (((Double) i[74]).doubleValue() <= 7.6) {
	    p = AuthenticSenseClassifier_4.N6b5a572f576(i);
	    } else if (((Double) i[74]).doubleValue() > 7.6) {
	    p = AuthenticSenseClassifier_4.N781205b8577(i);
	    } 
	    return p;
	  }
	  static double N6b5a572f576(Object []i) {
	    double p = Double.NaN;
	    if (i[166] == null) {
	      p = 2;
	    } else if (((Double) i[166]).doubleValue() <= 7.2) {
	      p = 2;
	    } else if (((Double) i[166]).doubleValue() > 7.2) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N781205b8577(Object []i) {
	    double p = Double.NaN;
	    if (i[157] == null) {
	      p = 0;
	    } else if (((Double) i[157]).doubleValue() <= 8.12) {
	      p = 0;
	    } else if (((Double) i[157]).doubleValue() > 8.12) {
	    p = AuthenticSenseClassifier_4.N6735b09d578(i);
	    } 
	    return p;
	  }
	  static double N6735b09d578(Object []i) {
	    double p = Double.NaN;
	    if (i[56] == null) {
	      p = 1;
	    } else if (((Double) i[56]).doubleValue() <= 9.2) {
	    p = AuthenticSenseClassifier_4.N75de485a579(i);
	    } else if (((Double) i[56]).doubleValue() > 9.2) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N75de485a579(Object []i) {
	    double p = Double.NaN;
	    if (i[19] == null) {
	      p = 1;
	    } else if (((Double) i[19]).doubleValue() <= 1.1) {
	      p = 1;
	    } else if (((Double) i[19]).doubleValue() > 1.1) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class AuthenticSenseClassifier_5 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = AuthenticSenseClassifier_5.N5460492a580(i);
	    return p;
	  }
	  static double N5460492a580(Object []i) {
	    double p = Double.NaN;
	    if (i[169] == null) {
	      p = 2;
	    } else if (((Double) i[169]).doubleValue() <= 1.38) {
	    p = AuthenticSenseClassifier_5.N7d638fac581(i);
	    } else if (((Double) i[169]).doubleValue() > 1.38) {
	    p = AuthenticSenseClassifier_5.N4afc818c586(i);
	    } 
	    return p;
	  }
	  static double N7d638fac581(Object []i) {
	    double p = Double.NaN;
	    if (i[160] == null) {
	      p = 2;
	    } else if (((Double) i[160]).doubleValue() <= 0.46) {
	    p = AuthenticSenseClassifier_5.N136da584582(i);
	    } else if (((Double) i[160]).doubleValue() > 0.46) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N136da584582(Object []i) {
	    double p = Double.NaN;
	    if (i[176] == null) {
	      p = 1;
	    } else if (((Double) i[176]).doubleValue() <= 0.31) {
	    p = AuthenticSenseClassifier_5.N38d8713583(i);
	    } else if (((Double) i[176]).doubleValue() > 0.31) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N38d8713583(Object []i) {
	    double p = Double.NaN;
	    if (i[25] == null) {
	      p = 1;
	    } else if (((Double) i[25]).doubleValue() <= 4.6) {
	    p = AuthenticSenseClassifier_5.N409ef237584(i);
	    } else if (((Double) i[25]).doubleValue() > 4.6) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N409ef237584(Object []i) {
	    double p = Double.NaN;
	    if (i[160] == null) {
	      p = 2;
	    } else if (((Double) i[160]).doubleValue() <= -8.73) {
	    p = AuthenticSenseClassifier_5.N3301a06585(i);
	    } else if (((Double) i[160]).doubleValue() > -8.73) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3301a06585(Object []i) {
	    double p = Double.NaN;
	    if (i[15] == null) {
	      p = 1;
	    } else if (((Double) i[15]).doubleValue() <= 0.3) {
	      p = 1;
	    } else if (((Double) i[15]).doubleValue() > 0.3) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N4afc818c586(Object []i) {
	    double p = Double.NaN;
	    if (i[176] == null) {
	      p = 2;
	    } else if (((Double) i[176]).doubleValue() <= 1.07) {
	      p = 2;
	    } else if (((Double) i[176]).doubleValue() > 1.07) {
	    p = AuthenticSenseClassifier_5.N79d34ca587(i);
	    } 
	    return p;
	  }
	  static double N79d34ca587(Object []i) {
	    double p = Double.NaN;
	    if (i[129] == null) {
	      p = 0;
	    } else if (((Double) i[129]).doubleValue() <= 0.6) {
	    p = AuthenticSenseClassifier_5.N61f4bdad588(i);
	    } else if (((Double) i[129]).doubleValue() > 0.6) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N61f4bdad588(Object []i) {
	    double p = Double.NaN;
	    if (i[148] == null) {
	      p = 0;
	    } else if (((Double) i[148]).doubleValue() <= 0.9) {
	      p = 0;
	    } else if (((Double) i[148]).doubleValue() > 0.9) {
	    p = AuthenticSenseClassifier_5.Nad0db19589(i);
	    } 
	    return p;
	  }
	  static double Nad0db19589(Object []i) {
	    double p = Double.NaN;
	    if (i[13] == null) {
	      p = 1;
	    } else if (((Double) i[13]).doubleValue() <= 1.7) {
	    p = AuthenticSenseClassifier_5.N15e04bdb590(i);
	    } else if (((Double) i[13]).doubleValue() > 1.7) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N15e04bdb590(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= -1.5) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() > -1.5) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class AuthenticSenseClassifier_6 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = AuthenticSenseClassifier_6.N38942215591(i);
	    return p;
	  }
	  static double N38942215591(Object []i) {
	    double p = Double.NaN;
	    if (i[178] == null) {
	      p = 1;
	    } else if (((Double) i[178]).doubleValue() <= 0.31) {
	    p = AuthenticSenseClassifier_6.N549adb8592(i);
	    } else if (((Double) i[178]).doubleValue() > 0.31) {
	    p = AuthenticSenseClassifier_6.N12f6ce3e598(i);
	    } 
	    return p;
	  }
	  static double N549adb8592(Object []i) {
	    double p = Double.NaN;
	    if (i[169] == null) {
	      p = 2;
	    } else if (((Double) i[169]).doubleValue() <= 0.46) {
	    p = AuthenticSenseClassifier_6.N282c0dbe593(i);
	    } else if (((Double) i[169]).doubleValue() > 0.46) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N282c0dbe593(Object []i) {
	    double p = Double.NaN;
	    if (i[146] == null) {
	      p = 2;
	    } else if (((Double) i[146]).doubleValue() <= 6.8) {
	      p = 2;
	    } else if (((Double) i[146]).doubleValue() > 6.8) {
	    p = AuthenticSenseClassifier_6.N643a498c594(i);
	    } 
	    return p;
	  }
	  static double N643a498c594(Object []i) {
	    double p = Double.NaN;
	    if (i[172] == null) {
	      p = 1;
	    } else if (((Double) i[172]).doubleValue() <= -7.51) {
	    p = AuthenticSenseClassifier_6.N2eb2b9bc595(i);
	    } else if (((Double) i[172]).doubleValue() > -7.51) {
	    p = AuthenticSenseClassifier_6.N7da1f182597(i);
	    } 
	    return p;
	  }
	  static double N2eb2b9bc595(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 0.3) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 0.3) {
	    p = AuthenticSenseClassifier_6.N57bffd97596(i);
	    } 
	    return p;
	  }
	  static double N57bffd97596(Object []i) {
	    double p = Double.NaN;
	    if (i[21] == null) {
	      p = 2;
	    } else if (((Double) i[21]).doubleValue() <= 1.3) {
	      p = 2;
	    } else if (((Double) i[21]).doubleValue() > 1.3) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N7da1f182597(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= -1.4) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() > -1.4) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N12f6ce3e598(Object []i) {
	    double p = Double.NaN;
	    if (i[50] == null) {
	      p = 0;
	    } else if (((Double) i[50]).doubleValue() <= 13.4) {
	    p = AuthenticSenseClassifier_6.N95e522c599(i);
	    } else if (((Double) i[50]).doubleValue() > 13.4) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N95e522c599(Object []i) {
	    double p = Double.NaN;
	    if (i[126] == null) {
	      p = 2;
	    } else if (((Double) i[126]).doubleValue() <= -1.8) {
	      p = 2;
	    } else if (((Double) i[126]).doubleValue() > -1.8) {
	    p = AuthenticSenseClassifier_6.Nf64cb82600(i);
	    } 
	    return p;
	  }
	  static double Nf64cb82600(Object []i) {
	    double p = Double.NaN;
	    if (i[150] == null) {
	      p = 0;
	    } else if (((Double) i[150]).doubleValue() <= 4.44) {
	    p = AuthenticSenseClassifier_6.N226ccbb3601(i);
	    } else if (((Double) i[150]).doubleValue() > 4.44) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N226ccbb3601(Object []i) {
	    double p = Double.NaN;
	    if (i[172] == null) {
	      p = 0;
	    } else if (((Double) i[172]).doubleValue() <= 9.19) {
	    p = AuthenticSenseClassifier_6.N14b1666d602(i);
	    } else if (((Double) i[172]).doubleValue() > 9.19) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N14b1666d602(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 2.6) {
	    p = AuthenticSenseClassifier_6.Nabb88b8603(i);
	    } else if (((Double) i[1]).doubleValue() > 2.6) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double Nabb88b8603(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 8.0) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > 8.0) {
	    p = AuthenticSenseClassifier_6.N1e0ced89604(i);
	    } 
	    return p;
	  }
	  static double N1e0ced89604(Object []i) {
	    double p = Double.NaN;
	    if (i[173] == null) {
	      p = 1;
	    } else if (((Double) i[173]).doubleValue() <= 3.52) {
	      p = 1;
	    } else if (((Double) i[173]).doubleValue() > 3.52) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class AuthenticSenseClassifier_7 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = AuthenticSenseClassifier_7.N62beccc8605(i);
	    return p;
	  }
	  static double N62beccc8605(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 2.5) {
	    p = AuthenticSenseClassifier_7.N5c76911d606(i);
	    } else if (((Double) i[1]).doubleValue() > 2.5) {
	    p = AuthenticSenseClassifier_7.N71eecfa7616(i);
	    } 
	    return p;
	  }
	  static double N5c76911d606(Object []i) {
	    double p = Double.NaN;
	    if (i[95] == null) {
	      p = 2;
	    } else if (((Double) i[95]).doubleValue() <= -11.8) {
	      p = 2;
	    } else if (((Double) i[95]).doubleValue() > -11.8) {
	    p = AuthenticSenseClassifier_7.N6c313657607(i);
	    } 
	    return p;
	  }
	  static double N6c313657607(Object []i) {
	    double p = Double.NaN;
	    if (i[84] == null) {
	      p = 1;
	    } else if (((Double) i[84]).doubleValue() <= 3.7) {
	    p = AuthenticSenseClassifier_7.N12e6c13f608(i);
	    } else if (((Double) i[84]).doubleValue() > 3.7) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N12e6c13f608(Object []i) {
	    double p = Double.NaN;
	    if (i[150] == null) {
	      p = 1;
	    } else if (((Double) i[150]).doubleValue() <= 4.44) {
	    p = AuthenticSenseClassifier_7.N6b9918ca609(i);
	    } else if (((Double) i[150]).doubleValue() > 4.44) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N6b9918ca609(Object []i) {
	    double p = Double.NaN;
	    if (i[151] == null) {
	      p = 1;
	    } else if (((Double) i[151]).doubleValue() <= 0.61) {
	    p = AuthenticSenseClassifier_7.N102aacf6610(i);
	    } else if (((Double) i[151]).doubleValue() > 0.61) {
	    p = AuthenticSenseClassifier_7.N5b20f3ff612(i);
	    } 
	    return p;
	  }
	  static double N102aacf6610(Object []i) {
	    double p = Double.NaN;
	    if (i[150] == null) {
	      p = 1;
	    } else if (((Double) i[150]).doubleValue() <= 1.38) {
	    p = AuthenticSenseClassifier_7.N61c152c4611(i);
	    } else if (((Double) i[150]).doubleValue() > 1.38) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N61c152c4611(Object []i) {
	    double p = Double.NaN;
	    if (i[159] == null) {
	      p = 1;
	    } else if (((Double) i[159]).doubleValue() <= 0.46) {
	      p = 1;
	    } else if (((Double) i[159]).doubleValue() > 0.46) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N5b20f3ff612(Object []i) {
	    double p = Double.NaN;
	    if (i[155] == null) {
	      p = 0;
	    } else if (((Double) i[155]).doubleValue() <= 2.91) {
	    p = AuthenticSenseClassifier_7.N50731916613(i);
	    } else if (((Double) i[155]).doubleValue() > 2.91) {
	    p = AuthenticSenseClassifier_7.N34741c9d614(i);
	    } 
	    return p;
	  }
	  static double N50731916613(Object []i) {
	    double p = Double.NaN;
	    if (i[24] == null) {
	      p = 0;
	    } else if (((Double) i[24]).doubleValue() <= -0.1) {
	      p = 0;
	    } else if (((Double) i[24]).doubleValue() > -0.1) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N34741c9d614(Object []i) {
	    double p = Double.NaN;
	    if (i[100] == null) {
	      p = 1;
	    } else if (((Double) i[100]).doubleValue() <= 2.1) {
	    p = AuthenticSenseClassifier_7.N3302a252615(i);
	    } else if (((Double) i[100]).doubleValue() > 2.1) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3302a252615(Object []i) {
	    double p = Double.NaN;
	    if (i[68] == null) {
	      p = 0;
	    } else if (((Double) i[68]).doubleValue() <= 9.1) {
	      p = 0;
	    } else if (((Double) i[68]).doubleValue() > 9.1) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N71eecfa7616(Object []i) {
	    double p = Double.NaN;
	    if (i[173] == null) {
	      p = 2;
	    } else if (((Double) i[173]).doubleValue() <= -2.3) {
	    p = AuthenticSenseClassifier_7.N75831760617(i);
	    } else if (((Double) i[173]).doubleValue() > -2.3) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N75831760617(Object []i) {
	    double p = Double.NaN;
	    if (i[147] == null) {
	      p = 2;
	    } else if (((Double) i[147]).doubleValue() <= 0.0) {
	      p = 2;
	    } else if (((Double) i[147]).doubleValue() > 0.0) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class AuthenticSenseClassifier_8 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = AuthenticSenseClassifier_8.N7173dbe5618(i);
	    return p;
	  }
	  static double N7173dbe5618(Object []i) {
	    double p = Double.NaN;
	    if (i[179] == null) {
	      p = 2;
	    } else if (((Double) i[179]).doubleValue() <= 1.53) {
	    p = AuthenticSenseClassifier_8.N6d69d193619(i);
	    } else if (((Double) i[179]).doubleValue() > 1.53) {
	    p = AuthenticSenseClassifier_8.N1a42c7d3622(i);
	    } 
	    return p;
	  }
	  static double N6d69d193619(Object []i) {
	    double p = Double.NaN;
	    if (i[118] == null) {
	      p = 1;
	    } else if (((Double) i[118]).doubleValue() <= 1.9) {
	    p = AuthenticSenseClassifier_8.N3e3e4203620(i);
	    } else if (((Double) i[118]).doubleValue() > 1.9) {
	    p = AuthenticSenseClassifier_8.N695ff2e1621(i);
	    } 
	    return p;
	  }
	  static double N3e3e4203620(Object []i) {
	    double p = Double.NaN;
	    if (i[141] == null) {
	      p = 2;
	    } else if (((Double) i[141]).doubleValue() <= -0.5) {
	      p = 2;
	    } else if (((Double) i[141]).doubleValue() > -0.5) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N695ff2e1621(Object []i) {
	    double p = Double.NaN;
	    if (i[162] == null) {
	      p = 2;
	    } else if (((Double) i[162]).doubleValue() <= 1.99) {
	      p = 2;
	    } else if (((Double) i[162]).doubleValue() > 1.99) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N1a42c7d3622(Object []i) {
	    double p = Double.NaN;
	    if (i[135] == null) {
	      p = 2;
	    } else if (((Double) i[135]).doubleValue() <= -1.2) {
	      p = 2;
	    } else if (((Double) i[135]).doubleValue() > -1.2) {
	    p = AuthenticSenseClassifier_8.N164cfb1d623(i);
	    } 
	    return p;
	  }
	  static double N164cfb1d623(Object []i) {
	    double p = Double.NaN;
	    if (i[155] == null) {
	      p = 0;
	    } else if (((Double) i[155]).doubleValue() <= 5.52) {
	    p = AuthenticSenseClassifier_8.N17fa385b624(i);
	    } else if (((Double) i[155]).doubleValue() > 5.52) {
	    p = AuthenticSenseClassifier_8.Nd8ae950629(i);
	    } 
	    return p;
	  }
	  static double N17fa385b624(Object []i) {
	    double p = Double.NaN;
	    if (i[172] == null) {
	      p = 0;
	    } else if (((Double) i[172]).doubleValue() <= 9.19) {
	    p = AuthenticSenseClassifier_8.N2c89eaa9625(i);
	    } else if (((Double) i[172]).doubleValue() > 9.19) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N2c89eaa9625(Object []i) {
	    double p = Double.NaN;
	    if (i[179] == null) {
	      p = 0;
	    } else if (((Double) i[179]).doubleValue() <= 4.44) {
	    p = AuthenticSenseClassifier_8.N128d1417626(i);
	    } else if (((Double) i[179]).doubleValue() > 4.44) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N128d1417626(Object []i) {
	    double p = Double.NaN;
	    if (i[123] == null) {
	      p = 1;
	    } else if (((Double) i[123]).doubleValue() <= -0.1) {
	      p = 1;
	    } else if (((Double) i[123]).doubleValue() > -0.1) {
	    p = AuthenticSenseClassifier_8.N6c21fb84627(i);
	    } 
	    return p;
	  }
	  static double N6c21fb84627(Object []i) {
	    double p = Double.NaN;
	    if (i[52] == null) {
	      p = 1;
	    } else if (((Double) i[52]).doubleValue() <= 0.1) {
	      p = 1;
	    } else if (((Double) i[52]).doubleValue() > 0.1) {
	    p = AuthenticSenseClassifier_8.N2b07ce92628(i);
	    } 
	    return p;
	  }
	  static double N2b07ce92628(Object []i) {
	    double p = Double.NaN;
	    if (i[104] == null) {
	      p = 0;
	    } else if (((Double) i[104]).doubleValue() <= 9.4) {
	      p = 0;
	    } else if (((Double) i[104]).doubleValue() > 9.4) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Nd8ae950629(Object []i) {
	    double p = Double.NaN;
	    if (i[68] == null) {
	      p = 2;
	    } else if (((Double) i[68]).doubleValue() <= 9.1) {
	      p = 2;
	    } else if (((Double) i[68]).doubleValue() > 9.1) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class AuthenticSenseClassifier_9 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = AuthenticSenseClassifier_9.N1adb8a22630(i);
	    return p;
	  }
	  static double N1adb8a22630(Object []i) {
	    double p = Double.NaN;
	    if (i[173] == null) {
	      p = 2;
	    } else if (((Double) i[173]).doubleValue() <= 1.53) {
	    p = AuthenticSenseClassifier_9.N4349cbf4631(i);
	    } else if (((Double) i[173]).doubleValue() > 1.53) {
	    p = AuthenticSenseClassifier_9.N69d254f9636(i);
	    } 
	    return p;
	  }
	  static double N4349cbf4631(Object []i) {
	    double p = Double.NaN;
	    if (i[164] == null) {
	      p = 1;
	    } else if (((Double) i[164]).doubleValue() <= -5.82) {
	      p = 1;
	    } else if (((Double) i[164]).doubleValue() > -5.82) {
	    p = AuthenticSenseClassifier_9.N21ed22af632(i);
	    } 
	    return p;
	  }
	  static double N21ed22af632(Object []i) {
	    double p = Double.NaN;
	    if (i[155] == null) {
	      p = 2;
	    } else if (((Double) i[155]).doubleValue() <= 6.59) {
	    p = AuthenticSenseClassifier_9.N5780208f633(i);
	    } else if (((Double) i[155]).doubleValue() > 6.59) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5780208f633(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 2;
	    } else if (((Double) i[8]).doubleValue() <= 9.6) {
	    p = AuthenticSenseClassifier_9.N1cd9b92a634(i);
	    } else if (((Double) i[8]).doubleValue() > 9.6) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N1cd9b92a634(Object []i) {
	    double p = Double.NaN;
	    if (i[172] == null) {
	      p = 2;
	    } else if (((Double) i[172]).doubleValue() <= -7.51) {
	    p = AuthenticSenseClassifier_9.N1a0b8332635(i);
	    } else if (((Double) i[172]).doubleValue() > -7.51) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N1a0b8332635(Object []i) {
	    double p = Double.NaN;
	    if (i[31] == null) {
	      p = 1;
	    } else if (((Double) i[31]).doubleValue() <= 2.5) {
	      p = 1;
	    } else if (((Double) i[31]).doubleValue() > 2.5) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N69d254f9636(Object []i) {
	    double p = Double.NaN;
	    if (i[109] == null) {
	      p = 1;
	    } else if (((Double) i[109]).doubleValue() <= 2.7) {
	    p = AuthenticSenseClassifier_9.N6fc8ddb5637(i);
	    } else if (((Double) i[109]).doubleValue() > 2.7) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N6fc8ddb5637(Object []i) {
	    double p = Double.NaN;
	    if (i[120] == null) {
	      p = 1;
	    } else if (((Double) i[120]).doubleValue() <= 1.0) {
	    p = AuthenticSenseClassifier_9.N6c53cf68638(i);
	    } else if (((Double) i[120]).doubleValue() > 1.0) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6c53cf68638(Object []i) {
	    double p = Double.NaN;
	    if (i[171] == null) {
	      p = 1;
	    } else if (((Double) i[171]).doubleValue() <= 2.3) {
	    p = AuthenticSenseClassifier_9.N7255ec67639(i);
	    } else if (((Double) i[171]).doubleValue() > 2.3) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7255ec67639(Object []i) {
	    double p = Double.NaN;
	    if (i[177] == null) {
	      p = 0;
	    } else if (((Double) i[177]).doubleValue() <= 0.15) {
	      p = 0;
	    } else if (((Double) i[177]).doubleValue() > 0.15) {
	    p = AuthenticSenseClassifier_9.N671398d5640(i);
	    } 
	    return p;
	  }
	  static double N671398d5640(Object []i) {
	    double p = Double.NaN;
	    if (i[35] == null) {
	      p = 1;
	    } else if (((Double) i[35]).doubleValue() <= 10.7) {
	    p = AuthenticSenseClassifier_9.N3796fcd1641(i);
	    } else if (((Double) i[35]).doubleValue() > 10.7) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3796fcd1641(Object []i) {
	    double p = Double.NaN;
	    if (i[122] == null) {
	      p = 1;
	    } else if (((Double) i[122]).doubleValue() <= 8.9) {
	      p = 1;
	    } else if (((Double) i[122]).doubleValue() > 8.9) {
	    p = AuthenticSenseClassifier_9.N19b019da642(i);
	    } 
	    return p;
	  }
	  static double N19b019da642(Object []i) {
	    double p = Double.NaN;
	    if (i[174] == null) {
	      p = 0;
	    } else if (((Double) i[174]).doubleValue() <= 1.38) {
	      p = 0;
	    } else if (((Double) i[174]).doubleValue() > 1.38) {
	      p = 1;
	    } 
	    return p;
	  }
	}


//public class AuthenticSenseClassifier {
//
//	  public static double classify(Object[] i) throws Exception {
//	    double [] sums = new double [4];
//	    sums[(int) AuthenticSenseClassifier_0.classify(i)] += 3.042252289188876;
//	    sums[(int) AuthenticSenseClassifier_1.classify(i)] += 2.85263142991331;
//	    sums[(int) AuthenticSenseClassifier_2.classify(i)] += 2.2602915022213206;
//	    sums[(int) AuthenticSenseClassifier_3.classify(i)] += 2.756513984896145;
//	    sums[(int) AuthenticSenseClassifier_4.classify(i)] += 2.5579031299366997;
//	    sums[(int) AuthenticSenseClassifier_5.classify(i)] += 2.746589385967387;
//	    sums[(int) AuthenticSenseClassifier_6.classify(i)] += 2.5108038759032385;
//	    sums[(int) AuthenticSenseClassifier_7.classify(i)] += 2.844576243908324;
//	    sums[(int) AuthenticSenseClassifier_8.classify(i)] += 3.1177259993417326;
//	    sums[(int) AuthenticSenseClassifier_9.classify(i)] += 3.1940665907175037;
//	    double maxV = sums[0];
//	    int maxI = 0;
//	    for (int j = 1; j < 4; j++) {
//	      if (sums[j] > maxV) { maxV = sums[j]; maxI = j; }
//	    }
//	    return (double) maxI;
//	  }
//	}
//	class AuthenticSenseClassifier_0 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = AuthenticSenseClassifier_0.N597b40a8983(i);
//	    return p;
//	  }
//	  static double N597b40a8983(Object []i) {
//	    double p = Double.NaN;
//	    if (i[158] == null) {
//	      p = 3;
//	    } else if (((Double) i[158]).doubleValue() <= -3.98) {
//	    p = AuthenticSenseClassifier_0.N2ad2037d984(i);
//	    } else if (((Double) i[158]).doubleValue() > -3.98) {
//	    p = AuthenticSenseClassifier_0.N249f85f2986(i);
//	    } 
//	    return p;
//	  }
//	  static double N2ad2037d984(Object []i) {
//	    double p = Double.NaN;
//	    if (i[179] == null) {
//	      p = 0;
//	    } else if (((Double) i[179]).doubleValue() <= -0.31) {
//	      p = 0;
//	    } else if (((Double) i[179]).doubleValue() > -0.31) {
//	    p = AuthenticSenseClassifier_0.N41e31981985(i);
//	    } 
//	    return p;
//	  }
//	  static double N41e31981985(Object []i) {
//	    double p = Double.NaN;
//	    if (i[178] == null) {
//	      p = 2;
//	    } else if (((Double) i[178]).doubleValue() <= 0.46) {
//	      p = 2;
//	    } else if (((Double) i[178]).doubleValue() > 0.46) {
//	      p = 3;
//	    } 
//	    return p;
//	  }
//	  static double N249f85f2986(Object []i) {
//	    double p = Double.NaN;
//	    if (i[179] == null) {
//	      p = 1;
//	    } else if (((Double) i[179]).doubleValue() <= -3.83) {
//	      p = 1;
//	    } else if (((Double) i[179]).doubleValue() > -3.83) {
//	    p = AuthenticSenseClassifier_0.N6512e5a6987(i);
//	    } 
//	    return p;
//	  }
//	  static double N6512e5a6987(Object []i) {
//	    double p = Double.NaN;
//	    if (i[164] == null) {
//	      p = 0;
//	    } else if (((Double) i[164]).doubleValue() <= 9.5) {
//	      p = 0;
//	    } else if (((Double) i[164]).doubleValue() > 9.5) {
//	    p = AuthenticSenseClassifier_0.N3ba32921988(i);
//	    } 
//	    return p;
//	  }
//	  static double N3ba32921988(Object []i) {
//	    double p = Double.NaN;
//	    if (i[179] == null) {
//	      p = 1;
//	    } else if (((Double) i[179]).doubleValue() <= 6.59) {
//	      p = 1;
//	    } else if (((Double) i[179]).doubleValue() > 6.59) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	}
//	class AuthenticSenseClassifier_1 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = AuthenticSenseClassifier_1.N54e1541d989(i);
//	    return p;
//	  }
//	  static double N54e1541d989(Object []i) {
//	    double p = Double.NaN;
//	    if (i[166] == null) {
//	      p = 0;
//	    } else if (((Double) i[166]).doubleValue() <= 1.07) {
//	    p = AuthenticSenseClassifier_1.N15596774990(i);
//	    } else if (((Double) i[166]).doubleValue() > 1.07) {
//	    p = AuthenticSenseClassifier_1.N68ee3eb2995(i);
//	    } 
//	    return p;
//	  }
//	  static double N15596774990(Object []i) {
//	    double p = Double.NaN;
//	    if (i[161] == null) {
//	      p = 2;
//	    } else if (((Double) i[161]).doubleValue() <= -5.67) {
//	      p = 2;
//	    } else if (((Double) i[161]).doubleValue() > -5.67) {
//	    p = AuthenticSenseClassifier_1.N2096fb9f991(i);
//	    } 
//	    return p;
//	  }
//	  static double N2096fb9f991(Object []i) {
//	    double p = Double.NaN;
//	    if (i[50] == null) {
//	      p = 0;
//	    } else if (((Double) i[50]).doubleValue() <= 10.1) {
//	    p = AuthenticSenseClassifier_1.N18619470992(i);
//	    } else if (((Double) i[50]).doubleValue() > 10.1) {
//	    p = AuthenticSenseClassifier_1.N28531e5c994(i);
//	    } 
//	    return p;
//	  }
//	  static double N18619470992(Object []i) {
//	    double p = Double.NaN;
//	    if (i[160] == null) {
//	      p = 0;
//	    } else if (((Double) i[160]).doubleValue() <= 0.15) {
//	    p = AuthenticSenseClassifier_1.N2e585191993(i);
//	    } else if (((Double) i[160]).doubleValue() > 0.15) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N2e585191993(Object []i) {
//	    double p = Double.NaN;
//	    if (i[5] == null) {
//	      p = 1;
//	    } else if (((Double) i[5]).doubleValue() <= -11.5) {
//	      p = 1;
//	    } else if (((Double) i[5]).doubleValue() > -11.5) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	  static double N28531e5c994(Object []i) {
//	    double p = Double.NaN;
//	    if (i[179] == null) {
//	      p = 1;
//	    } else if (((Double) i[179]).doubleValue() <= 1.99) {
//	      p = 1;
//	    } else if (((Double) i[179]).doubleValue() > 1.99) {
//	      p = 2;
//	    } 
//	    return p;
//	  }
//	  static double N68ee3eb2995(Object []i) {
//	    double p = Double.NaN;
//	    if (i[179] == null) {
//	      p = 0;
//	    } else if (((Double) i[179]).doubleValue() <= 3.52) {
//	    p = AuthenticSenseClassifier_1.N71564def996(i);
//	    } else if (((Double) i[179]).doubleValue() > 3.52) {
//	      p = 3;
//	    } 
//	    return p;
//	  }
//	  static double N71564def996(Object []i) {
//	    double p = Double.NaN;
//	    if (i[2] == null) {
//	      p = 1;
//	    } else if (((Double) i[2]).doubleValue() <= -3.6) {
//	      p = 1;
//	    } else if (((Double) i[2]).doubleValue() > -3.6) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	}
//	class AuthenticSenseClassifier_2 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = AuthenticSenseClassifier_2.N5916c00a997(i);
//	    return p;
//	  }
//	  static double N5916c00a997(Object []i) {
//	    double p = Double.NaN;
//	    if (i[164] == null) {
//	      p = 3;
//	    } else if (((Double) i[164]).doubleValue() <= -9.35) {
//	    p = AuthenticSenseClassifier_2.N6499fe37998(i);
//	    } else if (((Double) i[164]).doubleValue() > -9.35) {
//	    p = AuthenticSenseClassifier_2.N3a01007a999(i);
//	    } 
//	    return p;
//	  }
//	  static double N6499fe37998(Object []i) {
//	    double p = Double.NaN;
//	    if (i[166] == null) {
//	      p = 2;
//	    } else if (((Double) i[166]).doubleValue() <= -1.84) {
//	      p = 2;
//	    } else if (((Double) i[166]).doubleValue() > -1.84) {
//	      p = 3;
//	    } 
//	    return p;
//	  }
//	  static double N3a01007a999(Object []i) {
//	    double p = Double.NaN;
//	    if (i[74] == null) {
//	      p = 0;
//	    } else if (((Double) i[74]).doubleValue() <= 9.2) {
//	    p = AuthenticSenseClassifier_2.N17c667561000(i);
//	    } else if (((Double) i[74]).doubleValue() > 9.2) {
//	    p = AuthenticSenseClassifier_2.N62aa4b4b1001(i);
//	    } 
//	    return p;
//	  }
//	  static double N17c667561000(Object []i) {
//	    double p = Double.NaN;
//	    if (i[170] == null) {
//	      p = 0;
//	    } else if (((Double) i[170]).doubleValue() <= 10.42) {
//	      p = 0;
//	    } else if (((Double) i[170]).doubleValue() > 10.42) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N62aa4b4b1001(Object []i) {
//	    double p = Double.NaN;
//	    if (i[158] == null) {
//	      p = 3;
//	    } else if (((Double) i[158]).doubleValue() <= 7.66) {
//	    p = AuthenticSenseClassifier_2.N1a355b881002(i);
//	    } else if (((Double) i[158]).doubleValue() > 7.66) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N1a355b881002(Object []i) {
//	    double p = Double.NaN;
//	    if (i[154] == null) {
//	      p = 0;
//	    } else if (((Double) i[154]).doubleValue() <= 3.37) {
//	      p = 0;
//	    } else if (((Double) i[154]).doubleValue() > 3.37) {
//	      p = 3;
//	    } 
//	    return p;
//	  }
//	}
//	class AuthenticSenseClassifier_3 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = AuthenticSenseClassifier_3.N250c4b291003(i);
//	    return p;
//	  }
//	  static double N250c4b291003(Object []i) {
//	    double p = Double.NaN;
//	    if (i[179] == null) {
//	      p = 0;
//	    } else if (((Double) i[179]).doubleValue() <= 4.6) {
//	    p = AuthenticSenseClassifier_3.N4a1a83bf1004(i);
//	    } else if (((Double) i[179]).doubleValue() > 4.6) {
//	    p = AuthenticSenseClassifier_3.N12bf969b1005(i);
//	    } 
//	    return p;
//	  }
//	  static double N4a1a83bf1004(Object []i) {
//	    double p = Double.NaN;
//	    if (i[161] == null) {
//	      p = 0;
//	    } else if (((Double) i[161]).doubleValue() <= 4.9) {
//	      p = 0;
//	    } else if (((Double) i[161]).doubleValue() > 4.9) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N12bf969b1005(Object []i) {
//	    double p = Double.NaN;
//	    if (i[151] == null) {
//	      p = 2;
//	    } else if (((Double) i[151]).doubleValue() <= 0.61) {
//	    p = AuthenticSenseClassifier_3.N6038a3ba1006(i);
//	    } else if (((Double) i[151]).doubleValue() > 0.61) {
//	    p = AuthenticSenseClassifier_3.N30ae4e5f1009(i);
//	    } 
//	    return p;
//	  }
//	  static double N6038a3ba1006(Object []i) {
//	    double p = Double.NaN;
//	    if (i[128] == null) {
//	      p = 0;
//	    } else if (((Double) i[128]).doubleValue() <= 8.9) {
//	    p = AuthenticSenseClassifier_3.N268539b01007(i);
//	    } else if (((Double) i[128]).doubleValue() > 8.9) {
//	    p = AuthenticSenseClassifier_3.N748e65911008(i);
//	    } 
//	    return p;
//	  }
//	  static double N268539b01007(Object []i) {
//	    double p = Double.NaN;
//	    if (i[158] == null) {
//	      p = 1;
//	    } else if (((Double) i[158]).doubleValue() <= 6.59) {
//	      p = 1;
//	    } else if (((Double) i[158]).doubleValue() > 6.59) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	  static double N748e65911008(Object []i) {
//	    double p = Double.NaN;
//	    if (i[85] == null) {
//	      p = 0;
//	    } else if (((Double) i[85]).doubleValue() <= -0.5) {
//	      p = 0;
//	    } else if (((Double) i[85]).doubleValue() > -0.5) {
//	      p = 2;
//	    } 
//	    return p;
//	  }
//	  static double N30ae4e5f1009(Object []i) {
//	    double p = Double.NaN;
//	    if (i[122] == null) {
//	      p = 0;
//	    } else if (((Double) i[122]).doubleValue() <= 8.8) {
//	      p = 0;
//	    } else if (((Double) i[122]).doubleValue() > 8.8) {
//	      p = 3;
//	    } 
//	    return p;
//	  }
//	}
//	class AuthenticSenseClassifier_4 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = AuthenticSenseClassifier_4.N39b57f11010(i);
//	    return p;
//	  }
//	  static double N39b57f11010(Object []i) {
//	    double p = Double.NaN;
//	    if (i[161] == null) {
//	      p = 3;
//	    } else if (((Double) i[161]).doubleValue() <= -3.22) {
//	    p = AuthenticSenseClassifier_4.N4baa91101011(i);
//	    } else if (((Double) i[161]).doubleValue() > -3.22) {
//	    p = AuthenticSenseClassifier_4.N2dc426341013(i);
//	    } 
//	    return p;
//	  }
//	  static double N4baa91101011(Object []i) {
//	    double p = Double.NaN;
//	    if (i[166] == null) {
//	      p = 2;
//	    } else if (((Double) i[166]).doubleValue() <= -1.84) {
//	      p = 2;
//	    } else if (((Double) i[166]).doubleValue() > -1.84) {
//	    p = AuthenticSenseClassifier_4.N2b19d83f1012(i);
//	    } 
//	    return p;
//	  }
//	  static double N2b19d83f1012(Object []i) {
//	    double p = Double.NaN;
//	    if (i[179] == null) {
//	      p = 0;
//	    } else if (((Double) i[179]).doubleValue() <= 3.68) {
//	      p = 0;
//	    } else if (((Double) i[179]).doubleValue() > 3.68) {
//	      p = 3;
//	    } 
//	    return p;
//	  }
//	  static double N2dc426341013(Object []i) {
//	    double p = Double.NaN;
//	    if (i[179] == null) {
//	      p = 1;
//	    } else if (((Double) i[179]).doubleValue() <= -1.99) {
//	      p = 1;
//	    } else if (((Double) i[179]).doubleValue() > -1.99) {
//	    p = AuthenticSenseClassifier_4.N28a837651014(i);
//	    } 
//	    return p;
//	  }
//	  static double N28a837651014(Object []i) {
//	    double p = Double.NaN;
//	    if (i[170] == null) {
//	      p = 0;
//	    } else if (((Double) i[170]).doubleValue() <= 9.19) {
//	    p = AuthenticSenseClassifier_4.N3bccdcbd1015(i);
//	    } else if (((Double) i[170]).doubleValue() > 9.19) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N3bccdcbd1015(Object []i) {
//	    double p = Double.NaN;
//	    if (i[53] == null) {
//	      p = 0;
//	    } else if (((Double) i[53]).doubleValue() <= 10.0) {
//	      p = 0;
//	    } else if (((Double) i[53]).doubleValue() > 10.0) {
//	      p = 2;
//	    } 
//	    return p;
//	  }
//	}
//	class AuthenticSenseClassifier_5 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = AuthenticSenseClassifier_5.N6b01af71016(i);
//	    return p;
//	  }
//	  static double N6b01af71016(Object []i) {
//	    double p = Double.NaN;
//	    if (i[161] == null) {
//	      p = 3;
//	    } else if (((Double) i[161]).doubleValue() <= -5.82) {
//	    p = AuthenticSenseClassifier_5.N13ba518f1017(i);
//	    } else if (((Double) i[161]).doubleValue() > -5.82) {
//	    p = AuthenticSenseClassifier_5.N2d408d671018(i);
//	    } 
//	    return p;
//	  }
//	  static double N13ba518f1017(Object []i) {
//	    double p = Double.NaN;
//	    if (i[178] == null) {
//	      p = 2;
//	    } else if (((Double) i[178]).doubleValue() <= 0.0) {
//	      p = 2;
//	    } else if (((Double) i[178]).doubleValue() > 0.0) {
//	      p = 3;
//	    } 
//	    return p;
//	  }
//	  static double N2d408d671018(Object []i) {
//	    double p = Double.NaN;
//	    if (i[179] == null) {
//	      p = 1;
//	    } else if (((Double) i[179]).doubleValue() <= -5.36) {
//	      p = 1;
//	    } else if (((Double) i[179]).doubleValue() > -5.36) {
//	    p = AuthenticSenseClassifier_5.N69037c661019(i);
//	    } 
//	    return p;
//	  }
//	  static double N69037c661019(Object []i) {
//	    double p = Double.NaN;
//	    if (i[152] == null) {
//	      p = 3;
//	    } else if (((Double) i[152]).doubleValue() <= -5.21) {
//	      p = 3;
//	    } else if (((Double) i[152]).doubleValue() > -5.21) {
//	    p = AuthenticSenseClassifier_5.N63dc42661020(i);
//	    } 
//	    return p;
//	  }
//	  static double N63dc42661020(Object []i) {
//	    double p = Double.NaN;
//	    if (i[103] == null) {
//	      p = 3;
//	    } else if (((Double) i[103]).doubleValue() <= -3.0) {
//	      p = 3;
//	    } else if (((Double) i[103]).doubleValue() > -3.0) {
//	    p = AuthenticSenseClassifier_5.N118b69c21021(i);
//	    } 
//	    return p;
//	  }
//	  static double N118b69c21021(Object []i) {
//	    double p = Double.NaN;
//	    if (i[20] == null) {
//	      p = 0;
//	    } else if (((Double) i[20]).doubleValue() <= 9.5) {
//	      p = 0;
//	    } else if (((Double) i[20]).doubleValue() > 9.5) {
//	      p = 2;
//	    } 
//	    return p;
//	  }
//	}
//	class AuthenticSenseClassifier_6 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = AuthenticSenseClassifier_6.N57cc488d1022(i);
//	    return p;
//	  }
//	  static double N57cc488d1022(Object []i) {
//	    double p = Double.NaN;
//	    if (i[178] == null) {
//	      p = 1;
//	    } else if (((Double) i[178]).doubleValue() <= -2.76) {
//	    p = AuthenticSenseClassifier_6.N24af4e031023(i);
//	    } else if (((Double) i[178]).doubleValue() > -2.76) {
//	    p = AuthenticSenseClassifier_6.N2c0a6e8e1025(i);
//	    } 
//	    return p;
//	  }
//	  static double N24af4e031023(Object []i) {
//	    double p = Double.NaN;
//	    if (i[160] == null) {
//	      p = 0;
//	    } else if (((Double) i[160]).doubleValue() <= -6.28) {
//	      p = 0;
//	    } else if (((Double) i[160]).doubleValue() > -6.28) {
//	    p = AuthenticSenseClassifier_6.N712ab9c51024(i);
//	    } 
//	    return p;
//	  }
//	  static double N712ab9c51024(Object []i) {
//	    double p = Double.NaN;
//	    if (i[179] == null) {
//	      p = 1;
//	    } else if (((Double) i[179]).doubleValue() <= 6.28) {
//	      p = 1;
//	    } else if (((Double) i[179]).doubleValue() > 6.28) {
//	      p = 2;
//	    } 
//	    return p;
//	  }
//	  static double N2c0a6e8e1025(Object []i) {
//	    double p = Double.NaN;
//	    if (i[160] == null) {
//	      p = 1;
//	    } else if (((Double) i[160]).doubleValue() <= -6.44) {
//	      p = 1;
//	    } else if (((Double) i[160]).doubleValue() > -6.44) {
//	    p = AuthenticSenseClassifier_6.N60e043381026(i);
//	    } 
//	    return p;
//	  }
//	  static double N60e043381026(Object []i) {
//	    double p = Double.NaN;
//	    if (i[107] == null) {
//	      p = 0;
//	    } else if (((Double) i[107]).doubleValue() <= 9.5) {
//	    p = AuthenticSenseClassifier_6.N235d43381027(i);
//	    } else if (((Double) i[107]).doubleValue() > 9.5) {
//	      p = 3;
//	    } 
//	    return p;
//	  }
//	  static double N235d43381027(Object []i) {
//	    double p = Double.NaN;
//	    if (i[158] == null) {
//	      p = 3;
//	    } else if (((Double) i[158]).doubleValue() <= -9.5) {
//	      p = 3;
//	    } else if (((Double) i[158]).doubleValue() > -9.5) {
//	    p = AuthenticSenseClassifier_6.N3fe823ab1028(i);
//	    } 
//	    return p;
//	  }
//	  static double N3fe823ab1028(Object []i) {
//	    double p = Double.NaN;
//	    if (i[156] == null) {
//	      p = 3;
//	    } else if (((Double) i[156]).doubleValue() <= -2.3) {
//	      p = 3;
//	    } else if (((Double) i[156]).doubleValue() > -2.3) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	}
//	class AuthenticSenseClassifier_7 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = AuthenticSenseClassifier_7.N217dd0541029(i);
//	    return p;
//	  }
//	  static double N217dd0541029(Object []i) {
//	    double p = Double.NaN;
//	    if (i[161] == null) {
//	      p = 2;
//	    } else if (((Double) i[161]).doubleValue() <= -5.82) {
//	    p = AuthenticSenseClassifier_7.N4af84bf91030(i);
//	    } else if (((Double) i[161]).doubleValue() > -5.82) {
//	    p = AuthenticSenseClassifier_7.N70f8728c1032(i);
//	    } 
//	    return p;
//	  }
//	  static double N4af84bf91030(Object []i) {
//	    double p = Double.NaN;
//	    if (i[179] == null) {
//	      p = 0;
//	    } else if (((Double) i[179]).doubleValue() <= -1.99) {
//	      p = 0;
//	    } else if (((Double) i[179]).doubleValue() > -1.99) {
//	    p = AuthenticSenseClassifier_7.N7343eee21031(i);
//	    } 
//	    return p;
//	  }
//	  static double N7343eee21031(Object []i) {
//	    double p = Double.NaN;
//	    if (i[166] == null) {
//	      p = 2;
//	    } else if (((Double) i[166]).doubleValue() <= 1.69) {
//	      p = 2;
//	    } else if (((Double) i[166]).doubleValue() > 1.69) {
//	      p = 3;
//	    } 
//	    return p;
//	  }
//	  static double N70f8728c1032(Object []i) {
//	    double p = Double.NaN;
//	    if (i[161] == null) {
//	      p = 0;
//	    } else if (((Double) i[161]).doubleValue() <= 9.19) {
//	    p = AuthenticSenseClassifier_7.N47287f451033(i);
//	    } else if (((Double) i[161]).doubleValue() > 9.19) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N47287f451033(Object []i) {
//	    double p = Double.NaN;
//	    if (i[142] == null) {
//	      p = 3;
//	    } else if (((Double) i[142]).doubleValue() <= -0.7) {
//	    p = AuthenticSenseClassifier_7.N33bbaf821034(i);
//	    } else if (((Double) i[142]).doubleValue() > -0.7) {
//	    p = AuthenticSenseClassifier_7.N66ff9a561035(i);
//	    } 
//	    return p;
//	  }
//	  static double N33bbaf821034(Object []i) {
//	    double p = Double.NaN;
//	    if (i[158] == null) {
//	      p = 3;
//	    } else if (((Double) i[158]).doubleValue() <= -0.92) {
//	      p = 3;
//	    } else if (((Double) i[158]).doubleValue() > -0.92) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N66ff9a561035(Object []i) {
//	    double p = Double.NaN;
//	    if (i[167] == null) {
//	      p = 0;
//	    } else if (((Double) i[167]).doubleValue() <= 10.11) {
//	      p = 0;
//	    } else if (((Double) i[167]).doubleValue() > 10.11) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	}
//	class AuthenticSenseClassifier_8 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = AuthenticSenseClassifier_8.N16edb8ee1036(i);
//	    return p;
//	  }
//	  static double N16edb8ee1036(Object []i) {
//	    double p = Double.NaN;
//	    if (i[178] == null) {
//	      p = 1;
//	    } else if (((Double) i[178]).doubleValue() <= -6.74) {
//	    p = AuthenticSenseClassifier_8.N51081d041037(i);
//	    } else if (((Double) i[178]).doubleValue() > -6.74) {
//	    p = AuthenticSenseClassifier_8.N6ba91b2b1038(i);
//	    } 
//	    return p;
//	  }
//	  static double N51081d041037(Object []i) {
//	    double p = Double.NaN;
//	    if (i[160] == null) {
//	      p = 0;
//	    } else if (((Double) i[160]).doubleValue() <= -5.98) {
//	      p = 0;
//	    } else if (((Double) i[160]).doubleValue() > -5.98) {
//	      p = 1;
//	    } 
//	    return p;
//	  }
//	  static double N6ba91b2b1038(Object []i) {
//	    double p = Double.NaN;
//	    if (i[68] == null) {
//	      p = 0;
//	    } else if (((Double) i[68]).doubleValue() <= 9.0) {
//	    p = AuthenticSenseClassifier_8.N2b36db451039(i);
//	    } else if (((Double) i[68]).doubleValue() > 9.0) {
//	    p = AuthenticSenseClassifier_8.N3daf3cfa1041(i);
//	    } 
//	    return p;
//	  }
//	  static double N2b36db451039(Object []i) {
//	    double p = Double.NaN;
//	    if (i[164] == null) {
//	      p = 2;
//	    } else if (((Double) i[164]).doubleValue() <= -9.35) {
//	      p = 2;
//	    } else if (((Double) i[164]).doubleValue() > -9.35) {
//	    p = AuthenticSenseClassifier_8.N1e75a52d1040(i);
//	    } 
//	    return p;
//	  }
//	  static double N1e75a52d1040(Object []i) {
//	    double p = Double.NaN;
//	    if (i[54] == null) {
//	      p = 1;
//	    } else if (((Double) i[54]).doubleValue() <= -1.9) {
//	      p = 1;
//	    } else if (((Double) i[54]).doubleValue() > -1.9) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	  static double N3daf3cfa1041(Object []i) {
//	    double p = Double.NaN;
//	    if (i[156] == null) {
//	      p = 3;
//	    } else if (((Double) i[156]).doubleValue() <= 1.07) {
//	    p = AuthenticSenseClassifier_8.N3bcc60b91042(i);
//	    } else if (((Double) i[156]).doubleValue() > 1.07) {
//	      p = 2;
//	    } 
//	    return p;
//	  }
//	  static double N3bcc60b91042(Object []i) {
//	    double p = Double.NaN;
//	    if (i[158] == null) {
//	      p = 3;
//	    } else if (((Double) i[158]).doubleValue() <= -1.84) {
//	      p = 3;
//	    } else if (((Double) i[158]).doubleValue() > -1.84) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	}
//	class AuthenticSenseClassifier_9 {
//
//	  public static double classify(Object[] i)
//	    throws Exception {
//
//	    double p = Double.NaN;
//	    p = AuthenticSenseClassifier_9.N66e2305a1043(i);
//	    return p;
//	  }
//	  static double N66e2305a1043(Object []i) {
//	    double p = Double.NaN;
//	    if (i[161] == null) {
//	      p = 3;
//	    } else if (((Double) i[161]).doubleValue() <= -3.22) {
//	    p = AuthenticSenseClassifier_9.Nbd4997b1044(i);
//	    } else if (((Double) i[161]).doubleValue() > -3.22) {
//	    p = AuthenticSenseClassifier_9.N4c4abadd1046(i);
//	    } 
//	    return p;
//	  }
//	  static double Nbd4997b1044(Object []i) {
//	    double p = Double.NaN;
//	    if (i[79] == null) {
//	      p = 3;
//	    } else if (((Double) i[79]).doubleValue() <= 2.0) {
//	    p = AuthenticSenseClassifier_9.N32a8604e1045(i);
//	    } else if (((Double) i[79]).doubleValue() > 2.0) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	  static double N32a8604e1045(Object []i) {
//	    double p = Double.NaN;
//	    if (i[151] == null) {
//	      p = 2;
//	    } else if (((Double) i[151]).doubleValue() <= -1.69) {
//	      p = 2;
//	    } else if (((Double) i[151]).doubleValue() > -1.69) {
//	      p = 3;
//	    } 
//	    return p;
//	  }
//	  static double N4c4abadd1046(Object []i) {
//	    double p = Double.NaN;
//	    if (i[179] == null) {
//	      p = 1;
//	    } else if (((Double) i[179]).doubleValue() <= -3.06) {
//	      p = 1;
//	    } else if (((Double) i[179]).doubleValue() > -3.06) {
//	    p = AuthenticSenseClassifier_9.N3e322a4c1047(i);
//	    } 
//	    return p;
//	  }
//	  static double N3e322a4c1047(Object []i) {
//	    double p = Double.NaN;
//	    if (i[65] == null) {
//	      p = 0;
//	    } else if (((Double) i[65]).doubleValue() <= 10.3) {
//	    p = AuthenticSenseClassifier_9.N4f77037a1048(i);
//	    } else if (((Double) i[65]).doubleValue() > 10.3) {
//	      p = 2;
//	    } 
//	    return p;
//	  }
//	  static double N4f77037a1048(Object []i) {
//	    double p = Double.NaN;
//	    if (i[151] == null) {
//	      p = 1;
//	    } else if (((Double) i[151]).doubleValue() <= -7.66) {
//	      p = 1;
//	    } else if (((Double) i[151]).doubleValue() > -7.66) {
//	      p = 0;
//	    } 
//	    return p;
//	  }
//	}