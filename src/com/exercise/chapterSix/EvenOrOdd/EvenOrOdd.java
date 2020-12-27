package com.exercise.chapterSix.EvenOrOdd;

public class EvenOrOdd {
    private int input;

    public void setInput(int input) {
        if (input > 0){
            this.input = input;
        }
    }

    public int getInput() {
        return input;
    }

    public boolean isEven(int input) {
        return input % 2 == 0;
    }
}
