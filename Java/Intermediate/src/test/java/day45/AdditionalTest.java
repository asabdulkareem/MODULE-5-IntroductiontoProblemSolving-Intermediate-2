package day45;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdditionalTest {

    private final Additional additional = new Additional();

    @Test
    void ex1LeapYearReturnsOneForYearDivisibleBy4ButNotBy100() {
        assertEquals(1, additional.ex1LeapYear(2024));
    }

    @Test
    void ex1LeapYearReturnsZeroForYearDivisibleBy100ButNotBy400() {
        assertEquals(0, additional.ex1LeapYear(1900));
    }

    @Test
    void ex1LeapYearReturnsOneForYearDivisibleBy400() {
        assertEquals(1, additional.ex1LeapYear(2000));
    }

    @Test
    void ex1LeapYearReturnsZeroForYearNotDivisibleBy4() {
        assertEquals(0, additional.ex1LeapYear(2023));
    }

    @Test
    void ex1LeapYearTreatsYearZeroAsLeapYear() {
        assertEquals(1, additional.ex1LeapYear(0));
    }

    @Test
    void ex2DivisibilityBy8ReturnsOneForSingleDigitMultipleOf8() {
        assertEquals(1, additional.ex2DivisibilityBy8("8"));
    }

    @Test
    void ex2DivisibilityBy8ReturnsOneForLongNumberDivisibleBy8() {
        assertEquals(1, additional.ex2DivisibilityBy8("1232"));
    }

    @Test
    void ex2DivisibilityBy8ReturnsZeroForNumberNotDivisibleBy8() {
        assertEquals(0, additional.ex2DivisibilityBy8("14"));
    }

    @Test
    void ex2DivisibilityBy8ReturnsOneForZero() {
        assertEquals(1, additional.ex2DivisibilityBy8("0"));
    }

    @Test
    void ex2DivisibilityBy8HandlesLeadingZeros() {
        assertEquals(1, additional.ex2DivisibilityBy8("00024"));
    }

    @Test
    void ex2DivisibilityBy8ReturnsOneForEmptyString() {
        assertEquals(1, additional.ex2DivisibilityBy8(""));
    }

    @Test
    void ex3ConcatenateThreeNumbersOrdersDistinctValuesAscending() {
        assertEquals(123498, additional.ex3ConcatenateThreeNumbers(34, 12, 98));
    }

    @Test
    void ex3ConcatenateThreeNumbersWorksWhenInputsAreReverseSorted() {
        assertEquals(123456, additional.ex3ConcatenateThreeNumbers(56, 34, 12));
    }

    @Test
    void ex3ConcatenateThreeNumbersKeepsDuplicateValuesInOrder() {
        assertEquals(232345, additional.ex3ConcatenateThreeNumbers(23, 23, 45));
    }

    @Test
    void ex3ConcatenateThreeNumbersHandlesAllEqualValues() {
        assertEquals(111111, additional.ex3ConcatenateThreeNumbers(11, 11, 11));
    }

    @Test
    void ex3ConcatenateThreeNumbersHandlesValueZero() {
        assertEquals(312, additional.ex3ConcatenateThreeNumbers(0, 12, 3));
    }
}

