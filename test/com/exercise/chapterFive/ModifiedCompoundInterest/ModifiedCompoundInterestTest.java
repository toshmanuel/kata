package com.exercise.chapterFive.ModifiedCompoundInterest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedCompoundInterestTest {
    ModifiedCompoundInterest compoundInterest;
    @BeforeEach
    void setUp() {
        System.out.println("Test Starting");
        compoundInterest = new ModifiedCompoundInterest();
    }

    @AfterEach
    void tearDown() {
        compoundInterest = null;
        System.out.println("Test ending");
    }
    @Test
    void testToCalculateCompoundInterest(){
        compoundInterest.calculateCompoundInterest();
        assertNotEquals(0, compoundInterest.getCompoundInterest());
    }
}

//        (Modified Compound-Interest Program) Modify the
//        compound-interest application of
//        Fig. 5.6 to repeat its steps for interest rates of
//        5%, 6%, 7%, 8%, 9% and 10%. Use a for loop to
//        vary the interest rate.