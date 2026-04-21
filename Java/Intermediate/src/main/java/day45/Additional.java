package day45;

public class Additional {
    public int ex1LeapYear(int A){
        if(A%4==0){
            if(A%100==0){
                if(A%400==0){
                    return 1;
                }
                return 0;
            }
            return 1;
        }
        return 0;
    }
    public int ex2DivisibilityBy8(String A){
        int exp=1;
        int ans=0;
        for(int i=A.length()-1; i>=0; i--){
            ans = (ans + ((A.charAt(i)-'0')%8)*exp)%8;
            exp = (exp*10)%8;
        }
        return ans%8==0?1:0;
    }
    public int ex3ConcatenateThreeNumbers(int A, int B, int C){
        if(A<B && A<C){
            if(B<C)
                return A*10000+B*100+C;
            else
                return  A*10000+C*100+B;
        }
        else if(B<C)
        {
            if(A<C)
                return B*10000+A*100+C;
            else
                return B*10000+C*100+A;
        }
        else{
            if(A<B)
                return C*10000+A*100+B;
            else
                return C*10000+B*100+A;
        }
    }

}
