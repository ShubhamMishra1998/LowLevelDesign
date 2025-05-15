package com.lld.solid.srp;

/**
 * This class violates SRP it has 2 reasons to change 1. calculateSalary() 2. saveToDB().
 * To fix this we should create 2 additional classes 1. SalaryCalculator 2. EmployeeRepository.
 */
public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int marks) {
        this.name = name;
        this.salary = marks;
    }

    public int calculateSalary() {
        return 1000*5000;
    }

    private void saveToDB() {
        System.out.println("save to DB");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
