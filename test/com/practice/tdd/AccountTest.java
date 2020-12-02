package com.practice.tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
private Account newAccount;
    @BeforeEach
    void setUp() {
        newAccount = new Account();
        System.out.println("startWithThis Running");
    }

    @AfterEach
    void tearDown() {
        newAccount = null;
        System.out.println("endWithThis Running");
    }

    @Test
    void testMoneyCanBeDeposited(){

        newAccount.depositMoney(50);
        int balance = newAccount.getAccountBalance();
        assertEquals(50, balance);

        newAccount.depositMoney(25);
        balance = newAccount.getAccountBalance();
        assertEquals(75, balance);

        newAccount.depositMoney(30);
        balance = newAccount.getAccountBalance();
        assertEquals(105, balance);

        System.out.println("This is account 1");
    }
    @Test
    void testDepositCashMethodWillNotTakeNegativeDeposit(){

        newAccount.depositMoney(100);
        newAccount.depositMoney(-20);
        int balance = newAccount.getAccountBalance();
        assertEquals(100, balance);

        newAccount.depositMoney(100);
        newAccount.depositMoney(-30);
        balance = newAccount.getAccountBalance();
        assertEquals(200, balance);

        System.out.println("This is account 2");
    }
    @Test
    void testMoneyCanBeWithdrawn(){
        newAccount.depositMoney(100);
        newAccount.withdrawMoney(50);
        int balance = newAccount.getAccountBalance();
        assertEquals(50, balance);

        newAccount.withdrawMoney(25);
        balance = newAccount.getAccountBalance();
        assertEquals(75, balance);

        newAccount.withdrawMoney(30);
        balance = newAccount.getAccountBalance();
        assertEquals(105, balance);

        System.out.println("This is account 1");
    }
    @Test
    void testWithdrawCashMethodWillNotTakeNegativeDeposit(){

        newAccount.withdrawMoney(100);
        newAccount.withdrawMoney(-20);
        int balance = newAccount.getAccountBalance();
        assertEquals(100, balance);

        newAccount.withdrawMoney(100);
        newAccount.withdrawMoney(-30);
        balance = newAccount.getAccountBalance();
        assertEquals(200, balance);

        System.out.println("This is account 2");
    }

//    @Test
//    void testWithdrawMoneyMethodShouldNotBeMoreThanTheAccountBalance(){
//
//    }

}