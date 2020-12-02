package com.exercise.chapterFive;

public class DaysOfChristmasSong {
    public static void main(String[] args) {
        int days;
        for (days =1; days<= 12; days++){
            System.out.println("Verse " + days);
            String day;
            switch (days) {
                case 1 -> {
                     day = "First";
                    System.out.println("On the " + day + " of Christmas \nmy true love said to me:");
                }
                case 2 -> {
                    day = "Second";
                    System.out.println("On the " + day + " of Christmas \nmy true love said to me:");
                }
                case 3 -> {
                    day = "Third";
                    System.out.println("On the " + day + " of Christmas \nmy true love said to me:");
                }
                case 4 -> {
                    day = "Fourth";
                    System.out.println("On the " + day + " of Christmas \nmy true love said to me:");
                }
                case 5 -> {
                    day = "Fifth";
                    System.out.println("On the " + day + " of Christmas \nmy true love said to me:");
                }
                case 6 -> {
                    day = "Sixth";
                    System.out.println("On the " + day + " of Christmas \nmy true love said to me:");

                }
                case 7 -> {
                    day = "Seventh";
                    System.out.println("On the " + day + " of Christmas \nmy true love said to me:");
                }
                case 8 -> {
                    day = "Eighth";
                    System.out.println("On the " + day + " of Christmas \nmy true love said to me:");
                }
                case 9 -> {
                    day = "Ninth";
                    System.out.println("On the " + day + " of Christmas \nmy true love said to me:");
                }
                case 10 -> {
                    day = "Tenth";
                    System.out.println("On the " + day + " of Christmas \nmy true love said to me:");
                }
                case 11 -> {
                    day= "Eleventh";
                    System.out.println("On the " + day + " of Christmas \nmy true love said to me:");
                }
                case 12 -> {
                    day = "Twelfth";
                    System.out.println("On the " + day + " of Christmas \nmy true love said to me:");

                }
            } switch(days){
                case 12:
                    System.out.println("12 Drummers Drumming");
                case 11:
                    System.out.println("Eleven Pipers Piping");
                case 10:
                    System.out.println("Ten Lords a Leaping");
                case 9:
                    System.out.println("Nine Ladies Dancing");
                case 8:
                    System.out.println("Eight Maids a Milking");
                case 7:
                    System.out.println("Seven Swans a Swimming");
                case 6:
                System.out.println("Six Geese a Laying");
                case 5:
                    System.out.println("Five Golden Rings");
                case 4:
                    System.out.println("Four Calling Birds");
                case 3:
                    System.out.println("Three French Hens");
                case 2:
                    System.out.println("Two Turtle Doves");
                case 1:
                    System.out.println("And a Partridge in a Pear Tree");
                    break;
            }





        }
    }
}