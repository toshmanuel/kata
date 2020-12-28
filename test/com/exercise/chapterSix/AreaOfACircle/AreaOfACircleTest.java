package com.exercise.chapterSix.AreaOfACircle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaOfACircleTest {
    AreaOfACircle area;

    @BeforeEach
    void setUp() {
        area = new AreaOfACircle();
    }

    @AfterEach
    void tearDown() {
        area = null;
    }

    @Test
    void testToValidateRadiusOfTheCircle(){
        area.setRadius(4);
        assertEquals(4, area.getRadius());
    }

    @Test
    void testToConfirmThatRadiusCannotBeANegativeValue(){
        area.setRadius(-12);
        assertNotEquals(-12, area.getRadius());
    }

    @Test
    void testToCalculateTheRadiusOfTheCircle(){
        area.setRadius(4);
        double areaOfCircle = area.calculateArea(area.getRadius());
        assertEquals(Math.PI * 16, areaOfCircle);
    }
}