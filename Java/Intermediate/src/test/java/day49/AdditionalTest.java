package day49;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class AdditionalTest {
	@Test void ex1CountPairSumCountsPairsWithDuplicates() { assertEquals(4, Additional.ex1CountPairSum(new int[]{1, 1, 2, 2}, 3)); }
	@Test void ex1CountPairSumReturnsZeroForEmptyArray() { assertEquals(0, Additional.ex1CountPairSum(new int[]{}, 5)); }

	@Test void ex2CountPairDifferenceCountsPairsWithAbsoluteDifference() { assertEquals(3, Additional.ex2CountPairDifference(new ArrayList<>(Arrays.asList(1, 5, 3, 4, 2)), 2)); }
	@Test void ex2CountPairDifferenceHandlesZeroDifferenceAsPairsOfEquals() { assertEquals(3, Additional.ex2CountPairDifference(new ArrayList<>(Arrays.asList(2,2,2,3)), 0)); }

	@Test void ex3PairWithGivenDifferenceReturnsOneWhenPairExists() { assertEquals(1, Additional.ex3PairWithGivenDifference(new int[]{5, 10, 3, 2}, 7)); }
	@Test void ex3PairWithGivenDifferenceReturnsZeroWhenNoPair() { assertEquals(0, Additional.ex3PairWithGivenDifference(new int[]{1,2,3}, 10)); }

	@Test void ex4SubarrayWithGivenSumReturnsSubarrayWhenExists() { assertEquals(new ArrayList<>(Arrays.asList(2,3)), Additional.ex4SubarrayWithGivenSum(new ArrayList<>(Arrays.asList(1,2,3,4)), 5)); }
	@Test void ex4SubarrayWithGivenSumReturnsMinusOneWhenNoSubarray() { assertEquals(new ArrayList<>(Arrays.asList(-1)), Additional.ex4SubarrayWithGivenSum(new ArrayList<>(Arrays.asList(1,2,3)), 7)); }

	@Test void ex5SubarraySumEqualsKCountsAllContinuousSubarraysForPositiveNumbers() { assertEquals(2, Additional.ex5SubarraySumEqualsK(new ArrayList<>(Arrays.asList(1,1,1)), 2)); }
	@Test void ex5SubarraySumEqualsK2CountsAllContinuousSubarraysWhenNegativesPresent() { assertEquals(5, Additional.ex5SubarraySumEqualsK2(new ArrayList<>(Arrays.asList(1, -1, 1, 0)), 1)); }

	@Test void ex6IsDictionaryReturnsOneForProperlyOrderedWords() { List<String> words = Arrays.asList("hello","leetcode"); assertEquals(1, Additional.ex6IsDictionary(new ArrayList<>(words), "hlabcdefgijkmnopqrstuvwxyz")); }
	@Test void ex6IsDictionaryReturnsZeroForIncorrectlyOrderedWords() { List<String> words = Arrays.asList("apple","app"); assertEquals(0, Additional.ex6IsDictionary(new ArrayList<>(words), "abcdefghijklmnopqrstuvwxyz")); }

	@Test void ex7ValidSudokuReturnsOneForValidBoard() {
		List<String> board = Arrays.asList(
				"53..7....",
				"6..195...",
				".98....6.",
				"8...6...3",
				"4..8.3..1",
				"7...2...6",
				".6....28.",
				"...419..5",
				"....8..79"
		);
		assertEquals(1, Additional.ex7ValidSudoku(board));
	}
	@Test void ex7ValidSudokuReturnsZeroForInvalidRowColumnOrBox() {
		List<String> invalid = Arrays.asList(
				"53..7....",
				"6..195...",
				".98....6.",
				"8...6...3",
				"4..8.3..1",
				"7...2...6",
				".6....28.",
				"...419..5",
				"....8..75" // changed last digit to cause a duplicate in bottom-right box/column
		);
		assertEquals(0, Additional.ex7ValidSudoku(invalid));
	}

	@Test void ex8PairsWithGivenXorCountsPairsMatchingXor() { assertEquals(1, Additional.ex8PairsWithGivenXor(new ArrayList<>(Arrays.asList(5,1,4)), 5)); }
}
