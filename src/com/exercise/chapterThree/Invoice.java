package com.exercise.chapterThree;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantityOfItemsPurchased;
    private double pricePerItem;
    private double amount;
    public Invoice(String partNumber, String partDescription, int quantityOfItemsPurchased, double pricePerItem){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantityOfItemsPurchased = quantityOfItemsPurchased;
        this.pricePerItem = pricePerItem;
    }
    public String getPartNumber() {
        return partNumber;
    }
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    public String getPartDescription() {
        return partDescription;
    }
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }
    public int getQuantityOfItemsPurchased() {
        return quantityOfItemsPurchased;
    }
    public void setQuantityOfItemsPurchased(int quantityOfItemsPurchased) {
        this.quantityOfItemsPurchased = quantityOfItemsPurchased;
    }
    public double getPricePerItem() {
        return pricePerItem;
    }
    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
    public void setAmount(){
                if (pricePerItem > 0 && quantityOfItemsPurchased > 0) {
                    this.amount = pricePerItem * quantityOfItemsPurchased;
                }
    }
    public double getInvoiceAmount() {
        return amount;
    }

    public static void main(String[] args) {

    }
}