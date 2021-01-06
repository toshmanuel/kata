package com.exercise.chapterSix.DistanceBetweenTwoPoints;

public class DistanceOfTwoPoints {
    double pointX;
    double pointY;
    double distanceTwoPoints;
    public void calculatePointX(double pointX1, double pointX2) {
        pointX = pointX1 - pointX2;
        pointX = Math.pow(pointX,2);
    }

    public double getPointX() {
        return pointX;
    }

    public void calculatePointY(double pointY1, double pointY2) {
        pointY = pointY1 - pointY2;
        pointY = Math.pow(pointY,2);
    }

    public double getPointY() {
        return pointY;
    }

    public void calculateDistance(double pointX, double pointY) {
        distanceTwoPoints = pointX + pointY;
        distanceTwoPoints = Math.sqrt(distanceTwoPoints);
    }

    public double getDistance() {
        return distanceTwoPoints;
    }
}
