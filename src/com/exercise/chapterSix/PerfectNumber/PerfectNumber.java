package com.exercise.chapterSix.PerfectNumber;

public class PerfectNumber {
    private int input;
    private int sum;

    public void setInput(int input) {
        if (input > 0){
            this.input = input;
        }
    }

    public void calculatePerfectInput(int input) {
        this.input = input;
        sum = 0;
        int counter;
        StringBuilder factor = new StringBuilder();
        for (counter = 1; counter < input; counter++) {
            if (input % counter == 0) {
                sum = sum + counter;

                factor.append(counter).append(" ");
            }
        }if (sum == input){
            System.out.println("perfect number is: "+ sum +"\n" + "Factors are: " +
                    ""+ factor);
        }
    }

    public boolean isPerfect() {
        return (sum / input) == 1;
    }

    public int getInput() {
        return input;
    }

    public void perfectNumberOfRange(int input){
        for (int counter = 1; counter <= input; counter++){
            calculatePerfectInput(counter);
        }
    }
}
