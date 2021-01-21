package com.exercise.chapterSeven.SalesCommission;

public class SalesCommission {
    private int commission;

    private double getCommissionPercent() {
        return 0.09;
    }

    private void calculateIndividualCommission(int individualSale) {
        commission = (int) (getCommissionPercent() * individualSale);
    }

    public void calculateCommission(int[] sales) {
        for (int counter = 0; counter < sales.length; counter++) {
            calculateIndividualCommission(sales[counter]);
            sales[counter] = commission;
        }
    }

    private int calculateWage(int individualSale) {
        final int basePay = 200;
        calculateIndividualCommission(individualSale);
        return basePay + commission;
    }

    public void calculateWages(int[] sales) {
        for (int counter = 0; counter < sales.length; counter++) {
            int wage = calculateWage(sales[counter]);
            sales[counter] = wage;
        }
    }

    private int determineFrequenciesCase(int wageCase) {
        return wageCase / 100;
    }

    public void insertFrequencies(int[] frequency, int[] sales) {
        for (int counter = 0; counter < sales.length; counter++) {
            int wage = calculateWage(sales[counter]);
            sales[counter] = wage;
            int wageCase = determineFrequenciesCase(sales[counter]);
            switch (wageCase) {
                case 2 -> ++frequency[0];
                case 3 -> ++frequency[1];
                case 4 -> ++frequency[2];
                case 5 -> ++frequency[3];
                case 6 -> ++frequency[4];
                case 7 -> ++frequency[5];
                case 8 -> ++frequency[6];
                case 9 -> ++frequency[7];
                default -> ++frequency[8];
            }
        }
    }
}

//    private void calculateIndividualCommission(int[] sales, double commissionPercent, int counter) {
//        commission = (int) (commissionPercent * sales[counter]);
//    }
//    calculateIndividualCommission(sales, commissionPercent, counter);