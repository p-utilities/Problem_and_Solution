package solutions;

/**
 * <b>Problem :</b> You are given two non-empty linked lists representing two
 * non-negative integers. The digits are stored in reverse order and each of
 * their nodes contain a single digit. Add the two numbers and return it as a
 * linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * <p>
 * <b>Example</b>
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * <p>
 * Output: 7 -> 0 -> 8
 * <p>
 * <b>Explanation : </b> 342 + 465 = 807
 * <p>
 * <b>Solution : </b> since the numbers are arranged backwards I have just added
 * the values in linked lists from start to finish. If any added value exceeds
 * ten, the value was decremented by 10, remaining is added in the result and
 * finally one is added to the next addition. If there is no addition left, new
 * node is added with value 1.
 * 
 * <p>
 * <b>Time complexity : </b> Every node in both lists is visited in worst case
 * so time complexity is : O(n+m) -> n = size of first linked list, m = size of
 * second linked list.
 * <p>
 * <b>Space complexity : </b> Since there is no recursion and the result is
 * placed in one of the existing lists, the space complexity in this case is
 * O(1) or constant.
 *
 */
public class AddTwoNumbers {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null)
			if (l2 != null)
				return l2;
			else
				return new ListNode();
		if (l2 == null)
			return l1;

		ListNode firstNode = l1;

		int remaining = 0;
		while (true) {
			if (l1 == null && l2 == null)
				break;

			int result = remaining;

			if (l2 != null) {
				result += l2.getVal();
				l2 = l2.getNextNode();
			}

			if (l1 != null)
				result += l1.getVal();

			remaining = 0;
			if (result > 9) {
				remaining++;
				result -= 10;
			}
			l1.setVal(result);

			if (l1.getNextNode() == null)
				if (l2 != null)
					l1.setNextNode(new ListNode());
				else if (remaining > 0) {
					l1.setNextNode(new ListNode(remaining));
					remaining = 0;
				}

			l1 = l1.getNextNode();
		}
		
		

		return firstNode;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode();
		l1 = addTwoNumbers(new ListNode(1, new ListNode(0)), new ListNode(2, new ListNode(0)));
		while (l1 != null) {
			System.out.println(l1.getVal());
			l1 = l1.getNextNode();
		}
	}
}