from functools import cmp_to_key
class Exercise:
    def ex1ElementsRemoval(self, arr):
        arr.sort(reverse=True)
        total = 0
        for i in range(len(arr)):
            total += arr[i]
        ans = total
        for i in range(len(arr)):
            total -= arr[i]
            ans += total
        return ans

    def ex2NobleInteger(self, arr):
        arr.sort(reverse=True)
        greater = 0
        for i in range(1, len(arr)):
            if arr[i-1] != arr[i]:
                greater = len(arr)-1-i
            if greater == arr[i]:
                return 1
        return -1

    def ex3FactorsSort(self, arr):
        def countFactors(num):
            count = 0
            i = 1
            while i * i <= num:
                if (num % i == 0):
                    count += 1
                    if (i * i != num):
                        count += 1
                i += 1
            return count
        def compare(x, y):
            count1 = countFactors(x)
            count2 = countFactors(y)
            if count1 == count2:
                return x - y
            return count1 - count2
        arr.sort(key=cmp_to_key(compare))
        return arr

    def ex4LargestNumber(self, arr):
        # Sort numbers as strings using a comparator that
        # places x before y if x+y is greater than y+x


        # Convert all numbers to strings
        strs = list(map(str, arr))

        def compare(x, y):
            if x + y > y + x:
                return -1
            if x + y < y + x:
                return 1
            return 0

        strs.sort(key=cmp_to_key(compare))
        ans = ''.join(strs)
        if not ans or ans == '0':
            return '0'
        # Edge case: when the highest number is '0', the result is '0'
        from decimal import Decimal
        if ans[0] == '0':
            ans = str(Decimal(ans))
        return ans
