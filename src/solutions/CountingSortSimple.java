package dayThree;

import java.util.Arrays;

public class CountingSortSimple {

	private CountingSortSimple() {

	}

	public static void sort(int[] array) {
		int min = Arrays.stream(array).min().getAsInt();
		int range = Arrays.stream(array).max().getAsInt() - min;
		int[] temp = new int[range + 1];
		int[] result = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			temp[array[i] - min]++;
		}

		for (int i = 1; i < temp.length; i++) {
			temp[i] += temp[i - 1];
		}

		for (int i = array.length - 1; i >= 0; i--) {
			result[temp[array[i] - min] - 1] = array[i];
			temp[array[i] - min]--;
		}

		for (int i = 0; i < array.length; i++) {
			array[i] = result[i];
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { -10, 2, 6, 5, 7, 9, 3, 1, 2, 0, 6, 5, 4, 9, 8, 6, 2, 5, 8, 4 };
		sort(arr);
		for (int a : arr) {
			System.out.println(a);
		}
	}
}
