package com.exercise.chapterSix.PerfectNumber;

import java.util.Scanner;

public class PerfectNumberMainTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PerfectNumber perfect = new PerfectNumber();
        System.out.print("Enter the range of number you" +
                "\nwant to know if they are perfect numbers: ");
        int input = in.nextInt();
        perfect.setInput(input);
        perfect.perfectNumberOfRange(perfect.getInput());
    }
}
