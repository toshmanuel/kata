package com.exercise.chapterFour.Factorial;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    Factorial factorial;

    @BeforeEach
    void setUp() {
        System.out.println("Starting test");
        factorial = new Factorial();
    }

    @AfterEach
    void tearDown() {
        factorial = null;
        System.out.println("Test Ending");
    }
    @Test
    void testToValidateUserInput(){
        factorial.setInput();
        assertEquals(10, factorial.getInput());
    }
    @Test
    void testToAssertThatUserInputIsANonNegativeNumber(){
        factorial.setInput();
        assertNotEquals(-10, factorial.getInput());
    }
    @Test
    void testToCalculateTheFactorialValueOfAnInput(){
        factorial.setInput();
        factorial.calculateFactorial();
        assertEquals(24, factorial.getFactorial());
    }
    @Test
    void testToCalculateTheFactorialValueOfZero(){
        factorial.setInput();
        factorial.calculateFactorial();
        assertEquals(1, factorial.getFactorial());
    }
    @Test
    void testToCalculateTheExponentialValueOfAnInput(){
        factorial.setInput(); // input = 3
        factorial.calculateExponent(); //input is 3
        assertEquals(16.0/6, factorial.getExponentValue());
    }
    @Test
    void testToCalculateTheExponentValueOfUserInput(){
        factorial.setInput(); //input = X = 3
        factorial.calculateExponent_X(); //X is equal to 3
        assertEquals(13, factorial.getExponentValue());
    }

}