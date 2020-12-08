package com.exercise.chapterFour.SalaryCalculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryCalcTest {
    SalaryCalc salaryCalc;
    @BeforeEach
    void setUp() {
        System.out.println("Test Starting >>>>>");
        salaryCalc = new SalaryCalc();
    }

    @AfterEach
    void tearDown() {
        salaryCalc = null;
        System.out.println("<<<<< test Ending here");
    }
    @Test
    void testToSetInputEmployeesFirstName(){
        salaryCalc.setEmployeesFirstName("Tonny");
        assertEquals("Tonny", salaryCalc.getEmployeesFirstName());
    }
    @Test
    void testToSetInputEmployeesLastName() {
        salaryCalc.setEmployeesLastName("Frog");
        assertEquals("Frog", salaryCalc.getEmployeesLastName());
    }
    @Test
    void testToSetHourlyRate(){
        salaryCalc.setHourlyRate();
        assertEquals(12, salaryCalc.getHourlyRate());
    }
    @Test
    void testToCheckIfWeeklyRateCannotBeSetToNegativeValue(){
        salaryCalc.setHourlyRate();
        assertEquals(0, salaryCalc.getHourlyRate());
    }
    @Test
    void testToCheckTheHoursWorkedByEachEmployees(){
        salaryCalc.setHoursWorked();
        assertEquals(20, salaryCalc.getHoursWorked());
    }
    @Test
    void testToCheckIfHoursWorkedCannotBeANegativeValue(){
        salaryCalc.setHoursWorked();
        assertEquals(0, salaryCalc.getHoursWorked());
    }
    @Test
    void testToCalculateTheWeeklySalary(){
        salaryCalc.setHourlyRate();
        salaryCalc.setHoursWorked();
//        salaryCalc.calculateWeeklySalary();
        assertEquals(760, salaryCalc.getWeeklySalary());
    }
    @Test
    void testToCalculateTheWeeklySalaryAndExtraHoursWorked(){
        salaryCalc.setHourlyRate();
        salaryCalc.setHoursWorked();
//        salaryCalc.calculateWeeklySalary();
        assertEquals(1375, salaryCalc.getWeeklySalary());
    }

//    (Salary Calculator) Develop a Java application that determines the gross pay for each of
//    three employees. The company pays straight time for the first 40 hours worked by each employee
//    and time and a half for all hours worked in excess of 40. You’re given a list of the employees, their
//    number of hours worked last week and their hourly rates. Your program should input this information for each employee,
//    then determine and display the employee’s gross pay. Use class Scanner to input the data.
}