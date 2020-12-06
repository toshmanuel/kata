package com.exercise.chapterFour.SalesCommissionCalculator;

import javax.swing.*;

public class CommissionCalc {
    private int totalSales;
    private double totalEarnings;
    private int sales;
    public void salesEarnings() {
        int counter = 1;
        sales = Integer.parseInt(JOptionPane.showInputDialog("Enter item " + counter + " amount: "));

        while (sales > 0){
            totalSales = totalSales + sales;
            counter++;
            sales = Integer.parseInt(JOptionPane.showInputDialog("Enter item " + counter + "amount"));
        }
        totalEarnings = 200 + ((10 / (100 *1.0)) * totalSales);
    }
    public int getSales(){
        return sales;
    }

    public int getSalesEarning() {
        return totalSales;
    }
    public double getTotalEarnings(){
        return totalEarnings;
    }
}
