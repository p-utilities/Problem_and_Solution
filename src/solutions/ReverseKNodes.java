package solutions;

/**
 * <b>Problem :</b> Given a linked list, reverse the nodes of a linked list k at
 * a time and return its modified list.
 * <p>
 * k is a positive integer and is less than or equal to the length of the linked
 * list. If the number of nodes is not a multiple of k then left-out nodes in
 * the end should remain as it is.
 * <p>
 * <b>Example</b>
 * <p>
 * Input:1->2->3->4->5
 * <p>
 * Output: 
 * <p> For k = 2, result = 2->1->4->3->5
 * <p> For k = 3, result = 3->2->1->4->5
 *
 */

public class ReverseKNodes {
	static class ListNode {
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

	public static ListNode reverseKNodes(ListNode head, int k) {
		ListNode first = head;
		ListNode last = head;
		ListNode[] kNodes = new ListNode[k];
		kNodes[0] = head;

		int counter = 1;
		for (; counter < k; counter++) {
			if (last == null || last.next == null)
				break;
			kNodes[counter] = last.next;
			last = last.next;
		}

		if (counter < k)
			return first;

		reverseNodes(kNodes, last.next);

		if (first.next != null)
			first.next = reverseKNodes(first.next, k);

		return last;
	}

	private static void reverseNodes(ListNode[] nodes, ListNode next) {
		nodes[0].next = next;
		for (int i = 1; i < nodes.length; i++) {
			nodes[i].next = nodes[i - 1];
		}
	}

	public static void main(String[] args) {
		ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
		node = reverseKNodes(node, 2);
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}

}
