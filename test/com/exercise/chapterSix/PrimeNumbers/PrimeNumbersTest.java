package com.exercise.chapterSix.PrimeNumbers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersTest {
    PrimeNumbers prime;

    @BeforeEach
    void setUp() {
        prime = new PrimeNumbers();
    }

    @AfterEach
    void tearDown() {
        prime = null;
    }

    @Test
    void testToValidateUserInput(){
        prime.setInput(5);
        assertEquals(5, prime.getInput());
    }

    @Test
    void testToAssertThatUserInputCannotBeNegative(){
        prime.setInput(-5);
        assertNotEquals(-5, prime.getInput());
    }

    @Test
    void testToCheckIfInputIsAPrimeNumber(){
        prime.setInput(1);
        prime.checkPrime(prime.getInput());
        assertEquals(1, prime.getInput());
    }

    @Test
    void testToCheckIfInputIsNotAPrimeNumber(){
        prime.setInput(15);
        prime.checkPrime(prime.getInput());
        assertEquals(15, prime.getInput());
    }

    @Test
    void testToCheckMultipleValuesIfTheyArePrime(){
        prime.setInput(15);
        prime.primeNumbersFromARange(prime.getInput());
        assertEquals(15, prime.getInput());
    }
}