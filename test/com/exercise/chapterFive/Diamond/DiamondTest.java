package com.exercise.chapterFive.Diamond;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiamondTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testToCheckTopAsteriskPrinter(){
//        given
        Diamond diamond = new Diamond();
//        when
        diamond.topAsteriskPrinter();
        assertEquals(8, diamond.getAsteriskPrinter());
    }

    @Test
    void testToCheckBottomAsteriskPrinter(){
//        given
        Diamond diamond = new Diamond();
//        when
        diamond.reverseAsteriskPrinter();
        assertEquals(7, diamond.getAsteriskPrinter());
    }

    @Test
    void testToCheckDiamondPrinter(){
//        given
        Diamond diamond = new Diamond();
//        when
        diamond.printDiamond();
        assertEquals(7, diamond.getAsteriskPrinter());
    }
}