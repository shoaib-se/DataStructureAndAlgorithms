package com.datastructure.arrays;

import java.util.Arrays;

public class SecondLargestNumberInAnArray {

    public static void main(String[] args) {
        int temp, size;
        int array[] = {30, 50, 70, 89, 90, 87, 56, 20};
        size = array.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Second largest element in an array is : " + array[size - 2]);

        System.out.println("Other way using Arrays.sort");
        int[] arr = {10, 20, 25, 63, 96, 57};
        int len = arr.length;
        Arrays.sort(arr);
        System.out.println("Sorted Array :" + Arrays.toString(arr));
        int result = arr[len -2];
        System.out.println("Second largest element in an array : " + result);
    }
}
