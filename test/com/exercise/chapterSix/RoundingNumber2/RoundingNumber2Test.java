package com.exercise.chapterSix.RoundingNumber2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoundingNumber2Test {
    RoundingNumber2 roundingNumber2;

    @BeforeEach
    void setUp() {
        roundingNumber2 = new RoundingNumber2();
    }

    @AfterEach
    void tearDown() {
        roundingNumber2 = null;
    }
    @Test
    void testToCheckTheRoundedIntegerValue(){
        double number = roundingNumber2.roundToInteger(12);
        assertEquals(12,number);
    }
    @Test
    void testToCheckTheRoundedTenthValue(){
        double number = roundingNumber2.roundToTenth(12.784);
        assertEquals(12.8,number);
    }
    @Test
    void testToCheckTheRoundedHundredthValue(){
        double number = roundingNumber2.roundToHundredth(12.784);
        assertEquals(12.78,number);
    }
    @Test
    void testToCheckTheRoundedThousandthValue(){
        double number = roundingNumber2.roundToThousandth(12.7848);
        assertEquals(12.785,number);
    }
}