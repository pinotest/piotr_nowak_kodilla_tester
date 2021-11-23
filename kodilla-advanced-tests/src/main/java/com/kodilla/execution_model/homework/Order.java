package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {
    private Double orderValue;
    private LocalDate orderDate;
    private String orderLogin;

    public Order(Double orderValue, LocalDate orderDate, String orderLogin) {
        this.orderDate = orderDate;
        this.orderLogin = orderLogin;
        this.orderValue = orderValue;
    }

    public Double getOrderValue() {
        return orderValue;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getOrderLogin() {
        return orderLogin;
    }
}