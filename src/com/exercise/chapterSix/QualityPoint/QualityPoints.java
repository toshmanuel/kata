package com.exercise.chapterSix.QualityPoint;

public class QualityPoints {
    private int average;

    public void setAverage(int average) {
        if (average > 0 && average <= 100){
            this.average = average;
        }
    }

    public int getAverage() {
        return average;
    }

    public int checkQuality(int average) {
        average = average / 10;
        return switch (average){
          case 9,10 -> 4;
          case 8 -> 3;
          case 7 -> 2;
          case 6 -> 1;
            default -> throw new IllegalStateException("Unexpected value: " + average);
        };
    }
}
