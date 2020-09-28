package solutions;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber {

	public static boolean isPalindrome(int x) {
		if(x < 0)
			return false;
		
		var stack = toStack(x);

		int first = 0;
		int last = stack.size() - 1;

		while (first < last) {
			if (stack.get(first) != stack.get(last))
				return false;
			first++;
			last--;
		}

		return true;
	}

	public static List<Integer> toStack(int x) {
		var stack = new ArrayList<Integer>();
		while (x > 0) {
			stack.add(x % 10);
			x /= 10;
		}

		return stack;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(121));

	}

}
