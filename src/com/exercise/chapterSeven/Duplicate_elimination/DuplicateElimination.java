package com.exercise.chapterSeven.Duplicate_elimination;

import java.util.Arrays;

public class DuplicateElimination {
    private int input;
    private int[] newInput;

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
        Arrays.sort(inputs);
        for(int counter = 0; counter < inputs.length; counter++){
            for(int count = 0; count < counter; count++){
                if(inputs[counter] == inputs[count]){
                    inputs[count] = inputs[counter];
                }
            }
            newInput[counter] = inputs[counter];
            System.out.println(newInput.length);
        }
    }

}
