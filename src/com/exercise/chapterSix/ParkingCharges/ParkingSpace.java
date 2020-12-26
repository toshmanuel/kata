package com.exercise.chapterSix.ParkingCharges;


public class ParkingSpace {
    private int numberOfCustomers;

    public void setNumberOfCustomers(int numberOfCustomers){
        if(numberOfCustomers > 0){
            this.numberOfCustomers = numberOfCustomers;
        }
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public void calculateEachCustomersCharge(String name, int hours){
            Customers.customersName(name);
            CustomerBill.setHours(hours);
            CustomerBill.calculateCharges();
    }
}
