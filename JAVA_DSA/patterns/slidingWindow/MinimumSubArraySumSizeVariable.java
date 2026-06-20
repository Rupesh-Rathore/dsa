package JAVA_DSA.patterns.slidingWindow;

// ! VERY VERY IMPORTANT FOR VARIABLE LENGTH SLIDING WINDOW PROBLEM ->

public class MinimumSubArraySumSizeVariable {
    public static void main(String[] args) {
        int nums[] = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7, nums));
    }

    public static int minSubArrayLen(int target, int[] nums){
        int low = 0 ,
        high = 0 ,
        sizeOfArrayNums = nums.length ,
        sum = 0 ,
        minLen = Integer.MAX_VALUE;
        while( high < sizeOfArrayNums ){
            sum = sum + nums[high];
            while( sum >= target){
                // code for firing , who knows we might be able to generate the desired throughput with lesser no. of employee.
                int len = high - low + 1;
                minLen = min(minLen,len);
                sum = sum - nums[low];
                low++;
            }
            high++; // code for hiring new employ because the desired throughput (work-output) is not being generated
        }
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }

    static int min(int a,int b){
        if(a > b) return b;
        else return a;
    }
}
