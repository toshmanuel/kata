package com.exercise.chapterSix.PrimeNumbers;

import java.util.Scanner;

public class PerfectNumbersMainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrimeNumbers prime = new PrimeNumbers();
        System.out.println("Enter the range of number to " +
                "check all prime number between: ");
        int input = scanner.nextInt();
        prime.setInput(input);
        prime.primeNumbersFromARange(prime.getInput());
    }
}
