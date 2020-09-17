package solutions;

/**
 * <b>Problem :</b> Merge two sorted linked lists and return it as a new sorted
 * list. The new list should be made by splicing together the nodes of the first
 * two lists.
 * <p>
 * <b>Example</b>
 * <p>
 * Input: [1->2->4], [1->3->4]
 * <p>
 * Output: [1->1->2->3->4->4]
 * <p>
 * <b>Solution : </b> Solution is same as for problem MarginKLists.
 * <p>
 * <b>Time complexity : </b> O(m+n) 
 * <p>
 * <b>Space complexity : </b> O(1)
 *
 */
public class MargingLists {
	public static ListNode margeTwoLists(ListNode l1, ListNode l2) {
		ListNode firstNode;
		ListNode currentNode;
		if (l1 == null || l2 == null)
			if (l1 != null)
				return l1;
			else if (l2 != null)
				return l2;
			else
				return null;

		if (l1.getVal() <= l2.getVal()) {
			firstNode = l1;
			l1 = l1.getNextNode();
		} else {
			firstNode = l2;
			l2 = l2.getNextNode();
		}

		currentNode = firstNode;

		while (true) {
			if (l1 != null && l2 != null) {
				if (l1.getVal() <= l2.getVal()) {
					currentNode.setNextNode(l1);
					currentNode = l1;
					l1 = l1.getNextNode();
				} else {
					currentNode.setNextNode(l2);
					currentNode = l2;
					l2 = l2.getNextNode();
				}
			} else {
				System.out.println("ssss");
				break;
			}
		}

		if (l1 != null) {
			System.out.println("dasdas");
			currentNode.setNextNode(l1);
		}

		if (l2 != null) {
			System.out.println("dasdasd");
			currentNode.setNextNode(l2);
		}

		return firstNode;
	}

	public static void main(String[] args) {
//		ListNode node = margeTwoLists(new ListNode(1, new ListNode(5, new ListNode(6))),
//				new ListNode(2, new ListNode(4, new ListNode(6, new ListNode(8)))));
		// ListNode node = margeTwoLists(new ListNode(2), new ListNode(1));
		ListNode node = margeTwoLists(null, null);
		while (node != null) {
			System.out.println(node.getVal());
			node = node.getNextNode();
		}
	}
}
