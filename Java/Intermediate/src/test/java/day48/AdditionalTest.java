package day48;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionalTest {
    @Test void ex1CountSubArrayZeroSumCountsAllZeroSumSubarraysForMixedArray() { assertEquals(3, Additional.ex1CountSubArrayZeroSum(new int[]{1, -1, 0})); }
    @Test void ex1CountSubArrayZeroSumCountsAllZeroSumSubarraysForAllZeros() { assertEquals(3, Additional.ex1CountSubArrayZeroSum(new int[]{0, 0})); }
    @Test void ex1CountSubArrayZeroSumReturnsZeroWhenNoZeroSumSubarrayExists() { assertEquals(0, Additional.ex1CountSubArrayZeroSum(new int[]{1, 2, 3})); }
    @Test void ex1CountSubArrayZeroSumReturnsZeroForEmptyArray() { assertEquals(0, Additional.ex1CountSubArrayZeroSum(new int[]{})); }
    @Test void ex2CommonElementsReturnsCommonElementsWithMultiplicity() { assertEquals(new ArrayList<>(Arrays.asList(2, 2)), Additional.ex2CommonElements(new int[]{1, 2, 2, 3}, new int[]{2, 2, 4})); }
    @Test void ex2CommonElementsReturnsEmptyListWhenNoCommonElements() { assertEquals(new ArrayList<>(), Additional.ex2CommonElements(new int[]{1, 3, 5}, new int[]{2, 4, 6})); }
    @Test void ex3ColorfulNumberReturnsOneForColorfulNumber() { assertEquals(1, Additional.ex3ColorfulNumber(23)); }
    @Test void ex3ColorfulNumberReturnsZeroForNonColorfulNumber() { assertEquals(0, Additional.ex3ColorfulNumber(121)); }
    @Test void ex3ColorfulNumberTreatsSingleDigitAsColorful() { assertEquals(1, Additional.ex3ColorfulNumber(7)); }
    @Test void ex4CountUniqueElementsCountsElementsAppearingExactlyOnce() { assertEquals(2, Additional.ex4CountUniqueElements(new int[]{1, 2, 2, 3})); }
    @Test void ex4CountUniqueElementsReturnsZeroForEmptyArray() { assertEquals(0, Additional.ex4CountUniqueElements(new int[]{})); }
    @Test void ex4CountUniqueElementsReturnsOneWhenAllElementsSame() { assertEquals(0, Additional.ex4CountUniqueElements(new int[]{5, 5, 5})); }
}
