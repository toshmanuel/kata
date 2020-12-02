package com.exercise.chapterThree;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class HeartRate {

    private String firstName;
    private String lastName;
    private int age;
    private double exercisePercentage;

    public HeartRate(String firstName, String lastName, int day, int month, int year){
        Date date = new Date(month, day, year);
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void calculateAge(int day, int month, int year){
        Date date = new Date(month, day, year);

//        date.setYear(year);
//        date.setDay(day);
//        date.setMonth(month);
        LocalDate dob = LocalDate.of(date.getYear(), date.getMonth(), date.getDay());
        LocalDate now = LocalDate.now();
        Period age1 = Period.between(dob, now);
        age = age1.getYears();
    }
    public int getAge(){
        return age;
    }
    public int maxHeartRate() {
        return 220 - age;
    }
    public void setExerciseRate(double exercisePercentage){
        boolean exerciseRateIsValid = exercisePercentage > 0 && exercisePercentage <= 100;
                if(exerciseRateIsValid) {
                    exercisePercentage = (exercisePercentage * maxHeartRate()) / 100;
                    this.exercisePercentage = exercisePercentage;
                }else{
                    System.out.println("Wrong input or format");
                }
    }
    public double targetHeartRate(){
        return exercisePercentage;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date date = new Date(0, 0, 0);
        HeartRate heartRate = new HeartRate("", "", 0, 0, 0);

        System.out.println("Enter first name: ");
        heartRate.setFirstName(input.nextLine());

        System.out.println("Enter last name: ");
        heartRate.setLastName(input.nextLine());

        System.out.println("Enter DayOfMonth of Birth: ");
        date.setDay(input.nextInt());

        System.out.println("Enter Month of Birth: ");
        date.setMonth(input.nextInt());

        System.out.println("Enter Year of Birth: ");
        date.setYear(input.nextInt());

        heartRate.calculateAge(date.getDay(), date.getMonth(), date.getYear());

        System.out.println("Enter your exercise level in percentage (55)");
        heartRate.setExerciseRate(input.nextDouble());

        System.out.printf("Name: %10s %10s%n",heartRate.getFirstName(), heartRate.getLastName());
        System.out.printf("Age: %d%n", heartRate.getAge());
        System.out.printf("Maximum heart rate is: %d%n", heartRate.maxHeartRate());
        System.out.printf("Target heart rate is: %f%n", heartRate.targetHeartRate());
    }
}