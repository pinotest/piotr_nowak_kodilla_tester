package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{
    private int speed;
    public Ford(){
        this.speed = 0;
    }
    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 50;
    }
    public void increaseSpeed(int a) {
        speed += a;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 45;
    }
}
