package com.exercise.chapterFour.ValidatingUserInput;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserInputTest {
    UserInput userInput;
    @BeforeEach
    void setUp() {
        userInput = new UserInput();
    }

    @AfterEach
    void tearDown() {
        userInput = null;
    }
    @Test
    void testIfTheUserEntersAValidInput(){
        userInput.collectInput();
        assertEquals(1, userInput.getUserInput());
    }
    @Test
    void testIfTheUserInputIsNotEqualToOneOrTwo(){
//        userInput.collectInput();
        userInput.validateUserInput();
        assertTrue(13 > userInput.getUserInput(), "userInput to stop the loop is 1 or 2");
    }
    @Test
    void testIfUserInputIsEqualToOneOrTwo(){
        userInput.validateUserInput();;
        assertEquals(2, userInput.getUserInput());
    }


}