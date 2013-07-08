package me.xiangchen.technique.touchsense;

public class TouchSenseClassifier {

	  public static double classify(Object[] i) {
	    double [] sums = new double [3];
	    sums[(int) TouchSenseClassifier_0.classify(i)] += 0.8334328202500318;
	    sums[(int) TouchSenseClassifier_1.classify(i)] += 1.221067237685234;
	    sums[(int) TouchSenseClassifier_2.classify(i)] += 1.541817724759118;
	    sums[(int) TouchSenseClassifier_3.classify(i)] += 1.408301721793049;
	    sums[(int) TouchSenseClassifier_4.classify(i)] += 1.457431823981318;
	    sums[(int) TouchSenseClassifier_5.classify(i)] += 1.4384103622589088;
	    sums[(int) TouchSenseClassifier_6.classify(i)] += 1.4456377527802804;
	    sums[(int) TouchSenseClassifier_7.classify(i)] += 1.442871618661786;
	    sums[(int) TouchSenseClassifier_8.classify(i)] += 1.4439273801988926;
	    sums[(int) TouchSenseClassifier_9.classify(i)] += 1.4435239974946843;
	    double maxV = sums[0];
	    int maxI = 0;
	    for (int j = 1; j < 3; j++) {
	      if (sums[j] > maxV) { maxV = sums[j]; maxI = j; }
	    }
	    return (double) maxI;
	  }
	}
	class TouchSenseClassifier_0 {
	  public static double classify(Object[] i) {
	    /* ts80 */
	    if (i[80] == null) { return 0; } else if (((Double)i[80]).doubleValue() <= 7.43) { return 1; } else { return 0; }
	  }
	}
	class TouchSenseClassifier_1 {
	  public static double classify(Object[] i) {
	    /* ts83 */
	    if (i[83] == null) { return 2; } else if (((Double)i[83]).doubleValue() <= 0.46) { return 2; } else { return 0; }
	  }
	}
	class TouchSenseClassifier_2 {
	  public static double classify(Object[] i) {
	    /* ts83 */
	    if (i[83] == null) { return 1; } else if (((Double)i[83]).doubleValue() <= 0.46) { return 2; } else { return 1; }
	  }
	}
	class TouchSenseClassifier_3 {
	  public static double classify(Object[] i) {
	    /* ts80 */
	    if (i[80] == null) { return 0; } else if (((Double)i[80]).doubleValue() <= 7.43) { return 1; } else { return 0; }
	  }
	}
	class TouchSenseClassifier_4 {
	  public static double classify(Object[] i) {
	    /* ts83 */
	    if (i[83] == null) { return 2; } else if (((Double)i[83]).doubleValue() <= 0.46) { return 2; } else { return 0; }
	  }
	}
	class TouchSenseClassifier_5 {
	  public static double classify(Object[] i) {
	    /* ts83 */
	    if (i[83] == null) { return 1; } else if (((Double)i[83]).doubleValue() <= 0.46) { return 2; } else { return 1; }
	  }
	}
	class TouchSenseClassifier_6 {
	  public static double classify(Object[] i) {
	    /* ts80 */
	    if (i[80] == null) { return 0; } else if (((Double)i[80]).doubleValue() <= 7.43) { return 1; } else { return 0; }
	  }
	}
	class TouchSenseClassifier_7 {
	  public static double classify(Object[] i) {
	    /* ts83 */
	    if (i[83] == null) { return 2; } else if (((Double)i[83]).doubleValue() <= 0.46) { return 2; } else { return 0; }
	  }
	}
	class TouchSenseClassifier_8 {
	  public static double classify(Object[] i) {
	    /* ts83 */
	    if (i[83] == null) { return 1; } else if (((Double)i[83]).doubleValue() <= 0.46) { return 2; } else { return 1; }
	  }
	}
	class TouchSenseClassifier_9 {
	  public static double classify(Object[] i) {
	    /* ts80 */
	    if (i[80] == null) { return 0; } else if (((Double)i[80]).doubleValue() <= 7.43) { return 1; } else { return 0; }
	  }
	}