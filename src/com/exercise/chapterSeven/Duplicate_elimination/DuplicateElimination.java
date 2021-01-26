package com.exercise.chapterSeven.Duplicate_elimination;

import java.util.Arrays;

public class DuplicateElimination {
    private int input;

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
        int[] newInput = new int[inputs.length];
        for (int counter = 0; counter < inputs.length; counter++){
            for(int counter2 = 1; counter2 < inputs.length; counter2++){
                if (inputs[counter2] != inputs[counter]) {
                    newInput[counter] = inputs[counter];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(newInput));
    }

//    public static void main(String[] args) {
//        System.out.printf("%s%13s%n", "counter", "countering");
//        int[] scale = {1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1};
//        int[] frequency = new int[10];
//        for (int x : scale) {
//            ++frequency[x];
//        }
//        for(int i  = 0; i < frequency.length; i++){
//            System.out.printf("%7d%13d%n",i, frequency[i]);
//        }
//    }
}
