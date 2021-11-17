package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {
    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings= {"Stephan","Pio", "Pi.", "Pi-", "Pi1","---","...","123","aaa","AAA","___"})
    public void shouldReturnTrueWithValidateUsername(String input){
        assertTrue(userValidator.validateUsername(input));
    }
    @ParameterizedTest
    @ValueSource(strings= {"St","P.", "P-", "P1","--","..","13","aa","AA","__"})
    public void shouldReturnFalseWithValidateUsername(String input){
        assertFalse(userValidator.validateUsername(input));
    }
    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnFalseIfNullWithValidateUsername(String input){
        assertFalse(userValidator.validateUsername(input));
    }
    @ParameterizedTest
    @ValueSource(strings= {"Adam.ka@gmail.pl", "ada@b.pl", "1@1.p"})
    public void shouldReturnTrueWithValidateEmail(String input){
        assertTrue(userValidator.validateEmail(input));
    }
    @ParameterizedTest
    @ValueSource(strings= {"S@s.1","@", "1@1.1","a@com.plplplplplpl"})
    public void shouldReturnFalseWithValidateEmail(String input){
        assertFalse(userValidator.validateEmail(input));
    }
    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnFalseIfNullWithValidateEmail(String input){
        assertFalse(userValidator.validateEmail(input));
    }

}