package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    String add(double a, double b){
        double result = a+b;
        return display.display(result);
    }
    String subtract(double a, double b){
        double result = a-b;
        return display.display(result);
    }
    String multiply(double a, double b) {
        double result = a*b;
        return display.display(result);
    }

    String divide(double a, double b) {
        if (b!=0){
           double result = a/b;
           return display.display(result);
        }
        return  ("sorry, you can't divide by zero");
    }
}
