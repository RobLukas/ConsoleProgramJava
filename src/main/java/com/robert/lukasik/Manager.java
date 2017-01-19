package com.robert.lukasik;

/**
 * Created by Robert Łukasik on 15.01.2017.
 */
public class Manager extends Employee implements ISupervisor {

    public Manager() throws InterruptedException {
        if (getIsWorking() == false);{
            setWorking(true);
        }
    }

    public Manager(String name, double salary, boolean isWorking) throws InterruptedException {
        super(name, salary, isWorking);
    }

    public void raiseSalary(Employee worker, double raise){
        double r;
        r = worker.getSalary();
        r += raise;
        worker.setSalary(r);
    }

    public void giveJob(Employee worker) {
        worker.setWorking(true);
    }

    @Override
    public void getDescription() {
        System.out.println("Manager");
        super.getDescription();
        System.out.println();
    }
}
