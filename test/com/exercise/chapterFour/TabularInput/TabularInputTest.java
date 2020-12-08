package com.exercise.chapterFour.TabularInput;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TabularInputTest {
    TabularInput tabularInput;

    @BeforeEach
    void setUp() {
        System.out.println("Test Starting >>>>>>");
        tabularInput = new TabularInput();
    }

    @AfterEach
    void tearDown() {
        tabularInput = null;
        System.out.println("<<<<<< ending test");
    }

    @Test
    void testToCheckTheValueOfCounter(){
        tabularInput.setCounter();
        assertEquals(5, tabularInput.getCounter());

    }
    @Test
    void testToCheckTheValueOfCounterTimesTen(){
        tabularInput.setCounterTimesTen();
        assertEquals(50, tabularInput.getCounterTimesTen());
    }
    @Test
    void testToCheckTheValuesOfCounterTimesHundred(){
        tabularInput.setCounterTimesHundred();
        assertEquals(500, tabularInput.getCounterTimesHundred());
    }
    @Test
    void testToCheckTheValueOfCounterTimesThousand(){
        tabularInput.setCounterTimesThousand();
        assertEquals(5000, tabularInput.getCounterTimesThousand());
    }
    @Test
    void testToCheckTheValue(){
        tabularInput.setCounter();
        tabularInput.setCounterTimesTen();
        tabularInput.setCounterTimesHundred();
        tabularInput.setCounterTimesThousand();

        System.out.println(tabularInput.getCounterTimesThousand() + tabularInput.getCounterTimesHundred() +
                tabularInput.getCounterTimesTen() + tabularInput.getCounter());
    }

}

//    Tabular Output) Write a Java application that uses looping to print the following table of
//        values: