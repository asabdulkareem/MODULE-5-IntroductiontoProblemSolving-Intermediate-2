using System;
using System.Collections.Generic;
using System.Text;
using Intermediate.day46;
using Xunit;

namespace TestIntermediate.day46
{
    public class TestExercise
    {
        [Theory]
        [InlineData(new int[] { 3, 6, 2, 4 }, 31)]
        [InlineData(new int[] { 1, 2, 3 }, 10)]
        [InlineData(new int[] { 5 }, 5)]
        public void Ex1ElementsRemoval_Works(int[] array, int expected)
        {
            Assert.Equal(expected, Exercise.ex1ElementsRemoval(array));
        }

        [Theory]
        [InlineData(new int[] { 3, 2, 1, 3 })]
        [InlineData(new int[] { 1, 1, 3, 3 })]
        [InlineData(new int[] { 0, 0, 0 })]
        public void Ex2NobleInteger_ThrowsForNonEmptyInput(int[] array)
        {
            Assert.Throws<IndexOutOfRangeException>(() => Exercise.ex2NobleInteger(array));
        }

        [Theory]
        [InlineData(2, 2)]
        [InlineData(9, 3)]
        [InlineData(12, 6)]
        public void Ex3Factors_Works(int input, int expected)
        {
            Assert.Equal(expected, Exercise.ex3Factors(input));
        }

        [Fact]
        public void Ex3FactorsSort_Works()
        {
            var input = new int[] { 6, 8, 9 };
            var expected = new int[] { 9, 6, 8 };

            Assert.Equal(expected, Exercise.ex3FactorsSort(input));
        }

        [Theory]
        [InlineData(new int[] { 3, 30, 34, 5, 9 }, "9534330")]
        [InlineData(new int[] { 10, 2 }, "210")]
        [InlineData(new int[] { 0, 0, 0 }, "0")]
        public void Ex4LargestNumber_Works(int[] input, string expected)
        {
            Assert.Equal(expected, Exercise.ex4LargestNumber(input));
        }
    }
}
