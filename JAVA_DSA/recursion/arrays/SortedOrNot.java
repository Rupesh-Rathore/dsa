package JAVA_DSA.recursion.arrays;

public class SortedOrNot {

    public static void main(String[] args) {
        int nums[] = {-3,-2,0};
        System.out.println(sorted(nums, 0, nums.length - 1));
    }

    static boolean sorted(int[] arr, int start, int end){
        if(start >= end) return true;

        // if(!(arr[start] <= arr[start + 1])) return false;
        // return sorted(arr , start + 1 , end);
        //              ⁡⁢⁣⁣OR⁡
        return (arr[start] <= arr[start + 1]) && sorted(arr , start + 1 , end);
    }
}
