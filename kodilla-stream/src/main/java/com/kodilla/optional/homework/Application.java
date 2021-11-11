package com.kodilla.optional.homework;

import com.kodilla.stream.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add( new Student("Jacob Novac", new Teacher("Stephen King")));
        students.add( new Student("Ben Kowalski", new Teacher("Stephen King")));
        students.add( new Student("Tommy Jacobsen", null));
        students.add( new Student("Adel Ada", null));
        students.add( new Student("Max King", new Teacher("Stephen Queen")));

        for (Student student: students
             ) {

            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String teacher = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
            System.out.println("uczeń: " + student.getName() + " nauczyciel: " + teacher);
        }
    }
}
