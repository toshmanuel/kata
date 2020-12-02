package com.exercise.chapterFive;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarChartTest {
    BarChart newInput;

    @BeforeEach
    void setUp() {
        newInput = new BarChart();
    }

    @AfterEach
    void tearDown() {
        newInput = null;
    }
    @Test
    void testThatUserEntersAValidInput(){
        newInput.collectUserInput(-2);
//        newInput.collectUserInput(12);
        assertEquals(0, newInput.getUserInput());

    }
    @Test
    void testToKnowTheNumberOfLoops(){
        newInput.collectUserInput(3);
        newInput.numberOfLoopFromUserInput(newInput.getUserInput());
        assertEquals(3, newInput.getNumberOfLoops());

//        newInput.collectUserInput(5);
//        newInput.numberOfLoopFromUserInput(1);
//        assertEquals(1, newInput.getNumberOfLoops());

    }
}
