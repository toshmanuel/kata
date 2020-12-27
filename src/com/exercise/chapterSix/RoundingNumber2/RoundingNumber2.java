package com.exercise.chapterSix.RoundingNumber2;

import com.exercise.chapterSix.RoundingNumbers.RoundingNumbers;

public class RoundingNumber2 {
    RoundingNumbers roundingNumbers;
    public double roundToInteger(double number) {
        roundingNumbers = new RoundingNumbers();
        roundingNumbers.setNumber(number);
        return Math.floor(roundingNumbers.getNumber() + 0.5);
    }

    public double roundToTenth(double number) {
        roundingNumbers = new RoundingNumbers();
        roundingNumbers.setNumber(number);
        return Math.floor((roundingNumbers.getNumber() * 10 + 0.5))/10;
    }

    public double roundToHundredth(double number) {
        roundingNumbers = new RoundingNumbers();
        roundingNumbers.setNumber(number);
        return Math.floor((roundingNumbers.getNumber() * 100 + 0.5))/100;
    }

    public double roundToThousandth(double number) {
        roundingNumbers = new RoundingNumbers();
        roundingNumbers.setNumber(number);
        return Math.floor((roundingNumbers.getNumber() * 1000 + 0.5))/1000;
    }
}
