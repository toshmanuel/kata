package com.exercise.chapterFive.ModifiedCompoundInterest2;

public class CompoundInterest {

    int principal = 1000;
    double rate = 0.05;
    int amount;

    public void calculateAmount() {
        System.out.printf("%5s   %10s%n", "Years", "Amount Paid");

        for (int year =1; year <= 10; year++){
            amount = (int) (principal *100 * Math.pow((1 + rate), year));
            int secondDecimal = amount % 10;
            amount = amount / 10;
            int firstDecimal = amount % 10;
            amount = amount / 10;
            System.out.printf("%5d %,10d.%d%d%n", year, amount, firstDecimal,secondDecimal);
        }
    }

    public int getAmount() {
        return amount;
    }
//
//        for (int year = 1; year <= 10; year++){
//        amount = principal * Math.pow((1 + rate), year);
//        int integral = (int) (amount *100);
//        System.out.println(integral);
//
//        System.out.printf("%5d %,12.2f%n", year, amount);
//    }
}
