package com.exercise.chapterSix.CoinTossing;

import javax.swing.*;
import java.security.SecureRandom;

public class CoinTossing {
    int head;
    int tail;

    @Override
    public String toString() {
        return tokenStatus + "";
    }

    private enum Token {HEAD, TAIL}
    int option;
    Token tokenStatus;
    public void flip() {
        option = JOptionPane.showConfirmDialog(null, "Do you want to toss the coin", "Toss Coin",
                JOptionPane.YES_NO_OPTION);
        while (option != JOptionPane.NO_OPTION){
            SecureRandom random = new SecureRandom();
            byte side = (byte) (1 + random.nextInt(2));
            switch (side) {
                case 1 -> {
                    tokenStatus = Token.HEAD;
                    head++;
                }
                case 2 -> {
                    tokenStatus = Token.TAIL;
                    tail++;
                }
            }
            option = JOptionPane.showConfirmDialog(null, "Do you want to toss the coin", "Toss Coin",
                    JOptionPane.YES_NO_OPTION);
        }
        System.out.println(Token.HEAD + " is: " + head);
        System.out.println(Token.TAIL + " is: " + tail);

    }
}
