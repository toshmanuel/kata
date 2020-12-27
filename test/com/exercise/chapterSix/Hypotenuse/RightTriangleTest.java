package com.exercise.chapterSix.Hypotenuse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RightTriangleTest {
    RightTriangle hypotenuse;

    @BeforeEach
    void setUp() {
        hypotenuse = new RightTriangle();
    }

    @AfterEach
    void tearDown() {
        hypotenuse = null;
    }

    @Test
    void testToCheckTheFirstSideOfTheTriangle(){
        hypotenuse.setSide1(12);
        assertEquals(12, hypotenuse.getSide1());
    }
    @Test
    void testToCheckIfSide1CannotHaveANegativeValue(){
        hypotenuse.setSide1(-5);
        assertNotEquals(-5, hypotenuse.getSide1());
    }
    @Test
    void testToCheckTheSecondSideOfTheTriangle(){
        hypotenuse.setSide2(31);
        assertEquals(31, hypotenuse.getSide2());
    }
    @Test
    void testToCheckIfSide_2_CannotHaveANegativeValue(){
        hypotenuse.setSide2(-115);
        assertNotEquals(-115, hypotenuse.getSide2());
    }
    @Test
    void testToCheckTheCalculatedValueOfHypotenuse(){
        hypotenuse.setSide1(3);
        hypotenuse.setSide2(4);
        double hypotenuseValue = hypotenuse.hypotenuse(hypotenuse.getSide1(), hypotenuse.getSide2());
        assertEquals(5, hypotenuseValue);
    }
}