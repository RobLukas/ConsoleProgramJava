package com.robert.lukasik;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee[] workers = new Worker[5];
        workers[0] =  new Worker("Pan B", 1000, false);
        workers[1] = new Worker("Pan R", 1000, false);
        workers[2] = new Worker("Pan A", 1000, false);
        workers[3] = new Worker("Pan C", 1000, false);
        workers[4] = new Worker("Pan Z", 1000, false);
        Employee manager1 = new Manager("Pan Manager", 5000, true);
        Worker worker1 = new Worker();

        for (Employee e : workers) {
            e.getDescription();
        }

        manager1.getDescription();
        worker1.getDescription();
    }
}
