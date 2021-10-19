package com.kodilla.inheritance.homework;

public class Application {
    public static void main (String[] args){
        OperatingSystem operatingSystem = new OperatingSystem(2000);
        operatingSystem.turnOn();
        operatingSystem.turnOff();
        Unix unix = new Unix(1969);
        unix.turnOff();
        unix.turnOn();
        Windows windows = new Windows(1985);
        windows.turnOff();
        windows.turnOn();
    }
}
