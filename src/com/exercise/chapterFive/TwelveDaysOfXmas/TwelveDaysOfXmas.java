package com.exercise.chapterFive.TwelveDaysOfXmas;

public class TwelveDaysOfXmas {

    private int day;
    private String verseDay;

    public void setDay(int day) {
        if (day > 0 && day <= 12) {
            this.day = day;
        }
    }

    public int getDay() {
        return day;
    }

    public void setVerseDay() {
        for (int count = day; count > 0; count--) {
            this.verseDay = switch (day) {
                case 1 -> "First";
                case 2 -> "Second";
                case 3 -> "Third";
                case 4 -> "Fourth";
                case 5 -> "Fifth";
                case 6 -> "Sixth";
                case 7 -> "Seventh";
                case 8 -> "Eighth";
                case 9 -> "Ninth";
                case 10 -> "Tenth";
                case 11 -> "Eleventh";
                case 12 -> "Twelfth";
                default -> " ";
            };

        }
    }

    public String getVerseDay() {
        return verseDay;
    }

    public String printVerseLine() {
        return "On the " + verseDay + " day of Christmas \nmy true love said to me:";
    }

    public void printVerse() {
        switch (day) {
            case 12:
                System.out.println("Twelve Drummers Drumming");
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
            default:
                throw new IllegalStateException("Unexpected value: " + day);
        }
    }
    public void printWholeVerses(){
//        int count;
        for(int count = getDay(); count > 0; count--){
            setVerseDay();
            System.out.println(printVerseLine());
            printVerse();
            day--;
        }
    }
}
