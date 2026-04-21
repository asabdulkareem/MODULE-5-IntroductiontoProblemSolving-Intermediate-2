package day45;

public class Exercise {
    public int ex1PowerWithModules(int A, int B, int C){
        long result = 1;
        for (int i = 0; i < B; i++) {
            result = (result * (A%C)) % C;
        }
        return (int) result;
    }
    public int ex2ModArray(int[] A, int B){
        long ans = 0;
        long exp = 1;
        for (int i = A.length-1; i >= 0; i--) {
            ans = (ans + ((A[i]%B)*exp)%B)%B;
            exp = (exp*10)%B;
        }
        return (int) ans;
    }
    public int ex3DivisibilityBy3(int[] A){
        int result = 0;
        for (int i = A.length-1; i >= 0; i--) {
            result += A[i];
        }
        return result%3==0? 1: 0;
    }
}
