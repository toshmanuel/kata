package com.exercise.chapterFive.Factorial;

public class Factorial {
    private long factorial;
    public void calculateFactorial() {
        System.out.printf("%10s       %15s%n", "n (Value)", "n! (factorial of n)");
        for(int counter = 1; counter <= 20; counter++){
            factorial = 1;
            for (int factorialCounter = 1; factorialCounter <= counter; factorialCounter++ ){
                factorial = factorialCounter * factorial;
            }
            System.out.printf("%5d %30d%n", counter, factorial);
        }
    }

    public long getFactorial() {
        return factorial;
    }
}
