package dayOne.dataStructures.searchAlgorithms;

public class RecursiveBinarySearch {
	private static int resultIndex = -1;
	private static int[] array;
	private static int item;

	private RecursiveBinarySearch() {

	}

	public static int searchInt(int[] array, int item) {
		RecursiveBinarySearch.array = array;
		RecursiveBinarySearch.item = item;
		search(-1, array.length / 2, array.length);

		return resultIndex;
	}

	private static void search(int startIndex, int middleIndex, int endIndex) {
		if(endIndex - startIndex > 1) {
			if(array[middleIndex] == item) {
				resultIndex = middleIndex;
			} else if(array[middleIndex] > item) {
				endIndex = middleIndex;
				middleIndex = startIndex + (endIndex - startIndex) / 2;
				search(startIndex, middleIndex, endIndex);
			} else {
				startIndex = middleIndex;
				middleIndex = startIndex + (endIndex - startIndex) / 2;
				search(startIndex, middleIndex, endIndex);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 6, 7, 9, 10, 11 };
		System.out.println(searchInt(a, 11));
	}
	
}
