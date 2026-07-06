package JAVA_DSA.maths;

public class SetIthBit {
    public static void main(String[] args) {
        int num= 10;
        num = setIthbitToONE(num, 3);
        System.out.println(num);
    }   
        static int setIthbitToONE(int num, int i){
            int mask = 1 << (i-1);
            return num | mask;
            // return 0;
        }
    }
