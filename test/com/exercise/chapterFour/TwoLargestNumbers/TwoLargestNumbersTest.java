package com.exercise.chapterFour.TwoLargestNumbers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoLargestNumbersTest {
    TwoLargestNumbers twoLargestNumbers;
    @BeforeEach
    void setUp() {
        System.out.println("Starting New Test");
        twoLargestNumbers = new TwoLargestNumbers();
    }

    @AfterEach
    void tearDown() {
        twoLargestNumbers = null;
        System.out.println("Ending Test");
    }
    @Test
    void testToSetCounterReader(){
        twoLargestNumbers.setCount(10);
        assertEquals(10, twoLargestNumbers.getCount());
    }
    @Test
    void testToAssertThatCounterReaderCannotHaveANegativeValue(){
        twoLargestNumbers.setCount(-12);
        assertEquals(0, twoLargestNumbers.getCount());
    }
    @Test
    void testToSetCheckHighestNumber(){
        twoLargestNumbers.setCount(5);
        twoLargestNumbers.setHighestNumber();
        assertEquals(50, twoLargestNumbers.getHighestNumber());
    }
    @Test
    void testToCheckTheValueOfHighestValueWhenTheCounterRangeIsSetToZero(){
        twoLargestNumbers.setCount(0);
        twoLargestNumbers.setHighestNumber();
        assertEquals(0, twoLargestNumbers.getHighestNumber());
    }
    @Test
    void testToCheckTheValueOfHighestValueWhenTheCounterRangeIsSetToNegative(){
        twoLargestNumbers.setCount(-12);
        twoLargestNumbers.setHighestNumber();
        assertEquals(0, twoLargestNumbers.getHighestNumber());
    }
    @Test
    void testToGetTheSecondHighestInput(){
        twoLargestNumbers.setCount(10);
        twoLargestNumbers.setSecondLargest();
        assertEquals(15, twoLargestNumbers.getSecondLargest());
    }
    @Test
    void testToCheckIfTheThirdInputIsGreaterThanFirstAndSecond(){
        twoLargestNumbers.setCount(5);
        twoLargestNumbers.setSecondLargest();
        assertEquals(30, twoLargestNumbers.getSecondLargest());
    }
}