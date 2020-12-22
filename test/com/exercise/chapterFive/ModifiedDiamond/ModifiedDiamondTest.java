package com.exercise.chapterFive.ModifiedDiamond;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedDiamondTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testToValidateUserInput(){
//        given
        ModifiedDiamond diamond = new ModifiedDiamond();
//        when
        diamond.setCounter(19);
//        Assert
        assertEquals(19, diamond.getCounter());
    }

    @Test
    void testToValidateTopStarPrinter() {
//        given
        ModifiedDiamond diamond = new ModifiedDiamond();
//        when
        diamond.setCounter(9);
        diamond.topDiamondPrinter();
//        Assert
        assertEquals(9, diamond.getCounter());
    }

    @Test
    void testToValidateBottomStarPrinter() {
//        given
        ModifiedDiamond diamond = new ModifiedDiamond();
//        when
        diamond.setCounter(9);
        diamond.bottomPrinter();
//        Assert
        assertEquals(9, diamond.getCounter());
    }

    @Test
    void testToValidateDiamondPrinting() {
//        given
        ModifiedDiamond diamond = new ModifiedDiamond();
//        when
        diamond.setCounter(9);
        diamond.printDiamond();
//        Assert
        assertEquals(9, diamond.getCounter());
    }
}