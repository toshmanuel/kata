package com.exercise.chapterSeven.Exercise7_8;

import java.util.Arrays;

public class Exercise7_8 {
    public static void main(String[] args) {
        // display the value of elements 6 of array f

        String[] f = {"one", "two", "three", "four", "five", "six", "seven", "eight"};

        System.out.println(f[6]);

        //initialize each of the five elements of one-dimensional integer array g to 8

        int[] g = new int[5];
        g[0] = 8;
        g[1] = 8;
        g[2] = 8;
        g[3] = 8;
        g[4] = 8;

        System.out.println(Arrays.toString(g));

        //total the 100 elements of floating-point array c

        float[] c = new float[100];
        float total = 0;
        for(int counter = 0; counter < c.length; counter++){
            c[counter] = counter + 1;
            total += c[counter];
        }
        System.out.println("total is: " + total);

        //copy 11-element array a into the first portion of array b, which contains 34 elements

        int[] array_a = {1,2,3,4,5,6,7,8,9,10,11};

        int[][] array_b = new int[17][2];
        array_b[0] = array_a;

        System.out.println(Arrays.deepToString(array_b));

        //Determine and display the smallest and largest values contained in 99-element floating-point array w

        float[] array_w = new float[99];
         float min = 0;
         float max = 0;
         for(int counter = 0; counter < array_w.length; counter++){
             min = array_w[0];
             max = array_w[0];
             array_w[counter] = counter + 1;
             if(array_w[counter] < min){
                 min = array_w[counter];
             }
             if(array_w[counter] > max){
                 if(array_w[counter] > max){
                     max = array_w[counter];
                 }
             }
         }
        System.out.println("largest value is: " + max);

        System.out.println("smallest value is: " + min);

    }
}