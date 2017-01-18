package com.robert.lukasik;

/**
 * Created by Robert Łukasik on 15.01.2017.
 */
public abstract class Employee {
    private String name;
    private double salary;
    private boolean isWorking;

    public Employee() throws InterruptedException {
        name = "Default";
        salary = 0.0;
        isWorking = false;
    }

    public Employee(String firstName, double salary, boolean isWorking) throws InterruptedException {
        this.name = firstName;
        this.salary = salary;
        this.isWorking = isWorking;
    }

    public abstract void getDescription();

    public double getSalary() {
        return salary;
    }

    public boolean getIsWorking() {
        return isWorking;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setWorking(boolean working) {
        this.isWorking = working;
    }

    public void setName(String name) {
        this.name = name;
    }
}