package com.exercise.chapterFive.SmallestInteger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestIntegerTest {
    SmallestInteger smallestInteger;
    @BeforeEach
    void setUp() {
        System.out.println("Test Starting");
        smallestInteger = new SmallestInteger();
    }

    @AfterEach
    void tearDown() {
        smallestInteger = null;
        System.out.println("Test ends");
    }
    @Test
    void testToValidateNumberOfIntegerEntries(){
        smallestInteger.setNumberOfEntries();
        assertEquals(10, smallestInteger.getEntry());
    }
    @Test
    void testToAssertThatNumberOfEntryIsANonNegativeValue(){
        smallestInteger.setNumberOfEntries();
        assertNotEquals(-20, smallestInteger.getEntry());
    }
    @Test
    void testToGetMinimumValue(){
        smallestInteger.setNumberOfEntries();
        assertEquals(10, smallestInteger.getMinValue());
    }
//    (Find the Smallest Value) Write an application that finds the smallest of several integers.
//    Assume that the first value read specifies the number of values to input from the user.
}