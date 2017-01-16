package com.robert.lukasik;

/**
 * Created by Robert Łukasik on 16.01.2017.
 */
public abstract class Tool {
    private String toolName;

    public void Use(){
        System.out.println("Use a " + getToolName());
    }

    abstract String getToolName();

}
