package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem{

    public Windows(int releaseDate) {
        super(releaseDate);
    }

    @Override
    public void turnOff(){
        System.out.println("System Windows need to be restarted");
    }
    @Override
    public void turnOn(){
        System.out.println("System Windows need to be recovered before will be turned ON");
    }
}
