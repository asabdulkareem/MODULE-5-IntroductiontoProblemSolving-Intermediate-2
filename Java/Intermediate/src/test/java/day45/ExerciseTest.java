package day45;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ExerciseTest {

    private final Exercise exercise = new Exercise();

    @Test
    void ex1PowerWithModulesCalculatesPowerModuloForTypicalInput() {
        assertEquals(6, exercise.ex1PowerWithModules(2, 5, 13));
    }

    @Test
    void ex1PowerWithModulesReturnsOneWhenExponentIsZero() {
        assertEquals(1, exercise.ex1PowerWithModules(7, 0, 11));
    }

    @Test
    void ex1PowerWithModulesReturnsZeroWhenBaseIsZeroAndExponentIsPositive() {
        assertEquals(0, exercise.ex1PowerWithModules(0, 4, 9));
    }

    @Test
    void ex1PowerWithModulesThrowsArithmeticExceptionWhenModulusIsZero() {
        assertThrows(ArithmeticException.class, () -> exercise.ex1PowerWithModules(2, 3, 0));
    }

    @Test
    void ex2ModArrayReturnsModuloForTypicalDigitArray() {
        assertEquals(1, exercise.ex2ModArray(new int[]{1, 4, 3}, 2));
    }

    @Test
    void ex2ModArrayHandlesLeadingZerosInDigitArray() {
        assertEquals(0, exercise.ex2ModArray(new int[]{0, 0, 1, 2}, 3));
    }

    @Test
    void ex2ModArrayReturnsZeroForEmptyArray() {
        assertEquals(0, exercise.ex2ModArray(new int[]{}, 7));
    }

    @Test
    void ex2ModArrayReturnsZeroWhenDivisorIsOne() {
        assertEquals(0, exercise.ex2ModArray(new int[]{9, 9, 9}, 1));
    }

    @Test
    void ex2ModArrayThrowsArithmeticExceptionWhenDivisorIsZero() {
        assertThrows(ArithmeticException.class, () -> exercise.ex2ModArray(new int[]{1, 2, 3}, 0));
    }

    @Test
    void ex3DivisibilityBy3ReturnsOneWhenSumOfDigitsIsDivisibleByThree() {
        assertEquals(1, exercise.ex3DivisibilityBy3(new int[]{1, 2, 3}));
    }

    @Test
    void ex3DivisibilityBy3ReturnsZeroWhenSumOfDigitsIsNotDivisibleByThree() {
        assertEquals(0, exercise.ex3DivisibilityBy3(new int[]{1, 1, 1, 1}));
    }

    @Test
    void ex3DivisibilityBy3ReturnsOneForEmptyArray() {
        assertEquals(1, exercise.ex3DivisibilityBy3(new int[]{}));
    }
}
