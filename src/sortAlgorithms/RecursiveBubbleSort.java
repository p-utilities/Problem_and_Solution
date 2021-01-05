package dayOne.dataStructures.sortAlgorithms;

public class RecursiveBubbleSort {
	private static int[] result;
	private static boolean flag = true;

	private RecursiveBubbleSort() {
	}

	public static int[] sortAsc(int[] array) {
		result = array;
		ascending();
		return result;
	}

	private static void ascending() {
		flag = true;
		for (int i = 0; i <= result.length - 2; i++) {
			if (result[i] > result[i + 1]) {
				int temp = result[i];
				result[i] = result[i + 1];
				result[i + 1] = temp;
				flag = false;
			}
		}
		if (!flag) {
			ascending();
		}
	}

	public static int[] sortDesc(int[] array) {
		result = array;
		descending();
		return result;
	}
	
	public static void descending() {
		flag = true;
		for (int i = 0; i <= result.length - 2; i++) {
			if (result[i] < result[i + 1]) {
				int temp = result[i];
				result[i] = result[i + 1];
				result[i + 1] = temp;
				flag = false;
			}
		}
		if (!flag) {
			descending();
		}
	}
}
