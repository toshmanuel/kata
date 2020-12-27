package com.exercise.chapterSix.Mulitples;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplesTest {
    Multiples multiples;

    @BeforeEach
    void setUp() {
        multiples = new Multiples();
    }

    @AfterEach
    void tearDown() {
        multiples = null;
    }

    @Test
    void testToCheckIfFirstInputIsValid(){
        multiples.setFirstInteger(3);
        assertEquals(3,multiples.getFirstInteger());
    }
    @Test
    void testToCheckIfFirstIntegerCannotBeLessThanZero(){
        multiples.setFirstInteger(-12);
        assertEquals(0, multiples.getFirstInteger());
    }

    @Test
    void testToCheckIfSecondInputIsValid(){
        multiples.setSecondInteger(12);
        assertEquals(12,multiples.getSecondInteger());
    }
    @Test
    void testToCheckIfSecondIntegerCannotBeLessThanZero(){
        multiples.setSecondInteger(-12);
        assertEquals(0, multiples.getSecondInteger());
    }

    @Test
    void testToDetermineIfFirstValueIsAMultipleOfTheSecondValue(){
        multiples.setFirstInteger(2);
        multiples.setSecondInteger(40);
        int firstInteger = multiples.getFirstInteger();
        int secondInteger = multiples.getSecondInteger();
        boolean isMultiple = multiples.isMultiples(firstInteger, secondInteger);
        assertTrue(isMultiple);
    }

    @Test
    void testToDetermineIfFirstValueIsNotAMultipleOfTheSecondValue(){
        multiples.setFirstInteger(21);
        multiples.setSecondInteger(40);
        int firstInteger = multiples.getFirstInteger();
        int secondInteger = multiples.getSecondInteger();
        boolean isMultiple = multiples.isMultiples(firstInteger, secondInteger);
        assertFalse(isMultiple);
    }
}