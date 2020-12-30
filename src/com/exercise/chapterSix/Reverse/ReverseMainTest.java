package com.exercise.chapterSix.Reverse;

import java.util.Scanner;

public class ReverseMainTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Reverse reverse = new Reverse();

        System.out.println("enter a value to get the " +
                "reverse of the digits");
        int input = in.nextInt();
        reverse.setInput(input);
        String reversedInput = reverse.reverseInput(reverse.getInput());
        System.out.println(reversedInput);
    }
}
