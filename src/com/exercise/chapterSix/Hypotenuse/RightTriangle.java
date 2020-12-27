package com.exercise.chapterSix.Hypotenuse;

public class RightTriangle {
    private int side1;
    private int side2;

    public void setSide1(int side1) {
        if (side1 > 0){
            this.side1 = side1;
        }
    }

    public int getSide1() {
        return side1;
    }

    public void setSide2(int side2) {
        if (side2 > 0){
            this.side2 = side2;
        }
    }

    public int getSide2() {
        return side2;
    }

    public double hypotenuse(double sideA, double sideB) {
        sideA = side1;
        sideB = side2;
        sideA = Math.pow(sideA, 2);
        sideB = Math.pow(sideB, 2);
        double hypotenuse = sideA + sideB;
        hypotenuse = Math.sqrt(hypotenuse);
        return hypotenuse;
    }
}
