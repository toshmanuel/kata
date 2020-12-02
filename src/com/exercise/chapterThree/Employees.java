package com.exercise.chapterThree;

import java.util.Scanner;

public class Employees {

    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employees(String firstName, String lastName, double monthlySalary){
        this.monthlySalary = monthlySalary;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public void setEmployeesFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmployeesFirstName() {
        return firstName;
    }

    public String getEmployeesLastName() {
        return lastName;
    }

    public void setEmployeesLastName(String lastName){
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary >= 0) {
            this.monthlySalary = monthlySalary;
        }else {
            System.out.println("invalid input");
        }
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double yearlySalary() {
        return 12 * monthlySalary;
    }
    public double yearlyIncrease(){
        double yearlySalary = 12 * monthlySalary;
        double increase = yearlySalary * 10/100;
        return increase + yearlySalary;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employees employees = new Employees("", "", 0);
        System.out.println("Enter Employees first name: ");
        employees.setEmployeesFirstName(input.nextLine());
        System.out.println("Enter Employee's last name: ");
        employees.setEmployeesLastName(input.nextLine());
        System.out.println("Enter Employee's monthly salary: ");
        employees.setMonthlySalary(input.nextDouble());

        Employees employees1 = new Employees("", "", 0);
        System.out.println("Enter Employees1 first name: ");
        employees1.setEmployeesFirstName(input.nextLine());
        System.out.println("Enter Employees1 last name: ");
        employees1.setEmployeesLastName(input.nextLine());
        System.out.println("Enter Employees1 monthly salary: ");
        employees1.setMonthlySalary(input.nextDouble());

        System.out.printf("Name is: %s %s%n", employees.getEmployeesFirstName(),employees.getEmployeesLastName());
        System.out.printf("Monthly salary is: %f%n", employees.getMonthlySalary());
        System.out.printf("yearly salary is: %f%n",employees.yearlySalary());
        System.out.printf("salary after first year is: %f%n%n%n", employees.yearlyIncrease());

        System.out.printf("Name is: %s %s%n", employees1.getEmployeesFirstName(),employees1.getEmployeesLastName());
        System.out.printf("Monthly salary is: %f%n", employees1.getMonthlySalary());
        System.out.printf("yearly salary is: %f%n",employees1.yearlySalary());
        System.out.printf("salary after first year is: %f%n", employees1.yearlyIncrease());
    }
}