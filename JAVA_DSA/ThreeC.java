package JAVA_DSA;

import java.util.Arrays;
import java.lang.Math;

public class ThreeC {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50,60,70,80,90};
        int sum = tripletSumClosestToTarget(nums, 1);
        System.out.println(sum);
    }

    static int tripletSumClosestToTarget(int[] nums, int target) {

        // Sorting
        Arrays.sort(nums);
        int i,j,arrLen = nums.length, k=0;
        int difference,sum = nums[0] + nums[1] + nums [2];

        difference = Math.abs(nums[1] + nums[k] + nums [arrLen-1] - target);
        while( k < arrLen-2){

            i = k+1;
            j = arrLen-1;
            
            while(i<j) {

                int tripletSum = nums[i] + nums[k] + nums [j];
                if(tripletSum == target){
                    return target;
                }
                else{
                    if( tripletSum > target){
                        if(Math.abs(tripletSum - target) <= difference){
                            sum = tripletSum;
                            difference = Math.abs(tripletSum - target);
                        }
                        j--;
                    }
                    else{
                        if(Math.abs(tripletSum - target) <= difference){
                            sum = tripletSum;
                            difference = Math.abs(tripletSum - target);
                        }
                        i++;
                    }
                }

            }

            k++;

        }

        return(sum);

    }
}
