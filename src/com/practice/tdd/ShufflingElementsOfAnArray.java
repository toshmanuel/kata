package com.practice.tdd;

import com.exercise.chapterThree.Date;

import java.util.Arrays;
import java.util.Random;

public class ShufflingElementsOfAnArray {
    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 6, 7 };

        Random rand  = new Random();

        for (int i = 0; i < array.length; i++) {
            int newArrangement = rand.nextInt(array.length);
            int temp = array[newArrangement];
            array[newArrangement] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
