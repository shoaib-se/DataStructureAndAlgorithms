package com.datastructure.arrays;

import java.util.Scanner;

public class ArrayProject {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many day's temperature?");
        int numDays = scan.nextInt();
        double sum = 0;
        for(int i = 0; i <= numDays; i++) {
            System.out.println("Days " + i + "'s high temperature.");
            int next = scan.nextInt();
            sum += next;
        }
        double average = sum / numDays;
        System.out.println();
        System.out.println("Average Temp = " + average);
    }
}
