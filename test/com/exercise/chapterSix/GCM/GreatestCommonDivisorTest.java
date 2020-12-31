package com.exercise.chapterSix.GCM;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {
    GreatestCommonDivisor gcd;

    @BeforeEach
    void setUp() {
        gcd = new GreatestCommonDivisor();
    }

    @AfterEach
    void tearDown() {
        gcd = null;
    }

    @Test
    void testToCheckTheCommonGreatestDivisor(){
        gcd.checkGreatestDivisor(45, 75);
        assertEquals(15, gcd.getGreatestDivisor());
    }
}