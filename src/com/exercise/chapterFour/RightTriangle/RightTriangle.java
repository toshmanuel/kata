package com.exercise.chapterFour.RightTriangle;

import com.exercise.chapterFour.SidesOfATriangle.SidesOfATriangle;

public class RightTriangle {

    public void calculateTheHypotenuse() {
        SidesOfATriangle sidesOfATriangle = new SidesOfATriangle();
        int hypotenuse = sidesOfATriangle.getFirstSide();
        int adjacent = sidesOfATriangle.getSecondSide();
        int opposite = sidesOfATriangle.getThirdSide();
        boolean hypotenuseIsLargest = hypotenuse == Math.pow((Math.pow(adjacent, 2) + Math.pow(opposite, 2)), 0.5);
        boolean oppositeIsLargest = opposite == Math.pow((Math.pow(adjacent, 2) + Math.pow(hypotenuse, 2)), 0.5);
        boolean adjacentIsLargest = opposite == Math.pow((Math.pow(opposite, 2) + Math.pow(hypotenuse, 2)), 0.5);

        if (hypotenuseIsLargest) {
            System.out.println("The values entered can represent \n " +
                    "the sides of a triangle with the first side \n" +
                    " as the hypotenuse");
        }else{
            if (oppositeIsLargest){
                System.out.println("The values entered can represent \n " +
                        "the sides of a triangle with the second side \n" +
                        " as the hypotenuse");
            }else{
                if (adjacentIsLargest){
                    System.out.println("The values entered can represent \n " +
                            "the sides of a triangle with the third side \n" +
                            " as the hypotenuse");
                }else{
                    System.out.println("The values entered cannot represent the " +
                            "sides of a right triangle");
                }
            }
        }
    }
}
