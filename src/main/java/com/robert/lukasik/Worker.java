package com.robert.lukasik;

/**
 * Created by Robert Łukasik on 15.01.2017.
 */
public abstract class Worker extends Employee implements IToolUser {
    private static int nextId = 1;
    private int id;
    protected Tool Tool;

    {
     id = nextId;
        nextId++;
    }

    public Worker() throws InterruptedException{
    }

    public Worker(String name, double salary, boolean isWorking) throws InterruptedException{
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
    public abstract void work(Animal animal);
}
