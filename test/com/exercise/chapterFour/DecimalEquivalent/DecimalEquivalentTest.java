package com.exercise.chapterFour.DecimalEquivalent;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalEquivalentTest {
    DecimalEquivalent decimalEquivalent;
    @BeforeEach
    void setUp() {
        System.out.println("Test Starting");
        decimalEquivalent = new DecimalEquivalent();
    }

    @AfterEach
    void tearDown() {
        decimalEquivalent = null;
        System.out.println("end test");
    }

    @Test
    void testToAssertThatNumberIsNotAValidBinaryInput(){
        decimalEquivalent.setInput();
        assertNotEquals(111, decimalEquivalent.getInput());
    }
    @Test
    void testToAssertThatInputIsABinaryInput(){
        decimalEquivalent.setInput();
        assertEquals(1111, decimalEquivalent.getInput());
    }
    @Test
    void testToAssertThatUserInputIsANonNegativeNumber(){
        decimalEquivalent.setInput();
        assertNotEquals(-10, decimalEquivalent.getInput());
    }
    @Test
    void testToCheckIfInputIsA(){
        decimalEquivalent.setInput();
        decimalEquivalent.checkDecimalValue();
        assertEquals(21, decimalEquivalent.getDecimalValue());

    }
}