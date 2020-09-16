package solutions;

/**
 * <b>Problem :</b> Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * <b>Example</b>
 * <p>
 * Input: 123
 * <p>
 * Output: 321
 * <p>
 * <b>Solution : </b> The solution is made by using strings and reversing the
 * string.
 * <p>
 * <b>Time complexity : </b> O(n)
 * <p>
 * <b>Space complexity : </b> O(n)
 *
 */
public class ReverseInteger {
	public static int reverse(int x) {
		boolean isPositive = true;
		int num = x;
		if (x < 0) {
			isPositive = false;
			num = -x;
		}

		String helper = num + "";
		String stringResult = "";
		for (int i = helper.length() - 1; i >= 0; i--) {
			stringResult += helper.charAt(i);
		}
		int result = 0;

		try {
			result = Integer.parseInt(stringResult);
		} catch (NumberFormatException e) {
		}

		if (!isPositive)
			result = -result;

		return result;
	}

	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
	}
}
