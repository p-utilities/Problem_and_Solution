package dayTwo.dataStructures.sortAlgorithms;

public class HeapSort {

	private HeapSort() {

	}

	public static int[] heapSort(int[] array) {
		int size = array.length - 1;
		for (int i = size / 2; i >= 0; i--) {
			heapify(array, i, size + 1);
		}

		for (int i = size; i >= 0; i--) {
			swap(array, 0, i);
			heapify(array, 0, i);
		}

		return array;
	}

	private static void heapify(int[] array, int root, int size) {
		int largest = root;
		int leftLeafIndex = root * 2 + 1;
		int rightLeafIndex = root * 2 + 2;

		if (leftLeafIndex < size && array[largest] < array[leftLeafIndex]) {
			largest = leftLeafIndex;
		}

		if (rightLeafIndex < size && array[largest] < array[rightLeafIndex]) {
			largest = rightLeafIndex;
		}

		if (largest != root) {
			swap(array, root, largest);

			heapify(array, largest, size);
		}

	}

	private static void swap(int[] array, int indexOne, int indexTwo) {
		int temp = array[indexOne];
		array[indexOne] = array[indexTwo];
		array[indexTwo] = temp;
	}

	public static void main(String[] args) {
		int[] a = new int[] { 2, 3, 6, 5, 7, 1 };
		heapSort(a);
		for (int b : a) {
			System.out.print(b + " ");
		}
	}

}
