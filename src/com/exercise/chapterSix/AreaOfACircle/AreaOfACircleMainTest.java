package com.exercise.chapterSix.AreaOfACircle;

import java.util.Scanner;

public class AreaOfACircleMainTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AreaOfACircle area = new AreaOfACircle();

        System.out.print("enter the radius of the circle: ");
        double radius = input.nextInt();
        area.setRadius(radius);
        double areaOfCircle = area.calculateArea(area.getRadius());
        System.out.println("Area of the circle is: " + areaOfCircle);
    }
}
