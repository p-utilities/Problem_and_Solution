package dayOne.dataStructures.searchAlgorithms;

public class RecursiveJumpSearch {
	private static int result = -1;
	private static int blockSize = 3;

	private RecursiveJumpSearch() {

	}

	public static int searchInt(int[] array, int item) {
		if (array.length <= 3)
			endOfArraySearch(array, item, 0);
		else
			search(array, item, 0);

		return result;
	}

	private static void search(int[] array, int item, int startIndex) {
		if (array[startIndex + blockSize] == item)
			result = startIndex + blockSize;
		else if (array[startIndex + blockSize] < item) {
			if (array.length - 1 > startIndex + blockSize * 2)
				search(array, item, startIndex + blockSize);
			else
				endOfArraySearch(array, item, startIndex + blockSize);
		} else
			searchBlock(array, item, startIndex);
	}

	private static void searchBlock(int[] array, int item, int startIndex) {
		for (int i = startIndex; i <= startIndex + blockSize - 1; i++)
			if (array[i] == item)
				result = item;
	}

	private static void endOfArraySearch(int[] array, int item, int startIndex) {
		for (int i = startIndex; i <= array.length - 1; i++)
			if (array[i] == item)
				result = i;
	}

	public static void main(String[] args) {
		int[] a = null;
		System.out.println(searchInt(a, 4));
	}
}
