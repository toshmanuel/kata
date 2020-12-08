package com.exercise.chapterFour.SalaryCalculator;

import javax.swing.*;

public class SalaryCalc {
    private String firstName;
    private String lastName;
    private int rate;
    private int hoursWorked;

    public void setEmployeesFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getEmployeesFirstName(){
        return firstName;
    }

    public void setEmployeesLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmployeesLastName() {
        return lastName;
    }

    public void setHourlyRate() {
        rate = Integer.parseInt(JOptionPane.showInputDialog("Enter Rate for Employee"));
        if(rate < 0){
            rate = 0;
//            this.rate = rate;
        }
    }

    public int getHourlyRate() {
        return rate;
    }

    public void setHoursWorked() {
        hoursWorked = Integer.parseInt(JOptionPane.showInputDialog("Enter The Number Of Hours Worked by The Employee"));
        if (hoursWorked < 0){
            hoursWorked = 0;
//            this.hoursWorked = hoursWorked;
        }
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

//    public void calculateWeeklySalary() {
//        int salary = getHourlyRate() * getHoursWorked();
//    }

    public double getWeeklySalary() {
        double salary = getHourlyRate() * getHoursWorked();
        if (hoursWorked > 40){
            salary = ( 40 * getHourlyRate()) + (((getHoursWorked() - 40) * 1.5) * getHourlyRate());
        }
        return salary;
    }
}
