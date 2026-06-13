using System;
using System.Text;
using Xunit;
using Intermediate.day50;

namespace TestIntermediate.day50
{
    public class TestExercise
    {
        [Fact]
        public void Ex1findAthFibonacci_BaseCases()
        {
            Assert.Equal(1, Exercise.ex1findAthFibonacci(1));
            Assert.Equal(1, Exercise.ex1findAthFibonacci(2));
        }

        [Fact]
        public void Ex1findAthFibonacci_GeneralCase()
        {
            // 1,1,2,3,5,8,13,21,34,55
            Assert.Equal(5, Exercise.ex1findAthFibonacci(5));
            Assert.Equal(55, Exercise.ex1findAthFibonacci(10));
        }

        [Fact]
        public void Ex2Factorial_BaseAndGeneralCase()
        {
            Assert.Equal(1, Exercise.ex2Factorial(1));
            Assert.Equal(120, Exercise.ex2Factorial(5));
            Assert.Equal(720, Exercise.ex2Factorial(6));
        }

        [Fact]
        public void Ex3PalindromeUsingRecursion_SingleCharAndPalindromes()
        {
            Assert.Equal(1, Exercise.ex3PalindromeUsingRecursion("a"));
            Assert.Equal(1, Exercise.ex3PalindromeUsingRecursion("racecar"));
            Assert.Equal(0, Exercise.ex3PalindromeUsingRecursion("hello"));
        }

        [Fact]
        public void Ex4Print1ToAFunction_GeneratesSequence()
        {
            Assert.Equal("1", Exercise.ex4Print1ToAFunction(1));
            Assert.Equal("1 2 3 4", Exercise.ex4Print1ToAFunction(4));
        }

        [Fact]
        public void Ex5PrintATo1Function_GeneratesReverseSequence()
        {
            Assert.Equal("1", Exercise.ex5PrintATo1Function(1));
            Assert.Equal("4 3 2 1", Exercise.ex5PrintATo1Function(4));
        }

        [Fact]
        public void ReverseString_DirectHelper_WorksWithCorrectIndices()
        {
            var sb = new StringBuilder("abcdef");
            // end is inclusive for the helper; last index = 5
            var result = Exercise.reverseString(sb, 0, 5).ToString();
            Assert.Equal("fedcba", result);
        }

        [Fact]
        public void Ex1ReverseString_CurrentImplementation_ThrowsIndexOutOfRange()
        {
            // The public wrapper sets end = sb.Length which is out of valid index range.
            Assert.Throws<IndexOutOfRangeException>(() => Exercise.ex1ReverseString("abc"));
        }
    }
}