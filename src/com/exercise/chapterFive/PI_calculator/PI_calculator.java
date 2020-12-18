package com.exercise.chapterFive.PI_calculator;

public class PI_calculator {

    private int numberOfTerms;
    private double PI;

    public void setNumberOfTerms(int numberOfTerms) {
        if (numberOfTerms > 0){
            this.numberOfTerms = numberOfTerms;
        }
    }

    public int getNumberOfTerms() {
        return numberOfTerms;
    }

    public void calculatePI_series() {
        int divider = 1;
        PI = 4.0;
        System.out.printf("%5s%10s%n", "Series", "PI Value");
        for (int counter = 1; counter < getNumberOfTerms(); counter++) {
            if (counter % 2 == 1) {
                PI = PI - (4.0 / (divider + 2));
            }
            if (counter % 2 == 0){
                PI = (PI + 4.0 / (divider + 2));
            }
            System.out.printf("%5d%10.4f%n", counter, PI);
            divider +=2;
        }
    }

    public double getPI_series() {
        return PI;
    }
}
