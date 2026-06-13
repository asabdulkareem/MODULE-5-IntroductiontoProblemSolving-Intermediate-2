class Exercise:
    def ex1findAthFibonacci(self, A):
        if A == 0:
            return 0
        elif A == 1 or A == 2:
            return 1
        else:
            return self.ex1findAthFibonacci(A - 1) + self.ex1findAthFibonacci(A - 2)

    def ex2Factorial(self, A):
        if A == 1:
            return 1
        return A * self.ex2Factorial(A - 1)

    def ex3PalindromeUsingRecursion(self, A):
        if len(A) <= 1:
            return 1
        start = 0
        end = len(A) - 1
        return self.palindromeUsingRecursion(A, start, end)

    def palindromeUsingRecursion(self, A, start, end):
        if start >= end:
            return 1
        if A[start] != A[end]:
            return 0
        return self.palindromeUsingRecursion(A, start + 1, end - 1)

    def ex4Print1ToAFunction(self, A):
        if A == 1:
            return '1'
        return self.ex4Print1ToAFunction(A - 1) + ' ' + str(A)

    def ex5PrintATo1Function(self, A):
        if A == 1:
            return '1'
        return str(A) + ' ' + self.ex5PrintATo1Function(A - 1)

    def ad1ReverseString(self, A):
        if A.size == 1:
            return A
        return self.reversedString(A, 0, len(A) - 1)

    def reversedString(self, A, start, end):
        if start >= end:
            return A
        A[start], A[end] = A[end], A[start]
        return self.reversedString(A, start + 1, end - 1)