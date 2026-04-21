using System;
using System.Collections.Generic;
using System.Text;
using Intermediate.day45;
using Intermediate;

namespace TestIntermediate.day45
{
    public class TestExercise
    {
        [Theory]
        [InlineData(2, 3, 5, 3)] // (2^3)%5 = 8%5 = 3
        [InlineData(10, 0, 7, 1)] // (10^0)%7 = 1
        [InlineData(5, 1, 1, 0)] // (5^1)%1 = 0
        [InlineData(7, 2, 4, 1)] // (7^2)%4 = 49%4 = 1
        public void ex1PowerWithModules_Works(int A, int B, int C, int expected)
        {
            var ex = new Exercise();
            Assert.Equal(expected, ex.ex1PowerWithModules(A, B, C));
        }

        [Theory]
        [InlineData(new int[]{1,2,3}, 4, 3)] // 123%4 = 3
        [InlineData(new int[]{9,9,9,9}, 10, 9)] // 9999%10 = 9
        [InlineData(new int[]{0}, 7, 0)] // 0%7 = 0
        [InlineData(new int[]{1,0,0,0}, 3, 1)] // 1000%3 = 1
        public void ex2ModArray_Works(int[] A, int B, int expected)
        {
            var ex = new Exercise();
            Assert.Equal(expected, ex.ex2ModArray(A, B));
        }

        [Theory]
        [InlineData(new int[]{1,2,3}, 1)] // 1+2+3=6, 6%3==0
        [InlineData(new int[]{1,1,2}, 0)] // 1+1+1=3, 3%3==0
        [InlineData(new int[]{2,2,2}, 1)] // 2+2+2=6, 6%3==0
        [InlineData(new int[]{1,2,5}, 0)] // 1+2+4=7, 7%3==1
        public void ex3DivisibilityBy3_Works(int[] A, int expected)
        {
            var ex = new Exercise();
            Assert.Equal(expected, ex.ex3DivisibilityBy3(A));
        }
    }
}
