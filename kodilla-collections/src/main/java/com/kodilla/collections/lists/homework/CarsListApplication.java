package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Nissan;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Ford());
        cars.add(new Nissan());
        cars.add(new Opel());
        Car car1 = new Ford();
        cars.add(car1);

        for (Car car: cars){
            CarUtils.describeCar(car);
        }
        System.out.println("Collection size: "+cars.size());
        System.out.println("Remove some cars.");
        cars.remove(1);
        cars.remove(car1);
        for (Car car: cars){
            CarUtils.describeCar(car);
        }
        System.out.println("Collection size: "+cars.size());
    }
}
