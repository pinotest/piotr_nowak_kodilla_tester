package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        DeliveryService deliveryService = new InpostDelivery();
        NotificationService notificationService = new FacebookNotificationService();
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);
        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
        System.out.println("============================================");

        DeliveryService deliveryService1 = new FedexDelivery();
        NotificationService notificationService1 = new EmailNotificationService();
        ShippingCenter shippingCenter1 = new ShippingCenter(deliveryService1, notificationService1);
        shippingCenter1.sendPackage("Central Park 11, New York", 30.2);
    }
}
