package com.robert.lukasik;

/**
 * Created by Robert Łukasik on 16.01.2017.
 */
public class Feeder extends Worker {
    public Feeder(String name, double salary, boolean isWorking){
        super(name, salary, isWorking);
        Tool = new Bucket();
    }

    @Override
    public void Work() {
        System.out.print("Feeder: ");
        Tool.Use();
    }
}
