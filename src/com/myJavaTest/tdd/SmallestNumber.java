package com.myJavaTest.tdd;

public class SmallestNumber {

    private int userInput;
    private int counter;
    private int minValue;
    private int newInput;
    public void setUserInput(int userInput) {
        if (userInput < 0){
            return;
        }
        this.userInput = userInput;

    }
    public int getUserInput(){
        return userInput;
    }

    public void countLoop() {
        int counter = 1;
        while (counter < userInput){
            counter++;
            if(newInput <= minValue){
                newInput = minValue;
            }
        }this.counter = counter;
    }
    public int getCounter(){
        return counter;
    }
    public int getMinValue(){
        return minValue;
    }
}


