using System;
using System.Collections.Generic;
using System.Text;

namespace Intermediate.day50
{
    public class Exercise
    {
        public static int ex1findAthFibonacci(int n)
        {
            if(n==1 || n==2) return 1;
            return ex1findAthFibonacci(n - 1) + ex1findAthFibonacci(n - 2);
        }

        public static int ex2Factorial(int n)
        {
            if(n==1) return 1;
            return n * ex2Factorial(n - 1);
        }

        public static int ex3PalindromeUsingRecursion(String A)
        {
            if (A.Length == 1)
            {
                return 1;
            }
            int start = 0;
            int end = A.Length - 1;
            return polindrome(A, start, end);
        }

        public static int polindrome(String A, int start, int end)
        {
            if (start >= end)
            {
                return 1;
            }
            else if (A[start] == A[end])
            {
                return polindrome(A, start + 1, end - 1);
            }
            else
            {
                return 0;
            }
        }

        public static String ex4Print1ToAFunction(int n)
        {
            if (n == 1) return "1";
            return ex4Print1ToAFunction(n - 1) + " " + n;
        }

        public static String ex5PrintATo1Function(int n)
        {
            if (n == 1) return "1";
            return n + " " + ex5PrintATo1Function(n - 1);
        }

        public static string ex1ReverseString(string str)
        {
            StringBuilder sb = new StringBuilder(str);
            int start = 0;
            int end = sb.Length;
            return reverseString(sb, start, end).ToString();
        }
        public static StringBuilder reverseString(StringBuilder A, int start, int end)
        {
            if (start >= end)
            {
                return A;
            }
            (A[start], A[end]) = (A[end], A[start]);
            return reverseString(A, start + 1, end - 1);
        }
}
}
