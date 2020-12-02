package com.exercise.chapterThree;

public class ModifiedAccountClass {
    private int balance;
    public void depositAmount(int amountDeposited) {
        if (amountDeposited > 0) {
            balance = balance + amountDeposited;
        }
    }
    public void setAccountBalance(int balance){
        if(balance >= 0) {
            this.balance = balance;
        }
    }

    public int getAccountBalance() {

        return balance;
    }
    public void withdrawAmount(int amountWithdrawn){
        if(amountWithdrawn > 0 && amountWithdrawn <= balance){
            balance = balance - amountWithdrawn;
        }else
            System.out.println("Insufficient balance");

    }
}
