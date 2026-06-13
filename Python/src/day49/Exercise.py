class Exercise:
    def ex1LongestSubarrayZeroSum(self, arr):
        map = {}
        sum = 0
        length = 0
        for i in range(len(arr)):
            sum += arr[i]
            if sum in map and sum != 0:
                if length < i-map.get(sum, 0):
                    length = i-map.get(sum, 0)
            else:
                if sum ==0 and length < i+1:
                    length = i+1
                else:
                    map[sum] = map.get(sum, 0) + 1
                map[sum] = 1
        return length

    def ex2CheckPairSum(self, arr, target):
        seen = set()
        for num in arr:
            comp = target - num
            if comp in seen:
                return True
            seen.add(num)
        return False

    def ex3DistinctNumbersInWindow(self, arr, k):
        result = []
        map = {}
        for i in range(k):
            map[arr[i]] = map.get(arr[i], 0) + 1
        result.append(len(map))
        for i in range(k, len(arr), 1):
            if map.get(arr[i-k], 0) == 1:
                del map[arr[i-k]]
            else:
                map[arr[i-k]] = map.get(arr[i-k], 0) - 1
            map[arr[i]] = map.get(arr[i], 0) + 1
            result.append(len(map))
        return result
