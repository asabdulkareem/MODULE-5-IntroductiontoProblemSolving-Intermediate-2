using System;
using System.Collections.Generic;
using System.Text;

namespace Intermediate.day45
{
    public class Exercise
    {
        public int ex1PowerWithModules(int A, int B, int C)
        {
            long result = 1;
            for(int i=0; i < B; i++)
            {
                result = (result * (A%B)) % C;
            }
            return (int)result;
        }
        public int ex2ModArray(int[] A, int B)
        {
            long exp = 1;
            long ans = 0;
            for(int i=A.Length-1; i >= 0; i--)
            {
                ans = (ans + (A[i] % B) * exp) % B;
                exp = (exp * 10) % B;
            }
            return (int)ans;
        }
        public int ex3DivisibilityBy3(int[] A)
        {
            int sum = 0;
            for(int i=0; i < A.Length; i++)
            {
                sum += A[i];
            }
            return (sum%3)==0? 1 : 0;
        }
    }
}