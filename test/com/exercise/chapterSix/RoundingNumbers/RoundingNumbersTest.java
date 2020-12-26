package com.exercise.chapterSix.RoundingNumbers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoundingNumbersTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testToSetUserInput(){
        RoundingNumbers number = new RoundingNumbers();
        number.setNumber(0);
        assertEquals(0, number.getNumber());
    }
    @Test
    void testToCheckTheRoundedNumberOfInput(){
        RoundingNumbers number = new RoundingNumbers();
        number.setNumber(10.6);
        double y =number.roundNumber();
        assertEquals(11, y);
    }
}