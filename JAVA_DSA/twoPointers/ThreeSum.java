package JAVA_DSA.twoPointers;

// import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {0,0,0};
        List<List<Integer>> output = tripletSumToZero(nums);
        for (List<Integer> is : output) {
            System.out.println(is);
        }
    }

    static List<List<Integer>> tripletSumToZero( int[] nums){

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        int i,j, arrLen = nums.length , k=0;

        while(k<arrLen-2){
            if(nums[k]>0){
                break;
            }
            int target = -nums[k];
            i = k+1;
            j = arrLen-1;
            while (i<j) {
                if(nums[i]+nums[j] == target){
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[k]);
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    result.add(triplet);
                    i++;
                    j--;
                    while(i<j && nums[i] == nums[i-1]){
                        i++;}
                    while(i<j && nums[j] == nums[j+1]){
                        j--;
                    }
                }
                else {
                if(nums[i] + nums[j] > target){
                    j--;
                }
                else{
                    i++;
                }
            }
            }
            k++;
            while (k< arrLen-1 && nums[k]==nums[k-1]) {
                k++;
            }
        }

        return result;
    }
}