package com.exercise.chapterSix.Reverse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {
    Reverse reverse;

    @BeforeEach
    void setUp() {
        reverse = new Reverse();
    }

    @AfterEach
    void tearDown() {
        reverse = null;
    }

    @Test
    void testToValidateUserInput(){
        reverse.setInput(5);
        assertEquals(5, reverse.getInput());
    }

    @Test
    void testCheckIfInputIsANonNegativeValue(){
        reverse.setInput(-5);
        assertEquals(0, reverse.getInput());
    }

    @Test
    void testToPrintTheReverseOfInput(){
        reverse.setInput(12345);
        String output = reverse.reverseInput(reverse.getInput());
        assertEquals("54321", output);
    }
}