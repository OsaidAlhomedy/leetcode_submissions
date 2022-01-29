import java.util.Arrays;

import arrays.ArraysProblems;

class Main {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        int[] nums2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int[] nums3 = { 1, 2, 3, 4, 5 };

        // System.out.println(ArraysProblems.majorityElement(nums));
        // System.out.println(ArraysProblems.removeDuplicates(nums2));
        // System.out.println(Arrays.toString(reverseArr(nums3)));

        System.out.println(divider(16,2,0));

    }

    public static int[] reverseArr(int[] arr) {

        int j = arr.length - 1; // 0 1
        int temp;

        for (int i = 0; i < (arr.length - 1) / 2; i++) {

            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;

        }

        return arr;
    }

    public static int divider(int number , int division , int counter){
        if(number >= division){
            counter++;
            return divider(number-division,division,counter);
        }
        return counter;
    }

    
}