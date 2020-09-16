package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import solutions.AddTwoNumbers;
import solutions.ListNode;

class AddTwoNumbersTest {

	@Test
	void testForNullAndEmptyValues() {
		assertEquals("0", getStringResult(AddTwoNumbers.addTwoNumbers(createNumber(), createNumber())));
		assertEquals("0", getStringResult(AddTwoNumbers.addTwoNumbers(null, createNumber())));
		assertEquals("0", getStringResult(AddTwoNumbers.addTwoNumbers(createNumber(), null)));
		assertEquals("0", getStringResult(AddTwoNumbers.addTwoNumbers(null, null)));
	}
	
	@Test
	void testForOneValueProvided() {
		assertEquals("5", getStringResult(AddTwoNumbers.addTwoNumbers(createNumber(), createNumber(5))));
		assertEquals("5", getStringResult(AddTwoNumbers.addTwoNumbers(null, createNumber(5))));
		assertEquals("5", getStringResult(AddTwoNumbers.addTwoNumbers(createNumber(5), null)));
	}
	
	@Test
	void testForFullInput() {
		assertEquals("708", getStringResult(AddTwoNumbers.addTwoNumbers(createNumber(2,4,3), createNumber(5,6,4))));
	}
	
	public static String getStringResult(ListNode firstNode) {
		StringBuilder builder = new StringBuilder();
		while(firstNode != null) {
			builder.append(firstNode.getVal());
			firstNode = firstNode.getNextNode();
		}
		return builder.toString();
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
		if(firstNode == null)
			return new ListNode();
		return firstNode;
	}
}
