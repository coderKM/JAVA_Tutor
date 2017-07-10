package LEC0326;

import java.util.HashMap;

public class lec0326 {

	public static int CTR = 0;

	public static void main(String[] args) {

		int[] arr = { 3, 1, 0, 2 };

		int[] ret = doMergeSort(arr, 0, arr.length);
		// int[] ret = doInsertionSort(arr);

		// for (int i = 0; i < ret.length; i++) {
		// System.out.print(ret[i] + " ");
		// }

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("a", 30);
		map.put("b", 30);

		map.put("a", map.get("a") - 70);
		map.put("b", map.get("b") + 80);

		System.out.println(map);

	}

	public static int[] doSelectionSort(int[] arr) {

		// [ 3, 1, 0, 2 ]

		// to iterate input array
		for (int i = 0; i < arr.length - 1; i++) {

			int index = i;

			// from the next one ~ the last one
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) //
					index = j; // index = 1
			}

			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
		return arr;
	}

	public static int[] doInsertionSort(int[] arr) {
		int i, j, newValue;
		// [ 3, 1, 0, 2 ]

		// iterate from 1st to the length -1
		for (i = 1; i < arr.length; i++) {
			newValue = arr[i];
			j = i;

			// sort here
			while (j > 0 && arr[j - 1] > newValue) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = newValue;
		}
		return arr;
	}

	// // arr = [ 3, 1, 0, 2 ]
	// arr.length = 4
	// doMergeSort(arr, 0, arr.length)

	public static int[] doMergeSort(int[] a, int begin, int end) {
		int N = end - begin; // N = 1

		// base case
		if (N <= 1) {
			return null;
		}
		int mid = begin + N / 2; // 2

		// recursive calls => Divide step
		// Left
		doMergeSort(a, begin, mid); // deMergeSort(a, 0, 2)
		// Right
		doMergeSort(a, mid, end);
		// // arr = [ 3, 1, 0, 2 ]

		// when the size is >= 2, we can sort
		
		int[] temp = new int[N];
		int i = begin, j = mid;
		for (int k = 0; k < N; k++) {
			if (i == mid)
				temp[k] = a[j++];
			else if (j == end)
				temp[k] = a[i++];
			else if (a[j] < a[i])
				temp[k] = a[j++];
			else
				temp[k] = a[i++];
		}
		for (int k = 0; k < N; k++)
			a[begin + k] = temp[k];

		// return sorted array => conquer step
		return a;
	}
}
