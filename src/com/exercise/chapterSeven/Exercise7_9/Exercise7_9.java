package com.exercise.chapterSeven.Exercise7_9;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_9 {
    public static void main(String[] args) {
        // consider a 2-by-3 integer array t;
        // write a statement that declares and creates t

        int[][] array_t = new int[2][3];
        array_t[0][0] = 1;
        array_t[0][1] = 2;
        array_t[0][2] = 3;
        array_t[1][0] = 4;
        array_t[1][1] = 5;
        array_t[1][2] = 6;

        // how many rows does t have?
        // answer: 2

        System.out.println("number of rows is: " + array_t.length);
        //how many columns does t have?
        // answer: 3

        System.out.println("number of columns is: " + array_t[0].length);

        //how many elements does t have
        // answer: 6
        System.out.println("number of elements in array_t is: " + (array_t.length * array_t[0].length));

        // write access expressions for all the elements in row 1 of t
        System.out.println("element in row 1 include");
        for (int row = 1; row < (array_t.length ); row += 1){
            for (int col = 0; col < array_t[row].length; col++){
                System.out.print(array_t[row][col] + ", ");
            }
            System.out.println();
            System.out.println();
            System.out.println();
        }
        // write access expression for all the elements in column 2 of t
        System.out.println("element in column 2 include");
        for (int row = 0; row < array_t.length; row++){
            for(int col = 2 ; col < array_t[row].length ; col++){
                System.out.print(array_t[row][col] + ", ");
            }
            System.out.println();
        }

        // write a single statement that sets the elements of t in r 0 and column 1 to zero
        array_t[0][1] =  0;

        // write individual statements to initialize each element of t to zero.
        array_t[0][0] = 0;
        array_t[0][2] = 0;
        array_t[1][0] = 0;
        array_t[1][1] = 0;
        array_t[1][2] = 0;

        // Write a nested for statement that initializes each element of t to zero.
        for(int row = 0; row < array_t.length;row++){
            Arrays.fill(array_t[row], 0);
        }

        // Write a nested for statement that inputs the values for the elements of t from the user.
        Scanner sc = new Scanner(System.in);

        for(int row = 0; row < array_t.length; row++){
            for(int col = 0; col < array_t[row].length; col++){
                System.out.printf("enter value for array[%d][%d] %n", row, col);
                int userInput = sc.nextInt();
                array_t[row][col] = userInput;
            }
        }
        System.out.println(Arrays.deepToString(array_t));

        // Write a series of statements that determines and displays the smallest value in t.
        int min = array_t[0][0];
        for (int row = 0; row < array_t.length; row++){
            for(int col = 0; col < array_t[row].length; col++){
                if(array_t[row][col] <  min){
                    min = array_t[row][col];
                }
            }
        }
        System.out.println("smallest value in the array is: " + min);

        // Write a single printf statement that displays the elements of the first row of t.
        System.out.printf(" array_t[0][0] is: %d%n array_t[0][1] is: %d%n array_t[0][2] is: %d%n ",
                array_t[0][0], array_t[0][1], array_t[0][2]);
        // Write a statement that totals the elements of the third column of t. Do not use repetition.
        int totalThirdCol = array_t[0][2] + array_t[1][2];
        System.out.println("total of element in third column of array_t is: " + totalThirdCol);

        //Write a series of statements that displays the contents of t in tabular format. List the
        //column indices as headings across the top, and list the row indices at the left of each row.

        System.out.printf("%25s%20s%20s%n", "column 1", "column 2", "column 3");
        for(int row = 0; row < array_t.length; row++){
            System.out.printf("row %d", row);
            for(int col = 0; col < array_t[row].length; col++){
                System.out.printf("%20d", array_t[row][col]);
            }
            System.out.println();
        }
    }
}