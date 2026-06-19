package JAVA_DSA.patterns.twoPointers;

import java.util.Arrays;

class SortedSquaresProblem {

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        
        System.out.println(Arrays.toString(sortedSquares(nums))); 
    }

    public static int[] sortedSquares(int[] nums) {
        int[] out = new int[nums.length];
        if (nums[0]>=0){
            for(int i=0; i< nums.length;i++){
                out[i] = nums[i]*nums[i];
            }
        }
        else if (nums[nums.length-1] <=0 ){
            for(int i=nums.length-1;i>=0;i--){
                out[nums.length-1 - i] = nums[i]*nums[i];
            }
        }
        else{
            int i=0,j=0,k=0;
            while(nums[i]<0){
                i++;
            }
            j=i-1;
            while(true){
                if(j == 0 && i == nums.length-1){
                    break;
                }
                if( nums[i]*nums[i] > nums[j]*nums[j]){
                    out[k] = nums[j]*nums[j];
                    out[k+1] = nums[i]*nums[i];
                    k++;
                    j--;
                }
                else if(nums[i]*nums[i] < nums[j]*nums[j]){
                    out[k] = nums[i]*nums[i];
                    out[k+1] = nums[j]*nums[j];
                    k++;
                    i++;
                }
            }
        }
        return(out);
}
}