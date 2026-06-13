package day50;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AdditionalTest {
    @Test
    void ex1ReverseStringReturnsNullForNullInput() { assertNull(Additional.ex1ReverseString(null)); }
    @Test void ex1ReverseStringHandlesEmptyAndSingleCharacter() { assertEquals("", Additional.ex1ReverseString("")); assertEquals("a", Additional.ex1ReverseString("a")); }
    @Test void ex1ReverseStringReversesOddAndEvenLengthStrings() {
        assertEquals("cba", Additional.ex1ReverseString("abc"));
        assertEquals("dcba", Additional.ex1ReverseString("abcd"));
    }
    @Test void ex1ReverseStringPreservesWhitespaceAndCharacters() { assertEquals(" cba ", Additional.ex1ReverseString(" abc ")); }
    @Test void ex2SumOfDigitsReturnsSumForSingleAndMultipleDigits() { assertEquals(0, Additional.ex2SumOfDigits(0)); assertEquals(5, Additional.ex2SumOfDigits(5)); assertEquals(6, Additional.ex2SumOfDigits(123)); assertEquals(45, Additional.ex2SumOfDigits(123456789)); }
}
