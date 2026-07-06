package JAVA_DSA.maths;

public class IthBitOfaNum {
        public static void main(String[] args) {
        System.out.println(ithBitOfaNum(19, 1));
        System.out.println(ithBitOfaNum(19, 2));
        System.out.println(ithBitOfaNum(19, 3));
        System.out.println(ithBitOfaNum(19, 4));
        System.out.println(ithBitOfaNum(19, 5));
    }
    static int ithBitOfaNum(int num, int i){
        int shiftedNum = num >> i-1;
        return shiftedNum&1;
    }
}
