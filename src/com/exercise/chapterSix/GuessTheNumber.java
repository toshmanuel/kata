package com.exercise.chapterSix;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    int realNumber;
    int rangeOfNumber;

    public GuessTheNumber(int rangeOfNumber){
        this.rangeOfNumber = rangeOfNumber;
    }
    public void setNumber(int realNumber) {
        this.realNumber = realNumber;
    }
    public int getNumber() {
        return realNumber;
    }
    public void setGuessNumber(int realNumber){
//        rangeOfNumber = input.nextInt();
        for(int counter = 1; counter < 2; counter++) {
            if (rangeOfNumber > realNumber) {
                System.out.println("too low, try again ");
            } else {
                if (rangeOfNumber < realNumber) {
                    System.out.println("too high try again");
                } else {
                    System.out.println("Congratulations");
                }
            }
        }


//        while(rangeOfNumber < realNumber) {
//            System.out.println("too low, try again ");
//        }
//        while (rangeOfNumber > realNumber ){
//            System.out.println("too high, try again ");
//        }
//        while( rangeOfNumber == realNumber ){
//            System.out.println("Congratulations you got it right ");
//            rangeOfNumber = realNumber;
//        }
    }
    public void setGuessNumber(Scanner input) {
        realNumber = input.nextInt();
        for (; realNumber > -1; realNumber++) {
            if (rangeOfNumber > realNumber) {
                System.out.println("too low, try again ");
            } else {
                if (rangeOfNumber < realNumber) {
                    System.out.println("too high try again");
                    realNumber = input.nextInt();
                } else {
                    System.out.println("Congratulations");
                }
            }
        }
    }


    public int guessNumber(){
        return rangeOfNumber;
    }

    public static void main(String[] args) {
        Random random = new Random();
        GuessTheNumber guessTheNumber = new GuessTheNumber(random.nextInt(50));

        Scanner input = new Scanner(System.in);

        System.out.println("Enter integer value within 1-50");

        guessTheNumber.setNumber(input.nextInt());

        guessTheNumber.setGuessNumber(guessTheNumber.getNumber());

        System.out.println("The expected number is: " + guessTheNumber.guessNumber());

    }
}
