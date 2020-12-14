package com.exercise.chapterFive.SalesCalculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesCalculatorTest {
    SalesCalculator sales;

    @BeforeEach
    void setUp() {
        sales = new SalesCalculator();
    }

    @AfterEach
    void tearDown() {
        sales = null;
    }
    @Test
    void testToDetermineProductNumber(){
        sales.setProductNumber();
        assertEquals(4, sales.getProductNumber());
    }
    @Test
    void testToAssertThatProductNumberIsANonNegativeNumber(){
        sales.setProductNumber();
        assertNotEquals(-5, sales.getProductNumber());
    }
    @Test
    void testToCheckProductPricePerItem(){
        sales.setProductNumber();
        assertEquals(2.98, sales.getProductPrice());
    }
    @Test
    void testToConfirmTheQuantitySold(){
        sales.setQuantitySold();
        assertEquals(5, sales.getQuantitySold());
    }
    @Test
    void testToConfirmIfTheLoopCanStop(){
        sales.collectInputs();
        assertEquals(-1, sales.getProductNumber());
    }
    @Test
    void testToCalculateTotalPrice(){
        sales.collectInputs();
        assertEquals(288.2, sales.getTotalPrice());
    }
}

//        b) quantity sold
//        Your program should use a switch statement to determine the retail price for each product. It
//        should calculate and display the total retail value of all products sold. Use a sentinel-controlled
//        loop to determine when the program should stop looping and display the final results.