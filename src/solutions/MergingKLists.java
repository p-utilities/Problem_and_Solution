package solutions;

/**
 * <b>Problem :</b> You are given an array of k linked-lists lists, each
 * linked-list is sorted in ascending order. Merge all the linked-lists into one
 * sorted linked-list and return it.
 * <p>
 * <b>Example</b>
 * <p>
 * Input: lists = [[1,4,5],[1,3,4],[2,6]]
 * <p>
 * Output: [1,1,2,3,4,4,5,6]
 * <p>
 * <b>Explanation : </b> pretty clear
 * <p>
 * <b>Solution : </b> First, smallest, starting node is found. After that in
 * every iteration, smallest node in that iteration is linked with previous
 * node.
 * <p>
 * <b>Time complexity : </b> O(n*m) -> n = number of lists, m = number of
 * elements in those lists
 * 
 * <p>
 * <b>Space complexity : </b> O(1)
 *
 */
public class MergingKLists {
	public static ListNode mergeKLists(ListNode[] lists) {
		ListNode firstNode;
		ListNode currentNode;
		int smallest = -1;

		if (lists == null || lists.length == 0)
			return null;

		// finding first node(the smallest node)
		for (int i = 0; i < lists.length; i++) {
			if (lists[i] != null) {
				if (smallest == -1) {
					smallest = i;
					continue;
				}
				if (lists[i].getVal() < lists[smallest].getVal())
					smallest = i;
			}
		}

		if (smallest == -1)
			return null;

		firstNode = currentNode = lists[smallest];
		lists[smallest] = lists[smallest].getNextNode();

		// adding every next smallest node to the previous node
		while (true) {
			smallest = -1;
			for (int i = 0; i < lists.length; i++) {
				if (lists[i] != null) {
					if (smallest == -1) {
						smallest = i;
						continue;
					}
					if (lists[i].getVal() < lists[smallest].getVal())
						smallest = i;
				}
			}
			if (smallest == -1)
				break;
			currentNode.setNextNode(lists[smallest]);
			lists[smallest] = lists[smallest].getNextNode();
			currentNode = currentNode.getNextNode();
		}

		return firstNode;
	}

	public static void main(String[] args) {
		ListNode first = mergeKLists(new ListNode[] { new ListNode(1, new ListNode(4, new ListNode(5))),
				new ListNode(1, new ListNode(3, new ListNode(4))), new ListNode(2, new ListNode(6)) });
		// ListNode first = mergeKLists(new ListNode[] { new ListNode() });
		while (first != null) {
			System.out.println(first.getVal());
			first = first.getNextNode();
		}
	}
}
