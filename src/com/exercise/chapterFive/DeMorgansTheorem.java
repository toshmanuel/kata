package com.exercise.chapterFive;

public class DeMorgansTheorem {
    public static void main(String[] args) {
        int x = 3;
        int y = 9;
        int a = 7;
        int b = 5;
        int g = 1;
        int i = 2;
        int j = 10;

//        deMorgan's Equivalent of !(x < 5) && !(y >= 7)
        System.out.println(!((x < 5) || (y >= 7)));

//        deMorgan's Equivalent of !(a == b) || !(g != 5)
        System.out.println(!((a == b) && (g != 5)));

//        deMorgan's Equivalent of !((x <= 8) && (y > 4))
        System.out.println(!(x <= 8) || !(y > 4));

//        deMorgan's Equivalent of !((i > 4) || (j <= 6))
        System.out.println(!(i > 4) && !(j <= 6));
    }
}
