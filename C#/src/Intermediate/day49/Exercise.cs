using System;
using System.Collections.Generic;
using System.Text;

namespace Intermediate.day49
{
    public class Exercise
    {
        public static int ex1LongestSubarrayZeroSum(int[] arr)
        {
            Dictionary<int, int> map = new Dictionary<int, int>();
            int sum = 0;
            int maxLength = 0;
            for (int i = 0; i < arr.Length; i++)
            {
                sum += arr[i];
                if (map.ContainsKey(sum) && sum != 0)
                {
                    int length = i - map[sum];
                    if (length > maxLength)
                    {
                        maxLength = length;
                    }
                }
                else
                {
                    if (sum == 0 && maxLength < i + 1)
                    {
                        maxLength = i + 1;
                    }
                    map[sum] = i;
                }
            }
            return maxLength;
        }

        public static int ex2CheckPairSum(int A, int[] B)
        {
            HashSet<int> set = new HashSet<int>();
            foreach (int num in B)
            {
                if (set.Contains(A - num))
                {
                    return 1;
                }
                set.Add(num);
            }

            return 0;
        }

        public static List<int> ex3DistinctNumbersInWindow(List<int> A, int B)
        {
            List<int> result = new List<int>();
            Dictionary<int, int> map = new Dictionary<int, int>();
            for (int i = 0; i < B; i++)
            {
                if (map.ContainsKey(A[i]))
                {
                    map[A[i]]++;
                }
                else
                {
                    map[A[i]] = 1;
                }
            }
            result.Add(map.Count);
            for (int i = B; i < A.Count; i++)
            {
                if (map.ContainsKey(A[i - B]))
                {
                    map[A[i - B]]--;
                    if (map[A[i - B]] == 0)
                    {
                        map.Remove(A[i - B]);
                    }
                }
                if (map.ContainsKey(A[i]))
                {
                    map[A[i]]++;
                }
                else
                {
                    map[A[i]] = 1;
                }
                result.Add(map.Count);
            }
            return result;
        }
    }
}
