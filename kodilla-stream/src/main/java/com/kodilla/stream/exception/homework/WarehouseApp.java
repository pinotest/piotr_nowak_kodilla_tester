package com.kodilla.stream.exception.homework;

import java.util.NoSuchElementException;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse.addOrder(new Order("1"));
        Warehouse.addOrder(new Order("2"));
        Warehouse.addOrder(new Order("3"));
        Warehouse.addOrder(new Order("4"));
        Warehouse.addOrder(new Order("5"));
        try {
            System.out.println("Requested order number: " +Warehouse.getOrder("2").getNumber());
            System.out.println("Requested order number: " +Warehouse.getOrder("20").getNumber());
      } catch (OrderDoesntExistException e) {
            System.out.println("No such order in the warehouse" );
    }
}}
