package com.exercise.chapterFour.HighestNumber;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HighestNumberTest {
    HighestNumber highestNumber;

    @BeforeEach
    void setUp() {
        System.out.println("Starting test >>>>>>>>");
        highestNumber = new HighestNumber();
    }

    @AfterEach
    void tearDown() {
        highestNumber = null;
        System.out.println("<<<<<<<<<< Ending test");
    }
    @Test
    void testToReadCounterReader(){
        highestNumber.setCounterReader(10);
        assertEquals(10, highestNumber.getCounterReader());
    }
    @Test
    void testToShowThatCounterReaderIsANonNegativeNumber(){
        highestNumber.setCounterReader(-1);
        assertEquals(0, highestNumber.getCounterReader());
    }
    @Test
    void testToShowTheHighestNumber(){
        highestNumber.setCounterReader(10);
        highestNumber.rangeOfNumbers();
        assertEquals(50, highestNumber.getHighestEntry());
    }
    @Test
    void testToShowThatNoInputWouldBeAllowedIfANegativeCounterReaderIsEntered(){
        highestNumber.setCounterReader(-1);
        highestNumber.rangeOfNumbers();
        assertEquals(0, highestNumber.getHighestEntry());
    }
    @Test
    void testToShowThatNoInputWouldBeAllowedIfAZeroCounterReaderIsEntered(){
        highestNumber.setCounterReader(0);
        highestNumber.rangeOfNumbers();
        assertEquals(0, highestNumber.getHighestEntry());
    }
}