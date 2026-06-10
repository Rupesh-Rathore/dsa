package JAVA_DSA;

import java.util.Arrays;

public class FirstNLastElementPosition {
    public static void main(String[] args) {
        int[] nums = {5,7,8,8,8,8,10};
        System.out.println(Arrays.toString(firLasPosSortArr(nums, 8)));
    }

    static int[] firLasPosSortArr(int nums[], int target){

        int start = 0, end = nums.length-1;
        int[] ans = {-1,-1};

        // for first occurence - 
        while (start <= end){
            int middle = start + (end-start)/2;
            if (target < nums[middle]){
                end = middle - 1;
            }
            else if (target > nums[middle]){
                start = middle + 1;
            }
            else {
                // nums[middle] = taget ->
                if (middle > start && nums[middle-1] == target){
                    end = middle - 1;
                }
                else{
                    ans[0] = middle;
                    break;
                }
            }
        }

        // for last occurence
        start = 0;
        end = nums.length-1; 
        while (start <= end) {
            int middle = start + (end-start)/2;
            if (target < nums[middle]){
                end = middle - 1;
            }
            else if (target > nums[middle]){
                start = middle + 1;
            }
            else {
                // nums[middle] = taget ->
                if (middle < end && nums[middle+1] == target){
                    start = middle + 1;
                }
                else{
                    ans[1] = middle;
                    break;
                }
            }
        }

        return(ans);
    }
}
