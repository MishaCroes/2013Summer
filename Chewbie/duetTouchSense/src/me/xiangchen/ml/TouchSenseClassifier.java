package me.xiangchen.ml;

public class TouchSenseClassifier {

	  public static double classify(Object[] i) throws Exception {
	    double [] sums = new double [3];
	    sums[(int) TouchSenseClassifier_0.classify(i)] += 3.2865344733420083;
	    sums[(int) TouchSenseClassifier_1.classify(i)] += 3.0637822923180176;
	    sums[(int) TouchSenseClassifier_2.classify(i)] += 2.6448356871929897;
	    sums[(int) TouchSenseClassifier_3.classify(i)] += 2.6297703583995227;
	    sums[(int) TouchSenseClassifier_4.classify(i)] += 3.269959312607079;
	    sums[(int) TouchSenseClassifier_5.classify(i)] += 5.05837550308939;
	    sums[(int) TouchSenseClassifier_6.classify(i)] += 3.1720608177180805;
	    sums[(int) TouchSenseClassifier_7.classify(i)] += 2.9853670738226783;
	    sums[(int) TouchSenseClassifier_8.classify(i)] += 3.3794770007691524;
	    sums[(int) TouchSenseClassifier_9.classify(i)] += 3.6858221053409452;
	    double maxV = sums[0];
	    int maxI = 0;
	    for (int j = 1; j < 3; j++) {
	      if (sums[j] > maxV) { maxV = sums[j]; maxI = j; }
	    }
	    return (double) maxI;
	  }
	}
	class TouchSenseClassifier_0 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_0.N50e68513310(i);
	    return p;
	  }
	  static double N50e68513310(Object []i) {
	    double p = Double.NaN;
	    if (i[83] == null) {
	      p = 2;
	    } else if (((Double) i[83]).doubleValue() <= 5.36) {
	    p = TouchSenseClassifier_0.N4e2acbe3311(i);
	    } else if (((Double) i[83]).doubleValue() > 5.36) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4e2acbe3311(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 2;
	    } else if (((Double) i[89]).doubleValue() <= 0.61) {
	    p = TouchSenseClassifier_0.N5bafcc2c312(i);
	    } else if (((Double) i[89]).doubleValue() > 0.61) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5bafcc2c312(Object []i) {
	    double p = Double.NaN;
	    if (i[82] == null) {
	      p = 1;
	    } else if (((Double) i[82]).doubleValue() <= -8.58) {
	      p = 1;
	    } else if (((Double) i[82]).doubleValue() > -8.58) {
	      p = 2;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_1 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_1.N72858bba313(i);
	    return p;
	  }
	  static double N72858bba313(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 2;
	    } else if (((Double) i[89]).doubleValue() <= 1.38) {
	    p = TouchSenseClassifier_1.N1d989b13314(i);
	    } else if (((Double) i[89]).doubleValue() > 1.38) {
	    p = TouchSenseClassifier_1.Nded0b93315(i);
	    } 
	    return p;
	  }
	  static double N1d989b13314(Object []i) {
	    double p = Double.NaN;
	    if (i[90] == null) {
	      p = 2;
	    } else if (((Double) i[90]).doubleValue() <= 0.0235) {
	      p = 2;
	    } else if (((Double) i[90]).doubleValue() > 0.0235) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Nded0b93315(Object []i) {
	    double p = Double.NaN;
	    if (i[86] == null) {
	      p = 1;
	    } else if (((Double) i[86]).doubleValue() <= 6.28) {
	    p = TouchSenseClassifier_1.N4592e709316(i);
	    } else if (((Double) i[86]).doubleValue() > 6.28) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4592e709316(Object []i) {
	    double p = Double.NaN;
	    if (i[90] == null) {
	      p = 1;
	    } else if (((Double) i[90]).doubleValue() <= 0.0333) {
	    p = TouchSenseClassifier_1.N2f7e238e317(i);
	    } else if (((Double) i[90]).doubleValue() > 0.0333) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2f7e238e317(Object []i) {
	    double p = Double.NaN;
	    if (i[86] == null) {
	      p = 1;
	    } else if (((Double) i[86]).doubleValue() <= 4.75) {
	      p = 1;
	    } else if (((Double) i[86]).doubleValue() > 4.75) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_2 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_2.N25057fe318(i);
	    return p;
	  }
	  static double N25057fe318(Object []i) {
	    double p = Double.NaN;
	    if (i[88] == null) {
	      p = 1;
	    } else if (((Double) i[88]).doubleValue() <= -3.83) {
	    p = TouchSenseClassifier_2.N68c0e5e1319(i);
	    } else if (((Double) i[88]).doubleValue() > -3.83) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N68c0e5e1319(Object []i) {
	    double p = Double.NaN;
	    if (i[86] == null) {
	      p = 2;
	    } else if (((Double) i[86]).doubleValue() <= 1.23) {
	    p = TouchSenseClassifier_2.N50344c81320(i);
	    } else if (((Double) i[86]).doubleValue() > 1.23) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N50344c81320(Object []i) {
	    double p = Double.NaN;
	    if (i[79] == null) {
	      p = 1;
	    } else if (((Double) i[79]).doubleValue() <= -9.04) {
	      p = 1;
	    } else if (((Double) i[79]).doubleValue() > -9.04) {
	      p = 2;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_3 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_3.N198ad24a321(i);
	    return p;
	  }
	  static double N198ad24a321(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() <= 5.67) {
	    p = TouchSenseClassifier_3.N68f4055f322(i);
	    } else if (((Double) i[89]).doubleValue() > 5.67) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N68f4055f322(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 2;
	    } else if (((Double) i[11]).doubleValue() <= 6.57) {
	      p = 2;
	    } else if (((Double) i[11]).doubleValue() > 6.57) {
	    p = TouchSenseClassifier_3.N6c8cd5cd323(i);
	    } 
	    return p;
	  }
	  static double N6c8cd5cd323(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 2;
	    } else if (((Double) i[89]).doubleValue() <= -3.06) {
	      p = 2;
	    } else if (((Double) i[89]).doubleValue() > -3.06) {
	    p = TouchSenseClassifier_3.N1228bd68324(i);
	    } 
	    return p;
	  }
	  static double N1228bd68324(Object []i) {
	    double p = Double.NaN;
	    if (i[77] == null) {
	      p = 1;
	    } else if (((Double) i[77]).doubleValue() <= 5.82) {
	    p = TouchSenseClassifier_3.N30ab0028325(i);
	    } else if (((Double) i[77]).doubleValue() > 5.82) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N30ab0028325(Object []i) {
	    double p = Double.NaN;
	    if (i[23] == null) {
	      p = 2;
	    } else if (((Double) i[23]).doubleValue() <= 7.24) {
	      p = 2;
	    } else if (((Double) i[23]).doubleValue() > 7.24) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_4 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_4.N2a975b0e326(i);
	    return p;
	  }
	  static double N2a975b0e326(Object []i) {
	    double p = Double.NaN;
	    if (i[86] == null) {
	      p = 2;
	    } else if (((Double) i[86]).doubleValue() <= 1.69) {
	    p = TouchSenseClassifier_4.N36db09fa327(i);
	    } else if (((Double) i[86]).doubleValue() > 1.69) {
	    p = TouchSenseClassifier_4.N666c1838328(i);
	    } 
	    return p;
	  }
	  static double N36db09fa327(Object []i) {
	    double p = Double.NaN;
	    if (i[82] == null) {
	      p = 1;
	    } else if (((Double) i[82]).doubleValue() <= -9.04) {
	      p = 1;
	    } else if (((Double) i[82]).doubleValue() > -9.04) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N666c1838328(Object []i) {
	    double p = Double.NaN;
	    if (i[64] == null) {
	      p = 0;
	    } else if (((Double) i[64]).doubleValue() <= 3.31) {
	    p = TouchSenseClassifier_4.N42aa3910329(i);
	    } else if (((Double) i[64]).doubleValue() > 3.31) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N42aa3910329(Object []i) {
	    double p = Double.NaN;
	    if (i[86] == null) {
	      p = 1;
	    } else if (((Double) i[86]).doubleValue() <= 5.06) {
	      p = 1;
	    } else if (((Double) i[86]).doubleValue() > 5.06) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_5 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_5.N35886ba1330(i);
	    return p;
	  }
	  static double N35886ba1330(Object []i) {
	    double p = Double.NaN;
	    if (i[86] == null) {
	      p = 1;
	    } else if (((Double) i[86]).doubleValue() <= 4.75) {
	    p = TouchSenseClassifier_5.Nf52327c331(i);
	    } else if (((Double) i[86]).doubleValue() > 4.75) {
	    p = TouchSenseClassifier_5.N58cfbd2d334(i);
	    } 
	    return p;
	  }
	  static double Nf52327c331(Object []i) {
	    double p = Double.NaN;
	    if (i[90] == null) {
	      p = 2;
	    } else if (((Double) i[90]).doubleValue() <= 0.0196) {
	      p = 2;
	    } else if (((Double) i[90]).doubleValue() > 0.0196) {
	    p = TouchSenseClassifier_5.N5d7072bf332(i);
	    } 
	    return p;
	  }
	  static double N5d7072bf332(Object []i) {
	    double p = Double.NaN;
	    if (i[85] == null) {
	      p = 1;
	    } else if (((Double) i[85]).doubleValue() <= -7.35) {
	      p = 1;
	    } else if (((Double) i[85]).doubleValue() > -7.35) {
	    p = TouchSenseClassifier_5.N17d8986333(i);
	    } 
	    return p;
	  }
	  static double N17d8986333(Object []i) {
	    double p = Double.NaN;
	    if (i[83] == null) {
	      p = 2;
	    } else if (((Double) i[83]).doubleValue() <= 2.15) {
	      p = 2;
	    } else if (((Double) i[83]).doubleValue() > 2.15) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N58cfbd2d334(Object []i) {
	    double p = Double.NaN;
	    if (i[50] == null) {
	      p = 1;
	    } else if (((Double) i[50]).doubleValue() <= 8.33) {
	    p = TouchSenseClassifier_5.N2e8d02e8335(i);
	    } else if (((Double) i[50]).doubleValue() > 8.33) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N2e8d02e8335(Object []i) {
	    double p = Double.NaN;
	    if (i[80] == null) {
	      p = 1;
	    } else if (((Double) i[80]).doubleValue() <= 7.51) {
	      p = 1;
	    } else if (((Double) i[80]).doubleValue() > 7.51) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_6 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_6.N2bb9e538336(i);
	    return p;
	  }
	  static double N2bb9e538336(Object []i) {
	    double p = Double.NaN;
	    if (i[77] == null) {
	      p = 2;
	    } else if (((Double) i[77]).doubleValue() <= -3.68) {
	      p = 2;
	    } else if (((Double) i[77]).doubleValue() > -3.68) {
	    p = TouchSenseClassifier_6.N3977d5f5337(i);
	    } 
	    return p;
	  }
	  static double N3977d5f5337(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() <= 5.21) {
	    p = TouchSenseClassifier_6.N6a7fe54c338(i);
	    } else if (((Double) i[89]).doubleValue() > 5.21) {
	    p = TouchSenseClassifier_6.N72a71733339(i);
	    } 
	    return p;
	  }
	  static double N6a7fe54c338(Object []i) {
	    double p = Double.NaN;
	    if (i[78] == null) {
	      p = 1;
	    } else if (((Double) i[78]).doubleValue() <= 3.98) {
	      p = 1;
	    } else if (((Double) i[78]).doubleValue() > 3.98) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N72a71733339(Object []i) {
	    double p = Double.NaN;
	    if (i[65] == null) {
	      p = 1;
	    } else if (((Double) i[65]).doubleValue() <= 6.56) {
	      p = 1;
	    } else if (((Double) i[65]).doubleValue() > 6.56) {
	    p = TouchSenseClassifier_6.N37e45013340(i);
	    } 
	    return p;
	  }
	  static double N37e45013340(Object []i) {
	    double p = Double.NaN;
	    if (i[88] == null) {
	      p = 1;
	    } else if (((Double) i[88]).doubleValue() <= -7.2) {
	      p = 1;
	    } else if (((Double) i[88]).doubleValue() > -7.2) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_7 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_7.N6e452c0f341(i);
	    return p;
	  }
	  static double N6e452c0f341(Object []i) {
	    double p = Double.NaN;
	    if (i[83] == null) {
	      p = 1;
	    } else if (((Double) i[83]).doubleValue() <= 5.36) {
	    p = TouchSenseClassifier_7.N7f4fc557342(i);
	    } else if (((Double) i[83]).doubleValue() > 5.36) {
	    p = TouchSenseClassifier_7.N4e25140d343(i);
	    } 
	    return p;
	  }
	  static double N7f4fc557342(Object []i) {
	    double p = Double.NaN;
	    if (i[90] == null) {
	      p = 2;
	    } else if (((Double) i[90]).doubleValue() <= 0.0216) {
	      p = 2;
	    } else if (((Double) i[90]).doubleValue() > 0.0216) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N4e25140d343(Object []i) {
	    double p = Double.NaN;
	    if (i[90] == null) {
	      p = 0;
	    } else if (((Double) i[90]).doubleValue() <= 0.0333) {
	      p = 0;
	    } else if (((Double) i[90]).doubleValue() > 0.0333) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_8 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_8.N6447898f344(i);
	    return p;
	  }
	  static double N6447898f344(Object []i) {
	    double p = Double.NaN;
	    if (i[86] == null) {
	      p = 2;
	    } else if (((Double) i[86]).doubleValue() <= 0.77) {
	    p = TouchSenseClassifier_8.N14983eb8345(i);
	    } else if (((Double) i[86]).doubleValue() > 0.77) {
	    p = TouchSenseClassifier_8.N173dac98346(i);
	    } 
	    return p;
	  }
	  static double N14983eb8345(Object []i) {
	    double p = Double.NaN;
	    if (i[85] == null) {
	      p = 1;
	    } else if (((Double) i[85]).doubleValue() <= -8.43) {
	      p = 1;
	    } else if (((Double) i[85]).doubleValue() > -8.43) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N173dac98346(Object []i) {
	    double p = Double.NaN;
	    if (i[81] == null) {
	      p = 0;
	    } else if (((Double) i[81]).doubleValue() <= 4.29) {
	    p = TouchSenseClassifier_8.N520e3b13347(i);
	    } else if (((Double) i[81]).doubleValue() > 4.29) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N520e3b13347(Object []i) {
	    double p = Double.NaN;
	    if (i[83] == null) {
	      p = 1;
	    } else if (((Double) i[83]).doubleValue() <= 4.44) {
	      p = 1;
	    } else if (((Double) i[83]).doubleValue() > 4.44) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_9 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_9.N2448867b348(i);
	    return p;
	  }
	  static double N2448867b348(Object []i) {
	    double p = Double.NaN;
	    if (i[83] == null) {
	      p = 2;
	    } else if (((Double) i[83]).doubleValue() <= 1.84) {
	    p = TouchSenseClassifier_9.N157507d9349(i);
	    } else if (((Double) i[83]).doubleValue() > 1.84) {
	    p = TouchSenseClassifier_9.N36564290350(i);
	    } 
	    return p;
	  }
	  static double N157507d9349(Object []i) {
	    double p = Double.NaN;
	    if (i[29] == null) {
	      p = 2;
	    } else if (((Double) i[29]).doubleValue() <= 8.74) {
	      p = 2;
	    } else if (((Double) i[29]).doubleValue() > 8.74) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N36564290350(Object []i) {
	    double p = Double.NaN;
	    if (i[86] == null) {
	      p = 1;
	    } else if (((Double) i[86]).doubleValue() <= 6.28) {
	    p = TouchSenseClassifier_9.N592c17ce351(i);
	    } else if (((Double) i[86]).doubleValue() > 6.28) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N592c17ce351(Object []i) {
	    double p = Double.NaN;
	    if (i[64] == null) {
	      p = 0;
	    } else if (((Double) i[64]).doubleValue() <= 3.31) {
	    p = TouchSenseClassifier_9.N5dcf031e352(i);
	    } else if (((Double) i[64]).doubleValue() > 3.31) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5dcf031e352(Object []i) {
	    double p = Double.NaN;
	    if (i[88] == null) {
	      p = 1;
	    } else if (((Double) i[88]).doubleValue() <= -7.81) {
	      p = 1;
	    } else if (((Double) i[88]).doubleValue() > -7.81) {
	      p = 0;
	    } 
	    return p;
	  }
	}