package com.robert.lukasik;

/**
 * Created by Robert Łukasik on 15.01.2017.
 */
public class Employee {
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

    public void getDescription(){
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Is working: " + getIsWorking());
    }

    @Override
    public String toString() {
        return "Name: " + name + " " + "Salary: " + salary + " " + "IsWorking: " + isWorking;
    }

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