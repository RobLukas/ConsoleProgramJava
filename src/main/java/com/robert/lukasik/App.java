package com.robert.lukasik;

public class App
{
    public static void main( String[] args )
    {
        Employee[] workers = new Worker[5];
        workers[0] =  new Feeder("Mr Feeder", 1000, false);
        workers[1] = new Feeder("Mr Feeder", 1000, false);
        workers[2] = new Feeder("Mr Feeder", 1000, false);
        workers[3] = new Cleaner("Mr Cleaner", 1000, false);
        workers[4] = new Cleaner();
        Manager manager1 = new Manager("Mr Manager", 5000, true);

        manager1.giveJob(workers[1]);
        manager1.raiseSalary(workers[2], 100);

        for (Employee e : workers) {
            e.getDescription();
        }
        manager1.getDescription();
    }
}
