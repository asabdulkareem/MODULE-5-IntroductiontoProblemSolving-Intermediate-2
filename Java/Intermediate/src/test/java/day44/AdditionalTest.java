package day44;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdditionalTest {

    @Test
    void ex1ToggleIthBitTurnsOffBitWhenItIsSet() {
        assertEquals(8, Additional.ex1ToggleIthBit(10, 1));
    }

    @Test
    void ex1ToggleIthBitTurnsOnBitWhenItIsUnset() {
        assertEquals(11, Additional.ex1ToggleIthBit(10, 0));
    }

    @Test
    void ex1ToggleIthBitHandlesHighBitPosition() {
        assertEquals(Integer.MIN_VALUE, Additional.ex1ToggleIthBit(0, 31));
    }

    @Test
    void ex2UnsetXBitsFromRightClearsRequestedRightmostBits() {
        assertEquals(24, Additional.ex2UnsetXBitsFromRight(29, 3));
    }

    @Test
    void ex2UnsetXBitsFromRightReturnsSameNumberWhenBitsToUnsetIsZero() {
        assertEquals(29, Additional.ex2UnsetXBitsFromRight(29, 0));
    }

    @Test
    void ex2UnsetXBitsFromRightReturnsZeroWhenRequestedBitsExceedNumberWidth() {
        assertEquals(0, Additional.ex2UnsetXBitsFromRight(5, 10));
    }

    @Test
    void ex3HelpFromSamReturnsZeroForZeroInput() {
        assertEquals(0, Additional.ex3HelpFromSam(0));
    }

    @Test
    void ex3HelpFromSamCountsSetBitsForPositiveNumber() {
        assertEquals(3, Additional.ex3HelpFromSam(13));
    }

    @Test
    void ex4FindingGoodDaysReturnsZeroForZeroInput() {
        assertEquals(0, Additional.ex4FindingGoodDays(0));
    }

    @Test
    void ex4FindingGoodDaysCountsSetBitsForPositiveNumber() {
        assertEquals(4, Additional.ex4FindingGoodDays(15));
    }

    @Test
    void ex5FindNthMagicNumberReturnsZeroForZero() {
        assertEquals(0, Additional.ex5FindNthMagicNumber(0));
    }

    @Test
    void ex5FindNthMagicNumberReturnsOneForFirstNumber() {
        assertEquals(1, Additional.ex5FindNthMagicNumber(1));
    }

    @Test
    void ex5FindNthMagicNumberBuildsValueFromBinaryRepresentation() {
        assertEquals(6, Additional.ex5FindNthMagicNumber(3));
    }

    @Test
    void x6ReverseBitsReturnsZeroForZeroInput() {
        assertEquals(0L, Additional.x6ReverseBits(0));
    }

    @Test
    void x6ReverseBitsMovesLeastSignificantBitToMostSignificantPosition() {
        assertEquals(2147483648L, Additional.x6ReverseBits(1));
    }

    @Test
    void x6ReverseBitsReversesLowerTwoBitsIntoTopTwoPositions() {
        assertEquals(3221225472L, Additional.x6ReverseBits(3));
    }
}

