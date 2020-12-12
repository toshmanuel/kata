package com.exercise.chapterFour;

public class DanglingElseStatement2 {
    public static void main(String[] args) {
//        Expected output
//        @@@@@
//        $$$$$
//        &&&&&
        int y = 8;

        int x = 5;
        if (y == 8)
            if (x == 5)
                System.out.println("@@@@@");
            else
                System.out.println("#####");
        System.out.println("$$$$$");
        System.out.println("&&&&&");
        System.out.println();
        System.out.println();
        System.out.println();

//        Expected outcome @@@@@

        if (y == 8)
            if (x == 5)
                System.out.println("@@@@@");
            else{
                System.out.println("#####");
                System.out.println("$$$$$");
                System.out.println("&&&&&");
            }
        System.out.println();
        System.out.println();
        System.out.println();

//        Expected outcome is #####
//$$$$$
//&&&&&
        if (y == 7){
            if (x == 5)
                System.out.println("@@@@@");
        }
        else{
            System.out.println("#####");
            System.out.println("$$$$$");
            System.out.println("&&&&&");
        }
    }
}
