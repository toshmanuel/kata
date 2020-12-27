package com.exercise.chapterSix.EvenOrOdd;

import java.util.Scanner;

public class EvenOddMainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        System.out.println("Enter an integer value to" +
                " check if it is odd or even");
        int value = scanner.nextInt();
        evenOrOdd.setInput(value);
        boolean isEven = evenOrOdd.isEven(evenOrOdd.getInput());
        System.out.println(isEven ? evenOrOdd.getInput() + " is an " +
                "even number" : evenOrOdd.getInput() + " is an odd number");
    }
}
