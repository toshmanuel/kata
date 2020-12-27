package com.exercise.chapterSix.Mulitples;

public class Multiples {

    private int firstInt;
    private int secondInt;

    public void setFirstInteger(int firstInt) {
        if (firstInt > 0){
            this.firstInt = firstInt;
        }
    }

    public int getFirstInteger() {
        return firstInt;
    }

    public void setSecondInteger(int secondInt) {
        if (secondInt > 0){
            this.secondInt = secondInt;
        }
    }

    public int getSecondInteger() {
        return secondInt;
    }

    public boolean isMultiples(int firstInteger, int secondInteger) {
        return (secondInteger % firstInteger) == 0;
    }
}
