package com.robert.lukasik;

/**
 * Created by Robert Łukasik on 15.01.2017.
 */
public class Worker extends Employee{

    private static int nextId = 1;
    private int id;

    {
     id = nextId;
        nextId++;
    }

    public Worker(){
    }

    public Worker(String name, double salary, boolean isWorking){
        super(name, salary, isWorking);
    }

    @Override
    public void getDescription() {
        System.out.println("Worker" + getId());
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Is working: " + getIsWorking());
        System.out.println("ID: " + getId());
        System.out.println();
    }

    public int getId(){
        return id;
    }
}
