package solutions;

public class CountingSortChar {
	private CountingSortChar() {
	}

	public static void sortChars(char[] arr) {
		int size = arr.length;

		char[] temp = new char[size];
		int[] counter = new int[256];

		for (int i = 0; i < size; i++) {
			++counter[arr[i]];
		}

		for (int i = 1; i <= 255; ++i) {
			System.out.println(i);
			counter[i] += counter[i - 1];
		}

		for (int i = size - 1; i >= 0; i--) {
			temp[counter[arr[i]] - 1] = arr[i];
			--counter[arr[i]];
		}

		for (int i = 0; i < size; ++i) {
			arr[i] = temp[i];
		}

	}

	public static void main(String[] args) {
		char arr[] = { 'a', 'a', 't', ' ', '4', 'e', '-' };

		int[] a2rr = new int[8];
		for (int i = 0; i <= arr.length - 1; i++) {
			a2rr[i] = arr[i];
		}

		sortChars(arr);

		System.out.print("Sorted character array is ");
		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i]);
	}
}
