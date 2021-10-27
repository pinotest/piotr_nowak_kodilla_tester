package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Spring", 10, 10, false));
        stamps.add(new Stamp("Autumn", 20, 10, true));
        stamps.add(new Stamp("Winter", 10, 10, false));
        stamps.add(new Stamp("Summer", 10, 20, false));
        stamps.add(new Stamp("Spring", 10, 10, false));
        stamps.add(new Stamp("Spring", 10, 10, false));
        stamps.add(new Stamp("Spring", 10, 10, false));
        stamps.add(new Stamp("Spring", 10, 10, false));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);

    }
}
