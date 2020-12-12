package com.exercise.chapterFour.SquareOfAsterisks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareOfAsterisksTest {
    SquareOfAsterisks asterisks;

    @BeforeEach
    void setUp() {
        System.out.println("Test Starting");
        asterisks = new SquareOfAsterisks();
    }

    @AfterEach
    void tearDown() {
        asterisks = null;
        System.out.println("Test ended");
    }
    @Test
    void testToConfirmUserInput(){
        asterisks.setSizeOfSquare();
        assertEquals(6, asterisks.getSizeOfSquare());
    }
    @Test
    void testToAssertThanUserInPutCannotBeGreater_20(){
        asterisks.setSizeOfSquare();
        assertNotEquals(21, asterisks.getSizeOfSquare());
    }
    @Test
    void testToAssertThatUserInputCannotBeLessThan_1(){
        asterisks.setSizeOfSquare();
        assertNotEquals(-1, asterisks.getSizeOfSquare());
    }
    @Test
    void testToPrintSquare(){
        asterisks.setSizeOfSquare();
        asterisks.printSquare();
        assertEquals(5, asterisks.getSizeOfSquare());
    }
}