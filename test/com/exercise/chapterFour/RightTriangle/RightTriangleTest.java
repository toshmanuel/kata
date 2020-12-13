package com.exercise.chapterFour.RightTriangle;
import com.exercise.chapterFour.SidesOfATriangle.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RightTriangleTest {
    RightTriangle rightTriangle;
    SidesOfATriangle sidesOfATriangle;

    @BeforeEach
    void setUp() {
        System.out.println("starting test");
        rightTriangle = new RightTriangle();
        sidesOfATriangle = new SidesOfATriangle();
    }

    @AfterEach
    void tearDown() {
        rightTriangle = null;
        sidesOfATriangle = null;
        System.out.println("ending test");
    }
    @Test
    void testToDetermineRightTriangle(){
        sidesOfATriangle.setFirstSide();
        sidesOfATriangle.setSecondSide();
        sidesOfATriangle.setThirdSide();
        rightTriangle.calculateTheHypotenuse();
        assertEquals(5, sidesOfATriangle.getFirstSide());
        assertEquals(3, sidesOfATriangle.getSecondSide());
        assertEquals(4, sidesOfATriangle.getThirdSide());
    }
}

//(Sides of a Right Triangle) Write an application that
//        reads three nonzero integers and determines and prints
//        whether they could represent the sides of a right triangle.