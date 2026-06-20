package JAVA_DSA.imporantUtilityCodeNdConcepts;


public class SumofArray {
    static int subArraySum(int[] arr, int start, int end){
        if (end >arr.length-1){
            System.err.println("out of bound index");
            return -1;
        }
        int result = 0;

        // two pointer
        int i = start , j = end;
        while(i<=j){
            if(i == j){
                result = result + arr[i];
                return result;
            }
            result = result + arr[i] + arr[j];
            j--;
            i++;
        }
        return result;
    }
}
