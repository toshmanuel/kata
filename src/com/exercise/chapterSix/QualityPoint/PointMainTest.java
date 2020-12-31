package com.exercise.chapterSix.QualityPoint;

import java.util.Scanner;

public class PointMainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QualityPoints points = new QualityPoints();
        System.out.println("Enter student average to get grade point");
        int average = scanner.nextInt();

        points.setAverage(average);
        int gradePoint = points.checkQuality(points.getAverage());

        System.out.println(gradePoint);
    }
}
