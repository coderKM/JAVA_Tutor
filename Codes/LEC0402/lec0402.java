package LEC0402;

import java.util.HashMap;

public class lec0402 {
	static int CTR = 0;

	public static void main(String[] args) {
		int[] arr = { 3, 1, 0, 2 };
//		int[] ret = doMergeSort(arr, 0, arr.length);

		String a = "holy";
		System.out.println(a.substring(2));
		int[] bSeacrhData = { 1, 2, 9, 10, 21, 28, 200, 388 };
		
		
	}
	public void increment(int n ){
		n++;
		System.out.println(n);
	}

	// Very simple and basic search algorithm
	public static int seqSearch(int[] data, int k) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == k) {
				return i;
			}
		}
		return -1;
	}

	public static int rBsearch(int[] data, int begin, int end, int k) {
		int mid = (begin + end) / 2;

		// if low becomes less than high, it fails & returns -1
		if (begin > end) {
			return -1;
			// if the value in the middle == k
		} else if (data[mid] == k) {
			return mid;
			// if k is bigger than mid point then search right subarray
		} else if (data[mid] < k) {
			return rBsearch(data, mid + 1, end, k);
			// if k is less than mid point then search left subarray
		} else {
			return rBsearch(data, begin, mid - 1, k);
		}
	}

	public static int[] doMergeSort(int[] a, int begin, int end) {
		// System.out.println("begin : " + begin + " \nend : " + end);
		int N = end - begin; // N = 1
		if (N <= 1) {
			// System.out.println("** return null **");
			return null;
		}
		
		int mid = begin + N / 2; // 2

		doMergeSort(a, begin, mid);
		// System.out.println("== left end ==");
		doMergeSort(a, mid, end);
		// System.out.println("== right end ==");

		// subarray with size >= 2 reaches below
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
