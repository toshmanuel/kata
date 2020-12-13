package com.exercise.chapterFour.Crytography;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CryptographyTest {
    Cryptography cryptography;

    @BeforeEach
    void setUp() {
        System.out.println("Test starting");
        cryptography = new Cryptography();
    }

    @AfterEach
    void tearDown() {
        cryptography = null;
        System.out.println("Test ends here");
    }
    @Test
    void testToValidatePin(){
        cryptography.setPin();
        assertEquals(1234, cryptography.getPin());
    }
    @Test
    void testToCheckIfPinIsANonNegativeInteger(){
        cryptography.setPin(); //pin is resetToZero when -2345 is entered
        assertNotEquals(-2345, cryptography.getPin());
    }
    @Test
    void testToAssertThatPinIsNotLessThan_1000(){
        cryptography.setPin(); // pin is resetToZero when 123 is entered
        assertNotEquals(123, cryptography.getPin());
    }
    @Test
    void testToAssertThatPinIsNotGreaterThan_9999(){
        cryptography.setPin(); // pin is resetToZero when 12345 is entered
        assertNotEquals(12345, cryptography.getPin());
    }
    @Test
    void testToCheckIfPinHasBeenEncrypted(){
        cryptography.setPin(); // pin entered is 1435
        assertEquals("0281", cryptography.getEncryptedPin()); // encrypted pin is 0281
    }
    @Test
    void testToCheckIfPinHasBeenDecrypted(){
        cryptography.setPin(); // pin entered is 0281
        assertEquals("0281", cryptography.getEncryptedPin());
        assertEquals("1435", cryptography.getDecryptedPin()); // encrypted pin is 0281
    }
}