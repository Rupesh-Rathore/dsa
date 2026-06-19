package JAVA_DSA.patterns.twoPointers;

import java.util.Arrays;

public class TripletSumSmaller {
    public static void main(String[] args) {
        int nums[] = {30 ,8, 23, 6, 10, 9, 31, 7 ,19, 20, 1, 33, 21, 27, 28, 3, 25, 26};
        System.out.println("count -> " + tripletSumSmallerThenTarget(86, nums));
    }
    static int tripletSumSmallerThenTarget(int sum, int arr[]){
        
        Arrays.sort(arr);
        int count = 0;
        int i = 0, j, k, arrlen = arr.length;
        while(i < arrlen - 2){
            j = i + 1;
            k = arrlen - 1;
            while (j<k) {
                int temp = arr[i] + arr[j] + arr[k];
                if (temp >= sum){
                    k--;
                }else{
                    count = count + k - j;
                    j++;
                }
            }
            i++;
        }

        return count;
    }
}
