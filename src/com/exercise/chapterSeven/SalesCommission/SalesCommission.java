package com.exercise.chapterSeven.SalesCommission;

public class SalesCommission {
    private int commission;
    private int arrayLength;
    private int arrayContent;

    private double getCommissionPercent() {
        return 0.09;
    }

    private void calculateIndividualCommission(int individualSale) {
        if (individualSale > 0) {
            commission = (int) (getCommissionPercent() * individualSale);
        }
    }

    private int calculateWage(int individualSale) {
        final int basePay = 200;
        calculateIndividualCommission(individualSale);
        return basePay + commission;
    }

    public void calculateWages(int[] sales) {
        for (int counter = 0; counter < getArrayLength(); counter++) {
            int wage = calculateWage(sales[counter]);
            sales[counter] = wage;
        }
    }

    private int determineFrequenciesCase(int wageCase) {
        return wageCase / 100;
    }

    public void insertFrequencies(int[] frequency, int[] sales) {
        for (int counter = 0; counter < getArrayLength(); counter++) {
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
    public void setArrayLength(int arrayLength){
        if(arrayLength > 0) {
            this.arrayLength = arrayLength;
        }
    }

    public int getArrayLength(){
        return arrayLength;
    }

    public void setArrayContent(int arrayContent){
        this.arrayContent = arrayContent;
    }

    public int getArrayContent(){
        return arrayContent;
    }
}

//    private void calculateIndividualCommission(int[] sales, double commissionPercent, int counter) {
//        commission = (int) (commissionPercent * sales[counter]);
//    }
//    calculateIndividualCommission(sales, commissionPercent, counter);