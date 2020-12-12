package com.exercise.chapterFour.ValidatingUserInput;

import javax.swing.*;

public class UserInput {

    private int userInput;

    public void collectInput() {
        userInput = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 or 2 to end this loop"));
    }
    public void validateUserInput(){

        while(userInput != 1 && userInput != 2){
            userInput = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 or 2 to end this loop"));
        }
    }
    public int getUserInput() {
        return  userInput;
    }
}
