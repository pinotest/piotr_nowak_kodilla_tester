package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class ShippingCenterTest {

    @Test
    void sendPackageShouldNotBeDelivered() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Warsaw, ul. Polna 7", 30.1);
        assertEquals("Package not delivered to: Warsaw, ul. Polna 7", message);
    }
    @Test
    void sendPackageShouldBeDelivered() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Warsaw, ul. Polna 7", 1.1);
        assertEquals("Package delivered to: Warsaw, ul. Polna 7", message);
    }
}