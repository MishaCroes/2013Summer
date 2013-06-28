package me.xiangchen.ml;

public class RotateSenseSmartClassifier {

	public static double classify(Object[] i) throws Exception {
		double[] sums = new double[3];
		sums[(int) RotateSenseSmartClassifier_0.classify(i)] += 2.7434321379483255;
		sums[(int) RotateSenseSmartClassifier_1.classify(i)] += 3.1459770902183988;
		sums[(int) RotateSenseSmartClassifier_2.classify(i)] += 2.9217629563522425;
		sums[(int) RotateSenseSmartClassifier_3.classify(i)] += 2.471063827816676;
		sums[(int) RotateSenseSmartClassifier_4.classify(i)] += 2.762073418055712;
		sums[(int) RotateSenseSmartClassifier_5.classify(i)] += 2.611975480203006;
		sums[(int) RotateSenseSmartClassifier_6.classify(i)] += 2.602129933602558;
		sums[(int) RotateSenseSmartClassifier_7.classify(i)] += 2.420354244050778;
		sums[(int) RotateSenseSmartClassifier_8.classify(i)] += 2.820271326163777;
		sums[(int) RotateSenseSmartClassifier_9.classify(i)] += 2.4793588409175897;
		double maxV = sums[0];
		int maxI = 0;
		for (int j = 1; j < 3; j++) {
			if (sums[j] > maxV) {
				maxV = sums[j];
				maxI = j;
			}
		}
		return (double) maxI;
	}
}

class RotateSenseSmartClassifier_0 {

	public static double classify(Object[] i) throws Exception {

		double p = Double.NaN;
		p = RotateSenseSmartClassifier_0.N1005412e123(i);
		return p;
	}

	static double N1005412e123(Object[] i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 2;
		} else if (((Double) i[0]).doubleValue() <= 0.82) {
			p = RotateSenseSmartClassifier_0.N48fa3b39124(i);
		} else if (((Double) i[0]).doubleValue() > 0.82) {
			p = RotateSenseSmartClassifier_0.N68c9e408127(i);
		}
		return p;
	}

	static double N48fa3b39124(Object[] i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 2;
		} else if (((Double) i[1]).doubleValue() <= 0.86) {
			p = 2;
		} else if (((Double) i[1]).doubleValue() > 0.86) {
			p = RotateSenseSmartClassifier_0.N2446409d125(i);
		}
		return p;
	}

	static double N2446409d125(Object[] i) {
		double p = Double.NaN;
		if (i[2] == null) {
			p = 2;
		} else if (((Double) i[2]).doubleValue() <= 1.52) {
			p = 2;
		} else if (((Double) i[2]).doubleValue() > 1.52) {
			p = RotateSenseSmartClassifier_0.N3c1606126(i);
		}
		return p;
	}

	static double N3c1606126(Object[] i) {
		double p = Double.NaN;
		if (i[24] == null) {
			p = 0;
		} else if (((Double) i[24]).doubleValue() <= 7.05) {
			p = 0;
		} else if (((Double) i[24]).doubleValue() > 7.05) {
			p = 2;
		}
		return p;
	}

	static double N68c9e408127(Object[] i) {
		double p = Double.NaN;
		if (i[28] == null) {
			p = 1;
		} else if (((Double) i[28]).doubleValue() <= 4.14) {
			p = RotateSenseSmartClassifier_0.N1e99fef7128(i);
		} else if (((Double) i[28]).doubleValue() > 4.14) {
			p = 0;
		}
		return p;
	}

	static double N1e99fef7128(Object[] i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 1;
		} else if (((Double) i[1]).doubleValue() <= 1.19) {
			p = RotateSenseSmartClassifier_0.N103219d3129(i);
		} else if (((Double) i[1]).doubleValue() > 1.19) {
			p = RotateSenseSmartClassifier_0.N493d73f3130(i);
		}
		return p;
	}

	static double N103219d3129(Object[] i) {
		double p = Double.NaN;
		if (i[3] == null) {
			p = 1;
		} else if (((Double) i[3]).doubleValue() <= 9.76) {
			p = 1;
		} else if (((Double) i[3]).doubleValue() > 9.76) {
			p = 0;
		}
		return p;
	}

	static double N493d73f3130(Object[] i) {
		double p = Double.NaN;
		if (i[17] == null) {
			p = 1;
		} else if (((Double) i[17]).doubleValue() <= 0.57) {
			p = 1;
		} else if (((Double) i[17]).doubleValue() > 0.57) {
			p = 0;
		}
		return p;
	}
}

class RotateSenseSmartClassifier_1 {

	public static double classify(Object[] i) throws Exception {

		double p = Double.NaN;
		p = RotateSenseSmartClassifier_1.N61877c15131(i);
		return p;
	}

	static double N61877c15131(Object[] i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 0;
		} else if (((Double) i[0]).doubleValue() <= 0.82) {
			p = RotateSenseSmartClassifier_1.N5e378b9132(i);
		} else if (((Double) i[0]).doubleValue() > 0.82) {
			p = RotateSenseSmartClassifier_1.N5b5bae99137(i);
		}
		return p;
	}

	static double N5e378b9132(Object[] i) {
		double p = Double.NaN;
		if (i[7] == null) {
			p = 2;
		} else if (((Double) i[7]).doubleValue() <= 0.86) {
			p = 2;
		} else if (((Double) i[7]).doubleValue() > 0.86) {
			p = RotateSenseSmartClassifier_1.N190abcb4133(i);
		}
		return p;
	}

	static double N190abcb4133(Object[] i) {
		double p = Double.NaN;
		if (i[32] == null) {
			p = 2;
		} else if (((Double) i[32]).doubleValue() <= -0.77) {
			p = 2;
		} else if (((Double) i[32]).doubleValue() > -0.77) {
			p = RotateSenseSmartClassifier_1.Nfeada44134(i);
		}
		return p;
	}

	static double Nfeada44134(Object[] i) {
		double p = Double.NaN;
		if (i[8] == null) {
			p = 0;
		} else if (((Double) i[8]).doubleValue() <= 4.83) {
			p = RotateSenseSmartClassifier_1.N39fae86135(i);
		} else if (((Double) i[8]).doubleValue() > 4.83) {
			p = 2;
		}
		return p;
	}

	static double N39fae86135(Object[] i) {
		double p = Double.NaN;
		if (i[24] == null) {
			p = 0;
		} else if (((Double) i[24]).doubleValue() <= 0.46) {
			p = RotateSenseSmartClassifier_1.N687ae145136(i);
		} else if (((Double) i[24]).doubleValue() > 0.46) {
			p = 0;
		}
		return p;
	}

	static double N687ae145136(Object[] i) {
		double p = Double.NaN;
		if (i[20] == null) {
			p = 2;
		} else if (((Double) i[20]).doubleValue() <= 1.74) {
			p = 2;
		} else if (((Double) i[20]).doubleValue() > 1.74) {
			p = 0;
		}
		return p;
	}

	static double N5b5bae99137(Object[] i) {
		double p = Double.NaN;
		if (i[21] == null) {
			p = 1;
		} else if (((Double) i[21]).doubleValue() <= 10.07) {
			p = RotateSenseSmartClassifier_1.N6023edaa138(i);
		} else if (((Double) i[21]).doubleValue() > 10.07) {
			p = 0;
		}
		return p;
	}

	static double N6023edaa138(Object[] i) {
		double p = Double.NaN;
		if (i[25] == null) {
			p = 1;
		} else if (((Double) i[25]).doubleValue() <= 3.98) {
			p = RotateSenseSmartClassifier_1.N56c86535139(i);
		} else if (((Double) i[25]).doubleValue() > 3.98) {
			p = 0;
		}
		return p;
	}

	static double N56c86535139(Object[] i) {
		double p = Double.NaN;
		if (i[9] == null) {
			p = 1;
		} else if (((Double) i[9]).doubleValue() <= 10.07) {
			p = RotateSenseSmartClassifier_1.N7e6ca715140(i);
		} else if (((Double) i[9]).doubleValue() > 10.07) {
			p = 0;
		}
		return p;
	}

	static double N7e6ca715140(Object[] i) {
		double p = Double.NaN;
		if (i[7] == null) {
			p = 1;
		} else if (((Double) i[7]).doubleValue() <= 0.36) {
			p = 1;
		} else if (((Double) i[7]).doubleValue() > 0.36) {
			p = RotateSenseSmartClassifier_1.Nf4d948b141(i);
		}
		return p;
	}

	static double Nf4d948b141(Object[] i) {
		double p = Double.NaN;
		if (i[27] == null) {
			p = 1;
		} else if (((Double) i[27]).doubleValue() <= 6.28) {
			p = RotateSenseSmartClassifier_1.N2e533986142(i);
		} else if (((Double) i[27]).doubleValue() > 6.28) {
			p = 0;
		}
		return p;
	}

	static double N2e533986142(Object[] i) {
		double p = Double.NaN;
		if (i[12] == null) {
			p = 1;
		} else if (((Double) i[12]).doubleValue() <= 9.49) {
			p = RotateSenseSmartClassifier_1.N59e5a42c143(i);
		} else if (((Double) i[12]).doubleValue() > 9.49) {
			p = 0;
		}
		return p;
	}

	static double N59e5a42c143(Object[] i) {
		double p = Double.NaN;
		if (i[24] == null) {
			p = 1;
		} else if (((Double) i[24]).doubleValue() <= 0.61) {
			p = RotateSenseSmartClassifier_1.N737d72cf144(i);
		} else if (((Double) i[24]).doubleValue() > 0.61) {
			p = 1;
		}
		return p;
	}

	static double N737d72cf144(Object[] i) {
		double p = Double.NaN;
		if (i[11] == null) {
			p = 1;
		} else if (((Double) i[11]).doubleValue() <= 0.9) {
			p = 1;
		} else if (((Double) i[11]).doubleValue() > 0.9) {
			p = 0;
		}
		return p;
	}
}

class RotateSenseSmartClassifier_2 {

	public static double classify(Object[] i) throws Exception {

		double p = Double.NaN;
		p = RotateSenseSmartClassifier_2.N30fcaf45145(i);
		return p;
	}

	static double N30fcaf45145(Object[] i) {
		double p = Double.NaN;
		if (i[18] == null) {
			p = 0;
		} else if (((Double) i[18]).doubleValue() <= 1.13) {
			p = RotateSenseSmartClassifier_2.N1d56f423146(i);
		} else if (((Double) i[18]).doubleValue() > 1.13) {
			p = RotateSenseSmartClassifier_2.N7be9981c150(i);
		}
		return p;
	}

	static double N1d56f423146(Object[] i) {
		double p = Double.NaN;
		if (i[7] == null) {
			p = 2;
		} else if (((Double) i[7]).doubleValue() <= 0.86) {
			p = 2;
		} else if (((Double) i[7]).doubleValue() > 0.86) {
			p = RotateSenseSmartClassifier_2.N37b634e1147(i);
		}
		return p;
	}

	static double N37b634e1147(Object[] i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 0;
		} else if (((Double) i[0]).doubleValue() <= -2.04) {
			p = RotateSenseSmartClassifier_2.N1b49bc5a148(i);
		} else if (((Double) i[0]).doubleValue() > -2.04) {
			p = 0;
		}
		return p;
	}

	static double N1b49bc5a148(Object[] i) {
		double p = Double.NaN;
		if (i[25] == null) {
			p = 0;
		} else if (((Double) i[25]).doubleValue() <= -6.9) {
			p = 0;
		} else if (((Double) i[25]).doubleValue() > -6.9) {
			p = RotateSenseSmartClassifier_2.N5ecc6b5149(i);
		}
		return p;
	}

	static double N5ecc6b5149(Object[] i) {
		double p = Double.NaN;
		if (i[26] == null) {
			p = 2;
		} else if (((Double) i[26]).doubleValue() <= 3.22) {
			p = 2;
		} else if (((Double) i[26]).doubleValue() > 3.22) {
			p = 0;
		}
		return p;
	}

	static double N7be9981c150(Object[] i) {
		double p = Double.NaN;
		if (i[15] == null) {
			p = 1;
		} else if (((Double) i[15]).doubleValue() <= 9.96) {
			p = RotateSenseSmartClassifier_2.N250195d2151(i);
		} else if (((Double) i[15]).doubleValue() > 9.96) {
			p = 0;
		}
		return p;
	}

	static double N250195d2151(Object[] i) {
		double p = Double.NaN;
		if (i[26] == null) {
			p = 0;
		} else if (((Double) i[26]).doubleValue() <= 0.0) {
			p = RotateSenseSmartClassifier_2.Nb1320f9152(i);
		} else if (((Double) i[26]).doubleValue() > 0.0) {
			p = RotateSenseSmartClassifier_2.N14d9c11d153(i);
		}
		return p;
	}

	static double Nb1320f9152(Object[] i) {
		double p = Double.NaN;
		if (i[10] == null) {
			p = 1;
		} else if (((Double) i[10]).doubleValue() <= 2.02) {
			p = 1;
		} else if (((Double) i[10]).doubleValue() > 2.02) {
			p = 0;
		}
		return p;
	}

	static double N14d9c11d153(Object[] i) {
		double p = Double.NaN;
		if (i[21] == null) {
			p = 1;
		} else if (((Double) i[21]).doubleValue() <= 9.96) {
			p = RotateSenseSmartClassifier_2.N6415619c154(i);
		} else if (((Double) i[21]).doubleValue() > 9.96) {
			p = 0;
		}
		return p;
	}

	static double N6415619c154(Object[] i) {
		double p = Double.NaN;
		if (i[16] == null) {
			p = 1;
		} else if (((Double) i[16]).doubleValue() <= -0.27) {
			p = 1;
		} else if (((Double) i[16]).doubleValue() > -0.27) {
			p = RotateSenseSmartClassifier_2.N37bb7c19155(i);
		}
		return p;
	}

	static double N37bb7c19155(Object[] i) {
		double p = Double.NaN;
		if (i[24] == null) {
			p = 1;
		} else if (((Double) i[24]).doubleValue() <= 0.61) {
			p = RotateSenseSmartClassifier_2.N75d069e4156(i);
		} else if (((Double) i[24]).doubleValue() > 0.61) {
			p = 1;
		}
		return p;
	}

	static double N75d069e4156(Object[] i) {
		double p = Double.NaN;
		if (i[18] == null) {
			p = 0;
		} else if (((Double) i[18]).doubleValue() <= 9.24) {
			p = RotateSenseSmartClassifier_2.N45d83429157(i);
		} else if (((Double) i[18]).doubleValue() > 9.24) {
			p = 1;
		}
		return p;
	}

	static double N45d83429157(Object[] i) {
		double p = Double.NaN;
		if (i[23] == null) {
			p = 1;
		} else if (((Double) i[23]).doubleValue() <= 0.43) {
			p = 1;
		} else if (((Double) i[23]).doubleValue() > 0.43) {
			p = 0;
		}
		return p;
	}
}

class RotateSenseSmartClassifier_3 {

	public static double classify(Object[] i) throws Exception {

		double p = Double.NaN;
		p = RotateSenseSmartClassifier_3.N75489391158(i);
		return p;
	}

	static double N75489391158(Object[] i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 0;
		} else if (((Double) i[0]).doubleValue() <= 0.82) {
			p = RotateSenseSmartClassifier_3.N6fd050be159(i);
		} else if (((Double) i[0]).doubleValue() > 0.82) {
			p = RotateSenseSmartClassifier_3.Na22c86e162(i);
		}
		return p;
	}

	static double N6fd050be159(Object[] i) {
		double p = Double.NaN;
		if (i[8] == null) {
			p = 2;
		} else if (((Double) i[8]).doubleValue() <= 1.66) {
			p = RotateSenseSmartClassifier_3.N5565234b160(i);
		} else if (((Double) i[8]).doubleValue() > 1.66) {
			p = RotateSenseSmartClassifier_3.N62f03cb9161(i);
		}
		return p;
	}

	static double N5565234b160(Object[] i) {
		double p = Double.NaN;
		if (i[23] == null) {
			p = 0;
		} else if (((Double) i[23]).doubleValue() <= -2.85) {
			p = 0;
		} else if (((Double) i[23]).doubleValue() > -2.85) {
			p = 2;
		}
		return p;
	}

	static double N62f03cb9161(Object[] i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 2;
		} else if (((Double) i[1]).doubleValue() <= 1.18) {
			p = 2;
		} else if (((Double) i[1]).doubleValue() > 1.18) {
			p = 0;
		}
		return p;
	}

	static double Na22c86e162(Object[] i) {
		double p = Double.NaN;
		if (i[16] == null) {
			p = 1;
		} else if (((Double) i[16]).doubleValue() <= 0.13) {
			p = 1;
		} else if (((Double) i[16]).doubleValue() > 0.13) {
			p = RotateSenseSmartClassifier_3.N7194b2f4163(i);
		}
		return p;
	}

	static double N7194b2f4163(Object[] i) {
		double p = Double.NaN;
		if (i[2] == null) {
			p = 0;
		} else if (((Double) i[2]).doubleValue() <= 1.88) {
			p = RotateSenseSmartClassifier_3.N5970eb6d164(i);
		} else if (((Double) i[2]).doubleValue() > 1.88) {
			p = 1;
		}
		return p;
	}

	static double N5970eb6d164(Object[] i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 0;
		} else if (((Double) i[1]).doubleValue() <= 0.49) {
			p = 0;
		} else if (((Double) i[1]).doubleValue() > 0.49) {
			p = RotateSenseSmartClassifier_3.N4706efb165(i);
		}
		return p;
	}

	static double N4706efb165(Object[] i) {
		double p = Double.NaN;
		if (i[14] == null) {
			p = 0;
		} else if (((Double) i[14]).doubleValue() <= 0.76) {
			p = RotateSenseSmartClassifier_3.N71862303166(i);
		} else if (((Double) i[14]).doubleValue() > 0.76) {
			p = 0;
		}
		return p;
	}

	static double N71862303166(Object[] i) {
		double p = Double.NaN;
		if (i[29] == null) {
			p = 0;
		} else if (((Double) i[29]).doubleValue() <= 6.28) {
			p = 0;
		} else if (((Double) i[29]).doubleValue() > 6.28) {
			p = 1;
		}
		return p;
	}
}

class RotateSenseSmartClassifier_4 {

	public static double classify(Object[] i) throws Exception {

		double p = Double.NaN;
		p = RotateSenseSmartClassifier_4.N1d64d42f167(i);
		return p;
	}

	static double N1d64d42f167(Object[] i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 0;
		} else if (((Double) i[0]).doubleValue() <= 0.82) {
			p = RotateSenseSmartClassifier_4.N46a668bc168(i);
		} else if (((Double) i[0]).doubleValue() > 0.82) {
			p = RotateSenseSmartClassifier_4.N4533473a171(i);
		}
		return p;
	}

	static double N46a668bc168(Object[] i) {
		double p = Double.NaN;
		if (i[14] == null) {
			p = 2;
		} else if (((Double) i[14]).doubleValue() <= 1.68) {
			p = RotateSenseSmartClassifier_4.N572632e0169(i);
		} else if (((Double) i[14]).doubleValue() > 1.68) {
			p = RotateSenseSmartClassifier_4.Ncd63cd3170(i);
		}
		return p;
	}

	static double N572632e0169(Object[] i) {
		double p = Double.NaN;
		if (i[18] == null) {
			p = 2;
		} else if (((Double) i[18]).doubleValue() <= -1.66) {
			p = 2;
		} else if (((Double) i[18]).doubleValue() > -1.66) {
			p = 0;
		}
		return p;
	}

	static double Ncd63cd3170(Object[] i) {
		double p = Double.NaN;
		if (i[27] == null) {
			p = 0;
		} else if (((Double) i[27]).doubleValue() <= 7.35) {
			p = 0;
		} else if (((Double) i[27]).doubleValue() > 7.35) {
			p = 2;
		}
		return p;
	}

	static double N4533473a171(Object[] i) {
		double p = Double.NaN;
		if (i[35] == null) {
			p = 0;
		} else if (((Double) i[35]).doubleValue() <= -2.15) {
			p = 0;
		} else if (((Double) i[35]).doubleValue() > -2.15) {
			p = RotateSenseSmartClassifier_4.N29895454172(i);
		}
		return p;
	}

	static double N29895454172(Object[] i) {
		double p = Double.NaN;
		if (i[28] == null) {
			p = 1;
		} else if (((Double) i[28]).doubleValue() <= -1.38) {
			p = 1;
		} else if (((Double) i[28]).doubleValue() > -1.38) {
			p = RotateSenseSmartClassifier_4.N76ff6c19173(i);
		}
		return p;
	}

	static double N76ff6c19173(Object[] i) {
		double p = Double.NaN;
		if (i[9] == null) {
			p = 0;
		} else if (((Double) i[9]).doubleValue() <= 10.07) {
			p = RotateSenseSmartClassifier_4.N7b121a57174(i);
		} else if (((Double) i[9]).doubleValue() > 10.07) {
			p = 0;
		}
		return p;
	}

	static double N7b121a57174(Object[] i) {
		double p = Double.NaN;
		if (i[9] == null) {
			p = 0;
		} else if (((Double) i[9]).doubleValue() <= 8.73) {
			p = RotateSenseSmartClassifier_4.N617f84e0175(i);
		} else if (((Double) i[9]).doubleValue() > 8.73) {
			p = RotateSenseSmartClassifier_4.N7aecc021176(i);
		}
		return p;
	}

	static double N617f84e0175(Object[] i) {
		double p = Double.NaN;
		if (i[2] == null) {
			p = 1;
		} else if (((Double) i[2]).doubleValue() <= 0.53) {
			p = 1;
		} else if (((Double) i[2]).doubleValue() > 0.53) {
			p = 0;
		}
		return p;
	}

	static double N7aecc021176(Object[] i) {
		double p = Double.NaN;
		if (i[21] == null) {
			p = 1;
		} else if (((Double) i[21]).doubleValue() <= 10.12) {
			p = RotateSenseSmartClassifier_4.N4d39f593177(i);
		} else if (((Double) i[21]).doubleValue() > 10.12) {
			p = 0;
		}
		return p;
	}

	static double N4d39f593177(Object[] i) {
		double p = Double.NaN;
		if (i[14] == null) {
			p = 0;
		} else if (((Double) i[14]).doubleValue() <= 0.66) {
			p = 0;
		} else if (((Double) i[14]).doubleValue() > 0.66) {
			p = 1;
		}
		return p;
	}
}

class RotateSenseSmartClassifier_5 {

	public static double classify(Object[] i) throws Exception {

		double p = Double.NaN;
		p = RotateSenseSmartClassifier_5.N1829ad81178(i);
		return p;
	}

	static double N1829ad81178(Object[] i) {
		double p = Double.NaN;
		if (i[6] == null) {
			p = 2;
		} else if (((Double) i[6]).doubleValue() <= 0.15) {
			p = RotateSenseSmartClassifier_5.N583dfc8b179(i);
		} else if (((Double) i[6]).doubleValue() > 0.15) {
			p = RotateSenseSmartClassifier_5.N16c1d947183(i);
		}
		return p;
	}

	static double N583dfc8b179(Object[] i) {
		double p = Double.NaN;
		if (i[7] == null) {
			p = 2;
		} else if (((Double) i[7]).doubleValue() <= 0.86) {
			p = 2;
		} else if (((Double) i[7]).doubleValue() > 0.86) {
			p = RotateSenseSmartClassifier_5.N4d8f36ef180(i);
		}
		return p;
	}

	static double N4d8f36ef180(Object[] i) {
		double p = Double.NaN;
		if (i[25] == null) {
			p = 0;
		} else if (((Double) i[25]).doubleValue() <= -6.9) {
			p = 0;
		} else if (((Double) i[25]).doubleValue() > -6.9) {
			p = RotateSenseSmartClassifier_5.N755facb0181(i);
		}
		return p;
	}

	static double N755facb0181(Object[] i) {
		double p = Double.NaN;
		if (i[19] == null) {
			p = 0;
		} else if (((Double) i[19]).doubleValue() <= 9.01) {
			p = RotateSenseSmartClassifier_5.N5c429303182(i);
		} else if (((Double) i[19]).doubleValue() > 9.01) {
			p = 2;
		}
		return p;
	}

	static double N5c429303182(Object[] i) {
		double p = Double.NaN;
		if (i[18] == null) {
			p = 2;
		} else if (((Double) i[18]).doubleValue() <= -2.65) {
			p = 2;
		} else if (((Double) i[18]).doubleValue() > -2.65) {
			p = 0;
		}
		return p;
	}

	static double N16c1d947183(Object[] i) {
		double p = Double.NaN;
		if (i[22] == null) {
			p = 0;
		} else if (((Double) i[22]).doubleValue() <= 9.56) {
			p = RotateSenseSmartClassifier_5.N109fcffd184(i);
		} else if (((Double) i[22]).doubleValue() > 9.56) {
			p = 1;
		}
		return p;
	}

	static double N109fcffd184(Object[] i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 1;
		} else if (((Double) i[1]).doubleValue() <= 0.49) {
			p = RotateSenseSmartClassifier_5.N6c0ff391185(i);
		} else if (((Double) i[1]).doubleValue() > 0.49) {
			p = RotateSenseSmartClassifier_5.Nb3fec04186(i);
		}
		return p;
	}

	static double N6c0ff391185(Object[] i) {
		double p = Double.NaN;
		if (i[3] == null) {
			p = 1;
		} else if (((Double) i[3]).doubleValue() <= 10.1) {
			p = 1;
		} else if (((Double) i[3]).doubleValue() > 10.1) {
			p = 0;
		}
		return p;
	}

	static double Nb3fec04186(Object[] i) {
		double p = Double.NaN;
		if (i[2] == null) {
			p = 0;
		} else if (((Double) i[2]).doubleValue() <= 0.81) {
			p = RotateSenseSmartClassifier_5.N11a00061187(i);
		} else if (((Double) i[2]).doubleValue() > 0.81) {
			p = 0;
		}
		return p;
	}

	static double N11a00061187(Object[] i) {
		double p = Double.NaN;
		if (i[29] == null) {
			p = 0;
		} else if (((Double) i[29]).doubleValue() <= 6.59) {
			p = 0;
		} else if (((Double) i[29]).doubleValue() > 6.59) {
			p = RotateSenseSmartClassifier_5.N1f78e951188(i);
		}
		return p;
	}

	static double N1f78e951188(Object[] i) {
		double p = Double.NaN;
		if (i[11] == null) {
			p = 1;
		} else if (((Double) i[11]).doubleValue() <= 0.58) {
			p = 1;
		} else if (((Double) i[11]).doubleValue() > 0.58) {
			p = 0;
		}
		return p;
	}
}

class RotateSenseSmartClassifier_6 {

	public static double classify(Object[] i) throws Exception {

		double p = Double.NaN;
		p = RotateSenseSmartClassifier_6.N3b1dd4fb189(i);
		return p;
	}

	static double N3b1dd4fb189(Object[] i) {
		double p = Double.NaN;
		if (i[15] == null) {
			p = 0;
		} else if (((Double) i[15]).doubleValue() <= 0.8) {
			p = RotateSenseSmartClassifier_6.N2389c90f190(i);
		} else if (((Double) i[15]).doubleValue() > 0.8) {
			p = RotateSenseSmartClassifier_6.N2774d77d193(i);
		}
		return p;
	}

	static double N2389c90f190(Object[] i) {
		double p = Double.NaN;
		if (i[7] == null) {
			p = 2;
		} else if (((Double) i[7]).doubleValue() <= 0.86) {
			p = 2;
		} else if (((Double) i[7]).doubleValue() > 0.86) {
			p = RotateSenseSmartClassifier_6.N2aef0a03191(i);
		}
		return p;
	}

	static double N2aef0a03191(Object[] i) {
		double p = Double.NaN;
		if (i[2] == null) {
			p = 2;
		} else if (((Double) i[2]).doubleValue() <= 0.75) {
			p = 2;
		} else if (((Double) i[2]).doubleValue() > 0.75) {
			p = RotateSenseSmartClassifier_6.N337a60fa192(i);
		}
		return p;
	}

	static double N337a60fa192(Object[] i) {
		double p = Double.NaN;
		if (i[27] == null) {
			p = 0;
		} else if (((Double) i[27]).doubleValue() <= 5.82) {
			p = 0;
		} else if (((Double) i[27]).doubleValue() > 5.82) {
			p = 2;
		}
		return p;
	}

	static double N2774d77d193(Object[] i) {
		double p = Double.NaN;
		if (i[15] == null) {
			p = 1;
		} else if (((Double) i[15]).doubleValue() <= 10.07) {
			p = RotateSenseSmartClassifier_6.N67ef63c7194(i);
		} else if (((Double) i[15]).doubleValue() > 10.07) {
			p = 0;
		}
		return p;
	}

	static double N67ef63c7194(Object[] i) {
		double p = Double.NaN;
		if (i[18] == null) {
			p = 1;
		} else if (((Double) i[18]).doubleValue() <= 9.99) {
			p = RotateSenseSmartClassifier_6.N157fd320195(i);
		} else if (((Double) i[18]).doubleValue() > 9.99) {
			p = 0;
		}
		return p;
	}

	static double N157fd320195(Object[] i) {
		double p = Double.NaN;
		if (i[13] == null) {
			p = 1;
		} else if (((Double) i[13]).doubleValue() <= 1.52) {
			p = RotateSenseSmartClassifier_6.N7afde4e6196(i);
		} else if (((Double) i[13]).doubleValue() > 1.52) {
			p = RotateSenseSmartClassifier_6.N3f69582a200(i);
		}
		return p;
	}

	static double N7afde4e6196(Object[] i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 1;
		} else if (((Double) i[0]).doubleValue() <= 9.49) {
			p = RotateSenseSmartClassifier_6.N32bef71f197(i);
		} else if (((Double) i[0]).doubleValue() > 9.49) {
			p = RotateSenseSmartClassifier_6.N145a77b6199(i);
		}
		return p;
	}

	static double N32bef71f197(Object[] i) {
		double p = Double.NaN;
		if (i[15] == null) {
			p = 1;
		} else if (((Double) i[15]).doubleValue() <= 9.64) {
			p = RotateSenseSmartClassifier_6.N17522e40198(i);
		} else if (((Double) i[15]).doubleValue() > 9.64) {
			p = 1;
		}
		return p;
	}

	static double N17522e40198(Object[] i) {
		double p = Double.NaN;
		if (i[9] == null) {
			p = 1;
		} else if (((Double) i[9]).doubleValue() <= 9.07) {
			p = 1;
		} else if (((Double) i[9]).doubleValue() > 9.07) {
			p = 0;
		}
		return p;
	}

	static double N145a77b6199(Object[] i) {
		double p = Double.NaN;
		if (i[17] == null) {
			p = 1;
		} else if (((Double) i[17]).doubleValue() <= 1.12) {
			p = 1;
		} else if (((Double) i[17]).doubleValue() > 1.12) {
			p = 0;
		}
		return p;
	}

	static double N3f69582a200(Object[] i) {
		double p = Double.NaN;
		if (i[23] == null) {
			p = 1;
		} else if (((Double) i[23]).doubleValue() <= 0.93) {
			p = RotateSenseSmartClassifier_6.N1d1b4dec201(i);
		} else if (((Double) i[23]).doubleValue() > 0.93) {
			p = RotateSenseSmartClassifier_6.N7d77f3f6203(i);
		}
		return p;
	}

	static double N1d1b4dec201(Object[] i) {
		double p = Double.NaN;
		if (i[19] == null) {
			p = 1;
		} else if (((Double) i[19]).doubleValue() <= 6.4) {
			p = RotateSenseSmartClassifier_6.N6b98cfe1202(i);
		} else if (((Double) i[19]).doubleValue() > 6.4) {
			p = 1;
		}
		return p;
	}

	static double N6b98cfe1202(Object[] i) {
		double p = Double.NaN;
		if (i[15] == null) {
			p = 0;
		} else if (((Double) i[15]).doubleValue() <= 8.84) {
			p = 0;
		} else if (((Double) i[15]).doubleValue() > 8.84) {
			p = 1;
		}
		return p;
	}

	static double N7d77f3f6203(Object[] i) {
		double p = Double.NaN;
		if (i[2] == null) {
			p = 0;
		} else if (((Double) i[2]).doubleValue() <= 4.48) {
			p = 0;
		} else if (((Double) i[2]).doubleValue() > 4.48) {
			p = 1;
		}
		return p;
	}
}

class RotateSenseSmartClassifier_7 {

	public static double classify(Object[] i) throws Exception {

		double p = Double.NaN;
		p = RotateSenseSmartClassifier_7.N4e31dbd4204(i);
		return p;
	}

	static double N4e31dbd4204(Object[] i) {
		double p = Double.NaN;
		if (i[6] == null) {
			p = 0;
		} else if (((Double) i[6]).doubleValue() <= 0.82) {
			p = RotateSenseSmartClassifier_7.N2b576367205(i);
		} else if (((Double) i[6]).doubleValue() > 0.82) {
			p = RotateSenseSmartClassifier_7.N66b309a1209(i);
		}
		return p;
	}

	static double N2b576367205(Object[] i) {
		double p = Double.NaN;
		if (i[22] == null) {
			p = 2;
		} else if (((Double) i[22]).doubleValue() <= 0.84) {
			p = 2;
		} else if (((Double) i[22]).doubleValue() > 0.84) {
			p = RotateSenseSmartClassifier_7.N763f156b206(i);
		}
		return p;
	}

	static double N763f156b206(Object[] i) {
		double p = Double.NaN;
		if (i[13] == null) {
			p = 0;
		} else if (((Double) i[13]).doubleValue() <= 9.36) {
			p = RotateSenseSmartClassifier_7.N27976073207(i);
		} else if (((Double) i[13]).doubleValue() > 9.36) {
			p = 2;
		}
		return p;
	}

	static double N27976073207(Object[] i) {
		double p = Double.NaN;
		if (i[15] == null) {
			p = 0;
		} else if (((Double) i[15]).doubleValue() <= -3.98) {
			p = RotateSenseSmartClassifier_7.N433d3253208(i);
		} else if (((Double) i[15]).doubleValue() > -3.98) {
			p = 0;
		}
		return p;
	}

	static double N433d3253208(Object[] i) {
		double p = Double.NaN;
		if (i[8] == null) {
			p = 2;
		} else if (((Double) i[8]).doubleValue() <= 1.67) {
			p = 2;
		} else if (((Double) i[8]).doubleValue() > 1.67) {
			p = 0;
		}
		return p;
	}

	static double N66b309a1209(Object[] i) {
		double p = Double.NaN;
		if (i[28] == null) {
			p = 1;
		} else if (((Double) i[28]).doubleValue() <= 3.98) {
			p = RotateSenseSmartClassifier_7.N743d5db3210(i);
		} else if (((Double) i[28]).doubleValue() > 3.98) {
			p = 0;
		}
		return p;
	}

	static double N743d5db3210(Object[] i) {
		double p = Double.NaN;
		if (i[12] == null) {
			p = 1;
		} else if (((Double) i[12]).doubleValue() <= 10.64) {
			p = RotateSenseSmartClassifier_7.N68d2ce63211(i);
		} else if (((Double) i[12]).doubleValue() > 10.64) {
			p = 0;
		}
		return p;
	}

	static double N68d2ce63211(Object[] i) {
		double p = Double.NaN;
		if (i[21] == null) {
			p = 0;
		} else if (((Double) i[21]).doubleValue() <= 0.85) {
			p = 0;
		} else if (((Double) i[21]).doubleValue() > 0.85) {
			p = RotateSenseSmartClassifier_7.N67ebfb58212(i);
		}
		return p;
	}

	static double N67ebfb58212(Object[] i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 1;
		} else if (((Double) i[0]).doubleValue() <= 9.49) {
			p = RotateSenseSmartClassifier_7.N35c283b5213(i);
		} else if (((Double) i[0]).doubleValue() > 9.49) {
			p = RotateSenseSmartClassifier_7.N1e5549d1215(i);
		}
		return p;
	}

	static double N35c283b5213(Object[] i) {
		double p = Double.NaN;
		if (i[1] == null) {
			p = 1;
		} else if (((Double) i[1]).doubleValue() <= 4.63) {
			p = 1;
		} else if (((Double) i[1]).doubleValue() > 4.63) {
			p = RotateSenseSmartClassifier_7.N7554fba5214(i);
		}
		return p;
	}

	static double N7554fba5214(Object[] i) {
		double p = Double.NaN;
		if (i[20] == null) {
			p = 1;
		} else if (((Double) i[20]).doubleValue() <= 0.86) {
			p = 1;
		} else if (((Double) i[20]).doubleValue() > 0.86) {
			p = 0;
		}
		return p;
	}

	static double N1e5549d1215(Object[] i) {
		double p = Double.NaN;
		if (i[7] == null) {
			p = 1;
		} else if (((Double) i[7]).doubleValue() <= 0.14) {
			p = 1;
		} else if (((Double) i[7]).doubleValue() > 0.14) {
			p = 0;
		}
		return p;
	}
}

class RotateSenseSmartClassifier_8 {

	public static double classify(Object[] i) throws Exception {

		double p = Double.NaN;
		p = RotateSenseSmartClassifier_8.N716147e5216(i);
		return p;
	}

	static double N716147e5216(Object[] i) {
		double p = Double.NaN;
		if (i[3] == null) {
			p = 0;
		} else if (((Double) i[3]).doubleValue() <= 0.28) {
			p = RotateSenseSmartClassifier_8.N29b7458a217(i);
		} else if (((Double) i[3]).doubleValue() > 0.28) {
			p = RotateSenseSmartClassifier_8.N7107ed45221(i);
		}
		return p;
	}

	static double N29b7458a217(Object[] i) {
		double p = Double.NaN;
		if (i[23] == null) {
			p = 0;
		} else if (((Double) i[23]).doubleValue() <= -3.15) {
			p = 0;
		} else if (((Double) i[23]).doubleValue() > -3.15) {
			p = RotateSenseSmartClassifier_8.N3f367c6b218(i);
		}
		return p;
	}

	static double N3f367c6b218(Object[] i) {
		double p = Double.NaN;
		if (i[12] == null) {
			p = 2;
		} else if (((Double) i[12]).doubleValue() <= -0.29) {
			p = RotateSenseSmartClassifier_8.N12227539219(i);
		} else if (((Double) i[12]).doubleValue() > -0.29) {
			p = 0;
		}
		return p;
	}

	static double N12227539219(Object[] i) {
		double p = Double.NaN;
		if (i[30] == null) {
			p = 2;
		} else if (((Double) i[30]).doubleValue() <= 4.75) {
			p = RotateSenseSmartClassifier_8.N143dfa7c220(i);
		} else if (((Double) i[30]).doubleValue() > 4.75) {
			p = 2;
		}
		return p;
	}

	static double N143dfa7c220(Object[] i) {
		double p = Double.NaN;
		if (i[17] == null) {
			p = 2;
		} else if (((Double) i[17]).doubleValue() <= 1.46) {
			p = 2;
		} else if (((Double) i[17]).doubleValue() > 1.46) {
			p = 0;
		}
		return p;
	}

	static double N7107ed45221(Object[] i) {
		double p = Double.NaN;
		if (i[9] == null) {
			p = 0;
		} else if (((Double) i[9]).doubleValue() <= 10.07) {
			p = RotateSenseSmartClassifier_8.N3f6a86fc222(i);
		} else if (((Double) i[9]).doubleValue() > 10.07) {
			p = 0;
		}
		return p;
	}

	static double N3f6a86fc222(Object[] i) {
		double p = Double.NaN;
		if (i[10] == null) {
			p = 1;
		} else if (((Double) i[10]).doubleValue() <= -1.06) {
			p = 1;
		} else if (((Double) i[10]).doubleValue() > -1.06) {
			p = RotateSenseSmartClassifier_8.N6ac42aea223(i);
		}
		return p;
	}

	static double N6ac42aea223(Object[] i) {
		double p = Double.NaN;
		if (i[35] == null) {
			p = 0;
		} else if (((Double) i[35]).doubleValue() <= -0.46) {
			p = 0;
		} else if (((Double) i[35]).doubleValue() > -0.46) {
			p = RotateSenseSmartClassifier_8.N74dd9f68224(i);
		}
		return p;
	}

	static double N74dd9f68224(Object[] i) {
		double p = Double.NaN;
		if (i[28] == null) {
			p = 1;
		} else if (((Double) i[28]).doubleValue() <= -1.38) {
			p = 1;
		} else if (((Double) i[28]).doubleValue() > -1.38) {
			p = RotateSenseSmartClassifier_8.N20ca0c9225(i);
		}
		return p;
	}

	static double N20ca0c9225(Object[] i) {
		double p = Double.NaN;
		if (i[23] == null) {
			p = 1;
		} else if (((Double) i[23]).doubleValue() <= 1.07) {
			p = RotateSenseSmartClassifier_8.Nb0fed2c226(i);
		} else if (((Double) i[23]).doubleValue() > 1.07) {
			p = RotateSenseSmartClassifier_8.N9f6bfca228(i);
		}
		return p;
	}

	static double Nb0fed2c226(Object[] i) {
		double p = Double.NaN;
		if (i[15] == null) {
			p = 1;
		} else if (((Double) i[15]).doubleValue() <= 9.96) {
			p = RotateSenseSmartClassifier_8.N429be960227(i);
		} else if (((Double) i[15]).doubleValue() > 9.96) {
			p = 0;
		}
		return p;
	}

	static double N429be960227(Object[] i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 0;
		} else if (((Double) i[0]).doubleValue() <= 8.17) {
			p = 0;
		} else if (((Double) i[0]).doubleValue() > 8.17) {
			p = 1;
		}
		return p;
	}

	static double N9f6bfca228(Object[] i) {
		double p = Double.NaN;
		if (i[18] == null) {
			p = 0;
		} else if (((Double) i[18]).doubleValue() <= 9.85) {
			p = 0;
		} else if (((Double) i[18]).doubleValue() > 9.85) {
			p = 1;
		}
		return p;
	}
}

class RotateSenseSmartClassifier_9 {

	public static double classify(Object[] i) throws Exception {

		double p = Double.NaN;
		p = RotateSenseSmartClassifier_9.N26a96be2229(i);
		return p;
	}

	static double N26a96be2229(Object[] i) {
		double p = Double.NaN;
		if (i[0] == null) {
			p = 2;
		} else if (((Double) i[0]).doubleValue() <= -0.11) {
			p = RotateSenseSmartClassifier_9.N3ce9d642230(i);
		} else if (((Double) i[0]).doubleValue() > -0.11) {
			p = RotateSenseSmartClassifier_9.N15dcd5e9232(i);
		}
		return p;
	}

	static double N3ce9d642230(Object[] i) {
		double p = Double.NaN;
		if (i[23] == null) {
			p = 0;
		} else if (((Double) i[23]).doubleValue() <= -3.15) {
			p = 0;
		} else if (((Double) i[23]).doubleValue() > -3.15) {
			p = RotateSenseSmartClassifier_9.N1bf1a64c231(i);
		}
		return p;
	}

	static double N1bf1a64c231(Object[] i) {
		double p = Double.NaN;
		if (i[21] == null) {
			p = 2;
		} else if (((Double) i[21]).doubleValue() <= -0.24) {
			p = 2;
		} else if (((Double) i[21]).doubleValue() > -0.24) {
			p = 0;
		}
		return p;
	}

	static double N15dcd5e9232(Object[] i) {
		double p = Double.NaN;
		if (i[13] == null) {
			p = 0;
		} else if (((Double) i[13]).doubleValue() <= 9.55) {
			p = RotateSenseSmartClassifier_9.N555fbf35233(i);
		} else if (((Double) i[13]).doubleValue() > 9.55) {
			p = 1;
		}
		return p;
	}

	static double N555fbf35233(Object[] i) {
		double p = Double.NaN;
		if (i[18] == null) {
			p = 0;
		} else if (((Double) i[18]).doubleValue() <= 9.99) {
			p = RotateSenseSmartClassifier_9.N1025c5d234(i);
		} else if (((Double) i[18]).doubleValue() > 9.99) {
			p = 0;
		}
		return p;
	}

	static double N1025c5d234(Object[] i) {
		double p = Double.NaN;
		if (i[19] == null) {
			p = 1;
		} else if (((Double) i[19]).doubleValue() <= -1.59) {
			p = 1;
		} else if (((Double) i[19]).doubleValue() > -1.59) {
			p = RotateSenseSmartClassifier_9.N41fdde2f235(i);
		}
		return p;
	}

	static double N41fdde2f235(Object[] i) {
		double p = Double.NaN;
		if (i[18] == null) {
			p = 0;
		} else if (((Double) i[18]).doubleValue() <= 1.03) {
			p = 0;
		} else if (((Double) i[18]).doubleValue() > 1.03) {
			p = RotateSenseSmartClassifier_9.N2060182236(i);
		}
		return p;
	}

	static double N2060182236(Object[] i) {
		double p = Double.NaN;
		if (i[3] == null) {
			p = 1;
		} else if (((Double) i[3]).doubleValue() <= 10.07) {
			p = RotateSenseSmartClassifier_9.N584cfed7237(i);
		} else if (((Double) i[3]).doubleValue() > 10.07) {
			p = 0;
		}
		return p;
	}

	static double N584cfed7237(Object[] i) {
		double p = Double.NaN;
		if (i[21] == null) {
			p = 1;
		} else if (((Double) i[21]).doubleValue() <= 10.01) {
			p = RotateSenseSmartClassifier_9.N26ef028b238(i);
		} else if (((Double) i[21]).doubleValue() > 10.01) {
			p = 0;
		}
		return p;
	}

	static double N26ef028b238(Object[] i) {
		double p = Double.NaN;
		if (i[35] == null) {
			p = 0;
		} else if (((Double) i[35]).doubleValue() <= -0.46) {
			p = 0;
		} else if (((Double) i[35]).doubleValue() > -0.46) {
			p = RotateSenseSmartClassifier_9.N159007a5239(i);
		}
		return p;
	}

	static double N159007a5239(Object[] i) {
		double p = Double.NaN;
		if (i[4] == null) {
			p = 1;
		} else if (((Double) i[4]).doubleValue() <= 1.7) {
			p = 1;
		} else if (((Double) i[4]).doubleValue() > 1.7) {
			p = RotateSenseSmartClassifier_9.N22e5ecb2240(i);
		}
		return p;
	}

	static double N22e5ecb2240(Object[] i) {
		double p = Double.NaN;
		if (i[9] == null) {
			p = 1;
		} else if (((Double) i[9]).doubleValue() <= 7.45) {
			p = 1;
		} else if (((Double) i[9]).doubleValue() > 7.45) {
			p = 0;
		}
		return p;
	}
}