package com.exercise.chapterSix.CoinTossing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinTossingTest {
    CoinTossing toss;

    @BeforeEach
    void setUp() {
        toss = new CoinTossing();
    }

    @AfterEach
    void tearDown() {
        toss = null;
    }

    @Test
    void testToConfirmTossCoinOption(){
        toss.flip();
        assertNotEquals(null, toss.toString());
    }
}