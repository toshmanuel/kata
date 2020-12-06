package com.exercise.chapterFour.CreditLimitCalc;

public class CreditLimitCalc {
    private String firstName;
    private String lastName;
    private long accountNumber;
    private int accountBalance;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getFullName(){
        return firstName + " " + lastName;
    }
    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }
    @Override
    public String toString(){
        return String.valueOf(accountNumber);
    }

    public void setAccountBalance(int accountBalance) {
        if(accountBalance > 0){
            this.accountBalance = accountBalance;
        }
    }
}
//(Credit Limit Calculator) Develop a Java application that determines whether any of several
//        department-store customers has exceeded the credit limit on a charge account. For each customer,
//        the following facts are available:
//        a) account number
//        b) balance at the beginning of the month
//        c) total of all items charged by the customer this month
//        d) total of all credits applied to the customer’s account this month
//        e) allowed credit limit.
//        The program should input all these facts as integers, calculate the new balance (= beginning balance
//        + charges – credits), display the new balance and determine whether the new balance exceeds the
//        customer’s credit limit. For those customers whose credit limit is exceeded,
//        the program should display the message "Credit limit exceeded".
