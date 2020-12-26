package com.exercise.chapterSix.ParkingCharges;

import javax.swing.*;

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
        for(int counter = getNumberOfCustomers(); counter > 0; counter--){
//            name = JOptionPane.showInputDialog("Enter customer's name:");
            Customers.customersName(name);
//            hours = JOptionPane.showInputDialog("How many hours was parked");
//            int hours1 = Integer.parseInt(hours);
            CustomerBill.setHours(hours);
            CustomerBill.calculateCharges();
            System.out.println(name + "    " + hours + "    " + CustomerBill.getCharges());
        }
    }
}
