package com.exercise.chapterFour.SidesOfATriangle;

import javax.swing.*;

public class SidesOfATriangle {

    private int firstSide;
    private int secondSide;
    private int thirdSide;

    public void setFirstSide() {
        int firstSide = Integer.parseInt(JOptionPane.showInputDialog("Enter first side of the triangle"));
        if (firstSide > 0){
            this.firstSide = firstSide;
        }
    }
    public int getFirstSide(){
        return firstSide;
    }
    public void setSecondSide(){
        int secondSide = Integer.parseInt(JOptionPane.showInputDialog("Enter first side of the triangle"));
        if (secondSide > 0){
            this.secondSide = secondSide;
        }
    }
    public int getSecondSide(){
        return secondSide;
    }

    public void setThirdSide() {
        int thirdSide = Integer.parseInt(JOptionPane.showInputDialog("Enter first side of the triangle"));
        if (thirdSide > 0){
            this.thirdSide = thirdSide;
        }
    }

    public int getThirdSide() {
        return thirdSide;
    }

    public void checkTriangle() {
        boolean triangleIsValid = getFirstSide() > 0 && getSecondSide() > 0 && getThirdSide() > 0;
        if (triangleIsValid){
            firstSide = getFirstSide();
            secondSide = getSecondSide();
            thirdSide = getThirdSide();
        }
        else{
            firstSide = 0;
            secondSide = 0;
            thirdSide = 0;
            System.out.println("Enter values greaterThan 0");
        }
    }
}
