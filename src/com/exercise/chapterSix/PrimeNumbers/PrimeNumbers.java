package com.exercise.chapterSix.PrimeNumbers;

public class PrimeNumbers {
    private int input;

    public void setInput(int input) {
        if(input > 0){
            this.input = input;
        }
    }

    public int getInput() {
        return input;
    }

    public void checkPrime(int input) {
        int counter;
        for(counter = 2; counter < input; counter++){
            if(input % counter == 0 ) {
                break;
            }
        }if(input - counter <= 0){
            System.out.println(input + " is Prime Number");
        }
    }

    public void primeNumbersFromARange(int input) {
        for(int counter  = 1; counter <= input; counter++){
            checkPrime(counter);
        }
    }
}