package day49;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExerciseTest {
	@Test
	void ex1LongestSubarrayZeroSumReturnsFullLengthWhenTotalSumIsZero() {
		assertEquals(5, Exercise.ex1LongestSubarrayZeroSum(new int[]{1, -1, 2, -2, 0}));
	}

	@Test
	void ex1LongestSubarrayZeroSumFindsLongestZeroSumSubarrayInMiddle() {
		assertEquals(5, Exercise.ex1LongestSubarrayZeroSum(new int[]{1, -1, 3, -2, -1, 2}));
	}

	@Test
	void ex1LongestSubarrayZeroSumReturnsZeroWhenNoZeroSumSubarrayExists() {
		assertEquals(0, Exercise.ex1LongestSubarrayZeroSum(new int[]{1, 2, 3}));
	}

	@Test
	void ex1LongestSubarrayZeroSumHandlesEmptyArray() {
		assertEquals(0, Exercise.ex1LongestSubarrayZeroSum(new int[]{}));
	}

	@Test
	void ex2CheckPairSumReturnsOneWhenPairExists() {
		assertEquals(1, Exercise.ex2CheckPairSum(7, new int[]{3, 4, 5}));
	}

	@Test
	void ex2CheckPairSumReturnsZeroWhenNoPairExists() {
		assertEquals(0, Exercise.ex2CheckPairSum(10, new int[]{1, 2, 3}));
	}

	@Test
	void ex2CheckPairSumHandlesDuplicateElementsFormingPair() {
		assertEquals(1, Exercise.ex2CheckPairSum(4, new int[]{2, 2}));
	}

	@Test
	void ex2CheckPairSumReturnsZeroForSingleElementArray() {
		assertEquals(0, Exercise.ex2CheckPairSum(4, new int[]{4}));
	}

	@Test
	void ex3DistinctNumbersInWindowReturnsDistinctCountsForEachWindow() {
		ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 1, 3, 4, 3));
		ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 3, 3, 2));
		assertEquals(expected, Exercise.ex3DistinctNumbersInWindow(input, 3));
	}

	@Test
	void ex3DistinctNumbersInWindowWithWindowSizeOneReturnsOnes() {
		ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 2));
		ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 1, 1));
		assertEquals(expected, Exercise.ex3DistinctNumbersInWindow(input, 1));
	}

	@Test
	void ex3DistinctNumbersInWindowWithWindowSizeEqualToArraySizeReturnsSingleDistinctCount() {
		ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 2, 3));
		ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3));
		assertEquals(expected, Exercise.ex3DistinctNumbersInWindow(input, 4));
	}
}
