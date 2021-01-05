package dayOne.dataStructures.sortAlgorithms;

public class InsertionSort {
	private InsertionSort() {

	}

	public static int[] insertionSortAsc(int[] array) {
		for (int i = 0; i <= array.length - 1; i++) {
			int j = i;
			while (j > 0 && array[j - 1] > array[j]) {
				swap(array, j);
				j--;
			}
		}

		return array;
	}

	public static int[] insertionSortDesc(int[] array) {
		for (int i = 0; i <= array.length - 1; i++) {
			int j = i;
			while (j > 0 && array[j - 1] < array[j]) {
				swap(array, j);
				j--;
			}
		}

		return array;
	}

	private static void swap(int[] array, int index) {
		int temp = array[index];
		array[index] = array[index - 1];
		array[index - 1] = temp;
	}

	public static void main(String[] args) {
		int[] a = new int[] { 2, 5, 6, 9, 4, 3, 1, 8, 7 };

		a = insertionSortDesc(a);
		for (int number : a) {
			System.out.println(number);
		}
	}
}
