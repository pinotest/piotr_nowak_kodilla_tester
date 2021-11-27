package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class WeatherServiceTest {
    WeatherService weatherService = new WeatherService();
    Person person = Mockito.mock(Person.class);
    Subscription subscription = Mockito.mock(Subscription.class);

    @Test
    public void subscribedLocationPersonShouldReceiveNotification(){
        weatherService.addSubscriber(person, subscription);
      //  Mockito.verify(person, Mockito.never()).receive(notification);
    }
    @Test
    public void notSubscribedLocationPersonShouldNotReceiveNotification(){

    }
    @Test
    public void notificationShouldBeSentToAllSubscribedPersonInLocation(){

    }
    @Test
    public void unsubscribePersonFromOneLocation(){

    }
    @Test
    public void unsubscribePersonFromEveryLocations(){

    }
    @Test
    public void shouldBePossibleToDeleteLocation(){

    }
    @Test
    public void shouldBePossibleSendNotificationToEveryone(){

    }

}