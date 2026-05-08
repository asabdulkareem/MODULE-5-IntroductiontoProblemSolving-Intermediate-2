package day47;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExerciseTest {
    @Test
    void ex1ToLowerConvertsUppercaseLettersAndLeavesOtherCharactersUnchanged() {
        assertArrayEquals(new char[]{'a', 'b', 'c', '1', '!'}, Exercise.ex1ToLower(new char[]{'A', 'b', 'C', '1', '!'}));
    }

    @Test
    void ex1ToLowerHandlesEmptyInput() {
        assertArrayEquals(new char[]{}, Exercise.ex1ToLower(new char[]{}));
    }

    @Test
    void ex2ToUpperConvertsLowercaseLettersAndLeavesOtherCharactersUnchanged() {
        assertArrayEquals(new char[]{'A', 'B', 'C', '1', '!'}, Exercise.ex2ToUpper(new char[]{'a', 'B', 'c', '1', '!'}));
    }

    @Test
    void ex2ToUpperHandlesEmptyInput() {
        assertArrayEquals(new char[]{}, Exercise.ex2ToUpper(new char[]{}));
    }

    @Test
    void ex3ToggleCaseSwapsLetterCaseAndLeavesNonLettersUntouched() {
        assertArrayEquals(new char[]{'A', 'b', 'C', '1', '!'}, Exercise.ex3ToggleCase(new char[]{'a', 'B', 'c', '1', '!'}));
    }

    @Test
    void ex4CountSortSortsValuesInAscendingOrderWithDuplicates() {
        assertEquals(new ArrayList<>(Arrays.asList(1, 2, 2, 4)), Exercise.ex4CountSort(new ArrayList<>(Arrays.asList(4, 2, 2, 1))));
    }

    @Test
    void ex4CountSortHandlesSingleElementInput() {
        assertEquals(new ArrayList<>(Arrays.asList(3)), Exercise.ex4CountSort(new ArrayList<>(Arrays.asList(3))));
    }

    @Test
    void ex5SimpleReverseReversesTheWholeString() {
        assertEquals("relacs", Exercise.ex5SimpleReverse("scaler"));
    }

    @Test
    void ex5SimpleReverseReturnsEmptyStringForEmptyInput() {
        assertEquals("", Exercise.ex5SimpleReverse(""));
    }

    @Test
    void ex6ReverseTheStringReversesWordOrder() {
        assertEquals("java from world hello", Exercise.ex6ReverseTheString("hello world from java"));
    }

    @Test
    void ex6ReverseTheStringLeavesSingleWordUnchanged() {
        assertEquals("hello", Exercise.ex6ReverseTheString("hello"));
    }

    @Test
    void ex7LongestPalindromicReturnsLongestOddLengthPalindrome() {
        assertEquals("racecar", Exercise.ex7LongestPalindromic("racecarxyz"));
    }

    @Test
    void ex7LongestPalindromicReturnsLongestEvenLengthPalindrome() {
        assertEquals("geeksskeeg", Exercise.ex7LongestPalindromic("forgeeksskeegfor"));
    }

    @Test
    void ex7LongestPalindromicReturnsEmptyStringForEmptyInput() {
        assertEquals("", Exercise.ex7LongestPalindromic(""));
    }
}
