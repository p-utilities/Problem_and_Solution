class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

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
				result += l2.val;
				l2 = l2.next;
			}

			if (l1 != null)
				result += l1.val;

			remaining = 0;
			if (result > 9) {
				remaining++;
				result -= 10;
			}
			l1.val = result;

			if (l1.next == null)
				if (l2 != null)
					l1.next = new ListNode();
				else if (remaining > 0) {
					l1.next = new ListNode(remaining);
					remaining = 0;
				}

			l1 = l1.next;
		}

		return firstNode;
	}

	public static void main(String[] args) {
//		ListNode l1 = new ListNode();
//		l1 = addTwoNumbers(new ListNode(1), new ListNode(9, new ListNode(9)));
//		while (l1 != null) {
//			System.out.println(l1.val);
//			l1 = l1.next;
//		}
		
		
		String s = "s";
		Integer.parseInt(s);
	}
}