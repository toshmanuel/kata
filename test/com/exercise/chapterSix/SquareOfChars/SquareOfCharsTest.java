package com.exercise.chapterSix.SquareOfChars;

import com.exercise.chapterSix.Square.Square;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareOfCharsTest {
    SquareOfChars chars;
    @BeforeEach
    void setUp() {
        chars = new SquareOfChars();
    }

    @AfterEach
    void tearDown() {
        chars = null;
    }

    @Test
    void testToPrintChars(){
//        given
        Square square = new Square();
        square.setInput(5);
        char character = '2';
        chars.printChars(square.getInput(), character);
        assertEquals(5, square.getInput());
    }
}