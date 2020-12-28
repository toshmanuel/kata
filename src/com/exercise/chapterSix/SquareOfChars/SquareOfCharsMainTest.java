package com.exercise.chapterSix.SquareOfChars;

import com.exercise.chapterSix.Square.Square;

import java.util.Scanner;

public class SquareOfCharsMainTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Square square = new Square();
        SquareOfChars character = new SquareOfChars();

        System.out.print("Enter the size of square you want to print: ");
        int size = input.nextInt();
        square.setInput(size);

        System.out.print("Enter the character you wan tto print it square: ");
        char charFill = input.next().charAt(0);
        character.printChars(square.getInput(), charFill);
    }
}
