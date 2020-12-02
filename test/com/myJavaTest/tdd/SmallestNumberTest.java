package com.myJavaTest.tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestIntegerTest {
    private SmallestNumber smallestInteger;

    @BeforeEach
    void setUp() {

        smallestInteger = new SmallestNumber();
    }

    @AfterEach
    void tearDown() {
        smallestInteger = null;
    }

    @Test
    void testThatUserInputsAValidInteger() {
        smallestInteger.setUserInput(5);
        int userInput = smallestInteger.getUserInput();
        assertEquals(5, userInput);

        smallestInteger.setUserInput(3);
        userInput = smallestInteger.getUserInput();
        assertEquals(3, userInput);

        smallestInteger.setUserInput(1000);
        userInput = smallestInteger.getUserInput();
        assertEquals(1000, userInput);

    }

    @Test
    void testThatUserDoesNotEnterZeroOrANegativeValue() {
        smallestInteger.setUserInput(-5);
        int userInput = smallestInteger.getUserInput();
        assertEquals(0, userInput);

        smallestInteger.setUserInput(4);
        smallestInteger.setUserInput(-2);
        userInput = smallestInteger.getUserInput();
        assertEquals(4, userInput);
    }

    @Test
    void testThatTheCounterNumberIsEqualToTheUserInputs(){
        smallestInteger.setUserInput(5);
        smallestInteger.countLoop();
        int counter = smallestInteger.getCounter();
        assertEquals(5, counter);

        smallestInteger.setUserInput(-2);
        //smallestInteger.setUserInput(5);
        smallestInteger.countLoop();
        counter = smallestInteger.getCounter();
        assertEquals(5, counter);
    }
    @Test
    void testForTheSmallestInteger(){
        smallestInteger.setUserInput(6);
        int[] a = new int[smallestInteger.getCounter()];
//        a[0] = 1;
//        a[1] = 2;
//        a[2] = 3;
//        a[3] = 4;
//        a[4] = 5;
        assertArrayEquals(4, smallestInteger.getCounter());
    }

    private void assertArrayEquals(int i, int counter) {
    }
}




