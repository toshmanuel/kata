package com.exercise.chapterFive.PI_calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PI_calculatorTest {
    PI_calculator piCalculator;

    @BeforeEach
    void setUp() {
        System.out.println("Test Starting");
        piCalculator = new PI_calculator();
    }

    @AfterEach
    void tearDown() {
        piCalculator = null;
        System.out.println("Test ends");
    }
    @Test
    void testToGetTheFirstTerm(){
        piCalculator.setNumberOfTerms(1);
        assertEquals(1, piCalculator.getNumberOfTerms());
    }
    @Test
    void testToCalculateThePI_series(){
        piCalculator.setNumberOfTerms(200000);
        piCalculator.calculatePI_series();
        assertEquals(1, piCalculator.getPI_series());
    }
}

//(Calculating the Value of π) Calculate the value of π from the infinite series
//        Print a table that shows the value of π approximated by computing the first 200,000 terms of this
//        series. How many terms do you have to use before you first get a value that begins with 3.14159?