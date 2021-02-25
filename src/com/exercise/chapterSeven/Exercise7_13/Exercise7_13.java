package com.exercise.chapterSeven.Exercise7_13;

import java.util.Arrays;

public class Exercise7_13 {
    public static void main(String[] args) {
        int[][] sales = new int[3][5];
        int counter = 0;
        for (int row = 0; row < sales.length; row++) {
            for (int col = 0; col < sales[row].length; col++) {
                sales[row][col] = counter;
                counter++;
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(sales));
    }
}
