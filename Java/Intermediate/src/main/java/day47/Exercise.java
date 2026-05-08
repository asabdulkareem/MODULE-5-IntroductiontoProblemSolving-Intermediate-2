package day47;

import java.util.ArrayList;

public class Exercise {
    public static char[] ex1ToLower(char[] input) {
        for (int i = 0; i < input.length; i++) {
            char c = input[i];
            if(65 <= (int)c && (int)c <= 90)
                input[i] = (char)((int)c + 32);
        }
        return input;
    }
    public static char[] ex2ToUpper(char[] input) {
        for (int i=0; i<input.length; i++) {
            char c = input[i];
            if(97 <= (int)c && (int)c <= 122)
                input[i] = (char)((int)c - 32);
        }
        return input;
    }
    public static char[] ex3ToggleCase(char[] input){
        for(int i=0; i<input.length; i++){
            char c = input[i];
            if(97<= (int)c && (int)c <= 122)
                input[i] = (char)((int)c - 32);
            if(65<= (int)c && (int)c <= 90)
                input[i] = (char)((int)c + 32);
        }
        return input;
    }
    public static ArrayList<Integer> ex4CountSort(ArrayList<Integer> input){
        int max = input.getFirst();
        for(int i=1; i<input.size(); i++){
            if(input.get(i) > max){
                max = input.get(i);
            }
        }
        int[] counter = new int[max];
        for (Integer integer : input) {
            counter[integer - 1]++;
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<counter.length; i++){
            if(counter[i] > 0){
                for(int j=0; j<counter[i]; j++){
                    result.add(i+1);
                }
            }
        }
        return result;
    }
    public static String ex5SimpleReverse(String s){
        int start = 0;
        int end = s.length()-1;
        return reverseString(s, start, end);
    }

    private static String reverseString(String s, int start, int end) {
        char[] charArray = s.toCharArray();
        while(start<end){
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(charArray);
    }

    public static String ex6ReverseTheString(String s){
        s = ex6SimpleReverse(s, 0, s.length()-1);
        int start =0;
        int i =0;
        while(i<s.length()){
            if(s.charAt(i)==' '){
                s = ex6SimpleReverse(s, start, i-1);
                start = i+1;
            }
            i++;
        }
        s = ex6SimpleReverse(s, start, s.length()-1);
        return s;
    }
    public static String ex6SimpleReverse(String s, int start, int end){
        return reverseString(s, start, end);
    }
    public static String ex7LongestPalindromic(String A){
        String palindrome = "";
        int ans=0;
        for(int i=0; i<A.length(); i++){
            int s=i;
            int e=i;
            int len=0;
            while(s>=0 && e<A.length() && A.charAt(s)==A.charAt(e)){
                if(i>0 && len>0){
                    len += 2;
                }
                else {
                    len++;
                }
                s--;
                e++;
            }
            if(ans < len){
                ans = len;
                palindrome = A.substring(s+1, e);
            }
            s=i;
            if(i+1 <A.length()) {
                e = i + 1;
                while (s >= 0 && e < A.length() && A.charAt(s) == A.charAt(e)) {
                    len += 2;
                    s--;
                    e++;
                }
                if (ans < len) {
                    ans = len;
                    palindrome = A.substring(s + 1, e);
                }
            }
        }
        return palindrome;
    }
}
