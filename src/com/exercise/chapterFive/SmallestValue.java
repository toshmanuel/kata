package com.exercise.chapterFive;

import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of numbers you wish to enter");
        int num = input.nextInt();
        while (num <= 0) {
            System.out.println("Enter valid integer number greater than 0 to perform operation");
            num = input.nextInt();
        }
        System.out.println("Enter Value");
        int min = input.nextInt();
        for (int counter = 1; counter < num; counter++) {
                System.out.println("Enter Value");
                int newInput = input.nextInt();
                if (newInput < min) {
                    min = newInput;
                }
            }
            System.out.printf("The smallest user input is %d%n", min);
        }
}
//System.out.printf("The smallest user input is %d%n", Math.min(newInput, min));
//        this can also be used in place of the for loop and we initialize counter to 1
//        while(counter < num ){
//            System.out.println("Enter Value");
//            int newInput = input.nextInt();
//            if (newInput < min ){
//                min = newInput;
//            } counter++;
//        }
//        System.out.printf("The smallest user input is %d%n", min);