package com.kodilla.mockito.homework;

import java.util.*;

public class WeatherService {
    private HashMap<Person, Location> weatherSubscription = new HashMap<>();

    public void addPerson(Person person, Location location) {
        this.weatherSubscription.put(person, location);
    }
    public void delPersonFromOneLocation(Person person, Location location) {
        this.weatherSubscription.remove(person, location);
    }
    public void delSubscriberFromEveryLocation(Person person){
        this.weatherSubscription.remove(person);
    }

    public void sendNotificationForLocation(Location location) {
        this.weatherSubscription.forEach((Person,Location) -> Person.receiveNotificationByLocation(location));
    }
    public void sendNotification() {
        this.weatherSubscription.forEach((Person, Location) ->Person.receiveNotification());
    }

    public void delLocation(Location location){
        this.weatherSubscription.values().remove(location);
    }

    public int getMapSize(){
        return weatherSubscription.size();
    }
}
