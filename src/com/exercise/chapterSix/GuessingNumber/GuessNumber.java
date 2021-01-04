package com.exercise.chapterSix.GuessingNumber;

import javax.swing.*;
import java.security.SecureRandom;

public class GuessNumber {
    int randomNumber;
    public void setRandomNumber() {
        SecureRandom random = new SecureRandom();

        randomNumber = 1 + random.nextInt(1000);
        System.out.println(randomNumber);
    }

    public int getGuessedNumber() {
        return randomNumber;
    }

    public void guessTheNumber(){
        int input = Integer.parseInt(JOptionPane.showInputDialog("enter number"));
        while (input != randomNumber){
            if (input > randomNumber)
                System.out.println("too large");
            if (input < randomNumber)
                System.out.println("too small");
            input = Integer.parseInt(JOptionPane.showInputDialog("enter number"));
        }
    }
}
