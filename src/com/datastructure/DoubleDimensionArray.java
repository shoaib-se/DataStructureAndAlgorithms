package com.datastructure;

public class DoubleDimensionArray {
    int arr[][] = null;

    // COnstructor
    public DoubleDimensionArray(int numberOfRows, int numberOfColumns) {
        this.arr = new int[numberOfRows][numberOfColumns];
        for(int rows = 0; rows < arr.length; rows++) {
            for(int cols = 0; cols < arr.length; cols++) {
                arr[rows][cols] = Integer.MIN_VALUE;
            }
        }
    }

    // Inserting value into the Array
    public void insertValueInTheArray(int row, int col, int value) {
        try {
            if(arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("The value is successfully inserted.");
            }
            else {
                System.out.println("This cell is already occupied.");
            }
        } catch(ArrayIndexOutOfBoundsException ae) {
            System.out.println("Invalid index for 2D array");
        }
    }

    // Accessing cell value from given array
    public void accessCell(int row, int col) {
        System.out.println("\nAccessing Rows " + row + ", Cols " + col);
        try{
            System.out.println("Cell value is " + arr[row][col]);
        } catch(ArrayIndexOutOfBoundsException ae) {
            System.out.println("Invalid index for 2D array");
        }
    }

    // Array traversal in 2D Array
    public void traverse2DArray() {
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col <arr.length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    // Searching a single value in 2D Array
    public void searchingValue(int value) {
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[0].length; col++) {
                if(arr[row][col] == value) {
                    System.out.println("The value is found at row :" + row + " Col :" + col);
                }
            }
        }
        System.out.println("Value is not found.");
    }

    // Deleting value in 2D Array
    public void deleteValueFromArray(int row, int col) {
        try {
            System.out.println("Successfully deleted :" + arr[row][col]);
            arr[row][col] = Integer.MIN_VALUE;
        } catch(ArrayIndexOutOfBoundsException ae) {
            System.out.println("This index is not valid for array.");
        }
    }
}
