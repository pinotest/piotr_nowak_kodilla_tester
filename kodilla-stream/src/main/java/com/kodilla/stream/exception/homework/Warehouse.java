package com.kodilla.stream.exception.homework;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {

    static List<Order> orderList = new ArrayList<>();

    public static void addOrder(Order order) {
        orderList.add(order);
    }


   public static Order getOrder(String number) throws OrderDoesntExistException {

       Order orderNumber = orderList
               .stream()
               .filter(o -> o.getNumber().equals(number))
               .findAny().get();
       return orderNumber;

   }
}
