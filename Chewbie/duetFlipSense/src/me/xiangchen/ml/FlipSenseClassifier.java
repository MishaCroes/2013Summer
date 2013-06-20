package me.xiangchen.ml;

public class FlipSenseClassifier {

	  public static double classify(Object[] i) throws Exception {
	    double [] sums = new double [2];
	    sums[(int) FlipSenseClassifier_0.classify(i)] += 3.586600604993518;
	    sums[(int) FlipSenseClassifier_1.classify(i)] += 3.6794602321974423;
	    sums[(int) FlipSenseClassifier_2.classify(i)] += 3.561857441674923;
	    sums[(int) FlipSenseClassifier_3.classify(i)] += 3.7949088714023307;
	    sums[(int) FlipSenseClassifier_4.classify(i)] += 4.186430101236829;
	    sums[(int) FlipSenseClassifier_5.classify(i)] += 3.0884898861937313;
	    sums[(int) FlipSenseClassifier_6.classify(i)] += 3.3203582581460056;
	    sums[(int) FlipSenseClassifier_7.classify(i)] += 3.792927558328684;
	    sums[(int) FlipSenseClassifier_8.classify(i)] += 4.2048086111802645;
	    sums[(int) FlipSenseClassifier_9.classify(i)] += 2.985445611152302;
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
	    p = FlipSenseClassifier_0.N3f29cfbb2(i);
	    return p;
	  }
	  static double N3f29cfbb2(Object []i) {
	    double p = Double.NaN;
	    if (i[65] == null) {
	      p = 1;
	    } else if (((Double) i[65]).doubleValue() <= 5.52) {
	      p = 1;
	    } else if (((Double) i[65]).doubleValue() > 5.52) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_1 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_1.N52051e623(i);
	    return p;
	  }
	  static double N52051e623(Object []i) {
	    double p = Double.NaN;
	    if (i[68] == null) {
	      p = 1;
	    } else if (((Double) i[68]).doubleValue() <= 5.06) {
	      p = 1;
	    } else if (((Double) i[68]).doubleValue() > 5.06) {
	    p = FlipSenseClassifier_1.N4e0dddff4(i);
	    } 
	    return p;
	  }
	  static double N4e0dddff4(Object []i) {
	    double p = Double.NaN;
	    if (i[53] == null) {
	      p = 1;
	    } else if (((Double) i[53]).doubleValue() <= 1.84) {
	      p = 1;
	    } else if (((Double) i[53]).doubleValue() > 1.84) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_2 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_2.N7069b8615(i);
	    return p;
	  }
	  static double N7069b8615(Object []i) {
	    double p = Double.NaN;
	    if (i[60] == null) {
	      p = 0;
	    } else if (((Double) i[60]).doubleValue() <= 4.29) {
	      p = 0;
	    } else if (((Double) i[60]).doubleValue() > 4.29) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_3 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_3.N2cc821ef6(i);
	    return p;
	  }
	  static double N2cc821ef6(Object []i) {
	    double p = Double.NaN;
	    if (i[65] == null) {
	      p = 1;
	    } else if (((Double) i[65]).doubleValue() <= 5.52) {
	      p = 1;
	    } else if (((Double) i[65]).doubleValue() > 5.52) {
	    p = FlipSenseClassifier_3.N72be8e17(i);
	    } 
	    return p;
	  }
	  static double N72be8e17(Object []i) {
	    double p = Double.NaN;
	    if (i[68] == null) {
	      p = 1;
	    } else if (((Double) i[68]).doubleValue() <= 2.45) {
	      p = 1;
	    } else if (((Double) i[68]).doubleValue() > 2.45) {
	    p = FlipSenseClassifier_3.N53c60f748(i);
	    } 
	    return p;
	  }
	  static double N53c60f748(Object []i) {
	    double p = Double.NaN;
	    if (i[32] == null) {
	      p = 0;
	    } else if (((Double) i[32]).doubleValue() <= 8.15) {
	      p = 0;
	    } else if (((Double) i[32]).doubleValue() > 8.15) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_4 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_4.N7020b3a39(i);
	    return p;
	  }
	  static double N7020b3a39(Object []i) {
	    double p = Double.NaN;
	    if (i[65] == null) {
	      p = 1;
	    } else if (((Double) i[65]).doubleValue() <= 5.52) {
	      p = 1;
	    } else if (((Double) i[65]).doubleValue() > 5.52) {
	    p = FlipSenseClassifier_4.N72f1cbd710(i);
	    } 
	    return p;
	  }
	  static double N72f1cbd710(Object []i) {
	    double p = Double.NaN;
	    if (i[68] == null) {
	      p = 1;
	    } else if (((Double) i[68]).doubleValue() <= 2.45) {
	      p = 1;
	    } else if (((Double) i[68]).doubleValue() > 2.45) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_5 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_5.N607dcb3511(i);
	    return p;
	  }
	  static double N607dcb3511(Object []i) {
	    double p = Double.NaN;
	    if (i[31] == null) {
	      p = 0;
	    } else if (((Double) i[31]).doubleValue() <= 4.66) {
	      p = 0;
	    } else if (((Double) i[31]).doubleValue() > 4.66) {
	    p = FlipSenseClassifier_5.N62a8361012(i);
	    } 
	    return p;
	  }
	  static double N62a8361012(Object []i) {
	    double p = Double.NaN;
	    if (i[47] == null) {
	      p = 0;
	    } else if (((Double) i[47]).doubleValue() <= 7.5) {
	    p = FlipSenseClassifier_5.N1175870a13(i);
	    } else if (((Double) i[47]).doubleValue() > 7.5) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N1175870a13(Object []i) {
	    double p = Double.NaN;
	    if (i[65] == null) {
	      p = 1;
	    } else if (((Double) i[65]).doubleValue() <= 7.05) {
	      p = 1;
	    } else if (((Double) i[65]).doubleValue() > 7.05) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_6 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_6.N3af4aa7a14(i);
	    return p;
	  }
	  static double N3af4aa7a14(Object []i) {
	    double p = Double.NaN;
	    if (i[53] == null) {
	      p = 1;
	    } else if (((Double) i[53]).doubleValue() <= 1.84) {
	      p = 1;
	    } else if (((Double) i[53]).doubleValue() > 1.84) {
	    p = FlipSenseClassifier_6.N14e44dd315(i);
	    } 
	    return p;
	  }
	  static double N14e44dd315(Object []i) {
	    double p = Double.NaN;
	    if (i[68] == null) {
	      p = 1;
	    } else if (((Double) i[68]).doubleValue() <= 5.06) {
	      p = 1;
	    } else if (((Double) i[68]).doubleValue() > 5.06) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_7 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_7.N18b1625c16(i);
	    return p;
	  }
	  static double N18b1625c16(Object []i) {
	    double p = Double.NaN;
	    if (i[65] == null) {
	      p = 1;
	    } else if (((Double) i[65]).doubleValue() <= 5.52) {
	      p = 1;
	    } else if (((Double) i[65]).doubleValue() > 5.52) {
	    p = FlipSenseClassifier_7.N25b092ae17(i);
	    } 
	    return p;
	  }
	  static double N25b092ae17(Object []i) {
	    double p = Double.NaN;
	    if (i[53] == null) {
	      p = 1;
	    } else if (((Double) i[53]).doubleValue() <= -3.22) {
	      p = 1;
	    } else if (((Double) i[53]).doubleValue() > -3.22) {
	    p = FlipSenseClassifier_7.N6b6df0d618(i);
	    } 
	    return p;
	  }
	  static double N6b6df0d618(Object []i) {
	    double p = Double.NaN;
	    if (i[68] == null) {
	      p = 1;
	    } else if (((Double) i[68]).doubleValue() <= 6.13) {
	      p = 1;
	    } else if (((Double) i[68]).doubleValue() > 6.13) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_8 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_8.N7edea8b319(i);
	    return p;
	  }
	  static double N7edea8b319(Object []i) {
	    double p = Double.NaN;
	    if (i[65] == null) {
	      p = 1;
	    } else if (((Double) i[65]).doubleValue() <= 5.52) {
	      p = 1;
	    } else if (((Double) i[65]).doubleValue() > 5.52) {
	    p = FlipSenseClassifier_8.N4c15c0d720(i);
	    } 
	    return p;
	  }
	  static double N4c15c0d720(Object []i) {
	    double p = Double.NaN;
	    if (i[53] == null) {
	      p = 1;
	    } else if (((Double) i[53]).doubleValue() <= -3.22) {
	      p = 1;
	    } else if (((Double) i[53]).doubleValue() > -3.22) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class FlipSenseClassifier_9 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = FlipSenseClassifier_9.N28278a4721(i);
	    return p;
	  }
	  static double N28278a4721(Object []i) {
	    double p = Double.NaN;
	    if (i[58] == null) {
	      p = 1;
	    } else if (((Double) i[58]).doubleValue() <= 0.46) {
	    p = FlipSenseClassifier_9.N3be74fe922(i);
	    } else if (((Double) i[58]).doubleValue() > 0.46) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3be74fe922(Object []i) {
	    double p = Double.NaN;
	    if (i[54] == null) {
	      p = 0;
	    } else if (((Double) i[54]).doubleValue() <= 3.98) {
	      p = 0;
	    } else if (((Double) i[54]).doubleValue() > 3.98) {
	      p = 1;
	    } 
	    return p;
	  }
	}