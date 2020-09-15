package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import solutions.TwoSumOrdered;

class TwoSumOrderedTest {

	@Test
	void testingForNullAndEmptyValues() {
		assertArrayEquals(new int[] {}, TwoSumOrdered.twoSumOrdered(null, 15));
		assertArrayEquals(new int[] {}, TwoSumOrdered.twoSumOrdered(new int[] {}, 15));
	}

	@Test
	void testingForCorrectInputsWithEactlyOneSolution() {
		assertArrayEquals(new int[] { 0, 1 }, TwoSumOrdered.twoSumOrdered(new int[] { 1, 14 }, 15));
		assertArrayEquals(new int[] { 2, 5 }, TwoSumOrdered.twoSumOrdered(new int[] { 1, 20, 22, 60, 61, 66, 70 }, 88));
	}

	@Test
	void testingForCorrectInputsWithEactlyTwoOrModeSolutions() {
		assertArrayEquals(new int[] { 1, 5 }, TwoSumOrdered.twoSumOrdered(new int[] { 0, 1, 2, 3, 4, 5 }, 6));
		assertArrayEquals(new int[] { 0, 4 }, TwoSumOrdered.twoSumOrdered(new int[] { 0, 1, 5, 10, 15 }, 15));
	}

	@Test
	void testingForCorrectInputsWithNoSolution() {
		assertArrayEquals(new int[] {}, TwoSumOrdered.twoSumOrdered(new int[] { 22, 23 }, 15));
		assertArrayEquals(new int[] {}, TwoSumOrdered.twoSumOrdered(new int[] { 1 }, 0));
	}
}
