package Lec0219;

import java.util.Random;

public class lec0219 {

	public static void main(String[] args) {

		// Wrapper Classes(Integer, Double)

		// Boxing
		int pInt = 3;
		Integer cInt = new Integer(3);

		int x = cInt.intValue();

		double pDoub = 1.23;

		// BOXING
		Double cDoub = new Double(pDoub);
		// System.out.println(cDoub.compareTo(pDoub));
		// System.out.println(cDoub.equals(pDoub));

		// UNBOXING
		double unBox = cDoub.doubleValue();

		// Math Class
		int result;
		double dRet;
		Math.abs(-2.30);

		dRet = Math.pow(5, 10); // 2^4
		dRet = Math.sqrt(5);

		// System.out.println(dRet);
		// Math Class
		System.out.println(Math.PI);
		System.out.println(5^2);
	}

	public static String printYTimes(String in, int y) {
		String ret = "";

		for (int i = 0; i < y; i++) {
			ret += in;
		}
		return ret;
	}

	public static String reverseStr(String in) {
		String ret = "";

		for (int i = 0; i < in.length(); i++) {
			ret = in.charAt(in.length() - i - 1) + ret;
		}
		return ret;
	}

	public double calculateQF(int a, int b, int c) {

		return 0.0;
	}

	double calculateArea(double r) {
		return 0.0;
	}
}
