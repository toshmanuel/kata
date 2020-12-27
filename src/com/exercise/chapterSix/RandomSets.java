package com.exercise.chapterSix;

import java.security.SecureRandom;

public class RandomSets {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int rand = 2 + 2 * random.nextInt(5);
        System.out.println("Value is: " + rand);

        rand = 3 + 2 * random.nextInt(5);
        System.out.println("Value is: " + rand);

        rand = 6 + 4 * random.nextInt(5);
        System.out.println("Value is: " + rand);
    }
}
