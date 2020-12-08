package com.exercise.chapterFour.TabularInput;

public class TabularInput {
    int counter;
    int number = 1;
    public void setCounter() {
        counter = 0;
        while (counter < 5){
            System.out.println(number);
                counter++;
                number++;
            }

        System.out.print("   ");
    }
    public void setCounterTimesTen() {
        counter = 0;
        while (counter < 5){
            System.out.println(number * 10);
            counter++;
            number++;
        }

        System.out.print("   ");
    }
    public void setCounterTimesHundred() {
        counter = 0;
        while (counter < 5){
            System.out.println(number * 100);
            counter++;
            number++;
        }
    }

    public void setCounterTimesThousand() {
        counter = 0;
        while (counter < 5){
            System.out.println(number * 1000);
            counter++;
            number++;
        }
    }
    public int getCounter() {
        return counter;
    }
    public int getCounterTimesTen() {
        return counter * 10;
    }
    public int getCounterTimesHundred() {
        return counter * 100;
    }
    public int getCounterTimesThousand(){
        return counter * 1000;
    }
}
