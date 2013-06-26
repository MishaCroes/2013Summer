package me.xiangchen.ml;

public class BackSenseClassifier {

	  public static double classify(Object[] i) {
	    double [] sums = new double [4];
	    sums[(int) BackSenseClassifier_0.classify(i)] += 2.132192107065371;
	    sums[(int) BackSenseClassifier_1.classify(i)] += 1.5636569148083659;
	    sums[(int) BackSenseClassifier_2.classify(i)] += 1.7054911953472098;
	    sums[(int) BackSenseClassifier_3.classify(i)] += 1.1072946900064466;
	    sums[(int) BackSenseClassifier_4.classify(i)] += 1.2508099131015442;
	    sums[(int) BackSenseClassifier_5.classify(i)] += 1.2562359426800207;
	    sums[(int) BackSenseClassifier_6.classify(i)] += 1.014901522871093;
	    sums[(int) BackSenseClassifier_7.classify(i)] += 0.9110971995278372;
	    sums[(int) BackSenseClassifier_8.classify(i)] += 0.7500506001614529;
	    sums[(int) BackSenseClassifier_9.classify(i)] += 0.8348669458614033;
	    double maxV = sums[0];
	    int maxI = 0;
	    for (int j = 1; j < 4; j++) {
	      if (sums[j] > maxV) { maxV = sums[j]; maxI = j; }
	    }
	    return (double) maxI;
	  }
	}
	class BackSenseClassifier_0 {
	  public static double classify(Object[] i) {
	    // chosen attribute: bs1 (1)

	    // missing value?
	    if (i[1] == null)
	      return 0;

	    // prediction
	    double v = 0;
	    double[] classifications = new double[]{1,2,0,3,0}; // Down, Right, Left, Up, Left
	    double[] breakpoints = new double[]{16.5,49.0,110.5,114.5};
	    while (v < breakpoints.length && 
	           ((Double) i[1]) >= breakpoints[(int) v]) {
	      v++;
	    }
	    return classifications[(int) v];
	  }
	}
	class BackSenseClassifier_1 {
	  public static double classify(Object[] i) {
	    // chosen attribute: bs0 (0)

	    // missing value?
	    if (i[0] == null)
	      return 0;

	    // prediction
	    double v = 0;
	    double[] classifications = new double[]{1,0,1,3,2}; // Down, Left, Down, Up, Right
	    double[] breakpoints = new double[]{17.5,28.0,68.5,114.5};
	    while (v < breakpoints.length && 
	           ((Double) i[0]) >= breakpoints[(int) v]) {
	      v++;
	    }
	    return classifications[(int) v];
	  }
	}
	class BackSenseClassifier_2 {
	  public static double classify(Object[] i) {
	    // chosen attribute: bs1 (1)

	    // missing value?
	    if (i[1] == null)
	      return 0;

	    // prediction
	    double v = 0;
	    double[] classifications = new double[]{1,2,0,3,0}; // Down, Right, Left, Up, Left
	    double[] breakpoints = new double[]{18.5,48.0,105.5,110.5};
	    while (v < breakpoints.length && 
	           ((Double) i[1]) >= breakpoints[(int) v]) {
	      v++;
	    }
	    return classifications[(int) v];
	  }
	}
	class BackSenseClassifier_3 {
	  public static double classify(Object[] i) {
	    // chosen attribute: bs0 (0)

	    // missing value?
	    if (i[0] == null)
	      return 0;

	    // prediction
	    double v = 0;
	    double[] classifications = new double[]{1,0,1,0,3,2,3,2}; // Down, Left, Down, Left, Up, Right, Up, Right
	    double[] breakpoints = new double[]{16.5,19.5,20.5,23.5,113.5,114.5,115.5};
	    while (v < breakpoints.length && 
	           ((Double) i[0]) >= breakpoints[(int) v]) {
	      v++;
	    }
	    return classifications[(int) v];
	  }
	}
	class BackSenseClassifier_4 {
	  public static double classify(Object[] i) {
	    // chosen attribute: bs1 (1)

	    // missing value?
	    if (i[1] == null)
	      return 0;

	    // prediction
	    double v = 0;
	    double[] classifications = new double[]{1,2,1,2,0,3,0,3,0}; // Down, Right, Down, Right, Left, Up, Left, Up, Left
	    double[] breakpoints = new double[]{16.5,17.5,18.5,49.0,110.5,111.5,112.5,114.5};
	    while (v < breakpoints.length && 
	           ((Double) i[1]) >= breakpoints[(int) v]) {
	      v++;
	    }
	    return classifications[(int) v];
	  }
	}
	class BackSenseClassifier_5 {
	  public static double classify(Object[] i) {
	    // chosen attribute: bs0 (0)

	    // missing value?
	    if (i[0] == null)
	      return 0;

	    // prediction
	    double v = 0;
	    double[] classifications = new double[]{0,1,0,1,0,3,2,3,2}; // Left, Down, Left, Down, Left, Up, Right, Up, Right
	    double[] breakpoints = new double[]{12.0,17.5,19.5,20.5,23.5,110.5,111.5,114.5};
	    while (v < breakpoints.length && 
	           ((Double) i[0]) >= breakpoints[(int) v]) {
	      v++;
	    }
	    return classifications[(int) v];
	  }
	}
	class BackSenseClassifier_6 {
	  public static double classify(Object[] i) {
	    // chosen attribute: bs1 (1)

	    // missing value?
	    if (i[1] == null)
	      return 0;

	    // prediction
	    double v = 0;
	    double[] classifications = new double[]{1,2,0,3,0,3}; // Down, Right, Left, Up, Left, Up
	    double[] breakpoints = new double[]{16.5,49.0,109.5,111.5,113.5};
	    while (v < breakpoints.length && 
	           ((Double) i[1]) >= breakpoints[(int) v]) {
	      v++;
	    }
	    return classifications[(int) v];
	  }
	}
	class BackSenseClassifier_7 {
	  public static double classify(Object[] i) {
	    // chosen attribute: bs1 (1)

	    // missing value?
	    if (i[1] == null)
	      return 0;

	    // prediction
	    double v = 0;
	    double[] classifications = new double[]{1,2,3,0}; // Down, Right, Up, Left
	    double[] breakpoints = new double[]{18.5,48.0,114.5};
	    while (v < breakpoints.length && 
	           ((Double) i[1]) >= breakpoints[(int) v]) {
	      v++;
	    }
	    return classifications[(int) v];
	  }
	}
	class BackSenseClassifier_8 {
	  public static double classify(Object[] i) {
	    // chosen attribute: bs0 (0)

	    // missing value?
	    if (i[0] == null)
	      return 0;

	    // prediction
	    double v = 0;
	    double[] classifications = new double[]{0,1,3,2,3,2}; // Left, Down, Up, Right, Up, Right
	    double[] breakpoints = new double[]{23.5,68.5,110.0,111.5,114.5};
	    while (v < breakpoints.length && 
	           ((Double) i[0]) >= breakpoints[(int) v]) {
	      v++;
	    }
	    return classifications[(int) v];
	  }
	}
	class BackSenseClassifier_9 {
	  public static double classify(Object[] i) {
	    // chosen attribute: bs0 (0)

	    // missing value?
	    if (i[0] == null)
	      return 0;

	    // prediction
	    double v = 0;
	    double[] classifications = new double[]{1,0,1,3,2}; // Down, Left, Down, Up, Right
	    double[] breakpoints = new double[]{21.0,23.5,68.5,112.5};
	    while (v < breakpoints.length && 
	           ((Double) i[0]) >= breakpoints[(int) v]) {
	      v++;
	    }
	    return classifications[(int) v];
	  }
	}