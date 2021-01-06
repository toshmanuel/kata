package com.exercise.chapterSix.GuessingNumber;

public class GuessNumberMainTest {
    public static void main(String[] args) {
        GuessNumber guess = new GuessNumber();
        guess.setRandomNumber();
        guess.guessTheNumber();
    }
}
