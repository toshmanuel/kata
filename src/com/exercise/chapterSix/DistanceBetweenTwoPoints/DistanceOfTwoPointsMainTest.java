package com.exercise.chapterSix.DistanceBetweenTwoPoints;

import java.util.Scanner;

public class DistanceOfTwoPointsMainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DistanceOfTwoPoints points = new DistanceOfTwoPoints();
        System.out.print("Enter distance X1 of point 1: ");
        double pointX1 = scanner.nextInt();

        System.out.print("Enter distance Y1 of point 1: ");
        double pointY1 = scanner.nextInt();

        System.out.print("Enter distance X2 of point 2: ");
        double pointX2 = scanner.nextInt();

        System.out.print("Enter distance Y2 of point 2: ");
        double pointY2 = scanner.nextInt();

        points.calculatePointX(pointX1, pointX2);
        points.calculatePointY(pointY1, pointY2);

        points.calculateDistance(points.getPointX(), points.getPointY());
        System.out.println("distance between the two point is: " +
                points.getDistance());
    }
}
