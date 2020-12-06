package com.practice.tdd;

public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 1000;
        double rate = 0.05;
        double amount;

        System.out.printf("%5s   %8s%n", "Years", "Amount");

        for (int year = 1; year <= 10; year++){
            amount = principal * Math.pow((1 + rate), year);

            System.out.printf("%5d %,12.2f%n", year, amount);
        }
    }
}
