package com.kodilla.inheritance.homework;

public class Unix extends OperatingSystem{
    public Unix(int releaseDate) {
        super(releaseDate);

    }
    @Override
    public void turnOn(){
        System.out.println("System Unix is always turned ON");
    }
    @Override
    public void turnOff(){
        System.out.println("System Unix cannot be turned OFF");
    }

}
