package com.exercise.chapterSix.RoundingNumbers;

import java.util.Scanner;

public class RoundingMainTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RoundingNumbers number = new RoundingNumbers();
        System.out.println("Enter any value to get the rounded figure");
        number.setNumber(input.nextDouble());
        System.out.printf("%5s%20s%n", "Input", "RoundedValue");
        System.out.printf("%5f  %13.1f%n", number.getNumber(), number.roundNumber());
    }
}
