package dayTwo.dataStructures.sortAlgorithms;

public class QuickSort {
	private static int[] result;

	private QuickSort() {

	}

	public static int[] quickSort(int[] array) {
		result = array;
		sort(0, array.length - 1);
		return result;
	}

	public static void sort(int startIndex, int endIndex) {
		if (startIndex < endIndex) {
			int pivot = partition(startIndex, endIndex);
			sort(startIndex, pivot - 1);
			sort(pivot + 1, endIndex);
		}
	}

	private static int partition(int startIndex, int endIndex) {
		int pivot = result[endIndex];
		int i = startIndex - 1;

		for (int j = startIndex; j <= endIndex - 1; j++) {
			if (result[j] <= pivot) {
				i++;
				if (i != j)
					swap(i, j);
			}
		}

		swap(i + 1, endIndex);
		return i + 1;
	}

	private static void swap(int indexOne, int indexTwo) {
		int temp = result[indexOne];
		result[indexOne] = result[indexTwo];
		result[indexTwo] = temp;
	}

	public static void main(String[] args) {
		int[] a = new int[] { 2, 6, 5, 7, 1, 3 };
		a = quickSort(a);
		for (int b : a) {
			System.out.print(b + " ");
		}
	}
}
