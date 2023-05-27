package com.datastructure;

import java.util.Scanner;

public class ArrayProject {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number :");
        int A = scan.nextInt();
        int sum = 0;
        int num = 0;
        for(int i = 1; i <= A; i++) {
            for (int j = 1; j <= num / 2; j++) {
                if (num % j == 0) {
                    sum += j;
                }
            }
        }
        if (sum == num) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
