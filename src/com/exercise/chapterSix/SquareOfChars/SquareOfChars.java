package com.exercise.chapterSix.SquareOfChars;

public class SquareOfChars {
    public void printChars(int input, char character) {
        for (int rows = input; rows > 0; rows--){
            for (int column = 0; column < input; column++){
                System.out.print(character + " ");
            }
            System.out.println();
        }
    }
}
