package com.exercise.chapterFive;//package com.exercise.chapterFive;

public class TrianglePrintingProgram {
    public static void main(String[] args) {
        for(int counter = 1; counter <= 10; counter++){
            for (int star = 1; star <= counter; star++){
                System.out.print("*");
            }System.out.println();
        }System.out.println();
        for (int counter = 10; counter >= 1; counter-- ){
            for (int star = 1; star <= counter; star++){
                System.out.print("*");
            }System.out.println();
        }System.out.println();
        for (int counter = 1; counter <= 10; counter++){
            for (int space = 1; space < counter; space++){
                System.out.print(" ");
            }
            for(int star = 10; star >= counter; star--){
                System.out.print("*");
            }System.out.println();
        }System.out.println();
        for (int counter = 1; counter <= 10; counter++){
            for (int space = 10; space > counter; space--){
                System.out.print(" ");
            }
            for (int star = 1; star <= counter; star++){
                System.out.print("*");
            }System.out.println();
        }System.out.println();
    }
}
