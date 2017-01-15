package com.robert.lukasik;

/**
 * Created by Robert Łukasik on 15.01.2017.
 */
public class Manager extends Employee {

    public Manager(String name, double salary, boolean isWorking){
        super(name, salary, isWorking);
    }

    @Override
    public void getDescription() {
        System.out.println("Manager");
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Is working: " + getIsWorking());
        System.out.println();
    }
}
