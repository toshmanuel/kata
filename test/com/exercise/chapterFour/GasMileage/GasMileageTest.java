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

}
//    Drivers are concerned with the mileage their automobiles get. One driver has
//        kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
//        a Java application that will input the miles driven and gallons used (both as integers) for each trip.
//        The program should calculate and display the miles per gallon obtained for each trip and print the
//        combined miles per gallon obtained for all trips up to this point. All averaging calculations should
//        produce floating-point results. Use class Scanner and sentinel-controlled repetition to obtain the
//        data from the user.