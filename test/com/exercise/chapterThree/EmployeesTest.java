package com.exercise.chapterThree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeesTest {
    Employees employees;
    @BeforeEach
    void setUp() {
        System.out.println("starting testing here .........");
        employees = new Employees("", "", 0);
    }

    @AfterEach
    void tearDown() {
        employees = null;
        System.out.println("........ test ends here");
    }
    @Test
    void testToSetEmployeesFirstName(){
        employees.setEmployeesFirstName("Agent");
        assertEquals("Agent", employees.getEmployeesFirstName());
        System.out.println(employees.getEmployeesFirstName());
    }
    @Test
    void testToSetEmployeesLastName(){
        employees.setEmployeesLastName("Fash");
        assertEquals("Fash", employees.getEmployeesLastName());
        System.out.println(employees.getEmployeesLastName());
    }
    @Test
    void testToSetEmployeesMonthSalary(){
        employees.setMonthlySalary(1000000);
        assertEquals(1000000, employees.getMonthlySalary());
        System.out.println(employees.getMonthlySalary());
    }
    @Test
    void testIfMonthlySalaryCannotAcceptNegativeInput(){
        employees.setMonthlySalary(-1000);
        assertEquals(0, employees.getMonthlySalary());
    }
    @Test
    void testToCalculateEmployeesYearlySalary(){
        employees.setMonthlySalary(1000000);
        employees.yearlySalary();
        assertEquals(12000000, employees.yearlySalary());
    }
    @Test
    void testCalculateEmployeesIncrement(){
        employees.setMonthlySalary(1000000);
        employees.yearlySalary();
        assertEquals(13200000, employees.yearlyIncrease());
    }
    @Test
    void testIfMonthlySalaryCannotAcceptNegativeInputAndPerformCalculationsIfNegativeInputIsInserted(){
        employees.setMonthlySalary(-1000);
        assertEquals(0, employees.yearlySalary());

        employees.setMonthlySalary(-1000);
        assertEquals(0, employees.yearlyIncrease());
    }
}