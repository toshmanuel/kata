package com.exercise.chapterFour.HighestNumber;

import javax.swing.*;

public class HighestNumber {
    int number;
    int number1;
    int counter;
    int counterReader;
    public void rangeOfNumbers() {

        counter = 2;
        if (counterReader > 0) {
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter input" + 1));
            while (counter <= getCounterReader()) {
                number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter input" + counter));
                if (number1 > number) {
                    number = number1;
                }
                counter++;
            }
        }
    }

    public int getHighestEntry() {
        return number;
    }

    public void setCounterReader(int counterReader){
        if(counterReader > 0){
            this.counterReader = counterReader;
        }
    }

    public int getCounterReader() {
        return counterReader;
    }
}
