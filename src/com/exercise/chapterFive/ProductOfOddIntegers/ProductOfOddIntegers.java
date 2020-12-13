package com.exercise.chapterFive.ProductOfOddIntegers;

public class ProductOfOddIntegers {
    private int product;

    public void calculateProduct() {
        product = 1;
        for(int counter = 1; counter < 16; counter += 2){
            product = product * counter;
        }
    }
    public int getProduct(){
        return product;
    }
}
