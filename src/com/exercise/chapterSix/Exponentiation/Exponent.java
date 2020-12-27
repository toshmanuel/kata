package com.exercise.chapterSix.Exponentiation;

public class Exponent {
    private int base;
    private int exponent;
    private int exponentResult;

    public void setBaseValue(int base) {
        this.base = base;
    }

    public int getBaseValue() {
        return base;
    }

    public void setExponentialValue(int exponent) {
        if (exponent > 0){
            this.exponent = exponent;
        }
    }

    public int getExponentialValue() {
        return exponent;
    }

    public void calculateExponentValue(int base, int exp) {
        base = getBaseValue();
        exp = getExponentialValue();
        exponentResult = 1;
        for(int counter = exp; counter > 0; counter--){
            exponentResult = base * exponentResult;
        }
    }

    public int getExponentResult() {
        return exponentResult;
    }
}
