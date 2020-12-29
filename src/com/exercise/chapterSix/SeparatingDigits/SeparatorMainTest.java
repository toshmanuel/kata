package com.exercise.chapterSix.SeparatingDigits;

import java.util.Scanner;

public class SeparatorMainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Separator digits = new Separator();
        System.out.println("Enter Digit (between 1 - 99999)");
        int input = scanner.nextInt();
        digits.setInput(input);
        digits.displayDigits(digits.getInput());

        System.out.println("Enter Digit (between 1 - 99999)");
        int input2 = scanner.nextInt();
        digits.setInput(input2);
        digits.displayDigits(digits.getInput());
    }
}
