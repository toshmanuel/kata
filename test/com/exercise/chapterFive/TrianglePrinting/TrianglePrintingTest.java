package com.exercise.chapterFive.TrianglePrinting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrianglePrintingTest {
    TrianglePrinting printing;

    @BeforeEach
    void setUp() {
        printing = new TrianglePrinting();
    }

    @AfterEach
    void tearDown() {
        printing = null;
    }
    @Test
    void testToCheckAsteriskPattern_A(){
        printing.printAsterisk_A();
        assertEquals(10, printing.getAsterisksPrinter());
    }
    @Test
    void testToCheckAsteriskPattern_B(){
        printing.printAsterisk_B();
        assertEquals(9, printing.getAsterisksPrinter());
    }
    @Test
    void testToCheckAsteriskPattern_C(){
        printing.printAsterisk_C();
        assertEquals(9, printing.getAsterisksPrinter());
    }
    @Test
    void testToCheckAsteriskPattern_D(){
        printing.printAsterisk_D();
        assertEquals(10, printing.getAsterisksPrinter());
    }
}