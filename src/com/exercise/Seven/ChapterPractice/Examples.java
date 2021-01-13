package com.exercise.Seven.ChapterPractice;

import java.security.SecureRandom;
import java.util.Arrays;

public class Examples {
    public static void main(String[] args) {
        int[] array = { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };
        System.out.println("Grade Distribution");
        for(int counter = 0; counter < array.length; counter++){
            if (counter == 10){
                System.out.print(100);
            }else {
                System.out.print((counter * 10) + "-" + (counter * 10 + 9));
            }
            for (int asterisks = 0; asterisks < array[counter]; asterisks++){
                System.out.print("*");
            }
            System.out.println();
        }

        SecureRandom random = new SecureRandom();
        int[] frequency =  new int[7];
        for (int counter = 0; counter < 600; counter++){
            int rand = 1 + random.nextInt(6);
            ++frequency[rand];
        }
        System.out.println(Arrays.toString(frequency));

        for (int count = 1; count < frequency.length; count++){
            System.out.println(count + "     " + frequency[count]);
        }

        int[] responses = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2 };

        int[] rating = new int[6];

        for (int counter = 0; counter < responses.length; counter++){
            ++rating[responses[counter]];
        }

        for (int count = 1; count < rating.length; count++){
            System.out.println(rating[count] + "     " + count);
        }
    }
}
