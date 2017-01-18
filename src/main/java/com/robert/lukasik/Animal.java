package com.robert.lukasik;

/**
 * Created by Robert Łukasik on 17.01.2017.
 */
public class Animal {
    private static int nextNumber = 1;
    private int number;
    private String name;
    private boolean clear;
    private boolean hungry;

    {
        number = nextNumber;
        nextNumber++;
    }

    public Animal() throws InterruptedException {
        number = getNumber();
        this.name = "animal";
        this.clear = false;
        this.hungry = false;
    }
    public Animal(String name, boolean clear, boolean hungry) throws InterruptedException{
        number = getNumber();
        this.name = name;
        this.clear = clear;
        this.hungry = hungry;
    }

    public void getDescription(){
        System.out.println("Name of the animal: " + name + number);
        //System.out.println("Number of the animal: " + number);
        System.out.println("Animal has a clean place: " + clear);
        System.out.println("Animal is hungry: " + hungry);
        System.out.println();
    }

    public int getNumber(){
        return number;
    }

    public boolean getClear(){
        return clear;
    }
    public void setClear(boolean clear){
        this.clear = clear;
    }
    public boolean getHungry(){
        return hungry;
    }
    public void setHungry(boolean hungry){
        this.hungry = hungry;
    }
}
