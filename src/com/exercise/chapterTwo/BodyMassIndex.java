package com.exercise.chapterTwo;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter height in metres(m)");
        double height = input.nextDouble();
        System.out.println("Enter weight in Kilogram(Kg)");
        double weight = input.nextDouble();
        if((weight / (height * height)) < 18.5){
            System.out.printf("%s%n", "Underweight");
        }
        if((weight / (height * height)) >= 18.5 && (weight / (height * height)) <= 24.9){
            System.out.printf("%s%n", "Normal");
        }
        if((weight / (height * height)) >= 25 && (weight / (height * height)) <= 29.9){
            System.out.printf("%s%n", "Overweight");
        }
        if((weight / (height * height)) >= 30){
            System.out.printf("%s%n", "Obese");
        }

    }
}
