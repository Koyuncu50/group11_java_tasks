package Raluca.Week9;

import java.util.Arrays;

public class SortArray_Task11 {


    public static int[] sortAscending(int[] arr) {


        for (int i = 0; i < arr.length - 1; i++) {// 5, 2, 9, 1, 3
            int minIndex = i; // Assume that the current element at index i is the smallest.

            for (int j = i + 1; j < arr.length; j++) {// this array is to compare next number
                if (arr[j] < arr[minIndex]) { //Compare each element at position j with the current smallest (i)
                    minIndex = j; // is 2 (current element) < 5 (current smallest)?, if true min index = j's index
                }
            }

            //After finding the smallest element (2<5)
            int temp = arr[minIndex]; // temp = arr[3] --> temp = 1
            arr[minIndex] = arr[i]; //  arr[3] = arr[0] swap them
            arr[i] = temp; // arr[0] = 1 // reassign with temp value
        }

        return arr;
    }
public static void main(String[] args) {
    int[] numbers = {5, 2, 9, 1, 3}; //
    System.out.println(Arrays.toString(sortAscending(numbers)));
}

}
/*
Write a return method that can sort an int array in ascending order without using the sort method of the
    Arrays class.
 */