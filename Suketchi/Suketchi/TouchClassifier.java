class TouchClassifier {

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = TouchClassifier.N60f38b420(i);
    return p;
  }
  static double N60f38b420(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 5.889999) {
    p = TouchClassifier.N153bcbc81(i);
    } else if (((Double) i[0]).doubleValue() > 5.889999) {
    p = TouchClassifier.N65712a803(i);
    } 
    return p;
  }
  static double N153bcbc81(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 5.299988) {
    p = TouchClassifier.N8bfc25c2(i);
    } else if (((Double) i[0]).doubleValue() > 5.299988) {
      p = 0;
    } 
    return p;
  }
  static double N8bfc25c2(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 2;
    } else if (((Double) i[5]).doubleValue() <= 33.0) {
      p = 2;
    } else if (((Double) i[5]).doubleValue() > 33.0) {
      p = 0;
    } 
    return p;
  }
  static double N65712a803(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 2.733296) {
    p = TouchClassifier.N689d6d874(i);
    } else if (((Double) i[2]).doubleValue() > 2.733296) {
      p = 2;
    } 
    return p;
  }
  static double N689d6d874(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 12.579987) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 12.579987) {
      p = 2;
    } 
    return p;
  }
}