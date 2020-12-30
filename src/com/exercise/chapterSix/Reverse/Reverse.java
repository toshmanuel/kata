package com.exercise.chapterSix.Reverse;

public class Reverse {
    private int input;

    public void setInput(int input) {
        if(input > 0){
            this.input = input;
        }
    }

    public int getInput() {
        return input;
    }

    public String reverseInput(int input) {
        String reversedInput = "";
        String stringedInput = "" + input;
        for(int counter = 0; counter < stringedInput.length(); counter++){
            reversedInput = reversedInput + stringedInput.charAt((stringedInput.length()-1) - counter);
        }
        return reversedInput;
    }
}
