package com.exercise.chapterSix.SeparatingDigits;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeparatorTest {
    Separator separator;

    @BeforeEach
    void setUp() {
        separator = new Separator();
    }

    @AfterEach
    void tearDown() {
        separator = null;
    }

    @Test
    void testToValidateUserInput(){
        separator.setInput(1234);
        assertEquals(1234, separator.getInput());
    }

    @Test
    void testToCheckIfUserInputCannotBeNegative(){
        separator.setInput(-10);
        assertNotEquals(-10, separator.getInput(), "Enter valid input: value from 1 - 99999");
    }

    @Test
    void testToCalculateQuotient(){
        separator.setInput(1234);
        int input = separator.getInput();
        separator.calculateQuotient(input);
        assertEquals(123, separator.getInput());
    }

    @Test
    void testToCalculateRemainder(){
        separator.setInput(1234);
        int input = separator.getInput();
        separator.calculateRemainder(input);
        assertEquals(4,
                separator.getRemainder());
    }

    @Test
    void testToOutputSeparatedValue(){
        separator.setInput(1004);
        int input = separator.getInput();
        separator.displayDigits(input);
        assertEquals(4, separator.getRemainder());
    }
}