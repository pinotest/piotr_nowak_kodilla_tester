package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Nissan;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarUtils {
    public static void describeCar(Car car){
        if (car instanceof Ford)
            System.out.println("Ford" + " with speed: "+ car.getSpeed());
        else if (car instanceof Nissan )
            System.out.println("Nissan"+ " with speed: "+ car.getSpeed());
        else if (car instanceof Opel)
            System.out.println("Opel"+ " with speed: "+ car.getSpeed());
        else
            System.out.println("Unknown car name");
    }

}
