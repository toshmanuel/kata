package com.exercise.chapterFour;

public class CheckerBoardPattern {
    public static void main(String[] args) {
        int row = 0;
        while(row < 8){
            int column = 0;
            while (column < 8){
                System.out.print("* ");
                column++;
            }
            row++;
            System.out.println();
            if (row % 2 == 1){
                System.out.print(" ");
            }
        }
    }
}
//(Checkerboard Pattern of Asterisks) Write an application that uses only the output statements
//        System.out.print("* ");
//        System.out.print(" ");
//        System.out.println();
//        to display the checkerboard pattern that follows. A System.out.println method call with no arguments causes the program to output a single newline character. [Hint: Repetition statements are
//        required.]
