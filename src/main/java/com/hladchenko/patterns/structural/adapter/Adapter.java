/*
    Convert the interface of a class into another interface the clients expect.
    Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
    https://java-design-patterns.com/patterns/adapter/
 */
package com.hladchenko.patterns.structural.adapter;

import com.hladchenko.patterns.structural.adapter.poc.BugattiVeyron;
import com.hladchenko.patterns.structural.adapter.poc.Movable;
import com.hladchenko.patterns.structural.adapter.poc.MovableAdapterImpl;

public class Adapter {
    public static void main(String[] args) {
        // Bugatti has speed in MPH
        Movable bugattiVeyron = new BugattiVeyron();

        // Adapter that returns speed in KMPH
        MovableAdapterImpl bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);

        System.out.println("Bugatti Veyron has a speed equal to " + (int)bugattiVeyronAdapter.getSpeed() + " KM/H");
    }
}
