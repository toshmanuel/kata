package com.exercise.chapterSix.ParkingCharges;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        ParkingSpace parking = new ParkingSpace();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter customer's name: ");
        String name = input.nextLine();
        System.out.println("Enter number of Hours they parked their car");
        int charge = input.nextInt();
        parking.calculateEachCustomersCharge(name, charge);
        System.out.println(name + "    "  + "    " + CustomerBill.getCharges());
    }
}
