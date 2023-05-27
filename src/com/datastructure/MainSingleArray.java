package com.datastructure;

public class MainSingleArray {

    public static void main(String[] args) {
//        int[] intArrays = new int[3];
//        intArrays[0] = 10;
//        intArrays[1] = 20;
//        intArrays[2] = 30;
//        System.out.println(Arrays.toString(intArrays));
//        String sArrays[] = {"a","b","c"};
//        System.out.println(Arrays.toString(sArrays));

        // Insert element in Array
        SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.insert(0,10);
        sda.insert(1,20);
        sda.insert(2,30);
        sda.insert(1,40);
        sda.insert(12,10);

        // Access elements of Array
        /*int firstElement = sda.arr[0];
        System.out.println("First Element is :" + firstElement);
        int thirdElement = sda.arr[2];
        System.out.println("Third Element is :" + thirdElement);*/

        // Array traversal
       /* System.out.println("Array traversal.");
        sda.traverseArray();*/

        // Search in array
        /*System.out.println("Search in the given Array.");
        sda.searchInArray(50);*/

        // Delete an array
        System.out.println("Delete in the given Array.");
        sda.deleteValue(0);
        System.out.println(sda.arr[0]);
    }
}
