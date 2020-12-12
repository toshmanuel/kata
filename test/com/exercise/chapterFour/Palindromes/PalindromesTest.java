package com.exercise.chapterFour.Palindromes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromesTest {
    Palindromes palindromes;
    @BeforeEach
    void setUp() {
        System.out.println("Test is starting");
        palindromes = new Palindromes();
    }

    @AfterEach
    void tearDown() {
        palindromes = null;
        System.out.println("Test Ended");
    }

    @Test
    void testToAssertThatUserInputIsANon_negativeValue(){
        palindromes.setInput();
        assertNotEquals(-11111, palindromes.getInput());
    }
    @Test
    void testToAssertThatUserInputCannotBeLessThan_10000(){
        palindromes.setInput();
        assertNotEquals(9999, palindromes.getInput());
    }
    @Test
    void testToAssertThatUserInputIsNotMoreThan_99999(){
        palindromes.setInput();
        assertNotEquals(100000, palindromes.getInput());
    }
    @Test
    void testToAssertThatUserInputCanBeReceived(){
        palindromes.setInput();
        assertEquals(12345, palindromes.getInput());
    }

    @Test
    void testToAssertThatTheNumberIsNotAPalindromicInput(){
//        palindromes.setInput();
        palindromes.setPalindromicInput();
        assertNotEquals(12345, palindromes.getInput());
    }
}
//
//(Palindromes) A palindrome is a sequence of characters that
// reads the same backward as forward
// . For example,
// each of the following five-digit integers is a palindrome: 12321, 55555, 45554
//        and 11611. Write an application that reads in a five-digit integer
//        and determines whether it’s a palindrome. If the number is not five
//        digits long, display an error message and allow the user to enter
//        a new value.