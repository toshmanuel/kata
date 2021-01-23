package com.exercise.chapterSeven.SalesCommission;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesCommissionTest {
    SalesCommission salesCommission;

    @BeforeEach
    void setUp() {
        salesCommission = new SalesCommission();
    }

    @AfterEach
    void tearDown() {
        salesCommission = null;
    }

    @Test
    void testToDetermineArrayLength(){
        salesCommission.setArrayLength(12);
        assertEquals(12, salesCommission.getArrayLength());
    }

    @Test
    void testToConfirmIfArrayLengthCannotBeANegativeValue(){
        salesCommission.setArrayLength(-12);
        assertNotEquals(-12, salesCommission.getArrayLength());
    }
    @Test
    void testDetermineCommission(){
        int[] sales = {1000, 12000, 1000, 101001};
        salesCommission.calculateCommission(sales);
        assertEquals(90, sales[0]);
    }

    @Test
    void testToCalculateWeeklyWage(){
        int[] sales = {1000, 2000, 3000, 4000, 5000};
        salesCommission.calculateWages(sales);
        assertEquals(290, sales[0]);
    }

    @Test
    void testToDetermineFrequencyOfPay(){
        int[] sales = {5000, 2000, 3000, 5000, 5000};
        int[] frequency = new int[9];
        salesCommission.insertFrequencies(frequency, sales);
        assertEquals(3, frequency[4]);
    }
}