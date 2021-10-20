package com.kodilla.abstracts.homework;

import static java.lang.Math.pow;

public class Circle extends Shape{
    private double radius;
    private static double PI = 3.1415927;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (PI*pow(radius,2));
    }

    @Override
    public double getPerimeter() {
        return (2*PI*radius);
    }
}
