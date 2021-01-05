package dayTwo.dataStructures.sortAlgorithms;

public class MargeSort {
	private static int[] result;

	private MargeSort() {

	}

	public static int[] margeSort(int[] array) {
		result = array;
		sort(0, array.length - 1);
		return result;
	}

	private static void sort(int startIndex, int endIndex) {
		int size = endIndex - startIndex;
		if (size > 0) {
			int middleIndex = startIndex + size / 2;
			sort(startIndex, middleIndex);
			sort(middleIndex + 1, endIndex);
			marge(startIndex, middleIndex, endIndex);
		}
	}

	private static void marge(int startIndex, int middleIndex, int endIndex) {
		int i = startIndex;
		int j = middleIndex + 1;
		int k = 0;
		int[] temp = new int[result.length];

		while (i <= middleIndex && j <= endIndex) {
			if (result[i] <= result[j]) {
				temp[k++] = result[i++];
			} else {
				temp[k++] = result[j++];
			}
		}

		while (i <= middleIndex) {
			temp[k++] = result[i++];
		}

		while (j <= endIndex) {
			temp[k++] = result[j++];
		}

		for (i = endIndex; i >= startIndex; i--) {
			result[i] = temp[--k];
		}

	}

	public static void main(String[] args) {
		int[] a = new int[] { 2, 3, 6, 5, 7, 1 };
		a = margeSort(a);
		for (int b : a) {
			System.out.print(b + " ");
		}
	}
}
