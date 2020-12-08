package com.exercise.chapterFour.HighestNumber;

import javax.swing.*;

public class HighestNumber {
    int largest;
    int number;
    int counter;
    int counterReader;
    public void rangeOfNumbers() {

        counter = 2;
        if (counterReader > 0) {
            largest = Integer.parseInt(JOptionPane.showInputDialog("Enter input" + 1));
            while (counter <= getCounterReader()) {
                number = Integer.parseInt(JOptionPane.showInputDialog("Enter input" + counter));
                if (number > largest) {
                    largest = number;
                }
                counter++;
            }
        }
    }

    public int getHighestEntry() {
        return largest;
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
