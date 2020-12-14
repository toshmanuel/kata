package com.exercise.chapterFive.ModifiedCompoundInterest;


public class ModifiedCompoundInterest {
    private double principal;

    public void calculateCompoundInterest() {
        for (int rate = 5; rate <= 10; rate++){
            double principal = 1000;
            this.principal = principal;
            System.out.printf("%5s  %14s   %15s%n", "Years", "Principal", "rate");
            for (int years = 1; years <=10; years++){
                principal = principal * (Math.pow((1 + (rate / (100 * 1.0))), years));
                System.out.printf("%5d  %14.2f  %15d%s%n", years, principal, rate,"%");
            }
            System.out.println();
            System.out.println();
        }
    }

    public double getCompoundInterest() {
        return principal;
    }
}
