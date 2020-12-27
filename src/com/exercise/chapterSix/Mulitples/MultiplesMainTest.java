package com.exercise.chapterSix.Mulitples;

import java.util.Scanner;

public class MultiplesMainTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Multiples multiples = new Multiples();
        System.out.println("Enter first integer value to determine is" +
                " \na multiple of the next value you wish to enter");
        int firstValue = input.nextInt();
        multiples.setFirstInteger(firstValue);

        System.out.println("Enter second integer value to determine is the " +
                "\nfirst input is a multiple of this value");
        int secondValue = input.nextInt();
        multiples.setSecondInteger(secondValue);

        boolean isMultiple = multiples.isMultiples(multiples.getFirstInteger(), multiples.getSecondInteger());
        System.out.println(isMultiple ? firstValue + " is a multiple of " + secondValue :
                firstValue + " is not a multiple of " + secondValue);
    }
}
