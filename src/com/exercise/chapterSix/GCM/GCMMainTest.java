package com.exercise.chapterSix.GCM;

import java.util.Scanner;

public class GCMMainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GreatestCommonDivisor gcm = new GreatestCommonDivisor();
        System.out.println("enter first number to get the " +
                "greatest common divisor");
        int input1 = scanner.nextInt();
        System.out.println("enter second number");
        int input2 = scanner.nextInt();

        gcm.checkGreatestDivisor(input1, input2);

        System.out.println("the greatest common divisor of " + input1 + " and "
        + input2 + " is " + gcm.getGreatestDivisor());
    }
}
