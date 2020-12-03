package com.exercise.chapterThree;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setDay(int day) {
        boolean dayIsThirtyDays = (month == 4 || month == 6 || month == 9 || month == 11) && day > 30;
        boolean daysInFebruary = month == 2 && day > 28;
        boolean daysInFebruaryInALeapYear = year%4 == 0 && month == 2 && day > 29;
        boolean dayIsValid = day > 0 && day <= 31;
        if (day <  0 ){
            System.out.println("Invalid Input:");
        }else{
            if (dayIsThirtyDays) {
                System.out.println("Invalid Day format in month: ");
            }else{
                if (daysInFebruaryInALeapYear){
                    System.out.println("Invalid Day format in month: ");
                }else{
                    if (daysInFebruary){
                        System.out.println("Invalid Day format in month");
                    }else{
                        if(dayIsValid){
                            this.day = day;
                        }else {
                            System.out.println("Wrong Input.....");
                        }
                    }
                }
            }
        }
    }
    public void setMonth(int month){
        boolean monthIsValid = month > 0 && month <= 12;
        if(monthIsValid){
            this.month = month;
        }else {
            System.out.println("Invalid Input: enter values between 1 and 12");
        }
    }
    public void setYear(int year){
        boolean yearIsValid = year >= 1000 && year <= 3000;
        if(yearIsValid){
            this.year = year;
        }else {
            System.out.println("Invalid year input");
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    @Override
    public String toString(){
        return month+"/"+day+"/"+year;
    }

    public static void main(String[] args) {
        Date date = new Date(0, 0, 0);
        date.setDay(1);
        date.setMonth(11);
        date.setYear(2020);

        System.out.println(date.toString());
    }
}
