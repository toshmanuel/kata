package com.exercise.chapterFour;

public class Tabular {
    public static void main(String[] args) {
        int counter = 0;
        int number = 1;
        while(counter < 5){
            System.out.print(number    + "         ");
            System.out.print((number * 10) + "         ");
            System.out.print((number * 100) + "         ");
            System.out.print((number * 1000) + "         ");
            counter++;
            number++;
            System.out.println();
        }
    }
}
