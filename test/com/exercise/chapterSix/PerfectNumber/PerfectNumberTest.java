package com.exercise.chapterSix.PerfectNumber;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumberTest {
    PerfectNumber perfect;

    @BeforeEach
    void setUp() {
        perfect = new PerfectNumber();
    }

    @AfterEach
    void tearDown() {
        perfect = null;
    }

    @Test
    void testToCheckIfIInputIsValid(){
        perfect.setInput(6);
        assertEquals(6, perfect.getInput());
    }

    @Test
    void testToCheckIfInputCannotBeLessThanZero(){
        perfect.setInput(-6);
        assertNotEquals(-6, perfect.getInput());
    }

    @Test
    void testToCheckIfInputIsPerfect(){
        perfect.setInput(6);
        perfect.calculatePerfectInput(perfect.getInput());
        boolean isInputPerfect = perfect.isPerfect();
        assertTrue(isInputPerfect);
    }

    @Test
    void testToCheckIfInputIsNotPerfect(){
        perfect.setInput(8);
        perfect.calculatePerfectInput(perfect.getInput());
        boolean isInputPerfect = perfect.isPerfect();
        assertFalse(isInputPerfect);
    }

    @Test
    void testToPrintMultiplePerfectNumbers(){
        perfect.setInput(1000);
        perfect.perfectNumberOfRange(perfect.getInput());
        boolean isInputPerfect1 = perfect.isPerfect();
        assertTrue(isInputPerfect1);
    }
}