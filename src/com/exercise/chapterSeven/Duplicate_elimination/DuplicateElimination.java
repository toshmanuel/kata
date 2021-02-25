package com.exercise.chapterSeven.Duplicate_elimination;


public class DuplicateElimination {
    private int input;
    private int[] newInput;
    private int numberOfUniqueDigits = 1;

    public DuplicateElimination() {
    }

    public void setInput(int input) {
        boolean isInputValid = input >= 10 && input <= 100;
        if(isInputValid){
            this.input = input;
        }
    }

    public int getInput() {
        return input;
    }

    public void checkForDuplicate(int[] inputs) {
        for (int content : inputs) {
            for (int counter : inputs) {
                if (content != counter) {
                    numberOfUniqueDigits++;
                }
            }
        }
        numberOfUniqueDigits = numberOfUniqueDigits / (inputs.length - 1);
        newInput = new int[numberOfUniqueDigits];
    }

}
