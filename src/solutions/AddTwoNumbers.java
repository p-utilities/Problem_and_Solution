package solutions;

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
		l1 = addTwoNumbers(new ListNode(1), new ListNode(9, new ListNode(9)));
		while (l1 != null) {
			System.out.println(l1.getVal());
			l1 = l1.getNextNode();
		}
	}
}