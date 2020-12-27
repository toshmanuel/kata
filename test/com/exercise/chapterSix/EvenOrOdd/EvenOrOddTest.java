package com.exercise.chapterSix.EvenOrOdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOrOddTest {
    EvenOrOdd evenOrOdd;

    @BeforeEach
    void setUp() {
        evenOrOdd = new EvenOrOdd();
    }

    @AfterEach
    void tearDown() {
        evenOrOdd = null;
    }

    @Test
    void testToCheckIfUserInputIsValid(){
        evenOrOdd.setInput(6);
        assertEquals(6, evenOrOdd.getInput());
    }

    @Test
    void testToCheckIfUserInputIsGreaterThanZero(){
        evenOrOdd.setInput(-6);
        assertNotEquals(-6, evenOrOdd.getInput());
    }

    @Test
    void testToCheckIfUserInputIsAnEvenNumber(){
        evenOrOdd.setInput(6);
        int input = evenOrOdd.getInput();
        boolean isEven = evenOrOdd.isEven(input);
        assertTrue(isEven);
    }

    @Test
    void testToCheckIfUserInputIsNotEven(){
        evenOrOdd.setInput(5);
        int input = evenOrOdd.getInput();
        boolean isEven = evenOrOdd.isEven(input);
        assertFalse(isEven);
    }
}