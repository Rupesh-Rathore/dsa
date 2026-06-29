package JAVA_DSA.maths;

public class MathForDSA {
    // Problem - An aaray of integers is given and all the numbers in the array are repeated exactly twice except one number find that number.⁡ (in O(n) time complexity and O(1) space complexity(aux))

    public static void main(String[] args) {
        System.out.println(nonRepeatedNumberInArray(new int[]{1,2,3,5,1,3,2,5,6,6}));
    }
    static int nonRepeatedNumberInArray(int[] arr){
        /*
        using the EX-OR's associtivity property and properties like -
        a^a = 0
        a^0 = a
        a^1 = -a

        {1,1,2,2,3,3,4}
        - 1^1 = 0 - 0^2 = 2 - 2^2 = 0 - 0^3 = 3 - 3^3 = 0 - 0^4 = ⁡⁢⁢⁡⁢⁣⁣4⁡
        */
        int res = 0;
        for (int elem : arr) {
            res = res ^ elem;
        }
        return (res == 0 )? -1 : res;
    }

}
