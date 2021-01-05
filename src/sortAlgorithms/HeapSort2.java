package dayTwo.dataStructures.sortAlgorithms;

public class HeapSort2 {
	
	private static boolean ascending = true;
	private HeapSort2() {

	}

	public static void heapSort(int[] array, boolean ascendingSort) {
		ascending = ascendingSort;
		int lastPerent = array.length / 2 - 1;
		for (int i = lastPerent; i >= 0; i--) {
			heapify(array, array.length, i);
		}

		for (int i = array.length - 1; i >= 0; i--) {
			swap(array, i, 0);
			heapify(array, i, 0);
		}
	}

	private static void heapify(int[] array, int size, int root) {
		int leftLeaf = root * 2 + 1;
		int rightLeaf = root * 2 + 2;
		int largest = root;

		if(ascending) {
			largest = maxLeaf(array, leftLeaf, rightLeaf, largest, size);
		} else {
			largest = minLeaf(array, leftLeaf, rightLeaf, largest, size);
		}
		

		if (largest != root) {
			swap(array, largest, root);
			heapify(array, size, largest);
		}
	}
	
	private static int maxLeaf(int[] array, int leftLeaf, int rightLeaf, int root, int size) {
		if (leftLeaf < size && array[leftLeaf] > array[root]) {
			root = leftLeaf;
		}
		if (rightLeaf < size && array[rightLeaf] > array[root]) {
			root = rightLeaf;
		}
		
		return root;
	}
	
	private static int minLeaf(int[] array, int leftLeaf, int rightLeaf, int root, int size) {
		if (leftLeaf < size && array[leftLeaf] < array[root]) {
			root = leftLeaf;
		}
		if (rightLeaf < size && array[rightLeaf] < array[root]) {
			root = rightLeaf;
		}
		
		return root;
	}

	private static void swap(int[] array, int indexOne, int indexTwo) {
		int temp = array[indexOne];
		array[indexOne] = array[indexTwo];
		array[indexTwo] = temp;
	}

	public static void main(String[] args) {
		int[] a = new int[] { 2, 3, 6, 5, 7, 1 };
		heapSort(a, false);
		for (int b : a) {
			System.out.print(b + " ");
		}
	}
}
