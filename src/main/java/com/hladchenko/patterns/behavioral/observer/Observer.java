/*
    Define a one-to-many dependency between objects so that when one object changes state,
     all its dependents are notified and updated automatically.
     https://java-design-patterns.com/patterns/observer/
 */

package com.hladchenko.patterns.behavioral.observer;

import com.hladchenko.patterns.behavioral.observer.poc.Hobbits;
import com.hladchenko.patterns.behavioral.observer.poc.Orcs;
import com.hladchenko.patterns.behavioral.observer.poc.Weather;

public class Observer {
    public static void main(String[] args) {
        var weather = new Weather();
        weather.addObserver(new Orcs());
        weather.addObserver(new Hobbits());
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
    }
}
