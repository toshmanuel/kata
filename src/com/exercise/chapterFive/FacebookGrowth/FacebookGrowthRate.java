package com.exercise.chapterFive.FacebookGrowth;

public class FacebookGrowthRate {
    private double growth;
    private double population = 1_000_000_000;
    private int month;
    public void calculateGrowthRate() {
        double growthPercent = 0.04;
        growth = population * (growthPercent);
    }

    public double getGrowthRate() {
        return growth;
    }

    public void calculateUserGrowth() {
        month = 1;
        System.out.printf("%7s%18s%n","Months", "Number Of Users");
        while(population <= 1500000000){
            calculateGrowthRate();
            population = getGrowthRate() + population;
            System.out.printf("%7d%18.1f%n", month,population);
            month++;
        }
    }

    public int getMonth() {
        return month;
    }
}
