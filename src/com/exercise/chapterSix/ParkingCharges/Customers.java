package com.exercise.chapterSix.ParkingCharges;

import org.jetbrains.annotations.Contract;

public class Customers {
    @Contract("!null -> param1")
    public static String customersName(String name){
        if (name == null) {
            System.out.println("Enter valid name");
        }return name;
    }
    public static void billingCharges(){
        CustomerBill.calculateCharges();
    }
    public static double getTotalCharges(){
        return CustomerBill.getCharges();
    }
}
