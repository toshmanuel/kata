package com.exercise.chapterSeven.SalesCommission;

import java.util.Arrays;
import java.util.Scanner;

public class SalesCommissionMainTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SalesCommission salesCommission = new SalesCommission();

        System.out.print("enter the amount of workers you want to\npay their wages: ");
        int arraySize = sc.nextInt();
        salesCommission.setArrayLength(arraySize);

        int[] sales = new int[arraySize];
        int[] frequency = new int[9];
        for (int counter = 0; counter < arraySize; counter++){
            System.out.printf("enter the amount sold by each employee%d to calculate their commission: ", ( counter + 1));
            int content = sc.nextInt();
            salesCommission.setArrayContent(content);
            sales[counter] = salesCommission.getArrayContent();
        }
        salesCommission.insertFrequencies(frequency, sales);

        System.out.println(Arrays.toString(sales));
        System.out.println(Arrays.toString(frequency));

        salesCommission.calculateWages(sales);
        System.out.println(Arrays.toString(sales));
    }
}
