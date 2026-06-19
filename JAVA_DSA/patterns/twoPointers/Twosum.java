package JAVA_DSA.patterns.twoPointers;

// Imports
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

// leetcode problem - 1

public class Twosum{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int size = in.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        
        int target = in.nextInt();

        System.out.println(Arrays.toString(twoSumHash(nums,target)));
    }

    // most basic approach (brute) 
    static int[] twoSumBrute(int[] arr , int target){
        int[] result = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++){
                if( arr[i]+ arr[j] == target){
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return(result);

        /*
        * most basic and leasy efficient approach
        ! time complexity - O(n^2) - too much, bad for large arrays
        * space complexity - O(1) - fine
        */
    
    }

    // MOST OPTIMAL APPROACH 
    static int[] twoSumHash(int[] arr, int target) {
        HashMap<Integer,Integer> record = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i <arr.length; i++) {
            if(record.get(target-arr[i]) != null) {
                result[0] = i;
                result[1] = record.get(target-arr[i]);
                break;
            }
            if(record.get(arr[i]) != null) continue;
            record.put(arr[i], i);
        }
        return(result);
        /*
        * time cmplexity O(n)
        ! space complexity 2*O(n) which is too much because storage is also limited
        */
    }

}
