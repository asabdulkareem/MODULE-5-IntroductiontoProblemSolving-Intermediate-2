package day51;

public class Exercise {
    public static int ex1ImplementPowerFunction(int A, int B, int C){
        if(B==0){
            return 1;
        }
        if(B==1){
            return A%C;
        }
        long ans = ex1ImplementPowerFunction(A, B/2, C);
        ans = (ans*ans)%C;
        if(B%2==1){
            ans = (ans*A)%C;
        }
        if(ans<0){
            ans = ans + C;
        }
        return (int)ans;
    }
}
