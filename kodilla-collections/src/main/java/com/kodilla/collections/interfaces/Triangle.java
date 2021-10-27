package com.kodilla.collections.interfaces;

public class Triangle implements Shape{
    private double width;
    private double height;
    private double hypotenuse;

    public Triangle(double width,double height, double hypotenuse){
        this.height = height;
        this.width = width;
        this.hypotenuse = hypotenuse;
    }
    @Override
    public double getArea() {
        return width*height/2;
    }

    @Override
    public double getPerimeter() {
        return height+width+hypotenuse;
    }
}
