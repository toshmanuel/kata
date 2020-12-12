package com.exercise.chapterFour;

public class InfiniteLoop {
    public static void main(String[] args) {
        int multiple = 2;
        while(multiple % 2 == 0){
            System.out.println(multiple);
            multiple += 2;
        }
    }
}
//(Multiples of 2 with an Infinite Loop) Write an application that keeps displaying in the
//        command window the multiples of the integer 2—namely, 2, 4, 8, 16, 32, 64, and so on. Your loop
//        should not terminate (i.e., it should create an infinite loop). What happens when you run this program?
