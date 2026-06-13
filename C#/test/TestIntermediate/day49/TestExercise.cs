using System;
using System.Collections.Generic;
using Xunit;
using Intermediate.day49;

namespace TestIntermediate.day49
{
    public class TestExercise
    {
        [Fact]
        public void ex1LongestSubarrayZeroSum_AllZeroes_ReturnsLength()
        {
            // Arrange
            int[] arr = new int[] { 0, 0, 0, 0 };

            // Act
            var result = Exercise.ex1LongestSubarrayZeroSum(arr);

            // Assert
            Assert.Equal(4, result);
        }

        [Fact]
        public void ex1LongestSubarrayZeroSum_TotalSumZero_ReturnsFullLength()
        {
            // Arrange
            int[] arr = new int[] { 1, -1, 2, -2 };

            // Act
            var result = Exercise.ex1LongestSubarrayZeroSum(arr);

            // Assert
            Assert.Equal(4, result);
        }

        [Fact]
        public void ex1LongestSubarrayZeroSum_RepeatedPrefixSum_UsesFirstIndex()
        {
            // Arrange
            int[] arr = new int[] { 1, 2, -3, 1, -1 };
            // prefix sums: 1,3,0,1,0 -> when sum==1 repeats at i=3 length = 3 - 0 = 3

            // Act
            var result = Exercise.ex1LongestSubarrayZeroSum(arr);

            // Assert
            Assert.Equal(5, result); // total sum is 0 so full length
        }

        [Fact]
        public void ex1LongestSubarrayZeroSum_NoZeroSum_ReturnsZero()
        {
            // Arrange
            int[] arr = new int[] { 1, 2, 3 };

            // Act
            var result = Exercise.ex1LongestSubarrayZeroSum(arr);

            // Assert
            Assert.Equal(0, result);
        }

        [Fact]
        public void ex2CheckPairSum_PairExists_ReturnsOne()
        {
            // Arrange
            int target = 5;
            int[] B = new int[] { 1, 4, 3 };

            // Act
            var result = Exercise.ex2CheckPairSum(target, B);

            // Assert
            Assert.Equal(1, result);
        }

        [Fact]
        public void ex2CheckPairSum_NoPair_ReturnsZero()
        {
            // Arrange
            int target = 10;
            int[] B = new int[] { 1, 2, 3 };

            // Act
            var result = Exercise.ex2CheckPairSum(target, B);

            // Assert
            Assert.Equal(0, result);
        }

        [Fact]
        public void ex2CheckPairSum_EmptyArray_ReturnsZero()
        {
            // Arrange
            int target = 0;
            int[] B = new int[0];

            // Act
            var result = Exercise.ex2CheckPairSum(target, B);

            // Assert
            Assert.Equal(0, result);
        }

        [Fact]
        public void ex3DistinctNumbersInWindow_GeneralCase_ReturnsCounts()
        {
            // Arrange
            var A = new List<int> { 1, 2, 1, 3, 4 };
            int B = 3;

            // Act
            var result = Exercise.ex3DistinctNumbersInWindow(A, B);

            // Assert
            Assert.Equal(new List<int> { 2, 3, 3 }, result);
        }

        [Fact]
        public void ex3DistinctNumbersInWindow_WindowSizeOne_ReturnsOnes()
        {
            // Arrange
            var A = new List<int> { 1, 2, 2 };
            int B = 1;

            // Act
            var result = Exercise.ex3DistinctNumbersInWindow(A, B);

            // Assert
            Assert.Equal(new List<int> { 1, 1, 1 }, result);
        }

        [Fact]
        public void ex3DistinctNumbersInWindow_RemovalToZero_RemovesKey()
        {
            // Arrange
            var A = new List<int> { 1, 2, 1, 3 };
            int B = 2;

            // Act
            var result = Exercise.ex3DistinctNumbersInWindow(A, B);

            // Assert
            // windows: [1,2]->2; [2,1]->2; [1,3]->2
            Assert.Equal(new List<int> { 2, 2, 2 }, result);
        }
    }
}
