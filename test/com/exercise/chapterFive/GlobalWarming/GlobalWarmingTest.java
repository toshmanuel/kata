package com.exercise.chapterFive.GlobalWarming;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GlobalWarmingTest {
    GlobalWarming globalWarming;

    @BeforeEach
    void setUp() {
        globalWarming = new GlobalWarming();
    }

    @AfterEach
    void tearDown() {
        globalWarming = null;
    }

    @Test
    void testToCheckIfNumberOfQuestionsHasBeenSet(){
        globalWarming.setQuestionNumber(5);
        assertEquals(5, globalWarming.getQuestionNumber());
    }

    @Test
    void testToSetQuestions(){
        globalWarming.setQuestionNumber(3);
        globalWarming.setQuestions();
        assertEquals("Who measures the global warming rate?", globalWarming.getQuestions());
    }

    @Test
    void testToSetOptions(){
        globalWarming.setQuestionNumber(2);
        globalWarming.setOptions();
        assertEquals("1. About 10%\n" +
                "2. About 20%\n" +
                "3. About 30%\n" +
                "4. About 40%", globalWarming.getOptions());
    }

    @Test
    void testToCheckCorrectOptions(){
        globalWarming.setQuestionNumber(1);
        globalWarming.setCorrectOption();
        assertEquals(5, globalWarming.getScore());
    }

    @Test
    void testToCheckScoreComment(){
        globalWarming.setQuestionNumber(1);
        globalWarming.setCorrectOption();
        assertEquals("Very Good", globalWarming.getComment());
    }
}