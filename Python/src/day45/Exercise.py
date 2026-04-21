class Exercise:
    def ex1PowerWithModules(self, A, B, C):
        result = 1
        for i in range(B):
            result = (result * A%B)%B
        return int(result)

    def ex2ModArray(self, A, B):
        n = len(A)
        exp = 1
        ans = 0
        for i in range(n-1, -1, -1):
            ans = (ans + exp*(A[i]%B))%B
            exp = exp * 10 % B
        return int(ans)

    def ex3DivisibilityBy3(self, A):
        sum=0
        for i in range(len(A)):
           sum = sum + A[i]
        return sum%3==0

