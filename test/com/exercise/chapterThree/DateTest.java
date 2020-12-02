package com.exercise.chapterThree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {
    Date date;
    @BeforeEach
    void setUp() {
        System.out.println("Test Starting here>>>>>>>>>>");
        date = new Date(0,0,0);
    }

    @AfterEach
    void tearDown() {
        date = null;
        System.out.println("<<<<<<<<<<<<<<<Ending here");
    }
    @Test
    void testIfDayCanBeSet(){
        date.setDay(1);
        assertEquals(1, date.getDay());
    }
    @Test
    void testIfDayValueCannotBeNegative(){
        date.setDay(10);
        date.setDay(-2);
        assertEquals(10, date.getDay());
    }
    @Test
    void testIfMonthCanBeSet(){
        date.setMonth(12);
        assertEquals(12, date.getMonth());
    }
    @Test
    void testIfMonthCannotBeSetToANegativeInput(){
        date.setMonth(11);
        date.setMonth(-10);
        assertEquals(11, date.getMonth());
    }
    @Test
    void testIfMonthCannotBeSetBeyondTwelveMonth(){
        date.setMonth(12);
        date.setMonth(13);
        assertEquals(12, date.getMonth());
    }
    @Test
    void testIfMonthCannotBeMoreThanThirtyDays(){
        date.setDay(12);
        date.setDay(32);
        assertEquals(12, date.getDay());
    }
    @Test
    void testIfYearCanBeSet(){
        date.setYear(2020);
        assertEquals(2020, date.getYear());
    }
    @Test
    void testIfYearInputCannotBeSetToNegative(){
        date.setYear(2020);
        date.setYear(-2020);
        assertEquals(2020, date.getYear());
    }
    @Test
    void testIfYearInputCannotBeSetBeyondTheSetLimit(){
        date.setYear(2021);
        date.setYear(3030);
        assertEquals(2021, date.getYear());

        date.setYear(2022);
        date.setYear(500);
        assertEquals(2022, date.getYear());
    }
    @Test
    void testIfDateCanBePrinted(){
        date.setYear(2020);
        date.setMonth(12);
        date.setDay(1);
        assertEquals("12/1/2020", date.toString());
    }
    @Test
    void testToCheckIfMonthHasThirtyDays(){
        date.setYear(2020);
        date.setMonth(4);
        date.setDay(31);
        assertEquals(0, date.getDay());
    }
    @Test
    void testToCheckForTheNumberOfDaysInFebruaryInALeapYear(){
        date.setYear(2020);
        date.setMonth(2);
        date.setDay(29);
        assertEquals(29, date.getDay());

        date.setYear(2020);
        date.setMonth(2);
        date.setDay(30);
        assertEquals(0, date.getDay());
    }
    @Test
    void testToCheckForTheNumberOfDaysInFebruaryInNotALeapYear(){
        date.setYear(2021);
        date.setMonth(2);
        date.setDay(28);
        assertEquals(28, date.getDay());

        date.setYear(2021);
        date.setMonth(2);
        date.setDay(29);
        assertEquals(28, date.getDay());
    }
}