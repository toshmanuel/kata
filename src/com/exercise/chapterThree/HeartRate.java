package com.exercise.chapterThree;

//import java.net.http.WebSocket;
import java.time.LocalDate;
import java.time.Period;

public class HeartRate {

    private String firstName;
    private String lastName;
    private int age;
    private double exercisePercentage;

    public HeartRate(String firstName, String lastName, int day, int month, int year){
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
        Date date = new Date(0, 0, 0);

        date.setYear(year);
        date.setDay(day);
        date.setMonth(month);
        LocalDate dob = LocalDate.of(year, month, day);
        LocalDate now = LocalDate.now();
        Period age1 = Period.between(dob, now);
        age = age1.getYears();

        System.out.println(age);
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

    }
}
