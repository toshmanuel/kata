package com.exercise.chapterFive.FacebookGrowth;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacebookGrowthRateTest {
    FacebookGrowthRate growthRate;
    @BeforeEach
    void setUp() {
        growthRate = new FacebookGrowthRate();
    }

    @AfterEach
    void tearDown() {
        growthRate = null;
    }

    @Test
    void testToIncreasedNumberOfUsers(){
        growthRate.calculateGrowthRate();
        assertEquals(40000000,
                growthRate.getGrowthRate());
    }

    @Test
    void testToDetermineWhatMonthTheUserWouldReachOnePointFiveBillion(){
        growthRate.calculateUserGrowth();
        assertEquals(12, growthRate.getMonth());
    }
}