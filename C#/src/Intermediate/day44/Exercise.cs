using System;
using System.Collections.Generic;
using System.Text;

namespace Intermediate.day44
{
    public class Exercise
    {
        public static int ex1CheckBit(int A, int B)
        {
            return (A >> B) & 1;
        }
        public static int ex2NumberOf1Bits(int A)
        {
            int count = 0;
            while (A > 0)
            {
                if ((A & 1) == 1)
                {
                    count++;
                }
                A = A >> 1;
            }
            return count;
        }
        public static int ex3SetBit(int A, int B)
        {
            return (1 << A) | (1 << B);
        }
        public static int ex4UnSetBit(int A, int B)
        {
            if (((A >> B) & 1) == 1)
            {
                A ^= (1 << B);
            }
            return A;
        }
    }
}
