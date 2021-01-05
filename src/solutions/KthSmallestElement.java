package solutions;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given an array arr[] and a number K where K is smaller than size of array,
 * the task is to find the Kth smallest element in the given array. It is given
 * that all array elements are distinct.
 * 
 * Input: The first line of input contains an integer T, denoting the number of
 * test cases. Then T test cases follow. Each test case consists of three lines.
 * First line of each test case contains an integer N denoting size of the
 * array. Second line contains N space separated integer denoting elements of
 * the array. Third line of the test case contains an integer K.
 * 
 * Output: Corresponding to each test case, print the kth smallest element in a
 * new line.
 * 
 * 
 * @author Irina Stojanovic
 *
 */
public class KthSmallestElement {
	private static Scanner scan = new Scanner(System.in);

	private KthSmallestElement() {
	}

	public static void kthSmallestElement() {
		int repeats = scan.nextInt();
		int[] results = new int[repeats];

		for (int r = 0; r < repeats; r++) {
			int size = scan.nextInt();
			int[] array = new int[size];

			for (int i = 0; i <= size - 1; i++) {
				array[i] = scan.nextInt();
			}

			Arrays.sort(array);

			results[r] = getKthElement(array, scan.nextInt());
		}

		scan.close();

		for (int result : results)
			System.out.println(result);
	}

	private static int getKthElement(int[] array, int k) {
		return array[k - 1];
	}

	public static void main(String[] args) {
		kthSmallestElement();
	}
}
