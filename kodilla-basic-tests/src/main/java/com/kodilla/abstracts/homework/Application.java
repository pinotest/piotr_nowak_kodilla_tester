package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10,5,6,3);
        System.out.println("Triangle area: "+triangle.getArea());
        System.out.println("Triangle perimeter: "+triangle.getPerimeter());

        Circle circle = new Circle(5);
        System.out.println("Circle area: "+circle.getArea());
        System.out.println("Circle perimeter: "+circle.getPerimeter());

        Rectangle rectangle = new Rectangle(10,20);
        System.out.println("Rectangle area: "+rectangle.getArea());
        System.out.println("Rectangle perimeter: "+rectangle.getPerimeter());
    }
}
