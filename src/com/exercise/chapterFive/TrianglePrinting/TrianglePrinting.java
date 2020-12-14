package com.exercise.chapterFive.TrianglePrinting;

public class TrianglePrinting {
    private int asteriskPrinter;

    public void printAsterisk_A() {
        for (int asteriskCounter = 0; asteriskCounter <= 10; asteriskCounter++){
            for (asteriskPrinter = 0; asteriskPrinter < asteriskCounter; asteriskPrinter++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int getAsterisksPrinter() {
        return asteriskPrinter;
    }

    public void printAsterisk_B() {
        for (int asteriskCounter = 0; asteriskCounter < 10; asteriskCounter++){
            for (asteriskPrinter = 10; asteriskPrinter > asteriskCounter; asteriskPrinter--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printAsterisk_C() {
        for (int asteriskCounter = 0; asteriskCounter < 10; asteriskCounter++){
            for (int spacePrinter = 0; spacePrinter < asteriskCounter; spacePrinter++){
                System.out.print(" ");
            }
            for (asteriskPrinter = 10; asteriskPrinter > asteriskCounter; asteriskPrinter--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printAsterisk_D() {
        for (int asteriskCounter = 0; asteriskCounter <= 10; asteriskCounter++){
            for (int spacePrinter = 10; spacePrinter > asteriskCounter; spacePrinter--){
                System.out.print(" ");
            }
            for (asteriskPrinter = 0; asteriskPrinter < asteriskCounter; asteriskPrinter++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
