package JAVA_DSA.recursion.arrays;

public class FindTheTarget {

    public static void main(String[] args) {
        int nums[] = {4,1,2,33,0,44,1,2,45,655,11,87,45};
        System.out.println(search(nums, 4, 0));
    }

    static int search(int[] nums , int start , int target){
        if (start >= nums.length) return -1;
        if (nums[start] == target) return start;
        return search(nums, start + 1, target);
    }
}
