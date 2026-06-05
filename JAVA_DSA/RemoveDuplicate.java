package JAVA_DSA;

import java.util.ArrayList;
import java.util.Arrays;

// leetcode problem -

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
        // If you want to print the array, it must be inside the main method:
        System.out.println(Arrays.toString(nums)); 
    }

    public static int removeDuplicates(int[] nums) {
        int fp = nums[0];
        int rp = nums[nums.length - 1];
        int k = 1;
        ArrayList<Integer> tempj = new ArrayList<>();
        tempj.add(rp);

        if(nums.length == 1 || fp == rp){
            return 1;
        }

        // Fixed: Replaced comma with semicolon before the update expression
        for (int i = 1, j = nums.length - 2; i <= j; i++, j--) {
            if (i >= j) {
                break;
            }
            if (nums[i] != fp) {
                fp = nums[i];
                nums[k] = nums[i];
                k++;
            }
            if (nums[j] != rp) {
                rp = nums[j];
                tempj.add(nums[j]);
            }
        }

        k--;
        // Fixed: Removed the trailing semicolon after i--
        for (int i = tempj.size() - 1; i >= 0; i--) { 
            if (nums[k] < tempj.get(i)) {
                k++;
                nums[k] = tempj.get(i);
            }
        }
        return k+1; // Fixed: Now correctly placed inside the method
    }
}

