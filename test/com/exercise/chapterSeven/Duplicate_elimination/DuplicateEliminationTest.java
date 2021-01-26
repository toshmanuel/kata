package com.exercise.chapterSeven.Duplicate_elimination;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateEliminationTest {
    DuplicateElimination duplicate;

    @BeforeEach
    void setUp() {
        duplicate = new DuplicateElimination();
    }

    @AfterEach
    void tearDown() {
        duplicate = null;
    }

    @Test
    void testToConfirmUserInput() {
        duplicate.setInput(56);
        assertEquals(56, duplicate.getInput());
    }

    @Test
    void toConfirmUserInputCannotBeOutOfRange(){
        duplicate.setInput(-12);
        assertNotEquals(-12, duplicate.getInput());
    }

    @Test
    void testToPassInputIntoAnArray(){
        int firstInput = 25;
        duplicate.setInput(firstInput);
        int secondInput = 56;
        duplicate.setInput(secondInput);
        int thirdInput = 47;
        duplicate.setInput(thirdInput);
        int fourthInput = 25;

        duplicate.setInput(fourthInput);
        int[] inputs = {firstInput, secondInput, thirdInput, fourthInput};

        duplicate.checkForDuplicate(inputs);

        assertEquals(4, inputs.length);
    }
}

//(Duplicate Elimination) Use a one-dimensional array to solve the following problem:
//        Write an application that inputs five numbers, each between 10 and 100, inclusive. As each number
//        is read, display it only if it’s not a duplicate of a number already read. Provide for the “worst case,”
//        in which all five numbers are different. Use the smallest possible array to solve this problem. Display
//        the complete set of unique values input after the user enters each new value.