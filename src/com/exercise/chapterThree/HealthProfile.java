package com.exercise.chapterThree;

import com.exercise.chapterTwo.BodyMassIndex;

import java.util.Scanner;

public class HealthProfile {
    Date date = new Date(0, 0, 0);
    HeartRate heartRate = new HeartRate("", "", 0, 0, 0);
    BodyMassIndex bodyMassIndex = new BodyMassIndex(0, 0);

    private String gender;

    public HealthProfile(String firstName, String lastName, String gender, int day, int month, int year, double height, double weight){
        this.gender = gender;
        heartRate.setFirstName(firstName);
        heartRate.setLastName(lastName);
        date.setDay(day);
        date.setMonth(month);
        date.setYear(year);
        bodyMassIndex.setWeight(weight);
        bodyMassIndex.setHeight(height);
    }

    public void setGender(String gender) {
       this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public static void main(String[] args) {
        HealthProfile profile = new HealthProfile("", "", "", 0, 0, 0, 0, 0);
        Scanner input = new Scanner(System.in);
        Date date = new Date(0, 0, 0);
        HeartRate heartRate = new HeartRate("", "", 0, 0, 0);
        BodyMassIndex bodyMassIndex = new BodyMassIndex(0, 0);

        System.out.println("Enter first name: ");
        heartRate.setFirstName(input.nextLine());

        System.out.println("Enter last name: ");
        heartRate.setLastName(input.nextLine());

        System.out.println("Enter day of birth : ");
        date.setDay(input.nextInt());

        System.out.println("Enter month of birth: ");
        date.setMonth(input.nextInt());

        System.out.println("Enter year of birth: ");
        date.setYear(input.nextInt());

        heartRate.calculateAge(date.getDay(), date.getMonth(), date.getYear());

        System.out.println("Enter exercise rate in percentage (e.g 55)");
        heartRate.setExerciseRate(input.nextDouble());



    }
}