package dayTwo.dataStructures.sortAlgorithms;

public class MargeSort2 {
	private static boolean ascending = true;

	private MargeSort2() {

	}

	public static void margeSort(int[] array, boolean ascendingSort) {
		ascending = ascendingSort;

		sort(array, 0, array.length - 1);
	}

	private static void sort(int[] array, int startIndex, int endIndex) {
		int size = endIndex - startIndex;
		if (size > 0) {
			int middleIndex = startIndex + size / 2;
			sort(array, startIndex, middleIndex);
			sort(array, middleIndex + 1, endIndex);
			marge(array, startIndex, middleIndex, endIndex);
		}
	}

	private static void marge(int[] array, int startIndex, int middleIndex, int endIndex) {
		int[] temp = new int[array.length];
		int i = startIndex;
		int j = middleIndex + 1;
		int k = 0;

		while (i <= middleIndex && j <= endIndex) {
			if ((array[i] <= array[j] || array[i] >= array[j]) && ascending) {
				temp[k++] = array[i++];
			} else if (array[i] <= array[j] && !ascending) {
				temp[k++] = array[j++];
			} else {
				temp[k++] = array[i++];
			}
		}

		while (i <= middleIndex) {
			temp[k++] = array[i++];
		}

		while (j <= endIndex) {
			temp[k++] = array[j++];
		}

		for (i = endIndex; i >= startIndex; i--) {
			array[i] = temp[--k];
		}
	}

	public static void main(String[] args) {
		int[] a = new int[] { 2, 3, 6, 5, 7, 1 };
		margeSort(a, false);
		for (int b : a) {
			System.out.print(b + " ");
		}
	}
}
