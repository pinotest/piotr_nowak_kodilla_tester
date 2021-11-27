package com.kodilla.mockito.homework;

import com.kodilla.mockito.Client;
import com.kodilla.mockito.Notification;

import java.util.HashMap;

public class WeatherService {
    private HashMap<Person, Subscription> weatherSubscription = new HashMap<>();

    public void addSubscriber(Person person, Subscription subscription) {
        this.weatherSubscription.put(person, subscription);
    }

    public void sendNotification(Subscription subscription) {
      //  this.weatherSubscription.forEach(Person -> subscription.receive(notification));
    }
}
