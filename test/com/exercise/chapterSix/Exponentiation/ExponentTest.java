package com.exercise.chapterSix.Exponentiation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExponentTest {
    Exponent exponent;

    @BeforeEach
    void setUp() {
        exponent = new Exponent();
    }

    @AfterEach
    void tearDown() {
        exponent = null;
    }
    @Test
    void testToCheckBaseValue(){
        exponent.setBaseValue(2);
        assertEquals(2,exponent.getBaseValue());
    }
    @Test
    void testToCheckExponentialValue(){
        exponent.setExponentialValue(3);
        assertEquals(3,exponent.getExponentialValue());
    }
    @Test
    void testToCalculateTheExponentValueOfBase(){
        exponent.setBaseValue(5);
        int base = exponent.getBaseValue();
        exponent.setExponentialValue(2);
        int exp = exponent.getExponentialValue();
        exponent.calculateExponentValue(base, exp);
        assertEquals(25, exponent.getExponentResult());
    }
}