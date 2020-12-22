package com.exercise.chapterFive;

public class ModifiedBreakStatement {
    public static void main(String[] args) {
        int count; // control variable also used after loop terminates
        for (count = 1; count <= 10; count++){
            while (count < 5) {
                System.out.printf("%d ", count);
                count++;
            }
        }System.out.printf("%nBroke out of loop at count = %d%n", count);
    }
}
