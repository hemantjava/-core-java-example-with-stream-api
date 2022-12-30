package com.example.corejavaexamplewithstreamapi.lombok;

import com.example.corejavaexamplewithstreamapi.designpattern.creational.builder.Car;
import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    void testBuilder ( ) {
        Car car = Car.builder().id(12).build();
        System.out.println(car);
        car.setName("Audi");
        System.out.println(car);
    }

}