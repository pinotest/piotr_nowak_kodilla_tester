package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ClockTest {
    @Test
    public void itShouldGiveDifferentBeans(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring") ;
        Clock firstClock = context.getBean(Clock.class);
        Clock secondClock = context.getBean(Clock.class);
        Clock thirdClock = context.getBean(Clock.class);
        Assertions.assertNotEquals(firstClock, secondClock);
        Assertions.assertNotEquals(secondClock, thirdClock);
        Assertions.assertNotEquals(firstClock,thirdClock);

    }
}