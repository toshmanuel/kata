package com.practice.tdd;

public class Array {
    int array;
    double total = 0;
    double average =1;
    int min;
    int max;
    double maxSum;
    double minSum;

    public void calculateSum(int[] arr){
        for(array = 0; array < arr.length; array++){
            total = total + arr[array];
        }
    }
    public void setAverage(int[] arr){
        average = totalValue()/arr.length;
    }
    public double average() {
        return average;

    }
    public double totalValue(){
        return total;
    }
    public void minValue(int[] arr){
        min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
    }
    public int getMin(){
        return min;
    }

    public void maxValue(int[] arr) {
        max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }

    }
    public int getMax(){
        return max;
    }

    public void calculateMaxSumOfArr(int[] arr) {

        min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//
//            if (min > arr[i]) {
//                min = arr[i];
//            }
//
//        }
//       minSum = totalValue() - (min * 1.0);
        maxSum = totalValue() - getMin();
    }
    public double getMaxSum() {
        return maxSum;
    }
    public void calculateLowestSum(int[] arr){
        max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (max < arr[i]){
//                max = arr[i];
//            }
//        }
//        minSum = totalValue() - (max * 1.0);
        minSum = totalValue() - getMax();
    }

    public double getMinSum() {
        return minSum;
    }
}
