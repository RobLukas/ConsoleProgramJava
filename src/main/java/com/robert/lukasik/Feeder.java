package com.robert.lukasik;

/**
 * Created by Robert Łukasik on 16.01.2017.
 */
public class Feeder extends Worker {
    public Feeder(String name, double salary, boolean isWorking) throws InterruptedException {
        super(name, salary, isWorking);
        Tool = new Bucket();
    }

    @Override
    public void work(Animal animal) {
        if (getIsWorking()) {
            System.out.print("Feeder " + getName() + ": ");
            Tool.Use();
            feed(animal);
        }
        else {
            System.out.println("Manager must set isWorking the true so that I could work!");
            System.out.println();
        }
    }
    public void feed(Animal animal){
        if (!animal.getHungry()) {
            animal.setHungry(true);
            System.out.println("And I fed animal number " + animal.getNumber());
            System.out.println();
        }
        else {
            System.out.println("Animal number " + animal.getNumber() + " isn't hungry!");
            System.out.println();
        }
    }
}
