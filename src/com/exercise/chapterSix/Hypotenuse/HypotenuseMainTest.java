package com.exercise.chapterSix.Hypotenuse;

import java.util.Scanner;

public class HypotenuseMainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RightTriangle triangle = new RightTriangle();
        System.out.println("Enter the value of the first side: ");
        int side1 = scanner.nextInt();
        triangle.setSide1(side1);
        System.out.println("Enter the value of the second side: ");
        int side2 = scanner.nextInt();
        triangle.setSide2(side2);

        double hypotenuse = triangle.hypotenuse(triangle.getSide1(), triangle.getSide2());
        System.out.println("The hypotenuse is: " + hypotenuse);
    }
}
