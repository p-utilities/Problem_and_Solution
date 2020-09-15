package test;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import solutions.ListNode;

class AddTwoNumbersTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	public static ListNode createNumber(int... a) {
		ListNode firstNode = null;
		ListNode currentNode = null;
		for (int i : a) {
			if (firstNode == null) {
				currentNode = new ListNode(i);
				firstNode = currentNode;
			} else {
				currentNode.setNextNode(new ListNode(i));
				currentNode = currentNode.getNextNode();
			}
		}

		return firstNode;
	}
}
