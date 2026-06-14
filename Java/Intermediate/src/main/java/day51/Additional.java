package day51;

import java.util.ArrayList;

public class Additional {
    public static int ex1IsMagic(int A) {
        if(A/10==0){
            if(A%10==1){
                return 1;
            }
            else{
                return 0;
            }
        }
        int sum = 0;
        while(A%10!=0){
            sum += A%10;
            A/=10;
        }
        return ex1IsMagic(sum);
    }
    public static int ex2KthSymbolEasy(int A, int B){
        ArrayList<Integer> result = kthSymbolEasy(A);
        return result.get(B);
    }
    public static ArrayList<Integer> kthSymbolEasy(int A){
        ArrayList<Integer> result = new ArrayList<>();
        if(A==1){
            result.add(0);
            return result;
        }
        ArrayList<Integer> Arry = kthSymbolEasy(A-1);
        for(int i=0; i<Arry.size(); i++) {
            if (Arry.get(i) == 0) {
                result.add(0);
                result.add(1);
            }
            else {
                result.add(1);
                result.add(0);
            }
        }
        return result;
    }
    public static int ex3KthSymbolHard(int A, int B) {
        if(A==0){
            return 0;
        }
        int val = ex3KthSymbolHard(A-1, B/2);
        if(A%2==0){
            return val;
        }
        return 1-val;
    }
    public static int ex4JosephusProblem(int A, int B){
        if(A==1){
            return 1;
        }
        return (ex4JosephusProblem(A-1, B)+B-1)%A+1;
    }
}
