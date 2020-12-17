package com.exercise.chapterFive;

public class StatementPrinting {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        int k = 3;
        int m = 2;
        System.out.println(i == 1);

        System.out.println(j == 3);

        System.out.println((i >= 1) && (j < 4));

        System.out.println((m <= 99) & (k < m));

        System.out.println((j >= i) || (k == m));

        System.out.println((k + m < j) | (3 - j >= k));

        System.out.println(!(k > m));
    }
}

//    Assume that i = 1, j = 2, k = 3 and m = 2. What does each of the following statements print?
//        a) System.out.println(i == 1);
//        b) System.out.println(j == 3);
//        c) System.out.println((i >= 1) && (j < 4));
//        d) System.out.println((m <= 99) & (k < m));
//        e) System.out.println((j >= i) || (k == m));
//        f) System.out.println((k + m < j) | (3 - j >= k));
//        g) System.out.println(!(k > m));
