package com.exercise.chapterThree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import java.time.Period;

import static org.junit.jupiter.api.Assertions.*;

class HeartRateTest {
    HeartRate heartRate;
    Date date;

    @BeforeEach
    void setUp() {
        System.out.println("Starting test>>>>>>>>>");
        heartRate = new HeartRate("","",0,0,0);
        date = new Date(0, 0, 0);
    }

    @AfterEach
    void tearDown() {
        heartRate = null;
        date = null;
        System.out.println("<<<<<<<<Test ends");
    }
    @Test
    void testToSetFirstName(){
        heartRate.setFirstName("Billy");
        System.out.println(heartRate.getFirstName());
        assertEquals("Billy", heartRate.getFirstName());
    }
    @Test
    void testToSetLastName(){
        heartRate.setLastName("Audy");
        System.out.println(heartRate.getLastName());
        assertEquals("Audy", heartRate.getLastName());
    }
    @Test
    void testToSetDayOfBirth(){
        date.setDay(12);
        assertEquals(12, date.getDay());
    }
    @Test
    void testToSetMonthOfBirth(){
        date.setMonth(11);
        assertEquals(11, date.getMonth());
    }
    @Test
    void testToSetYearOfBirth(){
        date.setYear(1990);
        assertEquals(1990, date.getYear());
    }
    @Test
    void testToCalculateAge(){
        heartRate.calculateAge(12, 12, 1990);
        assertEquals(29, heartRate.getAge());

        heartRate.calculateAge(31, 12, 1996);
        assertEquals(23, heartRate.getAge());
    }
    @Test
    void testToCheckTheCapabilitiesOfMaximumHeartRate(){
        heartRate.calculateAge(12, 11, 1990);
        assertEquals(190, heartRate.maxHeartRate());

        heartRate.calculateAge(31, 12, 1996);
        assertEquals(197, heartRate.maxHeartRate());
    }
    @Test
    void toTestToCheckTheCapabilitiesOfTargetHeartRate(){
        heartRate.calculateAge(12, 11, 1990);
        heartRate.setExerciseRate(50);
        assertEquals(95, heartRate.targetHeartRate());
    }
    @Test
    void toTestIfExerciseRateCannotBeNegative(){
        heartRate.calculateAge(12, 11, 1990);
        heartRate.setExerciseRate(50);
        assertEquals(95, heartRate.targetHeartRate());

        heartRate.calculateAge(2, 12, 1995);
        heartRate.setExerciseRate(-50);
        assertEquals(95, heartRate.targetHeartRate());
    }
}