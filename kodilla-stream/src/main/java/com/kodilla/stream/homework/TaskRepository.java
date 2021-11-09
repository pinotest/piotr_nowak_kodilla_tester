package com.kodilla.stream.homework;

import com.kodilla.stream.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks(){
        List<Task> users = new ArrayList<>();
        users.add(new Task("Clean code", LocalDate.of(2019, 11, 20), LocalDate.of(2021, 11, 20) ));
        users.add(new Task("Clean room", LocalDate.of(2021, 11, 9), LocalDate.of(2021, 11, 10) ));
        users.add(new Task("Walk with dog", LocalDate.of(2021, 11, 1), LocalDate.of(2021, 11, 1) ));
        users.add(new Task("Get certificate", LocalDate.of(2019, 11, 20), LocalDate.of(2021, 11, 8) ));
        return users;
    }

}
