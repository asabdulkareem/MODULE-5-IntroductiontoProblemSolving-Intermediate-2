package day50;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExerciseTest {
    @Test
    void ex1findAthFibonacciReturnsOneForFirstTwoPositions() { assertEquals(1, Exercise.ex1findAthFibonacci(1)); assertEquals(1, Exercise.ex1findAthFibonacci(2)); }
    @Test void ex1findAthFibonacciReturnsCorrectValuesForLargerN() { assertEquals(8, Exercise.ex1findAthFibonacci(6)); assertEquals(55, Exercise.ex1findAthFibonacci(10)); }
    @Test void ex2FactorialComputesFactorialForSmallNumbers() { assertEquals(1, Exercise.ex2Factorial(1)); assertEquals(120, Exercise.ex2Factorial(5)); }
    @Test void ex3PalindromeUsingRecursionRecognizesPalindromesAndNonPalindromesAndEmpty() { assertEquals(1, Exercise.ex3PalindromeUsingRecursion("a")); assertEquals(1, Exercise.ex3PalindromeUsingRecursion("")); assertEquals(1, Exercise.ex3PalindromeUsingRecursion("racecar")); assertEquals(0, Exercise.ex3PalindromeUsingRecursion("abc")); assertEquals(0, Exercise.ex3PalindromeUsingRecursion("Aa")); }
    @Test void ex4Print1ToAFunctionProducesExpectedSequenceWithSpacing() { assertEquals("1", Exercise.ex4Print1ToAFunction(1)); assertEquals("1 2", Exercise.ex4Print1ToAFunction(2)); assertEquals("1 2 3", Exercise.ex4Print1ToAFunction(3)); }
    @Test void ex5PrintATo1FunctionProducesExpectedReverseSequenceWithSpacing() { assertEquals("1", Exercise.ex5PrintATo1Function(1)); assertEquals("2 1", Exercise.ex5PrintATo1Function(2)); assertEquals("3 2 1", Exercise.ex5PrintATo1Function(3)); }
}
