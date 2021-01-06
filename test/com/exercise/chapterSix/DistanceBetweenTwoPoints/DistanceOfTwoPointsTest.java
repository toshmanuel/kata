package com.exercise.chapterSix.DistanceBetweenTwoPoints;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistanceOfTwoPointsTest {
    DistanceOfTwoPoints points;

    @BeforeEach
    void setUp() {
        points = new DistanceOfTwoPoints();
    }

    @AfterEach
    void tearDown() {
        points = null;
    }

    @Test
    void testToCalculateDifferenceInX_axis(){
        points.calculatePointX(1,5);
        assertEquals(16, points.getPointX());
    }

    @Test
    void testToCalculateDifferenceInY_axis(){
        points.calculatePointY(2,5);
        assertEquals(9, points.getPointY());
    }

    @Test
    void testToCalculateDistanceBetweenTwoPoints(){
        points.calculatePointX(1,5);
        points.calculatePointY(2,5);
        points.calculateDistance(points.getPointX(),points.getPointY());
        assertEquals(5, points.getDistance());
    }
}