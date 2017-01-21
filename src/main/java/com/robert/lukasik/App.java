package com.robert.lukasik;

import java.util.*;

public class App
{
    public static void main( String[] args ) {
        Set<Worker> workersSet = new HashSet<Worker>();
        Set<Animal> animalSet = new HashSet<Animal>();
        Map<String, Double> workerMap = new HashMap<String, Double>();
        Map<Employee, Integer> EmployeeMap = new HashMap<Employee, Integer>();

        Manager manager1 = null;
        Worker[] workers = new Worker[2];
        Animal[] animals = new Animal[5];
        try {
            manager1 = new Manager("Mr Manager", 5000);
            workers[0] = new Feeder("Mr Feeder", 1000, false);
            workers[1] = new Cleaner("Mr Cleaner", 1000, false);
        }catch (InterruptedException e) {
            e.getStackTrace();
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
            for (int i = 0; i< 2; i ++){
                EmployeeMap.put(manager1, 1);
                EmployeeMap.put(workers[i], (i+1));
            }
        }catch (Exception e){
            e.getStackTrace();
        }

        System.out.println("You are Manager");
        System.out.println("You have " + workersSet.size() + " workers and " + animalSet.size() + " animals");

        for (Worker w : workers) {
            manager1.giveJob(w);
            System.out.println();
        }

        for (Map.Entry<Employee, Integer> entry: EmployeeMap.entrySet()) {
            System.out.println();
            System.out.println("Number: " + entry.getValue() + " " + entry.getKey());
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
            e.getStackTrace();
        }

        System.out.println("Great job! Manager gave them raise!");

        for (Worker w : workers) {
            manager1.raiseSalary(w, 100);
            workerMap.put(w.getName(), w.getSalary());
            System.out.println(w.getName());
            System.out.println("New salary: " + workerMap.get(w.getName()));
        }
    }
}
