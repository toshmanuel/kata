package com.exercise.chapterFive;

//import java.util.Scanner;

public class ChapterFiveExercise {

    private long result;

    public long getResult() {
        return result;
    }

    public void setResult(long result) {
        this.result = result;
    }

    public void generateFactorial(int temp) {
        result = 1;
//        Scanner userInput = new Scanner(System.in);
//        System.out.println("Enter integer value");
//        temp = userInput.nextInt();

        while(temp >= 1){
            result = result * temp;
            temp = temp - 1;
        }
//        System.out.println(result);
    }
}

