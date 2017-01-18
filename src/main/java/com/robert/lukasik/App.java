package com.robert.lukasik;

import java.util.*;

public class App
{
    public static void main( String[] args ) {
        Set<Worker> workersSet = new HashSet<Worker>();
        Set<Animal> animalSet = new HashSet<Animal>();
        Map<Worker, Animal> workerAnimalMap = new HashMap<Worker, Animal>();

        Manager manager1 = null;
        Worker[] workers = new Worker[2];
        Animal[] animals = new Animal[5];
        try {
            manager1 = new Manager("Mr Manager", 5000, true);
            workers[0] = new Feeder("Mr Feeder", 1000, false);
            workers[1] = new Cleaner("Mr Cleaner", 1000, false);
        }catch (InterruptedException e) {
            System.out.println("Got interrupted...");
        }

        try{
            for (int i = 0; i<5; i++){
                animals[i] = new Animal();
            }
            for (Worker w : workers) {
                workersSet.add(w);
            }
            for (Animal a : animals) {
                animalSet.add(a);
            }
        }catch (Exception e){
            System.err.println("IndexOutOfBoundsException");
            e.printStackTrace(System.out);
        }

        System.out.println("We have " + workersSet.size() + " workers");
        System.out.println("We have " + animalSet.size() + " animals");

        for (Worker w : workers) {
            manager1.giveJob(w);
            System.out.println("Manager gave workers job!");
            System.out.println();
            w.getDescription();
        }
        System.out.println("___________________________");
        System.out.println("My animals");
        for (Animal a : animals) {
            a.getDescription();
        }
        System.out.println("___________________________");
        System.out.println("Now, We are going to work!");
        System.out.println();
        try{
            for (Worker w : workers) {
                for (Animal a: animals) {
                    w.work(a);
                    a.getDescription();
                }
            }
        }catch (Exception e){
            System.err.println("IndexOutOfBoundsException");
            e.printStackTrace(System.out);
        }


        System.out.println("Great job! Manager gave them raise!");
        for (Worker w : workers) {
            manager1.raiseSalary(w, 100);
            System.out.println(w.getName());
            System.out.println("New salary: " + w.getSalary());
        }

        workerAnimalMap.put(workers[0], animals[1]);
        System.out.println(workerAnimalMap.get(workers[0].getName()));
    }
}
