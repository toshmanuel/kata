package com.exercise.chapterSix.Minimum3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Minimum3Test {
    Minimum3 minimum;

    @BeforeEach
    void setUp() {
        minimum = new Minimum3();
    }

    @AfterEach
    void tearDown() {
        minimum = null;
    }

    @Test
    void testToCheckTheMinimumOfThreeFloatingValues(){
        minimum.setMinValue(2,3,4);
        assertEquals(2, minimum.getMinValue());
    }
}