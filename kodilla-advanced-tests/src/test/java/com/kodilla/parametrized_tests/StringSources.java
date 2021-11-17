package com.kodilla.parametrized_tests;

import com.kodilla.parametrized_tests.homework.Person;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class StringSources {

    static Stream<Arguments> provideStringsForTestingLength() {
        return Stream.of(
                Arguments.of("test", 4),
                Arguments.of("OtHEr ", 5),
                Arguments.of("E V e n t", 5),
                Arguments.of("null ", 4),
                Arguments.of("A", 1)
        );
    }

    static Stream<Arguments> providePersonObjectsForTesting(){
        return Stream.of(
                Arguments.of(new Person(1.8, 40 ),"Very severely underweight"),
                Arguments.of(new Person(1.8, 50 ),"Severely underweight"),
                Arguments.of(new Person(1.8, 55 ),"Underweight"),
                Arguments.of(new Person(1.8, 80 ),"Normal (healthy weight)"),
                Arguments.of(new Person(1.8, 87 ),"Overweight"),
                Arguments.of(new Person(1.7, 95 ),"Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.6, 100 ),"Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.6, 110 ),"Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.6,  120),"Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(1.6, 140 ),"Obese Class V (Super Obese)"),
                Arguments.of(new Person(1.6, 180 ),"Obese Class VI (Hyper Obese)")
        );
    }
}