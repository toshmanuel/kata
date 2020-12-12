package com.practice.tdd;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        int[] swap = {5,4,3,2,1};
        int first;
        first = swap[0];
        for (int i = 0; i < swap.length; i++) {
            if(first > swap[i]){
                for (int j = 0; j < i; j++) {
                    first = swap[i];
                    if (first > swap[j]){
                        first = swap[j];
                    }
//                    System.out.println(first);
                }
//                swap[i] = first;
                System.out.println(first);
            }
        }
    }
}
