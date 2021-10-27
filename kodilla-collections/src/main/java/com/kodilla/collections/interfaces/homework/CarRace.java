package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford();
        Nissan nissan = new Nissan();
        Opel opel = new Opel();
        doRace(ford);
        doRace(nissan);
        doRace(opel);

    }
    public static void doRace(Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println( car.toString()+": "+  car.getSpeed());

    }
}
