package com.exercise.chapterFive.SalesCalculator;

import javax.swing.*;

public class SalesCalculator {
    private int productNumber;
    private int quantitySold;
    private double totalPrice = 0L;

    public void setProductNumber() {
        int productNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter product number: \n(product number ranges " +
                "from 1-5) \n " +
                "or enter a negative value to terminate"));
        if(productNumber < 6){
            this.productNumber = productNumber;
        }
    }

    public int getProductNumber() {
        return productNumber;
    }

    public double getProductPrice() {
        return switch (productNumber){
            case 1 -> 2.98;
            case 2 -> 4.50;
            case 3 -> 9.98;
            case 4 -> 4.49;
            case 5 -> 6.87;

            default -> throw new IllegalStateException("Unexpected value: " + productNumber);
        };
    }

    public void setQuantitySold() {
        int quantitySold = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity sold"));
        if (quantitySold > 0){
            this.quantitySold = quantitySold;
        }
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void collectInputs() {
        while(productNumber != -1){
            setProductNumber();
            setQuantitySold();
            if(productNumber > 0 && quantitySold > 0){
                double pricePerItem = getProductPrice() * quantitySold;
                totalPrice = totalPrice + pricePerItem;
            }
        }
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
