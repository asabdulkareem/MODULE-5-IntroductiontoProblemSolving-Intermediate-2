from math import expm1
class Exercise:
    def ex1ImplementPowerFunction(self, x: float, n: int, c: int) -> float:
        if n==0:
            return 1
        ans = self.ex1ImplementPowerFunction(x, abs(n) // 2, c)
        res = ans * ans % c
        if n%2 == 1:
            res = res * x % c
        if res < 0:
            res = res + c
        return res

    def ex4JosephusProblem(self, n: int, k: int) -> int:
        if n == 1:
            return 1
        return (self.ex4JosephusProblem(n - 1, k) + k-1) % n + 1