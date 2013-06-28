package me.xiangchen.ml;

public class RotateSenseRegularClassifier {
	public static double classify(Object[] i) {
		// chosen attribute: rs0 (0)

		// missing value?
		if (i[0] == null)
			return 0;

		// prediction
		double v = 0;
		double[] classifications = new double[] { 2, 0, 1 }; // RightHorizontal,
																// Vertical,
																// LeftHorizontal
		double[] breakpoints = new double[] { -4.23, 3.87 };
		while (v < breakpoints.length
				&& ((Double) i[0]) >= breakpoints[(int) v]) {
			v++;
		}
		return classifications[(int) v];
	}
}