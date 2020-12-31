package com.exercise.chapterSix.QualityPoint;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QualityPointsTest {
    QualityPoints points;

    @BeforeEach
    void setUp() {
        points = new QualityPoints();
    }

    @AfterEach
    void tearDown() {
        points = null;
    }

    @Test
    void testToValidateAverage(){
        points.setAverage(85);
        assertEquals(85, points.getAverage());
    }

    @Test
    void testToCheckIfAverageIsNonNegative(){
        points.setAverage(-85);
        assertEquals(0, points.getAverage());
    }

    @Test
    void testToCheckGradeQuality(){
        points.setAverage(85);
        int point = points.checkQuality(points.getAverage());
        assertEquals(3, point);
    }
}