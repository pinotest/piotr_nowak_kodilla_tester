package com.kodilla.jacoco;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class YearTest {

    @ParameterizedTest
    @ValueSource(ints = {1600, 2000, 1976})
     void shouldBeLeapYearIfDivisible(int givenYear) {

        //given
        Year year = new Year(givenYear);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }

    @Test
     void shouldNotBeLeapYearIfDivisibleBy4() {

        //given
        Year year = new Year(1605);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertFalse(isLeapYear);
    }

    @Test
     void shouldNotBeLeapYearIfDivisibleBy400() {

        //given
        Year year = new Year(2100);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertFalse(isLeapYear);
    }

}