package com.robert.lukasik;

public class App
{
    public static void main( String[] args )
    {
        Manager manager1 = new Manager("Mr Manager", 5000, true);
        Worker[] workers = new Worker[5];
        workers[0] =  new Feeder("Mr Feeder", 1000, true);
        workers[1] = new Feeder("Mr Feeder", 1000, false);
        workers[2] = new Feeder("Mr Feeder", 1000, true);
        workers[3] = new Cleaner("Mr Cleaner", 1000, false);
        workers[4] = new Cleaner();

        manager1.giveJob(workers[3]);
        manager1.raiseSalary(workers[2], 100);

        Animal animal1 = new Animal();
        animal1.getDescription();

        Animal animal2 = new Animal();
        animal2.getDescription();


        for (Employee e : workers) {
            e.getDescription();
        }
        manager1.getDescription();

        workers[1].work(animal1);
        workers[3].work(animal2);
    }
}
