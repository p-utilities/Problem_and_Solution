package solutions;

public class AddStrings {
	public static String addStrings(String num1, String num2) {
		var result = new StringBuilder();
		int counterNum1 = num1.length() - 1, counterNum2 = num2.length() - 1;
		int remainder = 0;
		while (counterNum1 >= 0 && counterNum2 >= 0) {
			System.out.println(counterNum1);
			System.out.println(counterNum2);
			remainder = appendFirstReturnRemaind(result, detectInt(num1.charAt(counterNum1)),
					detectInt(num2.charAt(counterNum2)), remainder);
			counterNum1--;
			counterNum2--;
		}

		while (counterNum1 >= 0) {
			remainder = appendFirstReturnRemaind(result, detectInt(num1.charAt(counterNum1)), remainder);
			counterNum1--;
		}

		while (counterNum2 >= 0) {
			remainder = appendFirstReturnRemaind(result, detectInt(num2.charAt(counterNum2)), remainder);
			counterNum2--;
		}

		while (remainder > 0) {
			remainder = appendFirstReturnRemaind(result, remainder);
		}

		if (result.length() == 0)
			result.append(0);
		result.reverse();
		return result.toString();
	}

	public static int appendFirstReturnRemaind(StringBuilder builder, int... nums) {
		int result = 0;
		for (int s : nums) {
			result += s;
		}
		builder.append(result % 10);
		return result / 10;
	}

	public static int detectInt(char c) {
		if (c - '0' > 9 || c - '0' < 0)
			throw new NumberFormatException();
		return c - '0';
	}

	public static void main(String[] args) {
		System.out.println(addStrings("6", "501"));
	}
}
