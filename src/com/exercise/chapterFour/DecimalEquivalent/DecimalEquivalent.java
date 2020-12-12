package com.exercise.chapterFour.DecimalEquivalent;

import javax.swing.*;

public class DecimalEquivalent {

    private int input;

    int decimalEquivalent = 0;

    public void setInput() {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Enter binary number e.g " +
                "(101101)"));
        if(input > 0){
            int binaryDivision2 = input % 10;
            int input2 = input / 10;
            while((binaryDivision2 <= 1) && ((input2 /10) != 0)){
                binaryDivision2 = input2 % 10;
                input2 = input2 / 10;
            }
            if (binaryDivision2 <= 1 && input2 ==1){
                this.input = input;
            }else {
                System.out.println("Enter A binary digit");
            }
        }else
            System.out.println("Enter valid input");
    }

    public int getInput() {
        return input;
    }

    public void checkDecimalValue() {
        input = getInput();
        int counter = 0;
        int binaryDivision;
        while(((input % 10) <= 1) && ((input /10) != 0)){
            binaryDivision = input % 10;
            input = input / 10;
            decimalEquivalent = (int) (decimalEquivalent + (binaryDivision * Math.pow(2, counter)));
            counter++;
        }
        if (getInput() > 0){
            decimalEquivalent = (int) (decimalEquivalent + (1 * Math.pow(2, counter)));
        }
    }

    public int getDecimalValue() {
        return decimalEquivalent;
    }
}
