package com.datastructure;

import java.util.Scanner;

public class PerfectSquare {

    public static boolean perfectSquare(double num) {
        double sqrt = Math.sqrt(num);
        return ((sqrt - Math.floor(sqrt)) == 0);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number :");
        double num = scan.nextDouble();
        if(perfectSquare(num)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
