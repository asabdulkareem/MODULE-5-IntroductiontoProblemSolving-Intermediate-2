package day49;

import java.util.*;

public class Additional {
    public static int ex1CountPairSum(int[] A, int B){
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : A){
            if(map.containsKey(B-num)){
                count += map.get(B-num);
            }
            map.put(num, map.getOrDefault(num, 0) +1);
        }
        return count;
    }
    public static int ex2CountPairDifference(ArrayList<Integer> A, int B) {
        long count = 0;
        final int mod = (int)(1e9 + 7);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : A){
            if(map.getOrDefault(num-B, 0) > 0){
                count += map.getOrDefault(num-B, 0);
            }
            else if(map.getOrDefault(num+B, 0) > 0){
                count += map.getOrDefault(num+B, 0) ;
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return (int)(count % mod);
    }
    public static int ex3PairWithGivenDifference(int[] A, int B){
        int count =0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : A){
            if(set.contains(num+B) || set.contains(num-B)){
                return 1;
            }
            set.add(num);
        }
        return 0;
    }
    public static ArrayList<Integer> ex4SubarrayWithGivenSum(ArrayList<Integer> A, int B) {
        ArrayList<Integer> res = new ArrayList<>();
        int sum =0;
        int index = 0;
        for(int i=0; i<A.size(); i++){
            sum += A.get(i);
            if(sum == B){
                res = new ArrayList<>(A.subList(index, i+1));
                return res;
            }
            else if(sum > B){
                while(index<=i){
                    sum -= A.get(index);
                    index++;
                    if(sum < B){
                        break;
                    }
                    if(sum == B){
                        res = new ArrayList<>(A.subList(index, i+1));
                        return res;
                    }
                }
            }
        }
        return new ArrayList<>(Arrays.asList(-1));
    }
    public static int ex5SubarraySumEqualsK(ArrayList<Integer> A, int B) {
        int count=0;
        int sum =0;
        int index = 0;
        for(int i=0; i<A.size(); i++){
            sum+=A.get(i);
            if(sum == B){
                count++;
            }
            else if(sum>B){
                while(index<=i){
                    sum -= A.get(index);
                    index++;
                    if(sum == B){
                        count++;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        return count;
    }
    public static int ex5SubarraySumEqualsK2(ArrayList<Integer> A, int B) {
        HashMap<Integer, Integer> preSum = new HashMap<>();
        int count = 0;
        int sum = 0;
        for(int i=0; i<A.size(); i++){
            sum += A.get(i);
            if(sum == B){
                count++;
            }
            count += preSum.getOrDefault(sum-B, 0);
            preSum.put(sum, preSum.getOrDefault(sum, 0)+1);
        }
        return count;
    }
    public static int ex6IsDictionary(ArrayList<String> A, String B) {
        int[] idx = new int[26];
        for(int i=0; i<B.length(); i++){
            idx[B.charAt(i)-'a'] = i;
        }
        for(int i=0; i<A.size()-1; i++){
            String x = A.get(i);
            String y = A.get(i+1);
            int lenght = Math.min(x.length(), y.length());
            int flag = 0;
            for(int j=0; j<lenght;j++){
                int c1 = x.charAt(j)-'a';
                int c2 = x.charAt(j)-'a';
                if(c1==c2){
                    continue;
                }
                else if(idx[c1]<idx[c2]){
                    flag = 1;
                    break;
                }
                else{
                    return 0;
                }
            }
            if(flag==0 && x.length()>y.length()){
                return 0;
            }
        }
        return 1;
    }
    public static int ex7ValidSudoku(List<String> A){
        if(A == null){
            return 0;
        }
        int n = A.size();
        if (n != 9 || A.get(0).length() != 9)
            return 0;
        HashSet<Character> hashSet = new HashSet<>();
        for(int i=0; i<9; i++){
            hashSet.clear();
            for(int j=0; j<9; j++){
                char c = A.get(j).charAt(i);
                if(c == '.')
                    continue;
                if(hashSet.contains(c))
                    return 0;
                hashSet.add(c);
            }
        }
        for(int i=0; i<9; i++){
            hashSet.clear();
            for(int j=0; j<9; j++){
                char c = A.get(j).charAt(i);
                if(c == '.')
                    continue;
                if(hashSet.contains(c))
                    return 0;
                hashSet.add(c);
            }
        }
        for(int k=0; k<9; k++){
            int x = k / 3;
            int y = k % 3;
            hashSet.clear();
            for(int i=x*3; i<x*3+3;i++){
                for(int j=y*3; j<y*3+3;j++){
                    char c = A.get(i).charAt(j);
                    if(c == '.')
                        continue;
                    if(hashSet.contains(c))
                        return 0;
                    hashSet.add(c);
                }
            }
        }
        return 1;
    }

    public static int ex8PairsWithGivenXor(ArrayList<Integer> A, int B) {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : A){
            if(set.contains(num ^ B)){
                count++;
            }
            set.add(num);
        }
        return count;
    }
}
