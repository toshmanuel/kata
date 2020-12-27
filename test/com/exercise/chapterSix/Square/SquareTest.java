package com.exercise.chapterSix.Square;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square square;
    @BeforeEach
    void setUp() {
        square = new Square();
    }

    @AfterEach
    void tearDown() {
        square = null;
    }

    @Test
    void testToValidateInput(){
        square.setInput(5);
        assertEquals(5, square.getInput());
    }

    @Test
    void testToCheckIfInputCannotBeNegative(){
        square.setInput(-5);
        assertNotEquals(-5, square.getInput());
    }

    @Test
    void toPrintSquareOfAsterisks(){
        square.setInput(5);
        square.printSquare(square.getInput());
        assertEquals(5, square.getInput());
    }
}