package com.exercise.chapterFive.SmallestInteger;

import javax.swing.*;

public class SmallestInteger {
    private int entry;

    public void setNumberOfEntries() {
        int entry = Integer.parseInt(JOptionPane.showInputDialog("Enter number of values you \n" +
                "want to compare"));
        if (entry > 0) {
            this.entry = entry;
        }
    }

    public int getEntry() {
        return entry;
    }

    public int getMinValue() {
        int numCounter = 1;
        int min = Integer.parseInt(JOptionPane.showInputDialog("Enter input " + numCounter));

        while (numCounter < getEntry()){
            int input = Integer.parseInt(JOptionPane.showInputDialog("Enter input " + ++numCounter));

            if (min > input){
                min = input;
            }
        }
        return min;
    }
}
