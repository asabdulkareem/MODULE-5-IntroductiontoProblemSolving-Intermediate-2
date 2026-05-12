using System;
using System.Collections.Generic;
using Xunit;
using Intermediate.day47;

namespace TestIntermediate.day47
{
    public class TestExercise
    {
        [Fact]
        public void Ex1ToLower_ConvertsUpperToLower()
        {
            char[] input = new char[] { 'A', 'b', 'C', '1', '?' };
            char[] expected = new char[] { 'a', 'b', 'c', '1', '?' };

            var result = Exercise.ex1ToLower(input);

            Assert.Equal(expected, result);
        }

        [Fact]
        public void Ex2ToUpper_ConvertsLowerToUpper()
        {
            char[] input = new char[] { 'a', 'B', 'c', '2', '!' };
            char[] expected = new char[] { 'A', 'B', 'C', '2', '!' };

            var result = Exercise.ex2ToUpper(input);

            Assert.Equal(expected, result);
        }

        [Fact]
        public void Ex3ToggleCase_TogglesEachLetter()
        {
            char[] input = new char[] { 'a', 'B', 'c', 'D', '9' };
            char[] expected = new char[] { 'A', 'b', 'C', 'd', '9' };

            var result = Exercise.ex3ToggleCase(input);

            Assert.Equal(expected, result);
        }

        [Fact]
        public void Ex4CountSort_ThrowsIndexOutOfRange_ForCurrentImplementation()
        {
            var ex = new Exercise();
            var list = new List<int> { 1, 2, 3 };

            Assert.Throws<IndexOutOfRangeException>(() => ex.ex4CountSort(list));
        }

        [Fact]
        public void Ex5SimpleReverse_ReturnsReversedString()
        {
            string input = "hello";
            string expected = "olleh";

            var result = Exercise.ex5SimpleReverse(input);

            Assert.Equal(expected, result);
        }

        [Fact]
        public void Ex6ReverseString_ReversesSubstringRange()
        {
            string input = "abcdef";
            // reverse indices 1..4 => b c d e -> e d c b => a e d c b f
            string expected = "aedcbf";

            var result = Exercise.ex6ReverseString(input, 1, 4);

            Assert.Equal(expected, result);
        }
    }
}
