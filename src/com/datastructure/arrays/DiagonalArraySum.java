package com.datastructure.arrays;

public class DiagonalArraySum {

    public static int sumDiagonalArray(int[][] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                // Check for main diagonal element.
                if (i == j) {
                    sum += array[i][j];
                }
                // Check for secondary diagonal element except central element.
                /*if (i + j == array.length - 1 && i != j) {
                    sum += array[i][j];
                }*/
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] dataset = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Sum of diagonal elements is :" + sumDiagonalArray(dataset));
    }
}
