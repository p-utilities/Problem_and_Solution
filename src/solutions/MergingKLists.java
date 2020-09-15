package solutions;

public class MergingKLists {
	public static ListNode mergeKLists(ListNode[] lists) {
		ListNode firstNode;
		ListNode currentNode;
		int smallest = -1;

		if (lists == null || lists.length == 0)
			return null;

		for (int i = 0; i < lists.length; i++) {
            if(lists[i] != null) {
			    if(smallest == -1) {
    				smallest = i;
	    			continue;
		    	}
			    if(lists[i].getVal() < lists[smallest].getVal())
				    smallest = i;
            }
        }
		
		if(smallest == -1)
			return null;

		firstNode = currentNode = lists[smallest];
		lists[smallest] = lists[smallest].getNextNode();

		while (true) {
			smallest = -1;
			for (int i = 0; i < lists.length; i++) {
				if (lists[i] != null) {
					if(smallest == -1) {
						smallest = i;
						continue;
					}
					if(lists[i].getVal() < lists[smallest].getVal())
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
		//ListNode first = mergeKLists(new ListNode[] { new ListNode() });
		while (first != null) {
			System.out.println(first.getVal());
			first = first.getNextNode();
		}
	}
}
