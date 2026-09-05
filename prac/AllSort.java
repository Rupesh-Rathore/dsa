package prac;

public class AllSort {

    //Display

    public void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    // SORTING METHODS

    public void bubble(int[] arr) {
        // LOOPING
        int size = arr.length;
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public void insertion(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            
            for (int j = i; j > 0 ; j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else {
                    break;
                }
            }
        }
    } 

    public void selection(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            int maxValIndex = 0;
            for (int index = 0; index < size - i  ; index++) {
                if (arr[maxValIndex] < arr[index]) {
                    maxValIndex = index;
                }
            }
            int temp = arr[maxValIndex];
            arr[maxValIndex] = arr[size - 1 - i];
            arr[size - 1 - i] = temp;
        }
    }
}
