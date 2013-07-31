package me.xiangchen.technique.posturesense;

public class PostureSenseClassifier {

	  public static double classify(Object[] i) throws Exception {
	    double [] sums = new double [3];
	    sums[(int) PostureSenseClassifier_0.classify(i)] += 4.304065093204172;
	    sums[(int) PostureSenseClassifier_1.classify(i)] += 3.6728424552041163;
	    sums[(int) PostureSenseClassifier_2.classify(i)] += 6.068425588244113;
	    sums[(int) PostureSenseClassifier_3.classify(i)] += 3.3017453026905;
	    sums[(int) PostureSenseClassifier_4.classify(i)] += 6.500770835450033;
	    sums[(int) PostureSenseClassifier_5.classify(i)] += 4.474536754716524;
	    sums[(int) PostureSenseClassifier_6.classify(i)] += 6.845050573212375;
	    sums[(int) PostureSenseClassifier_7.classify(i)] += 3.500014835891863;
	    sums[(int) PostureSenseClassifier_8.classify(i)] += 5.564496023640136;
	    sums[(int) PostureSenseClassifier_9.classify(i)] += 3.345711177856547;
	    double maxV = sums[0];
	    int maxI = 0;
	    for (int j = 1; j < 3; j++) {
	      if (sums[j] > maxV) { maxV = sums[j]; maxI = j; }
	    }
	    return (double) maxI;
	  }
	}
	class PostureSenseClassifier_0 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = PostureSenseClassifier_0.N79f0c0dd401(i);
	    return p;
	  }
	  static double N79f0c0dd401(Object []i) {
	    double p = Double.NaN;
	    if (i[111] == null) {
	      p = 2;
	    } else if (((Double) i[111]).doubleValue() <= 3.83) {
	    p = PostureSenseClassifier_0.N2d062bb6402(i);
	    } else if (((Double) i[111]).doubleValue() > 3.83) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2d062bb6402(Object []i) {
	    double p = Double.NaN;
	    if (i[59] == null) {
	      p = 0;
	    } else if (((Double) i[59]).doubleValue() <= 3.69) {
	      p = 0;
	    } else if (((Double) i[59]).doubleValue() > 3.69) {
	      p = 2;
	    } 
	    return p;
	  }
	}
	class PostureSenseClassifier_1 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = PostureSenseClassifier_1.N701fd0d1403(i);
	    return p;
	  }
	  static double N701fd0d1403(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 2;
	    } else if (((Double) i[1]).doubleValue() <= 6.96) {
	    p = PostureSenseClassifier_1.N38c682d9404(i);
	    } else if (((Double) i[1]).doubleValue() > 6.96) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N38c682d9404(Object []i) {
	    double p = Double.NaN;
	    if (i[117] == null) {
	      p = 2;
	    } else if (((Double) i[117]).doubleValue() <= 4.9) {
	      p = 2;
	    } else if (((Double) i[117]).doubleValue() > 4.9) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class PostureSenseClassifier_2 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = PostureSenseClassifier_2.N70b891ad405(i);
	    return p;
	  }
	  static double N70b891ad405(Object []i) {
	    double p = Double.NaN;
	    if (i[114] == null) {
	      p = 0;
	    } else if (((Double) i[114]).doubleValue() <= 5.82) {
	    p = PostureSenseClassifier_2.N65642eab406(i);
	    } else if (((Double) i[114]).doubleValue() > 5.82) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N65642eab406(Object []i) {
	    double p = Double.NaN;
	    if (i[53] == null) {
	      p = 0;
	    } else if (((Double) i[53]).doubleValue() <= 4.84) {
	      p = 0;
	    } else if (((Double) i[53]).doubleValue() > 4.84) {
	      p = 2;
	    } 
	    return p;
	  }
	}
	class PostureSenseClassifier_3 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = PostureSenseClassifier_3.N1434108e407(i);
	    return p;
	  }
	  static double N1434108e407(Object []i) {
	    double p = Double.NaN;
	    if (i[115] == null) {
	      p = 2;
	    } else if (((Double) i[115]).doubleValue() <= -3.98) {
	    p = PostureSenseClassifier_3.N662ae4fe408(i);
	    } else if (((Double) i[115]).doubleValue() > -3.98) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N662ae4fe408(Object []i) {
	    double p = Double.NaN;
	    if (i[53] == null) {
	      p = 0;
	    } else if (((Double) i[53]).doubleValue() <= 4.2) {
	      p = 0;
	    } else if (((Double) i[53]).doubleValue() > 4.2) {
	      p = 2;
	    } 
	    return p;
	  }
	}
	class PostureSenseClassifier_4 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = PostureSenseClassifier_4.Na201419409(i);
	    return p;
	  }
	  static double Na201419409(Object []i) {
	    double p = Double.NaN;
	    if (i[120] == null) {
	      p = 0;
	    } else if (((Double) i[120]).doubleValue() <= 5.21) {
	    p = PostureSenseClassifier_4.N40077a80410(i);
	    } else if (((Double) i[120]).doubleValue() > 5.21) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N40077a80410(Object []i) {
	    double p = Double.NaN;
	    if (i[74] == null) {
	      p = 0;
	    } else if (((Double) i[74]).doubleValue() <= 3.54) {
	      p = 0;
	    } else if (((Double) i[74]).doubleValue() > 3.54) {
	      p = 2;
	    } 
	    return p;
	  }
	}
	class PostureSenseClassifier_5 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = PostureSenseClassifier_5.N2afb8a57411(i);
	    return p;
	  }
	  static double N2afb8a57411(Object []i) {
	    double p = Double.NaN;
	    if (i[71] == null) {
	      p = 0;
	    } else if (((Double) i[71]).doubleValue() <= 3.81) {
	    p = PostureSenseClassifier_5.N68376bcc412(i);
	    } else if (((Double) i[71]).doubleValue() > 3.81) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N68376bcc412(Object []i) {
	    double p = Double.NaN;
	    if (i[105] == null) {
	      p = 0;
	    } else if (((Double) i[105]).doubleValue() <= 1.53) {
	      p = 0;
	    } else if (((Double) i[105]).doubleValue() > 1.53) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class PostureSenseClassifier_6 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = PostureSenseClassifier_6.Ne865388413(i);
	    return p;
	  }
	  static double Ne865388413(Object []i) {
	    double p = Double.NaN;
	    if (i[71] == null) {
	      p = 0;
	    } else if (((Double) i[71]).doubleValue() <= 3.81) {
	    p = PostureSenseClassifier_6.N14d60d2b414(i);
	    } else if (((Double) i[71]).doubleValue() > 3.81) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N14d60d2b414(Object []i) {
	    double p = Double.NaN;
	    if (i[125] == null) {
	      p = 1;
	    } else if (((Double) i[125]).doubleValue() <= 4.75) {
	      p = 1;
	    } else if (((Double) i[125]).doubleValue() > 4.75) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class PostureSenseClassifier_7 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = PostureSenseClassifier_7.N70fa8cbc415(i);
	    return p;
	  }
	  static double N70fa8cbc415(Object []i) {
	    double p = Double.NaN;
	    if (i[120] == null) {
	      p = 0;
	    } else if (((Double) i[120]).doubleValue() <= 5.21) {
	      p = 0;
	    } else if (((Double) i[120]).doubleValue() > 5.21) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class PostureSenseClassifier_8 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = PostureSenseClassifier_8.N512dc496416(i);
	    return p;
	  }
	  static double N512dc496416(Object []i) {
	    double p = Double.NaN;
	    if (i[50] == null) {
	      p = 0;
	    } else if (((Double) i[50]).doubleValue() <= 4.88) {
	    p = PostureSenseClassifier_8.N13c57d7d417(i);
	    } else if (((Double) i[50]).doubleValue() > 4.88) {
	      p = 2;
	    } 
	    return p;
	  }
	  static double N13c57d7d417(Object []i) {
	    double p = Double.NaN;
	    if (i[120] == null) {
	      p = 0;
	    } else if (((Double) i[120]).doubleValue() <= 4.29) {
	      p = 0;
	    } else if (((Double) i[120]).doubleValue() > 4.29) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class PostureSenseClassifier_9 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = PostureSenseClassifier_9.Nab1a3af418(i);
	    return p;
	  }
	  static double Nab1a3af418(Object []i) {
	    double p = Double.NaN;
	    if (i[68] == null) {
	      p = 0;
	    } else if (((Double) i[68]).doubleValue() <= 4.14) {
	      p = 0;
	    } else if (((Double) i[68]).doubleValue() > 4.14) {
	      p = 2;
	    } 
	    return p;
	  }
	}