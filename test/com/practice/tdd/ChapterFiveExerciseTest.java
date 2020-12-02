package com.practice.tdd;

import com.exercise.chapterFive.ChapterFiveExercise;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChapterFiveExerciseTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testMethodShouldBeAbleToGenerateFactorial(){
        ChapterFiveExercise factorial = new ChapterFiveExercise();
        factorial.generateFactorial(2);
//        var result = factorial.getResult();
//        assertEquals(result, 2);
        assertEquals(2, factorial.getResult());

    }
}