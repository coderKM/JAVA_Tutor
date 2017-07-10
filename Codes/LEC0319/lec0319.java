package LEC0319;

public class lec0319 {

	public static void main(String[] args) {

		System.out.println(add(5));

		// drawLine(5);

		// what would be printed?

		// Let's make infinite recursive method!

		// let's make recursive method that takes array
		int[] arrr = { 1, 3, 2, 1, 2, 3 };
		traverseArr(arrr);
	}

	void recPrint(int[] input) {
		if (input.length != 0) {
			int[] output = new int[input.length - 1];
			for (int i = 0; i < output.length; i++) {
				output[i] = input[i];
			}
			System.out.println(input[input.length - 1]);
			recPrint(output);
		}
	}

	int recFactorial(int n) {
		return 0;
	}

	public static void traverseArr(int[] arr) {
		// Base case
		if (arr.length == 1) {
			System.out.println(arr[0]);
			System.out.println("Done!");
			return;
		}

		// Nonbase case
		System.out.println(arr[0]);
		int[] newArr = new int[arr.length - 1];

		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[i + 1];
		}

		traverseArr(newArr);

	}

	// drawLine(5);
	public static void drawLine(int n) {
		// if (n == 0)
		// System.out.println("That's all, forks!");
		// else {
		for (int i = 0; i < n; i++)
			System.out.print("*");

		System.out.println();
		drawLine(n - 1);
		// }
	}

	public int add(int input) {
		int all = 0;
		if (input == 0) {
			return all;
		} else {
			all = all + add(input - 1);
		}

	}
}
