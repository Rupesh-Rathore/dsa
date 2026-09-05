package prac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AllSort obj = new AllSort();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter coma separated integer value - ");
        String inputStr = input.nextLine();
        String[] strNums = inputStr.split(",");
        int[] nums = new int[strNums.length];
        for (int i = 0; i < strNums.length; i++) {
            nums[i] = Integer.parseInt(strNums[i].trim());
        }
        obj.selection(nums);
        obj.display(nums);
        input.close();
    }
}
