package com.kodilla.parametrized_tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assertions.*;

class StringValidatorTest {

    private StringValidator validator = new StringValidator();

    @Test
    void shouldReturnFalseIfStringIsNotEmpty() {
        assertFalse(validator.isBlank("test"));
    }

    @Test
    void shouldReturnTrueIfStringIsEmpty() {
        assertTrue(validator.isBlank(""));
    }

    @Test
    void shouldReturnTrueIfStringHasOnlySpaces() {
        assertTrue(validator.isBlank("   "));
    }

    @Test
    void shouldReturnTrueIfStringIsNull() {
        assertTrue(validator.isBlank(null));
    }
    @ParameterizedTest
    @NullAndEmptySource
    void shouldReturnTrueIfStringIsEmpty(String text) {
        System.out.println("|" + text + "|");
        assertTrue(validator.isBlank(text));
    }
}