package com.datastructure.arrays;

public class FindTopTwoScores {

    public static int[] getTopTwoScores(int[] array) {
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for(int score : array)
           if(score > firstHighest) {
               secondHighest = firstHighest;
               firstHighest = score;
           }
           else if(score > secondHighest && score < firstHighest) {
               secondHighest = score;
           }
        return new int[]{firstHighest,secondHighest};
    }

    /*public static void main(String[] args) {
        System.out.println(getTopTwoScores(10));
    }*/
}
