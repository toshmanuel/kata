package com.exercise.chapterFour.SquareOfAsterisks;

import javax.swing.*;

public class SquareOfAsterisks {

    private int size;

    public void setSizeOfSquare() {
        int size = Integer.parseInt(JOptionPane.showInputDialog("Enter The Size " +
                "of Square You Desire To Print" +
                " \n Input should be between 1 and 20"));
        if (size < 1){
            System.out.println("Value should be greater than 0 but not" +
                    " greater than 20");
        }else{
            if (size > 20){
                System.out.println("Value should be lesser than 20" +
                        " but no less than 1");
            }else{
                this.size = size;
            }
        }
    }

    public int getSizeOfSquare() {
        return size;
    }

    public void printSquare() {
        int counter = 0;
    while(counter < size){
        int asteriskPrinter = 0;
            while(asteriskPrinter < size){
                System.out.print("*  ");
                asteriskPrinter++;
            }
            System.out.println();
            counter++;
        }
    }
}
