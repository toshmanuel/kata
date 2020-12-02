package com.exercise.chapterThree;

import com.exercise.chapterTwo.BodyMassIndex;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HealthProfileTest {

    HealthProfile profile;

    @BeforeEach
    void setUp() {
        System.out.println("Starting test >>>>>>>>>>");
        profile = new HealthProfile("","","", 0, 0, 0, 0, 0);
    }

    @AfterEach
    void tearDown() {
        profile = null;
        System.out.println("<<<<<<<<<<< test Ended");
    }
    @Test
    void testIfGenderCanBeSet(){
        profile.setGender("MALE");
        assertEquals("MALE", profile.getGender());
    }
}