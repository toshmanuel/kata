package com.exercise.chapterSix.GuessingNumber;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class GuessNumberTest {
    GuessNumber guess;

    @BeforeEach
    void setUp() {
        guess = new GuessNumber();
    }

    @AfterEach
    void tearDown() {
        guess = null;
    }

    @Test
    void testToCheckGuessedDigit(){
        guess.setRandomNumber();
        assertNotEquals(0, guess.getGuessedNumber());
    }

    @Test
    void testToGuessNumber(){
        guess.setRandomNumber();
        guess.guessTheNumber();
        assertNotEquals(0, guess.getGuessedNumber());
    }

}

//        (Guess the Number) Write an application that plays “guess the number” as follows: Your
//        program chooses the number to be guessed by selecting a random integer in the range 1 to 1000.
//        The application displays the prompt Guess a number between 1 and 1000. The player inputs a first
//        guess. If the player's guess is incorrect, your program should display Too high. Try again. or Too
//        low. Try again. to help the player “zero in” on the correct answer. The program should prompt the
//        user for the next guess. When the user enters the correct answer, display Congratulations. You
//        guessed the number!, and allow the user to choose whether to play again.
//        [Note: The guessing technique employed in this problem