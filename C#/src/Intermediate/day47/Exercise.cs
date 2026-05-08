using System;
using System.Collections.Generic;
using System.Text;

namespace Intermediate.day47
{
    public class Exercise
    {
        public static char[] ex1ToLower(char[] input)
        {
            for(int i=0; i<input.Length; i++)
            {
                if(input[i] >= 'A' && input[i] <= 'Z')
                {
                    input[i] = (char)(input[i] + 32);
                }
            }
            return input;
        }

        public static char[] ex2ToUpper(char[] input)
        {
            for(int i=0; i<input.Length; i++)
            {
                if(input[i] >= 'a' && input[i] <= 'z')
                {
                    input[i] = (char)(input[i] - 32);
                }
            }
            return input;
        }
        public static char[] ex3ToggleCase(char[] input)
        {
            for(int i=0; i<input.Length; i++)
            {
                if(input[i] >= 'A' && input[i] <= 'Z')
                {
                    input[i] = (char)(input[i] + 32);
                }
                else if(input[i] >= 'a' && input[i] <= 'z')
                {
                    input[i] = (char)(input[i] - 32);
                }
            }
            return input;
        }

        public List<int> ex4CountSort(List<int> list)
        {
            int max = list.Max();
            int[] count = new int[max];
            for(int i=0; i<list.Count; i++)
            {
                count[list[i]]++;
            }
            List<int> sortedList = new List<int>();
            for (int i=0; i<count.Length; i++)
            {
                if(count[i] > 0)
                {
                    for(int j=0; j<count[i]; j++)
                    {
                        sortedList.Add(i+1);
                    }
                }
            }
            return sortedList;
        }

        public static String ex5SimpleReverse(String s)
        {
            StringBuilder sb = new StringBuilder(s);
            int start = 0;
            int end = s.Length - 1;
            while (start < end)
            {
                char temp = sb[start];
                sb[start] = sb[end];
                sb[end] = temp;
                start++;
                end--;
            }
            return s;
        }
        public static String ex6ReverseString(String s, int start, int end)
        {
            StringBuilder sb = new StringBuilder(s);
            while (start<end)
            {
                char temp = sb[start];
                sb[start] = sb[end];
                sb[end] = temp;
                start++;
                end--;
            }
            return sb.ToString();
        }

        public static string ex6ReverseTheString(string s)
        {
            s = ex6ReverseString(s, 0, s.Length - 1);
            int i= 0;
            int start = 0;
            while (i<s.Length)
            {
                if (s[i] == ' ')
                {
                    s = ex6ReverseString(s, start, i-1);
                    start = i + 1;
                }
            }
            return s;
        }

        public static string ex7LongestPalindromic(string A)
        {
            int len = A.Length;
            int ans = 0;
            string palindrome = "";
            for(int i=0; i<len; i++)
            {
                int start = i;
                int end = i;
                int lenP = 0;
                while (start > 0 && end < len && A[start] == A[end])
                {
                    if (i > 0 && lenP > 0)
                    {
                        lenP += 2;
                    }
                    else
                    {
                        lenP++;
                    }
                }
                if (lenP > ans)
                {
                    ans = lenP;
                    palindrome = A.Substring(start, end - start + 1);
                }
                start = i;
                if (i + 1 > len)
                {
                    end = i + 1;
                    while (start > 0 && end < len && A[start] == A[end])
                    {
                        lenP++;
                    }
                    if (lenP > ans)
                    {
                        ans = lenP;
                        palindrome = A.Substring(start, end - start + 1);
                    }
                }
            }
            return palindrome;
        }
    }
}
