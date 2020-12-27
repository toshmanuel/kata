package com.exercise.chapterSix;

import java.security.SecureRandom;

public class RandomRanges {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int rand = 1 + random.nextInt(2);
        System.out.println("Value is: " + rand);

        rand = 1 + random.nextInt(100);
        System.out.println("Value is: " + rand);

        rand = random.nextInt(10);
        System.out.println("Value is: " + rand);

        rand = 1000 + random.nextInt(112);
        System.out.println("Value is: " + rand);

        rand = -1 + random.nextInt(3);
        System.out.println("Value is: " + rand);

        rand = -3 + random.nextInt(15);
        System.out.println("Value is: " + rand);
    }
}
