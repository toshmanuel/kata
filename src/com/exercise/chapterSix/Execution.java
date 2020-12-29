package com.exercise.chapterSix;

import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        System.out.println(Math.abs(7.5));
        System.out.println(Math.floor(7.5));
        System.out.println(Math.abs(0.0));
        System.out.println(Math.ceil(0.0));
        System.out.println(Math.abs(-6.4));
        System.out.println(Math.ceil(-6.4));
        System.out.println(Math.ceil(-Math.abs(-8 + Math.floor(-5.5))));


                System.out.println("Enter string to reverse:");

                Scanner read = new Scanner(System.in);
                String str = read.nextLine();

                StringBuilder sb = new StringBuilder(str);

                System.out.println("Reversed string is:");
                System.out.println(sb.reverse());

    }
}
