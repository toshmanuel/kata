package com.exercise.chapterFour.WorldPopulation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorldPopulationTest {
    WorldPopulation worldPopulation;

    @BeforeEach
    void setUp() {
        System.out.println("Test Starting");
        worldPopulation = new WorldPopulation();
    }

    @AfterEach
    void tearDown() {
        worldPopulation = null;
        System.out.println("End test");
    }
    @Test
    void testToConfirmTheNumberOfYears(){
        worldPopulation.setYears(75);
        assertEquals(75, worldPopulation.getYears());
    }
    @Test
    void testToAssertThatYearsIsANonNegativeValue(){
        worldPopulation.setYears(-12);
        assertNotEquals(-12, worldPopulation.getYears());
    }
    @Test
    void testToDeterminePopulation(){
        worldPopulation.setYears(75);
        worldPopulation.calculatePopulation();
        assertEquals(17073338134.486376, worldPopulation.getPopulation());
    }
}