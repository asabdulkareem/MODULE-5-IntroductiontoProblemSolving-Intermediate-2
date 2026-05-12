package day48;

import java.util.HashMap;
import java.util.HashSet;

public class Exercise {
    public static int[] ex1FrequencyOfElementQuery(int[] A, int[] B){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < A.length; i++){
            if(map.containsKey(A[i])){
                map.put(A[i], map.get(A[i]) + 1);
            }
            else{
                map.put(A[i], 1);
            }
        }
        int[] result = new int[B.length];
        for(int i = 0; i < B.length; i++){
            if(map.containsKey(B[i])){
                result[i] = map.get(B[i]);
            }
            else{
                result[i] = 0;
            }
        }
        return result;
    }
    public static int ex2FirstRepeatingElement(int[] A){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = A.length-1; i >= 0; i--){
            if(map.containsKey(A[i])){
                return A[i];
            }
            else{
                map.put(A[i], 1);
            }
        }
        return -1;
    }
    public static int ex3SubArrayWith0Sum(int[] A){
        HashSet<Long> set = new HashSet<>();
        Long fs = new Long(0);
        for(int i = 0; i < A.length; i++){
            fs += A[i];
            if(set.contains(fs) || fs == 0){
                return i;
            }
            else{
                set.add(fs);
            }
        }
        return -1;
    }
    public static int ex5CountUniqueElements(int[] A){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < A.length; i++){
            set.add(A[i]);
        }
        return set.size();
    }
}
