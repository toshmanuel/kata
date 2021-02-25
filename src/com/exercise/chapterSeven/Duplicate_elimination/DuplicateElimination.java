package com.exercise.chapterSeven.Duplicate_elimination;


import java.util.Arrays;

public class DuplicateElimination {
    private int input;
    private int[] newInput;
    private int numberOfUniqueDigits = 0;

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

    private void deleteDuplicates(int[] inputs) {
        Arrays.sort(inputs);
        newInput = new int[inputs.length];
        int indexOfNewArray = 0;
        for (int counter = 0; counter < inputs.length - 1;counter++) {
            if(inputs[counter] != inputs[counter + 1]){
                newInput[indexOfNewArray++] = inputs [counter];
            }
            newInput[indexOfNewArray]  = inputs[inputs.length - 1];
        }
        System.out.println(Arrays.toString(newInput));
    }

    public void createNewArray(int[] inputs){
        deleteDuplicates(inputs);
         for(int element : getNewInput()){
             if(element != 0){
                 numberOfUniqueDigits++;
             }
         }
         int[] newArr = new int[numberOfUniqueDigits];

        for(int index = 0; index < numberOfUniqueDigits -1; index++){

                newArr[index] = getNewInput()[index];
                   }
        System.out.println(Arrays.toString(newArr));
        newInput = newArr;
        System.out.println(Arrays.toString(newInput));
    }

    public int[] getNewInput() {
        return newInput;
    }

    public int getNumberOfUniqueElements() {
        return numberOfUniqueDigits;
    }
}
