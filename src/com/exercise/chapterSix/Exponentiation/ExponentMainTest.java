package com.exercise.chapterSix.Exponentiation;

import java.util.Scanner;

public class ExponentMainTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Exponent exponent = new Exponent();
        System.out.println("Enter the base value: ");
        int base = in.nextInt();
        exponent.setBaseValue(base);
        System.out.println("Enter exponent value: ");
        int exponents = in.nextInt();
        exponent.setExponentialValue(exponents);

        exponent.calculateExponentValue(exponent.getBaseValue(), exponent.getExponentialValue());
        System.out.println("Answer is: " + exponent.getExponentResult());
    }
}
