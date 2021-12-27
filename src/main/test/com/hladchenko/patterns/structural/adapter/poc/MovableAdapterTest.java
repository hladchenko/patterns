package com.hladchenko.patterns.structural.adapter.poc;

import org.junit.Assert;
import org.junit.Test;

public class MovableAdapterTest {

    @Test
    public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
        // Arrange
        Movable bugattiVeyron = new BugattiVeyron();
        MovableAdapterImpl bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);

        // Act
        double result = bugattiVeyronAdapter.getSpeed();

        // Assert
        Assert.assertEquals(result, 431.30312, 0.00001);
    }
}
