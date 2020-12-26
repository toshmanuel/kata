package com.exercise.chapterSix.ParkingCharges;

public class CustomerBill {
    private static int hours;
    private static double charge = 2;
    public static int setHours(int hours){
        if (hours > 0 && hours < 25 ){
            CustomerBill.hours = hours;
        }else {
            CustomerBill.hours = 0;
            System.out.println("Enter valid time");
        }
        return CustomerBill.hours;
    }
    public static void calculateCharges(){
        if(hours <= 3){
            charge =2;
        }else{
            int extraHour = hours - 3;
            charge = 2 + (extraHour * 0.5);
        }
        if (charge > 10){
            charge = 10;
        }
    }
    public static double getCharges(){
        return charge;
    }



}
