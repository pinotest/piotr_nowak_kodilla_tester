package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {
    Shop shop = new Shop();
    Order order1 = new Order(200.00, LocalDate.parse("2021-10-01"), "zuza");
    Order order2 = new Order(5032.11, LocalDate.parse("2021-09-01"), "Benabba");
    Order order3 = new Order(40.5, LocalDate.parse("2021-11-01"), "Yoki");
    Order order4 = new Order(420.5, LocalDate.parse("2020-10-01"), "orej");
    Order order5 = new Order(111.5, LocalDate.parse("2021-01-11"), "aabbaa");

    @Test
    public void shouldAddOrderToShop() {
        //Given
        //When
        int numberOfOrders = shop.getSize();
        //Then
        assertEquals(5, numberOfOrders);
    }
    @Test
    public void shouldReturnListOfOrderInGivenDateRange() {
        //Given
        //When
        List<Order> listOfOrders = shop.getOrderListInDataRange(LocalDate.parse("2021-10-01"), LocalDate.parse("2021-10-01"));
        //Then
        assertEquals(order1, listOfOrders.get(0));
    }
    @ParameterizedTest
    //use some parametrized_tests with wrong/not existing orders date range
    public void shouldReturnEmptyListForOrderDataRange() {
        //Given
        //When
        List<Order> listOfOrders = shop.getOrderListInDataRange(LocalDate.parse("1990-10-01"), LocalDate.parse("1990-10-01"));
        //Then
        assertTrue(listOfOrders.isEmpty());
    }
    @Test
    public void shouldReturnListOfOrderInGivenOrderValuesRange() {
        //Given
        //When
        List<Order> listOfOrders = shop.getOrderListInValueRange(200, 200);
        //Then
        assertEquals(order1, listOfOrders.get(0));
    }
    @Test
    public void shouldReturnEmptyListForOrderValueRange() {
        //Given
        //When
        List<Order> listOfOrders = shop.getOrderListInValueRange(1, 10);
        //Then
        assertTrue(listOfOrders.isEmpty());
    }
    @Test
    public void shouldReturnOverallValueOfOrders() {
        //Given
        //When
        //Then
        assertEquals(120,shop.getOverallOrdersValue());
    }

    @BeforeEach
    public void addOrderstoShop(){
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
    }
}