package prac;

public class SecondLargestArray {

    public static int secondLargestArrayElem (int[] arr) {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else {
                if (arr[i] != largest && arr[i] > secondLargest) {
                    secondLargest = arr[i];
                }
            }
        }

        return secondLargest;
    }
}
