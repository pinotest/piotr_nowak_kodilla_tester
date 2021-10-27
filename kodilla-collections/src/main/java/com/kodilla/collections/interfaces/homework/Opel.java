package com.kodilla.collections.interfaces.homework;

public class Opel implements Car{
    private int speed;
    public Opel(){
        this.speed = 0;
    }
    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 60;
    }

    @Override
    public void increaseSpeed(int a) {
        speed =+ a;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 50;
    }
}
