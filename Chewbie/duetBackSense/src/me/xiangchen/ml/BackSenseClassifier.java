package me.xiangchen.ml;

public class BackSenseClassifier {

	  public static double classify(Object[] i) {
	    double [] sums = new double [4];
	    sums[(int) BackSenseClassifier_0.classify(i)] += 1.4403615823901506;
	    sums[(int) BackSenseClassifier_1.classify(i)] += 1.1515576969711654;
	    sums[(int) BackSenseClassifier_2.classify(i)] += 1.0041213298222402;
	    sums[(int) BackSenseClassifier_3.classify(i)] += 0.7813350269563525;
	    sums[(int) BackSenseClassifier_4.classify(i)] += 0.7255800058336443;
	    sums[(int) BackSenseClassifier_5.classify(i)] += 0.8242063819832693;
	    sums[(int) BackSenseClassifier_6.classify(i)] += 0.5712737337745541;
	    sums[(int) BackSenseClassifier_7.classify(i)] += 0.7056513670197041;
	    sums[(int) BackSenseClassifier_8.classify(i)] += 0.5032872473581833;
	    sums[(int) BackSenseClassifier_9.classify(i)] += 0.3804183654968913;
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
	    // chosen attribute: bs0 (0)

	    // missing value?
	    if (i[0] == null)
	      return 0;

	    // prediction
	    double v = 0;
	    double[] classifications = new double[]{1,0,1,0,2,3,2}; // Down, Left, Down, Left, Right, Up, Right
	    double[] breakpoints = new double[]{16.5,19.5,20.5,35.0,108.5,115.5};
	    while (v < breakpoints.length && 
	           ((Double) i[0]) >= breakpoints[(int) v]) {
	      v++;
	    }
	    return classifications[(int) v];
	  }
	}
	class BackSenseClassifier_1 {
	  public static double classify(Object[] i) {
	    // chosen attribute: bs1 (1)

	    // missing value?
	    if (i[1] == null)
	      return 0;

	    // prediction
	    double v = 0;
	    double[] classifications = new double[]{1,2,0,3,0}; // Down, Right, Left, Up, Left
	    double[] breakpoints = new double[]{16.5,24.0,103.5,112.5};
	    while (v < breakpoints.length && 
	           ((Double) i[1]) >= breakpoints[(int) v]) {
	      v++;
	    }
	    return classifications[(int) v];
	  }
	}
	class BackSenseClassifier_2 {
	  public static double classify(Object[] i) {
	    // chosen attribute: bs0 (0)

	    // missing value?
	    if (i[0] == null)
	      return 0;

	    // prediction
	    double v = 0;
	    double[] classifications = new double[]{0,1,0,1,3,2}; // Left, Down, Left, Down, Up, Right
	    double[] breakpoints = new double[]{10.5,17.5,30.0,81.0,114.5};
	    while (v < breakpoints.length && 
	           ((Double) i[0]) >= breakpoints[(int) v]) {
	      v++;
	    }
	    return classifications[(int) v];
	  }
	}
	class BackSenseClassifier_3 {
	  public static double classify(Object[] i) {
	    // chosen attribute: bs1 (1)

	    // missing value?
	    if (i[1] == null)
	      return 0;

	    // prediction
	    double v = 0;
	    double[] classifications = new double[]{1,2,1,2,0,3,0,3,0,3,0}; // Down, Right, Down, Right, Left, Up, Left, Up, Left, Up, Left
	    double[] breakpoints = new double[]{15.5,17.5,18.5,28.0,91.0,107.5,110.5,111.5,113.5,114.5};
	    while (v < breakpoints.length && 
	           ((Double) i[1]) >= breakpoints[(int) v]) {
	      v++;
	    }
	    return classifications[(int) v];
	  }
	}
	class BackSenseClassifier_4 {
	  public static double classify(Object[] i) {
	    // chosen attribute: bs0 (0)

	    // missing value?
	    if (i[0] == null)
	      return 0;

	    // prediction
	    double v = 0;
	    double[] classifications = new double[]{0,1,0,1,0,1,3,2,3,2,3,2}; // Left, Down, Left, Down, Left, Down, Up, Right, Up, Right, Up, Right
	    double[] breakpoints = new double[]{10.5,15.5,17.5,18.5,30.0,81.0,106.5,112.5,113.5,114.5,115.5};
	    while (v < breakpoints.length && 
	           ((Double) i[0]) >= breakpoints[(int) v]) {
	      v++;
	    }
	    return classifications[(int) v];
	  }
	}
	class BackSenseClassifier_5 {
	  public static double classify(Object[] i) {
	    // chosen attribute: bs1 (1)

	    // missing value?
	    if (i[1] == null)
	      return 0;

	    // prediction
	    double v = 0;
	    double[] classifications = new double[]{1,2,1,2,1,0,3,0,3,0,3}; // Down, Right, Down, Right, Down, Left, Up, Left, Up, Left, Up
	    double[] breakpoints = new double[]{17.5,21.0,23.5,28.0,71.0,98.0,102.5,106.0,109.5,111.5};
	    while (v < breakpoints.length && 
	           ((Double) i[1]) >= breakpoints[(int) v]) {
	      v++;
	    }
	    return classifications[(int) v];
	  }
	}
	class BackSenseClassifier_6 {
	  public static double classify(Object[] i) {
	    // chosen attribute: bs0 (0)

	    // missing value?
	    if (i[0] == null)
	      return 0;

	    // prediction
	    double v = 0;
	    double[] classifications = new double[]{1,0,1,0,1,2,3,2}; // Down, Left, Down, Left, Down, Right, Up, Right
	    double[] breakpoints = new double[]{14.5,16.5,20.5,24.0,74.0,99.0,112.5};
	    while (v < breakpoints.length && 
	           ((Double) i[0]) >= breakpoints[(int) v]) {
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
	    double[] classifications = new double[]{1,2,1,2,1,0,3,0,3,0,3,0}; // Down, Right, Down, Right, Down, Left, Up, Left, Up, Left, Up, Left
	    double[] breakpoints = new double[]{14.0,17.5,18.5,23.5,78.5,98.5,103.5,110.5,111.5,112.5,113.5};
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
	    double[] classifications = new double[]{0,1,0,1,0,1,3,2}; // Left, Down, Left, Down, Left, Down, Up, Right
	    double[] breakpoints = new double[]{10.5,15.5,16.5,18.5,30.0,74.0,115.5};
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
	    double[] classifications = new double[]{1,0,1,0,1,0,1,0,1,3,2,3,2}; // Down, Left, Down, Left, Down, Left, Down, Left, Down, Up, Right, Up, Right
	    double[] breakpoints = new double[]{14.5,17.5,18.5,19.5,20.5,22.5,23.5,30.0,81.0,111.5,112.5,114.5};
	    while (v < breakpoints.length && 
	           ((Double) i[0]) >= breakpoints[(int) v]) {
	      v++;
	    }
	    return classifications[(int) v];
	  }
	}
