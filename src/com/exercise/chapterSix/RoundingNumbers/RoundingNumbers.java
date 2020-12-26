package com.exercise.chapterSix.RoundingNumbers;

public class RoundingNumbers {
    private double number;

    public void setNumber(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public double roundNumber() {
        return Math.floor(number + 0.5);
    }
}
