using System;
using System.Collections.Generic;
using System.Text;
using Intermediate.day51;

namespace TestIntermediate.day51
{
    public class TestExercise
    {
        [Fact]
        public void Testex1ImplementPowerFunction()
        {
            Assert.Equal(1, Exercise.ex1ImplementPowerFunction(2, 0, 1000)); // 2^0 % 1000 = 1
            Assert.Equal(2, Exercise.ex1ImplementPowerFunction(2, 1, 1000)); // 2^1 % 1000 = 2
            Assert.Equal(4, Exercise.ex1ImplementPowerFunction(2, 2, 1000)); // 2^2 % 1000 = 4
            Assert.Equal(8, Exercise.ex1ImplementPowerFunction(2, 3, 1000)); // 2^3 % 1000 = 8
            Assert.Equal(16, Exercise.ex1ImplementPowerFunction(2, 4, 1000)); // 2^4 % 1000 = 16
        }
    }
}
