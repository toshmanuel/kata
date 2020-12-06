package com.exercise.chapterFour.GasMileage;

import javax.swing.*;

public class GasMileage {
    private int distance;
    private int gallons;
    private double average;

    public void setDistances(int distance) {
        if(distance < 0){
            System.out.println("Value cannot be negative");
        }else{
            this.distance = distance;
        }
    }
    public int getDistance (){
        return distance;
    }

    public void setGallons(int gallons) {
        if(gallons < 0){
            System.out.println("Value cannot be negative");
        }else{
            this.gallons = gallons;
        }
    }
    public int getGallons(){
        return gallons;
    }

    public double distancePerGallon() {
        return distance / (gallons * 1.0);
    }
    public void calculateAverage(){

        int counter = 0;
        double outAverage =0;

        distance = Integer.parseInt(JOptionPane.showInputDialog("enter distance"));
        gallons = Integer.parseInt(JOptionPane.showInputDialog("Enter gallons: -"));

        while(distance >= 0){
            outAverage =outAverage + (distance / (gallons * 1.0));
            counter++;
            distance = Integer.parseInt(JOptionPane.showInputDialog("enter distance"));
            gallons = Integer.parseInt(JOptionPane.showInputDialog("Enter gallons: -"));
        }
        if (counter > 0) {
            average = outAverage / counter;
        }
    }

    public double getAverage() {
        return average;
    }
}
