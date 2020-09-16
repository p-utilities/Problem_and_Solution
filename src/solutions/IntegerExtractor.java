package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>Problem :</b> Given a string containing none, one or many numbers, find
 * all numbers in that string. Numbers is non-negative and can be divided by any
 * character.
 * <p>
 * <b>Example</b>
 * <p>
 * Input: "2222a2a222a2a22a22"
 * <p>
 * Output: 2222, 2, 222, 2, 22, 22
 * <p>
 * <b>Explanation : </b> simple problem, no point to explain
 * <p>
 * <b>Solution : </b> using variable startPoint which is initially set to -1 I
 * keep track if I encountered the number in the string or not. If number is not
 * encountered, then that startPoint is set to have value of current iteration.
 * If startPoint is different than -1 and current character is different then
 * numbers, substring from start point to current point is parsed to integer and
 * added in array list, start point is set to -1 every time value is added to
 * the list.
 * <p>
 * <b>Time complexity : </b> O(n)
 * <p>
 * <b>Space complexity : </b> since there could be n characters in string and
 * every other is number and for every number, element in array list will be
 * created. That means that space complexity in worse case is O(n/2) and if we
 * take out the constant 1/2, space complexity is O(n).
 *
 */
public class IntegerExtractor {
	public static List<Integer> extract(String str) {
		var integers = new ArrayList<Integer>();
		String numbers = "0123456789";
		String minus = "-";
		int startPoint = -1;
		for (int i = 0; i < str.length(); i++) {
			if (startPoint == -1) {
				if (minus.contains(str.charAt(i) + ""))
					startPoint = i;
				else if (numbers.contains(str.charAt(i) + "")) {
					startPoint = i;
				}
			} else {
				if (i == str.length() - 1) {
					integers.add(Integer.parseInt(str.subSequence(startPoint, i + 1) + ""));
				}
				if (!numbers.contains(str.charAt(i) + "")) {
					try {
						integers.add(Integer.parseInt(str.subSequence(startPoint, i) + ""));
					} catch (NumberFormatException e) {
						continue;
					}
					startPoint = -1;
				}
			}
		}
		return integers;
	}

	public static void main(String[] args) {
		var integers = extract("2222a2a222a2a22a22");
		integers.forEach(x -> System.out.println(x));
	}
}
