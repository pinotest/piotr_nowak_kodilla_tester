package com.kodilla.stream.homework;

import com.kodilla.stream.UsersManager;
import com.kodilla.stream.UsersRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
      //  przy pomocy Stream oraz operacji filtrowania i transformacji utworzona zostanie lista
        LocalDate currentDate = LocalDate.now();
        List<LocalDate> localDateList = TaskRepository.getTasks()
                .stream()
                .filter(d -> d.getDeadline().isAfter(currentDate))
                .map(dd -> dd.getDeadline())
                .collect(Collectors.toList());
        System.out.println(currentDate);
        System.out.println(localDateList);

    }
}
