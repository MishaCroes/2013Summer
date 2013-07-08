package me.xiangchen.technique.touchsense;

public class TouchSenseClassifier {

	  public static double classify(Object[] i) throws Exception {
	    double [] sums = new double [3];
	    sums[(int) TouchSenseClassifier_0.classify(i)] += 4.075113200294222;
	    sums[(int) TouchSenseClassifier_1.classify(i)] += 5.09864617141898;
	    sums[(int) TouchSenseClassifier_2.classify(i)] += 4.618826512435581;
	    sums[(int) TouchSenseClassifier_3.classify(i)] += 3.846018146584817;
	    sums[(int) TouchSenseClassifier_4.classify(i)] += 4.149724900616258;
	    sums[(int) TouchSenseClassifier_5.classify(i)] += 4.34455397580113;
	    sums[(int) TouchSenseClassifier_6.classify(i)] += 4.131200857626705;
	    sums[(int) TouchSenseClassifier_7.classify(i)] += 4.285582652171819;
	    sums[(int) TouchSenseClassifier_8.classify(i)] += 4.001969421083803;
	    sums[(int) TouchSenseClassifier_9.classify(i)] += 3.998584830263644;
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
	    p = TouchSenseClassifier_0.N56d96047350(i);
	    return p;
	  }
	  static double N56d96047350(Object []i) {
	    double p = Double.NaN;
	    if (i[86] == null) {
	      p = 2;
	    } else if (((Double) i[86]).doubleValue() <= 5.98) {
	    p = TouchSenseClassifier_0.N594001dc351(i);
	    } else if (((Double) i[86]).doubleValue() > 5.98) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N594001dc351(Object []i) {
	    double p = Double.NaN;
	    if (i[80] == null) {
	      p = 2;
	    } else if (((Double) i[80]).doubleValue() <= 0.46) {
	      p = 2;
	    } else if (((Double) i[80]).doubleValue() > 0.46) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_1 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_1.N793a404a352(i);
	    return p;
	  }
	  static double N793a404a352(Object []i) {
	    double p = Double.NaN;
	    if (i[86] == null) {
	      p = 2;
	    } else if (((Double) i[86]).doubleValue() <= 1.53) {
	      p = 2;
	    } else if (((Double) i[86]).doubleValue() > 1.53) {
	    p = TouchSenseClassifier_1.N5f52f873353(i);
	    } 
	    return p;
	  }
	  static double N5f52f873353(Object []i) {
	    double p = Double.NaN;
	    if (i[86] == null) {
	      p = 1;
	    } else if (((Double) i[86]).doubleValue() <= 6.28) {
	      p = 1;
	    } else if (((Double) i[86]).doubleValue() > 6.28) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_2 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_2.N403576e9354(i);
	    return p;
	  }
	  static double N403576e9354(Object []i) {
	    double p = Double.NaN;
	    if (i[88] == null) {
	      p = 1;
	    } else if (((Double) i[88]).doubleValue() <= -4.14) {
	    p = TouchSenseClassifier_2.N7611dbed355(i);
	    } else if (((Double) i[88]).doubleValue() > -4.14) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7611dbed355(Object []i) {
	    double p = Double.NaN;
	    if (i[90] == null) {
	      p = 2;
	    } else if (((Double) i[90]).doubleValue() <= 0.0275) {
	      p = 2;
	    } else if (((Double) i[90]).doubleValue() > 0.0275) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_3 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_3.Ne7de12a356(i);
	    return p;
	  }
	  static double Ne7de12a356(Object []i) {
	    double p = Double.NaN;
	    if (i[82] == null) {
	      p = 1;
	    } else if (((Double) i[82]).doubleValue() <= -3.83) {
	    p = TouchSenseClassifier_3.N6a4993d4357(i);
	    } else if (((Double) i[82]).doubleValue() > -3.83) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6a4993d4357(Object []i) {
	    double p = Double.NaN;
	    if (i[83] == null) {
	      p = 2;
	    } else if (((Double) i[83]).doubleValue() <= 1.23) {
	      p = 2;
	    } else if (((Double) i[83]).doubleValue() > 1.23) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_4 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_4.N48879d0358(i);
	    return p;
	  }
	  static double N48879d0358(Object []i) {
	    double p = Double.NaN;
	    if (i[83] == null) {
	      p = 2;
	    } else if (((Double) i[83]).doubleValue() <= 1.84) {
	    p = TouchSenseClassifier_4.N1bf54903359(i);
	    } else if (((Double) i[83]).doubleValue() > 1.84) {
	    p = TouchSenseClassifier_4.N48c724c360(i);
	    } 
	    return p;
	  }
	  static double N1bf54903359(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 2;
	    } else if (((Double) i[89]).doubleValue() <= 0.77) {
	      p = 2;
	    } else if (((Double) i[89]).doubleValue() > 0.77) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N48c724c360(Object []i) {
	    double p = Double.NaN;
	    if (i[85] == null) {
	      p = 1;
	    } else if (((Double) i[85]).doubleValue() <= -3.68) {
	      p = 1;
	    } else if (((Double) i[85]).doubleValue() > -3.68) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_5 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_5.N20a3dde9361(i);
	    return p;
	  }
	  static double N20a3dde9361(Object []i) {
	    double p = Double.NaN;
	    if (i[86] == null) {
	      p = 2;
	    } else if (((Double) i[86]).doubleValue() <= 5.98) {
	    p = TouchSenseClassifier_5.N663dfcbc362(i);
	    } else if (((Double) i[86]).doubleValue() > 5.98) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N663dfcbc362(Object []i) {
	    double p = Double.NaN;
	    if (i[83] == null) {
	      p = 2;
	    } else if (((Double) i[83]).doubleValue() <= 1.99) {
	    p = TouchSenseClassifier_5.N6f9bcf14363(i);
	    } else if (((Double) i[83]).doubleValue() > 1.99) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6f9bcf14363(Object []i) {
	    double p = Double.NaN;
	    if (i[90] == null) {
	      p = 2;
	    } else if (((Double) i[90]).doubleValue() <= 0.0275) {
	      p = 2;
	    } else if (((Double) i[90]).doubleValue() > 0.0275) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_6 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_6.N5e38634a364(i);
	    return p;
	  }
	  static double N5e38634a364(Object []i) {
	    double p = Double.NaN;
	    if (i[83] == null) {
	      p = 2;
	    } else if (((Double) i[83]).doubleValue() <= 1.99) {
	      p = 2;
	    } else if (((Double) i[83]).doubleValue() > 1.99) {
	    p = TouchSenseClassifier_6.N47febf99365(i);
	    } 
	    return p;
	  }
	  static double N47febf99365(Object []i) {
	    double p = Double.NaN;
	    if (i[80] == null) {
	      p = 1;
	    } else if (((Double) i[80]).doubleValue() <= 8.58) {
	      p = 1;
	    } else if (((Double) i[80]).doubleValue() > 8.58) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_7 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_7.N25d4fabc366(i);
	    return p;
	  }
	  static double N25d4fabc366(Object []i) {
	    double p = Double.NaN;
	    if (i[86] == null) {
	      p = 2;
	    } else if (((Double) i[86]).doubleValue() <= 1.23) {
	      p = 2;
	    } else if (((Double) i[86]).doubleValue() > 1.23) {
	    p = TouchSenseClassifier_7.N4199600b367(i);
	    } 
	    return p;
	  }
	  static double N4199600b367(Object []i) {
	    double p = Double.NaN;
	    if (i[76] == null) {
	      p = 1;
	    } else if (((Double) i[76]).doubleValue() <= -4.44) {
	      p = 1;
	    } else if (((Double) i[76]).doubleValue() > -4.44) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class TouchSenseClassifier_8 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_8.N3c7093d2368(i);
	    return p;
	  }
	  static double N3c7093d2368(Object []i) {
	    double p = Double.NaN;
	    if (i[47] == null) {
	      p = 2;
	    } else if (((Double) i[47]).doubleValue() <= 7.93) {
	      p = 2;
	    } else if (((Double) i[47]).doubleValue() > 7.93) {
	    p = TouchSenseClassifier_8.N2f8defe369(i);
	    } 
	    return p;
	  }
	  static double N2f8defe369(Object []i) {
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
	class TouchSenseClassifier_9 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = TouchSenseClassifier_9.N20f7f738370(i);
	    return p;
	  }
	  static double N20f7f738370(Object []i) {
	    double p = Double.NaN;
	    if (i[83] == null) {
	      p = 2;
	    } else if (((Double) i[83]).doubleValue() <= 1.23) {
	      p = 2;
	    } else if (((Double) i[83]).doubleValue() > 1.23) {
	    p = TouchSenseClassifier_9.N77878e70371(i);
	    } 
	    return p;
	  }
	  static double N77878e70371(Object []i) {
	    double p = Double.NaN;
	    if (i[88] == null) {
	      p = 1;
	    } else if (((Double) i[88]).doubleValue() <= -3.83) {
	    p = TouchSenseClassifier_9.N6498985e372(i);
	    } else if (((Double) i[88]).doubleValue() > -3.83) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6498985e372(Object []i) {
	    double p = Double.NaN;
	    if (i[87] == null) {
	      p = 1;
	    } else if (((Double) i[87]).doubleValue() <= 5.82) {
	      p = 1;
	    } else if (((Double) i[87]).doubleValue() > 5.82) {
	      p = 2;
	    } 
	    return p;
	  }
	}