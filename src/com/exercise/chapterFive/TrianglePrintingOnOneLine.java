package com.exercise.chapterFive;

public class TrianglePrintingOnOneLine {

    public static void main(String[] args) {
        for (int counter = 1; counter <= 10; counter++){
            for (int star = 1; star <= counter; star++){
                System.out.print("*");
            }System.out.print(" ");
            System.out.println();
            for (int space = 10; space > counter; space--){
                System.out.print("1");
            }
        }

    }


}
