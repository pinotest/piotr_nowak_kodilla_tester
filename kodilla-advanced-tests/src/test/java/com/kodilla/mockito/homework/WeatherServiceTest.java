package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WeatherServiceTest {
    WeatherService weatherService = new WeatherService();
    Person firstPerson = Mockito.mock(Person.class);
    Person secondPerson = Mockito.mock(Person.class);
    Location location = Mockito.mock(Location.class);
    Location secondLocation = Mockito.mock(Location.class);

    @Test
    public void subscribedLocationPersonShouldReceiveNotification(){
        //given
        weatherService.addPerson(firstPerson, location);
        //when
        weatherService.sendNotificationForLocation(location);
        //then
        Mockito.verify(firstPerson, Mockito.times(1)).receiveNotificationByLocation(location);

    }
    @Test
    public void notSubscribedLocationPersonShouldNotReceiveNotification(){
        //given
        weatherService.addPerson(firstPerson, location);
        weatherService.addPerson(secondPerson, secondLocation);
        //when
        weatherService.sendNotificationForLocation(location);
        //then
        Mockito.verify(firstPerson, Mockito.times(1)).receiveNotificationByLocation(location);
        Mockito.verify(secondPerson, Mockito.never()).receiveNotificationByLocation(secondLocation);
    }
    @Test
    public void notificationShouldBeSentToAllSubscribedPersonInLocation(){
        //given
        weatherService.addPerson(firstPerson, location);
        weatherService.addPerson(secondPerson, location);
        //when
        weatherService.sendNotificationForLocation(location);
        //then
        Mockito.verify(firstPerson, Mockito.times(1)).receiveNotificationByLocation(location);
        Mockito.verify(secondPerson, Mockito.times(1)).receiveNotificationByLocation(location);
    }


    @Test
    public void unsubscribePersonFromOneLocation(){
        //given
        weatherService.addPerson(firstPerson, location);
        weatherService.addPerson(firstPerson, secondLocation);
        // when
        weatherService.delPersonFromOneLocation(firstPerson, location);
        // then
        assertEquals (1, weatherService.getMapSize());

    }
    @Test
    public void unsubscribePersonFromEveryLocations(){
        //given
        weatherService.addPerson(firstPerson, location);
        weatherService.addPerson(firstPerson, secondLocation);
        // when
        weatherService.delSubscriberFromEveryLocation(firstPerson);
        // then
        assertEquals (0, weatherService.getMapSize());
    }
    @Test
    public void shouldBePossibleToDeleteLocation(){
        //given
        weatherService.addPerson(firstPerson, location);
        // when
        weatherService.delLocation(location);
        // then
        assertEquals(0, weatherService.getMapSize());
    }
    @Test
    public void shouldBePossibleSendNotificationToEveryone(){
        //given
        weatherService.addPerson(firstPerson, location);
        weatherService.addPerson(secondPerson, secondLocation);
        // when
        weatherService.sendNotification();
        // then
        Mockito.verify(firstPerson, Mockito.times(1)).receiveNotification();
        Mockito.verify(secondPerson, Mockito.times(1)).receiveNotification();

    }

}