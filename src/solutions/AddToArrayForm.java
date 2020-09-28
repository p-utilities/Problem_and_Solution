package solutions;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayForm {
	public static List<Integer> addToArrayForm(int[] array, int k) {
		int remainder = 0;
		var result = new ArrayList<Integer>();
		for (int i = array.length - 1; i >= 0; i--) {
			int num = k % 10 + array[i] + remainder;
			k /= 10;
			remainder = num / 10;
			result.add(num % 10);
		}

		remainder += k;
		while (remainder > 0) {
			result.add(remainder % 10);
			remainder /= 10;
		}

		int first = 0;
		int last = result.size() - 1;
		while (first < last) {
			int helper = result.get(first);
			result.set(first, result.get(last));
			result.set(last, helper);
			first++;
			last--;
		}

		return result;
	}

	public static void main(String[] args) {
		var s = addToArrayForm(new int[] { 2, 1, 5 }, 806);
		for (int p : s)
			System.out.print(p + " ");
	}

}
