package day46;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Additional {
    public static int[] ex1SortByColor(int[] A){
        Arrays.sort(A);
        return A;
    }
    public static int ex2ArithmeticProgression(int[] A){
        Arrays.sort(A);
        int diff = A[1]-A[0];
        for(int i = 2; i < A.length; i++){
            if(A[i]-A[i-1]!=diff){
                return 0;
            }
        }
        return 1;
    }
    static Integer tenthDigit(int n){
        n /= 10;
        return n % 10;
    }
    public static int[] ex3TensDigitSorting(int[] A) {
        List<Integer> result = Arrays.stream(A)
                .boxed().sorted(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer val1, Integer val2) {
                        if (tenthDigit(val1) == tenthDigit(val2)) {
                            return val2 - val1;
                        } else if (tenthDigit(val1) > tenthDigit(val2)) {
                            return 1;
                        } else {
                            return -1;
                        }
                    }
                }).toList();
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
