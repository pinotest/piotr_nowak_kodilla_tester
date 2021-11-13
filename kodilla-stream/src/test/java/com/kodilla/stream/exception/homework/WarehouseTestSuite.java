package com.kodilla.stream.exception.homework;

import com.kodilla.stream.exception.AirportNotFoundException;
import com.kodilla.stream.exception.AirportRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void testGetOrder_withException() {
        // given
        Warehouse.addOrder(new Order("1"));
        // when
        // then
        assertThrows(OrderDoesntExistException.class, () -> Warehouse.getOrder("2"));
    }


}