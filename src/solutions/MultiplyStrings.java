package solutions;

import java.util.ArrayList;

public class MultiplyStrings {
	public static String multiply2(String num1, String num2) {
		var result = new StringBuilder();
		int remaining = 0;
		var calculus = new ArrayList<Integer>();
		int start = 0;
		for (int i = num1.length() - 1; i >= 0; i--) {
			int counter = start++;
			for (int j = num2.length() - 1; j >= 0; j--) {
				int helper = detectInt(num1.charAt(i)) * detectInt(num2.charAt(j)) + remaining;
				if (calculus.size() > counter) {
					helper += calculus.get(counter);
				}

				remaining = helper / 10;

				if (calculus.size() > counter) {
					calculus.set(counter, helper % 10);
				} else {
					calculus.add(helper % 10);
				}
				counter++;
			}
			if (remaining > 0) {
				while (remaining != 0) {
					if (calculus.size() > counter) {
						remaining += calculus.get(counter);
						calculus.set(counter, remaining % 10);
						counter++;
					} else {
						calculus.add(remaining % 10);
					}
					remaining /= 10;
				}
			}
		}

		for (int i = calculus.size() - 1; i >= 0; i--) {
			if (calculus.get(i) == 0)
				if (result.length() != 0) {
					result.append(calculus.get(i));
					continue;
				} else
					continue;
			result.append(calculus.get(i));
		}

		if (result.length() == 0)
			result.append(0);

		return result.toString();
	}

	public static int detectInt(char c) {
		if (c - '0' > 9 || c - '0' < 0)
			throw new NumberFormatException();
		return c - '0';
	}

	public static void main(String[] args) {
		System.out.println(multiply2("123456789546" , "54692225453"));
		System.out.println(detectInt('1'));
		System.out.println(detectInt('2'));
		System.out.println(detectInt('3'));
	}
}
