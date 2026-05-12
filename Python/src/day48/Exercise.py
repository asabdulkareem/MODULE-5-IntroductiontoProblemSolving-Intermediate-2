class Exercise:
    def ex1FrequencyOfElementQuery(self, arr, queries):
        frequency = {}
        for num in arr:
            frequency[num] = frequency.get(num, 0) + 1

        result = []
        for query in queries:
            result.append(frequency.get(query, 0))

        return result

    def ex2FirstRepeatingElement(self, arr):
        seen = set()
        ans = -1
        for i in range(len(arr)-1, -1, -1):
            if arr[i] not in seen:
                seen.add(arr[i])
            else:
                ans = arr[i]
        return ans

    def ex3SubArrayWith0Sum(self, arr):
        prefix_sum = 0
        seen_sums = set()
        for num in arr:
            prefix_sum += num
            if prefix_sum == 0 or prefix_sum in seen_sums:
                return True
            seen_sums.add(prefix_sum)
        return False

    def ex5CountUniqueElements(self, arr):
        unique_elements = set(arr)
        return len(unique_elements)