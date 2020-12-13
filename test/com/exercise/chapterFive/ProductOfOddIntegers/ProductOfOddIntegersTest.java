package com.exercise.chapterFive.ProductOfOddIntegers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfOddIntegersTest {

    ProductOfOddIntegers product;

    @BeforeEach
    void setUp() {
        System.out.println("Test Starting");
        product = new ProductOfOddIntegers();
    }

    @AfterEach
    void tearDown() {
        product = null;
        System.out.println("Test Ending");
    }
    @Test
    void testShowTheEfficacyOfTheProductMethod(){
        product.calculateProduct();
        assertEquals(2027025, product.getProduct());
    }
}


//(Calculating the Product of Odd Integers) Write an application that calculates the product
//        of the odd integers from 1 to 15.