package day47;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionalTest {
    private Additional additional;
    @BeforeEach
    void setUp() {
        additional = new Additional();
    }

    @Test
    void ex1LongestCommonPrefixReturnsCommonPrefixForMultipleStrings() {
        assertEquals("fl", additional.ex1longestCommonPrefix(new ArrayList<>(Arrays.asList("flower", "flow", "flight"))));
    }

    @Test
    void ex1LongestCommonPrefixReturnsSingleCharacterPrefix() {
        assertEquals("inters", additional.ex1longestCommonPrefix(new ArrayList<>(Arrays.asList("interspecies", "interstellar", "interstate"))));
    }

    @Test
    void ex1LongestCommonPrefixReturnsEmptyStringWhenNoCommonPrefix() {
        assertEquals("", additional.ex1longestCommonPrefix(new ArrayList<>(Arrays.asList("dog", "cat", "car"))));
    }

    @Test
    void ex1LongestCommonPrefixReturnsSingleStringWhenOnlyOneProvided() {
        assertEquals("prefix", additional.ex1longestCommonPrefix(new ArrayList<>(Arrays.asList("prefix"))));
    }

    @Test
    void ex2IsAlNumReturnsOneForAllLowercaseLetters() {
        assertEquals(1, additional.ex2IsAlNum(new ArrayList<>(Arrays.asList('a', 'b', 'c'))));
    }

    @Test
    void ex2IsAlNumReturnsOneForAllUppercaseLetters() {
        assertEquals(1, additional.ex2IsAlNum(new ArrayList<>(Arrays.asList('A', 'B', 'C'))));
    }

    @Test
    void ex2IsAlNumReturnsOneForAllDigits() {
        assertEquals(1, additional.ex2IsAlNum(new ArrayList<>(Arrays.asList('0', '1', '9'))));
    }

    @Test
    void ex2IsAlNumReturnsOneForMixedAlphanumeric() {
        assertEquals(1, additional.ex2IsAlNum(new ArrayList<>(Arrays.asList('a', 'B', '5'))));
    }

    @Test
    void ex2IsAlNumReturnsZeroForSpecialCharacter() {
        assertEquals(0, additional.ex2IsAlNum(new ArrayList<>(Arrays.asList('a', '@', '1'))));
    }

    @Test
    void ex2IsAlNumReturnsOneForEmptyList() {
        assertEquals(1, additional.ex2IsAlNum(new ArrayList<>()));
    }

    @Test
    void ex3StringOperationsRemovesUppercaseAndVowels() {
        assertEquals("bcdfghbcdfgh", additional.ex3StringOperations("abcdefgh"));
    }

    @Test
    void ex4ChangeCharacterReturnsRemainderBudgetWhenNotExhausted() {
        assertEquals(2, additional.ex4ChangeCharacter("aabbbcd", 3));
    }

    @Test
    void ex4ChangeCharacterReturnsUniqueCharactersWhenBudgetExhausted() {
        assertEquals(3, additional.ex4ChangeCharacter("aabbbcd", 1));
    }

    @Test
    void ex5CountOccurrencesCountsMultipleNonOverlappingOccurrences() {
        assertEquals(2, additional.ex5CountOccurrences("bobob"));
    }

    @Test
    void ex5CountOccurrencesReturnsZeroWhenPatternNotFound() {
        assertEquals(0, additional.ex5CountOccurrences("abc"));
    }

    @Test
    void ex5CountOccurrencesReturnsSingleOccurrence() {
        assertEquals(1, additional.ex5CountOccurrences("bobxyz"));
    }

    @Test
    void ex6CheckAnagramsReturnsOneForValidAnagrams() {
        assertEquals(1, additional.ex6CheckAnagrams("listen", "silent"));
    }

    @Test
    void ex6CheckAnagramsReturnsZeroForNonAnagrams() {
        assertEquals(0, additional.ex6CheckAnagrams("hello", "world"));
    }

    @Test
    void ex6CheckAnagramsReturnsOneForEmptyStrings() {
        assertEquals(1, additional.ex6CheckAnagrams("", ""));
    }

    @Test
    void ex7AddBinaryStringsAddsSimpleBinaryNumbers() {
        assertEquals("100", additional.ex7AddBinaryStrings("1", "11"));
    }

    @Test
    void ex7AddBinaryStringsHandlesZeroPlusBinary() {
        assertEquals("101", additional.ex7AddBinaryStrings("0", "101"));
    }

    @Test
    void ex7AddBinaryStringsAddsNumbersOfDifferentLengths() {
        assertEquals("10011", additional.ex7AddBinaryStrings("1010", "1001"));
    }
}
