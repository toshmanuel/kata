package com.exercise.chapterFour.Crytography;

import javax.swing.*;

public class Cryptography {
    private int pin;
    private int firstDigit;
    private int secondDigit;
    private int thirdDigit;
    private int fourthDigit;

    public void setPin() {
        int pin = Integer.parseInt(JOptionPane.showInputDialog("Enter pin"));
        if(pin > 999 && pin <10000){
            this.pin = pin;
        }else{
            System.out.println("Enter valid input");
        }
    }

    public int getPin() {
        return  pin;
    }

    public String getEncryptedPin() {
        int newPin = getPin();

        int fourthDigit = newPin % 10;
        fourthDigit = (fourthDigit + 7) % 10;
        this.fourthDigit = fourthDigit;

        newPin = newPin / 10;
        int thirdDigit = newPin % 10;
        thirdDigit = (thirdDigit + 7) % 10;
        this.thirdDigit = thirdDigit;

        newPin = newPin / 10;
        int secondDigit = newPin % 10;
        secondDigit = (secondDigit + 7) % 10;
        this.secondDigit = secondDigit;

        newPin = newPin / 10;
        int firstDigit = (newPin + 7) % 10;
        this.firstDigit = firstDigit;

        return thirdDigit+ "" +fourthDigit+ "" +firstDigit+ "" +secondDigit ;
    }
    public String getDecryptedPin(){
        if (firstDigit > 7){
            firstDigit = firstDigit - 7;
        }else{
            firstDigit = (firstDigit + 10 - 7);
        }
        if (secondDigit > 7){
            secondDigit = secondDigit - 7;
        }else{
            secondDigit = (secondDigit + 10 - 7);
        }
        if (thirdDigit > 7){
            thirdDigit = thirdDigit - 7;
        }else{
            thirdDigit = (thirdDigit + 10 - 7);
        }
        if (fourthDigit > 7){
            fourthDigit = fourthDigit - 7;
        }else{
            fourthDigit = (fourthDigit + 10 - 7);
        }
        return firstDigit+ "" +secondDigit+ "" +thirdDigit+ "" +fourthDigit ;
    }
}
