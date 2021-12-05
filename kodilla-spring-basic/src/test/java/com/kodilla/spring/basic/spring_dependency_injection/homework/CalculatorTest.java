package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        Calculator bean = context.getBean(Calculator.class);
        String message = bean.add(1,10);
        assertEquals("Value: 11.0", message);
    }

    @Test
    void subtract() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        Calculator bean = context.getBean(Calculator.class);
        String message = bean.subtract(10,10);
        assertEquals("Value: 0.0", message);
    }

    @Test
    void multiply() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        Calculator bean = context.getBean(Calculator.class);
        String message = bean.multiply(10,10);
        assertEquals("Value: 100.0", message);
    }

    @Test
    void divide() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        Calculator bean = context.getBean(Calculator.class);
        String message = bean.divide(10, 10);
        assertEquals("Value: 1.0", message);
    }
    @Test
    void divideShouldNotGiveValueWhenDivideByZero() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        Calculator bean = context.getBean(Calculator.class);
        String message = bean.divide(10, 0);
        assertEquals("sorry, you can't divide by zero", message);
    }

}