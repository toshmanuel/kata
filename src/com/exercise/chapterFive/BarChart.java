package com.exercise.chapterFive;

import java.util.Scanner;

public class BarChart {
//    private static int userInput;
//    public static void main(String[] args) {
////        Scanner input = new Scanner(System.in);
////        System.out.println("Enter a positive integer value ");
////        int userInput = input.nextInt();
////
////        System.out.println("Enter a positive integer value ");
////        int userInput1 = input.nextInt();
////
////        System.out.println("Enter a positive integer value ");
////        int userInput2 = input.nextInt();
////
////        System.out.println("Enter a positive integer value ");
////        int userInput3 = input.nextInt();
////
////        System.out.println("Enter a positive integer value ");
////        int userInput4 = input.nextInt();
////
////        int counter = 0;
////        System.out.print(userInput + "  ");
////        while (counter < userInput) {
////            //System.out.print(userInput + "  ");
////            System.out.print("*");
////            counter++;
////        }
////        counter = 0;
////        System.out.println();
////        System.out.print(userInput1 + "  ");
////        while (counter < userInput1) {
////            //System.out.print(userInput1 + "  ");
////            System.out.print("*");
////            counter++;
////        }
////        counter = 0;
////        System.out.println();
////        System.out.print(userInput2 + "  ");
////        while (counter < userInput2) {
////            //System.out.print(userInput2 + "  ");
////            System.out.print("*");
////            counter++;
////        }
////        counter = 0;
////        System.out.println();
////        System.out.print(userInput3 + "  ");
////        while (counter < userInput3) {
////            //System.out.print(userInput3 + "  ");
////            System.out.print("*");
////            counter++;
////        }
////        counter = 0;
////        System.out.println();
////        System.out.print(userInput4 + "  ");
////        while (counter < userInput4) {
////            //System.out.print(userInput4 + "  ");
////            System.out.print("*");
////            counter++;
////        }
//
//        Scanner input = new Scanner(System.in);
//        int counter = 0;
//        String output = "";
//        String numOutput = "";
//        while (counter < 5){
////            System.out.println("Enter your input");
////            userInput = input.nextInt();
//            if(userInput > 0) {
//                counter++;
//                for (int count = 0; count < userInput; count++) {
//                    output = output + "*";
//
//                }
////            numOutput = numOutput + userInput + "\n ";
//                userInput = userInput++;
//                output = output + "\n" + userInput;
//            } else{
//                System.out.println("User input cannot be less than zero (0)");
//            }
//        }System.out.println(output);
//    }

    private int userInput;
    private int counter;

    public void collectUserInput(int userInput){
//        this.userInput = userInput;
        if(userInput < 0) {
            userInput = 0;
        }this.userInput = userInput;
    }
    public int getUserInput (){
        return userInput;
    }


    public void numberOfLoopFromUserInput(int counter) {
        this.counter = counter;
        for(counter = userInput; counter > 0; counter--){
            System.out.print("*");
        }
    }
    public int getNumberOfLoops(){
        return counter;
    }
}