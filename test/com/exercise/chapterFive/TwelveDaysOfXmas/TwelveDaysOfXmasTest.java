package com.exercise.chapterFive.TwelveDaysOfXmas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwelveDaysOfXmasTest {
    TwelveDaysOfXmas xmas;

    @BeforeEach
    void setUp() {
        xmas = new TwelveDaysOfXmas();
    }

    @AfterEach
    void tearDown() {
        xmas = null;
    }
    @Test
    void testToConfirmTheDayOfXmas(){
        xmas.setDay(10);
        assertEquals(10, xmas.getDay());
    }
    @Test
    void testToAssertThatDayCannotBeANegativeValue(){
        xmas.setDay(-10);
        assertNotEquals(-10, xmas.getDay());
    }
    @Test
    void testToConfirmVersesInRespectToDay(){
        xmas.setDay(5);
        xmas.setVerseDay();
        assertEquals("Fifth", xmas.getVerseDay());
    }
    @Test
    void testToConfirmVersesFirstLine(){
        xmas.setDay(5);
        xmas.setVerseDay();
        assertEquals("On the Fifth day of Christmas \nmy true love said to me:", xmas.printVerseLine());
    }
    @Test
    void testToPrintVersesAccordingDay(){
        xmas.setDay(5);
        xmas.setVerseDay();
        xmas.printVerseLine();
        xmas.printVerse();
        assertEquals(5, xmas.getDay());
    }
    @Test
    void testToPrintWholeVersesAccordingDay(){
        xmas.setDay(5);
        xmas.setVerseDay();
        xmas.printWholeVerses();
        assertEquals(0, xmas.getDay());
    }
}