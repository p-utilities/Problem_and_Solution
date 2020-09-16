package solutions;

/**
 * <b>Problem :</b> Implement atoi which converts a string to an integer.The
 * function first discards as many whitespace characters as necessary until the
 * first non-whitespace character is found. Then, starting from this character,
 * takes an optional initial plus or minus sign followed by as many numerical
 * digits as possible, and interprets them as a numerical value. The string can
 * contain additional characters after those that form the integral number,
 * which are ignored and have no effect on the behavior of this function. If the
 * first sequence of non-whitespace characters in str is not a valid integral
 * number, or if no such sequence exists because either str is empty or it
 * contains only whitespace characters, no conversion is performed. If no valid
 * conversion could be performed, a zero value is returned.
 * <p>
 * <b> Example : </b>
 * <p>
 * Input: "4193 with words"
 * <p>
 * Output: 4193
 * <p>
 * <b>Explanation : </b>Conversion stops at digit '3' as the next character is
 * not a numerical digit.
 * <p>
 * <b>Solution : </b>First, I find start index by looping over string. The start
 * index is index of first character witch is not empty space. After that there
 * is a check for possible minus or plus character. If there is either
 * character, it is saved in variable plusOrMinus for later use and start index
 * is incremented. Next is searching for end index. Algorithm loops over string
 * from starting point to the end, and if there is any character besides number
 * before any number, iteration stops and return result is 0. If there are
 * numbers, end index is incremented for each number until it reaches some other
 * character besides number. The return value will be integer parsed from string
 * that contains character plusOrMinus and substring of starting string starting
 * from start index to end index. If resulting string is over, or below MAX or
 * MIN integer, then MAX or MIN integer is returned respectively.
 * <p>
 * <b>Time complexity : </b> in worst case, time complexity for this solution
 * would be O(n)
 * <p>
 * <b>Space complexity : </b> space complexity for this solution is O(1) or
 * constant
 * 
 */
public class AtoiSolution {
	public static int myAtoi(String str) {
		char plusOrMinus = '+';
		int start, end;
		if (str.isEmpty() || str.isBlank())
			return 0;
		start = findStartIndex(str);
		if (str.charAt(start) == '-' || str.charAt(start) == '+') {
			if (str.charAt(start) == '-')
				plusOrMinus = '-';
			start++;
		}

		end = findEndIndex(str, start);

		if (start == end)
			return 0;

		if (start > end)
			end = str.length();

		try {
			return Integer.parseInt(plusOrMinus + str.substring(start, end));
		} catch (NumberFormatException e) {
			if (start > 0)
				start--;
			return str.charAt(start) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
		}
	}

	private static int findStartIndex(String str) {
		int start = 0;
		while (str.charAt(start) == ' ')
			start++;
		return start;
	}

	private static int findEndIndex(String str, int startPoint) {
		String numbers = "0123456789";
		for (int i = startPoint; i < str.length(); i++) {
			if (i == startPoint && !numbers.contains(str.charAt(i) + "")) {
				return startPoint;
			}
			if (!numbers.contains(str.charAt(i) + ""))
				return i;
		}

		return str.length();
	}

	public static void main(String[] args) {
		System.out.println(myAtoi("-91283472332"));
	}
}
