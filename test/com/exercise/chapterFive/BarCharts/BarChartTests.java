package com.exercise.chapterFive.BarCharts;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarChartTest {
    BarCharts barChart;

    @BeforeEach
    void setUp() {
        barChart = new BarCharts();
    }

    @AfterEach
    void tearDown() {
        barChart = null;
    }
    @Test
    void testToConfirmUserInputs(){
        barChart.setInput();
        assertEquals(5, barChart.getInput());
    }
}

//        (Bar Chart Printing Program) One interesting application of computers is to display
//        graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
//        number that’s read, your program should display the same number of adjacent asterisks.
//        For example, if your program reads the number 7, it should display *******. Display the bars of asterisks after
//        you read all five numbers.