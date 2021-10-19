package com.kodilla.inheritance.homework;

import java.sql.SQLOutput;

public class OperatingSystem {
    private int releaseDate;
    public OperatingSystem(int releaseDate){
        this.releaseDate = releaseDate;
    }
    public void turnOn(){
        System.out.println("System turned ON from OperatingSystem class");
    }
    public void turnOff(){
        System.out.println("System turned OFF  from OperatingSystem class");
    }

}
