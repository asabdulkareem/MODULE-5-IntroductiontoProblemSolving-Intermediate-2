from unittest import result


class Exercise:
    def ex1ToLower(self, s):
        for i in range(len(s)):
            if 'A' <= s[i] <= 'Z':
                s[i] = chr(ord(s[i]) + 32)
        return s

    def ex2ToUpper(self, s):
        for i in range(len(s)):
            if 'a' <= s[i] <= 'z':
                s[i] = chr(ord(s[i]) - 32)
        return s

    def ex3ToggleCase(self, s):
        for i in range(len(s)):
            if 'A' <= s[i] <= 'Z':
                s[i] = chr(ord(s[i]) + 32)
            elif 'a' <= s[i] <= 'z':
                s[i] = chr(ord(s[i]) - 32)
        return s

    def ex4CountSort(self, arrayList):
        if len(arrayList) == 0:
            return []
        maxValue = max(arrayList)
        if maxValue < 0:
            counts = []
        else:
            counts = [0] * maxValue

        for i in range(len(arrayList)):
            counts[arrayList[i]-1] += 1
        result = []
        for i in range(len(counts)):
            if counts[i] > 0:
                for i in range(counts[i]):
                    result.append(i+1)
        return result

    def ex5SimpleReverse(self, s):
        start=0
        end=len(s)-1
        while start < end:
            s[start], s[end] = s[end], s[start]
            start += 1
            end -= 1
        return s

    def ex6SimpleReverse(self, s, start=0, end=None):
        if end is None:
            end = len(s)-1
        while start < end:
            s[start], s[end] = s[end], s[start]
            start += 1
            end -= 1
        return s

    def ex6ReverseTheString(self, s):
        def ex6SimpleReverse(self, s, start=0, end=None):
            if end is None:
                end = len(s) - 1
            while start < end:
                s[start], s[end] = s[end], s[start]
                start += 1
                end -= 1
            return s
        s = ex6SimpleReverse(s, 0, len(s))
        i=0
        start = 0
        while i < len(s):
            if s[i] == ' ':
                s = ex6SimpleReverse(s, i-1)
                start = i+1
            i += 1
        s = ex6SimpleReverse(s, start, len(s)-1)
        return s

    def ex7LongestPalindromic(self, s):
        lenS = len(s)
        ans=0
        palindrome= ""
        for i in range(lenS):
            start=i
            end=i
            lenP=0
            while start>0 and end<lenS and s[start]==s[end]:
                if i>0 and lenP>0:
                    lenP += 2
                else:
                    lenP += 1
                start -= 1
                end += 1
            if lenP > ans:
                ans = lenP
                palindrome = s[start + 1:end]
            s=i
            end=i
            if i+1<lenS:
                while start>0 and end<lenS and s[start]==s[end]:
                    lenP += 2
                    start -= 1
                    end += 1
                if lenP > ans:
                    ans = lenP
                    palindrome = s[start + 1:end]
        return palindrome