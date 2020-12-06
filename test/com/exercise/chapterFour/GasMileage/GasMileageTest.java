package com.exercise.chapterFour.GasMileage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasMileageTest {
    GasMileage gasMileage;

    @BeforeEach
    void setUp() {
        System.out.println("Test starting");
        gasMileage = new GasMileage();
    }

    @AfterEach
    void tearDown() {
        gasMileage = null;
        System.out.println("test ends here");
    }
    @Test
    void testToCollectDriverMileInput(){
        gasMileage.setDistances(10);
        assertEquals(10, gasMileage.getDistance());
    }
    @Test
    void testToIgnoreNegativeInput(){
        gasMileage.setDistances(-10);
        assertEquals(gasMileage.getDistance(), 0);
    }
    @Test
    void testToCollectTheValueOfGallonsUsed(){
        gasMileage.setGallons(2);
        assertEquals(2, gasMileage.getGallons());
    }
    @Test
    void testToCheckIfGallonsUsedIsNotLessThanZero(){
        gasMileage.setGallons(-1);
        assertEquals(0, gasMileage.getGallons());
    }
    @Test
    void testToCheckTheResultOfTheMilesPerGallonObtainedForEachTrip(){
        gasMileage.setGallons(2);
        gasMileage.setDistances(13);
        assertEquals(6.5, gasMileage.distancePerGallon());
        System.out.println(gasMileage.distancePerGallon());
    }
    @Test
    void testToCheckResultOfDistancePerGallonIfNegativeInputIsInserted(){
        gasMileage.setDistances(-20);
        gasMileage.setGallons(3);
        assertEquals(0, gasMileage.distancePerGallon());
        System.out.println(gasMileage.distancePerGallon());
    }
    @Test
    void testToStopUsersInput(){
        gasMileage.calculateAverage();
        assertEquals(-1,gasMileage.getDistance());
        System.out.println(gasMileage.getDistance());
    }
    @Test
    void testToCheckTheAverageOfDistancePerGallon(){
        gasMileage.calculateAverage();
        assertEquals(8.25, gasMileage.getAverage());
    }
    @Test
    void testToCheckTheValueOfAverageIfNoScoreWasEntered(){
        gasMileage.calculateAverage();
        assertEquals(0, gasMileage.getAverage());
    }
}