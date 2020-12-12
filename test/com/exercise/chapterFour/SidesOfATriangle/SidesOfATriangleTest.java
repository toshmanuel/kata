package com.exercise.chapterFour.SidesOfATriangle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SidesOfATriangleTest {
    SidesOfATriangle sidesOfATriangle;
    int counter = 1;

    @BeforeEach
    void setUp() {
        System.out.println("Test Starting " + counter);
        sidesOfATriangle = new SidesOfATriangle();
    }

    @AfterEach
    void tearDown() {
        sidesOfATriangle = null;
        System.out.println("Test ends here");
        counter++;
    }
    @Test
    void testToCheckTheFirstSideOfTheTriangle(){
        sidesOfATriangle.setFirstSide();
        assertEquals(12, sidesOfATriangle.getFirstSide());
    }
    @Test
    void testToAssertThatFirstInputIsANonZeroNumber(){
        sidesOfATriangle.setFirstSide();
        assertNotEquals(-20, sidesOfATriangle.getFirstSide());
    }
    @Test
    void testToCheckTheSecondSideOfTheTriangle(){
        sidesOfATriangle.setSecondSide();
        assertEquals(20, sidesOfATriangle.getSecondSide());
    }
    @Test
    void testToAssertThatSecondInputIsANonZeroNumber(){
        sidesOfATriangle.setSecondSide();
        assertNotEquals(-2, sidesOfATriangle.getSecondSide());
    }
    @Test
    void testToCheckTheThirdSideOfTheTriangle(){
        sidesOfATriangle.setThirdSide();
        assertEquals(2, sidesOfATriangle.getThirdSide());
    }
    @Test
    void testToAssertThatThirdInputIsANonZeroNumber(){
        sidesOfATriangle.setThirdSide();
        assertNotEquals(-30, sidesOfATriangle.getThirdSide());
    }
    @Test
    void testToAssertThatAllSidesAreValid(){
        sidesOfATriangle.setFirstSide();
        sidesOfATriangle.setSecondSide();
        sidesOfATriangle.setThirdSide();
        sidesOfATriangle.checkTriangle();
        assertEquals(0, sidesOfATriangle.getFirstSide());
        assertEquals(0, sidesOfATriangle.getSecondSide());
        assertEquals(0, sidesOfATriangle.getThirdSide());
    }
}