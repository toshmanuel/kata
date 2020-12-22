package com.exercise.chapterFive;

public class ModifiedContinueStatement {
    public static void main(String[] args) {
        int count; // control variable also used after loop terminates
        for (count = 1; count <= 10; count++) {
            while (count != 5 && count <= 10) {
                System.out.printf("%d ", count);
                count++;
            }
        }
    }
}