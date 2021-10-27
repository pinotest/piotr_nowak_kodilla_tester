package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.arrays.ShapeUtils;
import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Nissan;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        System.out.println(cars.length);
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for ( Car car : cars)
            CarUtils.describeCar(car);

    }
    public static Car drawCar() {
        Random random = new Random();
        int drawCar = random.nextInt(3);
        int a = random.nextInt(100) + 1;
        if (drawCar == 0) {
            Car car = new Ford();
            car.increaseSpeed (a);
            return car;
        } else if (drawCar == 1){
            Car car = new Opel();
            car.increaseSpeed (a);
            return car;
        }
        else{
            Car car = new Nissan();
            car.increaseSpeed (a);
            return car;
        }

    }
}
