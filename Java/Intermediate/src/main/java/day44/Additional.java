package day44;

public class Additional {
    public static int ex1ToggleIthBit(int A, int B){
        return A^(1<<B);
    }
    public static int ex2UnsetXBitsFromRight(int A, int B){
        int i=0;
        int result=A;
        while(i<B){
            if(A%2==1){
                result -= Math.pow(2, i);
            }
            A /= 2;
            i++;
        }
        return result;
    }
    public static int ex3HelpFromSam(int A){
        int count=0;
        while(A>0){
            if(A%2==1){
                count++;
            }
            A/=2;
        }
        return count;
    }
    public static int ex4FindingGoodDays(int A){
        int count=0;
        while(A>0){
            if(A%2==1){
                count++;
            }
            A/=2;
        }
        return count;
    }
    public static int ex5FindNthMagicNumber(int A){
        int result=0;
        int index=0;
        while(A>0){
            if(A%2==1){
                result += (int)Math.pow(5, index);
            }
            index++;
            A/=2;
        }
        return result;
    }
    public static long x6ReverseBits(long A){
        long result=0;
        int index=0;
        while(A>0){
            if(A%2==1){
                result += Math.pow(2, 32-index-1);
            }
            index++;
            A /= 2;
        }
        return result;
    }
}
