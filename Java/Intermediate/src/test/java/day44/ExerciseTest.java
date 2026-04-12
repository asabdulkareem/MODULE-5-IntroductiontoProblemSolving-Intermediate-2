package day44;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExerciseTest {

    @Test
    void ex1CheckBitReturnsOneWhenBitIsSet() {
        assertEquals(1, Exercise.ex1CheckBit(10, 1));
    }

    @Test
    void ex1CheckBitReturnsZeroWhenBitIsNotSet() {
        assertEquals(0, Exercise.ex1CheckBit(10, 0));
    }

    @Test
    void ex2NumberOf1BitsReturnsZeroForZero() {
        assertEquals(0, Exercise.ex2NumberOf1Bits(0));
    }

    @Test
    void ex2NumberOf1BitsCountsAllSetBitsForPositiveNumber() {
        assertEquals(3, Exercise.ex2NumberOf1Bits(13));
    }

    @Test
    void ex2NumberOf1BitsHandlesLargestPositiveInt() {
        assertEquals(31, Exercise.ex2NumberOf1Bits(Integer.MAX_VALUE));
    }

    @Test
    void ex3SetBitReturnsNumberWithBothBitsSet() {
        assertEquals(10, Exercise.ex3SetBit(1, 3));
    }

    @Test
    void ex3SetBitWithSameBitPositionsReturnsSingleSetBit() {
        assertEquals(8, Exercise.ex3SetBit(3, 3));
    }

    @Test
    void ex4UnSetBitClearsBitWhenItIsSet() {
        assertEquals(8, Exercise.ex4UnSetBit(10, 1));
    }

    @Test
    void ex4UnSetBitKeepsNumberUnchangedWhenBitIsAlreadyUnset() {
        assertEquals(10, Exercise.ex4UnSetBit(10, 2));
    }

    @Test
    void ex4UnSetBitCanClearLeastSignificantBit() {
        assertEquals(0, Exercise.ex4UnSetBit(1, 0));
    }
}

