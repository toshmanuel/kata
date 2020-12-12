package com.practice.tdd;

public class ShufflingElementsOfAnArray {
    public static void main(String[] args) {

        int[][] array = { {1, 2, 3, 4, 5, 6, 7}, {2,4,3,5,3,6,7} };

//        Random rand  = new Random();

        for (int[] rows : array) {
            for (int column : rows) {
                System.out.printf("%d   ", column);
                //prints the address of each element of an array
            }//System.out.println(Arrays.toString(rows));
            System.out.println();
        }

//        int[][] arr = new int[3][4];
//        for (int i = 0; i < array.length; i++) {
//            int newArrangement = rand.nextInt(array.length);
//            int temp = array[newArrangement];
//            array[newArrangement] = array[i];
//            array[i] = temp;
//        }
//        System.out.println(Arrays.toString(array));
    }
}
