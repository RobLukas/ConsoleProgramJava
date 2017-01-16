package com.robert.lukasik;

/**
 * Created by Robert Łukasik on 16.01.2017.
 */
public interface ISupervisor {
    void raiseSalary(Employee worker, double raise);
    void giveJob(Employee worker);
}
