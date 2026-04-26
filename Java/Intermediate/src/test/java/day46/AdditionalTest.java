package day46;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AdditionalTest {

	@Test
	void ex1SortByColorSortsMixedValuesInAscendingOrder() {
		assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, Additional.ex1SortByColor(new int[]{2, 0, 2, 1, 1, 0}));
	}

	@Test
	void ex1SortByColorLeavesAlreadySortedArrayUnchanged() {
		assertArrayEquals(new int[]{0, 1, 1, 2, 2}, Additional.ex1SortByColor(new int[]{0, 1, 1, 2, 2}));
	}

	@Test
	void ex1SortByColorHandlesEmptyArray() {
		assertArrayEquals(new int[]{}, Additional.ex1SortByColor(new int[]{}));
	}

	@Test
	void ex2ArithmeticProgressionReturnsOneForValidProgression() {
		assertEquals(1, Additional.ex2ArithmeticProgression(new int[]{9, 5, 1, 13, 17}));
	}

	@Test
	void ex2ArithmeticProgressionReturnsOneForConstantSequence() {
		assertEquals(1, Additional.ex2ArithmeticProgression(new int[]{4, 4, 4, 4}));
	}

	@Test
	void ex2ArithmeticProgressionReturnsZeroForNonProgression() {
		assertEquals(0, Additional.ex2ArithmeticProgression(new int[]{3, 7, 10, 15}));
	}

	@Test
	void ex3TensDigitSortingOrdersByTensDigitAndDescendingValueWithinTies() {
		assertArrayEquals(new int[]{9, 19, 10, 22, 21}, Additional.ex3TensDigitSorting(new int[]{21, 19, 22, 9, 10}));
	}

	@Test
	void ex3TensDigitSortingPlacesSingleDigitNumbersBeforeHigherTensDigits() {
		assertArrayEquals(new int[]{7, 5, 13, 11, 24}, Additional.ex3TensDigitSorting(new int[]{24, 11, 7, 13, 5}));
	}
}
