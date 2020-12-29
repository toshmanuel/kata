package com.exercise.chapterSix.SeparatingDigits;

public class Separator {
    private static int divisor = 10000;
    private int input;
    private byte remainder;

    public void setInput(int input) {
        if(input > 0 && input < 99999){
            this.input = input;
        }else
            System.out.println("Enter valid input: value from 1 - 99999");
    }

    public int getInput() {
        return input;
    }

    public void calculateQuotient(int input) {
        input = input / (divisor);
        this.input = input;
    }

    public void calculateRemainder(int input) {
        remainder = (byte) (input % 10);
    }

    public byte getRemainder() {
        return remainder;
    }

    public void displayDigits(int input) {
        while (divisor > 0){
            calculateQuotient(input);
            calculateRemainder(getInput());
            if(getInput() > 0) {
                System.out.print(getRemainder());
                System.out.print(" ");
            }
            divisor /= 10;
        }
    }
}
