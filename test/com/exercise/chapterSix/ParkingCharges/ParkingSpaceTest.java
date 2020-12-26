package com.exercise.chapterSix.ParkingCharges;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingSpaceTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testIfCustomerNameCanBeSet(){
        String customer1 = "Hope Hill";
        String customer = Customers.customersName(customer1);
        assertEquals("Hope Hill", customer);
    }
    @Test
    void testSetNumberOfParkingHours(){
        int numberOfParkingHours = 10;
        int hours = CustomerBill.setHours(numberOfParkingHours);
        assertEquals(numberOfParkingHours, hours);
        System.out.println(hours);
    }

    @Test
    void testCheckIfNumberOfHoursCannotBeSetToANegativeValue(){
        int numberOfParkingHours = -10;
        int hours = CustomerBill.setHours(numberOfParkingHours);
        assertEquals(0, hours);
        System.out.println(hours);
    }
    @Test
    void testToCheckTheChargeOnOneCustomer(){
//        testSetNumberOfParkingHours();
        CustomerBill.setHours(10);
        CustomerBill.calculateCharges();
        assertEquals(5.5,CustomerBill.getCharges());
    }
    @Test
    void testToCheckTheChargeWhenTheParkingTimeIsLessThanThreeHours(){
        CustomerBill.setHours(3);
        Customers.billingCharges();
        assertEquals(2,Customers.getTotalCharges());
        System.out.println(Customers.getTotalCharges());
    }
    @Test
    void testToCheckChargeWhenChargeIsGreaterThanTen(){
        CustomerBill.setHours(23);
        Customers.billingCharges();
        assertEquals(10,Customers.getTotalCharges());
        System.out.println(Customers.getTotalCharges());
    }
    @Test
    void testToSetTheNumberOfCustomers(){
        ParkingSpace parking = new ParkingSpace();
        parking.setNumberOfCustomers(5);
        assertEquals(5,parking.getNumberOfCustomers());
    }
    @Test
    void testToCalculateAndDisplayCustomersInfo(){
        ParkingSpace parking = new ParkingSpace();
        parking.setNumberOfCustomers(5);
        parking.calculateEachCustomersCharge("Joe",15);
        parking.calculateEachCustomersCharge("Joey",10);
        assertEquals(5, parking.getNumberOfCustomers());
    }
}