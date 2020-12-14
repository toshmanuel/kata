package com.exercise.chapterFive.Factorial;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    Factorial factorial;

    @BeforeEach
    void setUp() {
        System.out.println("test Starting");
        factorial = new Factorial();
    }

    @AfterEach
    void tearDown() {
        factorial = null;
        System.out.println("test End");
    }
    @Test
    void testCheckTheValueOf_nFactorial(){
        factorial.calculateFactorial(); // find 20 factorial;
        assertNotEquals(0, factorial.getFactorial());
    }
}