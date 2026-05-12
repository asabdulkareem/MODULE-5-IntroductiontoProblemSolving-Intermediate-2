package day48;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExerciseTest {
    @Test
    void ex1FrequencyOfElementQueryReturnsFrequenciesForQueriedElements() {
        assertArrayEquals(new int[]{2, 3, 3}, Exercise.ex1FrequencyOfElementQuery(new int[]{1, 2, 1, 2, 2, 3, 3, 3}, new int[]{1, 2, 3}));
    }

    @Test
    void ex1FrequencyOfElementQueryReturnsZeroForElementsNotInArray() {
        assertArrayEquals(new int[]{0, 0}, Exercise.ex1FrequencyOfElementQuery(new int[]{1, 2, 3}, new int[]{4, 5}));
    }

    @Test
    void ex1FrequencyOfElementQueryHandlesEmptyQueryArray() {
        assertArrayEquals(new int[]{}, Exercise.ex1FrequencyOfElementQuery(new int[]{1, 2, 3}, new int[]{}));
    }

    @Test
    void ex1FrequencyOfElementQueryHandlesEmptySourceArray() {
        assertArrayEquals(new int[]{0, 0}, Exercise.ex1FrequencyOfElementQuery(new int[]{}, new int[]{1, 2}));
    }

    @Test
    void ex1FrequencyOfElementQueryHandlesDuplicateQueries() {
        assertArrayEquals(new int[]{2, 2, 1}, Exercise.ex1FrequencyOfElementQuery(new int[]{1, 1, 2}, new int[]{1, 1, 2}));
    }

    @Test
    void ex2FirstRepeatingElementReturnsFirstRepeatingElementFromRight() {
        assertEquals(2, Exercise.ex2FirstRepeatingElement(new int[]{1, 2, 3, 2, 4, 1}));
    }

    @Test
    void ex2FirstRepeatingElementReturnsMinusOneWhenNoRepeatingElements() {
        assertEquals(-1, Exercise.ex2FirstRepeatingElement(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void ex2FirstRepeatingElementReturnsSingleDuplicateElement() {
        assertEquals(5, Exercise.ex2FirstRepeatingElement(new int[]{1, 2, 3, 4, 5, 5}));
    }

    @Test
    void ex2FirstRepeatingElementReturnsMinusOneForSingleElement() {
        assertEquals(-1, Exercise.ex2FirstRepeatingElement(new int[]{1}));
    }

    @Test
    void ex3SubArrayWith0SumReturnsIndexWhenFirstElementIsZero() {
        assertEquals(0, Exercise.ex3SubArrayWith0Sum(new int[]{0, 1, 2}));
    }

    @Test
    void ex3SubArrayWith0SumReturnsIndexWhenCumulativeSumBecomesZero() {
        assertEquals(1, Exercise.ex3SubArrayWith0Sum(new int[]{1, -1, 2}));
    }

    @Test
    void ex3SubArrayWith0SumReturnsIndexForNegativeNumbers() {
        assertEquals(2, Exercise.ex3SubArrayWith0Sum(new int[]{2, 1, -3, 5}));
    }

    @Test
    void ex3SubArrayWith0SumReturnsMinusOneWhenNoZeroSumSubarray() {
        assertEquals(-1, Exercise.ex3SubArrayWith0Sum(new int[]{1, 2, 3, 4}));
    }

    @Test
    void ex3SubArrayWith0SumReturnsMinusOneForEmptyArray() {
        assertEquals(-1, Exercise.ex3SubArrayWith0Sum(new int[]{}));
    }

    @Test
    void ex5CountUniqueElementsReturnsCorrectCountForMixedElements() {
        assertEquals(3, Exercise.ex5CountUniqueElements(new int[]{1, 2, 1, 2, 3}));
    }

    @Test
    void ex5CountUniqueElementsReturnsOneWhenAllElementsAreSame() {
        assertEquals(1, Exercise.ex5CountUniqueElements(new int[]{5, 5, 5, 5}));
    }

    @Test
    void ex5CountUniqueElementsReturnsZeroForEmptyArray() {
        assertEquals(0, Exercise.ex5CountUniqueElements(new int[]{}));
    }

    @Test
    void ex5CountUniqueElementsReturnsLengthWhenAllElementsAreUnique() {
        assertEquals(5, Exercise.ex5CountUniqueElements(new int[]{1, 2, 3, 4, 5}));
    }
}
