package com.exercise.chapterFour.Factorial;

import javax.swing.*;

public class Factorial {

    private int input;
    private long factorialValue = 1;
    private double exponentValue;

    public void setInput() {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Enter a value to calculate \n" +
                " the factorial of the number"));
        if (input >= 0){
            this.input = input;
        }else{
            System.out.println("Enter a valid input");
        }
    }

    public int getInput() {
        return input;
    }

    public void calculateFactorial() {
        int factorialCounter = 1;
        factorialValue =1;
        while(factorialCounter <= getInput()){
            factorialValue = factorialValue * factorialCounter;
            factorialCounter++;
        }
    }

    public long getFactorial() {
        return factorialValue;
    }

    public void calculateExponent() {
        exponentValue = 1;
        int factorialCounter = 1;
        while (factorialCounter <= getInput()){
            int exponentCounter = 1;
            factorialValue = 1;
            while(exponentCounter <= factorialCounter){
                factorialValue = factorialValue * exponentCounter;
                exponentCounter++;
            }
            double factorialInverse = (1.0 / factorialValue);
            exponentValue = exponentValue + factorialInverse;
            factorialCounter++;
        }
    }

    public double getExponentValue() {
        return exponentValue;
    }

    public void calculateExponent_X() {
        exponentValue = 1;
        int factorialCounter = 1;
        while (factorialCounter <= getInput()){
            int exponentCounter = 1;
            factorialValue = 1;
            while(exponentCounter <= factorialCounter){
                factorialValue = factorialValue * exponentCounter;
                exponentCounter++;
            }
            double factorialInverse = (Math.pow(getInput(), factorialCounter) / factorialValue);
            exponentValue = exponentValue + factorialInverse;
            factorialCounter++;
        }
    }
}
