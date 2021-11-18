package com.kodilla.execution_model.homework;

import com.kodilla.execution_model.Item;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Order> orders = new ArrayList<>();
    // będzie przechowywać kolekcję unikalnych zamówień.
    public void addOrder(Order order) {
        this.orders.add(order);
    }
    public List<Order> getOrderListInDataRange(LocalDate dateFrom, LocalDate dateTo){
        return orders;
    }
    public int getSize() {
        return this.orders.size();
    }
    public double getOverallOrdersValue(){
        double sum = 0.0;
        return sum;
    }
    public List<Order> getOrderListInValueRange(double minRange, double maxRange){
        return orders;
    }
    /*
    Nowo utworzona klasa powinna mieć następujące funkcjonalności:

dodanie nowego zamówienia,
zwrócenie listy zamówień z zakresu dwóch dat, List<Order> getOrderListInDataRange(dateFrom, dateTo)
pobranie zamówień na podstawie przekazanego zakresu (najmniejsza i największa wartość zamówienia),
zwrócenie liczby zamówień, //getSize()
zsumowanie wartości wszystkich zamówień.
     */
}
