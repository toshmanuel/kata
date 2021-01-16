package com.exercise.chapterSeven.ChapterPractice;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayExamplesTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test() {
        int[] studentScores = new int[10];
        String[] names = {"name1", "name2", "name3"};
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
        System.out.println();
        System.out.println("Implementing while loop...");
        int counter = 0;
        while (counter < names.length){
            System.out.println(names[counter]);
            counter++;
        }

    }

    @Test
    void miltiDimensionalArray(){
        int[][] grades = new int[3][4];
        int[][] scores = {
                {70, 89, 98, 93},
                {57, 49, 82, 90},
                {75, 34, 99, 45}
        };

        scores[0][1] = 95;
        for (int row = 0; row < scores.length; row++){
            System.out.println("Processing row...");
            for (int column = 0; column < scores[row].length; column++){
                System.out.print(scores[row][column]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("iterating with an enhanced for loop...");

        for(int[] row : scores){
            for (int col : row){
                System.out.print(col);
                System.out.print(" ");
            }
        }
        int[] f = new int[10];
        System.out.println(f[5]);
    }
}