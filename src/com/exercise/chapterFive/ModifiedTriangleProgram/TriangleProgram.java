package com.exercise.chapterFive.ModifiedTriangleProgram;

public class TriangleProgram {
    private int asteriskPrinter;
    public void printTriangle_onSameLine() {
        for (int asteriskCounter = 1; asteriskCounter <= 10; asteriskCounter++){
            for (asteriskPrinter = 0; asteriskPrinter < asteriskCounter; asteriskPrinter++){
                System.out.print("*");
            }
            for (int spacePrinterA = 10; spacePrinterA >= asteriskCounter; spacePrinterA--){
                System.out.print(" ");
            }
            for (asteriskPrinter = 10; asteriskPrinter >= asteriskCounter; asteriskPrinter--){
                System.out.print("*");
            }
            for (int spacePrinterB = 0; spacePrinterB <= asteriskCounter; spacePrinterB++){
                System.out.print(" ");
            }
            for (int spacePrinterC = 0; spacePrinterC <= asteriskCounter; spacePrinterC++){
                System.out.print(" ");
            }
            for (asteriskPrinter = 10; asteriskPrinter >= asteriskCounter; asteriskPrinter--){
                System.out.print("*");
            }
            for (int spacePrinterD = 10; spacePrinterD >= asteriskCounter; spacePrinterD--){
                System.out.print(" ");
            }
            for (asteriskPrinter = 0; asteriskPrinter < asteriskCounter; asteriskPrinter++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int getAsteriskPrinter() {
        return asteriskPrinter;
    }
//    public void printTriangle_A(){
//        for
//    }
}
