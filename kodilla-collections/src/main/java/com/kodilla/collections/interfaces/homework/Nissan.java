package com.kodilla.collections.interfaces.homework;

public class Nissan implements Car{
    private int speed;
    public Nissan (){
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
    public void decreaseSpeed() {
        speed -= 40;
    }
}
