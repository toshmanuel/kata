package com.exercise.chapterFive.BarCharts;

import javax.swing.*;

public class BarCharts {

    private int input;

    public void setInput() {
        for (int counter = 1; counter <= 5; counter++) {
            int input = Integer.parseInt(JOptionPane.showInputDialog("Enter input "+ counter));
            this.input = input;
            System.out.printf("%3d    ",input);
            for (int barPrinter = 0; barPrinter < input; barPrinter++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public int getInput() {
        return input;
    }
}
