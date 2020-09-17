package solutions;

import java.util.Stack;

/**
 * <b>Problem :</b> Given a string s containing just the characters '(', ')',
 * '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * <p>
 * Open brackets must be closed in the correct order.
 * <p>
 * <b>Example</b>
 * <p>
 * Input: "()[]{}"
 * <p>
 * Output: true
 * <p>
 * <b>Explanation : </b> For every open, there is one closed parentheses.
 * Parentheses are closed in mathematical order.
 * <p>
 * <b>Solution : </b> Solution is implemented using stack. For every open
 * parentheses, number from 0 to 2 is added to the stack. When closed
 * parentheses is encountered, if number on the top of the stack is not index of
 * closed parentheses in string, return value is false, if it is, number is
 * poped from the stack and iteration can continue. If there is open parentheses
 * and no closed parentheses, return value is false again. Finally, if stack is
 * empty after all iterations, return value is true, and if not, return value is
 * false.
 * <p>
 * <b>Time complexity : </b> O(n)
 * <p>
 * <b>Space complexity : </b> O(1)
 *
 */
public class ValidParentheses {
	public static boolean isValid(String s) {
		var stack = new Stack<Integer>();
		String openPar = "([{";
		String closedPar = ")]}";

		for (int i = 0; i < s.length(); i++) {
			if (openPar.indexOf(s.charAt(i)) != -1) {
				stack.push(openPar.indexOf(s.charAt(i)));
			} else if (closedPar.indexOf(s.charAt(i)) != -1) {
				if (stack.isEmpty() || stack.peek() != closedPar.indexOf(s.charAt(i))) {
					return false;
				}
				stack.pop();
			}
		}

		if (stack.isEmpty())
			return true;
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isValid("(([]))"));
	}

}
