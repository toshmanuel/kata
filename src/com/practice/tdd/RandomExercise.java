package com.practice.tdd;

import java.security.SecureRandom;

public class RandomExercise {
    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();
        int random = rand.nextInt();
        System.out.println(random);
        random = rand.nextInt(6);
        System.out.println(random);
        random = 1 +rand.nextInt(6);
        System.out.println(random);
        random =5 + rand.nextInt(6);
        System.out.println(random);
        random = 2 + 2 * rand.nextInt(6);
        System.out.println(random);
    }
}
