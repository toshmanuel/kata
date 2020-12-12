package com.exercise.chapterFour.TwoLargestNumbers;

import javax.swing.*;

public class TwoLargestNumbers {
    int highestNumber;
    int secondLargest;
    int counter = 1;
    int count;
    int thirdLargest;

    public int getHighestNumber() {
        return highestNumber;
    }

    public void setHighestNumber() {
        if(getCount() > 0){
            highestNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter input " + counter));
            while (counter < getCount()){
                secondLargest = Integer.parseInt(JOptionPane.showInputDialog("Enter input " + ++counter));
                if (secondLargest > highestNumber){
                    highestNumber = secondLargest;
                }
            }
        }

    }

    public int getSecondLargest() {
        return secondLargest;
    }
    public void checkForTheLargestNumber(){
        if(secondLargest > highestNumber && thirdLargest > secondLargest){
            highestNumber = thirdLargest;
        }
    }
    public void setThirdLargest(){
        if(thirdLargest > highestNumber){
            secondLargest = highestNumber;
            highestNumber = thirdLargest;
        }else {
            if (thirdLargest > secondLargest && thirdLargest != highestNumber){
                secondLargest = thirdLargest;
            }
        }
    }

    public void setSecondLargest() {
        if (getCount() > 0){
            highestNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter input " + counter));
            secondLargest = Integer.parseInt(JOptionPane.showInputDialog("Enter input " + ++counter));
            while (counter < getCount()) {
                thirdLargest = Integer.parseInt(JOptionPane.showInputDialog("Enter input " + ++counter));
                checkForTheLargestNumber();
                setThirdLargest();
            }
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        if (count > 0) {
            this.count = count;
        }
    }
}
