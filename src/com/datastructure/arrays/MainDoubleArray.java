package com.datastructure.arrays;

import java.util.Arrays;

public class MainDoubleArray {

    public static void main(String[] args) {
/*        // Step 1 - Declare
        int[][] int2DArray;
        // Step 2 - Instantiate
        int2DArray = new int[2][2];
        // Step 3 - Initialize
        int2DArray[0][0] = 1;
        int2DArray[0][1] = 2;
        int2DArray[1][0] = 3;
        int2DArray[1][1] = 4;

        System.out.println(Arrays.deepToString(int2DArray));
        // All together

        String s2DArray[][] = {{"a", "b"}, {"c", "d"}};
        System.out.println(Arrays.deepToString(s2DArray));*/

        // Insert into 2D Array
        /*DoubleDimensionArray sda = new DoubleDimensionArray(3,3);
        sda.insertValueInTheArray(0,0,10);
        System.out.println(Arrays.deepToString(sda.arr));
        sda.insertValueInTheArray(0,0,20);
        sda.insertValueInTheArray(3,3,40);*/

        // Access 2D Array
        DoubleDimensionArray sda = new DoubleDimensionArray(3,3);
        sda.insertValueInTheArray(0,0, 10);
        sda.insertValueInTheArray(0,1, 20);
        sda.insertValueInTheArray(1,0, 30);
        sda.accessCell(1,0);

        // Traversing 2D Array
        sda.traverse2DArray();
        System.out.println(Arrays.deepToString(sda.arr));

        // Searching in 2D Array
        sda.searchingValue(30);

        // Deleting value from 2D Array
        sda.deleteValueFromArray(1,1);
        System.out.println(Arrays.deepToString(sda.arr));
    }
}
