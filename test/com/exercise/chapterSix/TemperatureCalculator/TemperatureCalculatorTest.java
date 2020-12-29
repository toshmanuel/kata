package com.exercise.chapterSix.TemperatureCalculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureCalculatorTest {
    TemperatureCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new TemperatureCalculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void testToValidateTemperature(){
        calculator.setTemperature(40);
        assertEquals(40, calculator.getTemperature());
    }

    @Test
    void testToCheckTheCelsiusEquivalentOfTemperature(){
        calculator.setTemperature(40);
        double temp = calculator.celsius();
        assertEquals(40.0/9, temp);
    }

    @Test
    void testToCheckTheFahrenheitEquivalentOfTemperature(){
        calculator.setTemperature(40);
        double temp = calculator.fahrenheit();
        assertEquals(129.6, temp);
    }

    @Test
    void testToCovertTheTemperatureEnteredToEitherACelsiusOrFahrenheitEquivalent(){
        calculator.setTemperature(40);
        double temp = calculator.getEquivalent((byte) 1);
        assertEquals(40.0/9, temp);

        calculator.setTemperature(40);
        double temp2 = calculator.getEquivalent((byte) 2);
        assertEquals(129.6, temp2);

        calculator.setTemperature(40);
        double temp3 = calculator.getEquivalent((byte) 3);
        assertNotEquals(129.6, temp3);

    }
}