package com.exercise.chapterFour.SalesCommissionCalculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommissionCalcTest {
    CommissionCalc commissionCalc;
    @BeforeEach
    void setUp() {
        commissionCalc = new CommissionCalc();
    }

    @AfterEach
    void tearDown() {
        commissionCalc = null;
    }
    @Test
    void testToControlTheSentinel(){
        System.out.println("Starting controlling the sentinel");
        commissionCalc.salesEarnings();
        assertEquals(-1, commissionCalc.getSales());
    }
    @Test
    void testToSetTheSalesAmount(){
        System.out.println("Starting test to set sales amount");
        commissionCalc.salesEarnings();
        assertEquals(200, commissionCalc.getSalesEarning());
    }
    @Test
    void testToDetermineTotalSalesOfMultipleSales(){
        System.out.println("Starting test to determine total sales of multiple sales");
        commissionCalc.salesEarnings();
        assertEquals(10000, commissionCalc.getSalesEarning());
    }
    @Test
    void testToDetermineWeeklyEarningsWithCommissions(){
        System.out.println("Starting test to determine weekly earnings with commission");
        commissionCalc.salesEarnings();
        assertEquals(1200, commissionCalc.getTotalEarnings());
    }
}