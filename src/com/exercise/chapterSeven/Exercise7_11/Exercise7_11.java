package com.exercise.chapterSeven.Exercise7_11;

public class Exercise7_11 {
    public static void main(String[] args) {
        //    a) Set the 10 elements of integer array counts to zero.
        int[] count = new int[10];
        int[] count2 = {0,0,0,0,0,0,0,0,0,0};

        //      b) Add one to each of the 15 elements of integer array bonus.

        int[] array = new int[15];

        for(int i = 0; i < array.length; i++){
            int arrayContent = array[i];
            array[i] = arrayContent + 1;
            System.out.print(array[i] + ", " );
        }
        System.out.println();

//        c) Display the five values of integer array bestScores in column format.

        int[] bestScores = {29, 50, 90, 45, 89};
        System.out.printf("%10s%15s%n", "scoreNumber", "scores");
        for (int i = 0; i < bestScores.length; i++){
            int scores = bestScores[i];
            System.out.printf("%11d%15d%n", i, scores);
        }
    }
}
