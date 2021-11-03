package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {

        Map< Principal, School> schoolDirectory = new HashMap<>(); //stwórz mapę przyporządkowującą szkoły do dyrektorów.
        School school1 = new School(10,23,26,31,45);
        School school2 = new School(23,26,31,45);
        School school3 = new School(34,10,23,26,31,45);

        Principal principal1 = new Principal("John", "Smith");
        Principal principal2 = new Principal("Tom", "Handy");
        Principal principal3 = new Principal("Anna", "Johnson");

        schoolDirectory.put(principal1, school1);
        schoolDirectory.put(principal2, school2);
        schoolDirectory.put(principal3, school3);

        for (Map.Entry<Principal,School> principals : schoolDirectory.entrySet())
            System.out.println(principals.getKey().getFirstname() +" "+principals.getKey().getLastname() +", pupils in school: " +
                    principals.getValue().getOverallPupilsNumber());




    }
}
