package com.exercise.chapterFive.ModifiedCompoundInterest2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompoundInterestTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testToConfirmTheCompoundingAmount(){
//        given
        CompoundInterest interest;
        //when
        interest = new CompoundInterest();
        interest.calculateAmount();
        //assert
        assertNotEquals(0, interest.getAmount());
    }
}


//(Modified Compound-Interest Program) Modify the application in Fig. 5.6
//        to use only integers to calculate the compound interest. [Hint: Treat all monetary amounts as integral numbers
//        of pennies. Then break the result into its dollars and cents
//        portions by using the division and remainder operations, respectively. Insert a period between
//        the dollars and the cents portions.]