package com.exercise.chapterSix.RoundingNumber2;

import java.util.Scanner;

public class Rounding2MainTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        RoundingNumber2 rounds = new RoundingNumber2();
        System.out.println("enter any value to get the rounded figure");
        double number = scan.nextDouble();
        System.out.println("Input is: " + number);
        System.out.println("Input to the nearest Integer is: " + rounds.roundToInteger(number));
        System.out.println("Input to the nearest Tenth is: " + rounds.roundToTenth(number));
        System.out.println("Input to the nearest Hundredth is: " + rounds.roundToHundredth(number));
        System.out.println("Input to the nearest Thousandth is: " + rounds.roundToThousandth(number));
    }
}
