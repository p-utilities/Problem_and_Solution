package dayOne.dataStructures.searchAlgorithms;

public class BinarySearch {

	private BinarySearch() {

	}

	public static int searchInt(int[] array, int item) {
		if (array == null) {
			return -1;
		}

		if (array.length == 1) {
			if (array[0] == item)
				return 0;
			else
				return -1;
		}

		int middleIndex = array.length / 2;
		int startIndex = -1;
		int endIndex = array.length;

		while (endIndex - startIndex > 1) {
			if (array[middleIndex] == item) {
				return middleIndex;
			} else if (array[middleIndex] > item) {
				endIndex = middleIndex;
				middleIndex = startIndex + (endIndex - startIndex) / 2;
			} else {
				startIndex = middleIndex;
				middleIndex = startIndex + (endIndex - startIndex) / 2;
			}
			System.out.println(startIndex + " startIndex");
			System.out.println(middleIndex + " middleIndex");
			System.out.println(endIndex + " endIndex");
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 6, 7, 9, 10, 11 };
		System.out.println(searchInt(a, 1));
	}
}
