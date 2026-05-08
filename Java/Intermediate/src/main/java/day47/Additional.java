package day47;

import java.util.ArrayList;
import java.util.Collections;

public class Additional {
    public String ex1longestCommonPrefix(ArrayList<String> A) {
        int minLen = A.get(0).length();
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i).length() < minLen) {
                minLen = A.get(i).length();
            }
        }
        String prefix = "";
        for (int i = 0; i < minLen; i++) {
            char c = A.get(0).charAt(i);
            boolean isQualified = true;
            for (int j = 0; j < A.size(); j++) {
                if (A.get(j).charAt(i) != c) {
                    isQualified = false;
                    break;
                }
            }
            if (isQualified) {
                prefix = prefix + c;
            } else {
                return prefix;
            }
        }
        return prefix;
    }

    public int ex2IsAlNum(ArrayList<Character> A) {
        for (int i = 0; i < A.size(); i++) {
            if (!((A.get(i) >= 97 && A.get(i) <= 122) || (A.get(i) >= 48 && A.get(i) <= 57) || (A.get(i) >= 65 && A.get(i) <= 90))) {
                return 0;
            }
        }
        return 1;
    }
    public String ex3StringOperations(String A) {
        A += A;
        A = A.replaceAll("([A-Z])", "");
        A = A.replaceAll("([aeiouAEIOU])", "");
        return A;
    }
    public int ex4ChangeCharacter(String A, int B) {
        int[] countArray =  new int[26];
        for (int i = 0; i < countArray.length; i++) {
            countArray[i] = 0;
        }
        for (int i = 0; i < A.length(); i++) {
            countArray[A.charAt(i) - 'a']++;
        }
        ArrayList<Integer> countArrayList = new ArrayList<>();
        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] > 0) {
                countArrayList.add(countArray[i]);
            }
        }
        Collections.sort(countArrayList);
        for (int i = 0; i < countArrayList.size(); i++) {
            B -= countArrayList.get(i);
            if (B < 0) {
                return countArrayList.size()-i;
            }
        }
        return B;
    }
    public int ex5CountOccurrences(String A){
        int count = 0;
        for(int i=0; i<A.length()-2;i++){
            String val = A.substring(i,i+3);
            if(val.equals("bob")){
                count++;
            }
        }
        return count;
    }
    public int ex6CheckAnagrams(String A, String B){
        int[] countA =  new int[26];
        int[] countB =  new int[26];
        for(int i=0; i<26; i++){
            countA[i]=0;
            countB[i]=0;
        }
        for(int i=0; i<A.length(); i++){
            countA[A.charAt(i) - 'a']++;
        }
        for(int i=0; i<B.length(); i++){
            countB[B.charAt(i) - 'a']++;
        }
        for(int i=0; i<26; i++){
            if(countA[i]!=countB[i]){
                return 0;
            }
        }
        return 1;
    }
    public String ex7AddBinaryStrings(String A, String B){
        StringBuilder result = new StringBuilder();
        int lengthA = A.length(), lengthB = B.length();
        int carry = 0;
        if(lengthA > lengthB){
            for(int i=0; i<lengthA; i++){
                int a = A.charAt(lengthA-1-i) - '0';
                if(i<lengthB){
                    int b =  B.charAt(lengthB-1-i) - '0';
                    result.insert(0, (a + b + carry) % 2);
                    carry = (a+b+carry)/2;
                }
                else{
                    result.insert(0, (a + carry) % 2);
                    carry = (a+carry)/2;
                }
            }
        }
        else{
            for(int i=0; i<lengthB; i++){
                int b = B.charAt(lengthB-1-i) - '0';
                if(i<lengthA){
                    int a =  A.charAt(lengthA-1-i) - '0';
                    result.insert(0, (a + b + carry) % 2);
                    carry = (a+b+carry)/2;
                }
                else{
                    result.insert(0, (b + carry) % 2);
                    carry = (b+carry)/2;
                }
            }
        }
        if(carry > 0){
            result.insert(0, carry);
        }
        return result.toString();
    }
}
