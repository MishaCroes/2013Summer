package me.xiangchen.ml;


public class HandSenseClassifier {

	  public static double classify(Object[] i) throws Exception {
	    double [] sums = new double [2];
	    sums[(int) HandSenseClassifier_0.classify(i)] += 2.5458752096989827;
	    sums[(int) HandSenseClassifier_1.classify(i)] += 2.4617242964581343;
	    sums[(int) HandSenseClassifier_2.classify(i)] += 3.06282713592571;
	    sums[(int) HandSenseClassifier_3.classify(i)] += 3.060136497989769;
	    sums[(int) HandSenseClassifier_4.classify(i)] += 2.925808867124537;
	    sums[(int) HandSenseClassifier_5.classify(i)] += 2.670525593466822;
	    sums[(int) HandSenseClassifier_6.classify(i)] += 2.8692947431355944;
	    sums[(int) HandSenseClassifier_7.classify(i)] += 3.173668685552096;
	    sums[(int) HandSenseClassifier_8.classify(i)] += 2.743473892128872;
	    sums[(int) HandSenseClassifier_9.classify(i)] += 2.7444555324576587;
	    double maxV = sums[0];
	    int maxI = 0;
	    for (int j = 1; j < 2; j++) {
	      if (sums[j] > maxV) { maxV = sums[j]; maxI = j; }
	    }
	    return (double) maxI;
	  }
	}
	class HandSenseClassifier_0 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_0.N5795cad6910(i);
	    return p;
	  }
	  static double N5795cad6910(Object []i) {
	    double p = Double.NaN;
	    if (i[87] == null) {
	      p = 0;
	    } else if (((Double) i[87]).doubleValue() <= 0.37) {
	    p = HandSenseClassifier_0.N2b37d486911(i);
	    } else if (((Double) i[87]).doubleValue() > 0.37) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2b37d486911(Object []i) {
	    double p = Double.NaN;
	    if (i[107] == null) {
	      p = 1;
	    } else if (((Double) i[107]).doubleValue() <= -5.98) {
	    p = HandSenseClassifier_0.N5e61bf94912(i);
	    } else if (((Double) i[107]).doubleValue() > -5.98) {
	    p = HandSenseClassifier_0.N718f1128914(i);
	    } 
	    return p;
	  }
	  static double N5e61bf94912(Object []i) {
	    double p = Double.NaN;
	    if (i[88] == null) {
	      p = 0;
	    } else if (((Double) i[88]).doubleValue() <= 1.89) {
	    p = HandSenseClassifier_0.N6368bdf4913(i);
	    } else if (((Double) i[88]).doubleValue() > 1.89) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6368bdf4913(Object []i) {
	    double p = Double.NaN;
	    if (i[93] == null) {
	      p = 1;
	    } else if (((Double) i[93]).doubleValue() <= 0.61) {
	      p = 1;
	    } else if (((Double) i[93]).doubleValue() > 0.61) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N718f1128914(Object []i) {
	    double p = Double.NaN;
	    if (i[102] == null) {
	      p = 0;
	    } else if (((Double) i[102]).doubleValue() <= 2.15) {
	      p = 0;
	    } else if (((Double) i[102]).doubleValue() > 2.15) {
	    p = HandSenseClassifier_0.N67af9356915(i);
	    } 
	    return p;
	  }
	  static double N67af9356915(Object []i) {
	    double p = Double.NaN;
	    if (i[16] == null) {
	      p = 1;
	    } else if (((Double) i[16]).doubleValue() <= 5.38) {
	      p = 1;
	    } else if (((Double) i[16]).doubleValue() > 5.38) {
	      p = 0;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_1 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_1.N37f22848916(i);
	    return p;
	  }
	  static double N37f22848916(Object []i) {
	    double p = Double.NaN;
	    if (i[87] == null) {
	      p = 0;
	    } else if (((Double) i[87]).doubleValue() <= 1.01) {
	    p = HandSenseClassifier_1.N7b32aba9917(i);
	    } else if (((Double) i[87]).doubleValue() > 1.01) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N7b32aba9917(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() <= 5.12) {
	    p = HandSenseClassifier_1.N3ba4236f918(i);
	    } else if (((Double) i[89]).doubleValue() > 5.12) {
	    p = HandSenseClassifier_1.N15126b00919(i);
	    } 
	    return p;
	  }
	  static double N3ba4236f918(Object []i) {
	    double p = Double.NaN;
	    if (i[101] == null) {
	      p = 1;
	    } else if (((Double) i[101]).doubleValue() <= 6.28) {
	      p = 1;
	    } else if (((Double) i[101]).doubleValue() > 6.28) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N15126b00919(Object []i) {
	    double p = Double.NaN;
	    if (i[107] == null) {
	      p = 0;
	    } else if (((Double) i[107]).doubleValue() <= 7.51) {
	    p = HandSenseClassifier_1.N6c2ed7ce920(i);
	    } else if (((Double) i[107]).doubleValue() > 7.51) {
	    p = HandSenseClassifier_1.N496cc009922(i);
	    } 
	    return p;
	  }
	  static double N6c2ed7ce920(Object []i) {
	    double p = Double.NaN;
	    if (i[95] == null) {
	      p = 0;
	    } else if (((Double) i[95]).doubleValue() <= -5.36) {
	    p = HandSenseClassifier_1.N775a4cde921(i);
	    } else if (((Double) i[95]).doubleValue() > -5.36) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N775a4cde921(Object []i) {
	    double p = Double.NaN;
	    if (i[104] == null) {
	      p = 0;
	    } else if (((Double) i[104]).doubleValue() <= -6.44) {
	      p = 0;
	    } else if (((Double) i[104]).doubleValue() > -6.44) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N496cc009922(Object []i) {
	    double p = Double.NaN;
	    if (i[44] == null) {
	      p = 0;
	    } else if (((Double) i[44]).doubleValue() <= 9.07) {
	      p = 0;
	    } else if (((Double) i[44]).doubleValue() > 9.07) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_2 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_2.N2b3b488923(i);
	    return p;
	  }
	  static double N2b3b488923(Object []i) {
	    double p = Double.NaN;
	    if (i[103] == null) {
	      p = 0;
	    } else if (((Double) i[103]).doubleValue() <= -7.05) {
	    p = HandSenseClassifier_2.N64114e1a924(i);
	    } else if (((Double) i[103]).doubleValue() > -7.05) {
	    p = HandSenseClassifier_2.N2c1ec049925(i);
	    } 
	    return p;
	  }
	  static double N64114e1a924(Object []i) {
	    double p = Double.NaN;
	    if (i[99] == null) {
	      p = 0;
	    } else if (((Double) i[99]).doubleValue() <= 2.45) {
	      p = 0;
	    } else if (((Double) i[99]).doubleValue() > 2.45) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2c1ec049925(Object []i) {
	    double p = Double.NaN;
	    if (i[102] == null) {
	      p = 0;
	    } else if (((Double) i[102]).doubleValue() <= -0.92) {
	      p = 0;
	    } else if (((Double) i[102]).doubleValue() > -0.92) {
	    p = HandSenseClassifier_2.N16e20f40926(i);
	    } 
	    return p;
	  }
	  static double N16e20f40926(Object []i) {
	    double p = Double.NaN;
	    if (i[93] == null) {
	      p = 1;
	    } else if (((Double) i[93]).doubleValue() <= 6.28) {
	    p = HandSenseClassifier_2.N53573e7c927(i);
	    } else if (((Double) i[93]).doubleValue() > 6.28) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N53573e7c927(Object []i) {
	    double p = Double.NaN;
	    if (i[62] == null) {
	      p = 1;
	    } else if (((Double) i[62]).doubleValue() <= 8.28) {
	    p = HandSenseClassifier_2.N4c769a3928(i);
	    } else if (((Double) i[62]).doubleValue() > 8.28) {
	    p = HandSenseClassifier_2.N3fe84ec8929(i);
	    } 
	    return p;
	  }
	  static double N4c769a3928(Object []i) {
	    double p = Double.NaN;
	    if (i[99] == null) {
	      p = 0;
	    } else if (((Double) i[99]).doubleValue() <= 4.9) {
	      p = 0;
	    } else if (((Double) i[99]).doubleValue() > 4.9) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3fe84ec8929(Object []i) {
	    double p = Double.NaN;
	    if (i[36] == null) {
	      p = 1;
	    } else if (((Double) i[36]).doubleValue() <= 0.08) {
	    p = HandSenseClassifier_2.N2c8c4d3f930(i);
	    } else if (((Double) i[36]).doubleValue() > 0.08) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2c8c4d3f930(Object []i) {
	    double p = Double.NaN;
	    if (i[103] == null) {
	      p = 0;
	    } else if (((Double) i[103]).doubleValue() <= -5.82) {
	      p = 0;
	    } else if (((Double) i[103]).doubleValue() > -5.82) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_3 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_3.N2f2379f2931(i);
	    return p;
	  }
	  static double N2f2379f2931(Object []i) {
	    double p = Double.NaN;
	    if (i[103] == null) {
	      p = 0;
	    } else if (((Double) i[103]).doubleValue() <= -7.97) {
	    p = HandSenseClassifier_3.N421b170b932(i);
	    } else if (((Double) i[103]).doubleValue() > -7.97) {
	    p = HandSenseClassifier_3.N85f515933(i);
	    } 
	    return p;
	  }
	  static double N421b170b932(Object []i) {
	    double p = Double.NaN;
	    if (i[18] == null) {
	      p = 0;
	    } else if (((Double) i[18]).doubleValue() <= 0.69) {
	      p = 0;
	    } else if (((Double) i[18]).doubleValue() > 0.69) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N85f515933(Object []i) {
	    double p = Double.NaN;
	    if (i[105] == null) {
	      p = 1;
	    } else if (((Double) i[105]).doubleValue() <= 5.06) {
	    p = HandSenseClassifier_3.N5a9d35f7934(i);
	    } else if (((Double) i[105]).doubleValue() > 5.06) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5a9d35f7934(Object []i) {
	    double p = Double.NaN;
	    if (i[33] == null) {
	      p = 0;
	    } else if (((Double) i[33]).doubleValue() <= -0.73) {
	      p = 0;
	    } else if (((Double) i[33]).doubleValue() > -0.73) {
	    p = HandSenseClassifier_3.N742199b935(i);
	    } 
	    return p;
	  }
	  static double N742199b935(Object []i) {
	    double p = Double.NaN;
	    if (i[96] == null) {
	      p = 0;
	    } else if (((Double) i[96]).doubleValue() <= -0.92) {
	      p = 0;
	    } else if (((Double) i[96]).doubleValue() > -0.92) {
	    p = HandSenseClassifier_3.N49f12d6936(i);
	    } 
	    return p;
	  }
	  static double N49f12d6936(Object []i) {
	    double p = Double.NaN;
	    if (i[106] == null) {
	      p = 1;
	    } else if (((Double) i[106]).doubleValue() <= -5.82) {
	    p = HandSenseClassifier_3.N678da1f8937(i);
	    } else if (((Double) i[106]).doubleValue() > -5.82) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N678da1f8937(Object []i) {
	    double p = Double.NaN;
	    if (i[101] == null) {
	      p = 0;
	    } else if (((Double) i[101]).doubleValue() <= -6.44) {
	      p = 0;
	    } else if (((Double) i[101]).doubleValue() > -6.44) {
	    p = HandSenseClassifier_3.N384d5e5938(i);
	    } 
	    return p;
	  }
	  static double N384d5e5938(Object []i) {
	    double p = Double.NaN;
	    if (i[98] == null) {
	      p = 1;
	    } else if (((Double) i[98]).doubleValue() <= 4.9) {
	      p = 1;
	    } else if (((Double) i[98]).doubleValue() > 4.9) {
	    p = HandSenseClassifier_3.N5f6af31939(i);
	    } 
	    return p;
	  }
	  static double N5f6af31939(Object []i) {
	    double p = Double.NaN;
	    if (i[92] == null) {
	      p = 0;
	    } else if (((Double) i[92]).doubleValue() <= 7.66) {
	      p = 0;
	    } else if (((Double) i[92]).doubleValue() > 7.66) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_4 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_4.N667bd06940(i);
	    return p;
	  }
	  static double N667bd06940(Object []i) {
	    double p = Double.NaN;
	    if (i[103] == null) {
	      p = 0;
	    } else if (((Double) i[103]).doubleValue() <= -7.81) {
	    p = HandSenseClassifier_4.N4aad833941(i);
	    } else if (((Double) i[103]).doubleValue() > -7.81) {
	    p = HandSenseClassifier_4.N6c57fea9942(i);
	    } 
	    return p;
	  }
	  static double N4aad833941(Object []i) {
	    double p = Double.NaN;
	    if (i[18] == null) {
	      p = 0;
	    } else if (((Double) i[18]).doubleValue() <= 0.85) {
	      p = 0;
	    } else if (((Double) i[18]).doubleValue() > 0.85) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6c57fea9942(Object []i) {
	    double p = Double.NaN;
	    if (i[62] == null) {
	      p = 0;
	    } else if (((Double) i[62]).doubleValue() <= 4.57) {
	      p = 0;
	    } else if (((Double) i[62]).doubleValue() > 4.57) {
	    p = HandSenseClassifier_4.N51040d1943(i);
	    } 
	    return p;
	  }
	  static double N51040d1943(Object []i) {
	    double p = Double.NaN;
	    if (i[99] == null) {
	      p = 0;
	    } else if (((Double) i[99]).doubleValue() <= 1.23) {
	    p = HandSenseClassifier_4.N6e0f5bef944(i);
	    } else if (((Double) i[99]).doubleValue() > 1.23) {
	    p = HandSenseClassifier_4.N6f8dd1d8946(i);
	    } 
	    return p;
	  }
	  static double N6e0f5bef944(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() <= 1.9) {
	    p = HandSenseClassifier_4.N325ce05c945(i);
	    } else if (((Double) i[4]).doubleValue() > 1.9) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N325ce05c945(Object []i) {
	    double p = Double.NaN;
	    if (i[101] == null) {
	      p = 0;
	    } else if (((Double) i[101]).doubleValue() <= -7.51) {
	      p = 0;
	    } else if (((Double) i[101]).doubleValue() > -7.51) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6f8dd1d8946(Object []i) {
	    double p = Double.NaN;
	    if (i[73] == null) {
	      p = 0;
	    } else if (((Double) i[73]).doubleValue() <= 2.09) {
	      p = 0;
	    } else if (((Double) i[73]).doubleValue() > 2.09) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_5 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_5.N47cbf51f947(i);
	    return p;
	  }
	  static double N47cbf51f947(Object []i) {
	    double p = Double.NaN;
	    if (i[103] == null) {
	      p = 0;
	    } else if (((Double) i[103]).doubleValue() <= -6.13) {
	    p = HandSenseClassifier_5.N1f49eb0c948(i);
	    } else if (((Double) i[103]).doubleValue() > -6.13) {
	    p = HandSenseClassifier_5.N73fc99aa950(i);
	    } 
	    return p;
	  }
	  static double N1f49eb0c948(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() <= 4.47) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() > 4.47) {
	    p = HandSenseClassifier_5.N2de670e0949(i);
	    } 
	    return p;
	  }
	  static double N2de670e0949(Object []i) {
	    double p = Double.NaN;
	    if (i[81] == null) {
	      p = 0;
	    } else if (((Double) i[81]).doubleValue() <= 1.01) {
	      p = 0;
	    } else if (((Double) i[81]).doubleValue() > 1.01) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N73fc99aa950(Object []i) {
	    double p = Double.NaN;
	    if (i[80] == null) {
	      p = 0;
	    } else if (((Double) i[80]).doubleValue() <= 5.59) {
	      p = 0;
	    } else if (((Double) i[80]).doubleValue() > 5.59) {
	    p = HandSenseClassifier_5.N4ccca363951(i);
	    } 
	    return p;
	  }
	  static double N4ccca363951(Object []i) {
	    double p = Double.NaN;
	    if (i[93] == null) {
	      p = 0;
	    } else if (((Double) i[93]).doubleValue() <= -0.92) {
	      p = 0;
	    } else if (((Double) i[93]).doubleValue() > -0.92) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_6 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_6.Nefadff9952(i);
	    return p;
	  }
	  static double Nefadff9952(Object []i) {
	    double p = Double.NaN;
	    if (i[103] == null) {
	      p = 0;
	    } else if (((Double) i[103]).doubleValue() <= -7.35) {
	    p = HandSenseClassifier_6.N78865c1d953(i);
	    } else if (((Double) i[103]).doubleValue() > -7.35) {
	    p = HandSenseClassifier_6.N3d09b1bc954(i);
	    } 
	    return p;
	  }
	  static double N78865c1d953(Object []i) {
	    double p = Double.NaN;
	    if (i[97] == null) {
	      p = 0;
	    } else if (((Double) i[97]).doubleValue() <= -7.51) {
	      p = 0;
	    } else if (((Double) i[97]).doubleValue() > -7.51) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3d09b1bc954(Object []i) {
	    double p = Double.NaN;
	    if (i[90] == null) {
	      p = 1;
	    } else if (((Double) i[90]).doubleValue() <= 6.74) {
	    p = HandSenseClassifier_6.N4773ccf2955(i);
	    } else if (((Double) i[90]).doubleValue() > 6.74) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4773ccf2955(Object []i) {
	    double p = Double.NaN;
	    if (i[98] == null) {
	      p = 1;
	    } else if (((Double) i[98]).doubleValue() <= 7.35) {
	    p = HandSenseClassifier_6.N3944884956(i);
	    } else if (((Double) i[98]).doubleValue() > 7.35) {
	    p = HandSenseClassifier_6.N27a811c959(i);
	    } 
	    return p;
	  }
	  static double N3944884956(Object []i) {
	    double p = Double.NaN;
	    if (i[65] == null) {
	      p = 0;
	    } else if (((Double) i[65]).doubleValue() <= 4.58) {
	      p = 0;
	    } else if (((Double) i[65]).doubleValue() > 4.58) {
	    p = HandSenseClassifier_6.N7c24d3f1957(i);
	    } 
	    return p;
	  }
	  static double N7c24d3f1957(Object []i) {
	    double p = Double.NaN;
	    if (i[26] == null) {
	      p = 1;
	    } else if (((Double) i[26]).doubleValue() <= 9.32) {
	      p = 1;
	    } else if (((Double) i[26]).doubleValue() > 9.32) {
	    p = HandSenseClassifier_6.N55d6b2e3958(i);
	    } 
	    return p;
	  }
	  static double N55d6b2e3958(Object []i) {
	    double p = Double.NaN;
	    if (i[103] == null) {
	      p = 0;
	    } else if (((Double) i[103]).doubleValue() <= -6.28) {
	      p = 0;
	    } else if (((Double) i[103]).doubleValue() > -6.28) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N27a811c959(Object []i) {
	    double p = Double.NaN;
	    if (i[96] == null) {
	      p = 0;
	    } else if (((Double) i[96]).doubleValue() <= 1.07) {
	      p = 0;
	    } else if (((Double) i[96]).doubleValue() > 1.07) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_7 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_7.N38b25689960(i);
	    return p;
	  }
	  static double N38b25689960(Object []i) {
	    double p = Double.NaN;
	    if (i[105] == null) {
	      p = 1;
	    } else if (((Double) i[105]).doubleValue() <= 5.82) {
	    p = HandSenseClassifier_7.N444f5973961(i);
	    } else if (((Double) i[105]).doubleValue() > 5.82) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N444f5973961(Object []i) {
	    double p = Double.NaN;
	    if (i[105] == null) {
	      p = 0;
	    } else if (((Double) i[105]).doubleValue() <= -0.92) {
	      p = 0;
	    } else if (((Double) i[105]).doubleValue() > -0.92) {
	    p = HandSenseClassifier_7.N3579b00e962(i);
	    } 
	    return p;
	  }
	  static double N3579b00e962(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= -1.06) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() > -1.06) {
	    p = HandSenseClassifier_7.N4815828f963(i);
	    } 
	    return p;
	  }
	  static double N4815828f963(Object []i) {
	    double p = Double.NaN;
	    if (i[78] == null) {
	      p = 1;
	    } else if (((Double) i[78]).doubleValue() <= 0.67) {
	    p = HandSenseClassifier_7.N7c2e9f41964(i);
	    } else if (((Double) i[78]).doubleValue() > 0.67) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N7c2e9f41964(Object []i) {
	    double p = Double.NaN;
	    if (i[103] == null) {
	      p = 0;
	    } else if (((Double) i[103]).doubleValue() <= -8.12) {
	      p = 0;
	    } else if (((Double) i[103]).doubleValue() > -8.12) {
	    p = HandSenseClassifier_7.N58d9a418965(i);
	    } 
	    return p;
	  }
	  static double N58d9a418965(Object []i) {
	    double p = Double.NaN;
	    if (i[48] == null) {
	      p = 1;
	    } else if (((Double) i[48]).doubleValue() <= -0.27) {
	      p = 1;
	    } else if (((Double) i[48]).doubleValue() > -0.27) {
	    p = HandSenseClassifier_7.N38a4513a966(i);
	    } 
	    return p;
	  }
	  static double N38a4513a966(Object []i) {
	    double p = Double.NaN;
	    if (i[94] == null) {
	      p = 1;
	    } else if (((Double) i[94]).doubleValue() <= -7.51) {
	      p = 1;
	    } else if (((Double) i[94]).doubleValue() > -7.51) {
	    p = HandSenseClassifier_7.N2bd0d3e3967(i);
	    } 
	    return p;
	  }
	  static double N2bd0d3e3967(Object []i) {
	    double p = Double.NaN;
	    if (i[92] == null) {
	      p = 1;
	    } else if (((Double) i[92]).doubleValue() <= -7.51) {
	      p = 1;
	    } else if (((Double) i[92]).doubleValue() > -7.51) {
	    p = HandSenseClassifier_7.N1b06f28e968(i);
	    } 
	    return p;
	  }
	  static double N1b06f28e968(Object []i) {
	    double p = Double.NaN;
	    if (i[94] == null) {
	      p = 0;
	    } else if (((Double) i[94]).doubleValue() <= -6.13) {
	      p = 0;
	    } else if (((Double) i[94]).doubleValue() > -6.13) {
	    p = HandSenseClassifier_7.N651e567e969(i);
	    } 
	    return p;
	  }
	  static double N651e567e969(Object []i) {
	    double p = Double.NaN;
	    if (i[17] == null) {
	      p = 0;
	    } else if (((Double) i[17]).doubleValue() <= 8.35) {
	      p = 0;
	    } else if (((Double) i[17]).doubleValue() > 8.35) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_8 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_8.N2ac09e0f970(i);
	    return p;
	  }
	  static double N2ac09e0f970(Object []i) {
	    double p = Double.NaN;
	    if (i[87] == null) {
	      p = 0;
	    } else if (((Double) i[87]).doubleValue() <= 0.52) {
	    p = HandSenseClassifier_8.N4bc900b6971(i);
	    } else if (((Double) i[87]).doubleValue() > 0.52) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N4bc900b6971(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() <= 2.65) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() > 2.65) {
	    p = HandSenseClassifier_8.N794dd398972(i);
	    } 
	    return p;
	  }
	  static double N794dd398972(Object []i) {
	    double p = Double.NaN;
	    if (i[50] == null) {
	      p = 0;
	    } else if (((Double) i[50]).doubleValue() <= 9.68) {
	    p = HandSenseClassifier_8.N647ede5f973(i);
	    } else if (((Double) i[50]).doubleValue() > 9.68) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N647ede5f973(Object []i) {
	    double p = Double.NaN;
	    if (i[92] == null) {
	      p = 1;
	    } else if (((Double) i[92]).doubleValue() <= -4.6) {
	    p = HandSenseClassifier_8.N45396284974(i);
	    } else if (((Double) i[92]).doubleValue() > -4.6) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N45396284974(Object []i) {
	    double p = Double.NaN;
	    if (i[93] == null) {
	      p = 0;
	    } else if (((Double) i[93]).doubleValue() <= 1.69) {
	      p = 0;
	    } else if (((Double) i[93]).doubleValue() > 1.69) {
	      p = 1;
	    } 
	    return p;
	  }
	}
	class HandSenseClassifier_9 {

	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = HandSenseClassifier_9.N3a72eb9d975(i);
	    return p;
	  }
	  static double N3a72eb9d975(Object []i) {
	    double p = Double.NaN;
	    if (i[107] == null) {
	      p = 1;
	    } else if (((Double) i[107]).doubleValue() <= -8.12) {
	      p = 1;
	    } else if (((Double) i[107]).doubleValue() > -8.12) {
	    p = HandSenseClassifier_9.N4ecaae65976(i);
	    } 
	    return p;
	  }
	  static double N4ecaae65976(Object []i) {
	    double p = Double.NaN;
	    if (i[44] == null) {
	      p = 0;
	    } else if (((Double) i[44]).doubleValue() <= 9.6) {
	    p = HandSenseClassifier_9.N5c7f914c977(i);
	    } else if (((Double) i[44]).doubleValue() > 9.6) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5c7f914c977(Object []i) {
	    double p = Double.NaN;
	    if (i[89] == null) {
	      p = 1;
	    } else if (((Double) i[89]).doubleValue() <= 5.24) {
	    p = HandSenseClassifier_9.N3b1c4405978(i);
	    } else if (((Double) i[89]).doubleValue() > 5.24) {
	    p = HandSenseClassifier_9.N3cb5c294979(i);
	    } 
	    return p;
	  }
	  static double N3b1c4405978(Object []i) {
	    double p = Double.NaN;
	    if (i[22] == null) {
	      p = 1;
	    } else if (((Double) i[22]).doubleValue() <= 8.36) {
	      p = 1;
	    } else if (((Double) i[22]).doubleValue() > 8.36) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3cb5c294979(Object []i) {
	    double p = Double.NaN;
	    if (i[100] == null) {
	      p = 0;
	    } else if (((Double) i[100]).doubleValue() <= -3.68) {
	    p = HandSenseClassifier_9.N40f9a1af980(i);
	    } else if (((Double) i[100]).doubleValue() > -3.68) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N40f9a1af980(Object []i) {
	    double p = Double.NaN;
	    if (i[107] == null) {
	      p = 0;
	    } else if (((Double) i[107]).doubleValue() <= 7.51) {
	    p = HandSenseClassifier_9.N44e6097c981(i);
	    } else if (((Double) i[107]).doubleValue() > 7.51) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N44e6097c981(Object []i) {
	    double p = Double.NaN;
	    if (i[24] == null) {
	      p = 0;
	    } else if (((Double) i[24]).doubleValue() <= 0.64) {
	      p = 0;
	    } else if (((Double) i[24]).doubleValue() > 0.64) {
	    p = HandSenseClassifier_9.N5a78cf3a982(i);
	    } 
	    return p;
	  }
	  static double N5a78cf3a982(Object []i) {
	    double p = Double.NaN;
	    if (i[23] == null) {
	      p = 1;
	    } else if (((Double) i[23]).doubleValue() <= 9.31) {
	      p = 1;
	    } else if (((Double) i[23]).doubleValue() > 9.31) {
	      p = 0;
	    } 
	    return p;
	  }
	}