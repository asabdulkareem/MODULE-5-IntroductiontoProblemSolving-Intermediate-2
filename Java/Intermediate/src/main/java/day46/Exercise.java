package day46;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exercise {
    public static int ex1ElementsRemoval(int [] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        int ans = 0;
        Arrays.sort(array);
        for (int i = array.length-1; i >= 0; i--) {
            ans += sum;
            sum -= array[i];
        }
        return ans;
    }
    public static int ex2NobleInteger(int[] array) {
        Arrays.sort(array);
        int greater = 0;
        for (int i = array.length-1; i >= 0; i--) {
            if(i==array.length-1){
                greater = 0;
            }
            else if (array[i] != array[i+1]) {
                greater = array.length - 1 - i;
            }
            if (array[i] == greater) {
                return 1;
            }
        }
        return -1;
    }
    static Integer countFactors(Integer n){
        Integer count = 0;
        for(Integer i = 1 ; i * i <= n ; i++){
            if(n % i == 0){
                count++;
                if(i * i != n){
                    count++;
                }
            }
        }
        return count;
    }
    public static int[] ex3FactorsSort(int[] A) {
        List<Integer> result = Arrays.stream(A)
                .boxed().sorted(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        int count1 = countFactors(o1);
                        int count02 = countFactors(o2);
                        if(count1 == count02){
                            return Integer.compare(o1, o2);
                        }
                        return Integer.compare(count1, count02);
                    }
                }).toList();
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    public static String ex4LargestNumber(int[] A) {
        List<Integer> result = Arrays.stream(A)
                .boxed().sorted(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        String s1 = String.valueOf(o1);
                        String s2 = String.valueOf(o2);
                        long i1=Long.parseLong(s1+s2);
                        long i2=Long.parseLong(s2+s1);
                        return Long.compare(i2, i1);
                    }
                }).toList();
        String ans = "";
        for(int i=0;i<result.size();i++){
            ans += result.get(i);
        }
        int flag = 1;
        if(ans.charAt(0) !='0'){
            return ans;
        }
        if(flag==1){
            ans =  String.valueOf(Long.parseLong(ans));
        }
        return ans;
    }
}
