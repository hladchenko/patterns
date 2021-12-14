package com.hladchenko.patterns.structural.adapter;

import org.junit.Assert;
import org.junit.Test;

public class MovableAdapterTest {

    @Test
    public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
        Movable bugattiVeyron = new BugattiVeyron();
        MovableAdapterImpl bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);

        Assert.assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
    }
}
