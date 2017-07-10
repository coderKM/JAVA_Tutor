package LEC1030;
import java.util.ArrayList;
import java.util.Stack;

public class LEC1023 {

	public static void main(String[] args) {

		/* ARRAY TRICKS */

		// simple order
		System.out.println("order");

		int[] intArr3 = { 12, 50, 21, 9, 1 };

		for (int i = 0; i < intArr3.length; i++) { // pick pointer int
			for (int j = 0; j < intArr3.length; j++) {
				if (intArr3[i] < intArr3[j]) {
					System.out.println("i : " + i + ":" + intArr3[i] + " / j : " + j + ":" + intArr3[j]);
					int orderTemp = intArr3[i];
					intArr3[i] = intArr3[j];
					intArr3[j] = orderTemp;
					for (int k = 0; k < intArr3.length; k++) {
						System.out.print(intArr3[k] + " ");
					}
					System.out.println();
				}
			}
		}
		System.out.println("sorted");
		for (int i = 0; i < intArr3.length; i++) {
			System.out.print(intArr3[i] + " ");
			if (i == intArr3.length - 1)
				System.out.println();
		}

		int[] intArr2 = new int[10];
		for (int i = 0; i < 10; i++) {
			intArr2[i] = i;
			System.out.println(intArr2[i]);
		}

		// search
		int[] intArr1 = { 1, 2, 3, 4, 5 };

		// let's find 4!
		boolean isFound = false;
		for (int i = 0; i < intArr1.length; i++) {
			if (intArr1[i] == 4) {
				System.out.println("I found 4!!");
				isFound = true;
			}
		}
		// AND
		// OR
		// TRUE AND FALSE = > &&
		if (!isFound)
			System.out.println("Can't find 4!!!!!!!!!");

		// Todo : think about a handler for not-exist

		// multi-dimentional array
		int[][] mulArr1 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		// Or
		int[][] mulArr2 = new int[2][3];

		// mulArr2.length = 3
		// mulArr2[0].length = 2
		// mulArr2[1].length = 2
		// mulArr2[2].length = 2

		mulArr2[0][0] = 1;
		mulArr2[0][1] = 3;
		mulArr2[0][2] = 5;

		mulArr2[1][0] = 2;
		mulArr2[1][1] = 4;
		mulArr2[1][2] = 6;

		// print element in decresaing order
		for (int i = mulArr1.length - 1; i >= 0; i--) { // assign 2 -> 0 to i
			for (int j = mulArr1[i].length - 1; j >= 0; j--) { // assign 1 -> 0
																// to j
				System.out.print(mulArr1[i][j] + " ");
			}
		}
		System.out.println(); // change line after

		/* STRING METHODS */
		String str = "Ni hao!";

		// size
		int strSize = str.length();
		System.out.println(strSize);
		// charAt()
		// pick character
		char ch = str.charAt(3);
		System.out.println(ch);

		// index of
		int indexOf = str.indexOf('i');
		System.out.println(indexOf);

		// substring
		String subStr = str.substring(0, 4);
		System.out.println(subStr);

		// contains
		System.out.println(str.contains("a"));

		System.out.println('a' > 'b');

		// handling case
//		String toUpperCase = "abcd".toUpperCase();
//		System.out.println(toUpperCase); // ABCD
//
//		String toLowerCase = "ABCD".toLowerCase();
//		System.out.println(toLowerCase); // abcd

		// euqlasIgnoreCase() method compares two string with ignoring case
		//System.out.println(toUpperCase.equalsIgnoreCase(toLowerCase));

		// return the total number of [a]
		// from "apple-pen pineapple-pen pen-pineapple pen-apple"
		System.out.println("Pineapple~~");
		String str11 = "apple-pen pineapple-pen pen-pineapple pen-apple";
		int ctr = 0;
		for (int i = 0; i < str11.length(); i++) {
			if (str11.charAt(i) == 'a') {
				ctr++;
			}
		}
		System.out.println("ctr : " + ctr);
	}
}