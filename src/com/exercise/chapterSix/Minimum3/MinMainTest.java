package com.exercise.chapterSix.Minimum3;

import java.util.Scanner;

public class MinMainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Minimum3 minimum = new Minimum3();
        System.out.println("enter first value");
        float input1 = scanner.nextFloat();
        System.out.println("enter second value");
        float input2 = scanner.nextFloat();
        System.out.println("enter third value");
        float input3 = scanner.nextFloat();

        minimum.setMinValue(input1, input2, input3);

        System.out.println("minimum of the three values is: " + minimum.getMinValue());
    }
}
