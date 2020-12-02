package com.exercise.chapterTwo;

import java.util.Scanner;

public class BodyMassIndex {

    private double height;
    private double weight;

    public BodyMassIndex(double height, double weight){
        this.weight = weight;
        this.height = height;
    }

    public void setHeight(double height){
        if (height > 0) {
            this.height = height;
        }
    }
    public double getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        if(weight > 0){
            this.weight = weight;
        }
    }
    public double bmi(){
        boolean underweight = (weight / (height * height)) < 18.5;
        boolean normal = (weight / (height * height)) >= 18.5 && (weight / (height * height)) <= 24.9;
        boolean overweight = (weight / (height * height)) >= 25 && (weight / (height * height)) <= 29.9;
        boolean obese = (weight / (height * height)) >= 30;
        if(underweight){
            System.out.printf("%s%n", "Underweight");
        }else{
            if(normal) {
                System.out.printf("%s%n", "Normal");
            }else {
                if (overweight) {
                    System.out.printf("%s%n", "Overweight");
                } else {
                    if (obese) {
                        System.out.printf("%s%n", "Obese");
                    }
                }
            }
        }
        return (weight / (height * height));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BodyMassIndex bodyMassIndex = new BodyMassIndex(0, 0);

        System.out.println("Enter height in metres(m)");
        bodyMassIndex.setHeight(input.nextDouble());

        System.out.println("Enter weight in Kilogram(Kg)");
        bodyMassIndex.setWeight(input.nextDouble());

        System.out.println("bodyMassIndex = " + bodyMassIndex.bmi());
    }
}