package day48;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Additional {
    public static int ex1CountSubArrayZeroSum(int[] arr) {
        long carrySum = 0;
        long count = 0;
        HashMap<Long, Integer> map = new HashMap<Long, Integer>();
        for (int j : arr) {
            carrySum += j;
            if (map.containsKey(carrySum)) {
                count += map.get(carrySum);
                map.replace(carrySum, map.get(carrySum) + 1);
            } else {
                map.put(carrySum, 1);
            }
            if(carrySum == 0){
                count++;
            }
        }
        return (int)count%1000000007;
    }
    public static ArrayList<Integer> ex2CommonElements(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> mapA = getIntegerIntegerHashMap(arr1);
        HashMap<Integer, Integer> mapB = getIntegerIntegerHashMap(arr2);
        for (Integer i : mapA.keySet()) {
            if (mapB.containsKey(i)) {
                int len = i > mapB.get(i) ? mapB.get(i) : mapA.get(i);
                for (int j = 0; j < len; j++) {
                    list.add(i);
                }
            }
        }
        return list;
    }

    private static HashMap<Integer, Integer> getIntegerIntegerHashMap(int[] arr1) {
        HashMap<Integer, Integer> mapA = new HashMap<>();
        for (int i : arr1) {
            if(mapA.containsKey(i)){
                mapA.replace(i, mapA.get(i) + 1);
            }
            else {
                mapA.put(i, 1);
            }
        }
        return mapA;
    }
    public static int ex3ColorfulNumber(int n) {
        ArrayList<Integer> digits = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int sum = 1;
        while (n > 0) {
            digits.add(n % 10);
            for (int i=digits.size()-1;i>=0;i--) {
                if(set.contains(sum * digits.get(i))){
                    return 0;
                }
                else{
                    sum *= digits.get(i);
                    set.add(sum);
                }
            }
            n /= 10;
            sum = 1;
        }
        return 1;
    }
    public static int ex4CountUniqueElements(int[] arr) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            if(map.containsKey(i)){
                map.replace(i, map.get(i) + 1);
            }
            else {
                map.put(i, 1);
            }
        }
        for(Integer i : map.keySet()){
            if(map.get(i) == 1){
                count++;
            }
        }
        return count;
    }

}
