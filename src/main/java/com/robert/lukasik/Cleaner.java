package com.robert.lukasik;

/**
 * Created by Robert Łukasik on 16.01.2017.
 */
public class Cleaner extends Worker {
    private Tool Tool;

    public Cleaner() throws InterruptedException{
        Tool = new Broom();
    }

    public Cleaner(String name, double salary, boolean isWorking) throws InterruptedException {
        super(name, salary, isWorking);
        Tool = new Broom();
    }

    @Override
    public void work(Animal animal) {
        if (getIsWorking()) {
            System.out.print("Cleaner " + getName() + ": ");
            Tool.Use();
            clean(animal);
            System.out.println();
        }
        else {
            System.out.println("Manager must set isWorking the true so that I could work!");
            System.out.println();
        }
    }

    public void clean(Animal animal) {
        if (!animal.getClear()) {
            animal.setClear(true);
            System.out.println("And I cleaned the place for the animal number " + animal.getNumber() + " !");
            System.out.println();
        } else {
            System.out.println("Animal number " + animal.getNumber() + " has clean place!");
            System.out.println();
        }
    }
}
