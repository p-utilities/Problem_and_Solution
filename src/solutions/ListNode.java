package solutions;

public class ListNode {
	private int val;
	private ListNode next;

	public ListNode() {
	}

	public ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
	
	public int getVal() {
		return val;
	}
	
	public void setVal(int val) {
		this.val = val;
	}
	
	public ListNode getNextNode() {
		return next;
	}
	
	public void setNextNode(ListNode next) {
		this.next = next;
	}
}