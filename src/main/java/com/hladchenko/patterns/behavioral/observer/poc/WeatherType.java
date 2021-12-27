package com.hladchenko.patterns.behavioral.observer.poc;

public enum WeatherType {

    SUNNY("Sunny"),
    RAINY("Rainy"),
    WINDY("Windy"),
    COLD("Cold");

    private final String description;

    WeatherType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description.toLowerCase();
    }
}
