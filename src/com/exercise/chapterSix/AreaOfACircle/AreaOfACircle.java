package com.exercise.chapterSix.AreaOfACircle;

public class AreaOfACircle {
    private double radius;

    public void setRadius(double radius) {
        if (radius > 0){
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea(double radius) {
        return Math.pow(radius,2) * Math.PI;
    }
}
