package com.exercise.chapterFour.GasMileage;

import javax.swing.*;

public class GasMileage {
    private int distance;
    private int gallons;

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
        return distance / gallons;
    }
    public void calculateAverage(){
//        int counter = 1;
        while(distance != -1){
            distance = Integer.parseInt(JOptionPane.showInputDialog("Enter Distance Cover in miles"));
            gallons = Integer.parseInt(JOptionPane.showInputDialog("Enter amount of gallon used for the distance travelled"));
        }
    }
}
