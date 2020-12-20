package com.exercise.chapterFive.Diamond;

public class Diamond {
    int asterisksPrinter;

    public void topAsteriskPrinter() {
        for (int asterisksCounter = 1; asterisksCounter <= 9; asterisksCounter++){
            for (int spacePrinter = 9; spacePrinter > asterisksCounter; spacePrinter-- ){
                if (asterisksCounter % 2 == 1) {
                    System.out.print(" ");
                }
            }
            for (int asterisksPrinter = 0; asterisksPrinter < asterisksCounter; asterisksPrinter++){
                if (asterisksCounter % 2 == 1) {
                    System.out.print(" *");
                }
                this.asterisksPrinter = asterisksPrinter;
            }
            if (asterisksCounter % 2 == 1) {
                System.out.println();
            }
        }
    }
    public void reverseAsteriskPrinter(){
        for (int asterisksCounter = 1; asterisksCounter <= 9; asterisksCounter++){
            for (int spacePrinter = 0; spacePrinter <= asterisksCounter; spacePrinter++ ){
                if (asterisksCounter % 2 == 1) {
                    System.out.print(" ");
                }
            }
            for (int asterisksPrinter = 7; asterisksPrinter >= asterisksCounter; asterisksPrinter--){
                if (asterisksCounter % 2 == 1) {
                    System.out.print(" *");
                }
                this.asterisksPrinter = asterisksPrinter;
            }
            if (asterisksCounter % 2 == 1) {
                System.out.println();
            }
        }
    }

    public void printDiamond(){
        topAsteriskPrinter();
        reverseAsteriskPrinter();
    }

    public int getAsteriskPrinter() {
        return asterisksPrinter;
    }
}
