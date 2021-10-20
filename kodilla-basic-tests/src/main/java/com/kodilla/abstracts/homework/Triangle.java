package com.kodilla.abstracts.homework;

public class Triangle extends Shape{
    private double height;
    private double baseA;
    private double baseB;
    private double baseC;
    public Triangle(double baseA, double baseB, double baseC, double height){
        this.baseA = baseA;
        this.baseB = baseB;
        this.baseC = baseC;
        this.height = height;
    }
    @Override
    public double getArea() {
        return (this.height * this.baseA * 0.5);
    }

    @Override
    public double getPerimeter () {
        return (this.baseA + this.baseB + this.baseC);
    }
}
