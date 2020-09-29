package solutions;

public class PalindromeLinkedList {
	public static boolean isPalindrome(ListNode head) {
		if (head == null || head.getNextNode() == null)
			return true;

		var headNode = head;
		var slow = head;
		var fast = head;

		while (fast != null && fast.getNextNode() != null) {
			slow = slow.getNextNode();
			fast = fast.getNextNode().getNextNode();
		}

		ListNode middleNode = null;

		if (fast == null) {
			slow = reverseNodes(slow);
		}
		else if (fast.getNextNode() == null)
			slow = reverseNodes(slow.getNextNode());

		while (headNode != null || slow != null) {
			System.out.println(headNode.getVal() + " head");
			System.out.println(slow.getVal() + " from behind");
			if (headNode.getVal() != slow.getVal())
				return false;
			headNode = headNode.getNextNode();
			slow = slow.getNextNode();
			if (middleNode != null || middleNode == slow)
				break;
		}

		return true;
	}

	public static ListNode reverseNodes(ListNode startNode) {
		if (startNode.getNextNode() == null)
			return startNode;
		ListNode currentNode = startNode.getNextNode();
		ListNode previousNode = startNode;

		while (currentNode != null) {
			ListNode helper = currentNode.getNextNode();
			currentNode.setNextNode(previousNode);
			previousNode = currentNode;
			currentNode = helper;
		}

		startNode.setNextNode(null);
		return previousNode;
	}

	public static void main(String[] args) {
		ListNode s = new ListNode(1, new ListNode(1));
		System.out.println(isPalindrome(s));
	}
}
