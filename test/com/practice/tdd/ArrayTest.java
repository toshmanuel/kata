package com.practice.tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {
    Array array;
    @BeforeEach
    void setUp() {
        array = new Array();
    }

    @AfterEach
    void tearDown() {
    }
    @Test

    void testToDeterMineLengthOfArray(){
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        array.calculateSum(arr);
        assertEquals(55,array.totalValue());
    }

    @Test
    void testToCheckAverage(){
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        array.calculateSum(arr);
        array.setAverage(arr);
        assertEquals(5.5, array.average());

    }
    @Test
    void testToCheckMinValue(){
        int[] arr = {1,2,-7,4,5};
        array.minValue(arr);
        assertEquals(-7, array.getMin());
    }
    @Test
    void testToCheckMaxValue(){
        int[] arr = {1,2,3,4,5};
        array.maxValue(arr);
        assertEquals(5, array.getMax());
    }
    @Test
    void testToGetTheHighestSumOfN_OneElementOfAnArray(){
        int[] arr = {1,1,5,6,7};
        array.calculateSum(arr);
        array.calculateMaxSumOfArr(arr);
        assertEquals(19, array.getMaxSum());
        System.out.println(array.getMaxSum());
    }
    @Test
    void testToGetTheLowestPossibleSumOfIntegersInAnArray(){
        int[] arr = {10,10,10,10,10};
        array.calculateSum(arr);
        array.calculateLowestSum(arr);
        assertEquals(40, array.getMinSum());
        System.out.println(array.getMinSum());
    }

}