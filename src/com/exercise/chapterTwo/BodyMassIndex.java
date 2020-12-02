package com.exercise.chapterTwo;

import java.util.Scanner;

public class BodyMassIndex {

    private double height;
    private double weight;

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
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter height in metres(m)");
        double height = input.nextDouble();
        System.out.println("Enter weight in Kilogram(Kg)");
        double weight = input.nextDouble();

    }
}
