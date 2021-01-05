package dayTwo.dataStructures.sortAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class HeapSortGeneric {

	private HeapSortGeneric() {
	}

	public static <T extends Comparable<T>> void sort(List<T> list) {
		int size = list.size();
		for (int i = size / 2 - 1; i >= 0; i--) {
			heapify(list, i, size);
		}

		for (int i = size - 1; i >= 0; i--) {
			replace(list, i, 0);
			heapify(list, 0, i);
		}
	}

	private static <T extends Comparable<T>> void heapify(List<T> list, int root, int size) {
		int largest = root;
		int leftLeafIndex = root * 2 + 1;
		int rightLeafIndex = root * 2 + 2;

		if (leftLeafIndex < size && list.get(largest).compareTo(list.get(leftLeafIndex)) <= 0) {
			largest = leftLeafIndex;
		}

		if (rightLeafIndex < size && list.get(largest).compareTo(list.get(rightLeafIndex)) <= 0) {
			largest = rightLeafIndex;
		}

		if (largest != root) {
			replace(list, largest, root);

			heapify(list, largest, size);
		}
	}

	public static <T extends Comparable<T>> void replace(List<T> list, int indexOne, int indexTwo) {
		T temp = list.get(indexOne);
		list.set(indexOne, list.get(indexTwo));
		list.set(indexTwo, temp);
	}

	public static void main(String[] args) {
		ArrayList<MyClass> numbers = new ArrayList<MyClass>();
		numbers.add(new MyClass());
		numbers.add(new MyClass());
		numbers.add(new MyClass());
		numbers.add(new MyClass());
		numbers.add(new MyClass());
		numbers.add(new MyClass());
		numbers.add(new MyClass());
		numbers.add(new MyClass());
		numbers.add(new MyClass());
		numbers.add(new MyClass());

		sort(numbers);
		for (MyClass number : numbers) {
			System.out.println(number);
		}
	}
}

class MyClass implements Comparable<MyClass> {
	private int randomNumber;

	public MyClass() {
		randomNumber = (int) (Math.random() * 100);
	}

	public int compareTo(MyClass o) {
		if (randomNumber > o.randomNumber)
			return 1;
		else if (randomNumber < o.randomNumber)
			return -1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return "" + randomNumber;
	}

}
