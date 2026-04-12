class Exercise:
    def ex1CheckBit(self, A, B):
        return (A>>B)&1

    def ex2NumberOf1Bits(self, A):
        count = 0
        while A>0:
            if A&1:
                count += 1
            A = A>>1
        return count

    def ex3SetBit(self, A, B):
        return (1<<A)|(1<<B)

    def ex4UnSetBit(self, A, B):
        if (A>>B)&1:
            return A^(1<<B)
        return A