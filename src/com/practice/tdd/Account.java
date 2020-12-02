package com.practice.tdd;

public class Account {


    private int accountBalance;

    public void depositMoney(int depositAmount) {
        if (depositAmount >= 0) {
            accountBalance = accountBalance + depositAmount;
        }

    }
    public int getAccountBalance() {

        return accountBalance;
    }

    public void withdrawMoney(int withdrawAmount) {
        if (withdrawAmount >= 0){
            accountBalance = accountBalance + withdrawAmount;
        }
        if (withdrawAmount > accountBalance){
            System.out.println("Insufficient balance");
        }
    }
}
