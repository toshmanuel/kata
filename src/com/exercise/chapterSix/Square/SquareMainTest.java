package com.exercise.chapterSix.Square;

import java.util.Scanner;

public class SquareMainTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Square square = new Square();
        System.out.print("Enter the size of square you want to print: ");
        int size = input.nextInt();
        square.setInput(size);
        square.printSquare(square.getInput());
    }
}
