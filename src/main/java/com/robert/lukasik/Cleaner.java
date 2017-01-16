package com.robert.lukasik;

/**
 * Created by Robert Łukasik on 16.01.2017.
 */
public class Cleaner extends Worker {
    private Tool Tool;

    public Cleaner(){
        Tool = new Broom();
    }

    public Cleaner(String name, double salary, boolean isWorking){
        super(name, salary, isWorking);
        Tool = new Broom();
    }

    @Override
    public void Work() {
        System.out.print("Cleaner: ");
        Tool.Use();
    }
}
