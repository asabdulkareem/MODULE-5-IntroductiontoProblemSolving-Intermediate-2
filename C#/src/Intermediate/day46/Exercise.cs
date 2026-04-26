using System;
using System.Collections.Generic;
using System.Globalization;
using System.Text;

namespace Intermediate.day46
{
    public class Exercise
    {
        public static int ex1ElementsRemoval(int[] array)
        {
            array = array.OrderByDescending(x => x).ToArray();
            int sum = 0;
            for (int i = 0; i < array.Length; i++)
            {
                sum += array[i];
            }
            int ans = 0;
            for (int i = 0; i < array.Length; i++)
            {
                ans += sum;
                sum -= array[i];
            }
            return ans;
        }
        public static int ex2NobleInteger(int[] array)
        {
            array = array.OrderByDescending(x => x).ToArray();
            int greater = 0;
            for (int i = 0; i < array.Length; i++)
            {
                if (array[i] != array[i - 1])
                {
                    greater = i;
                }
                if (array[i] == greater)
                {
                    return 1;
                }
            }
            return -1;
        }
        public static int ex3Factors(int A)
        {
            int count = 0;
            for (int i = 1; i*i <= A; i++)
            {
                if(A %i == 0) { 
                    count++;
                    if(i*i != A)
                    {
                        count++;
                    }
                }
            }
            return count;
        }
        public static int[] ex3FactorsSort(int[] A)
        {
            A.Sort((x, y) =>
            {
                int c1 = ex3Factors(x);
                int c2 = ex3Factors(y);
                if (c1 == c2)
                {
                    return x.CompareTo(y);
                }
                return c1.CompareTo(c2);
            });
            return A.ToArray();
        }
        public static string ex4LargestNumber(int[] A)
        {
            A.Sort((x, y) => (y.ToString() + x.ToString()).CompareTo(x.ToString() + y.ToString()));
            string sb = A.Aggregate("", (current, t) => current + t);
            if (sb[0] == '0')
            {
                sb = double.Parse(sb).ToString(CultureInfo.CurrentCulture);
            }
            return sb;
        }
    }
}
