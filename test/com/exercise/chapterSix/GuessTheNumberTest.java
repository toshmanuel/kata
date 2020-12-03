package com.exercise.chapterSix;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessTheNumberTest {
    GuessTheNumber guessTheNumber;
    @BeforeEach
    void setUp() {
        System.out.println("Test is starting here");
        guessTheNumber = new GuessTheNumber(20);
    }

    @AfterEach
    void tearDown() {
        guessTheNumber = null;
        System.out.println("Test ends here");
    }
    @Test
    void testIfTheNumberIsAnInteger(){
        guessTheNumber.setNumber(12);
        assertEquals(12, guessTheNumber.getNumber());
    }
    @Test
    void testIfNumberEnteredIsLessThanTheRealNumber(){
        guessTheNumber.setGuessNumber(12);
        assertEquals(0, guessTheNumber.getNumber());
    }
    @Test
    void testIfNumberEnteredIsGreaterThanTheRealNumber() {
        guessTheNumber.setGuessNumber(22);
        assertEquals(0, guessTheNumber.getNumber());
    }
    @Test
    void testIfNumberEnteredIsEqualsToTheRealNumber() {
        guessTheNumber.setGuessNumber(20);
        assertEquals(0, guessTheNumber.getNumber());
    }
}