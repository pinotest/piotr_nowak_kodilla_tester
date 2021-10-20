package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }
    @Override
    public double getArea() {
        return (this.sideA*this.sideB);
    }

    @Override
    public double getPerimeter() {
        return (2*this.sideA+2*this.sideB);
    }
}
