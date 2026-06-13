package day49;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Exercise {
    public static int ex1LongestSubarrayZeroSum(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum =0;
        int length=0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(map.containsKey(sum) && sum != 0){
                if(length<i-map.get(sum)){
                    length=i-map.get(sum);
                }
            }
            else{
                if(sum==0 && length<i+1){
                    length=i+1;
                }
                map.put(sum,i);
            }
        }
        return length;
    }
    public static int ex2CheckPairSum(int A, int[] B){
        HashSet<Integer> set = new HashSet<>();
        for(int val : B){
            if(set.contains(A-val)){
                return 1;
            }
            set.add(val);
        }
        return 0;
    }

    public static ArrayList<Integer> ex3DistinctNumbersInWindow(ArrayList<Integer> A, int B){
        ArrayList<Integer> res = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<B; i++){
            map.put(A.get(i), map.getOrDefault(A.get(i), 0) + 1);
        }
        res.add(map.size());
        for(int i=B; i<A.size(); i++){
            if(map.getOrDefault(A.get(i-B), 0) == 1){
                map.remove(A.get(i-B));
            }
            else{
                map.put(A.get(i-B), map.getOrDefault(A.get(i-B), 0) - 1);
            }
            map.put(A.get(i), map.getOrDefault(A.get(i), 0) + 1);
            res.add(map.size());
        }
        return res;
    }
}
