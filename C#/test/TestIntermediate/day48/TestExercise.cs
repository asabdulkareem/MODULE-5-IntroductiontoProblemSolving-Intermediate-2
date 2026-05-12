using System;
using Intermediate.day48;

namespace TestIntermediate.day48
{
    public class TestExercise
    {
        [Theory]
        [InlineData(new int[] { 1, 2, 2, 1, 3 }, new int[] { 2, 1, 4 }, new int[] { 2, 2, 0 })]
        [InlineData(new int[] { 5, 5, 5, 7 }, new int[] { 5, 7, 1 }, new int[] { 3, 1, 0 })]
        [InlineData(new int[] { }, new int[] { 1, 2 }, new int[] { 0, 0 })]
        public void Ex1FrequencyOfElementQuery_Works(int[] array, int[] queries, int[] expected)
        {
            Assert.Equal(expected, Exercise.ex1FrequencyOfElementQuery(array, queries));
        }

        [Theory]
        [InlineData(new int[] { 10, 5, 3, 4, 3, 5, 6 }, 3)]
        [InlineData(new int[] { 1, 2, 3, 4 }, -1)]
        [InlineData(new int[] { 7, 7, 8, 9 }, 7)]
        [InlineData(new int[] { }, -1)]
        public void Ex2FirstRepeatingElement_Works(int[] array, int expected)
        {
            Assert.Equal(expected, Exercise.ex2FirstRepeatingElement(array));
        }

        [Theory]
        [InlineData(new int[] { 4, 2, -3, 1, 6 }, 1)]
        [InlineData(new int[] { 1, 2, 3 }, 0)]
        [InlineData(new int[] { 1, -1 }, 1)]
        [InlineData(new int[] { 0 }, 1)]
        public void Ex3SubArrayWith0Sum_Works(int[] array, int expected)
        {
            Assert.Equal(expected, Exercise.ex3SubArrayWith0Sum(array));
        }

        [Theory]
        [InlineData(new int[] { 1, 2, 2, 3, 3, 3 }, 3)]
        [InlineData(new int[] { 5, 5, 5, 5 }, 1)]
        [InlineData(new int[] { -1, 0, 1, 2, -1 }, 4)]
        [InlineData(new int[] { }, 0)]
        public void Ex5CountUniqueElements_Works(int[] array, int expected)
        {
            Assert.Equal(expected, Exercise.ex5CountUniqueElements(array));
        }
    }
}
