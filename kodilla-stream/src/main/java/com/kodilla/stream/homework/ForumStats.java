package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgPostAbove40 = UsersRepository.getUsersList()
                .stream()
                .filter(i -> (i.getAge() >= 40))
                .map(u -> u.getNumberOfPost())
                .mapToDouble(n -> n)
                .average().getAsDouble();
        System.out.println("Average number of post for user equals or above 40: " +avgPostAbove40);
        double avgPostBelow40 = UsersRepository.getUsersList()
                .stream()
                .filter(i -> (i.getAge() < 40))
                .map(u -> u.getNumberOfPost())
                .mapToDouble(n -> n)
                .average().getAsDouble();
        System.out.println("Average number of post for user  below 40: " +avgPostBelow40);

    }
}
