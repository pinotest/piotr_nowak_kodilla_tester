package com.kodilla.spring.basic.dependency_injection.homework;

public class EmailNotificationService implements NotificationService{
    @Override
    public void success(String address) {
        System.out.println("Package delivered to: " + address+" Email notification");

    }

    @Override
    public void fail(String address) {
        System.out.println("Package not delivered to: " + address+" Email notification");
    }
}
