using System;
using System.Collections.Generic;
using System.Text;
using Xunit;
using Intermediate.day44;

namespace TestIntermediate.day44
{
    public class TestExercise
    {
        [Fact]
        public void Ex1CheckBit_BasicPositions()
        {
            // 5 -> binary 101
            Assert.Equal(1, Exercise.ex1CheckBit(5, 0));
            Assert.Equal(0, Exercise.ex1CheckBit(5, 1));
            Assert.Equal(1, Exercise.ex1CheckBit(5, 2));

            // zero has no set bits
            Assert.Equal(0, Exercise.ex1CheckBit(0, 3));
        }

        [Fact]
        public void Ex2NumberOf1Bits_VariousInputs()
        {
            Assert.Equal(0, Exercise.ex2NumberOf1Bits(0));
            Assert.Equal(3, Exercise.ex2NumberOf1Bits(7)); // 111
            Assert.Equal(1, Exercise.ex2NumberOf1Bits(8)); // 1000

            // int.MaxValue is 0x7FFFFFFF -> 31 ones
            Assert.Equal(31, Exercise.ex2NumberOf1Bits(int.MaxValue));
        }

        [Fact]
        public void Ex3SetBit_SetsRequestedBits()
        {
            Assert.Equal((1 << 1) | (1 << 3), Exercise.ex3SetBit(1, 3));
            Assert.Equal((1 << 2), Exercise.ex3SetBit(2, 2));

            // check higher bit indices (within 0..30 to avoid sign-bit surprises)
            Assert.Equal((1 << 0) | (1 << 30), Exercise.ex3SetBit(0, 30));
        }

        [Fact]
        public void Ex4UnSetBit_ClearsOnlyTargetBit()
        {
            // 5 -> 0b101, clearing bit 2 yields 1
            Assert.Equal(1, Exercise.ex4UnSetBit(5, 2));

            // clearing an unset bit leaves the number unchanged
            Assert.Equal(5, Exercise.ex4UnSetBit(5, 1));

            // clearing lowest bit
            Assert.Equal(0, Exercise.ex4UnSetBit(1, 0));
        }
    }
}
