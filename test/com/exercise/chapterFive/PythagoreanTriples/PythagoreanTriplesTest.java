package com.exercise.chapterFive.PythagoreanTriples;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PythagoreanTriplesTest {
    PythagoreanTriples pythagorean;

    @BeforeEach
    void setUp() {
        System.out.println("Test starting");
        pythagorean = new PythagoreanTriples();
    }

    @AfterEach
    void tearDown() {
        pythagorean = null;
        System.out.println("test ending");
    }

    @Test
    void testToSetTheSidesOfTheTriangle(){
        pythagorean.setSides(20);
        assertEquals(20, pythagorean.getSides());
    }
    @Test
    void testToDetermineHypotenuseSideOfTheTriangle(){
        pythagorean.setSides(500);
        pythagorean.calculatePythagoreanTriples();
        assertNotEquals(0, pythagorean.getPythagoreanTriples());
    }
}


//        (Pythagorean Triples) A right triangle can have sides whose lengths are all integers. The set
//        of three integer values for the lengths of the sides of a right triangle is called a Pythagorean triple.
//        The lengths of the three sides must satisfy the relationship that the sum of the squares of two of the
//        sides is equal to the square of the hypotenuse. Write an application that displays a table of the
//        Pythagorean triples for side1, side2 and the hypotenuse, all no larger than 500. Use a triple-nested
//        for loop that tries all possibilities. This method is an example of “brute-force” computing. You’ll
//        learn in more advanced computer science courses that for many interesting problems there’s no
//        known algorithmic approach other than using sheer brute force.