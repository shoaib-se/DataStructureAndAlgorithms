package com.datastructure.arrays;

import java.util.Scanner;

public class ArrayProjectWithArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many day's temperature?");
        int numDays = scan.nextInt();
        int[] temps = new int[numDays];
        // Record temperature and find average
        int sum = 0;
        for(int i = 0; i < numDays; i++) {
            System.out.println("Days " + (i + 1) + "'s high temperature.");
            temps[i] = scan.nextInt();
            sum += temps[i];
        }
        double average = sum / numDays;
        // count days above average
        int aboveTemp = 0;
        for(int i = 0; i < temps.length; i++) {
            if(temps[i] > average) {
                aboveTemp++;
            }
        }
        System.out.println();
        System.out.println("Average Temp = " + average);
        System.out.println(aboveTemp + " days above average.");
    }
}
