package dayOne.dataStructures.sortAlgorithms;

public class SelectionSort {
	private SelectionSort() {
	}

	public static int[] selectionSort(int[] array) {
		for (int i = 0; i <= array.length - 1; i++) {
			int minIndex = indexOfMin(array, i);
			array = swap(array, i, minIndex);
		}

		return array;
	}

	public static int indexOfMin(int[] array, int startIndex) {
		int minValue = array[startIndex];
		int minIndex = startIndex;
		for (int i = startIndex; i <= array.length - 1; i++) {
			if (minValue > array[i]) {
				minIndex = i;
			}
		}

		return minIndex;
	}
	
	private static int[] swap(int[] array, int indexOne, int indexTwo) {
		int helper = array[indexOne];
		array[indexOne] = array[indexTwo];
		array[indexTwo] = helper;
		return array;
	}
	
	public static void main(String[] args) {
		int[] a = new int[] {2,5,6,9,4,3,1,8,7};
		
		a = selectionSort(a);
		for(int number: a) {
			System.out.println(number);
		}
	}
}
