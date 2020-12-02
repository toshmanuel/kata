package com.exercise.chapterThree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedAccountClassTest {
    ModifiedAccountClass newAccount;
    @BeforeEach
    void setUp() {
        newAccount = new ModifiedAccountClass();

        System.out.println("Starting With:");
    }

    @AfterEach
    void tearDown() {
        newAccount = null;
        System.out.println("Ending With this test");
    }
    @Test
    void testIfAccountBalanceCanBeSet(){
        newAccount.setAccountBalance(100);
        newAccount.setAccountBalance(100);
        int balance;

        System.out.println("this is account 1 test");
    }

    @Test
    void testIfAccountCannotSetNegativeValues(){
        newAccount.depositAmount(50);
        newAccount.depositAmount(50);
        assertEquals(100, newAccount.getAccountBalance());

        newAccount.depositAmount(-300);
        newAccount.depositAmount(100);
        assertEquals(200, newAccount.getAccountBalance());

        System.out.println("this is account 2 test");
    }

    @Test
    void testIfAccountCanDeposit(){
        newAccount.depositAmount(50);
        newAccount.depositAmount(50);
//        int balance = newAccount.getAccountBalance(); this can also be used in the place of ACTUAL
        assertEquals(100, newAccount.getAccountBalance());

        newAccount.depositAmount(300);
        newAccount.depositAmount(100);
        assertEquals(500, newAccount.getAccountBalance());

        System.out.println("this is account 3 test");

    }

    @Test
    void testIfNegativeAmountCannotBeDeposited(){
        newAccount.depositAmount(50);
        newAccount.depositAmount(-20);
        assertEquals(50, newAccount.getAccountBalance());

        System.out.println("this is account 4 test");
    }

    @Test
    void testIfAccountCanPerformWithdrawal(){
        newAccount.depositAmount(100);
        newAccount.depositAmount(200);
        newAccount.withdrawAmount(150);
        assertEquals(150, newAccount.getAccountBalance());

        newAccount.withdrawAmount(100);
        assertEquals(50, newAccount.getAccountBalance());


        System.out.println("this is account 5 test");
    }
    @Test
    void testIfAccountCannotWithdrawMoreThanItsBalance(){
        newAccount.depositAmount(100);
        newAccount.depositAmount(200);
        newAccount.withdrawAmount(150);
        assertEquals(150, newAccount.getAccountBalance());

        newAccount.withdrawAmount(100);
        assertEquals(50, newAccount.getAccountBalance());

        newAccount.withdrawAmount(100);
        assertEquals(50, newAccount.getAccountBalance());

        System.out.println("this is account 6 test");
    }


}