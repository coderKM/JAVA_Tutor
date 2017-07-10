package LEC0304;

import java.util.ArrayList;

public class Lec0304 {

	public static void main(String[] args) {

		// array
		// int[] array = new int[3];
		// array[0] = 3;
		// int[] arrays = { 3, 2, 3, 4, 5, 6 };

		// for
		// int[][] arr = { { 1, 2 }, { 3, 4 }, { 5, 6, 5 } };

		// [2,2] -> [2,1] -> [2,0] -> ~~~~
		// 3
		// for (int i = arr.length - 1; i >= 0; i--) {
		// for (int j = arr[i].length - 1; j >= 0; j--) {
		// System.out.println(arr[i][j]);
		// }
		// }

		// int a = 3;
		// ArrayList<Integer> al = new ArrayList<Integer>(30);
		// al.add(3);
		/*
		 * ㄴ boolean add(E item) => 1 param ㄴ int size() ㄴ E get(int index) ㄴ E
		 * set(E item, index) ㄴ void add(int index, E element) ㄴ E remove(int
		 * index)
		 */
		// int b = al.get(0);
		//
		// System.out.println(al.remove(0));

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		printEven(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		int[] answ = arrCounter(arr);
		for (int i = 0; i < answ.length; i++) {
			System.out.println(answ[i]);
		}

	}

	static int[] printEven(int[] input) {

		return null;
	}

	static int[] arrCounter(int[] input) {
		int[] array = new int[2];
		int even = 0, odd = 0;
		for (int x = 0; x < input.length; x++)
			if (input[x] % 2 == 0)
				even++;
			else
				odd++;
		array[0] = even;
		array[1] = odd;
		return array;

	}

	static int sumOfNums(int[] input) {

		return 0;
	}

	ArrayList<Integer> printEven(ArrayList<Integer> input) {

		return null;
	}

	ArrayList<Integer> arrCounter(ArrayList<Integer> input) {
		return null;

	}

	int sumOfNums(ArrayList<Integer> input) {
		return 0;

	}
}
