package com.exercise.chapterSix.Minimum3;

public class Minimum3 {
    private float min;
    public void setMinValue(float input1, float input2, float input3) {
        min = Math.min(input1, Math.min(input2, input3));
    }

    public float getMinValue() {
        return min;
    }
}
