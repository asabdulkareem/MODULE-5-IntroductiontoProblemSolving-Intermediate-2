package day50;

public class Additional {
    public static String ex1ReverseString(String str) {
        if (str == null || str.isEmpty() || str.length() == 1) {
            return str;
        }
        int end  = str.length() - 1;
        int start = 0;
        StringBuilder sb = new StringBuilder(str);
        return reverseString(sb, start, end).toString();
    }
    public static StringBuilder reverseString(StringBuilder str, int start, int end) {
        if (start >= end) {
            return str;
        }
        char temp = str.charAt(start);
        str.setCharAt(start, str.charAt(end));
        str.setCharAt(end, temp);
        reverseString(str, start + 1, end-1);
        return str;
    }
    public static int ex2SumOfDigits(int num) {
        if(num < 10) {
            return num;
        }
        return num%10 + ex2SumOfDigits(num/10);
    }
}
