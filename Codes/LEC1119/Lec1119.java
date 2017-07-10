package LEC1119;

import java.util.ArrayList;
import java.util.Stack;

public class Lec1119 {

	public static void main(String[] args) {

		// Recursion **
		Lec1119 lec = new Lec1119();

		// print non-recursively => by loop,
		System.out.println(lec.printNum(4));

		// print recursively
		System.out.println(lec.recur_printNum(4));

		// program for recursive fibonacci
		// https://en.wikipedia.org/wiki/Fibonacci_number
	}

	// in : 4
	public String printNum(int in) {
		String returnStr = "";
		int begin = 1;
		for (int i = 0; i < in; i++) {
			returnStr += begin;
			begin = begin + 1;
		}
		return returnStr;
	}

	// in : 4
	public String recur_printNum(int in) {
		String returnStr = "";

		if (in == 0) {
			return "";
		} else {
			returnStr += in;
			return recur_printNum(in - 1) + returnStr;
		}
	}

	public int recurFibo(int n) {
		if (n <= 1)
			return n;
		else
			return recurFibo(n - 2) + recurFibo(n - 1);
	}

}
