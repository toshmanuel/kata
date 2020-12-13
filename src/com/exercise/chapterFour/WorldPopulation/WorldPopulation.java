package com.exercise.chapterFour.WorldPopulation;

public class WorldPopulation {

    private int years;
    private double population = 7_800_000_000L;

    public void setYears(int years) {
        if (years > 0) {
            this.years = years;
        }
    }
    public int getYears (){
        return years;
    }

    public void calculatePopulation() {
        int year = 1;
        System.out.printf("%5s %20s %20s%n", "Years", "Yearly Population", "     Yearly Population Increase");
        while(year <= getYears()){
            double rate = 0.0105;
            double increase = population * rate;
            population = population + increase;
            System.out.printf("%5d %20.2f %31.2f%n", year, population, increase);
            year++;
        }
    }

    public double getPopulation() {
        return population;
    }
}
