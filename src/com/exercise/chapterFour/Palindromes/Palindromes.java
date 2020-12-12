package com.exercise.chapterFour.Palindromes;

import javax.swing.*;

public class Palindromes {
    int input;
    public void setInput() {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Enter a 5 digit value" +
                ":" +
                " number should be a palindromic number (e.g 11211 or 12321)"));
        if (input > 9999 && input <100000 ){
            this.input = input;
        }
    }
    public int getInput(){
        return input;
    }
    public void setPalindromicInput(){
        int input = Integer.parseInt(JOptionPane.showInputDialog("Enter a 5 digit value" +
                ":" +
                " number should be a palindromic number (e.g 11211 or 12321)"));
        if (input > 9999 && input <100000 ) {
            int fifthDigit = input% 10;
            input = input / 10;

            int fourthDigit = input % 10;
            input = input / 10;

            int thirdDigit = input % 10;
            input = input / 10;

            int secondDigit = input % 10;

            int firstDigit = input / 10;

            while ((fifthDigit != firstDigit) && (fourthDigit != secondDigit)) {

                int input2 = Integer.parseInt(JOptionPane.showInputDialog("Enter" +
                        " User Input again: "));

                fifthDigit = input2 % 10;
                input2 = input2 / 10;

                fourthDigit = input2 % 10;
                input2 = input2 / 10;

                thirdDigit = input2 % 10;
                input2 = input2 / 10;

                secondDigit = input2 % 10;

                firstDigit = input2 / 10;
            }

            this.input = input;
        }
    }
}
