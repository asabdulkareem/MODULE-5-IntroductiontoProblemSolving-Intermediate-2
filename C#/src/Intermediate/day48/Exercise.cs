using System;
using System.Collections.Generic; 
using System.Text;

namespace Intermediate.day48
{
    public class Exercise
    {
        public static int[] ex1FrequencyOfElementQuery(int[] A, int[] B)
        {
            Dictionary<int, int> frequencyMap = new Dictionary<int, int>();
            foreach (int num in A)
            {
                if (frequencyMap.ContainsKey(num))
                {
                    frequencyMap[num]++;
                }
                else
                {
                    frequencyMap[num] = 1;
                }
            }

            int[] result = new int[B.Length];
            for (int i = 0; i < B.Length; i++)
            {
                result[i] = frequencyMap.ContainsKey(B[i]) ? frequencyMap[B[i]] : 0;
            }

            return result;
        }

        public static int ex2FirstRepeatingElement(int[] A)
        {
            HashSet<int> set = new HashSet<int>();
            foreach (int num in A)
            {
                if (set.Contains(num))
                {
                    return num;
                }
                else
                {
                    set.Add(num);
                }
            }

            return -1; // No repeating element found
        }

        public static int ex3SubArrayWith0Sum(int[] A)
        {
            HashSet<int> prefixSums = new HashSet<int>();
            int currentSum = 0;
            foreach (int num in A)
            {
                currentSum += num;
                if (currentSum == 0 || prefixSums.Contains(currentSum))
                {
                    return 1; // Subarray with sum 0 found
                }
                prefixSums.Add(currentSum);
            }
            return 0; // No subarray with sum 0 found
        }

        public static int ex5CountUniqueElements(int[] A)
        {
            HashSet<int> uniqueElements = new HashSet<int>();
            foreach (int num in A)
            {
                uniqueElements.Add(num);
            }
            return uniqueElements.Count;

        }
    }
}
