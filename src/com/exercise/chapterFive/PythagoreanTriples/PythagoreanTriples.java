package com.exercise.chapterFive.PythagoreanTriples;

public class PythagoreanTriples {

    private int sides;
    private int side_1;
    private int side_2;
    private double hypotenuse;

    public void setSides(int sides) {
        if(sides > 0){
            this.sides = sides;
        }
    }

    public int getSides() {
        return sides;
    }

    public void calculatePythagoreanTriples() {
        System.out.printf("%6s%15s%20s%n", "First Side", "Second Side", "Hypotenuse");
        for (int side_1 = 1; side_1 < sides; side_1++){
            for (int side_2 = 1; side_2 <sides; side_2++){
                double hypotenuseSquare = Math.pow(side_1, 2) + Math.pow(side_2, 2);
                double hypotenuse = Math.sqrt(hypotenuseSquare);
                if (hypotenuse % 1 == 0 && hypotenuse <= 500){
                    this.hypotenuse = hypotenuse;
                    this.side_1 = side_1;
                    this.side_2 = side_2;
                    System.out.printf("%10d%15d%20.0f%n", side_1, side_2, hypotenuse);
                }
            }
        }
    }

    public int getPythagoreanTriples() {
        for (int i : new int[]{side_1, side_2, (int) hypotenuse})
            return i;
        return side_1;
    }
}
