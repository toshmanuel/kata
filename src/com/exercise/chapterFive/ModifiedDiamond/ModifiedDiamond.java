package com.exercise.chapterFive.ModifiedDiamond;

public class ModifiedDiamond {
    private int counter;

    public void setCounter(int counter) {

        this.counter = counter;
    }
    public void topDiamondPrinter(){
        for (int asterisksCounter = 1; asterisksCounter < getCounter(); asterisksCounter++){
            for (int spacePrinter = getCounter(); spacePrinter  >= asterisksCounter; spacePrinter-- ){
                if (asterisksCounter % 2 == 1) {
                    System.out.print(" ");
                }
            }
            for (int asterisksPrinter = 0; asterisksPrinter < asterisksCounter; asterisksPrinter++){
                if (asterisksCounter % 2 == 1) {
                    System.out.print(" *");
                }
            }
            if (asterisksCounter % 2 == 1) {
                System.out.println();
            }
        }
    }

    public void bottomPrinter(){

        for (int asterisksCounter = 1; asterisksCounter <= getCounter(); asterisksCounter++){
            for (int spacePrinter = 1; spacePrinter <= asterisksCounter; spacePrinter++ ){
                if (asterisksCounter % 2 == 1) {
                    System.out.print(" ");
                }
            }
            for (int asterisksPrinter = getCounter(); asterisksPrinter >= asterisksCounter; asterisksPrinter--){
                if (asterisksCounter % 2 == 1) {
                    System.out.print(" *");
                }
            }
            if (asterisksCounter % 2 == 1) {
                System.out.println();
            }
        }
    }
    public void printDiamond(){
        topDiamondPrinter();
        bottomPrinter();
    }

    public int getCounter() {
        return counter;
    }
}
