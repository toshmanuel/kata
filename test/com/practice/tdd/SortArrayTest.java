package com.practice.tdd;

import com.exercise.chapterFour.TwoLargestNumbers.TwoLargestNumbers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayTest {
    SortArray sortArray;
    @BeforeEach
    void setUp() {
        System.out.println("Starting New Test");
         sortArray = new SortArray();
    }
    @AfterEach
    void tearDown() {
        sortArray = null;
        System.out.println("Ending Test");
    }
    @Test
    void testArraySorting(){
//        sortArray.setSortArray();
    }

}