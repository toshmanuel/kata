package com.exercise.chapterSix.TemperatureCalculator;

import java.util.Scanner;

public class TempCalculatorMainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TemperatureCalculator calculator = new TemperatureCalculator();
        testMain(scanner, calculator);

        testMain(scanner, calculator);

        testMain(scanner, calculator);
    }

    private static void testMain(Scanner scanner, TemperatureCalculator calculator) {
        System.out.println("Enter the value of temperature\n you " +
                "want to convert");
        double temp2 = scanner.nextDouble();
        calculator.setTemperature(temp2);
        System.out.println("Enter 1 to get the celsius equivalent \n" +
                "Enter 2 to get the fahrenheit equivalent");
        byte tempCalculatorSelector2 = scanner.nextByte();
        double newTemp2 = calculator.getEquivalent(tempCalculatorSelector2);
        System.out.println("Converted temperature is: " + newTemp2);
    }
}
