package com.kodilla.spring.basic.dependency_injection.homework;

public class FedexDelivery implements DeliveryService{
    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 50) {
            System.out.println("Package too heavy for Fedex");
            return false;
        }
        System.out.println("Delivering in progress from Fedex...");
        return true;
    }
}
