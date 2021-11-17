package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GamblingMachineTest {
    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidUserNumbers.csv")
    public void shouldReturnInvalidNumbersException(String num)  {
        Set<Integer> setOfInteger = convertToSetInteger(num);
      assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(setOfInteger));
    }
    @ParameterizedTest
    @NullSource
    public void shouldReturnNullPointerExceptionBecauseOfNull(Set<Integer> num)  {
        //Set<Integer> setOfInteger = convertToSetInteger(num);
        assertThrows(NullPointerException.class, () -> gamblingMachine.howManyWins(num));
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnInvalidNumbersExceptionBecauseOfEmpty(Set<Integer> num)  {
        //Set<Integer> setOfInteger = convertToSetInteger(num);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(num));
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/validUserNumber.csv")
    public void shouldReturnOK(String num) throws InvalidNumbersException {
        Set<Integer> setOfInteger = convertToSetInteger(num);
        int result = gamblingMachine.howManyWins(setOfInteger);
        if (result==6){
            System.out.println("Respect!!!! You have: "+result);
        }
        else {
            System.out.println("Result: " + result);
        }
        assertTrue( 0 <= result && result <= 6 );

    }
    private Set<Integer> convertToSetInteger(String num){
        // split the string by comma
        String[] strParts = num.split(",");
        // convert array to the List using asList method
        List<String> listParts = Arrays.asList(strParts);
        // create HashSet from the List using constructor
        HashSet<String> hsetFromString = new HashSet<String>( listParts );
        // Convert Set of String to set of Integer
        Set<Integer> setOfInteger = hsetFromString.stream()
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toSet());
        return setOfInteger;
    }
}