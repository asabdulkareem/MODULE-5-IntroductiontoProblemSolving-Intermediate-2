package day46;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExerciseTest {
    @Test
    void ex1ElementsRemovalCalculatesTotalCostForTypicalInput() {
        assertEquals(10, Exercise.ex1ElementsRemoval(new int[]{3, 1, 2}));
    }

    @Test
    void ex1ElementsRemovalReturnsElementValueForSingleElementArray() {
        assertEquals(5, Exercise.ex1ElementsRemoval(new int[]{5}));
    }

    @Test
    void ex1ElementsRemovalReturnsZeroForEmptyArray() {
        assertEquals(0, Exercise.ex1ElementsRemoval(new int[]{}));
    }

    @Test
    void ex2NobleIntegerReturnsOneWhenNobleIntegerExists() {
        assertEquals(1, Exercise.ex2NobleInteger(new int[]{3, 2, 1, 3}));
    }

    @Test
    void ex2NobleIntegerReturnsOneForZeroWhenItIsLargestValue() {
        assertEquals(1, Exercise.ex2NobleInteger(new int[]{-1, -1, 0}));
    }

    @Test
    void ex2NobleIntegerReturnsMinusOneWhenNoNobleIntegerExists() {
        assertEquals(-1, Exercise.ex2NobleInteger(new int[]{1, 1, 1}));
    }

    @Test
    void ex3FactorsSortOrdersNumbersByIncreasingFactorCount() {
        assertArrayEquals(new int[]{9, 6, 8}, Exercise.ex3FactorsSort(new int[]{6, 8, 9}));
    }

    @Test
    void ex3FactorsSortKeepsOriginalOrderWhenFactorCountsAreEqual() {
        assertArrayEquals(new int[]{9, 6, 8}, Exercise.ex3FactorsSort(new int[]{6, 8, 9}));
    }

    @Test
    void ex3FactorsSortReturnsSameArrayForSingleElementInput() {
        assertArrayEquals(new int[]{7}, Exercise.ex3FactorsSort(new int[]{7}));
    }

    @Test
    void ex4LargestNumberBuildsLargestConcatenationForTypicalInput() {
        assertEquals("9534330", Exercise.ex4LargestNumber(new int[]{3, 30, 34, 5, 9}));
    }

    @Test
    void ex4LargestNumberReturnsSingleZeroWhenAllElementsAreZero() {
        assertEquals("0", Exercise.ex4LargestNumber(new int[]{0, 0, 0}));
    }

    @Test
    void ex4LargestNumberHandlesPrefixComparisonCorrectly() {
        assertEquals("12121", Exercise.ex4LargestNumber(new int[]{12, 121}));
    }
}
