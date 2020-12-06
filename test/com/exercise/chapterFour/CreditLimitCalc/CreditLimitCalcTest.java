package com.exercise.chapterFour.CreditLimitCalc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditLimitCalcTest {
    CreditLimitCalc customer1;
    @BeforeEach
    void setUp() {
        customer1 = new CreditLimitCalc();
    }

    @AfterEach
    void tearDown() {
        customer1 = null;
    }
    @Test
    void testToCheckCustomersName(){
        customer1.setFirstName("John");
        customer1.setLastName("Smith");
        assertEquals("John Smith", customer1.getFullName());
    }
    @Test
    void testToSetAccountNumber(){
        customer1.setAccountNumber(324323322);
        assertEquals("324323322", customer1.toString());
    }
    @Test
    void testToSetMonthlyBalance(){
        customer1.setAccountBalance(1000000);

    }
}