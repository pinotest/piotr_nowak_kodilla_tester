package com.kodilla.spring.basic.dependency_injection.homework;

public class FacebookNotificationService implements NotificationService{

    @Override
    public void success(String address) {
        System.out.println("Package delivered to: " + address+" Facebook notification");

    }

    @Override
    public void fail(String address) {
        System.out.println("Package not delivered to: " + address+" Facebook notification");
    }
}
