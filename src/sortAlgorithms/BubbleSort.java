package dayOne.dataStructures.sortAlgorithms;

public class BubbleSort {

	private BubbleSort() {

	}

	public static int[] sortDesc(int[] array) {
		boolean isSwaped = false;
		do {
			isSwaped = false;
			for(int i = 0; i<=array.length-2; i++) {
				if(array[i] < array[i+1]) {
					array = swap(array,i, i+1);
					isSwaped = true;
				}
			}
		} while(isSwaped);
		return array;
	}
	
	public static int[] sortAsc(int[] array) {
		boolean isSwaped = false;
		do {
			isSwaped = false;
			for(int i = 0; i<=array.length-2; i++) {
				if(array[i] > array[i+1]) {
					array = swap(array,i, i+1);
					isSwaped = true;
				}
			}
		} while(isSwaped);
		return array;
	}
	
	private static int[] swap(int[] array, int indexOne, int indexTwo) {
		int helper = array[indexOne];
		array[indexOne] = array[indexTwo];
		array[indexTwo] = helper;
		return array;
	}
	
	public static void main(String[] args) {
		int[] a = new int[] {2,5,6,9,4,3,1,8,7};
		
		a = sortDesc(a);
		for(int number: a) {
			System.out.println(number);
		}
	}
}
