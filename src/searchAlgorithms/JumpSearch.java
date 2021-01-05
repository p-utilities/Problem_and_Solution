package dayOne.dataStructures.searchAlgorithms;

public class JumpSearch {
	private static int blockSize = 3;
	private static int result = -1;

	private JumpSearch() {

	}

	//time complexity = O(n/3) => O(n)
	public static int searchInt(int[] array, int item) {
		for (int i = 0; i <= array.length - 1; i += blockSize) {
			if (array.length - blockSize > i)
				blockSearch(array, item, i);
			else
				endOfArraySearch(array, item, i);
		}
		return result;
	}

	//time complexity = O(1) 
	private static void endOfArraySearch(int[] array, int item, int startIndex) {
		for (int i = startIndex; i <= array.length - 1; i++) {
			if (array[i] == item)
				result = i;
		}
	}

	//time complexity = O(1)
	private static void blockSearch(int[] array, int item, int startIndex) {
		for (int i = startIndex; i <= startIndex + blockSize - 1; i++) {
			if (array[i] == item)
				result = i;
		}
	}
	
	public static void main(String[] args) {
		int[] a = null;
		System.out.println(searchInt(a, 1));
	}
}
